/**
 */
package catalog.impl;

import catalog.AttributeCatalog;
import catalog.AttributeCatalogSample;
import catalog.CatalogPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalog.impl.AttributeCatalogImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link catalog.impl.AttributeCatalogImpl#getAggregatedNumberOfDistinctValues <em>Aggregated Number Of Distinct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeCatalogImpl extends NamedElementImpl implements AttributeCatalog
{
  /**
   * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSamples()
   * @generated
   * @ordered
   */
  protected EList<AttributeCatalogSample> samples;

  /**
   * The default value of the '{@link #getAggregatedNumberOfDistinctValues() <em>Aggregated Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedNumberOfDistinctValues()
   * @generated
   * @ordered
   */
  protected static final int AGGREGATED_NUMBER_OF_DISTINCT_VALUES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAggregatedNumberOfDistinctValues() <em>Aggregated Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedNumberOfDistinctValues()
   * @generated
   * @ordered
   */
  protected int aggregatedNumberOfDistinctValues = AGGREGATED_NUMBER_OF_DISTINCT_VALUES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeCatalogImpl()
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
    return CatalogPackage.Literals.ATTRIBUTE_CATALOG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeCatalogSample> getSamples()
  {
    if (samples == null)
    {
      samples = new EObjectContainmentWithInverseEList<AttributeCatalogSample>(AttributeCatalogSample.class, this, CatalogPackage.ATTRIBUTE_CATALOG__SAMPLES, CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE__META);
    }
    return samples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAggregatedNumberOfDistinctValues()
  {
    return aggregatedNumberOfDistinctValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregatedNumberOfDistinctValues(int newAggregatedNumberOfDistinctValues)
  {
    int oldAggregatedNumberOfDistinctValues = aggregatedNumberOfDistinctValues;
    aggregatedNumberOfDistinctValues = newAggregatedNumberOfDistinctValues;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ATTRIBUTE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_VALUES, oldAggregatedNumberOfDistinctValues, aggregatedNumberOfDistinctValues));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CatalogPackage.ATTRIBUTE_CATALOG__SAMPLES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSamples()).basicAdd(otherEnd, msgs);
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
      case CatalogPackage.ATTRIBUTE_CATALOG__SAMPLES:
        return ((InternalEList<?>)getSamples()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CatalogPackage.ATTRIBUTE_CATALOG__SAMPLES:
        return getSamples();
      case CatalogPackage.ATTRIBUTE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_VALUES:
        return getAggregatedNumberOfDistinctValues();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CatalogPackage.ATTRIBUTE_CATALOG__SAMPLES:
        getSamples().clear();
        getSamples().addAll((Collection<? extends AttributeCatalogSample>)newValue);
        return;
      case CatalogPackage.ATTRIBUTE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_VALUES:
        setAggregatedNumberOfDistinctValues((Integer)newValue);
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
      case CatalogPackage.ATTRIBUTE_CATALOG__SAMPLES:
        getSamples().clear();
        return;
      case CatalogPackage.ATTRIBUTE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_VALUES:
        setAggregatedNumberOfDistinctValues(AGGREGATED_NUMBER_OF_DISTINCT_VALUES_EDEFAULT);
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
      case CatalogPackage.ATTRIBUTE_CATALOG__SAMPLES:
        return samples != null && !samples.isEmpty();
      case CatalogPackage.ATTRIBUTE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_VALUES:
        return aggregatedNumberOfDistinctValues != AGGREGATED_NUMBER_OF_DISTINCT_VALUES_EDEFAULT;
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
    result.append(" (aggregatedNumberOfDistinctValues: ");
    result.append(aggregatedNumberOfDistinctValues);
    result.append(')');
    return result.toString();
  }

} //AttributeCatalogImpl
