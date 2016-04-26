/**
 */
package trnet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trnet.Operator;
import trnet.Pattern;
import trnet.TrNetModel;
import trnet.TrnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tr Net Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnet.impl.TrNetModelImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link trnet.impl.TrNetModelImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link trnet.impl.TrNetModelImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrNetModelImpl extends EObjectImpl implements TrNetModel
{
  /**
   * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatterns()
   * @generated
   * @ordered
   */
  protected EList<Pattern> patterns;

  /**
   * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected EList<Operator> operators;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrNetModelImpl()
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
    return TrnetPackage.Literals.TR_NET_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Pattern> getPatterns()
  {
    if (patterns == null)
    {
      patterns = new EObjectContainmentEList<Pattern>(Pattern.class, this, TrnetPackage.TR_NET_MODEL__PATTERNS);
    }
    return patterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operator> getOperators()
  {
    if (operators == null)
    {
      operators = new EObjectContainmentEList<Operator>(Operator.class, this, TrnetPackage.TR_NET_MODEL__OPERATORS);
    }
    return operators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.TR_NET_MODEL__ID, oldId, id));
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
      case TrnetPackage.TR_NET_MODEL__PATTERNS:
        return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
      case TrnetPackage.TR_NET_MODEL__OPERATORS:
        return ((InternalEList<?>)getOperators()).basicRemove(otherEnd, msgs);
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
      case TrnetPackage.TR_NET_MODEL__PATTERNS:
        return getPatterns();
      case TrnetPackage.TR_NET_MODEL__OPERATORS:
        return getOperators();
      case TrnetPackage.TR_NET_MODEL__ID:
        return getId();
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
      case TrnetPackage.TR_NET_MODEL__PATTERNS:
        getPatterns().clear();
        getPatterns().addAll((Collection<? extends Pattern>)newValue);
        return;
      case TrnetPackage.TR_NET_MODEL__OPERATORS:
        getOperators().clear();
        getOperators().addAll((Collection<? extends Operator>)newValue);
        return;
      case TrnetPackage.TR_NET_MODEL__ID:
        setId((String)newValue);
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
      case TrnetPackage.TR_NET_MODEL__PATTERNS:
        getPatterns().clear();
        return;
      case TrnetPackage.TR_NET_MODEL__OPERATORS:
        getOperators().clear();
        return;
      case TrnetPackage.TR_NET_MODEL__ID:
        setId(ID_EDEFAULT);
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
      case TrnetPackage.TR_NET_MODEL__PATTERNS:
        return patterns != null && !patterns.isEmpty();
      case TrnetPackage.TR_NET_MODEL__OPERATORS:
        return operators != null && !operators.isEmpty();
      case TrnetPackage.TR_NET_MODEL__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //TrNetModelImpl
