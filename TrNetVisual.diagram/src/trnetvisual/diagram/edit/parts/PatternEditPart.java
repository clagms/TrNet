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
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import trnetvisual.diagram.edit.policies.OpenDiagramEditPolicy;
import trnetvisual.diagram.edit.policies.PatternItemSemanticEditPolicy;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class PatternEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

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
	public PatternEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PatternItemSemanticEditPolicy());
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
		return primaryShape = new PatternFigure();
	}

	/**
	 * @generated
	 */
	public PatternFigure getPrimaryShape() {
		return (PatternFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PatternPatternNodesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getPatternNodesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PatternPatternNodesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PatternPatternNodesCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getPatternNodesCompartmentFigure();
			pane.remove(((PatternPatternNodesCompartmentEditPart) childEditPart)
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
		if (editPart instanceof PatternPatternNodesCompartmentEditPart) {
			return getPrimaryShape().getPatternNodesCompartmentFigure();
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
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(TrnetvisualElementTypes.AnyOperand_4005);
		types.add(TrnetvisualElementTypes.SomeOperand_4006);
		types.add(TrnetvisualElementTypes.AntiOperand_4007);
		types.add(TrnetvisualElementTypes.OptionalOperand_4008);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CombinatorEditPart) {
			types.add(TrnetvisualElementTypes.AnyOperand_4005);
		}
		if (targetEditPart instanceof ExternalEditPart) {
			types.add(TrnetvisualElementTypes.AnyOperand_4005);
		}
		if (targetEditPart instanceof CombinatorEditPart) {
			types.add(TrnetvisualElementTypes.SomeOperand_4006);
		}
		if (targetEditPart instanceof ExternalEditPart) {
			types.add(TrnetvisualElementTypes.SomeOperand_4006);
		}
		if (targetEditPart instanceof CombinatorEditPart) {
			types.add(TrnetvisualElementTypes.AntiOperand_4007);
		}
		if (targetEditPart instanceof ExternalEditPart) {
			types.add(TrnetvisualElementTypes.AntiOperand_4007);
		}
		if (targetEditPart instanceof CombinatorEditPart) {
			types.add(TrnetvisualElementTypes.OptionalOperand_4008);
		}
		if (targetEditPart instanceof ExternalEditPart) {
			types.add(TrnetvisualElementTypes.OptionalOperand_4008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TrnetvisualElementTypes.AnyOperand_4005) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		} else if (relationshipType == TrnetvisualElementTypes.SomeOperand_4006) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		} else if (relationshipType == TrnetvisualElementTypes.AntiOperand_4007) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		} else if (relationshipType == TrnetvisualElementTypes.OptionalOperand_4008) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TrnetvisualElementTypes.AnyResult_4003);
		types.add(TrnetvisualElementTypes.SomeResult_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == TrnetvisualElementTypes.AnyResult_4003) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		} else if (relationshipType == TrnetvisualElementTypes.SomeResult_4004) {
			types.add(TrnetvisualElementTypes.Combinator_2003);
			types.add(TrnetvisualElementTypes.External_2004);
		}
		return types;
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
	public class PatternFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fPatternNodesCompartmentFigure;

		/**
		 * @generated
		 */
		public PatternFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fPatternNodesCompartmentFigure = new RectangleFigure();

			fPatternNodesCompartmentFigure.setOutline(false);

			this.add(fPatternNodesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getPatternNodesCompartmentFigure() {
			return fPatternNodesCompartmentFigure;
		}

	}

}
