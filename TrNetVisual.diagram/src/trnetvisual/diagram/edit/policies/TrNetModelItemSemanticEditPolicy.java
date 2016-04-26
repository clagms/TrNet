/*
 * 
 */
package trnetvisual.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import trnetvisual.diagram.edit.commands.CombinatorCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalAttributeCalculationCallCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalCalculationCallCreateCommand;
import trnetvisual.diagram.edit.commands.ExternalCreateCommand;
import trnetvisual.diagram.edit.commands.PatternCreateCommand;
import trnetvisual.diagram.providers.TrnetvisualElementTypes;

/**
 * @generated
 */
public class TrNetModelItemSemanticEditPolicy extends
		TrnetvisualBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TrNetModelItemSemanticEditPolicy() {
		super(TrnetvisualElementTypes.TrNetModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TrnetvisualElementTypes.ExternalAttributeCalculationCall_2001 == req
				.getElementType()) {
			return getGEFWrapper(new ExternalAttributeCalculationCallCreateCommand(
					req));
		}
		if (TrnetvisualElementTypes.ExternalCalculationCall_2002 == req
				.getElementType()) {
			return getGEFWrapper(new ExternalCalculationCallCreateCommand(req));
		}
		if (TrnetvisualElementTypes.Combinator_2003 == req.getElementType()) {
			return getGEFWrapper(new CombinatorCreateCommand(req));
		}
		if (TrnetvisualElementTypes.External_2004 == req.getElementType()) {
			return getGEFWrapper(new ExternalCreateCommand(req));
		}
		if (TrnetvisualElementTypes.Pattern_2005 == req.getElementType()) {
			return getGEFWrapper(new PatternCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
