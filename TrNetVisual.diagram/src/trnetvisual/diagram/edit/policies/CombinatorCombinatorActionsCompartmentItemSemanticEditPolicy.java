/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import trnetvisual.diagram.edit.commands.ExternalActionCallCreateCommand;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class CombinatorCombinatorActionsCompartmentItemSemanticEditPolicy
		extends TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CombinatorCombinatorActionsCompartmentItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.Combinator_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TrnetvisualElementTypes.ExternalActionCall_3002 == req
				.getElementType()) {
			return getGEFWrapper(new ExternalActionCallCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
