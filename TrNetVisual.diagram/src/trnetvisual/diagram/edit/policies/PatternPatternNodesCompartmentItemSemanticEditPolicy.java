/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import trnetvisual.diagram.edit.commands.MandatoryNodeCreateCommand;
import trnetvisual.diagram.edit.commands.OptionalNodeCreateCommand;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class PatternPatternNodesCompartmentItemSemanticEditPolicy extends
		TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PatternPatternNodesCompartmentItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.Pattern_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TrnetvisualElementTypes.MandatoryNode_3003 == req.getElementType()) {
			return getGEFWrapper(new MandatoryNodeCreateCommand(req));
		}
		if (TrnetvisualElementTypes.OptionalNode_3005 == req.getElementType()) {
			return getGEFWrapper(new OptionalNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
