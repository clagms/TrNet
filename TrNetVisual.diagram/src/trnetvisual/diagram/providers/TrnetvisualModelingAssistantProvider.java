/*
 * 
 */
package trnetvisual.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import trnetvisual.diagram.edit.parts.AttributePatternEditPart;
import trnetvisual.diagram.edit.parts.CombinatorEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeEditPart;
import trnetvisual.diagram.edit.parts.PatternEditPart;
import trnetvisual.diagram.edit.parts.PatternPatternNodesCompartmentEditPart;
import trnetvisual.diagram.edit.parts.TrNetModelEditPart;
import trnetvisual.diagram.part.Messages;
import trnetvisual.diagram.part.TrnetvisualDiagramEditorPlugin;

/**
 * @generated
 */
public class TrnetvisualModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof TrNetModelEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(TrnetvisualElementTypes.ExternalAttributeCalculationCall_2001);
			types.add(TrnetvisualElementTypes.ExternalCalculationCall_2002);
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
			types.add(TrnetvisualElementTypes.Pattern_2005);
			return types;
		}
		if (editPart instanceof CombinatorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(TrnetvisualElementTypes.ExternalConditionCall_3001);
			types.add(TrnetvisualElementTypes.ExternalActionCall_3002);
			return types;
		}
		if (editPart instanceof ExternalEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(TrnetvisualElementTypes.ExternalConditionCall_3001);
			types.add(TrnetvisualElementTypes.ExternalActionCall_3002);
			return types;
		}
		if (editPart instanceof MandatoryNodeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(TrnetvisualElementTypes.AttributePattern_3004);
			return types;
		}
		if (editPart instanceof OptionalNodeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(TrnetvisualElementTypes.AttributePattern_3004);
			return types;
		}
		if (editPart instanceof PatternPatternNodesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(TrnetvisualElementTypes.MandatoryNode_3003);
			types.add(TrnetvisualElementTypes.OptionalNode_3005);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ExternalAttributeCalculationCallEditPart) {
			return ((ExternalAttributeCalculationCallEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExternalCalculationCallEditPart) {
			return ((ExternalCalculationCallEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CombinatorEditPart) {
			return ((CombinatorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExternalEditPart) {
			return ((ExternalEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PatternEditPart) {
			return ((PatternEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExternalConditionCallEditPart) {
			return ((ExternalConditionCallEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExternalActionCallEditPart) {
			return ((ExternalActionCallEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MandatoryNodeEditPart) {
			return ((MandatoryNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OptionalNodeEditPart) {
			return ((OptionalNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ExternalCalculationCallEditPart) {
			return ((ExternalCalculationCallEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CombinatorEditPart) {
			return ((CombinatorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExternalEditPart) {
			return ((ExternalEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PatternEditPart) {
			return ((PatternEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MandatoryNodeEditPart) {
			return ((MandatoryNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AttributePatternEditPart) {
			return ((AttributePatternEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OptionalNodeEditPart) {
			return ((OptionalNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ExternalAttributeCalculationCallEditPart) {
			return ((ExternalAttributeCalculationCallEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExternalCalculationCallEditPart) {
			return ((ExternalCalculationCallEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CombinatorEditPart) {
			return ((CombinatorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExternalEditPart) {
			return ((ExternalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PatternEditPart) {
			return ((PatternEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExternalConditionCallEditPart) {
			return ((ExternalConditionCallEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExternalActionCallEditPart) {
			return ((ExternalActionCallEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MandatoryNodeEditPart) {
			return ((MandatoryNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OptionalNodeEditPart) {
			return ((OptionalNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ExternalCalculationCallEditPart) {
			return ((ExternalCalculationCallEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CombinatorEditPart) {
			return ((CombinatorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExternalEditPart) {
			return ((ExternalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PatternEditPart) {
			return ((PatternEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MandatoryNodeEditPart) {
			return ((MandatoryNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AttributePatternEditPart) {
			return ((AttributePatternEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OptionalNodeEditPart) {
			return ((OptionalNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ExternalAttributeCalculationCallEditPart) {
			return ((ExternalAttributeCalculationCallEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExternalCalculationCallEditPart) {
			return ((ExternalCalculationCallEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CombinatorEditPart) {
			return ((CombinatorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExternalEditPart) {
			return ((ExternalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PatternEditPart) {
			return ((PatternEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExternalConditionCallEditPart) {
			return ((ExternalConditionCallEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExternalActionCallEditPart) {
			return ((ExternalActionCallEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MandatoryNodeEditPart) {
			return ((MandatoryNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OptionalNodeEditPart) {
			return ((OptionalNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				TrnetvisualDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.TrnetvisualModelingAssistantProviderMessage);
		dialog.setTitle(Messages.TrnetvisualModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
