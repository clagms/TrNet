/**
 */
package catalog.impl;

import catalog.CatalogPackage;
import catalog.TypeCatalog;
import catalog.TypeCatalogSample;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Catalog Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalog.impl.TypeCatalogSampleImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link catalog.impl.TypeCatalogSampleImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link catalog.impl.TypeCatalogSampleImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCatalogSampleImpl extends EObjectImpl implements TypeCatalogSample
{
  /**
   * The default value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfInstances()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_OF_INSTANCES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfInstances()
   * @generated
   * @ordered
   */
  protected int numberOfInstances = NUMBER_OF_INSTANCES_EDEFAULT;

  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeCatalogSampleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CatalogPackage.Literals.TYPE_CATALOG_SAMPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberOfInstances()
  {
    return numberOfInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberOfInstances(int newNumberOfInstances)
  {
    int oldNumberOfInstances = numberOfInstances;
    numberOfInstances = newNumberOfInstances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.TYPE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES, oldNumberOfInstances, numberOfInstances));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeCatalog getMeta()
  {
    if (eContainerFeatureID() != CatalogPackage.TYPE_CATALOG_SAMPLE__META) return null;
    return (TypeCatalog)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMeta(TypeCatalog newMeta, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newMeta, CatalogPackage.TYPE_CATALOG_SAMPLE__META, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeta(TypeCatalog newMeta)
  {
    if (newMeta != eInternalContainer() || (eContainerFeatureID() != CatalogPackage.TYPE_CATALOG_SAMPLE__META && newMeta != null))
    {
      if (EcoreUtil.isAncestor(this, newMeta))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newMeta != null)
        msgs = ((InternalEObject)newMeta).eInverseAdd(this, CatalogPackage.TYPE_CATALOG__SAMPLES, TypeCatalog.class, msgs);
      msgs = basicSetMeta(newMeta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.TYPE_CATALOG_SAMPLE__META, newMeta, newMeta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.TYPE_CATALOG_SAMPLE__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CatalogPackage.TYPE_CATALOG_SAMPLE__META:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetMeta((TypeCatalog)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CatalogPackage.TYPE_CATALOG_SAMPLE__META:
        return basicSetMeta(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case CatalogPackage.TYPE_CATALOG_SAMPLE__META:
        return eInternalContainer().eInverseRemove(this, CatalogPackage.TYPE_CATALOG__SAMPLES, TypeCatalog.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CatalogPackage.TYPE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES:
        return getNumberOfInstances();
      case CatalogPackage.TYPE_CATALOG_SAMPLE__META:
        return getMeta();
      case CatalogPackage.TYPE_CATALOG_SAMPLE__INDEX:
        return getIndex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CatalogPackage.TYPE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES:
        setNumberOfInstances((Integer)newValue);
        return;
      case CatalogPackage.TYPE_CATALOG_SAMPLE__META:
        setMeta((TypeCatalog)newValue);
        return;
      case CatalogPackage.TYPE_CATALOG_SAMPLE__INDEX:
        setIndex((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CatalogPackage.TYPE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES:
        setNumberOfInstances(NUMBER_OF_INSTANCES_EDEFAULT);
        return;
      case CatalogPackage.TYPE_CATALOG_SAMPLE__META:
        setMeta((TypeCatalog)null);
        return;
      case CatalogPackage.TYPE_CATALOG_SAMPLE__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CatalogPackage.TYPE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES:
        return numberOfInstances != NUMBER_OF_INSTANCES_EDEFAULT;
      case CatalogPackage.TYPE_CATALOG_SAMPLE__META:
        return getMeta() != null;
      case CatalogPackage.TYPE_CATALOG_SAMPLE__INDEX:
        return index != INDEX_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (numberOfInstances: ");
    result.append(numberOfInstances);
    result.append(", index: ");
    result.append(index);
    result.append(')');
    return result.toString();
  }

} //TypeCatalogSampleImpl
