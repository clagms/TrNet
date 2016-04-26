/**
 */
package catalog.impl;

import catalog.AttributeCatalog;
import catalog.CatalogPackage;
import catalog.ReferenceCatalog;
import catalog.TypeCatalog;
import catalog.TypeCatalogSample;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalog.impl.TypeCatalogImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link catalog.impl.TypeCatalogImpl#getOutgoingReferences <em>Outgoing References</em>}</li>
 *   <li>{@link catalog.impl.TypeCatalogImpl#getIncomingReferences <em>Incoming References</em>}</li>
 *   <li>{@link catalog.impl.TypeCatalogImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link catalog.impl.TypeCatalogImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link catalog.impl.TypeCatalogImpl#getAggregatedNumberOfInstances <em>Aggregated Number Of Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCatalogImpl extends NamedElementImpl implements TypeCatalog
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<AttributeCatalog> attributes;

  /**
   * The cached value of the '{@link #getOutgoingReferences() <em>Outgoing References</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingReferences()
   * @generated
   * @ordered
   */
  protected EList<ReferenceCatalog> outgoingReferences;

  /**
   * The cached value of the '{@link #getIncomingReferences() <em>Incoming References</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomingReferences()
   * @generated
   * @ordered
   */
  protected EList<ReferenceCatalog> incomingReferences;

  /**
   * The cached value of the '{@link #getSuper() <em>Super</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuper()
   * @generated
   * @ordered
   */
  protected EList<TypeCatalog> super_;

  /**
   * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSamples()
   * @generated
   * @ordered
   */
  protected EList<TypeCatalogSample> samples;

  /**
   * The default value of the '{@link #getAggregatedNumberOfInstances() <em>Aggregated Number Of Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedNumberOfInstances()
   * @generated
   * @ordered
   */
  protected static final int AGGREGATED_NUMBER_OF_INSTANCES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAggregatedNumberOfInstances() <em>Aggregated Number Of Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedNumberOfInstances()
   * @generated
   * @ordered
   */
  protected int aggregatedNumberOfInstances = AGGREGATED_NUMBER_OF_INSTANCES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeCatalogImpl()
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
    return CatalogPackage.Literals.TYPE_CATALOG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeCatalog> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<AttributeCatalog>(AttributeCatalog.class, this, CatalogPackage.TYPE_CATALOG__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceCatalog> getOutgoingReferences()
  {
    if (outgoingReferences == null)
    {
      outgoingReferences = new EObjectWithInverseResolvingEList<ReferenceCatalog>(ReferenceCatalog.class, this, CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES, CatalogPackage.REFERENCE_CATALOG__SOURCE);
    }
    return outgoingReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceCatalog> getIncomingReferences()
  {
    if (incomingReferences == null)
    {
      incomingReferences = new EObjectWithInverseResolvingEList<ReferenceCatalog>(ReferenceCatalog.class, this, CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES, CatalogPackage.REFERENCE_CATALOG__TARGET);
    }
    return incomingReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeCatalog> getSuper()
  {
    if (super_ == null)
    {
      super_ = new EObjectResolvingEList<TypeCatalog>(TypeCatalog.class, this, CatalogPackage.TYPE_CATALOG__SUPER);
    }
    return super_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeCatalogSample> getSamples()
  {
    if (samples == null)
    {
      samples = new EObjectContainmentWithInverseEList<TypeCatalogSample>(TypeCatalogSample.class, this, CatalogPackage.TYPE_CATALOG__SAMPLES, CatalogPackage.TYPE_CATALOG_SAMPLE__META);
    }
    return samples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAggregatedNumberOfInstances()
  {
    return aggregatedNumberOfInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregatedNumberOfInstances(int newAggregatedNumberOfInstances)
  {
    int oldAggregatedNumberOfInstances = aggregatedNumberOfInstances;
    aggregatedNumberOfInstances = newAggregatedNumberOfInstances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.TYPE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES, oldAggregatedNumberOfInstances, aggregatedNumberOfInstances));
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
      case CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingReferences()).basicAdd(otherEnd, msgs);
      case CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingReferences()).basicAdd(otherEnd, msgs);
      case CatalogPackage.TYPE_CATALOG__SAMPLES:
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
      case CatalogPackage.TYPE_CATALOG__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES:
        return ((InternalEList<?>)getOutgoingReferences()).basicRemove(otherEnd, msgs);
      case CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES:
        return ((InternalEList<?>)getIncomingReferences()).basicRemove(otherEnd, msgs);
      case CatalogPackage.TYPE_CATALOG__SAMPLES:
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
      case CatalogPackage.TYPE_CATALOG__ATTRIBUTES:
        return getAttributes();
      case CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES:
        return getOutgoingReferences();
      case CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES:
        return getIncomingReferences();
      case CatalogPackage.TYPE_CATALOG__SUPER:
        return getSuper();
      case CatalogPackage.TYPE_CATALOG__SAMPLES:
        return getSamples();
      case CatalogPackage.TYPE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES:
        return getAggregatedNumberOfInstances();
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
      case CatalogPackage.TYPE_CATALOG__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AttributeCatalog>)newValue);
        return;
      case CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES:
        getOutgoingReferences().clear();
        getOutgoingReferences().addAll((Collection<? extends ReferenceCatalog>)newValue);
        return;
      case CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES:
        getIncomingReferences().clear();
        getIncomingReferences().addAll((Collection<? extends ReferenceCatalog>)newValue);
        return;
      case CatalogPackage.TYPE_CATALOG__SUPER:
        getSuper().clear();
        getSuper().addAll((Collection<? extends TypeCatalog>)newValue);
        return;
      case CatalogPackage.TYPE_CATALOG__SAMPLES:
        getSamples().clear();
        getSamples().addAll((Collection<? extends TypeCatalogSample>)newValue);
        return;
      case CatalogPackage.TYPE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES:
        setAggregatedNumberOfInstances((Integer)newValue);
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
      case CatalogPackage.TYPE_CATALOG__ATTRIBUTES:
        getAttributes().clear();
        return;
      case CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES:
        getOutgoingReferences().clear();
        return;
      case CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES:
        getIncomingReferences().clear();
        return;
      case CatalogPackage.TYPE_CATALOG__SUPER:
        getSuper().clear();
        return;
      case CatalogPackage.TYPE_CATALOG__SAMPLES:
        getSamples().clear();
        return;
      case CatalogPackage.TYPE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES:
        setAggregatedNumberOfInstances(AGGREGATED_NUMBER_OF_INSTANCES_EDEFAULT);
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
      case CatalogPackage.TYPE_CATALOG__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES:
        return outgoingReferences != null && !outgoingReferences.isEmpty();
      case CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES:
        return incomingReferences != null && !incomingReferences.isEmpty();
      case CatalogPackage.TYPE_CATALOG__SUPER:
        return super_ != null && !super_.isEmpty();
      case CatalogPackage.TYPE_CATALOG__SAMPLES:
        return samples != null && !samples.isEmpty();
      case CatalogPackage.TYPE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES:
        return aggregatedNumberOfInstances != AGGREGATED_NUMBER_OF_INSTANCES_EDEFAULT;
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
    result.append(" (aggregatedNumberOfInstances: ");
    result.append(aggregatedNumberOfInstances);
    result.append(')');
    return result.toString();
  }

} //TypeCatalogImpl
