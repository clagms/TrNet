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

import trnetvisual.ExternalCalculationCall;
import trnetvisual.ExternalCalculationCallParameter;
import trnetvisual.Parameter;
import trnetvisual.diagram.edit.policies.TrnetvisualBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExternalCalculationCallParameterReorientCommand extends
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
	public ExternalCalculationCallParameterReorientCommand(
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
		if (false == getElementToEdit() instanceof ExternalCalculationCallParameter) {
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
		if (!(oldEnd instanceof ExternalCalculationCall && newEnd instanceof ExternalCalculationCall)) {
			return false;
		}
		Parameter target = getLink().getParameter();
		if (!(getLink().eContainer() instanceof ExternalCalculationCall)) {
			return false;
		}
		ExternalCalculationCall container = (ExternalCalculationCall) getLink()
				.eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExternalCalculationCallParameter_4015(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Parameter && newEnd instanceof Parameter)) {
			return false;
		}
		ExternalCalculationCall source = getLink().getOwner();
		if (!(getLink().eContainer() instanceof ExternalCalculationCall)) {
			return false;
		}
		ExternalCalculationCall container = (ExternalCalculationCall) getLink()
				.eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistExternalCalculationCallParameter_4015(container,
						getLink(), source, getNewTarget());
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
	protected ExternalCalculationCallParameter getLink() {
		return (ExternalCalculationCallParameter) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ExternalCalculationCall getOldSource() {
		return (ExternalCalculationCall) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ExternalCalculationCall getNewSource() {
		return (ExternalCalculationCall) newEnd;
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
