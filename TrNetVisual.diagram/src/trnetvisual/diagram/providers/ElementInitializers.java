/*
 * 
 */
package trnetvisual.diagram.providers;

import trnetvisual.diagram.part.TrnetvisualDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TrnetvisualDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			TrnetvisualDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
