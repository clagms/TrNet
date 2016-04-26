/*
 * 
 */
package trnetvisual.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import trnetvisual.Action;
import trnetvisual.AntiOperand;
import trnetvisual.AnyOperand;
import trnetvisual.AnyResult;
import trnetvisual.ApplicationCondition;
import trnetvisual.AttributePattern;
import trnetvisual.Calculation;
import trnetvisual.Combinator;
import trnetvisual.EdgePattern;
import trnetvisual.Eventually;
import trnetvisual.External;
import trnetvisual.ExternalActionCall;
import trnetvisual.ExternalActionCallParameter;
import trnetvisual.ExternalAttributeCalculationCall;
import trnetvisual.ExternalAttributeCalculationCallParameter;
import trnetvisual.ExternalCalculationCall;
import trnetvisual.ExternalCalculationCallParameter;
import trnetvisual.ExternalConditionCall;
import trnetvisual.ExternalConditionCallParameter;
import trnetvisual.Keep;
import trnetvisual.MandatoryNode;
import trnetvisual.Next;
import trnetvisual.NextDerived;
import trnetvisual.NodePattern;
import trnetvisual.Operator;
import trnetvisual.OptionalNode;
import trnetvisual.OptionalOperand;
import trnetvisual.Parameter;
import trnetvisual.Pattern;
import trnetvisual.Restriction;
import trnetvisual.Same;
import trnetvisual.SomeOperand;
import trnetvisual.SomeResult;
import trnetvisual.TrNetModel;
import trnetvisual.TrnetvisualPackage;
import trnetvisual.diagram.edit.parts.AntiOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyResultEditPart;
import trnetvisual.diagram.edit.parts.AttributePatternEditPart;
import trnetvisual.diagram.edit.parts.CombinatorCombinatorActionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.CombinatorCombinatorConditionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.CombinatorEditPart;
import trnetvisual.diagram.edit.parts.EdgePatternEditPart;
import trnetvisual.diagram.edit.parts.EventuallyEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallResultEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallParameterEditPart;
import trnetvisual.diagram.edit.parts.ExternalEditPart;
import trnetvisual.diagram.edit.parts.ExternalExternalActionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.ExternalExternalConditionsCompartmentEditPart;
import trnetvisual.diagram.edit.parts.KeepEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeMandatoryNodeAttributesCompartmentEditPart;
import trnetvisual.diagram.edit.parts.NextDerivedEditPart;
import trnetvisual.diagram.edit.parts.NextEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeOptionalNodeAttributesCompartmentEditPart;
import trnetvisual.diagram.edit.parts.OptionalOperandEditPart;
import trnetvisual.diagram.edit.parts.PatternEditPart;
import trnetvisual.diagram.edit.parts.PatternPatternNodesCompartmentEditPart;
import trnetvisual.diagram.edit.parts.SameEditPart;
import trnetvisual.diagram.edit.parts.SomeOperandEditPart;
import trnetvisual.diagram.edit.parts.SomeResultEditPart;
import trnetvisual.diagram.edit.parts.TrNetModelEditPart;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class TrnetvisualDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualNodeDescriptor> getSemanticChildren(View view) {
		switch (TrnetvisualVisualIDRegistry.getVisualID(view)) {
		case TrNetModelEditPart.VISUAL_ID:
			return getTrNetModel_1000SemanticChildren(view);
		case CombinatorCombinatorConditionsCompartmentEditPart.VISUAL_ID:
			return getCombinatorCombinatorConditionsCompartment_7001SemanticChildren(view);
		case CombinatorCombinatorActionsCompartmentEditPart.VISUAL_ID:
			return getCombinatorCombinatorActionsCompartment_7002SemanticChildren(view);
		case ExternalExternalConditionsCompartmentEditPart.VISUAL_ID:
			return getExternalExternalConditionsCompartment_7003SemanticChildren(view);
		case ExternalExternalActionsCompartmentEditPart.VISUAL_ID:
			return getExternalExternalActionsCompartment_7004SemanticChildren(view);
		case PatternPatternNodesCompartmentEditPart.VISUAL_ID:
			return getPatternPatternNodesCompartment_7005SemanticChildren(view);
		case MandatoryNodeMandatoryNodeAttributesCompartmentEditPart.VISUAL_ID:
			return getMandatoryNodeMandatoryNodeAttributesCompartment_7006SemanticChildren(view);
		case OptionalNodeOptionalNodeAttributesCompartmentEditPart.VISUAL_ID:
			return getOptionalNodeOptionalNodeAttributesCompartment_7007SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualNodeDescriptor> getTrNetModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TrNetModel modelElement = (TrNetModel) view.getElement();
		LinkedList<TrnetvisualNodeDescriptor> result = new LinkedList<TrnetvisualNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRestrictions().iterator(); it
				.hasNext();) {
			Restriction childElement = (Restriction) it.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExternalAttributeCalculationCallEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCalculations().iterator(); it
				.hasNext();) {
			Calculation childElement = (Calculation) it.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExternalCalculationCallEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOperators().iterator(); it
				.hasNext();) {
			Operator childElement = (Operator) it.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CombinatorEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPatterns().iterator(); it
				.hasNext();) {
			Pattern childElement = (Pattern) it.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PatternEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualNodeDescriptor> getCombinatorCombinatorConditionsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Combinator modelElement = (Combinator) containerView.getElement();
		LinkedList<TrnetvisualNodeDescriptor> result = new LinkedList<TrnetvisualNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConditions().iterator(); it
				.hasNext();) {
			ApplicationCondition childElement = (ApplicationCondition) it
					.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExternalConditionCallEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualNodeDescriptor> getCombinatorCombinatorActionsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Combinator modelElement = (Combinator) containerView.getElement();
		LinkedList<TrnetvisualNodeDescriptor> result = new LinkedList<TrnetvisualNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it
				.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExternalActionCallEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualNodeDescriptor> getExternalExternalConditionsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		External modelElement = (External) containerView.getElement();
		LinkedList<TrnetvisualNodeDescriptor> result = new LinkedList<TrnetvisualNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConditions().iterator(); it
				.hasNext();) {
			ApplicationCondition childElement = (ApplicationCondition) it
					.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExternalConditionCallEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualNodeDescriptor> getExternalExternalActionsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		External modelElement = (External) containerView.getElement();
		LinkedList<TrnetvisualNodeDescriptor> result = new LinkedList<TrnetvisualNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActions().iterator(); it
				.hasNext();) {
			Action childElement = (Action) it.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ExternalActionCallEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualNodeDescriptor> getPatternPatternNodesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Pattern modelElement = (Pattern) containerView.getElement();
		LinkedList<TrnetvisualNodeDescriptor> result = new LinkedList<TrnetvisualNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			NodePattern childElement = (NodePattern) it.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MandatoryNodeEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OptionalNodeEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualNodeDescriptor> getMandatoryNodeMandatoryNodeAttributesCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MandatoryNode modelElement = (MandatoryNode) containerView.getElement();
		LinkedList<TrnetvisualNodeDescriptor> result = new LinkedList<TrnetvisualNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			AttributePattern childElement = (AttributePattern) it.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributePatternEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualNodeDescriptor> getOptionalNodeOptionalNodeAttributesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		OptionalNode modelElement = (OptionalNode) containerView.getElement();
		LinkedList<TrnetvisualNodeDescriptor> result = new LinkedList<TrnetvisualNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			AttributePattern childElement = (AttributePattern) it.next();
			int visualID = TrnetvisualVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AttributePatternEditPart.VISUAL_ID) {
				result.add(new TrnetvisualNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getContainedLinks(View view) {
		switch (TrnetvisualVisualIDRegistry.getVisualID(view)) {
		case TrNetModelEditPart.VISUAL_ID:
			return getTrNetModel_1000ContainedLinks(view);
		case ExternalAttributeCalculationCallEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCall_2001ContainedLinks(view);
		case ExternalCalculationCallEditPart.VISUAL_ID:
			return getExternalCalculationCall_2002ContainedLinks(view);
		case CombinatorEditPart.VISUAL_ID:
			return getCombinator_2003ContainedLinks(view);
		case ExternalEditPart.VISUAL_ID:
			return getExternal_2004ContainedLinks(view);
		case PatternEditPart.VISUAL_ID:
			return getPattern_2005ContainedLinks(view);
		case ExternalConditionCallEditPart.VISUAL_ID:
			return getExternalConditionCall_3001ContainedLinks(view);
		case ExternalActionCallEditPart.VISUAL_ID:
			return getExternalActionCall_3002ContainedLinks(view);
		case MandatoryNodeEditPart.VISUAL_ID:
			return getMandatoryNode_3003ContainedLinks(view);
		case AttributePatternEditPart.VISUAL_ID:
			return getAttributePattern_3004ContainedLinks(view);
		case OptionalNodeEditPart.VISUAL_ID:
			return getOptionalNode_3005ContainedLinks(view);
		case SameEditPart.VISUAL_ID:
			return getSame_4001ContainedLinks(view);
		case KeepEditPart.VISUAL_ID:
			return getKeep_4002ContainedLinks(view);
		case AnyResultEditPart.VISUAL_ID:
			return getAnyResult_4003ContainedLinks(view);
		case SomeResultEditPart.VISUAL_ID:
			return getSomeResult_4004ContainedLinks(view);
		case AnyOperandEditPart.VISUAL_ID:
			return getAnyOperand_4005ContainedLinks(view);
		case SomeOperandEditPart.VISUAL_ID:
			return getSomeOperand_4006ContainedLinks(view);
		case AntiOperandEditPart.VISUAL_ID:
			return getAntiOperand_4007ContainedLinks(view);
		case OptionalOperandEditPart.VISUAL_ID:
			return getOptionalOperand_4008ContainedLinks(view);
		case NextEditPart.VISUAL_ID:
			return getNext_4009ContainedLinks(view);
		case EventuallyEditPart.VISUAL_ID:
			return getEventually_4010ContainedLinks(view);
		case NextDerivedEditPart.VISUAL_ID:
			return getNextDerived_4011ContainedLinks(view);
		case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCallParameter_4012ContainedLinks(view);
		case ExternalConditionCallParameterEditPart.VISUAL_ID:
			return getExternalConditionCallParameter_4013ContainedLinks(view);
		case ExternalActionCallParameterEditPart.VISUAL_ID:
			return getExternalActionCallParameter_4014ContainedLinks(view);
		case ExternalCalculationCallParameterEditPart.VISUAL_ID:
			return getExternalCalculationCallParameter_4015ContainedLinks(view);
		case EdgePatternEditPart.VISUAL_ID:
			return getEdgePattern_4016ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getIncomingLinks(View view) {
		switch (TrnetvisualVisualIDRegistry.getVisualID(view)) {
		case ExternalAttributeCalculationCallEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCall_2001IncomingLinks(view);
		case ExternalCalculationCallEditPart.VISUAL_ID:
			return getExternalCalculationCall_2002IncomingLinks(view);
		case CombinatorEditPart.VISUAL_ID:
			return getCombinator_2003IncomingLinks(view);
		case ExternalEditPart.VISUAL_ID:
			return getExternal_2004IncomingLinks(view);
		case PatternEditPart.VISUAL_ID:
			return getPattern_2005IncomingLinks(view);
		case ExternalConditionCallEditPart.VISUAL_ID:
			return getExternalConditionCall_3001IncomingLinks(view);
		case ExternalActionCallEditPart.VISUAL_ID:
			return getExternalActionCall_3002IncomingLinks(view);
		case MandatoryNodeEditPart.VISUAL_ID:
			return getMandatoryNode_3003IncomingLinks(view);
		case AttributePatternEditPart.VISUAL_ID:
			return getAttributePattern_3004IncomingLinks(view);
		case OptionalNodeEditPart.VISUAL_ID:
			return getOptionalNode_3005IncomingLinks(view);
		case SameEditPart.VISUAL_ID:
			return getSame_4001IncomingLinks(view);
		case KeepEditPart.VISUAL_ID:
			return getKeep_4002IncomingLinks(view);
		case AnyResultEditPart.VISUAL_ID:
			return getAnyResult_4003IncomingLinks(view);
		case SomeResultEditPart.VISUAL_ID:
			return getSomeResult_4004IncomingLinks(view);
		case AnyOperandEditPart.VISUAL_ID:
			return getAnyOperand_4005IncomingLinks(view);
		case SomeOperandEditPart.VISUAL_ID:
			return getSomeOperand_4006IncomingLinks(view);
		case AntiOperandEditPart.VISUAL_ID:
			return getAntiOperand_4007IncomingLinks(view);
		case OptionalOperandEditPart.VISUAL_ID:
			return getOptionalOperand_4008IncomingLinks(view);
		case NextEditPart.VISUAL_ID:
			return getNext_4009IncomingLinks(view);
		case EventuallyEditPart.VISUAL_ID:
			return getEventually_4010IncomingLinks(view);
		case NextDerivedEditPart.VISUAL_ID:
			return getNextDerived_4011IncomingLinks(view);
		case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCallParameter_4012IncomingLinks(view);
		case ExternalConditionCallParameterEditPart.VISUAL_ID:
			return getExternalConditionCallParameter_4013IncomingLinks(view);
		case ExternalActionCallParameterEditPart.VISUAL_ID:
			return getExternalActionCallParameter_4014IncomingLinks(view);
		case ExternalCalculationCallParameterEditPart.VISUAL_ID:
			return getExternalCalculationCallParameter_4015IncomingLinks(view);
		case EdgePatternEditPart.VISUAL_ID:
			return getEdgePattern_4016IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getOutgoingLinks(View view) {
		switch (TrnetvisualVisualIDRegistry.getVisualID(view)) {
		case ExternalAttributeCalculationCallEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCall_2001OutgoingLinks(view);
		case ExternalCalculationCallEditPart.VISUAL_ID:
			return getExternalCalculationCall_2002OutgoingLinks(view);
		case CombinatorEditPart.VISUAL_ID:
			return getCombinator_2003OutgoingLinks(view);
		case ExternalEditPart.VISUAL_ID:
			return getExternal_2004OutgoingLinks(view);
		case PatternEditPart.VISUAL_ID:
			return getPattern_2005OutgoingLinks(view);
		case ExternalConditionCallEditPart.VISUAL_ID:
			return getExternalConditionCall_3001OutgoingLinks(view);
		case ExternalActionCallEditPart.VISUAL_ID:
			return getExternalActionCall_3002OutgoingLinks(view);
		case MandatoryNodeEditPart.VISUAL_ID:
			return getMandatoryNode_3003OutgoingLinks(view);
		case AttributePatternEditPart.VISUAL_ID:
			return getAttributePattern_3004OutgoingLinks(view);
		case OptionalNodeEditPart.VISUAL_ID:
			return getOptionalNode_3005OutgoingLinks(view);
		case SameEditPart.VISUAL_ID:
			return getSame_4001OutgoingLinks(view);
		case KeepEditPart.VISUAL_ID:
			return getKeep_4002OutgoingLinks(view);
		case AnyResultEditPart.VISUAL_ID:
			return getAnyResult_4003OutgoingLinks(view);
		case SomeResultEditPart.VISUAL_ID:
			return getSomeResult_4004OutgoingLinks(view);
		case AnyOperandEditPart.VISUAL_ID:
			return getAnyOperand_4005OutgoingLinks(view);
		case SomeOperandEditPart.VISUAL_ID:
			return getSomeOperand_4006OutgoingLinks(view);
		case AntiOperandEditPart.VISUAL_ID:
			return getAntiOperand_4007OutgoingLinks(view);
		case OptionalOperandEditPart.VISUAL_ID:
			return getOptionalOperand_4008OutgoingLinks(view);
		case NextEditPart.VISUAL_ID:
			return getNext_4009OutgoingLinks(view);
		case EventuallyEditPart.VISUAL_ID:
			return getEventually_4010OutgoingLinks(view);
		case NextDerivedEditPart.VISUAL_ID:
			return getNextDerived_4011OutgoingLinks(view);
		case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCallParameter_4012OutgoingLinks(view);
		case ExternalConditionCallParameterEditPart.VISUAL_ID:
			return getExternalConditionCallParameter_4013OutgoingLinks(view);
		case ExternalActionCallParameterEditPart.VISUAL_ID:
			return getExternalActionCallParameter_4014OutgoingLinks(view);
		case ExternalCalculationCallParameterEditPart.VISUAL_ID:
			return getExternalCalculationCallParameter_4015OutgoingLinks(view);
		case EdgePatternEditPart.VISUAL_ID:
			return getEdgePattern_4016OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getTrNetModel_1000ContainedLinks(
			View view) {
		TrNetModel modelElement = (TrNetModel) view.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Same_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Keep_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AnyResult_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SomeResult_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AnyOperand_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SomeOperand_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AntiOperand_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_OptionalOperand_4008(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Next_4009(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Eventually_4010(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NextDerived_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalAttributeCalculationCall_2001ContainedLinks(
			View view) {
		ExternalAttributeCalculationCall modelElement = (ExternalAttributeCalculationCall) view
				.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ExternalAttributeCalculationCallParameter_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExternalAttributeCalculationCall_Result_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalCalculationCall_2002ContainedLinks(
			View view) {
		ExternalCalculationCall modelElement = (ExternalCalculationCall) view
				.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ExternalCalculationCallParameter_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getCombinator_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternal_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getPattern_2005ContainedLinks(
			View view) {
		Pattern modelElement = (Pattern) view.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EdgePattern_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalConditionCall_3001ContainedLinks(
			View view) {
		ExternalConditionCall modelElement = (ExternalConditionCall) view
				.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ExternalConditionCallParameter_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalActionCall_3002ContainedLinks(
			View view) {
		ExternalActionCall modelElement = (ExternalActionCall) view
				.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ExternalActionCallParameter_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getMandatoryNode_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAttributePattern_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getOptionalNode_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getSame_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getKeep_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAnyResult_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getSomeResult_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAnyOperand_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getSomeOperand_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAntiOperand_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getOptionalOperand_4008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getNext_4009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getEventually_4010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getNextDerived_4011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalAttributeCalculationCallParameter_4012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalConditionCallParameter_4013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalActionCallParameter_4014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalCalculationCallParameter_4015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getEdgePattern_4016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalAttributeCalculationCall_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalCalculationCall_2002IncomingLinks(
			View view) {
		ExternalCalculationCall modelElement = (ExternalCalculationCall) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ExternalAttributeCalculationCallParameter_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalConditionCallParameter_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalActionCallParameter_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalCalculationCallParameter_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getCombinator_2003IncomingLinks(
			View view) {
		Combinator modelElement = (Combinator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AnyOperand_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomeOperand_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AntiOperand_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OptionalOperand_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Next_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Eventually_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NextDerived_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternal_2004IncomingLinks(
			View view) {
		External modelElement = (External) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AnyOperand_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomeOperand_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AntiOperand_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OptionalOperand_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Next_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Eventually_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NextDerived_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getPattern_2005IncomingLinks(
			View view) {
		Pattern modelElement = (Pattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AnyResult_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomeResult_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalConditionCall_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalActionCall_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getMandatoryNode_3003IncomingLinks(
			View view) {
		MandatoryNode modelElement = (MandatoryNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Same_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Keep_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalAttributeCalculationCallParameter_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalConditionCallParameter_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalActionCallParameter_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalCalculationCallParameter_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EdgePattern_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAttributePattern_3004IncomingLinks(
			View view) {
		AttributePattern modelElement = (AttributePattern) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ExternalAttributeCalculationCallParameter_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalConditionCallParameter_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalActionCallParameter_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalCalculationCallParameter_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ExternalAttributeCalculationCall_Result_4017(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getOptionalNode_3005IncomingLinks(
			View view) {
		OptionalNode modelElement = (OptionalNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Same_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Keep_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalAttributeCalculationCallParameter_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalConditionCallParameter_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalActionCallParameter_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalCalculationCallParameter_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EdgePattern_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getSame_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getKeep_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAnyResult_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getSomeResult_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAnyOperand_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getSomeOperand_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAntiOperand_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getOptionalOperand_4008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getNext_4009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getEventually_4010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getNextDerived_4011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalAttributeCalculationCallParameter_4012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalConditionCallParameter_4013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalActionCallParameter_4014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalCalculationCallParameter_4015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getEdgePattern_4016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalAttributeCalculationCall_2001OutgoingLinks(
			View view) {
		ExternalAttributeCalculationCall modelElement = (ExternalAttributeCalculationCall) view
				.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ExternalAttributeCalculationCallParameter_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ExternalAttributeCalculationCall_Result_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalCalculationCall_2002OutgoingLinks(
			View view) {
		ExternalCalculationCall modelElement = (ExternalCalculationCall) view
				.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ExternalCalculationCallParameter_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getCombinator_2003OutgoingLinks(
			View view) {
		Combinator modelElement = (Combinator) view.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AnyResult_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeResult_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Next_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Eventually_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NextDerived_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternal_2004OutgoingLinks(
			View view) {
		External modelElement = (External) view.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AnyResult_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeResult_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Next_4009(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Eventually_4010(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_NextDerived_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getPattern_2005OutgoingLinks(
			View view) {
		Pattern modelElement = (Pattern) view.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AnyOperand_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeOperand_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AntiOperand_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_OptionalOperand_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalConditionCall_3001OutgoingLinks(
			View view) {
		ExternalConditionCall modelElement = (ExternalConditionCall) view
				.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ExternalConditionCallParameter_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalActionCall_3002OutgoingLinks(
			View view) {
		ExternalActionCall modelElement = (ExternalActionCall) view
				.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ExternalActionCallParameter_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getMandatoryNode_3003OutgoingLinks(
			View view) {
		MandatoryNode modelElement = (MandatoryNode) view.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Same_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Keep_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EdgePattern_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAttributePattern_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getOptionalNode_3005OutgoingLinks(
			View view) {
		OptionalNode modelElement = (OptionalNode) view.getElement();
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Same_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Keep_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EdgePattern_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getSame_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getKeep_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAnyResult_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getSomeResult_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAnyOperand_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getSomeOperand_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getAntiOperand_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getOptionalOperand_4008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getNext_4009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getEventually_4010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getNextDerived_4011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalAttributeCalculationCallParameter_4012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalConditionCallParameter_4013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalActionCallParameter_4014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getExternalCalculationCallParameter_4015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TrnetvisualLinkDescriptor> getEdgePattern_4016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_Same_4001(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getRestrictions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Same) {
				continue;
			}
			Same link = (Same) linkObject;
			if (SameEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			NodePattern dst = link.getTarget();
			NodePattern src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.Same_4001, SameEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_Keep_4002(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getRestrictions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Keep) {
				continue;
			}
			Keep link = (Keep) linkObject;
			if (KeepEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			NodePattern dst = link.getTarget();
			NodePattern src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.Keep_4002, KeepEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_AnyResult_4003(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getResults().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AnyResult) {
				continue;
			}
			AnyResult link = (AnyResult) linkObject;
			if (AnyResultEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Pattern dst = link.getPattern();
			Operator src = link.getOperator();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.AnyResult_4003,
					AnyResultEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_SomeResult_4004(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getResults().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SomeResult) {
				continue;
			}
			SomeResult link = (SomeResult) linkObject;
			if (SomeResultEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Pattern dst = link.getPattern();
			Operator src = link.getOperator();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.SomeResult_4004,
					SomeResultEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_AnyOperand_4005(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getOperands().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AnyOperand) {
				continue;
			}
			AnyOperand link = (AnyOperand) linkObject;
			if (AnyOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Pattern src = link.getPattern();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.AnyOperand_4005,
					AnyOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_SomeOperand_4006(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getOperands().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SomeOperand) {
				continue;
			}
			SomeOperand link = (SomeOperand) linkObject;
			if (SomeOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Pattern src = link.getPattern();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.SomeOperand_4006,
					SomeOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_AntiOperand_4007(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getOperands().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AntiOperand) {
				continue;
			}
			AntiOperand link = (AntiOperand) linkObject;
			if (AntiOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Pattern src = link.getPattern();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.AntiOperand_4007,
					AntiOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_OptionalOperand_4008(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getOperands().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OptionalOperand) {
				continue;
			}
			OptionalOperand link = (OptionalOperand) linkObject;
			if (OptionalOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Pattern src = link.getPattern();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.OptionalOperand_4008,
					OptionalOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_Next_4009(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getFlowRules().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Next) {
				continue;
			}
			Next link = (Next) linkObject;
			if (NextEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getTarget();
			Operator src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.Next_4009, NextEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_Eventually_4010(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getFlowRules().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Eventually) {
				continue;
			}
			Eventually link = (Eventually) linkObject;
			if (EventuallyEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getTarget();
			Operator src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.Eventually_4010,
					EventuallyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_NextDerived_4011(
			TrNetModel container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getFlowRules().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NextDerived) {
				continue;
			}
			NextDerived link = (NextDerived) linkObject;
			if (NextDerivedEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getTarget();
			Operator src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.NextDerived_4011,
					NextDerivedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_ExternalAttributeCalculationCallParameter_4012(
			ExternalAttributeCalculationCall container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getParameters().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalAttributeCalculationCallParameter) {
				continue;
			}
			ExternalAttributeCalculationCallParameter link = (ExternalAttributeCalculationCallParameter) linkObject;
			if (ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter dst = link.getParameter();
			ExternalAttributeCalculationCall src = link.getOwner();
			result.add(new TrnetvisualLinkDescriptor(
					src,
					dst,
					link,
					TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012,
					ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_ExternalConditionCallParameter_4013(
			ExternalConditionCall container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getParameters().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalConditionCallParameter) {
				continue;
			}
			ExternalConditionCallParameter link = (ExternalConditionCallParameter) linkObject;
			if (ExternalConditionCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter dst = link.getParameter();
			ExternalConditionCall src = link.getOwner();
			result.add(new TrnetvisualLinkDescriptor(
					src,
					dst,
					link,
					TrnetvisualElementTypes.ExternalConditionCallParameter_4013,
					ExternalConditionCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_ExternalActionCallParameter_4014(
			ExternalActionCall container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getParameters().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalActionCallParameter) {
				continue;
			}
			ExternalActionCallParameter link = (ExternalActionCallParameter) linkObject;
			if (ExternalActionCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter dst = link.getParameter();
			ExternalActionCall src = link.getOwner();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.ExternalActionCallParameter_4014,
					ExternalActionCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_ExternalCalculationCallParameter_4015(
			ExternalCalculationCall container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getParameters().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalCalculationCallParameter) {
				continue;
			}
			ExternalCalculationCallParameter link = (ExternalCalculationCallParameter) linkObject;
			if (ExternalCalculationCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter dst = link.getParameter();
			ExternalCalculationCall src = link.getOwner();
			result.add(new TrnetvisualLinkDescriptor(
					src,
					dst,
					link,
					TrnetvisualElementTypes.ExternalCalculationCallParameter_4015,
					ExternalCalculationCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getContainedTypeModelFacetLinks_EdgePattern_4016(
			Pattern container) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EdgePattern) {
				continue;
			}
			EdgePattern link = (EdgePattern) linkObject;
			if (EdgePatternEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			NodePattern dst = link.getTarget();
			NodePattern src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.EdgePattern_4016,
					EdgePatternEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_Same_4001(
			NodePattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getSame_Target()
					|| false == setting.getEObject() instanceof Same) {
				continue;
			}
			Same link = (Same) setting.getEObject();
			if (SameEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			NodePattern src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.Same_4001, SameEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_Keep_4002(
			NodePattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getKeep_Target()
					|| false == setting.getEObject() instanceof Keep) {
				continue;
			}
			Keep link = (Keep) setting.getEObject();
			if (KeepEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			NodePattern src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.Keep_4002, KeepEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_AnyResult_4003(
			Pattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getResult_Pattern()
					|| false == setting.getEObject() instanceof AnyResult) {
				continue;
			}
			AnyResult link = (AnyResult) setting.getEObject();
			if (AnyResultEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator src = link.getOperator();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.AnyResult_4003,
					AnyResultEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_SomeResult_4004(
			Pattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getResult_Pattern()
					|| false == setting.getEObject() instanceof SomeResult) {
				continue;
			}
			SomeResult link = (SomeResult) setting.getEObject();
			if (SomeResultEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator src = link.getOperator();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.SomeResult_4004,
					SomeResultEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_AnyOperand_4005(
			Operator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getOperand_Operator()
					|| false == setting.getEObject() instanceof AnyOperand) {
				continue;
			}
			AnyOperand link = (AnyOperand) setting.getEObject();
			if (AnyOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Pattern src = link.getPattern();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.AnyOperand_4005,
					AnyOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_SomeOperand_4006(
			Operator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getOperand_Operator()
					|| false == setting.getEObject() instanceof SomeOperand) {
				continue;
			}
			SomeOperand link = (SomeOperand) setting.getEObject();
			if (SomeOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Pattern src = link.getPattern();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.SomeOperand_4006,
					SomeOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_AntiOperand_4007(
			Operator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getOperand_Operator()
					|| false == setting.getEObject() instanceof AntiOperand) {
				continue;
			}
			AntiOperand link = (AntiOperand) setting.getEObject();
			if (AntiOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Pattern src = link.getPattern();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.AntiOperand_4007,
					AntiOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_OptionalOperand_4008(
			Operator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getOperand_Operator()
					|| false == setting.getEObject() instanceof OptionalOperand) {
				continue;
			}
			OptionalOperand link = (OptionalOperand) setting.getEObject();
			if (OptionalOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Pattern src = link.getPattern();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.OptionalOperand_4008,
					OptionalOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_Next_4009(
			Operator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getFlowRule_Target()
					|| false == setting.getEObject() instanceof Next) {
				continue;
			}
			Next link = (Next) setting.getEObject();
			if (NextEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.Next_4009, NextEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_Eventually_4010(
			Operator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getFlowRule_Target()
					|| false == setting.getEObject() instanceof Eventually) {
				continue;
			}
			Eventually link = (Eventually) setting.getEObject();
			if (EventuallyEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.Eventually_4010,
					EventuallyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_NextDerived_4011(
			Operator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getFlowRule_Target()
					|| false == setting.getEObject() instanceof NextDerived) {
				continue;
			}
			NextDerived link = (NextDerived) setting.getEObject();
			if (NextDerivedEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.NextDerived_4011,
					NextDerivedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_ExternalAttributeCalculationCallParameter_4012(
			Parameter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getExternalAttributeCalculationCallParameter_Parameter()
					|| false == setting.getEObject() instanceof ExternalAttributeCalculationCallParameter) {
				continue;
			}
			ExternalAttributeCalculationCallParameter link = (ExternalAttributeCalculationCallParameter) setting
					.getEObject();
			if (ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExternalAttributeCalculationCall src = link.getOwner();
			result.add(new TrnetvisualLinkDescriptor(
					src,
					target,
					link,
					TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012,
					ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_ExternalConditionCallParameter_4013(
			Parameter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getExternalConditionCallParameter_Parameter()
					|| false == setting.getEObject() instanceof ExternalConditionCallParameter) {
				continue;
			}
			ExternalConditionCallParameter link = (ExternalConditionCallParameter) setting
					.getEObject();
			if (ExternalConditionCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExternalConditionCall src = link.getOwner();
			result.add(new TrnetvisualLinkDescriptor(
					src,
					target,
					link,
					TrnetvisualElementTypes.ExternalConditionCallParameter_4013,
					ExternalConditionCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_ExternalActionCallParameter_4014(
			Parameter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getExternalActionCallParameter_Parameter()
					|| false == setting.getEObject() instanceof ExternalActionCallParameter) {
				continue;
			}
			ExternalActionCallParameter link = (ExternalActionCallParameter) setting
					.getEObject();
			if (ExternalActionCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExternalActionCall src = link.getOwner();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.ExternalActionCallParameter_4014,
					ExternalActionCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_ExternalCalculationCallParameter_4015(
			Parameter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getExternalCalculationCallParameter_Parameter()
					|| false == setting.getEObject() instanceof ExternalCalculationCallParameter) {
				continue;
			}
			ExternalCalculationCallParameter link = (ExternalCalculationCallParameter) setting
					.getEObject();
			if (ExternalCalculationCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExternalCalculationCall src = link.getOwner();
			result.add(new TrnetvisualLinkDescriptor(
					src,
					target,
					link,
					TrnetvisualElementTypes.ExternalCalculationCallParameter_4015,
					ExternalCalculationCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingTypeModelFacetLinks_EdgePattern_4016(
			NodePattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != TrnetvisualPackage.eINSTANCE
					.getEdgePattern_Target()
					|| false == setting.getEObject() instanceof EdgePattern) {
				continue;
			}
			EdgePattern link = (EdgePattern) setting.getEObject();
			if (EdgePatternEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			NodePattern src = link.getSource();
			result.add(new TrnetvisualLinkDescriptor(src, target, link,
					TrnetvisualElementTypes.EdgePattern_4016,
					EdgePatternEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getIncomingFeatureModelFacetLinks_ExternalAttributeCalculationCall_Result_4017(
			AttributePattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TrnetvisualPackage.eINSTANCE
					.getExternalAttributeCalculationCall_Result()) {
				result.add(new TrnetvisualLinkDescriptor(
						setting.getEObject(),
						target,
						TrnetvisualElementTypes.ExternalAttributeCalculationCallResult_4017,
						ExternalAttributeCalculationCallResultEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_Same_4001(
			NodePattern source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getRestrictions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Same) {
				continue;
			}
			Same link = (Same) linkObject;
			if (SameEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			NodePattern dst = link.getTarget();
			NodePattern src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.Same_4001, SameEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_Keep_4002(
			NodePattern source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getRestrictions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Keep) {
				continue;
			}
			Keep link = (Keep) linkObject;
			if (KeepEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			NodePattern dst = link.getTarget();
			NodePattern src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.Keep_4002, KeepEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_AnyResult_4003(
			Operator source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getResults().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AnyResult) {
				continue;
			}
			AnyResult link = (AnyResult) linkObject;
			if (AnyResultEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Pattern dst = link.getPattern();
			Operator src = link.getOperator();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.AnyResult_4003,
					AnyResultEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_SomeResult_4004(
			Operator source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getResults().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SomeResult) {
				continue;
			}
			SomeResult link = (SomeResult) linkObject;
			if (SomeResultEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Pattern dst = link.getPattern();
			Operator src = link.getOperator();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.SomeResult_4004,
					SomeResultEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_AnyOperand_4005(
			Pattern source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getOperands().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AnyOperand) {
				continue;
			}
			AnyOperand link = (AnyOperand) linkObject;
			if (AnyOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Pattern src = link.getPattern();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.AnyOperand_4005,
					AnyOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_SomeOperand_4006(
			Pattern source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getOperands().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SomeOperand) {
				continue;
			}
			SomeOperand link = (SomeOperand) linkObject;
			if (SomeOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Pattern src = link.getPattern();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.SomeOperand_4006,
					SomeOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_AntiOperand_4007(
			Pattern source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getOperands().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AntiOperand) {
				continue;
			}
			AntiOperand link = (AntiOperand) linkObject;
			if (AntiOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Pattern src = link.getPattern();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.AntiOperand_4007,
					AntiOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_OptionalOperand_4008(
			Pattern source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getOperands().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof OptionalOperand) {
				continue;
			}
			OptionalOperand link = (OptionalOperand) linkObject;
			if (OptionalOperandEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getOperator();
			Pattern src = link.getPattern();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.OptionalOperand_4008,
					OptionalOperandEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_Next_4009(
			Operator source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getFlowRules().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Next) {
				continue;
			}
			Next link = (Next) linkObject;
			if (NextEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getTarget();
			Operator src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.Next_4009, NextEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_Eventually_4010(
			Operator source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getFlowRules().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Eventually) {
				continue;
			}
			Eventually link = (Eventually) linkObject;
			if (EventuallyEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getTarget();
			Operator src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.Eventually_4010,
					EventuallyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_NextDerived_4011(
			Operator source) {
		TrNetModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof TrNetModel) {
				container = (TrNetModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getFlowRules().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NextDerived) {
				continue;
			}
			NextDerived link = (NextDerived) linkObject;
			if (NextDerivedEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Operator dst = link.getTarget();
			Operator src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.NextDerived_4011,
					NextDerivedEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_ExternalAttributeCalculationCallParameter_4012(
			ExternalAttributeCalculationCall source) {
		ExternalAttributeCalculationCall container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ExternalAttributeCalculationCall) {
				container = (ExternalAttributeCalculationCall) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getParameters().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalAttributeCalculationCallParameter) {
				continue;
			}
			ExternalAttributeCalculationCallParameter link = (ExternalAttributeCalculationCallParameter) linkObject;
			if (ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter dst = link.getParameter();
			ExternalAttributeCalculationCall src = link.getOwner();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(
					src,
					dst,
					link,
					TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012,
					ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_ExternalConditionCallParameter_4013(
			ExternalConditionCall source) {
		ExternalConditionCall container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ExternalConditionCall) {
				container = (ExternalConditionCall) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getParameters().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalConditionCallParameter) {
				continue;
			}
			ExternalConditionCallParameter link = (ExternalConditionCallParameter) linkObject;
			if (ExternalConditionCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter dst = link.getParameter();
			ExternalConditionCall src = link.getOwner();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(
					src,
					dst,
					link,
					TrnetvisualElementTypes.ExternalConditionCallParameter_4013,
					ExternalConditionCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_ExternalActionCallParameter_4014(
			ExternalActionCall source) {
		ExternalActionCall container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ExternalActionCall) {
				container = (ExternalActionCall) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getParameters().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalActionCallParameter) {
				continue;
			}
			ExternalActionCallParameter link = (ExternalActionCallParameter) linkObject;
			if (ExternalActionCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter dst = link.getParameter();
			ExternalActionCall src = link.getOwner();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.ExternalActionCallParameter_4014,
					ExternalActionCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_ExternalCalculationCallParameter_4015(
			ExternalCalculationCall source) {
		ExternalCalculationCall container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ExternalCalculationCall) {
				container = (ExternalCalculationCall) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getParameters().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalCalculationCallParameter) {
				continue;
			}
			ExternalCalculationCallParameter link = (ExternalCalculationCallParameter) linkObject;
			if (ExternalCalculationCallParameterEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Parameter dst = link.getParameter();
			ExternalCalculationCall src = link.getOwner();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(
					src,
					dst,
					link,
					TrnetvisualElementTypes.ExternalCalculationCallParameter_4015,
					ExternalCalculationCallParameterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingTypeModelFacetLinks_EdgePattern_4016(
			NodePattern source) {
		Pattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Pattern) {
				container = (Pattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EdgePattern) {
				continue;
			}
			EdgePattern link = (EdgePattern) linkObject;
			if (EdgePatternEditPart.VISUAL_ID != TrnetvisualVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			NodePattern dst = link.getTarget();
			NodePattern src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TrnetvisualLinkDescriptor(src, dst, link,
					TrnetvisualElementTypes.EdgePattern_4016,
					EdgePatternEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TrnetvisualLinkDescriptor> getOutgoingFeatureModelFacetLinks_ExternalAttributeCalculationCall_Result_4017(
			ExternalAttributeCalculationCall source) {
		LinkedList<TrnetvisualLinkDescriptor> result = new LinkedList<TrnetvisualLinkDescriptor>();
		AttributePattern destination = source.getResult();
		if (destination == null) {
			return result;
		}
		result.add(new TrnetvisualLinkDescriptor(
				source,
				destination,
				TrnetvisualElementTypes.ExternalAttributeCalculationCallResult_4017,
				ExternalAttributeCalculationCallResultEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<TrnetvisualNodeDescriptor> getSemanticChildren(View view) {
			return TrnetvisualDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TrnetvisualLinkDescriptor> getContainedLinks(View view) {
			return TrnetvisualDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TrnetvisualLinkDescriptor> getIncomingLinks(View view) {
			return TrnetvisualDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<TrnetvisualLinkDescriptor> getOutgoingLinks(View view) {
			return TrnetvisualDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
