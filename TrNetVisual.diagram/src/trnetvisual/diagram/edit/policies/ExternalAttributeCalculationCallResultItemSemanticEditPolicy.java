/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class ExternalAttributeCalculationCallResultItemSemanticEditPolicy
		extends TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExternalAttributeCalculationCallResultItemSemanticEditPolicy() {
		super(
				TrnetvisualElementTypes.ExternalAttributeCalculationCallResult_4017);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
