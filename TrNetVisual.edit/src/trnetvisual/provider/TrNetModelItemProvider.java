/**
 */
package trnetvisual.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import trnetvisual.TrNetModel;
import trnetvisual.TrnetvisualFactory;
import trnetvisual.TrnetvisualPackage;

/**
 * This is the item provider adapter for a {@link trnetvisual.TrNetModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TrNetModelItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrNetModelItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addIdPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Id feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIdPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TrNetModel_id_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TrNetModel_id_feature", "_UI_TrNetModel_type"),
         TrnetvisualPackage.Literals.TR_NET_MODEL__ID,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(TrnetvisualPackage.Literals.TR_NET_MODEL__PATTERNS);
      childrenFeatures.add(TrnetvisualPackage.Literals.TR_NET_MODEL__OPERATORS);
      childrenFeatures.add(TrnetvisualPackage.Literals.TR_NET_MODEL__RESTRICTIONS);
      childrenFeatures.add(TrnetvisualPackage.Literals.TR_NET_MODEL__OPERANDS);
      childrenFeatures.add(TrnetvisualPackage.Literals.TR_NET_MODEL__RESULTS);
      childrenFeatures.add(TrnetvisualPackage.Literals.TR_NET_MODEL__FLOW_RULES);
      childrenFeatures.add(TrnetvisualPackage.Literals.TR_NET_MODEL__CALCULATIONS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns TrNetModel.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/TrNetModel"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((TrNetModel)object).getId();
    return label == null || label.length() == 0 ?
      getString("_UI_TrNetModel_type") :
      getString("_UI_TrNetModel_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(TrNetModel.class))
    {
      case TrnetvisualPackage.TR_NET_MODEL__ID:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case TrnetvisualPackage.TR_NET_MODEL__PATTERNS:
      case TrnetvisualPackage.TR_NET_MODEL__OPERATORS:
      case TrnetvisualPackage.TR_NET_MODEL__RESTRICTIONS:
      case TrnetvisualPackage.TR_NET_MODEL__OPERANDS:
      case TrnetvisualPackage.TR_NET_MODEL__RESULTS:
      case TrnetvisualPackage.TR_NET_MODEL__FLOW_RULES:
      case TrnetvisualPackage.TR_NET_MODEL__CALCULATIONS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__PATTERNS,
         TrnetvisualFactory.eINSTANCE.createPattern()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__OPERATORS,
         TrnetvisualFactory.eINSTANCE.createCombinator()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__OPERATORS,
         TrnetvisualFactory.eINSTANCE.createExternal()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__RESTRICTIONS,
         TrnetvisualFactory.eINSTANCE.createSame()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__RESTRICTIONS,
         TrnetvisualFactory.eINSTANCE.createDifferent()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__RESTRICTIONS,
         TrnetvisualFactory.eINSTANCE.createKeep()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__RESTRICTIONS,
         TrnetvisualFactory.eINSTANCE.createExternalAttributeCalculationCall()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__OPERANDS,
         TrnetvisualFactory.eINSTANCE.createAnyOperand()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__OPERANDS,
         TrnetvisualFactory.eINSTANCE.createSomeOperand()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__OPERANDS,
         TrnetvisualFactory.eINSTANCE.createAntiOperand()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__OPERANDS,
         TrnetvisualFactory.eINSTANCE.createOptionalOperand()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__RESULTS,
         TrnetvisualFactory.eINSTANCE.createAnyResult()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__RESULTS,
         TrnetvisualFactory.eINSTANCE.createSomeResult()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__FLOW_RULES,
         TrnetvisualFactory.eINSTANCE.createNext()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__FLOW_RULES,
         TrnetvisualFactory.eINSTANCE.createEventually()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__FLOW_RULES,
         TrnetvisualFactory.eINSTANCE.createNextDerived()));

    newChildDescriptors.add
      (createChildParameter
        (TrnetvisualPackage.Literals.TR_NET_MODEL__CALCULATIONS,
         TrnetvisualFactory.eINSTANCE.createExternalCalculationCall()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return TrnetvisualEditPlugin.INSTANCE;
  }

}
