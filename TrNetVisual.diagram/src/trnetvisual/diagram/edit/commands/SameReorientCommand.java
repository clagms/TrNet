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

import trnetvisual.NodePattern;
import trnetvisual.Same;
import trnetvisual.TrNetModel;
import trnetvisual.diagram.edit.policies.TrnetvisualBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SameReorientCommand extends EditElementCommand {

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
	public SameReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Same) {
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
		if (!(oldEnd instanceof NodePattern && newEnd instanceof NodePattern)) {
			return false;
		}
		NodePattern target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof TrNetModel)) {
			return false;
		}
		TrNetModel container = (TrNetModel) getLink().eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistSame_4001(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof NodePattern && newEnd instanceof NodePattern)) {
			return false;
		}
		NodePattern source = getLink().getSource();
		if (!(getLink().eContainer() instanceof TrNetModel)) {
			return false;
		}
		TrNetModel container = (TrNetModel) getLink().eContainer();
		return TrnetvisualBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistSame_4001(container, getLink(), source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Same getLink() {
		return (Same) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected NodePattern getOldSource() {
		return (NodePattern) oldEnd;
	}

	/**
	 * @generated
	 */
	protected NodePattern getNewSource() {
		return (NodePattern) newEnd;
	}

	/**
	 * @generated
	 */
	protected NodePattern getOldTarget() {
		return (NodePattern) oldEnd;
	}

	/**
	 * @generated
	 */
	protected NodePattern getNewTarget() {
		return (NodePattern) newEnd;
	}
}
