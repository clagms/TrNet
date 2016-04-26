/*
 * 
 */
package trnetvisual.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import trnetvisual.TrNetModel;
import trnetvisual.TrnetvisualPackage;
import trnetvisual.diagram.edit.parts.AntiOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyResultEditPart;
import trnetvisual.diagram.edit.parts.AttributePatternEditPart;
import trnetvisual.diagram.edit.parts.AttributePatternNameEditPart;
import trnetvisual.diagram.edit.parts.CombinatorCombinatorActionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.CombinatorCombinatorConditionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.CombinatorEditPart;
import trnetvisual.diagram.edit.parts.EdgePatternEditPart;
import trnetvisual.diagram.edit.parts.EdgePatternNameEditPart;
import trnetvisual.diagram.edit.parts.EventuallyEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallResultEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalEditPart;
import trnetvisual.diagram.edit.parts.ExternalExternalActionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.ExternalExternalConditionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.KeepEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeMandatoryNodeAttributesCompartmentEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeNameEditPart;
import trnetvisual.diagram.edit.parts.NextDerivedEditPart;
import trnetvisual.diagram.edit.parts.NextEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeNameEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeOptionalNodeAttributesCompartmentEditPart;
import trnetvisual.diagram.edit.parts.OptionalOperandEditPart;
import trnetvisual.diagram.edit.parts.PatternEditPart;
import trnetvisual.diagram.edit.parts.PatternPatternNodesCompartmentEditPart;
import trnetvisual.diagram.edit.parts.SameEditPart;
import trnetvisual.diagram.edit.parts.SomeOperandEditPart;
import trnetvisual.diagram.edit.parts.SomeResultEditPart;
import trnetvisual.diagram.edit.parts.TrNetModelEditPart;
import trnetvisual.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TrnetvisualVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "TrNetVisual.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TrNetModelEditPart.MODEL_ID.equals(view.getType())) {
				return TrNetModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				TrnetvisualDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TrnetvisualPackage.eINSTANCE.getTrNetModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((TrNetModel) domainElement)) {
			return TrNetModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
				.getModelID(containerView);
		if (!TrNetModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"trnetvisual".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (TrNetModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TrNetModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TrNetModelEditPart.VISUAL_ID:
			if (TrnetvisualPackage.eINSTANCE
					.getExternalAttributeCalculationCall().isSuperTypeOf(
							domainElement.eClass())) {
				return ExternalAttributeCalculationCallEditPart.VISUAL_ID;
			}
			if (TrnetvisualPackage.eINSTANCE.getExternalCalculationCall()
					.isSuperTypeOf(domainElement.eClass())) {
				return ExternalCalculationCallEditPart.VISUAL_ID;
			}
			if (TrnetvisualPackage.eINSTANCE.getCombinator().isSuperTypeOf(
					domainElement.eClass())) {
				return CombinatorEditPart.VISUAL_ID;
			}
			if (TrnetvisualPackage.eINSTANCE.getExternal().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalEditPart.VISUAL_ID;
			}
			if (TrnetvisualPackage.eINSTANCE.getPattern().isSuperTypeOf(
					domainElement.eClass())) {
				return PatternEditPart.VISUAL_ID;
			}
			break;
		case CombinatorCombinatorConditionsCompartmentEditPart.VISUAL_ID:
			if (TrnetvisualPackage.eINSTANCE.getExternalConditionCall()
					.isSuperTypeOf(domainElement.eClass())) {
				return ExternalConditionCallEditPart.VISUAL_ID;
			}
			break;
		case CombinatorCombinatorActionsCompartmentEditPart.VISUAL_ID:
			if (TrnetvisualPackage.eINSTANCE.getExternalActionCall()
					.isSuperTypeOf(domainElement.eClass())) {
				return ExternalActionCallEditPart.VISUAL_ID;
			}
			break;
		case ExternalExternalConditionsCompartmentEditPart.VISUAL_ID:
			if (TrnetvisualPackage.eINSTANCE.getExternalConditionCall()
					.isSuperTypeOf(domainElement.eClass())) {
				return ExternalConditionCallEditPart.VISUAL_ID;
			}
			break;
		case ExternalExternalActionsCompartmentEditPart.VISUAL_ID:
			if (TrnetvisualPackage.eINSTANCE.getExternalActionCall()
					.isSuperTypeOf(domainElement.eClass())) {
				return ExternalActionCallEditPart.VISUAL_ID;
			}
			break;
		case PatternPatternNodesCompartmentEditPart.VISUAL_ID:
			if (TrnetvisualPackage.eINSTANCE.getMandatoryNode().isSuperTypeOf(
					domainElement.eClass())) {
				return MandatoryNodeEditPart.VISUAL_ID;
			}
			if (TrnetvisualPackage.eINSTANCE.getOptionalNode().isSuperTypeOf(
					domainElement.eClass())) {
				return OptionalNodeEditPart.VISUAL_ID;
			}
			break;
		case MandatoryNodeMandatoryNodeAttributesCompartmentEditPart.VISUAL_ID:
			if (TrnetvisualPackage.eINSTANCE.getAttributePattern()
					.isSuperTypeOf(domainElement.eClass())) {
				return AttributePatternEditPart.VISUAL_ID;
			}
			break;
		case OptionalNodeOptionalNodeAttributesCompartmentEditPart.VISUAL_ID:
			if (TrnetvisualPackage.eINSTANCE.getAttributePattern()
					.isSuperTypeOf(domainElement.eClass())) {
				return AttributePatternEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
				.getModelID(containerView);
		if (!TrNetModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"trnetvisual".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (TrNetModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TrNetModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TrNetModelEditPart.VISUAL_ID:
			if (ExternalAttributeCalculationCallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalCalculationCallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CombinatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalAttributeCalculationCallEditPart.VISUAL_ID:
			if (ExternalAttributeCalculationCallIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalCalculationCallEditPart.VISUAL_ID:
			if (ExternalCalculationCallIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CombinatorEditPart.VISUAL_ID:
			if (CombinatorCombinatorConditionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CombinatorCombinatorActionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalEditPart.VISUAL_ID:
			if (ExternalExternalConditionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalExternalActionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PatternEditPart.VISUAL_ID:
			if (PatternPatternNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalConditionCallEditPart.VISUAL_ID:
			if (ExternalConditionCallIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalActionCallEditPart.VISUAL_ID:
			if (ExternalActionCallIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MandatoryNodeEditPart.VISUAL_ID:
			if (MandatoryNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MandatoryNodeMandatoryNodeAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AttributePatternEditPart.VISUAL_ID:
			if (AttributePatternNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OptionalNodeEditPart.VISUAL_ID:
			if (OptionalNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OptionalNodeOptionalNodeAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CombinatorCombinatorConditionsCompartmentEditPart.VISUAL_ID:
			if (ExternalConditionCallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CombinatorCombinatorActionsCompartmentEditPart.VISUAL_ID:
			if (ExternalActionCallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalExternalConditionsCompartmentEditPart.VISUAL_ID:
			if (ExternalConditionCallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalExternalActionsCompartmentEditPart.VISUAL_ID:
			if (ExternalActionCallEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PatternPatternNodesCompartmentEditPart.VISUAL_ID:
			if (MandatoryNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OptionalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MandatoryNodeMandatoryNodeAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributePatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OptionalNodeOptionalNodeAttributesCompartmentEditPart.VISUAL_ID:
			if (AttributePatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID:
			if (ExternalAttributeCalculationCallParameterIndexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalConditionCallParameterEditPart.VISUAL_ID:
			if (ExternalConditionCallParameterIndexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalActionCallParameterEditPart.VISUAL_ID:
			if (ExternalActionCallParameterIndexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalCalculationCallParameterEditPart.VISUAL_ID:
			if (ExternalCalculationCallParameterIndexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EdgePatternEditPart.VISUAL_ID:
			if (EdgePatternNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalAttributeCalculationCallResultEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TrnetvisualPackage.eINSTANCE.getSame().isSuperTypeOf(
				domainElement.eClass())) {
			return SameEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getKeep().isSuperTypeOf(
				domainElement.eClass())) {
			return KeepEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getAnyResult().isSuperTypeOf(
				domainElement.eClass())) {
			return AnyResultEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getSomeResult().isSuperTypeOf(
				domainElement.eClass())) {
			return SomeResultEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getAnyOperand().isSuperTypeOf(
				domainElement.eClass())) {
			return AnyOperandEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getSomeOperand().isSuperTypeOf(
				domainElement.eClass())) {
			return SomeOperandEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getAntiOperand().isSuperTypeOf(
				domainElement.eClass())) {
			return AntiOperandEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getOptionalOperand().isSuperTypeOf(
				domainElement.eClass())) {
			return OptionalOperandEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getNext().isSuperTypeOf(
				domainElement.eClass())) {
			return NextEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getEventually().isSuperTypeOf(
				domainElement.eClass())) {
			return EventuallyEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getNextDerived().isSuperTypeOf(
				domainElement.eClass())) {
			return NextDerivedEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE
				.getExternalAttributeCalculationCallParameter().isSuperTypeOf(
						domainElement.eClass())) {
			return ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getExternalConditionCallParameter()
				.isSuperTypeOf(domainElement.eClass())) {
			return ExternalConditionCallParameterEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getExternalActionCallParameter()
				.isSuperTypeOf(domainElement.eClass())) {
			return ExternalActionCallParameterEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getExternalCalculationCallParameter()
				.isSuperTypeOf(domainElement.eClass())) {
			return ExternalCalculationCallParameterEditPart.VISUAL_ID;
		}
		if (TrnetvisualPackage.eINSTANCE.getEdgePattern().isSuperTypeOf(
				domainElement.eClass())) {
			return EdgePatternEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(TrNetModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case CombinatorCombinatorConditionsCompartmentEditPart.VISUAL_ID:
		case CombinatorCombinatorActionsCompartmentEditPart.VISUAL_ID:
		case ExternalExternalConditionsCompartmentEditPart.VISUAL_ID:
		case ExternalExternalActionsCompartmentEditPart.VISUAL_ID:
		case PatternPatternNodesCompartmentEditPart.VISUAL_ID:
		case MandatoryNodeMandatoryNodeAttributesCompartmentEditPart.VISUAL_ID:
		case OptionalNodeOptionalNodeAttributesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case TrNetModelEditPart.VISUAL_ID:
			return false;
		case ExternalAttributeCalculationCallEditPart.VISUAL_ID:
		case ExternalCalculationCallEditPart.VISUAL_ID:
		case ExternalConditionCallEditPart.VISUAL_ID:
		case ExternalActionCallEditPart.VISUAL_ID:
		case AttributePatternEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return trnetvisual.diagram.part.TrnetvisualVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
