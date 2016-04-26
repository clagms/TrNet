/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import trnetvisual.AntiOperand;
import trnetvisual.AnyOperand;
import trnetvisual.AnyResult;
import trnetvisual.AttributePattern;
import trnetvisual.EdgePattern;
import trnetvisual.Eventually;
import trnetvisual.ExternalActionCall;
import trnetvisual.ExternalActionCallParameter;
import trnetvisual.ExternalAttributeCalculationCall;
import trnetvisual.ExternalAttributeCalculationCallParameter;
import trnetvisual.ExternalCalculationCall;
import trnetvisual.ExternalCalculationCallParameter;
import trnetvisual.ExternalConditionCall;
import trnetvisual.ExternalConditionCallParameter;
import trnetvisual.Keep;
import trnetvisual.Next;
import trnetvisual.NextDerived;
import trnetvisual.NodePattern;
import trnetvisual.Operator;
import trnetvisual.OptionalOperand;
import trnetvisual.Parameter;
import trnetvisual.Pattern;
import trnetvisual.Same;
import trnetvisual.SomeOperand;
import trnetvisual.SomeResult;
import trnetvisual.TrNetModel;
import trnetvisual.diagram.part.TrnetvisualDiagramEditorPlugin;
import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class TrnetvisualBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected TrnetvisualBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						TrnetvisualVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = TrnetvisualElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = TrnetvisualDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			TrnetvisualDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateSame_4001(TrNetModel container,
				NodePattern source, NodePattern target) {
			return canExistSame_4001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateKeep_4002(TrNetModel container,
				NodePattern source, NodePattern target) {
			return canExistKeep_4002(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAnyResult_4003(TrNetModel container,
				Operator source, Pattern target) {
			return canExistAnyResult_4003(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSomeResult_4004(TrNetModel container,
				Operator source, Pattern target) {
			return canExistSomeResult_4004(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAnyOperand_4005(TrNetModel container,
				Pattern source, Operator target) {
			return canExistAnyOperand_4005(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSomeOperand_4006(TrNetModel container,
				Pattern source, Operator target) {
			return canExistSomeOperand_4006(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAntiOperand_4007(TrNetModel container,
				Pattern source, Operator target) {
			return canExistAntiOperand_4007(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOptionalOperand_4008(TrNetModel container,
				Pattern source, Operator target) {
			return canExistOptionalOperand_4008(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNext_4009(TrNetModel container,
				Operator source, Operator target) {
			return canExistNext_4009(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEventually_4010(TrNetModel container,
				Operator source, Operator target) {
			return canExistEventually_4010(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNextDerived_4011(TrNetModel container,
				Operator source, Operator target) {
			return canExistNextDerived_4011(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateExternalAttributeCalculationCallParameter_4012(
				ExternalAttributeCalculationCall container,
				ExternalAttributeCalculationCall source, Parameter target) {
			return canExistExternalAttributeCalculationCallParameter_4012(
					container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateExternalConditionCallParameter_4013(
				ExternalConditionCall container, ExternalConditionCall source,
				Parameter target) {
			return canExistExternalConditionCallParameter_4013(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateExternalActionCallParameter_4014(
				ExternalActionCall container, ExternalActionCall source,
				Parameter target) {
			return canExistExternalActionCallParameter_4014(container, null,
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateExternalCalculationCallParameter_4015(
				ExternalCalculationCall container,
				ExternalCalculationCall source, Parameter target) {
			return canExistExternalCalculationCallParameter_4015(container,
					null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEdgePattern_4016(Pattern container,
				NodePattern source, NodePattern target) {
			return canExistEdgePattern_4016(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateExternalAttributeCalculationCallResult_4017(
				ExternalAttributeCalculationCall source, AttributePattern target) {
			if (source != null) {
				if (source.getResult() != null) {
					return false;
				}
			}
			if (target != null
					&& (target.getAttributeExternalCalculationCall() != null)) {
				return false;
			}

			return canExistExternalAttributeCalculationCallResult_4017(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canExistSame_4001(TrNetModel container,
				Same linkInstance, NodePattern source, NodePattern target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistKeep_4002(TrNetModel container,
				Keep linkInstance, NodePattern source, NodePattern target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAnyResult_4003(TrNetModel container,
				AnyResult linkInstance, Operator source, Pattern target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSomeResult_4004(TrNetModel container,
				SomeResult linkInstance, Operator source, Pattern target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAnyOperand_4005(TrNetModel container,
				AnyOperand linkInstance, Pattern source, Operator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSomeOperand_4006(TrNetModel container,
				SomeOperand linkInstance, Pattern source, Operator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAntiOperand_4007(TrNetModel container,
				AntiOperand linkInstance, Pattern source, Operator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOptionalOperand_4008(TrNetModel container,
				OptionalOperand linkInstance, Pattern source, Operator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNext_4009(TrNetModel container,
				Next linkInstance, Operator source, Operator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEventually_4010(TrNetModel container,
				Eventually linkInstance, Operator source, Operator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNextDerived_4011(TrNetModel container,
				NextDerived linkInstance, Operator source, Operator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistExternalAttributeCalculationCallParameter_4012(
				ExternalAttributeCalculationCall container,
				ExternalAttributeCalculationCallParameter linkInstance,
				ExternalAttributeCalculationCall source, Parameter target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistExternalConditionCallParameter_4013(
				ExternalConditionCall container,
				ExternalConditionCallParameter linkInstance,
				ExternalConditionCall source, Parameter target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistExternalActionCallParameter_4014(
				ExternalActionCall container,
				ExternalActionCallParameter linkInstance,
				ExternalActionCall source, Parameter target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistExternalCalculationCallParameter_4015(
				ExternalCalculationCall container,
				ExternalCalculationCallParameter linkInstance,
				ExternalCalculationCall source, Parameter target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEdgePattern_4016(Pattern container,
				EdgePattern linkInstance, NodePattern source, NodePattern target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistExternalAttributeCalculationCallResult_4017(
				ExternalAttributeCalculationCall source, AttributePattern target) {
			return true;
		}
	}

}
