/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import trnetvisual.diagram.edit.commands.AttributePatternCreateCommand;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class OptionalNodeOptionalNodeAttributesCompartmentItemSemanticEditPolicy
		extends TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OptionalNodeOptionalNodeAttributesCompartmentItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.OptionalNode_3005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TrnetvisualElementTypes.AttributePattern_3004 == req
				.getElementType()) {
			return getGEFWrapper(new AttributePatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
