/*
 * 
 */
package trnetvisual.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import trnetvisual.TrnetvisualPackage;
import trnetvisual.diagram.edit.parts.AntiOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyOperandEditPart;
import trnetvisual.diagram.edit.parts.AnyResultEditPart;
import trnetvisual.diagram.edit.parts.AttributePatternEditPart;
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
import trnetvisual.diagram.edit.parts.KeepEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeEditPart;
import trnetvisual.diagram.edit.parts.NextDerivedEditPart;
import trnetvisual.diagram.edit.parts.NextEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeEditPart;
import trnetvisual.diagram.edit.parts.OptionalOperandEditPart;
import trnetvisual.diagram.edit.parts.PatternEditPart;
import trnetvisual.diagram.edit.parts.SameEditPart;
import trnetvisual.diagram.edit.parts.SomeOperandEditPart;
import trnetvisual.diagram.edit.parts.SomeResultEditPart;
import trnetvisual.diagram.edit.parts.TrNetModelEditPart;
import trnetvisual.diagram.part.TrnetvisualDiagramEditorPlugin;

/**
 * @generated
 */
public class TrnetvisualElementTypes {

	/**
	 * @generated
	 */
	private TrnetvisualElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType TrNetModel_1000 = getElementType("TrNetVisual.diagram.TrNetModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalAttributeCalculationCall_2001 = getElementType("TrNetVisual.diagram.ExternalAttributeCalculationCall_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalCalculationCall_2002 = getElementType("TrNetVisual.diagram.ExternalCalculationCall_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Combinator_2003 = getElementType("TrNetVisual.diagram.Combinator_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType External_2004 = getElementType("TrNetVisual.diagram.External_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pattern_2005 = getElementType("TrNetVisual.diagram.Pattern_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalConditionCall_3001 = getElementType("TrNetVisual.diagram.ExternalConditionCall_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalActionCall_3002 = getElementType("TrNetVisual.diagram.ExternalActionCall_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MandatoryNode_3003 = getElementType("TrNetVisual.diagram.MandatoryNode_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributePattern_3004 = getElementType("TrNetVisual.diagram.AttributePattern_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OptionalNode_3005 = getElementType("TrNetVisual.diagram.OptionalNode_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Same_4001 = getElementType("TrNetVisual.diagram.Same_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Keep_4002 = getElementType("TrNetVisual.diagram.Keep_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyResult_4003 = getElementType("TrNetVisual.diagram.AnyResult_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SomeResult_4004 = getElementType("TrNetVisual.diagram.SomeResult_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnyOperand_4005 = getElementType("TrNetVisual.diagram.AnyOperand_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SomeOperand_4006 = getElementType("TrNetVisual.diagram.SomeOperand_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AntiOperand_4007 = getElementType("TrNetVisual.diagram.AntiOperand_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OptionalOperand_4008 = getElementType("TrNetVisual.diagram.OptionalOperand_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Next_4009 = getElementType("TrNetVisual.diagram.Next_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Eventually_4010 = getElementType("TrNetVisual.diagram.Eventually_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NextDerived_4011 = getElementType("TrNetVisual.diagram.NextDerived_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalAttributeCalculationCallParameter_4012 = getElementType("TrNetVisual.diagram.ExternalAttributeCalculationCallParameter_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalConditionCallParameter_4013 = getElementType("TrNetVisual.diagram.ExternalConditionCallParameter_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalActionCallParameter_4014 = getElementType("TrNetVisual.diagram.ExternalActionCallParameter_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalCalculationCallParameter_4015 = getElementType("TrNetVisual.diagram.ExternalCalculationCallParameter_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EdgePattern_4016 = getElementType("TrNetVisual.diagram.EdgePattern_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalAttributeCalculationCallResult_4017 = getElementType("TrNetVisual.diagram.ExternalAttributeCalculationCallResult_4017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return TrnetvisualDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(TrNetModel_1000,
					TrnetvisualPackage.eINSTANCE.getTrNetModel());

			elements.put(ExternalAttributeCalculationCall_2001,
					TrnetvisualPackage.eINSTANCE
							.getExternalAttributeCalculationCall());

			elements.put(ExternalCalculationCall_2002,
					TrnetvisualPackage.eINSTANCE.getExternalCalculationCall());

			elements.put(Combinator_2003,
					TrnetvisualPackage.eINSTANCE.getCombinator());

			elements.put(External_2004,
					TrnetvisualPackage.eINSTANCE.getExternal());

			elements.put(Pattern_2005,
					TrnetvisualPackage.eINSTANCE.getPattern());

			elements.put(ExternalConditionCall_3001,
					TrnetvisualPackage.eINSTANCE.getExternalConditionCall());

			elements.put(ExternalActionCall_3002,
					TrnetvisualPackage.eINSTANCE.getExternalActionCall());

			elements.put(MandatoryNode_3003,
					TrnetvisualPackage.eINSTANCE.getMandatoryNode());

			elements.put(AttributePattern_3004,
					TrnetvisualPackage.eINSTANCE.getAttributePattern());

			elements.put(OptionalNode_3005,
					TrnetvisualPackage.eINSTANCE.getOptionalNode());

			elements.put(Same_4001, TrnetvisualPackage.eINSTANCE.getSame());

			elements.put(Keep_4002, TrnetvisualPackage.eINSTANCE.getKeep());

			elements.put(AnyResult_4003,
					TrnetvisualPackage.eINSTANCE.getAnyResult());

			elements.put(SomeResult_4004,
					TrnetvisualPackage.eINSTANCE.getSomeResult());

			elements.put(AnyOperand_4005,
					TrnetvisualPackage.eINSTANCE.getAnyOperand());

			elements.put(SomeOperand_4006,
					TrnetvisualPackage.eINSTANCE.getSomeOperand());

			elements.put(AntiOperand_4007,
					TrnetvisualPackage.eINSTANCE.getAntiOperand());

			elements.put(OptionalOperand_4008,
					TrnetvisualPackage.eINSTANCE.getOptionalOperand());

			elements.put(Next_4009, TrnetvisualPackage.eINSTANCE.getNext());

			elements.put(Eventually_4010,
					TrnetvisualPackage.eINSTANCE.getEventually());

			elements.put(NextDerived_4011,
					TrnetvisualPackage.eINSTANCE.getNextDerived());

			elements.put(ExternalAttributeCalculationCallParameter_4012,
					TrnetvisualPackage.eINSTANCE
							.getExternalAttributeCalculationCallParameter());

			elements.put(ExternalConditionCallParameter_4013,
					TrnetvisualPackage.eINSTANCE
							.getExternalConditionCallParameter());

			elements.put(ExternalActionCallParameter_4014,
					TrnetvisualPackage.eINSTANCE
							.getExternalActionCallParameter());

			elements.put(ExternalCalculationCallParameter_4015,
					TrnetvisualPackage.eINSTANCE
							.getExternalCalculationCallParameter());

			elements.put(EdgePattern_4016,
					TrnetvisualPackage.eINSTANCE.getEdgePattern());

			elements.put(ExternalAttributeCalculationCallResult_4017,
					TrnetvisualPackage.eINSTANCE
							.getExternalAttributeCalculationCall_Result());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(TrNetModel_1000);
			KNOWN_ELEMENT_TYPES.add(ExternalAttributeCalculationCall_2001);
			KNOWN_ELEMENT_TYPES.add(ExternalCalculationCall_2002);
			KNOWN_ELEMENT_TYPES.add(Combinator_2003);
			KNOWN_ELEMENT_TYPES.add(External_2004);
			KNOWN_ELEMENT_TYPES.add(Pattern_2005);
			KNOWN_ELEMENT_TYPES.add(ExternalConditionCall_3001);
			KNOWN_ELEMENT_TYPES.add(ExternalActionCall_3002);
			KNOWN_ELEMENT_TYPES.add(MandatoryNode_3003);
			KNOWN_ELEMENT_TYPES.add(AttributePattern_3004);
			KNOWN_ELEMENT_TYPES.add(OptionalNode_3005);
			KNOWN_ELEMENT_TYPES.add(Same_4001);
			KNOWN_ELEMENT_TYPES.add(Keep_4002);
			KNOWN_ELEMENT_TYPES.add(AnyResult_4003);
			KNOWN_ELEMENT_TYPES.add(SomeResult_4004);
			KNOWN_ELEMENT_TYPES.add(AnyOperand_4005);
			KNOWN_ELEMENT_TYPES.add(SomeOperand_4006);
			KNOWN_ELEMENT_TYPES.add(AntiOperand_4007);
			KNOWN_ELEMENT_TYPES.add(OptionalOperand_4008);
			KNOWN_ELEMENT_TYPES.add(Next_4009);
			KNOWN_ELEMENT_TYPES.add(Eventually_4010);
			KNOWN_ELEMENT_TYPES.add(NextDerived_4011);
			KNOWN_ELEMENT_TYPES
					.add(ExternalAttributeCalculationCallParameter_4012);
			KNOWN_ELEMENT_TYPES.add(ExternalConditionCallParameter_4013);
			KNOWN_ELEMENT_TYPES.add(ExternalActionCallParameter_4014);
			KNOWN_ELEMENT_TYPES.add(ExternalCalculationCallParameter_4015);
			KNOWN_ELEMENT_TYPES.add(EdgePattern_4016);
			KNOWN_ELEMENT_TYPES
					.add(ExternalAttributeCalculationCallResult_4017);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TrNetModelEditPart.VISUAL_ID:
			return TrNetModel_1000;
		case ExternalAttributeCalculationCallEditPart.VISUAL_ID:
			return ExternalAttributeCalculationCall_2001;
		case ExternalCalculationCallEditPart.VISUAL_ID:
			return ExternalCalculationCall_2002;
		case CombinatorEditPart.VISUAL_ID:
			return Combinator_2003;
		case ExternalEditPart.VISUAL_ID:
			return External_2004;
		case PatternEditPart.VISUAL_ID:
			return Pattern_2005;
		case ExternalConditionCallEditPart.VISUAL_ID:
			return ExternalConditionCall_3001;
		case ExternalActionCallEditPart.VISUAL_ID:
			return ExternalActionCall_3002;
		case MandatoryNodeEditPart.VISUAL_ID:
			return MandatoryNode_3003;
		case AttributePatternEditPart.VISUAL_ID:
			return AttributePattern_3004;
		case OptionalNodeEditPart.VISUAL_ID:
			return OptionalNode_3005;
		case SameEditPart.VISUAL_ID:
			return Same_4001;
		case KeepEditPart.VISUAL_ID:
			return Keep_4002;
		case AnyResultEditPart.VISUAL_ID:
			return AnyResult_4003;
		case SomeResultEditPart.VISUAL_ID:
			return SomeResult_4004;
		case AnyOperandEditPart.VISUAL_ID:
			return AnyOperand_4005;
		case SomeOperandEditPart.VISUAL_ID:
			return SomeOperand_4006;
		case AntiOperandEditPart.VISUAL_ID:
			return AntiOperand_4007;
		case OptionalOperandEditPart.VISUAL_ID:
			return OptionalOperand_4008;
		case NextEditPart.VISUAL_ID:
			return Next_4009;
		case EventuallyEditPart.VISUAL_ID:
			return Eventually_4010;
		case NextDerivedEditPart.VISUAL_ID:
			return NextDerived_4011;
		case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID:
			return ExternalAttributeCalculationCallParameter_4012;
		case ExternalConditionCallParameterEditPart.VISUAL_ID:
			return ExternalConditionCallParameter_4013;
		case ExternalActionCallParameterEditPart.VISUAL_ID:
			return ExternalActionCallParameter_4014;
		case ExternalCalculationCallParameterEditPart.VISUAL_ID:
			return ExternalCalculationCallParameter_4015;
		case EdgePatternEditPart.VISUAL_ID:
			return EdgePattern_4016;
		case ExternalAttributeCalculationCallResultEditPart.VISUAL_ID:
			return ExternalAttributeCalculationCallResult_4017;
		}
		return null;
	}

}
