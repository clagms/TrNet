/*
 * 
 */
package trnetvisual.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;

/**
 * @generated
 */
public class TrnetvisualEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TrnetvisualVisualIDRegistry.getVisualID(view)) {

			case TrNetModelEditPart.VISUAL_ID:
				return new TrNetModelEditPart(view);

			case ExternalAttributeCalculationCallEditPart.VISUAL_ID:
				return new ExternalAttributeCalculationCallEditPart(view);

			case ExternalAttributeCalculationCallIdEditPart.VISUAL_ID:
				return new ExternalAttributeCalculationCallIdEditPart(view);

			case ExternalCalculationCallEditPart.VISUAL_ID:
				return new ExternalCalculationCallEditPart(view);

			case ExternalCalculationCallIdEditPart.VISUAL_ID:
				return new ExternalCalculationCallIdEditPart(view);

			case CombinatorEditPart.VISUAL_ID:
				return new CombinatorEditPart(view);

			case ExternalEditPart.VISUAL_ID:
				return new ExternalEditPart(view);

			case PatternEditPart.VISUAL_ID:
				return new PatternEditPart(view);

			case ExternalConditionCallEditPart.VISUAL_ID:
				return new ExternalConditionCallEditPart(view);

			case ExternalConditionCallIdEditPart.VISUAL_ID:
				return new ExternalConditionCallIdEditPart(view);

			case ExternalActionCallEditPart.VISUAL_ID:
				return new ExternalActionCallEditPart(view);

			case ExternalActionCallIdEditPart.VISUAL_ID:
				return new ExternalActionCallIdEditPart(view);

			case MandatoryNodeEditPart.VISUAL_ID:
				return new MandatoryNodeEditPart(view);

			case MandatoryNodeNameEditPart.VISUAL_ID:
				return new MandatoryNodeNameEditPart(view);

			case AttributePatternEditPart.VISUAL_ID:
				return new AttributePatternEditPart(view);

			case AttributePatternNameEditPart.VISUAL_ID:
				return new AttributePatternNameEditPart(view);

			case OptionalNodeEditPart.VISUAL_ID:
				return new OptionalNodeEditPart(view);

			case OptionalNodeNameEditPart.VISUAL_ID:
				return new OptionalNodeNameEditPart(view);

			case CombinatorCombinatorConditionsCompartmentEditPart.VISUAL_ID:
				return new CombinatorCombinatorConditionsCompartmentEditPart(
						view);

			case CombinatorCombinatorActionsCompartmentEditPart.VISUAL_ID:
				return new CombinatorCombinatorActionsCompartmentEditPart(view);

			case ExternalExternalConditionsCompartmentEditPart.VISUAL_ID:
				return new ExternalExternalConditionsCompartmentEditPart(view);

			case ExternalExternalActionsCompartmentEditPart.VISUAL_ID:
				return new ExternalExternalActionsCompartmentEditPart(view);

			case PatternPatternNodesCompartmentEditPart.VISUAL_ID:
				return new PatternPatternNodesCompartmentEditPart(view);

			case MandatoryNodeMandatoryNodeAttributesCompartmentEditPart.VISUAL_ID:
				return new MandatoryNodeMandatoryNodeAttributesCompartmentEditPart(
						view);

			case OptionalNodeOptionalNodeAttributesCompartmentEditPart.VISUAL_ID:
				return new OptionalNodeOptionalNodeAttributesCompartmentEditPart(
						view);

			case SameEditPart.VISUAL_ID:
				return new SameEditPart(view);

			case KeepEditPart.VISUAL_ID:
				return new KeepEditPart(view);

			case AnyResultEditPart.VISUAL_ID:
				return new AnyResultEditPart(view);

			case SomeResultEditPart.VISUAL_ID:
				return new SomeResultEditPart(view);

			case AnyOperandEditPart.VISUAL_ID:
				return new AnyOperandEditPart(view);

			case SomeOperandEditPart.VISUAL_ID:
				return new SomeOperandEditPart(view);

			case AntiOperandEditPart.VISUAL_ID:
				return new AntiOperandEditPart(view);

			case OptionalOperandEditPart.VISUAL_ID:
				return new OptionalOperandEditPart(view);

			case NextEditPart.VISUAL_ID:
				return new NextEditPart(view);

			case EventuallyEditPart.VISUAL_ID:
				return new EventuallyEditPart(view);

			case NextDerivedEditPart.VISUAL_ID:
				return new NextDerivedEditPart(view);

			case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID:
				return new ExternalAttributeCalculationCallParameterEditPart(
						view);

			case ExternalAttributeCalculationCallParameterIndexEditPart.VISUAL_ID:
				return new ExternalAttributeCalculationCallParameterIndexEditPart(
						view);

			case ExternalConditionCallParameterEditPart.VISUAL_ID:
				return new ExternalConditionCallParameterEditPart(view);

			case ExternalConditionCallParameterIndexEditPart.VISUAL_ID:
				return new ExternalConditionCallParameterIndexEditPart(view);

			case ExternalActionCallParameterEditPart.VISUAL_ID:
				return new ExternalActionCallParameterEditPart(view);

			case ExternalActionCallParameterIndexEditPart.VISUAL_ID:
				return new ExternalActionCallParameterIndexEditPart(view);

			case ExternalCalculationCallParameterEditPart.VISUAL_ID:
				return new ExternalCalculationCallParameterEditPart(view);

			case ExternalCalculationCallParameterIndexEditPart.VISUAL_ID:
				return new ExternalCalculationCallParameterIndexEditPart(view);

			case EdgePatternEditPart.VISUAL_ID:
				return new EdgePatternEditPart(view);

			case EdgePatternNameEditPart.VISUAL_ID:
				return new EdgePatternNameEditPart(view);

			case ExternalAttributeCalculationCallResultEditPart.VISUAL_ID:
				return new ExternalAttributeCalculationCallResultEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
