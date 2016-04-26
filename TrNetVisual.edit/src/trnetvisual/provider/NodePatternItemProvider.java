/**
 */
package trnetvisual.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import trnetvisual.NodePattern;
import trnetvisual.TrnetvisualFactory;
import trnetvisual.TrnetvisualPackage;

/**
 * This is the item provider adapter for a {@link trnetvisual.NodePattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodePatternItemProvider
  extends ParameterItemProvider
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
  public NodePatternItemProvider(AdapterFactory adapterFactory)
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

      addIncomingPropertyDescriptor(object);
      addOutgoingPropertyDescriptor(object);
      addSameOutPropertyDescriptor(object);
      addSameInPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addKeepInPropertyDescriptor(object);
      addKeepOutPropertyDescriptor(object);
      addDifferentInPropertyDescriptor(object);
      addDifferentOutPropertyDescriptor(object);
      addIdPropertyDescriptor(object);
      addExpectedNumberOfDistinctValuesPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Incoming feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIncomingPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_incoming_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_incoming_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__INCOMING,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Outgoing feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOutgoingPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_outgoing_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_outgoing_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__OUTGOING,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Same Out feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSameOutPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_sameOut_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_sameOut_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__SAME_OUT,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Same In feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSameInPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_sameIn_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_sameIn_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__SAME_IN,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_name_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Keep In feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addKeepInPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_keepIn_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_keepIn_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__KEEP_IN,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Keep Out feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addKeepOutPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_keepOut_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_keepOut_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__KEEP_OUT,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Different In feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDifferentInPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_differentIn_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_differentIn_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__DIFFERENT_IN,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Different Out feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDifferentOutPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_differentOut_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_differentOut_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__DIFFERENT_OUT,
         true,
         false,
         true,
         null,
         null,
         null));
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
         getString("_UI_NodePattern_id_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_id_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__ID,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Expected Number Of Distinct Values feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addExpectedNumberOfDistinctValuesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NodePattern_expectedNumberOfDistinctValues_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NodePattern_expectedNumberOfDistinctValues_feature", "_UI_NodePattern_type"),
         TrnetvisualPackage.Literals.NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES,
         true,
         false,
         false,
         ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
      childrenFeatures.add(TrnetvisualPackage.Literals.NODE_PATTERN__ATTRIBUTES);
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
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((NodePattern)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_NodePattern_type") :
      getString("_UI_NodePattern_type") + " " + label;
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

    switch (notification.getFeatureID(NodePattern.class))
    {
      case TrnetvisualPackage.NODE_PATTERN__NAME:
      case TrnetvisualPackage.NODE_PATTERN__ID:
      case TrnetvisualPackage.NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES:
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
        (TrnetvisualPackage.Literals.NODE_PATTERN__ATTRIBUTES,
         TrnetvisualFactory.eINSTANCE.createAttributePattern()));
  }

}
