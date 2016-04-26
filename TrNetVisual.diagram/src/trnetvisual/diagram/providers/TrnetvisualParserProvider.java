/*
 * 
 */
package trnetvisual.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import trnetvisual.TrnetvisualPackage;
import trnetvisual.diagram.edit.parts.AttributePatternNameEditPart;
import trnetvisual.diagram.edit.parts.EdgePatternNameEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalActionCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalAttributeCalculationCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalCalculationCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallIdEditPart;
import trnetvisual.diagram.edit.parts.ExternalConditionCallParameterIndexEditPart;
import trnetvisual.diagram.edit.parts.MandatoryNodeNameEditPart;
import trnetvisual.diagram.edit.parts.OptionalNodeNameEditPart;
import trnetvisual.diagram.parsers.MessageFormatParser;
import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;

/**
 * @generated
 */
public class TrnetvisualParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser externalAttributeCalculationCallId_5001Parser;

	/**
	 * @generated
	 */
	private IParser getExternalAttributeCalculationCallId_5001Parser() {
		if (externalAttributeCalculationCallId_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getExternalAttributeCalculationCall_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalAttributeCalculationCallId_5001Parser = parser;
		}
		return externalAttributeCalculationCallId_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalCalculationCallId_5002Parser;

	/**
	 * @generated
	 */
	private IParser getExternalCalculationCallId_5002Parser() {
		if (externalCalculationCallId_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getExternalCalculationCall_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalCalculationCallId_5002Parser = parser;
		}
		return externalCalculationCallId_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalConditionCallId_5003Parser;

	/**
	 * @generated
	 */
	private IParser getExternalConditionCallId_5003Parser() {
		if (externalConditionCallId_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getExternalConditionCall_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalConditionCallId_5003Parser = parser;
		}
		return externalConditionCallId_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalActionCallId_5004Parser;

	/**
	 * @generated
	 */
	private IParser getExternalActionCallId_5004Parser() {
		if (externalActionCallId_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getExternalActionCall_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalActionCallId_5004Parser = parser;
		}
		return externalActionCallId_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser mandatoryNodeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getMandatoryNodeName_5006Parser() {
		if (mandatoryNodeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getNodePattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mandatoryNodeName_5006Parser = parser;
		}
		return mandatoryNodeName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributePatternName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAttributePatternName_5005Parser() {
		if (attributePatternName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getAttributePattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributePatternName_5005Parser = parser;
		}
		return attributePatternName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser optionalNodeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getOptionalNodeName_5007Parser() {
		if (optionalNodeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getNodePattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			optionalNodeName_5007Parser = parser;
		}
		return optionalNodeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalAttributeCalculationCallParameterIndex_6001Parser;

	/**
	 * @generated
	 */
	private IParser getExternalAttributeCalculationCallParameterIndex_6001Parser() {
		if (externalAttributeCalculationCallParameterIndex_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getParameterRef_Index() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalAttributeCalculationCallParameterIndex_6001Parser = parser;
		}
		return externalAttributeCalculationCallParameterIndex_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalConditionCallParameterIndex_6002Parser;

	/**
	 * @generated
	 */
	private IParser getExternalConditionCallParameterIndex_6002Parser() {
		if (externalConditionCallParameterIndex_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getParameterRef_Index() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalConditionCallParameterIndex_6002Parser = parser;
		}
		return externalConditionCallParameterIndex_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalActionCallParameterIndex_6003Parser;

	/**
	 * @generated
	 */
	private IParser getExternalActionCallParameterIndex_6003Parser() {
		if (externalActionCallParameterIndex_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getParameterRef_Index() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalActionCallParameterIndex_6003Parser = parser;
		}
		return externalActionCallParameterIndex_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalCalculationCallParameterIndex_6004Parser;

	/**
	 * @generated
	 */
	private IParser getExternalCalculationCallParameterIndex_6004Parser() {
		if (externalCalculationCallParameterIndex_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getParameterRef_Index() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalCalculationCallParameterIndex_6004Parser = parser;
		}
		return externalCalculationCallParameterIndex_6004Parser;
	}

	/**
	 * @generated
	 */
	private IParser edgePatternName_6005Parser;

	/**
	 * @generated
	 */
	private IParser getEdgePatternName_6005Parser() {
		if (edgePatternName_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { TrnetvisualPackage.eINSTANCE
					.getEdgePattern_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			edgePatternName_6005Parser = parser;
		}
		return edgePatternName_6005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ExternalAttributeCalculationCallIdEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCallId_5001Parser();
		case ExternalCalculationCallIdEditPart.VISUAL_ID:
			return getExternalCalculationCallId_5002Parser();
		case ExternalConditionCallIdEditPart.VISUAL_ID:
			return getExternalConditionCallId_5003Parser();
		case ExternalActionCallIdEditPart.VISUAL_ID:
			return getExternalActionCallId_5004Parser();
		case MandatoryNodeNameEditPart.VISUAL_ID:
			return getMandatoryNodeName_5006Parser();
		case AttributePatternNameEditPart.VISUAL_ID:
			return getAttributePatternName_5005Parser();
		case OptionalNodeNameEditPart.VISUAL_ID:
			return getOptionalNodeName_5007Parser();
		case ExternalAttributeCalculationCallParameterIndexEditPart.VISUAL_ID:
			return getExternalAttributeCalculationCallParameterIndex_6001Parser();
		case ExternalConditionCallParameterIndexEditPart.VISUAL_ID:
			return getExternalConditionCallParameterIndex_6002Parser();
		case ExternalActionCallParameterIndexEditPart.VISUAL_ID:
			return getExternalActionCallParameterIndex_6003Parser();
		case ExternalCalculationCallParameterIndexEditPart.VISUAL_ID:
			return getExternalCalculationCallParameterIndex_6004Parser();
		case EdgePatternNameEditPart.VISUAL_ID:
			return getEdgePatternName_6005Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(TrnetvisualVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TrnetvisualVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TrnetvisualElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
