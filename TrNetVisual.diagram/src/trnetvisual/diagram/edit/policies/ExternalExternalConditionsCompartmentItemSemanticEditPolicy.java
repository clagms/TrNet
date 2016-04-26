/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import trnetvisual.diagram.edit.commands.ExternalConditionCallCreateCommand;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class ExternalExternalConditionsCompartmentItemSemanticEditPolicy extends
		TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExternalExternalConditionsCompartmentItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.External_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TrnetvisualElementTypes.ExternalConditionCall_3001 == req
				.getElementType()) {
			return getGEFWrapper(new ExternalConditionCallCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
