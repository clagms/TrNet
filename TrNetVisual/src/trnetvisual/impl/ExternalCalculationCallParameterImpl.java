/**
 */
package trnetvisual.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import trnetvisual.ExternalCalculationCall;
import trnetvisual.ExternalCalculationCallParameter;
import trnetvisual.Parameter;
import trnetvisual.TrnetvisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Calculation Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnetvisual.impl.ExternalCalculationCallParameterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link trnetvisual.impl.ExternalCalculationCallParameterImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalCalculationCallParameterImpl extends ParameterRefImpl implements ExternalCalculationCallParameter
{
  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected Parameter parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalCalculationCallParameterImpl()
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
    return TrnetvisualPackage.Literals.EXTERNAL_CALCULATION_CALL_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalCalculationCall getOwner()
  {
    if (eContainerFeatureID() != TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER) return null;
    return (ExternalCalculationCall)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwner(ExternalCalculationCall newOwner, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwner, TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwner(ExternalCalculationCall newOwner)
  {
    if (newOwner != eInternalContainer() || (eContainerFeatureID() != TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER && newOwner != null))
    {
      if (EcoreUtil.isAncestor(this, newOwner))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwner != null)
        msgs = ((InternalEObject)newOwner).eInverseAdd(this, TrnetvisualPackage.EXTERNAL_CALCULATION_CALL__PARAMETERS, ExternalCalculationCall.class, msgs);
      msgs = basicSetOwner(newOwner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER, newOwner, newOwner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParameter()
  {
    if (parameter != null && parameter.eIsProxy())
    {
      InternalEObject oldParameter = (InternalEObject)parameter;
      parameter = (Parameter)eResolveProxy(oldParameter);
      if (parameter != oldParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER, oldParameter, parameter));
      }
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs)
  {
    Parameter oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER, oldParameter, newParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(Parameter newParameter)
  {
    if (newParameter != parameter)
    {
      NotificationChain msgs = null;
      if (parameter != null)
        msgs = ((InternalEObject)parameter).eInverseRemove(this, TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF, Parameter.class, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF, Parameter.class, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER, newParameter, newParameter));
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
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwner((ExternalCalculationCall)otherEnd, msgs);
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER:
        if (parameter != null)
          msgs = ((InternalEObject)parameter).eInverseRemove(this, TrnetvisualPackage.PARAMETER__EXTERNAL_CALCULATION_CALL_REF, Parameter.class, msgs);
        return basicSetParameter((Parameter)otherEnd, msgs);
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
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER:
        return basicSetOwner(null, msgs);
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER:
        return basicSetParameter(null, msgs);
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
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER:
        return eInternalContainer().eInverseRemove(this, TrnetvisualPackage.EXTERNAL_CALCULATION_CALL__PARAMETERS, ExternalCalculationCall.class, msgs);
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
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER:
        return getOwner();
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER:
        if (resolve) return getParameter();
        return basicGetParameter();
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
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER:
        setOwner((ExternalCalculationCall)newValue);
        return;
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER:
        setParameter((Parameter)newValue);
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
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER:
        setOwner((ExternalCalculationCall)null);
        return;
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER:
        setParameter((Parameter)null);
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
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER:
        return getOwner() != null;
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER:
        return parameter != null;
    }
    return super.eIsSet(featureID);
  }

} //ExternalCalculationCallParameterImpl
