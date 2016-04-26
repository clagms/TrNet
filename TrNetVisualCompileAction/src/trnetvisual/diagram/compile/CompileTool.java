package trnetvisual.diagram.compile;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.tools.AbstractTool;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.osgi.framework.Bundle;

public class CompileTool extends AbstractTool {

	@Override
	protected String getCommandName() {
		return "Compile";
	}

	@Override
	public void activate() {
		super.activate();

		try {

			// Fetch current editing model
			EditDomain domain = getDomain();
			if (!(domain instanceof DiagramEditDomain)) {
				throw new RuntimeException(
						"This tool can only be run from a TrNetVisualEditor");
			}
			DiagramEditDomain diagramEditDomain = (DiagramEditDomain) domain;
			IDiagramWorkbenchPart editorPartInterface = diagramEditDomain
					.getDiagramEditorPart();
			Diagram diagramModelElement = editorPartInterface.getDiagram();
			EObject modelElement = diagramModelElement.getElement();
			Resource modelResource = modelElement.eResource();
			URI resourceUri = modelResource.getURI();
			URI realPlatformURI = CommonPlugin.asLocalURI(resourceUri);
			URI realURI = CommonPlugin.resolve(realPlatformURI);
			String visualModelAbsolutePath = realURI.path();

			// Fetch Metamodel From Bundle
			URL realMmPath = getElementInPlugin("TrNetVisual",
					"model/TrNetVisual.ecore");
			String visualMetamodelAbsolutePath = realMmPath.toURI()
					.getSchemeSpecificPart();

			// Compute core model path in the same dir as visual model
			
			/*String[] coreModelPathSegments = new String[realURI.segmentCount()];
			System.arraycopy(realURI.segments(), 0, coreModelPathSegments, 0,
					realURI.segmentCount());*/
			// Replace last segment with the core model's filename and
			// extension.
			/*String coreModelFileName = computeCoreModelFromVisualModeName(coreModelPathSegments[realURI
					.segmentCount() - 1]);
			// Replace last segment with the core model name.
			coreModelPathSegments[realURI.segmentCount() - 1] = coreModelFileName;
			*/
			/*URI coreModelURI = URI.createHierarchicalURI(realURI.scheme(),
					realURI.authority(), realURI.device(),
					coreModelPathSegments, realURI.query(), realURI.fragment());*/
			//String coreModelAbsolutePath = coreModelURI.path();

			// Fetch core Metamodel from the respective plugin
			/*URL realTrnetMMPath = getElementInPlugin("TrNet",
					"model/TrNet.ecore");
			String coreMetamodelAbsolutePath = realTrnetMMPath.toURI()
					.getSchemeSpecificPart();
					*/

			// Execute EOL on that model;
			/*new TrNetVisualCompileStandAloneImpl(
					visualModelAbsolutePath, visualMetamodelAbsolutePath,
					coreModelAbsolutePath, coreMetamodelAbsolutePath).execute();
					*/

			// Refresh whole project
			refreshProject(realURI);
			
			
			String outputRootPath = getOutputRootPath(realURI).getSchemeSpecificPart();
			
			String templateRootPath = getTemplateRoot().getSchemeSpecificPart();
			// Generate Code
			new TrNetVisualGenerateStandAloneImpl(visualModelAbsolutePath,
					visualMetamodelAbsolutePath, outputRootPath, templateRootPath).execute();

			// Refresh whole project
			refreshProject(realURI);
			
			
	
			// Since this is a button, we want to immediately change tool.
			getDomain().loadDefaultTool();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private java.net.URI getTemplateRoot() {
		URL templatePathURL;
		java.net.URI templatePathURI = null;
		try {
			templatePathURL = getElementInPlugin("TrNetVisualCompile", "src/trnetvisual/diagram/compile");
			templatePathURI = templatePathURL.toURI();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return templatePathURI;
	}

	private java.net.URI getOutputRootPath(URI someFIleWithinTheProject) {
		java.net.URI result = getCurrentProject(someFIleWithinTheProject).getLocationURI();
		return result;
	}

	private void refreshProject(URI someFIleWithinTheProject)
			throws CoreException {
		IProject project = getCurrentProject(someFIleWithinTheProject);
		project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}
	
	private IProject getCurrentProject(URI someFIleWithinTheProject) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IFile modelFile = root.getFileForLocation(new Path(
				someFIleWithinTheProject.toFileString()));
		IProject project = modelFile.getProject();
		return project;
	}

	private URL getElementInPlugin(String plugin, String pathInPlugin)
			throws IOException {
		Bundle trnetPlugin = Platform.getBundle(plugin);
		IPath trnetMMPath = new Path(pathInPlugin);
		URL mmPathInTrnetPlugin = FileLocator.find(trnetPlugin, trnetMMPath,
				Collections.EMPTY_MAP);
		URL realTrnetMMPath = FileLocator.toFileURL(mmPathInTrnetPlugin);
		return realTrnetMMPath;
	}
	/*
	private String computeCoreModelFromVisualModeName(String visualModelName) {
		int extensionIndex = visualModelName.lastIndexOf(".");
		String coreModelName = visualModelName.substring(0, extensionIndex);
		return coreModelName + ".trnet";
	}
	*/

}
