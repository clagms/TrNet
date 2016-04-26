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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trnetvisual.Action;
import trnetvisual.ApplicationCondition;
import trnetvisual.FlowRule;
import trnetvisual.Operand;
import trnetvisual.Operator;
import trnetvisual.Result;
import trnetvisual.TrnetvisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnetvisual.impl.OperatorImpl#getOperands <em>Operands</em>}</li>
 *   <li>{@link trnetvisual.impl.OperatorImpl#getResults <em>Results</em>}</li>
 *   <li>{@link trnetvisual.impl.OperatorImpl#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.impl.OperatorImpl#getFlowOut <em>Flow Out</em>}</li>
 *   <li>{@link trnetvisual.impl.OperatorImpl#getFlowIn <em>Flow In</em>}</li>
 *   <li>{@link trnetvisual.impl.OperatorImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link trnetvisual.impl.OperatorImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OperatorImpl extends EObjectImpl implements Operator
{
  /**
   * The cached value of the '{@link #getOperands() <em>Operands</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperands()
   * @generated
   * @ordered
   */
  protected EList<Operand> operands;

  /**
   * The cached value of the '{@link #getResults() <em>Results</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResults()
   * @generated
   * @ordered
   */
  protected EList<Result> results;

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
   * The cached value of the '{@link #getFlowOut() <em>Flow Out</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlowOut()
   * @generated
   * @ordered
   */
  protected EList<FlowRule> flowOut;

  /**
   * The cached value of the '{@link #getFlowIn() <em>Flow In</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlowIn()
   * @generated
   * @ordered
   */
  protected EList<FlowRule> flowIn;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected EList<ApplicationCondition> conditions;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorImpl()
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
    return TrnetvisualPackage.Literals.OPERATOR;
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
      operands = new EObjectWithInverseResolvingEList<Operand>(Operand.class, this, TrnetvisualPackage.OPERATOR__OPERANDS, TrnetvisualPackage.OPERAND__OPERATOR);
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
      results = new EObjectWithInverseResolvingEList<Result>(Result.class, this, TrnetvisualPackage.OPERATOR__RESULTS, TrnetvisualPackage.RESULT__OPERATOR);
    }
    return results;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.OPERATOR__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FlowRule> getFlowOut()
  {
    if (flowOut == null)
    {
      flowOut = new EObjectWithInverseResolvingEList<FlowRule>(FlowRule.class, this, TrnetvisualPackage.OPERATOR__FLOW_OUT, TrnetvisualPackage.FLOW_RULE__SOURCE);
    }
    return flowOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FlowRule> getFlowIn()
  {
    if (flowIn == null)
    {
      flowIn = new EObjectWithInverseResolvingEList<FlowRule>(FlowRule.class, this, TrnetvisualPackage.OPERATOR__FLOW_IN, TrnetvisualPackage.FLOW_RULE__TARGET);
    }
    return flowIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ApplicationCondition> getConditions()
  {
    if (conditions == null)
    {
      conditions = new EObjectContainmentEList<ApplicationCondition>(ApplicationCondition.class, this, TrnetvisualPackage.OPERATOR__CONDITIONS);
    }
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, TrnetvisualPackage.OPERATOR__ACTIONS);
    }
    return actions;
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
      case TrnetvisualPackage.OPERATOR__OPERANDS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperands()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.OPERATOR__RESULTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.OPERATOR__FLOW_OUT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowOut()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.OPERATOR__FLOW_IN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowIn()).basicAdd(otherEnd, msgs);
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
      case TrnetvisualPackage.OPERATOR__OPERANDS:
        return ((InternalEList<?>)getOperands()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.OPERATOR__RESULTS:
        return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.OPERATOR__FLOW_OUT:
        return ((InternalEList<?>)getFlowOut()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.OPERATOR__FLOW_IN:
        return ((InternalEList<?>)getFlowIn()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.OPERATOR__CONDITIONS:
        return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.OPERATOR__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case TrnetvisualPackage.OPERATOR__OPERANDS:
        return getOperands();
      case TrnetvisualPackage.OPERATOR__RESULTS:
        return getResults();
      case TrnetvisualPackage.OPERATOR__ID:
        return getId();
      case TrnetvisualPackage.OPERATOR__FLOW_OUT:
        return getFlowOut();
      case TrnetvisualPackage.OPERATOR__FLOW_IN:
        return getFlowIn();
      case TrnetvisualPackage.OPERATOR__CONDITIONS:
        return getConditions();
      case TrnetvisualPackage.OPERATOR__ACTIONS:
        return getActions();
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
      case TrnetvisualPackage.OPERATOR__OPERANDS:
        getOperands().clear();
        getOperands().addAll((Collection<? extends Operand>)newValue);
        return;
      case TrnetvisualPackage.OPERATOR__RESULTS:
        getResults().clear();
        getResults().addAll((Collection<? extends Result>)newValue);
        return;
      case TrnetvisualPackage.OPERATOR__ID:
        setId((String)newValue);
        return;
      case TrnetvisualPackage.OPERATOR__FLOW_OUT:
        getFlowOut().clear();
        getFlowOut().addAll((Collection<? extends FlowRule>)newValue);
        return;
      case TrnetvisualPackage.OPERATOR__FLOW_IN:
        getFlowIn().clear();
        getFlowIn().addAll((Collection<? extends FlowRule>)newValue);
        return;
      case TrnetvisualPackage.OPERATOR__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends ApplicationCondition>)newValue);
        return;
      case TrnetvisualPackage.OPERATOR__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
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
      case TrnetvisualPackage.OPERATOR__OPERANDS:
        getOperands().clear();
        return;
      case TrnetvisualPackage.OPERATOR__RESULTS:
        getResults().clear();
        return;
      case TrnetvisualPackage.OPERATOR__ID:
        setId(ID_EDEFAULT);
        return;
      case TrnetvisualPackage.OPERATOR__FLOW_OUT:
        getFlowOut().clear();
        return;
      case TrnetvisualPackage.OPERATOR__FLOW_IN:
        getFlowIn().clear();
        return;
      case TrnetvisualPackage.OPERATOR__CONDITIONS:
        getConditions().clear();
        return;
      case TrnetvisualPackage.OPERATOR__ACTIONS:
        getActions().clear();
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
      case TrnetvisualPackage.OPERATOR__OPERANDS:
        return operands != null && !operands.isEmpty();
      case TrnetvisualPackage.OPERATOR__RESULTS:
        return results != null && !results.isEmpty();
      case TrnetvisualPackage.OPERATOR__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case TrnetvisualPackage.OPERATOR__FLOW_OUT:
        return flowOut != null && !flowOut.isEmpty();
      case TrnetvisualPackage.OPERATOR__FLOW_IN:
        return flowIn != null && !flowIn.isEmpty();
      case TrnetvisualPackage.OPERATOR__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
      case TrnetvisualPackage.OPERATOR__ACTIONS:
        return actions != null && !actions.isEmpty();
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

} //OperatorImpl
