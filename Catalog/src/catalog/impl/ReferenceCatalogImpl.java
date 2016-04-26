/**
 */
package catalog.impl;

import catalog.CatalogPackage;
import catalog.ReferenceCatalog;
import catalog.ReferenceCatalogSample;
import catalog.TypeCatalog;

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
 * An implementation of the model object '<em><b>Reference Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalog.impl.ReferenceCatalogImpl#getSource <em>Source</em>}</li>
 *   <li>{@link catalog.impl.ReferenceCatalogImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link catalog.impl.ReferenceCatalogImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link catalog.impl.ReferenceCatalogImpl#getAggregatedNumberOfDistinctSourceInstances <em>Aggregated Number Of Distinct Source Instances</em>}</li>
 *   <li>{@link catalog.impl.ReferenceCatalogImpl#getAggregatedNumberOfDistinctTargetInstances <em>Aggregated Number Of Distinct Target Instances</em>}</li>
 *   <li>{@link catalog.impl.ReferenceCatalogImpl#getAggregatedNumberOfInstances <em>Aggregated Number Of Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceCatalogImpl extends NamedElementImpl implements ReferenceCatalog
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected TypeCatalog source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected TypeCatalog target;

  /**
   * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSamples()
   * @generated
   * @ordered
   */
  protected EList<ReferenceCatalogSample> samples;

  /**
   * The default value of the '{@link #getAggregatedNumberOfDistinctSourceInstances() <em>Aggregated Number Of Distinct Source Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedNumberOfDistinctSourceInstances()
   * @generated
   * @ordered
   */
  protected static final int AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAggregatedNumberOfDistinctSourceInstances() <em>Aggregated Number Of Distinct Source Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedNumberOfDistinctSourceInstances()
   * @generated
   * @ordered
   */
  protected int aggregatedNumberOfDistinctSourceInstances = AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES_EDEFAULT;

  /**
   * The default value of the '{@link #getAggregatedNumberOfDistinctTargetInstances() <em>Aggregated Number Of Distinct Target Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedNumberOfDistinctTargetInstances()
   * @generated
   * @ordered
   */
  protected static final int AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAggregatedNumberOfDistinctTargetInstances() <em>Aggregated Number Of Distinct Target Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregatedNumberOfDistinctTargetInstances()
   * @generated
   * @ordered
   */
  protected int aggregatedNumberOfDistinctTargetInstances = AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES_EDEFAULT;

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
  protected ReferenceCatalogImpl()
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
    return CatalogPackage.Literals.REFERENCE_CATALOG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeCatalog getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (TypeCatalog)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CatalogPackage.REFERENCE_CATALOG__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeCatalog basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(TypeCatalog newSource, NotificationChain msgs)
  {
    TypeCatalog oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(TypeCatalog newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES, TypeCatalog.class, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES, TypeCatalog.class, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeCatalog getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (TypeCatalog)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CatalogPackage.REFERENCE_CATALOG__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeCatalog basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(TypeCatalog newTarget, NotificationChain msgs)
  {
    TypeCatalog oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(TypeCatalog newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES, TypeCatalog.class, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES, TypeCatalog.class, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceCatalogSample> getSamples()
  {
    if (samples == null)
    {
      samples = new EObjectContainmentWithInverseEList<ReferenceCatalogSample>(ReferenceCatalogSample.class, this, CatalogPackage.REFERENCE_CATALOG__SAMPLES, CatalogPackage.REFERENCE_CATALOG_SAMPLE__META);
    }
    return samples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAggregatedNumberOfDistinctSourceInstances()
  {
    return aggregatedNumberOfDistinctSourceInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregatedNumberOfDistinctSourceInstances(int newAggregatedNumberOfDistinctSourceInstances)
  {
    int oldAggregatedNumberOfDistinctSourceInstances = aggregatedNumberOfDistinctSourceInstances;
    aggregatedNumberOfDistinctSourceInstances = newAggregatedNumberOfDistinctSourceInstances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES, oldAggregatedNumberOfDistinctSourceInstances, aggregatedNumberOfDistinctSourceInstances));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAggregatedNumberOfDistinctTargetInstances()
  {
    return aggregatedNumberOfDistinctTargetInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregatedNumberOfDistinctTargetInstances(int newAggregatedNumberOfDistinctTargetInstances)
  {
    int oldAggregatedNumberOfDistinctTargetInstances = aggregatedNumberOfDistinctTargetInstances;
    aggregatedNumberOfDistinctTargetInstances = newAggregatedNumberOfDistinctTargetInstances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES, oldAggregatedNumberOfDistinctTargetInstances, aggregatedNumberOfDistinctTargetInstances));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES, oldAggregatedNumberOfInstances, aggregatedNumberOfInstances));
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
      case CatalogPackage.REFERENCE_CATALOG__SOURCE:
        if (source != null)
          msgs = ((InternalEObject)source).eInverseRemove(this, CatalogPackage.TYPE_CATALOG__OUTGOING_REFERENCES, TypeCatalog.class, msgs);
        return basicSetSource((TypeCatalog)otherEnd, msgs);
      case CatalogPackage.REFERENCE_CATALOG__TARGET:
        if (target != null)
          msgs = ((InternalEObject)target).eInverseRemove(this, CatalogPackage.TYPE_CATALOG__INCOMING_REFERENCES, TypeCatalog.class, msgs);
        return basicSetTarget((TypeCatalog)otherEnd, msgs);
      case CatalogPackage.REFERENCE_CATALOG__SAMPLES:
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
      case CatalogPackage.REFERENCE_CATALOG__SOURCE:
        return basicSetSource(null, msgs);
      case CatalogPackage.REFERENCE_CATALOG__TARGET:
        return basicSetTarget(null, msgs);
      case CatalogPackage.REFERENCE_CATALOG__SAMPLES:
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
      case CatalogPackage.REFERENCE_CATALOG__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case CatalogPackage.REFERENCE_CATALOG__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case CatalogPackage.REFERENCE_CATALOG__SAMPLES:
        return getSamples();
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES:
        return getAggregatedNumberOfDistinctSourceInstances();
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES:
        return getAggregatedNumberOfDistinctTargetInstances();
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES:
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
      case CatalogPackage.REFERENCE_CATALOG__SOURCE:
        setSource((TypeCatalog)newValue);
        return;
      case CatalogPackage.REFERENCE_CATALOG__TARGET:
        setTarget((TypeCatalog)newValue);
        return;
      case CatalogPackage.REFERENCE_CATALOG__SAMPLES:
        getSamples().clear();
        getSamples().addAll((Collection<? extends ReferenceCatalogSample>)newValue);
        return;
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES:
        setAggregatedNumberOfDistinctSourceInstances((Integer)newValue);
        return;
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES:
        setAggregatedNumberOfDistinctTargetInstances((Integer)newValue);
        return;
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES:
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
      case CatalogPackage.REFERENCE_CATALOG__SOURCE:
        setSource((TypeCatalog)null);
        return;
      case CatalogPackage.REFERENCE_CATALOG__TARGET:
        setTarget((TypeCatalog)null);
        return;
      case CatalogPackage.REFERENCE_CATALOG__SAMPLES:
        getSamples().clear();
        return;
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES:
        setAggregatedNumberOfDistinctSourceInstances(AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES_EDEFAULT);
        return;
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES:
        setAggregatedNumberOfDistinctTargetInstances(AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES_EDEFAULT);
        return;
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES:
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
      case CatalogPackage.REFERENCE_CATALOG__SOURCE:
        return source != null;
      case CatalogPackage.REFERENCE_CATALOG__TARGET:
        return target != null;
      case CatalogPackage.REFERENCE_CATALOG__SAMPLES:
        return samples != null && !samples.isEmpty();
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES:
        return aggregatedNumberOfDistinctSourceInstances != AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES_EDEFAULT;
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES:
        return aggregatedNumberOfDistinctTargetInstances != AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES_EDEFAULT;
      case CatalogPackage.REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES:
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
    result.append(" (aggregatedNumberOfDistinctSourceInstances: ");
    result.append(aggregatedNumberOfDistinctSourceInstances);
    result.append(", aggregatedNumberOfDistinctTargetInstances: ");
    result.append(aggregatedNumberOfDistinctTargetInstances);
    result.append(", aggregatedNumberOfInstances: ");
    result.append(aggregatedNumberOfInstances);
    result.append(')');
    return result.toString();
  }

} //ReferenceCatalogImpl
