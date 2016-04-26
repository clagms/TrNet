/*
 * 
 */
package trnetvisual.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import trnetvisual.diagram.compile.CompileTool;
import trnetvisual.diagram.generateids.GenerateIdsTool;
import trnetvisual.diagram.generateoperandsindexes.GenerateOperandIndexesTool;
import trnetvisual.diagram.generatesizes.GenerateExpectedSizesTool;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class TrnetvisualPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
		paletteRoot.add(createActions3Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttributePattern1CreationTool());
		paletteContainer.add(createCombineOperator2CreationTool());
		paletteContainer.add(createExternal3CreationTool());
		paletteContainer.add(createExternalActionCall4CreationTool());
		paletteContainer
				.add(createExternalAttributeCalculationCall5CreationTool());
		paletteContainer.add(createExternalCalculationCall6CreationTool());
		paletteContainer.add(createExternalConditionCall7CreationTool());
		paletteContainer.add(createNode8CreationTool());
		paletteContainer.add(createOptionalNode9CreationTool());
		paletteContainer.add(createPattern10CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAllOperand1CreationTool());
		paletteContainer.add(createAllResult2CreationTool());
		paletteContainer.add(createAntiOperand3CreationTool());
		paletteContainer.add(createEdge4CreationTool());
		paletteContainer.add(createEventually5CreationTool());
		paletteContainer.add(createExternalActionCallParameter6CreationTool());
		paletteContainer
				.add(createExternalAttributeCalculationCallParameter7CreationTool());
		paletteContainer
				.add(createExternalCalculationCallParameter8CreationTool());
		paletteContainer
				.add(createExternalConditionCallParameter9CreationTool());
		paletteContainer.add(createKeepNode10CreationTool());
		paletteContainer.add(createNext11CreationTool());
		paletteContainer.add(createNextDerived12CreationTool());
		paletteContainer.add(createOptionalOperand13CreationTool());
		paletteContainer.add(createResult14CreationTool());
		paletteContainer.add(createSameNode15CreationTool());
		paletteContainer.add(createSomeOperand16CreationTool());
		paletteContainer.add(createSomeResult17CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Actions" palette tool group
	 * @generated
	 */
	private PaletteContainer createActions3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Actions3Group_title);
		paletteContainer.setId("createActions3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Actions3Group_desc);
		paletteContainer.add(createGenerateIDs1CreationTool());
		paletteContainer.add(createGenerateOperandIndexes2CreationTool());
		paletteContainer.add(createGenerateExpectedSizes3CreationTool());
		paletteContainer.add(createCompile4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttributePattern1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AttributePattern1CreationTool_title,
				Messages.AttributePattern1CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.AttributePattern_3004));
		entry.setId("createAttributePattern1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.AttributePattern_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCombineOperator2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CombineOperator2CreationTool_title,
				Messages.CombineOperator2CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.Combinator_2003));
		entry.setId("createCombineOperator2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.Combinator_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternal3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.External3CreationTool_title,
				Messages.External3CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.External_2004));
		entry.setId("createExternal3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.External_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalActionCall4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExternalActionCall4CreationTool_title,
				Messages.ExternalActionCall4CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.ExternalActionCall_3002));
		entry.setId("createExternalActionCall4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.ExternalActionCall_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalAttributeCalculationCall5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExternalAttributeCalculationCall5CreationTool_title,
				Messages.ExternalAttributeCalculationCall5CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.ExternalAttributeCalculationCall_2001));
		entry.setId("createExternalAttributeCalculationCall5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.ExternalAttributeCalculationCall_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalCalculationCall6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExternalCalculationCall6CreationTool_title,
				Messages.ExternalCalculationCall6CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.ExternalCalculationCall_2002));
		entry.setId("createExternalCalculationCall6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.ExternalCalculationCall_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalConditionCall7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExternalConditionCall7CreationTool_title,
				Messages.ExternalConditionCall7CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.ExternalConditionCall_3001));
		entry.setId("createExternalConditionCall7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.ExternalConditionCall_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Node8CreationTool_title,
				Messages.Node8CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.MandatoryNode_3003));
		entry.setId("createNode8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.MandatoryNode_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOptionalNode9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OptionalNode9CreationTool_title,
				Messages.OptionalNode9CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.OptionalNode_3005));
		entry.setId("createOptionalNode9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.OptionalNode_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPattern10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Pattern10CreationTool_title,
				Messages.Pattern10CreationTool_desc,
				Collections.singletonList(TrnetvisualElementTypes.Pattern_2005));
		entry.setId("createPattern10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.Pattern_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAllOperand1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AllOperand1CreationTool_title,
				Messages.AllOperand1CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.AnyOperand_4005));
		entry.setId("createAllOperand1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.AnyOperand_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAllResult2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AllResult2CreationTool_title,
				Messages.AllResult2CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.AnyResult_4003));
		entry.setId("createAllResult2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.AnyResult_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAntiOperand3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AntiOperand3CreationTool_title,
				Messages.AntiOperand3CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.AntiOperand_4007));
		entry.setId("createAntiOperand3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.AntiOperand_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEdge4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Edge4CreationTool_title,
				Messages.Edge4CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.EdgePattern_4016));
		entry.setId("createEdge4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.EdgePattern_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventually5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Eventually5CreationTool_title,
				Messages.Eventually5CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.Eventually_4010));
		entry.setId("createEventually5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.Eventually_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalActionCallParameter6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ExternalActionCallParameter6CreationTool_title,
				Messages.ExternalActionCallParameter6CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.ExternalActionCallParameter_4014));
		entry.setId("createExternalActionCallParameter6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.ExternalActionCallParameter_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalAttributeCalculationCallParameter7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ExternalAttributeCalculationCallParameter7CreationTool_title,
				Messages.ExternalAttributeCalculationCallParameter7CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012));
		entry.setId("createExternalAttributeCalculationCallParameter7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.ExternalAttributeCalculationCallParameter_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalCalculationCallParameter8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ExternalCalculationCallParameter8CreationTool_title,
				Messages.ExternalCalculationCallParameter8CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.ExternalCalculationCallParameter_4015));
		entry.setId("createExternalCalculationCallParameter8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.ExternalCalculationCallParameter_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalConditionCallParameter9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ExternalConditionCallParameter9CreationTool_title,
				Messages.ExternalConditionCallParameter9CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.ExternalConditionCallParameter_4013));
		entry.setId("createExternalConditionCallParameter9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.ExternalConditionCallParameter_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createKeepNode10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.KeepNode10CreationTool_title,
				Messages.KeepNode10CreationTool_desc,
				Collections.singletonList(TrnetvisualElementTypes.Keep_4002));
		entry.setId("createKeepNode10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.Keep_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNext11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Next11CreationTool_title,
				Messages.Next11CreationTool_desc,
				Collections.singletonList(TrnetvisualElementTypes.Next_4009));
		entry.setId("createNext11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.Next_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNextDerived12CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.NextDerived12CreationTool_title,
				Messages.NextDerived12CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.NextDerived_4011));
		entry.setId("createNextDerived12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.NextDerived_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOptionalOperand13CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.OptionalOperand13CreationTool_title,
				Messages.OptionalOperand13CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.OptionalOperand_4008));
		entry.setId("createOptionalOperand13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.OptionalOperand_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResult14CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Result14CreationTool_title,
				Messages.Result14CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.ExternalAttributeCalculationCallResult_4017));
		entry.setId("createResult14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.ExternalAttributeCalculationCallResult_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSameNode15CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SameNode15CreationTool_title,
				Messages.SameNode15CreationTool_desc,
				Collections.singletonList(TrnetvisualElementTypes.Same_4001));
		entry.setId("createSameNode15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.Same_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSomeOperand16CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SomeOperand16CreationTool_title,
				Messages.SomeOperand16CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.SomeOperand_4006));
		entry.setId("createSomeOperand16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.SomeOperand_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSomeResult17CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SomeResult17CreationTool_title,
				Messages.SomeResult17CreationTool_desc,
				Collections
						.singletonList(TrnetvisualElementTypes.SomeResult_4004));
		entry.setId("createSomeResult17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TrnetvisualElementTypes
				.getImageDescriptor(TrnetvisualElementTypes.SomeResult_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGenerateIDs1CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.GenerateIDs1CreationTool_title,
				Messages.GenerateIDs1CreationTool_desc, null, null) {
		};
		entry.setId("createGenerateIDs1CreationTool"); //$NON-NLS-1$
		entry.setToolClass(GenerateIdsTool.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGenerateOperandIndexes2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.GenerateOperandIndexes2CreationTool_title,
				Messages.GenerateOperandIndexes2CreationTool_desc, null, null) {
		};
		entry.setId("createGenerateOperandIndexes2CreationTool"); //$NON-NLS-1$
		entry.setToolClass(GenerateOperandIndexesTool.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGenerateExpectedSizes3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.GenerateExpectedSizes3CreationTool_title,
				Messages.GenerateExpectedSizes3CreationTool_desc, null, null) {
		};
		entry.setId("createGenerateExpectedSizes3CreationTool"); //$NON-NLS-1$
		entry.setToolClass(GenerateExpectedSizesTool.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompile4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Compile4CreationTool_title,
				Messages.Compile4CreationTool_desc, null, null) {
		};
		entry.setId("createCompile4CreationTool"); //$NON-NLS-1$
		entry.setToolClass(CompileTool.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
