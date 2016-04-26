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
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import trnetvisual.diagram.edit.policies.OpenDiagramEditPolicy;
import trnetvisual.diagram.edit.policies.OptionalNodeItemSemanticEditPolicy;
import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class OptionalNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

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
	public OptionalNodeEditPart(View view) {
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
				new OptionalNodeItemSemanticEditPolicy());
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
		return primaryShape = new OptionalNodeFigure();
	}

	/**
	 * @generated
	 */
	public OptionalNodeFigure getPrimaryShape() {
		return (OptionalNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OptionalNodeNameEditPart) {
			((OptionalNodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOptionalNodeLabelFigure());
			return true;
		}
		if (childEditPart instanceof OptionalNodeOptionalNodeAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getOptionalNodeAttributesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((OptionalNodeOptionalNodeAttributesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OptionalNodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof OptionalNodeOptionalNodeAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getOptionalNodeAttributesCompartmentFigure();
			pane.remove(((OptionalNodeOptionalNodeAttributesCompartmentEditPart) childEditPart)
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
		if (editPart instanceof OptionalNodeOptionalNodeAttributesCompartmentEditPart) {
			return getPrimaryShape()
					.getOptionalNodeAttributesCompartmentFigure();
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(TrnetvisualVisualIDRegistry
				.getType(OptionalNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(TrnetvisualElementTypes.Same_4001);
		types.add(TrnetvisualElementTypes.Keep_4002);
		types.add(TrnetvisualElementTypes.EdgePattern_4016);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof MandatoryNodeEditPart) {
			types.add(TrnetvisualElementTypes.Same_4001);
		}
		if (targetEditPart instanceof trnetvisual.diagram.edit.parts.OptionalNodeEditPart) {
			types.add(TrnetvisualElementTypes.Same_4001);
		}
		if (targetEditPart instanceof MandatoryNodeEditPart) {
			types.add(TrnetvisualElementTypes.Keep_4002);
		}
		if (targetEditPart instanceof trnetvisual.diagram.edit.parts.OptionalNodeEditPart) {
			types.add(TrnetvisualElementTypes.Keep_4002);
		}
		if (targetEditPart instanceof MandatoryNodeEditPart) {
			types.add(TrnetvisualElementTypes.EdgePattern_4016);
		}
		if (targetEditPart instanceof trnetvisual.diagram.edit.parts.OptionalNodeEditPart) {
			types.add(TrnetvisualElementTypes.EdgePattern_4016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TrnetvisualElementTypes.Same_4001) {
			types.add(TrnetvisualElementTypes.MandatoryNode_3003);
			types.add(TrnetvisualElementTypes.OptionalNode_3005);
		} else if (relationshipType == TrnetvisualElementTypes.Keep_4002) {
			types.add(TrnetvisualElementTypes.MandatoryNode_3003);
			types.add(TrnetvisualElementTypes.OptionalNode_3005);
		} else if (relationshipType == TrnetvisualElementTypes.EdgePattern_4016) {
			types.add(TrnetvisualElementTypes.MandatoryNode_3003);
			types.add(TrnetvisualElementTypes.OptionalNode_3005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(TrnetvisualElementTypes.Same_4001);
		types.add(TrnetvisualElementTypes.Keep_4002);
		types.add(TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012);
		types.add(TrnetvisualElementTypes.ExternalConditionCallParameter_4013);
		types.add(TrnetvisualElementTypes.ExternalActionCallParameter_4014);
		types.add(TrnetvisualElementTypes.ExternalCalculationCallParameter_4015);
		types.add(TrnetvisualElementTypes.EdgePattern_4016);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TrnetvisualElementTypes.Same_4001) {
			types.add(TrnetvisualElementTypes.MandatoryNode_3003);
			types.add(TrnetvisualElementTypes.OptionalNode_3005);
		} else if (relationshipType == TrnetvisualElementTypes.Keep_4002) {
			types.add(TrnetvisualElementTypes.MandatoryNode_3003);
			types.add(TrnetvisualElementTypes.OptionalNode_3005);
		} else if (relationshipType == TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012) {
			types.add(TrnetvisualElementTypes.ExternalAttributeCalculationCall_2001);
		} else if (relationshipType == TrnetvisualElementTypes.ExternalConditionCallParameter_4013) {
			types.add(TrnetvisualElementTypes.ExternalConditionCall_3001);
		} else if (relationshipType == TrnetvisualElementTypes.ExternalActionCallParameter_4014) {
			types.add(TrnetvisualElementTypes.ExternalActionCall_3002);
		} else if (relationshipType == TrnetvisualElementTypes.ExternalCalculationCallParameter_4015) {
			types.add(TrnetvisualElementTypes.ExternalCalculationCall_2002);
		} else if (relationshipType == TrnetvisualElementTypes.EdgePattern_4016) {
			types.add(TrnetvisualElementTypes.MandatoryNode_3003);
			types.add(TrnetvisualElementTypes.OptionalNode_3005);
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
			if (type == TrnetvisualElementTypes.AttributePattern_3004) {
				return getChildBySemanticHint(TrnetvisualVisualIDRegistry
						.getType(OptionalNodeOptionalNodeAttributesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class OptionalNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOptionalNodeLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fOptionalNodeAttributesCompartmentFigure;

		/**
		 * @generated
		 */
		public OptionalNodeFigure() {
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureOptionalNodeLabelFigure = new WrappingLabel();

			fFigureOptionalNodeLabelFigure.setText("OptionalNode");
			fFigureOptionalNodeLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureOptionalNodeLabelFigure);

			fOptionalNodeAttributesCompartmentFigure = new RectangleFigure();

			fOptionalNodeAttributesCompartmentFigure.setOutline(false);

			this.add(fOptionalNodeAttributesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOptionalNodeLabelFigure() {
			return fFigureOptionalNodeLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getOptionalNodeAttributesCompartmentFigure() {
			return fOptionalNodeAttributesCompartmentFigure;
		}

	}

}
