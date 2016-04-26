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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trnetvisual.AttributePattern;
import trnetvisual.ExternalAttributeCalculationCall;
import trnetvisual.ExternalAttributeCalculationCallParameter;
import trnetvisual.TrnetvisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Attribute Calculation Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnetvisual.impl.ExternalAttributeCalculationCallImpl#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.impl.ExternalAttributeCalculationCallImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link trnetvisual.impl.ExternalAttributeCalculationCallImpl#getResult <em>Result</em>}</li>
 *   <li>{@link trnetvisual.impl.ExternalAttributeCalculationCallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalAttributeCalculationCallImpl extends AttributeCalculationImpl implements ExternalAttributeCalculationCall
{
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
   * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIED_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected AttributePattern result;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ExternalAttributeCalculationCallParameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalAttributeCalculationCallImpl()
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
    return TrnetvisualPackage.Literals.EXTERNAL_ATTRIBUTE_CALCULATION_CALL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifiedName()
  {
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedName(String newQualifiedName)
  {
    String oldQualifiedName = qualifiedName;
    qualifiedName = newQualifiedName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributePattern getResult()
  {
    if (result != null && result.eIsProxy())
    {
      InternalEObject oldResult = (InternalEObject)result;
      result = (AttributePattern)eResolveProxy(oldResult);
      if (result != oldResult)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT, oldResult, result));
      }
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributePattern basicGetResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResult(AttributePattern newResult, NotificationChain msgs)
  {
    AttributePattern oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT, oldResult, newResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(AttributePattern newResult)
  {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL, AttributePattern.class, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL, AttributePattern.class, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalAttributeCalculationCallParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentWithInverseEList<ExternalAttributeCalculationCallParameter>(ExternalAttributeCalculationCallParameter.class, this, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER__OWNER);
    }
    return parameters;
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
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT:
        if (result != null)
          msgs = ((InternalEObject)result).eInverseRemove(this, TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL, AttributePattern.class, msgs);
        return basicSetResult((AttributePattern)otherEnd, msgs);
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
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
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT:
        return basicSetResult(null, msgs);
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__ID:
        return getId();
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__QUALIFIED_NAME:
        return getQualifiedName();
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT:
        if (resolve) return getResult();
        return basicGetResult();
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS:
        return getParameters();
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
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__ID:
        setId((String)newValue);
        return;
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__QUALIFIED_NAME:
        setQualifiedName((String)newValue);
        return;
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT:
        setResult((AttributePattern)newValue);
        return;
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ExternalAttributeCalculationCallParameter>)newValue);
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
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__ID:
        setId(ID_EDEFAULT);
        return;
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__QUALIFIED_NAME:
        setQualifiedName(QUALIFIED_NAME_EDEFAULT);
        return;
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT:
        setResult((AttributePattern)null);
        return;
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS:
        getParameters().clear();
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
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT:
        return result != null;
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
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
    result.append(", qualifiedName: ");
    result.append(qualifiedName);
    result.append(')');
    return result.toString();
  }

} //ExternalAttributeCalculationCallImpl
