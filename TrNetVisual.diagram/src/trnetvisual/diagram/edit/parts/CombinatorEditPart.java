/*
 * 
 */
package trnetvisual.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import trnetvisual.diagram.edit.policies.CombinatorItemSemanticEditPolicy;
import trnetvisual.diagram.edit.policies.OpenDiagramEditPolicy;
import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class CombinatorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public CombinatorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						TrnetvisualVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CombinatorItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new CombinatorFigure();
	}

	/**
	 * @generated
	 */
	public CombinatorFigure getPrimaryShape() {
		return (CombinatorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CombinatorCombinatorConditionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getCombinatorConditionsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CombinatorCombinatorConditionsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof CombinatorCombinatorActionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getCombinatorActionsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((CombinatorCombinatorActionsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CombinatorCombinatorConditionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getCombinatorConditionsCompartmentFigure();
			pane.remove(((CombinatorCombinatorConditionsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof CombinatorCombinatorActionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getCombinatorActionsCompartmentFigure();
			pane.remove(((CombinatorCombinatorActionsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof CombinatorCombinatorConditionsCompartmentEditPart) {
			return getPrimaryShape().getCombinatorConditionsCompartmentFigure();
		}
		if (editPart instanceof CombinatorCombinatorActionsCompartmentEditPart) {
			return getPrimaryShape().getCombinatorActionsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(TrnetvisualElementTypes.AnyResult_4003);
		types.add(TrnetvisualElementTypes.SomeResult_4004);
		types.add(TrnetvisualElementTypes.Next_4009);
		types.add(TrnetvisualElementTypes.Eventually_4010);
		types.add(TrnetvisualElementTypes.NextDerived_4011);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PatternEditPart) {
			types.add(TrnetvisualElementTypes.AnyResult_4003);
		}
		if (targetEditPart instanceof PatternEditPart) {
			types.add(TrnetvisualElementTypes.SomeResult_4004);
		}
		if (targetEditPart instanceof trnetvisual.diagram.edit.parts.CombinatorEditPart) {
			types.add(TrnetvisualElementTypes.Next_4009);
		}
		if (targetEditPart instanceof ExternalEditPart) {
			types.add(TrnetvisualElementTypes.Next_4009);
		}
		if (targetEditPart instanceof trnetvisual.diagram.edit.parts.CombinatorEditPart) {
			types.add(TrnetvisualElementTypes.Eventually_4010);
		}
		if (targetEditPart instanceof ExternalEditPart) {
			types.add(TrnetvisualElementTypes.Eventually_4010);
		}
		if (targetEditPart instanceof trnetvisual.diagram.edit.parts.CombinatorEditPart) {
			types.add(TrnetvisualElementTypes.NextDerived_4011);
		}
		if (targetEditPart instanceof ExternalEditPart) {
			types.add(TrnetvisualElementTypes.NextDerived_4011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TrnetvisualElementTypes.AnyResult_4003) {
			types.add(TrnetvisualElementTypes.Pattern_2005);
		} else if (relationshipType == TrnetvisualElementTypes.SomeResult_4004) {
			types.add(TrnetvisualElementTypes.Pattern_2005);
		} else if (relationshipType == TrnetvisualElementTypes.Next_4009) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		} else if (relationshipType == TrnetvisualElementTypes.Eventually_4010) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		} else if (relationshipType == TrnetvisualElementTypes.NextDerived_4011) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(TrnetvisualElementTypes.AnyOperand_4005);
		types.add(TrnetvisualElementTypes.SomeOperand_4006);
		types.add(TrnetvisualElementTypes.AntiOperand_4007);
		types.add(TrnetvisualElementTypes.OptionalOperand_4008);
		types.add(TrnetvisualElementTypes.Next_4009);
		types.add(TrnetvisualElementTypes.Eventually_4010);
		types.add(TrnetvisualElementTypes.NextDerived_4011);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TrnetvisualElementTypes.AnyOperand_4005) {
			types.add(TrnetvisualElementTypes.Pattern_2005);
		} else if (relationshipType == TrnetvisualElementTypes.SomeOperand_4006) {
			types.add(TrnetvisualElementTypes.Pattern_2005);
		} else if (relationshipType == TrnetvisualElementTypes.AntiOperand_4007) {
			types.add(TrnetvisualElementTypes.Pattern_2005);
		} else if (relationshipType == TrnetvisualElementTypes.OptionalOperand_4008) {
			types.add(TrnetvisualElementTypes.Pattern_2005);
		} else if (relationshipType == TrnetvisualElementTypes.Next_4009) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		} else if (relationshipType == TrnetvisualElementTypes.Eventually_4010) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		} else if (relationshipType == TrnetvisualElementTypes.NextDerived_4011) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == TrnetvisualElementTypes.ExternalConditionCall_3001) {
				return getChildBySemanticHint(TrnetvisualVisualIDRegistry
						.getType(CombinatorCombinatorConditionsCompartmentEditPart.VISUAL_ID));
			}
			if (type == TrnetvisualElementTypes.ExternalActionCall_3002) {
				return getChildBySemanticHint(TrnetvisualVisualIDRegistry
						.getType(CombinatorCombinatorActionsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class CombinatorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fCombinatorConditionsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fCombinatorActionsCompartmentFigure;

		/**
		 * @generated
		 */
		public CombinatorFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fCombinatorConditionsCompartmentFigure = new RectangleFigure();

			fCombinatorConditionsCompartmentFigure.setOutline(false);

			this.add(fCombinatorConditionsCompartmentFigure);

			fCombinatorActionsCompartmentFigure = new RectangleFigure();

			fCombinatorActionsCompartmentFigure.setOutline(false);

			this.add(fCombinatorActionsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getCombinatorConditionsCompartmentFigure() {
			return fCombinatorConditionsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getCombinatorActionsCompartmentFigure() {
			return fCombinatorActionsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 145, 145, 145);

}
