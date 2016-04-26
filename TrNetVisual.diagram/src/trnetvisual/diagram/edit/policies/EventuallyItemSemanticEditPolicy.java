/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class EventuallyItemSemanticEditPolicy extends
		TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventuallyItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.Eventually_4010);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
