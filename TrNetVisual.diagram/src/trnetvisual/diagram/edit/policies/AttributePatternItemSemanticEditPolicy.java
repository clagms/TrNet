/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import trnetvisual.diagram.edit.commands.ExternalActionCallParameterCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalActionCallParameterReorientCommand;
import trnetvisual.diagram.edit.commands.ExternalAttributeCalculationCallParameterCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalAttributeCalculationCallParameterReorientCommand;
import trnetvisual.diagram.edit.commands.ExternalAttributeCalculationCallResultCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalAttributeCalculationCallResultReorientCommand;
import trnetvisual.diagram.edit.commands.ExternalCalculationCallParameterCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalCalculationCallParameterReorientCommand;
import trnetvisual.diagram.edit.commands.ExternalConditionCallParameterCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalConditionCallParameterReorientCommand;
import trnetvisual.diagram.edit.parts.ExternalActionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallResultEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallParameterEditPart;
import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class AttributePatternItemSemanticEditPolicy extends
		TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AttributePatternItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.AttributePattern_3004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == ExternalConditionCallParameterEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == ExternalActionCallParameterEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == ExternalCalculationCallParameterEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == ExternalAttributeCalculationCallResultEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012 == req
				.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.ExternalConditionCallParameter_4013 == req
				.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.ExternalActionCallParameter_4014 == req
				.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.ExternalCalculationCallParameter_4015 == req
				.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.ExternalAttributeCalculationCallResult_4017 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012 == req
				.getElementType()) {
			return getGEFWrapper(new ExternalAttributeCalculationCallParameterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.ExternalConditionCallParameter_4013 == req
				.getElementType()) {
			return getGEFWrapper(new ExternalConditionCallParameterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.ExternalActionCallParameter_4014 == req
				.getElementType()) {
			return getGEFWrapper(new ExternalActionCallParameterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.ExternalCalculationCallParameter_4015 == req
				.getElementType()) {
			return getGEFWrapper(new ExternalCalculationCallParameterCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.ExternalAttributeCalculationCallResult_4017 == req
				.getElementType()) {
			return getGEFWrapper(new ExternalAttributeCalculationCallResultCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID:
			return getGEFWrapper(new ExternalAttributeCalculationCallParameterReorientCommand(
					req));
		case ExternalConditionCallParameterEditPart.VISUAL_ID:
			return getGEFWrapper(new ExternalConditionCallParameterReorientCommand(
					req));
		case ExternalActionCallParameterEditPart.VISUAL_ID:
			return getGEFWrapper(new ExternalActionCallParameterReorientCommand(
					req));
		case ExternalCalculationCallParameterEditPart.VISUAL_ID:
			return getGEFWrapper(new ExternalCalculationCallParameterReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ExternalAttributeCalculationCallResultEditPart.VISUAL_ID:
			return getGEFWrapper(new ExternalAttributeCalculationCallResultReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
