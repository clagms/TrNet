/*
 * 
 */
package trnetvisual.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import trnetvisual.ExternalAttributeCalculationCall;
import trnetvisual.ExternalAttributeCalculationCallParameter;
import trnetvisual.Parameter;
import trnetvisual.diagram.edit.policies.TrnetvisualBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExternalAttributeCalculationCallParameterReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ExternalAttributeCalculationCallParameterReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ExternalAttributeCalculationCallParameter) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ExternalAttributeCalculationCall && newEnd instanceof ExternalAttributeCalculationCall)) {
			return false;
		}
		Parameter target = getLink().getParameter();
		if (!(getLink().eContainer() instanceof ExternalAttributeCalculationCall)) {
			return false;
		}
		ExternalAttributeCalculationCall container = (ExternalAttributeCalculationCall) getLink()
				.eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExternalAttributeCalculationCallParameter_4012(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Parameter && newEnd instanceof Parameter)) {
			return false;
		}
		ExternalAttributeCalculationCall source = getLink().getOwner();
		if (!(getLink().eContainer() instanceof ExternalAttributeCalculationCall)) {
			return false;
		}
		ExternalAttributeCalculationCall container = (ExternalAttributeCalculationCall) getLink()
				.eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExternalAttributeCalculationCallParameter_4012(
						container, getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setOwner(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setParameter(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ExternalAttributeCalculationCallParameter getLink() {
		return (ExternalAttributeCalculationCallParameter) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ExternalAttributeCalculationCall getOldSource() {
		return (ExternalAttributeCalculationCall) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ExternalAttributeCalculationCall getNewSource() {
		return (ExternalAttributeCalculationCall) newEnd;
	}

	/**
	 * @generated
	 */
	protected Parameter getOldTarget() {
		return (Parameter) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Parameter getNewTarget() {
		return (Parameter) newEnd;
	}
}
