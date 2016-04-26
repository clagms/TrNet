/*
 * 
 */
package trnetvisual.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import trnetvisual.diagram.part.Messages;
import trnetvisual.diagram.part.TrnetvisualVisualIDRegistry;

/**
 * @generated
 */
public class TrnetvisualNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public TrnetvisualNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<TrnetvisualNavigatorItem> result = new ArrayList<TrnetvisualNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, TrNetModelEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof TrnetvisualNavigatorGroup) {
			TrnetvisualNavigatorGroup group = (TrnetvisualNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof TrnetvisualNavigatorItem) {
			TrnetvisualNavigatorItem navigatorItem = (TrnetvisualNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (TrnetvisualVisualIDRegistry.getVisualID(view)) {

		case OptionalOperandEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_OptionalOperand_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_OptionalOperand_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(PatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SameEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Same_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Same_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExternalAttributeCalculationCallResultEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalAttributeCalculationCallResult_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalAttributeCalculationCallResult_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AttributePatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NextDerivedEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_NextDerived_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_NextDerived_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AnyResultEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_AnyResult_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_AnyResult_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(PatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NextEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Next_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Next_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PatternEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup incominglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Pattern_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup outgoinglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Pattern_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(PatternPatternNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(PatternPatternNodesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AnyResultEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(SomeResultEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AnyOperandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(SomeOperandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AntiOperandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalOperandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case KeepEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Keep_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Keep_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TrNetModelEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			TrnetvisualNavigatorGroup links = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_TrNetModel_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(PatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(SameEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(KeepEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AnyResultEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(SomeResultEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AnyOperandEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(SomeOperandEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AntiOperandEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalOperandEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(NextEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EventuallyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(NextDerivedEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalConditionCallParameterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalActionCallParameterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallParameterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EdgePatternEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallResultEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case SomeResultEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_SomeResult_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_SomeResult_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(PatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExternalCalculationCallEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup incominglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalCalculationCall_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup outgoinglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalCalculationCall_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalConditionCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalActionCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallParameterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExternalConditionCallParameterEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalConditionCallParameter_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalConditionCallParameter_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AttributePatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalConditionCallEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case CombinatorEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup outgoinglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Combinator_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup incominglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Combinator_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorCombinatorConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrnetvisualVisualIDRegistry
							.getType(ExternalConditionCallEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorCombinatorActionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrnetvisualVisualIDRegistry
							.getType(ExternalActionCallEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AnyResultEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(SomeResultEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AnyOperandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(SomeOperandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AntiOperandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalOperandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(NextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(NextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EventuallyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EventuallyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(NextDerivedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(NextDerivedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalAttributeCalculationCallParameter_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalAttributeCalculationCallParameter_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AttributePatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExternalAttributeCalculationCallEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup outgoinglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalAttributeCalculationCall_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallResultEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExternalActionCallEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup outgoinglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalActionCall_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalActionCallParameterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExternalActionCallParameterEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalActionCallParameter_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalActionCallParameter_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AttributePatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalActionCallEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExternalCalculationCallParameterEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalCalculationCallParameter_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalCalculationCallParameter_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AttributePatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EventuallyEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Eventually_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_Eventually_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SomeOperandEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_SomeOperand_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_SomeOperand_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(PatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MandatoryNodeEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup incominglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_MandatoryNode_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup outgoinglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_MandatoryNode_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeMandatoryNodeAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrnetvisualVisualIDRegistry
							.getType(AttributePatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(SameEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(SameEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(KeepEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(KeepEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalConditionCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalActionCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EdgePatternEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EdgePatternEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AttributePatternEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup incominglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_AttributePattern_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalConditionCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalActionCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallResultEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EdgePatternEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_EdgePattern_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_EdgePattern_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(MandatoryNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExternalEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup outgoinglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_External_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup incominglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_External_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalExternalConditionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrnetvisualVisualIDRegistry
							.getType(ExternalConditionCallEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalExternalActionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrnetvisualVisualIDRegistry
							.getType(ExternalActionCallEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AnyResultEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(SomeResultEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AnyOperandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(SomeOperandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(AntiOperandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalOperandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(NextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(NextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EventuallyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EventuallyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(NextDerivedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(NextDerivedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ExternalConditionCallEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup outgoinglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_ExternalConditionCall_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalConditionCallParameterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OptionalNodeEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Node sv = (Node) view;
			TrnetvisualNavigatorGroup incominglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_OptionalNode_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup outgoinglinks = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_OptionalNode_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(OptionalNodeOptionalNodeAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TrnetvisualVisualIDRegistry
							.getType(AttributePatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(SameEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(SameEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(KeepEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry.getType(KeepEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalAttributeCalculationCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalConditionCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalActionCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalCalculationCallParameterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EdgePatternEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(EdgePatternEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AnyOperandEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_AnyOperand_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_AnyOperand_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(PatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AntiOperandEditPart.VISUAL_ID: {
			LinkedList<TrnetvisualAbstractNavigatorItem> result = new LinkedList<TrnetvisualAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TrnetvisualNavigatorGroup target = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_AntiOperand_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TrnetvisualNavigatorGroup source = new TrnetvisualNavigatorGroup(
					Messages.NavigatorGroupName_AntiOperand_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(CombinatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(ExternalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TrnetvisualVisualIDRegistry
							.getType(PatternEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TrNetModelEditPart.MODEL_ID.equals(TrnetvisualVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<TrnetvisualNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<TrnetvisualNavigatorItem> result = new ArrayList<TrnetvisualNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new TrnetvisualNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<TrnetvisualNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof TrnetvisualAbstractNavigatorItem) {
			TrnetvisualAbstractNavigatorItem abstractNavigatorItem = (TrnetvisualAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
