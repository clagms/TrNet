/**
 */
package trnetvisual.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trnetvisual.ExternalActionCallParameter;
import trnetvisual.ExternalAttributeCalculationCallParameter;
import trnetvisual.ExternalCalculationCallParameter;
import trnetvisual.ExternalConditionCallParameter;
import trnetvisual.Parameter;
import trnetvisual.TrnetvisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnetvisual.impl.ParameterImpl#getExternalAttributeCalculationCallRef <em>External Attribute Calculation Call Ref</em>}</li>
 *   <li>{@link trnetvisual.impl.ParameterImpl#getExternalConditionCallRef <em>External Condition Call Ref</em>}</li>
 *   <li>{@link trnetvisual.impl.ParameterImpl#getExternalActionCallRef <em>External Action Call Ref</em>}</li>
 *   <li>{@link trnetvisual.impl.ParameterImpl#getExternalCalculationCallRef <em>External Calculation Call Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParameterImpl extends EObjectImpl implements Parameter
{
  /**
   * The cached value of the '{@link #getExternalAttributeCalculationCallRef() <em>External Attribute Calculation Call Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalAttributeCalculationCallRef()
   * @generated
   * @ordered
   */
  protected EList<ExternalAttributeCalculationCallParameter> externalAttributeCalculationCallRef;

  /**
   * The cached value of the '{@link #getExternalConditionCallRef() <em>External Condition Call Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalConditionCallRef()
   * @generated
   * @ordered
   */
  protected EList<ExternalConditionCallParameter> externalConditionCallRef;

  /**
   * The cached value of the '{@link #getExternalActionCallRef() <em>External Action Call Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalActionCallRef()
   * @generated
   * @ordered
   */
  protected EList<ExternalActionCallParameter> externalActionCallRef;

  /**
   * The cached value of the '{@link #getExternalCalculationCallRef() <em>External Calculation Call Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalCalculationCallRef()
   * @generated
   * @ordered
   */
  protected EList<ExternalCalculationCallParameter> externalCalculationCallRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return TrnetvisualPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalAttributeCalculationCallParameter> getExternalAttributeCalculationCallRef()
  {
    if (externalAttributeCalculationCallRef == null)
    {
      externalAttributeCalculationCallRef = new EObjectWithInverseResolvingEList<ExternalAttributeCalculationCallParameter>(ExternalAttributeCalculationCallParameter.class, this, TrnetvisualPackage.PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER__PARAMETER);
    }
    return externalAttributeCalculationCallRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalConditionCallParameter> getExternalConditionCallRef()
  {
    if (externalConditionCallRef == null)
    {
      externalConditionCallRef = new EObjectWithInverseResolvingEList<ExternalConditionCallParameter>(ExternalConditionCallParameter.class, this, TrnetvisualPackage.PARAMETER__EXTERNAL_CONDITION_CALL_REF, TrnetvisualPackage.EXTERNAL_CONDITION_CALL_PARAMETER__PARAMETER);
    }
    return externalConditionCallRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalActionCallParameter> getExternalActionCallRef()
  {
    if (externalActionCallRef == null)
    {
      externalActionCallRef = new EObjectWithInverseResolvingEList<ExternalActionCallParameter>(ExternalActionCallParameter.class, this, TrnetvisualPackage.PARAMETER__EXTERNAL_ACTION_CALL_REF, TrnetvisualPackage.EXTERNAL_ACTION_CALL_PARAMETER__PARAMETER);
    }
    return externalActionCallRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalCalculationCallParameter> getExternalCalculationCallRef()
  {
    if (externalCalculationCallRef == null)
    {
      externalCalculationCallRef = new EObjectWithInverseResolvingEList<ExternalCalculationCallParameter>(ExternalCalculationCallParameter.class, this, TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF, TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER);
    }
    return externalCalculationCallRef;
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
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getExternalAttributeCalculationCallRef()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CONDITION_CALL_REF:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getExternalConditionCallRef()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ACTION_CALL_REF:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getExternalActionCallRef()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getExternalCalculationCallRef()).basicAdd(otherEnd, msgs);
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
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF:
        return ((InternalEList<?>)getExternalAttributeCalculationCallRef()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CONDITION_CALL_REF:
        return ((InternalEList<?>)getExternalConditionCallRef()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ACTION_CALL_REF:
        return ((InternalEList<?>)getExternalActionCallRef()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF:
        return ((InternalEList<?>)getExternalCalculationCallRef()).basicRemove(otherEnd, msgs);
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
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF:
        return getExternalAttributeCalculationCallRef();
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CONDITION_CALL_REF:
        return getExternalConditionCallRef();
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ACTION_CALL_REF:
        return getExternalActionCallRef();
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF:
        return getExternalCalculationCallRef();
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
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF:
        getExternalAttributeCalculationCallRef().clear();
        getExternalAttributeCalculationCallRef().addAll((Collection<? extends ExternalAttributeCalculationCallParameter>)newValue);
        return;
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CONDITION_CALL_REF:
        getExternalConditionCallRef().clear();
        getExternalConditionCallRef().addAll((Collection<? extends ExternalConditionCallParameter>)newValue);
        return;
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ACTION_CALL_REF:
        getExternalActionCallRef().clear();
        getExternalActionCallRef().addAll((Collection<? extends ExternalActionCallParameter>)newValue);
        return;
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF:
        getExternalCalculationCallRef().clear();
        getExternalCalculationCallRef().addAll((Collection<? extends ExternalCalculationCallParameter>)newValue);
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
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF:
        getExternalAttributeCalculationCallRef().clear();
        return;
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CONDITION_CALL_REF:
        getExternalConditionCallRef().clear();
        return;
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ACTION_CALL_REF:
        getExternalActionCallRef().clear();
        return;
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF:
        getExternalCalculationCallRef().clear();
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
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF:
        return externalAttributeCalculationCallRef != null && !externalAttributeCalculationCallRef.isEmpty();
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CONDITION_CALL_REF:
        return externalConditionCallRef != null && !externalConditionCallRef.isEmpty();
      case TrnetvisualPackage.PARAMETER__EXTERNAL_ACTION_CALL_REF:
        return externalActionCallRef != null && !externalActionCallRef.isEmpty();
      case TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF:
        return externalCalculationCallRef != null && !externalCalculationCallRef.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ParameterImpl
