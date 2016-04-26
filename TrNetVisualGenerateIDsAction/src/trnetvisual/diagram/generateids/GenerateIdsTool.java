package trnetvisual.diagram.generateids;

import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
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

public class GenerateIdsTool extends AbstractTool{

	@Override
	protected String getCommandName() {
		return "Generate IDs";
	}

	@Override
	public void activate() {
		super.activate();
		
		try {
			
			// Fetch current editing model
			EditDomain domain = getDomain();
			if ( ! (domain instanceof DiagramEditDomain)){
				throw new RuntimeException("This tool can only be run from a TrNetVisualEditor");
			}
			DiagramEditDomain diagramEditDomain = (DiagramEditDomain) domain;
			IDiagramWorkbenchPart editorPartInterface = diagramEditDomain.getDiagramEditorPart();
			Diagram diagramModelElement = editorPartInterface.getDiagram();
			EObject modelElement = diagramModelElement.getElement();
			Resource modelResource = modelElement.eResource();
			URI resourceUri = modelResource.getURI();
			URI realPlatformURI = CommonPlugin.asLocalURI(resourceUri);
			URI realURI = CommonPlugin.resolve(realPlatformURI);
			String modelSchemeSpecificPart = realURI.path();
			
			// Fetch Metamodel From Bundle
			Bundle modelPlugin = Platform.getBundle("TrNetVisual");
			IPath mmPath = new Path("model/TrNetVisual.ecore");
			URL mmPathInPlugin = FileLocator.find(modelPlugin, mmPath, Collections.EMPTY_MAP);
			URL realMmPath = FileLocator.toFileURL(mmPathInPlugin);
			String mmSchemeSpecificPart = realMmPath.toURI().getSchemeSpecificPart();
			
			// Execute EOL on that model;
			new TrNetVisualGenerateIDsStandAloneImpl(modelSchemeSpecificPart, mmSchemeSpecificPart).execute();
			
			// Refresh resource
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = workspace.getRoot();
			IFile modelFile = root.getFileForLocation(new Path(realURI.toFileString()));
			modelFile.refreshLocal(IResource.DEPTH_ZERO, null);
			
			
			// Since this is a button, we want to immediatly change tool.
			getDomain().loadDefaultTool();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
