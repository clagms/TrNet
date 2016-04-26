/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import trnetvisual.diagram.edit.commands.AntiOperandCreateCommand;
import trnetvisual.diagram.edit.commands.AntiOperandReorientCommand;
import trnetvisual.diagram.edit.commands.AnyOperandCreateCommand;
import trnetvisual.diagram.edit.commands.AnyOperandReorientCommand;
import trnetvisual.diagram.edit.commands.AnyResultCreateCommand;
import trnetvisual.diagram.edit.commands.AnyResultReorientCommand;
import trnetvisual.diagram.edit.commands.EventuallyCreateCommand;
import trnetvisual.diagram.edit.commands.EventuallyReorientCommand;
import trnetvisual.diagram.edit.commands.NextCreateCommand;
import trnetvisual.diagram.edit.commands.NextDerivedCreateCommand;
import trnetvisual.diagram.edit.commands.NextDerivedReorientCommand;
import trnetvisual.diagram.edit.commands.NextReorientCommand;
import trnetvisual.diagram.edit.commands.OptionalOperandCreateCommand;
import trnetvisual.diagram.edit.commands.OptionalOperandReorientCommand;
import trnetvisual.diagram.edit.commands.SomeOperandCreateCommand;
import trnetvisual.diagram.edit.commands.SomeOperandReorientCommand;
import trnetvisual.diagram.edit.commands.SomeResultCreateCommand;
import trnetvisual.diagram.edit.commands.SomeResultReorientCommand;
import trnetvisual.diagram.edit.parts.AntiOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyResultEditPart;
import trnetvisual.diagram.edit.parts.EventuallyEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalExternalActionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.ExternalExternalConditionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.NextDerivedEditPart;
import trnetvisual.diagram.edit.parts.NextEditPart;
import trnetvisual.diagram.edit.parts.OptionalOperandEditPart;
import trnetvisual.diagram.edit.parts.SomeOperandEditPart;
import trnetvisual.diagram.edit.parts.SomeResultEditPart;
import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class ExternalItemSemanticEditPolicy extends
		TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExternalItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.External_2004);
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
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == AnyOperandEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == SomeOperandEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == AntiOperandEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == OptionalOperandEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == NextEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == EventuallyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == NextDerivedEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (TrnetvisualVisualIDRegistry.getVisualID(outgoingLink) == AnyResultEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(outgoingLink) == SomeResultEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(outgoingLink) == NextEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(outgoingLink) == EventuallyEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(outgoingLink) == NextDerivedEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (TrnetvisualVisualIDRegistry.getVisualID(node)) {
			case ExternalExternalConditionsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (TrnetvisualVisualIDRegistry.getVisualID(cnode)) {
					case ExternalConditionCallEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (TrnetvisualVisualIDRegistry
									.getVisualID(outgoingLink) == ExternalConditionCallParameterEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case ExternalExternalActionsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (TrnetvisualVisualIDRegistry.getVisualID(cnode)) {
					case ExternalActionCallEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (TrnetvisualVisualIDRegistry
									.getVisualID(outgoingLink) == ExternalActionCallParameterEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (TrnetvisualElementTypes.AnyResult_4003 == req.getElementType()) {
			return getGEFWrapper(new AnyResultCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.SomeResult_4004 == req.getElementType()) {
			return getGEFWrapper(new SomeResultCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.AnyOperand_4005 == req.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.SomeOperand_4006 == req.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.AntiOperand_4007 == req.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.OptionalOperand_4008 == req
				.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.Next_4009 == req.getElementType()) {
			return getGEFWrapper(new NextCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (TrnetvisualElementTypes.Eventually_4010 == req.getElementType()) {
			return getGEFWrapper(new EventuallyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.NextDerived_4011 == req.getElementType()) {
			return getGEFWrapper(new NextDerivedCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TrnetvisualElementTypes.AnyResult_4003 == req.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.SomeResult_4004 == req.getElementType()) {
			return null;
		}
		if (TrnetvisualElementTypes.AnyOperand_4005 == req.getElementType()) {
			return getGEFWrapper(new AnyOperandCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.SomeOperand_4006 == req.getElementType()) {
			return getGEFWrapper(new SomeOperandCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.AntiOperand_4007 == req.getElementType()) {
			return getGEFWrapper(new AntiOperandCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.OptionalOperand_4008 == req
				.getElementType()) {
			return getGEFWrapper(new OptionalOperandCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.Next_4009 == req.getElementType()) {
			return getGEFWrapper(new NextCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (TrnetvisualElementTypes.Eventually_4010 == req.getElementType()) {
			return getGEFWrapper(new EventuallyCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TrnetvisualElementTypes.NextDerived_4011 == req.getElementType()) {
			return getGEFWrapper(new NextDerivedCreateCommand(req,
					req.getSource(), req.getTarget()));
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
		case AnyResultEditPart.VISUAL_ID:
			return getGEFWrapper(new AnyResultReorientCommand(req));
		case SomeResultEditPart.VISUAL_ID:
			return getGEFWrapper(new SomeResultReorientCommand(req));
		case AnyOperandEditPart.VISUAL_ID:
			return getGEFWrapper(new AnyOperandReorientCommand(req));
		case SomeOperandEditPart.VISUAL_ID:
			return getGEFWrapper(new SomeOperandReorientCommand(req));
		case AntiOperandEditPart.VISUAL_ID:
			return getGEFWrapper(new AntiOperandReorientCommand(req));
		case OptionalOperandEditPart.VISUAL_ID:
			return getGEFWrapper(new OptionalOperandReorientCommand(req));
		case NextEditPart.VISUAL_ID:
			return getGEFWrapper(new NextReorientCommand(req));
		case EventuallyEditPart.VISUAL_ID:
			return getGEFWrapper(new EventuallyReorientCommand(req));
		case NextDerivedEditPart.VISUAL_ID:
			return getGEFWrapper(new NextDerivedReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
