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
public class MandatoryNodeMandatoryNodeAttributesCompartmentItemSemanticEditPolicy
		extends TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MandatoryNodeMandatoryNodeAttributesCompartmentItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.MandatoryNode_3003);
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
