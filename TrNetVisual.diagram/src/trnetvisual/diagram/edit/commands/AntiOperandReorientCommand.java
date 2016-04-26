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

import trnetvisual.AntiOperand;
import trnetvisual.Operator;
import trnetvisual.Pattern;
import trnetvisual.TrNetModel;
import trnetvisual.diagram.edit.policies.TrnetvisualBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AntiOperandReorientCommand extends EditElementCommand {

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
	public AntiOperandReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof AntiOperand) {
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
		if (!(oldEnd instanceof Pattern && newEnd instanceof Pattern)) {
			return false;
		}
		Operator target = getLink().getOperator();
		if (!(getLink().eContainer() instanceof TrNetModel)) {
			return false;
		}
		TrNetModel container = (TrNetModel) getLink().eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAntiOperand_4007(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Operator && newEnd instanceof Operator)) {
			return false;
		}
		Pattern source = getLink().getPattern();
		if (!(getLink().eContainer() instanceof TrNetModel)) {
			return false;
		}
		TrNetModel container = (TrNetModel) getLink().eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAntiOperand_4007(container, getLink(), source,
						getNewTarget());
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
		getLink().setPattern(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setOperator(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected AntiOperand getLink() {
		return (AntiOperand) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Pattern getOldSource() {
		return (Pattern) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Pattern getNewSource() {
		return (Pattern) newEnd;
	}

	/**
	 * @generated
	 */
	protected Operator getOldTarget() {
		return (Operator) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Operator getNewTarget() {
		return (Operator) newEnd;
	}
}
