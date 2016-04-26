/*
 * 
 */
package trnetvisual.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import trnetvisual.AntiOperand;
import trnetvisual.AnyOperand;
import trnetvisual.Combinator;
import trnetvisual.External;
import trnetvisual.OptionalOperand;
import trnetvisual.Pattern;
import trnetvisual.SomeOperand;
import trnetvisual.SomeResult;
import trnetvisual.TrNetModel;
import trnetvisual.diagram.edit.parts.AntiOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyResultEditPart;
import trnetvisual.diagram.edit.parts.AttributePatternEditPart;
import trnetvisual.diagram.edit.parts.AttributePatternNameEditPart;
import trnetvisual.diagram.edit.parts.CombinatorEditPart;
import trnetvisual.diagram.edit.parts.EdgePatternEditPart;
import trnetvisual.diagram.edit.parts.EdgePatternNameEditPart;
import trnetvisual.diagram.edit.parts.EventuallyEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallResultEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalEditPart;
import trnetvisual.diagram.edit.parts.KeepEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeNameEditPart;
import trnetvisual.diagram.edit.parts.NextDerivedEditPart;
import trnetvisual.diagram.edit.parts.NextEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeNameEditPart;
import trnetvisual.diagram.edit.parts.OptionalOperandEditPart;
import trnetvisual.diagram.edit.parts.PatternEditPart;
import trnetvisual.diagram.edit.parts.SameEditPart;
import trnetvisual.diagram.edit.parts.SomeOperandEditPart;
import trnetvisual.diagram.edit.parts.SomeResultEditPart;
import trnetvisual.diagram.edit.parts.TrNetModelEditPart;
import trnetvisual.diagram.part.TrnetvisualDiagramEditorPlugin;
import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;
import trnetvisual.diagram.providers.TrnetvisualParserProvider;

/**
 * @generated
 */
public class TrnetvisualNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TrnetvisualDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TrnetvisualDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TrnetvisualNavigatorItem
				&& !isOwnView(((TrnetvisualNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TrnetvisualNavigatorGroup) {
			TrnetvisualNavigatorGroup group = (TrnetvisualNavigatorGroup) element;
			return TrnetvisualDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof TrnetvisualNavigatorItem) {
			TrnetvisualNavigatorItem navigatorItem = (TrnetvisualNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (TrnetvisualVisualIDRegistry.getVisualID(view)) {
		case OptionalOperandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?OptionalOperand", TrnetvisualElementTypes.OptionalOperand_4008); //$NON-NLS-1$
		case SameEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?Same", TrnetvisualElementTypes.Same_4001); //$NON-NLS-1$
		case ExternalAttributeCalculationCallResultEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?ExternalAttributeCalculationCall?result", TrnetvisualElementTypes.ExternalAttributeCalculationCallResult_4017); //$NON-NLS-1$
		case NextDerivedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?NextDerived", TrnetvisualElementTypes.NextDerived_4011); //$NON-NLS-1$
		case AnyResultEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?AnyResult", TrnetvisualElementTypes.AnyResult_4003); //$NON-NLS-1$
		case NextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?Next", TrnetvisualElementTypes.Next_4009); //$NON-NLS-1$
		case PatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://trnetvisual/1.0?Pattern", TrnetvisualElementTypes.Pattern_2005); //$NON-NLS-1$
		case KeepEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?Keep", TrnetvisualElementTypes.Keep_4002); //$NON-NLS-1$
		case TrNetModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://trnetvisual/1.0?TrNetModel", TrnetvisualElementTypes.TrNetModel_1000); //$NON-NLS-1$
		case SomeResultEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?SomeResult", TrnetvisualElementTypes.SomeResult_4004); //$NON-NLS-1$
		case ExternalCalculationCallEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://trnetvisual/1.0?ExternalCalculationCall", TrnetvisualElementTypes.ExternalCalculationCall_2002); //$NON-NLS-1$
		case ExternalConditionCallParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?ExternalConditionCallParameter", TrnetvisualElementTypes.ExternalConditionCallParameter_4013); //$NON-NLS-1$
		case CombinatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://trnetvisual/1.0?Combinator", TrnetvisualElementTypes.Combinator_2003); //$NON-NLS-1$
		case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?ExternalAttributeCalculationCallParameter", TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012); //$NON-NLS-1$
		case ExternalAttributeCalculationCallEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://trnetvisual/1.0?ExternalAttributeCalculationCall", TrnetvisualElementTypes.ExternalAttributeCalculationCall_2001); //$NON-NLS-1$
		case ExternalActionCallEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://trnetvisual/1.0?ExternalActionCall", TrnetvisualElementTypes.ExternalActionCall_3002); //$NON-NLS-1$
		case ExternalActionCallParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?ExternalActionCallParameter", TrnetvisualElementTypes.ExternalActionCallParameter_4014); //$NON-NLS-1$
		case ExternalCalculationCallParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?ExternalCalculationCallParameter", TrnetvisualElementTypes.ExternalCalculationCallParameter_4015); //$NON-NLS-1$
		case EventuallyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?Eventually", TrnetvisualElementTypes.Eventually_4010); //$NON-NLS-1$
		case SomeOperandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?SomeOperand", TrnetvisualElementTypes.SomeOperand_4006); //$NON-NLS-1$
		case MandatoryNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://trnetvisual/1.0?MandatoryNode", TrnetvisualElementTypes.MandatoryNode_3003); //$NON-NLS-1$
		case AttributePatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://trnetvisual/1.0?AttributePattern", TrnetvisualElementTypes.AttributePattern_3004); //$NON-NLS-1$
		case EdgePatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?EdgePattern", TrnetvisualElementTypes.EdgePattern_4016); //$NON-NLS-1$
		case ExternalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://trnetvisual/1.0?External", TrnetvisualElementTypes.External_2004); //$NON-NLS-1$
		case ExternalConditionCallEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://trnetvisual/1.0?ExternalConditionCall", TrnetvisualElementTypes.ExternalConditionCall_3001); //$NON-NLS-1$
		case OptionalNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://trnetvisual/1.0?OptionalNode", TrnetvisualElementTypes.OptionalNode_3005); //$NON-NLS-1$
		case AnyOperandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?AnyOperand", TrnetvisualElementTypes.AnyOperand_4005); //$NON-NLS-1$
		case AntiOperandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://trnetvisual/1.0?AntiOperand", TrnetvisualElementTypes.AntiOperand_4007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TrnetvisualDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TrnetvisualElementTypes.isKnownElementType(elementType)) {
			image = TrnetvisualElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof TrnetvisualNavigatorGroup) {
			TrnetvisualNavigatorGroup group = (TrnetvisualNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TrnetvisualNavigatorItem) {
			TrnetvisualNavigatorItem navigatorItem = (TrnetvisualNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (TrnetvisualVisualIDRegistry.getVisualID(view)) {
		case OptionalOperandEditPart.VISUAL_ID:
			return getOptionalOperand_4008Text(view);
		case SameEditPart.VISUAL_ID:
			return getSame_4001Text(view);
		case ExternalAttributeCalculationCallResultEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCallResult_4017Text(view);
		case NextDerivedEditPart.VISUAL_ID:
			return getNextDerived_4011Text(view);
		case AnyResultEditPart.VISUAL_ID:
			return getAnyResult_4003Text(view);
		case NextEditPart.VISUAL_ID:
			return getNext_4009Text(view);
		case PatternEditPart.VISUAL_ID:
			return getPattern_2005Text(view);
		case KeepEditPart.VISUAL_ID:
			return getKeep_4002Text(view);
		case TrNetModelEditPart.VISUAL_ID:
			return getTrNetModel_1000Text(view);
		case SomeResultEditPart.VISUAL_ID:
			return getSomeResult_4004Text(view);
		case ExternalCalculationCallEditPart.VISUAL_ID:
			return getExternalCalculationCall_2002Text(view);
		case ExternalConditionCallParameterEditPart.VISUAL_ID:
			return getExternalConditionCallParameter_4013Text(view);
		case CombinatorEditPart.VISUAL_ID:
			return getCombinator_2003Text(view);
		case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCallParameter_4012Text(view);
		case ExternalAttributeCalculationCallEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCall_2001Text(view);
		case ExternalActionCallEditPart.VISUAL_ID:
			return getExternalActionCall_3002Text(view);
		case ExternalActionCallParameterEditPart.VISUAL_ID:
			return getExternalActionCallParameter_4014Text(view);
		case ExternalCalculationCallParameterEditPart.VISUAL_ID:
			return getExternalCalculationCallParameter_4015Text(view);
		case EventuallyEditPart.VISUAL_ID:
			return getEventually_4010Text(view);
		case SomeOperandEditPart.VISUAL_ID:
			return getSomeOperand_4006Text(view);
		case MandatoryNodeEditPart.VISUAL_ID:
			return getMandatoryNode_3003Text(view);
		case AttributePatternEditPart.VISUAL_ID:
			return getAttributePattern_3004Text(view);
		case EdgePatternEditPart.VISUAL_ID:
			return getEdgePattern_4016Text(view);
		case ExternalEditPart.VISUAL_ID:
			return getExternal_2004Text(view);
		case ExternalConditionCallEditPart.VISUAL_ID:
			return getExternalConditionCall_3001Text(view);
		case OptionalNodeEditPart.VISUAL_ID:
			return getOptionalNode_3005Text(view);
		case AnyOperandEditPart.VISUAL_ID:
			return getAnyOperand_4005Text(view);
		case AntiOperandEditPart.VISUAL_ID:
			return getAntiOperand_4007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getOptionalOperand_4008Text(View view) {
		OptionalOperand domainModelElement = (OptionalOperand) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getIndex());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSame_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getExternalAttributeCalculationCallResult_4017Text(View view) {
		IParser parser = TrnetvisualParserProvider
				.getParser(
						TrnetvisualElementTypes.ExternalAttributeCalculationCallResult_4017,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNextDerived_4011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAnyResult_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNext_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPattern_2005Text(View view) {
		Pattern domainModelElement = (Pattern) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getKeep_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTrNetModel_1000Text(View view) {
		TrNetModel domainModelElement = (TrNetModel) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSomeResult_4004Text(View view) {
		SomeResult domainModelElement = (SomeResult) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getCount());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalCalculationCall_2002Text(View view) {
		IParser parser = TrnetvisualParserProvider.getParser(
				TrnetvisualElementTypes.ExternalCalculationCall_2002, view
						.getElement() != null ? view.getElement() : view,
				TrnetvisualVisualIDRegistry
						.getType(ExternalCalculationCallIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalConditionCallParameter_4013Text(View view) {
		IParser parser = TrnetvisualParserProvider
				.getParser(
						TrnetvisualElementTypes.ExternalConditionCallParameter_4013,
						view.getElement() != null ? view.getElement() : view,
						TrnetvisualVisualIDRegistry
								.getType(ExternalConditionCallParameterIndexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCombinator_2003Text(View view) {
		Combinator domainModelElement = (Combinator) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalAttributeCalculationCallParameter_4012Text(
			View view) {
		IParser parser = TrnetvisualParserProvider
				.getParser(
						TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012,
						view.getElement() != null ? view.getElement() : view,
						TrnetvisualVisualIDRegistry
								.getType(ExternalAttributeCalculationCallParameterIndexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalAttributeCalculationCall_2001Text(View view) {
		IParser parser = TrnetvisualParserProvider
				.getParser(
						TrnetvisualElementTypes.ExternalAttributeCalculationCall_2001,
						view.getElement() != null ? view.getElement() : view,
						TrnetvisualVisualIDRegistry
								.getType(ExternalAttributeCalculationCallIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalActionCall_3002Text(View view) {
		IParser parser = TrnetvisualParserProvider.getParser(
				TrnetvisualElementTypes.ExternalActionCall_3002, view
						.getElement() != null ? view.getElement() : view,
				TrnetvisualVisualIDRegistry
						.getType(ExternalActionCallIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalActionCallParameter_4014Text(View view) {
		IParser parser = TrnetvisualParserProvider
				.getParser(
						TrnetvisualElementTypes.ExternalActionCallParameter_4014,
						view.getElement() != null ? view.getElement() : view,
						TrnetvisualVisualIDRegistry
								.getType(ExternalActionCallParameterIndexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalCalculationCallParameter_4015Text(View view) {
		IParser parser = TrnetvisualParserProvider
				.getParser(
						TrnetvisualElementTypes.ExternalCalculationCallParameter_4015,
						view.getElement() != null ? view.getElement() : view,
						TrnetvisualVisualIDRegistry
								.getType(ExternalCalculationCallParameterIndexEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventually_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSomeOperand_4006Text(View view) {
		SomeOperand domainModelElement = (SomeOperand) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getIndex());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMandatoryNode_3003Text(View view) {
		IParser parser = TrnetvisualParserProvider.getParser(
				TrnetvisualElementTypes.MandatoryNode_3003,
				view.getElement() != null ? view.getElement() : view,
				TrnetvisualVisualIDRegistry
						.getType(MandatoryNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributePattern_3004Text(View view) {
		IParser parser = TrnetvisualParserProvider.getParser(
				TrnetvisualElementTypes.AttributePattern_3004, view
						.getElement() != null ? view.getElement() : view,
				TrnetvisualVisualIDRegistry
						.getType(AttributePatternNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEdgePattern_4016Text(View view) {
		IParser parser = TrnetvisualParserProvider.getParser(
				TrnetvisualElementTypes.EdgePattern_4016,
				view.getElement() != null ? view.getElement() : view,
				TrnetvisualVisualIDRegistry
						.getType(EdgePatternNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternal_2004Text(View view) {
		External domainModelElement = (External) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalConditionCall_3001Text(View view) {
		IParser parser = TrnetvisualParserProvider.getParser(
				TrnetvisualElementTypes.ExternalConditionCall_3001, view
						.getElement() != null ? view.getElement() : view,
				TrnetvisualVisualIDRegistry
						.getType(ExternalConditionCallIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOptionalNode_3005Text(View view) {
		IParser parser = TrnetvisualParserProvider.getParser(
				TrnetvisualElementTypes.OptionalNode_3005,
				view.getElement() != null ? view.getElement() : view,
				TrnetvisualVisualIDRegistry
						.getType(OptionalNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnyOperand_4005Text(View view) {
		AnyOperand domainModelElement = (AnyOperand) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getIndex());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAntiOperand_4007Text(View view) {
		AntiOperand domainModelElement = (AntiOperand) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getIndex());
		} else {
			TrnetvisualDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TrNetModelEditPart.MODEL_ID.equals(TrnetvisualVisualIDRegistry
				.getModelID(view));
	}

}
