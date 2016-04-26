/**
 */
package trnetvisual.impl;

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

import trnetvisual.Calculation;
import trnetvisual.FlowRule;
import trnetvisual.Operand;
import trnetvisual.Operator;
import trnetvisual.Pattern;
import trnetvisual.Restriction;
import trnetvisual.Result;
import trnetvisual.TrNetModel;
import trnetvisual.TrnetvisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tr Net Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnetvisual.impl.TrNetModelImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link trnetvisual.impl.TrNetModelImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link trnetvisual.impl.TrNetModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.impl.TrNetModelImpl#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link trnetvisual.impl.TrNetModelImpl#getOperands <em>Operands</em>}</li>
 *   <li>{@link trnetvisual.impl.TrNetModelImpl#getResults <em>Results</em>}</li>
 *   <li>{@link trnetvisual.impl.TrNetModelImpl#getFlowRules <em>Flow Rules</em>}</li>
 *   <li>{@link trnetvisual.impl.TrNetModelImpl#getCalculations <em>Calculations</em>}</li>
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
   * The cached value of the '{@link #getRestrictions() <em>Restrictions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrictions()
   * @generated
   * @ordered
   */
  protected EList<Restriction> restrictions;

  /**
   * The cached value of the '{@link #getOperands() <em>Operands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperands()
   * @generated
   * @ordered
   */
  protected EList<Operand> operands;

  /**
   * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResults()
   * @generated
   * @ordered
   */
  protected EList<Result> results;

  /**
   * The cached value of the '{@link #getFlowRules() <em>Flow Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlowRules()
   * @generated
   * @ordered
   */
  protected EList<FlowRule> flowRules;

  /**
   * The cached value of the '{@link #getCalculations() <em>Calculations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalculations()
   * @generated
   * @ordered
   */
  protected EList<Calculation> calculations;

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
    return TrnetvisualPackage.Literals.TR_NET_MODEL;
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
      patterns = new EObjectContainmentEList<Pattern>(Pattern.class, this, TrnetvisualPackage.TR_NET_MODEL__PATTERNS);
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
      operators = new EObjectContainmentEList<Operator>(Operator.class, this, TrnetvisualPackage.TR_NET_MODEL__OPERATORS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.TR_NET_MODEL__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Restriction> getRestrictions()
  {
    if (restrictions == null)
    {
      restrictions = new EObjectContainmentEList<Restriction>(Restriction.class, this, TrnetvisualPackage.TR_NET_MODEL__RESTRICTIONS);
    }
    return restrictions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operand> getOperands()
  {
    if (operands == null)
    {
      operands = new EObjectContainmentEList<Operand>(Operand.class, this, TrnetvisualPackage.TR_NET_MODEL__OPERANDS);
    }
    return operands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Result> getResults()
  {
    if (results == null)
    {
      results = new EObjectContainmentEList<Result>(Result.class, this, TrnetvisualPackage.TR_NET_MODEL__RESULTS);
    }
    return results;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FlowRule> getFlowRules()
  {
    if (flowRules == null)
    {
      flowRules = new EObjectContainmentEList<FlowRule>(FlowRule.class, this, TrnetvisualPackage.TR_NET_MODEL__FLOW_RULES);
    }
    return flowRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Calculation> getCalculations()
  {
    if (calculations == null)
    {
      calculations = new EObjectContainmentEList<Calculation>(Calculation.class, this, TrnetvisualPackage.TR_NET_MODEL__CALCULATIONS);
    }
    return calculations;
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
      case TrnetvisualPackage.TR_NET_MODEL__PATTERNS:
        return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.TR_NET_MODEL__OPERATORS:
        return ((InternalEList<?>)getOperators()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.TR_NET_MODEL__RESTRICTIONS:
        return ((InternalEList<?>)getRestrictions()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.TR_NET_MODEL__OPERANDS:
        return ((InternalEList<?>)getOperands()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.TR_NET_MODEL__RESULTS:
        return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.TR_NET_MODEL__FLOW_RULES:
        return ((InternalEList<?>)getFlowRules()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.TR_NET_MODEL__CALCULATIONS:
        return ((InternalEList<?>)getCalculations()).basicRemove(otherEnd, msgs);
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
      case TrnetvisualPackage.TR_NET_MODEL__PATTERNS:
        return getPatterns();
      case TrnetvisualPackage.TR_NET_MODEL__OPERATORS:
        return getOperators();
      case TrnetvisualPackage.TR_NET_MODEL__ID:
        return getId();
      case TrnetvisualPackage.TR_NET_MODEL__RESTRICTIONS:
        return getRestrictions();
      case TrnetvisualPackage.TR_NET_MODEL__OPERANDS:
        return getOperands();
      case TrnetvisualPackage.TR_NET_MODEL__RESULTS:
        return getResults();
      case TrnetvisualPackage.TR_NET_MODEL__FLOW_RULES:
        return getFlowRules();
      case TrnetvisualPackage.TR_NET_MODEL__CALCULATIONS:
        return getCalculations();
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
      case TrnetvisualPackage.TR_NET_MODEL__PATTERNS:
        getPatterns().clear();
        getPatterns().addAll((Collection<? extends Pattern>)newValue);
        return;
      case TrnetvisualPackage.TR_NET_MODEL__OPERATORS:
        getOperators().clear();
        getOperators().addAll((Collection<? extends Operator>)newValue);
        return;
      case TrnetvisualPackage.TR_NET_MODEL__ID:
        setId((String)newValue);
        return;
      case TrnetvisualPackage.TR_NET_MODEL__RESTRICTIONS:
        getRestrictions().clear();
        getRestrictions().addAll((Collection<? extends Restriction>)newValue);
        return;
      case TrnetvisualPackage.TR_NET_MODEL__OPERANDS:
        getOperands().clear();
        getOperands().addAll((Collection<? extends Operand>)newValue);
        return;
      case TrnetvisualPackage.TR_NET_MODEL__RESULTS:
        getResults().clear();
        getResults().addAll((Collection<? extends Result>)newValue);
        return;
      case TrnetvisualPackage.TR_NET_MODEL__FLOW_RULES:
        getFlowRules().clear();
        getFlowRules().addAll((Collection<? extends FlowRule>)newValue);
        return;
      case TrnetvisualPackage.TR_NET_MODEL__CALCULATIONS:
        getCalculations().clear();
        getCalculations().addAll((Collection<? extends Calculation>)newValue);
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
      case TrnetvisualPackage.TR_NET_MODEL__PATTERNS:
        getPatterns().clear();
        return;
      case TrnetvisualPackage.TR_NET_MODEL__OPERATORS:
        getOperators().clear();
        return;
      case TrnetvisualPackage.TR_NET_MODEL__ID:
        setId(ID_EDEFAULT);
        return;
      case TrnetvisualPackage.TR_NET_MODEL__RESTRICTIONS:
        getRestrictions().clear();
        return;
      case TrnetvisualPackage.TR_NET_MODEL__OPERANDS:
        getOperands().clear();
        return;
      case TrnetvisualPackage.TR_NET_MODEL__RESULTS:
        getResults().clear();
        return;
      case TrnetvisualPackage.TR_NET_MODEL__FLOW_RULES:
        getFlowRules().clear();
        return;
      case TrnetvisualPackage.TR_NET_MODEL__CALCULATIONS:
        getCalculations().clear();
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
      case TrnetvisualPackage.TR_NET_MODEL__PATTERNS:
        return patterns != null && !patterns.isEmpty();
      case TrnetvisualPackage.TR_NET_MODEL__OPERATORS:
        return operators != null && !operators.isEmpty();
      case TrnetvisualPackage.TR_NET_MODEL__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case TrnetvisualPackage.TR_NET_MODEL__RESTRICTIONS:
        return restrictions != null && !restrictions.isEmpty();
      case TrnetvisualPackage.TR_NET_MODEL__OPERANDS:
        return operands != null && !operands.isEmpty();
      case TrnetvisualPackage.TR_NET_MODEL__RESULTS:
        return results != null && !results.isEmpty();
      case TrnetvisualPackage.TR_NET_MODEL__FLOW_RULES:
        return flowRules != null && !flowRules.isEmpty();
      case TrnetvisualPackage.TR_NET_MODEL__CALCULATIONS:
        return calculations != null && !calculations.isEmpty();
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
