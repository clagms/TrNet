/**
 */
package catalog.impl;

import catalog.CatalogPackage;
import catalog.ReferenceCatalog;
import catalog.ReferenceCatalogSample;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Catalog Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link catalog.impl.ReferenceCatalogSampleImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link catalog.impl.ReferenceCatalogSampleImpl#getNumberOfDistinctSourceInstances <em>Number Of Distinct Source Instances</em>}</li>
 *   <li>{@link catalog.impl.ReferenceCatalogSampleImpl#getNumberOfDistinctTargetInstances <em>Number Of Distinct Target Instances</em>}</li>
 *   <li>{@link catalog.impl.ReferenceCatalogSampleImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link catalog.impl.ReferenceCatalogSampleImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceCatalogSampleImpl extends EObjectImpl implements ReferenceCatalogSample
{
  /**
   * The default value of the '{@link #getNumberOfDistinctSourceInstances() <em>Number Of Distinct Source Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfDistinctSourceInstances()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_OF_DISTINCT_SOURCE_INSTANCES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberOfDistinctSourceInstances() <em>Number Of Distinct Source Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfDistinctSourceInstances()
   * @generated
   * @ordered
   */
  protected int numberOfDistinctSourceInstances = NUMBER_OF_DISTINCT_SOURCE_INSTANCES_EDEFAULT;

  /**
   * The default value of the '{@link #getNumberOfDistinctTargetInstances() <em>Number Of Distinct Target Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfDistinctTargetInstances()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_OF_DISTINCT_TARGET_INSTANCES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumberOfDistinctTargetInstances() <em>Number Of Distinct Target Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumberOfDistinctTargetInstances()
   * @generated
   * @ordered
   */
  protected int numberOfDistinctTargetInstances = NUMBER_OF_DISTINCT_TARGET_INSTANCES_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceCatalogSampleImpl()
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
    return CatalogPackage.Literals.REFERENCE_CATALOG_SAMPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceCatalog getMeta()
  {
    if (eContainerFeatureID() != CatalogPackage.REFERENCE_CATALOG_SAMPLE__META) return null;
    return (ReferenceCatalog)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMeta(ReferenceCatalog newMeta, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newMeta, CatalogPackage.REFERENCE_CATALOG_SAMPLE__META, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeta(ReferenceCatalog newMeta)
  {
    if (newMeta != eInternalContainer() || (eContainerFeatureID() != CatalogPackage.REFERENCE_CATALOG_SAMPLE__META && newMeta != null))
    {
      if (EcoreUtil.isAncestor(this, newMeta))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newMeta != null)
        msgs = ((InternalEObject)newMeta).eInverseAdd(this, CatalogPackage.REFERENCE_CATALOG__SAMPLES, ReferenceCatalog.class, msgs);
      msgs = basicSetMeta(newMeta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG_SAMPLE__META, newMeta, newMeta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberOfDistinctSourceInstances()
  {
    return numberOfDistinctSourceInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberOfDistinctSourceInstances(int newNumberOfDistinctSourceInstances)
  {
    int oldNumberOfDistinctSourceInstances = numberOfDistinctSourceInstances;
    numberOfDistinctSourceInstances = newNumberOfDistinctSourceInstances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_SOURCE_INSTANCES, oldNumberOfDistinctSourceInstances, numberOfDistinctSourceInstances));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumberOfDistinctTargetInstances()
  {
    return numberOfDistinctTargetInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberOfDistinctTargetInstances(int newNumberOfDistinctTargetInstances)
  {
    int oldNumberOfDistinctTargetInstances = numberOfDistinctTargetInstances;
    numberOfDistinctTargetInstances = newNumberOfDistinctTargetInstances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_TARGET_INSTANCES, oldNumberOfDistinctTargetInstances, numberOfDistinctTargetInstances));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG_SAMPLE__INDEX, oldIndex, index));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES, oldNumberOfInstances, numberOfInstances));
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
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__META:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetMeta((ReferenceCatalog)otherEnd, msgs);
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
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__META:
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
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__META:
        return eInternalContainer().eInverseRemove(this, CatalogPackage.REFERENCE_CATALOG__SAMPLES, ReferenceCatalog.class, msgs);
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
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__META:
        return getMeta();
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_SOURCE_INSTANCES:
        return getNumberOfDistinctSourceInstances();
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_TARGET_INSTANCES:
        return getNumberOfDistinctTargetInstances();
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__INDEX:
        return getIndex();
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES:
        return getNumberOfInstances();
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
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__META:
        setMeta((ReferenceCatalog)newValue);
        return;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_SOURCE_INSTANCES:
        setNumberOfDistinctSourceInstances((Integer)newValue);
        return;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_TARGET_INSTANCES:
        setNumberOfDistinctTargetInstances((Integer)newValue);
        return;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__INDEX:
        setIndex((Integer)newValue);
        return;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES:
        setNumberOfInstances((Integer)newValue);
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
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__META:
        setMeta((ReferenceCatalog)null);
        return;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_SOURCE_INSTANCES:
        setNumberOfDistinctSourceInstances(NUMBER_OF_DISTINCT_SOURCE_INSTANCES_EDEFAULT);
        return;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_TARGET_INSTANCES:
        setNumberOfDistinctTargetInstances(NUMBER_OF_DISTINCT_TARGET_INSTANCES_EDEFAULT);
        return;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES:
        setNumberOfInstances(NUMBER_OF_INSTANCES_EDEFAULT);
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
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__META:
        return getMeta() != null;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_SOURCE_INSTANCES:
        return numberOfDistinctSourceInstances != NUMBER_OF_DISTINCT_SOURCE_INSTANCES_EDEFAULT;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_TARGET_INSTANCES:
        return numberOfDistinctTargetInstances != NUMBER_OF_DISTINCT_TARGET_INSTANCES_EDEFAULT;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__INDEX:
        return index != INDEX_EDEFAULT;
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES:
        return numberOfInstances != NUMBER_OF_INSTANCES_EDEFAULT;
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
    result.append(" (numberOfDistinctSourceInstances: ");
    result.append(numberOfDistinctSourceInstances);
    result.append(", numberOfDistinctTargetInstances: ");
    result.append(numberOfDistinctTargetInstances);
    result.append(", index: ");
    result.append(index);
    result.append(", numberOfInstances: ");
    result.append(numberOfInstances);
    result.append(')');
    return result.toString();
  }

} //ReferenceCatalogSampleImpl
