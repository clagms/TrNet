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

import trnetvisual.AnyResult;
import trnetvisual.Operator;
import trnetvisual.Pattern;
import trnetvisual.TrNetModel;
import trnetvisual.diagram.edit.policies.TrnetvisualBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AnyResultReorientCommand extends EditElementCommand {

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
	public AnyResultReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof AnyResult) {
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
		if (!(oldEnd instanceof Operator && newEnd instanceof Operator)) {
			return false;
		}
		Pattern target = getLink().getPattern();
		if (!(getLink().eContainer() instanceof TrNetModel)) {
			return false;
		}
		TrNetModel container = (TrNetModel) getLink().eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAnyResult_4003(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Pattern && newEnd instanceof Pattern)) {
			return false;
		}
		Operator source = getLink().getOperator();
		if (!(getLink().eContainer() instanceof TrNetModel)) {
			return false;
		}
		TrNetModel container = (TrNetModel) getLink().eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAnyResult_4003(container, getLink(), source,
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
		getLink().setOperator(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setPattern(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected AnyResult getLink() {
		return (AnyResult) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Operator getOldSource() {
		return (Operator) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Operator getNewSource() {
		return (Operator) newEnd;
	}

	/**
	 * @generated
	 */
	protected Pattern getOldTarget() {
		return (Pattern) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Pattern getNewTarget() {
		return (Pattern) newEnd;
	}
}
