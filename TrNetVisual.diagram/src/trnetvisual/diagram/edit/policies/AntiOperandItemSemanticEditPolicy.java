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
public class AntiOperandItemSemanticEditPolicy extends
		TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AntiOperandItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.AntiOperand_4007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
