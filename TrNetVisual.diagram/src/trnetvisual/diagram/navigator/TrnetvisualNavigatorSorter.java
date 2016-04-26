/*
 * 
 */
package trnetvisual.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;

/**
 * @generated
 */
public class TrnetvisualNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7009;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TrnetvisualNavigatorItem) {
			TrnetvisualNavigatorItem item = (TrnetvisualNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return TrnetvisualVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
