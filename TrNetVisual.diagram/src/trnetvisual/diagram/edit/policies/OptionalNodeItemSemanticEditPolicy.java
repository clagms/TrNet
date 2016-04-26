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
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import trnetvisual.diagram.edit.commands.EdgePatternCreateCommand;
import trnetvisual.diagram.edit.commands.EdgePatternReorientCommand;
import trnetvisual.diagram.edit.commands.ExternalActionCallParameterCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalActionCallParameterReorientCommand;
import trnetvisual.diagram.edit.commands.ExternalAttributeCalculationCallParameterCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalAttributeCalculationCallParameterReorientCommand;
import trnetvisual.diagram.edit.commands.ExternalCalculationCallParameterCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalCalculationCallParameterReorientCommand;
import trnetvisual.diagram.edit.commands.ExternalConditionCallParameterCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalConditionCallParameterReorientCommand;
import trnetvisual.diagram.edit.commands.KeepCreateCommand;
import trnetvisual.diagram.edit.commands.KeepReorientCommand;
import trnetvisual.diagram.edit.commands.SameCreateCommand;
import trnetvisual.diagram.edit.commands.SameReorientCommand;
import trnetvisual.diagram.edit.parts.AttributePatternEditPart;
import trnetvisual.diagram.edit.parts.EdgePatternEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallResultEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.KeepEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeOptionalNodeAttributesCompartmentEditPart;
import trnetvisual.diagram.edit.parts.SameEditPart;
import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class OptionalNodeItemSemanticEditPolicy extends
		TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OptionalNodeItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.OptionalNode_3005);
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
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == SameEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == KeepEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
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
			if (TrnetvisualVisualIDRegistry.getVisualID(incomingLink) == EdgePatternEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (TrnetvisualVisualIDRegistry.getVisualID(outgoingLink) == SameEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(outgoingLink) == KeepEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TrnetvisualVisualIDRegistry.getVisualID(outgoingLink) == EdgePatternEditPart.VISUAL_ID) {
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
			case OptionalNodeOptionalNodeAttributesCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (TrnetvisualVisualIDRegistry.getVisualID(cnode)) {
					case AttributePatternEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (TrnetvisualVisualIDRegistry
									.getVisualID(incomingLink) == ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (TrnetvisualVisualIDRegistry
									.getVisualID(incomingLink) == ExternalConditionCallParameterEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (TrnetvisualVisualIDRegistry
									.getVisualID(incomingLink) == ExternalActionCallParameterEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (TrnetvisualVisualIDRegistry
									.getVisualID(incomingLink) == ExternalCalculationCallParameterEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (TrnetvisualVisualIDRegistry
									.getVisualID(incomingLink) == ExternalAttributeCalculationCallResultEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
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
		if (TrnetvisualElementTypes.Same_4001 == req.getElementType()) {
			return getGEFWrapper(new SameCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (TrnetvisualElementTypes.Keep_4002 == req.getElementType()) {
			return getGEFWrapper(new KeepCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
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
		if (TrnetvisualElementTypes.EdgePattern_4016 == req.getElementType()) {
			return getGEFWrapper(new EdgePatternCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TrnetvisualElementTypes.Same_4001 == req.getElementType()) {
			return getGEFWrapper(new SameCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (TrnetvisualElementTypes.Keep_4002 == req.getElementType()) {
			return getGEFWrapper(new KeepCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
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
		if (TrnetvisualElementTypes.EdgePattern_4016 == req.getElementType()) {
			return getGEFWrapper(new EdgePatternCreateCommand(req,
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
		case SameEditPart.VISUAL_ID:
			return getGEFWrapper(new SameReorientCommand(req));
		case KeepEditPart.VISUAL_ID:
			return getGEFWrapper(new KeepReorientCommand(req));
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
		case EdgePatternEditPart.VISUAL_ID:
			return getGEFWrapper(new EdgePatternReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
