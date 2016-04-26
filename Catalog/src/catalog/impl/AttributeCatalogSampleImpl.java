/**
 */
package catalog.impl;

import catalog.AttributeCatalog;
import catalog.AttributeCatalogSample;
import catalog.CatalogPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Catalog Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalog.impl.AttributeCatalogSampleImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link catalog.impl.AttributeCatalogSampleImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link catalog.impl.AttributeCatalogSampleImpl#getNumberOfDistinctValues <em>Number Of Distinct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeCatalogSampleImpl extends EObjectImpl implements AttributeCatalogSample
{
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
   * The default value of the '{@link #getNumberOfDistinctValues() <em>Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfDistinctValues()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_OF_DISTINCT_VALUES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberOfDistinctValues() <em>Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfDistinctValues()
   * @generated
   * @ordered
   */
  protected int numberOfDistinctValues = NUMBER_OF_DISTINCT_VALUES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeCatalogSampleImpl()
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
    return CatalogPackage.Literals.ATTRIBUTE_CATALOG_SAMPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeCatalog getMeta()
  {
    if (eContainerFeatureID() != CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META) return null;
    return (AttributeCatalog)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMeta(AttributeCatalog newMeta, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newMeta, CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeta(AttributeCatalog newMeta)
  {
    if (newMeta != eInternalContainer() || (eContainerFeatureID() != CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META && newMeta != null))
    {
      if (EcoreUtil.isAncestor(this, newMeta))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newMeta != null)
        msgs = ((InternalEObject)newMeta).eInverseAdd(this, CatalogPackage.ATTRIBUTE_CATALOG__SAMPLES, AttributeCatalog.class, msgs);
      msgs = basicSetMeta(newMeta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META, newMeta, newMeta));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberOfDistinctValues()
  {
    return numberOfDistinctValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberOfDistinctValues(int newNumberOfDistinctValues)
  {
    int oldNumberOfDistinctValues = numberOfDistinctValues;
    numberOfDistinctValues = newNumberOfDistinctValues;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_VALUES, oldNumberOfDistinctValues, numberOfDistinctValues));
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
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetMeta((AttributeCatalog)otherEnd, msgs);
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
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META:
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
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META:
        return eInternalContainer().eInverseRemove(this, CatalogPackage.ATTRIBUTE_CATALOG__SAMPLES, AttributeCatalog.class, msgs);
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
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META:
        return getMeta();
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__INDEX:
        return getIndex();
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_VALUES:
        return getNumberOfDistinctValues();
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
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META:
        setMeta((AttributeCatalog)newValue);
        return;
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__INDEX:
        setIndex((Integer)newValue);
        return;
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_VALUES:
        setNumberOfDistinctValues((Integer)newValue);
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
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META:
        setMeta((AttributeCatalog)null);
        return;
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_VALUES:
        setNumberOfDistinctValues(NUMBER_OF_DISTINCT_VALUES_EDEFAULT);
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
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META:
        return getMeta() != null;
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__INDEX:
        return index != INDEX_EDEFAULT;
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_VALUES:
        return numberOfDistinctValues != NUMBER_OF_DISTINCT_VALUES_EDEFAULT;
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
    result.append(" (index: ");
    result.append(index);
    result.append(", numberOfDistinctValues: ");
    result.append(numberOfDistinctValues);
    result.append(')');
    return result.toString();
  }

} //AttributeCatalogSampleImpl
