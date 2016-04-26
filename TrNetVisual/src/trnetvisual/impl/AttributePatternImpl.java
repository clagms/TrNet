/**
 */
package trnetvisual.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import trnetvisual.AttributePattern;
import trnetvisual.ExternalAttributeCalculationCall;
import trnetvisual.NodePattern;
import trnetvisual.TrnetvisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnetvisual.impl.AttributePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link trnetvisual.impl.AttributePatternImpl#getAttributeExternalCalculationCall <em>Attribute External Calculation Call</em>}</li>
 *   <li>{@link trnetvisual.impl.AttributePatternImpl#getOwnerNode <em>Owner Node</em>}</li>
 *   <li>{@link trnetvisual.impl.AttributePatternImpl#getExpectedNumberOfDistinctValues <em>Expected Number Of Distinct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributePatternImpl extends ParameterImpl implements AttributePattern
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributeExternalCalculationCall() <em>Attribute External Calculation Call</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeExternalCalculationCall()
   * @generated
   * @ordered
   */
  protected ExternalAttributeCalculationCall attributeExternalCalculationCall;

  /**
   * The default value of the '{@link #getExpectedNumberOfDistinctValues() <em>Expected Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpectedNumberOfDistinctValues()
   * @generated
   * @ordered
   */
  protected static final double EXPECTED_NUMBER_OF_DISTINCT_VALUES_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getExpectedNumberOfDistinctValues() <em>Expected Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpectedNumberOfDistinctValues()
   * @generated
   * @ordered
   */
  protected double expectedNumberOfDistinctValues = EXPECTED_NUMBER_OF_DISTINCT_VALUES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributePatternImpl()
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
    return TrnetvisualPackage.Literals.ATTRIBUTE_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.ATTRIBUTE_PATTERN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalAttributeCalculationCall getAttributeExternalCalculationCall()
  {
    if (attributeExternalCalculationCall != null && attributeExternalCalculationCall.eIsProxy())
    {
      InternalEObject oldAttributeExternalCalculationCall = (InternalEObject)attributeExternalCalculationCall;
      attributeExternalCalculationCall = (ExternalAttributeCalculationCall)eResolveProxy(oldAttributeExternalCalculationCall);
      if (attributeExternalCalculationCall != oldAttributeExternalCalculationCall)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL, oldAttributeExternalCalculationCall, attributeExternalCalculationCall));
      }
    }
    return attributeExternalCalculationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalAttributeCalculationCall basicGetAttributeExternalCalculationCall()
  {
    return attributeExternalCalculationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeExternalCalculationCall(ExternalAttributeCalculationCall newAttributeExternalCalculationCall, NotificationChain msgs)
  {
    ExternalAttributeCalculationCall oldAttributeExternalCalculationCall = attributeExternalCalculationCall;
    attributeExternalCalculationCall = newAttributeExternalCalculationCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL, oldAttributeExternalCalculationCall, newAttributeExternalCalculationCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeExternalCalculationCall(ExternalAttributeCalculationCall newAttributeExternalCalculationCall)
  {
    if (newAttributeExternalCalculationCall != attributeExternalCalculationCall)
    {
      NotificationChain msgs = null;
      if (attributeExternalCalculationCall != null)
        msgs = ((InternalEObject)attributeExternalCalculationCall).eInverseRemove(this, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT, ExternalAttributeCalculationCall.class, msgs);
      if (newAttributeExternalCalculationCall != null)
        msgs = ((InternalEObject)newAttributeExternalCalculationCall).eInverseAdd(this, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT, ExternalAttributeCalculationCall.class, msgs);
      msgs = basicSetAttributeExternalCalculationCall(newAttributeExternalCalculationCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL, newAttributeExternalCalculationCall, newAttributeExternalCalculationCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodePattern getOwnerNode()
  {
    if (eContainerFeatureID() != TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE) return null;
    return (NodePattern)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnerNode(NodePattern newOwnerNode, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwnerNode, TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnerNode(NodePattern newOwnerNode)
  {
    if (newOwnerNode != eInternalContainer() || (eContainerFeatureID() != TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE && newOwnerNode != null))
    {
      if (EcoreUtil.isAncestor(this, newOwnerNode))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwnerNode != null)
        msgs = ((InternalEObject)newOwnerNode).eInverseAdd(this, TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES, NodePattern.class, msgs);
      msgs = basicSetOwnerNode(newOwnerNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE, newOwnerNode, newOwnerNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getExpectedNumberOfDistinctValues()
  {
    return expectedNumberOfDistinctValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpectedNumberOfDistinctValues(double newExpectedNumberOfDistinctValues)
  {
    double oldExpectedNumberOfDistinctValues = expectedNumberOfDistinctValues;
    expectedNumberOfDistinctValues = newExpectedNumberOfDistinctValues;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.ATTRIBUTE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES, oldExpectedNumberOfDistinctValues, expectedNumberOfDistinctValues));
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
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL:
        if (attributeExternalCalculationCall != null)
          msgs = ((InternalEObject)attributeExternalCalculationCall).eInverseRemove(this, TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT, ExternalAttributeCalculationCall.class, msgs);
        return basicSetAttributeExternalCalculationCall((ExternalAttributeCalculationCall)otherEnd, msgs);
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwnerNode((NodePattern)otherEnd, msgs);
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
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL:
        return basicSetAttributeExternalCalculationCall(null, msgs);
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE:
        return basicSetOwnerNode(null, msgs);
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
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE:
        return eInternalContainer().eInverseRemove(this, TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES, NodePattern.class, msgs);
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
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__NAME:
        return getName();
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL:
        if (resolve) return getAttributeExternalCalculationCall();
        return basicGetAttributeExternalCalculationCall();
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE:
        return getOwnerNode();
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES:
        return getExpectedNumberOfDistinctValues();
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
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__NAME:
        setName((String)newValue);
        return;
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL:
        setAttributeExternalCalculationCall((ExternalAttributeCalculationCall)newValue);
        return;
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE:
        setOwnerNode((NodePattern)newValue);
        return;
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES:
        setExpectedNumberOfDistinctValues((Double)newValue);
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
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL:
        setAttributeExternalCalculationCall((ExternalAttributeCalculationCall)null);
        return;
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE:
        setOwnerNode((NodePattern)null);
        return;
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES:
        setExpectedNumberOfDistinctValues(EXPECTED_NUMBER_OF_DISTINCT_VALUES_EDEFAULT);
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
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL:
        return attributeExternalCalculationCall != null;
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE:
        return getOwnerNode() != null;
      case TrnetvisualPackage.ATTRIBUTE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES:
        return expectedNumberOfDistinctValues != EXPECTED_NUMBER_OF_DISTINCT_VALUES_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", expectedNumberOfDistinctValues: ");
    result.append(expectedNumberOfDistinctValues);
    result.append(')');
    return result.toString();
  }

} //AttributePatternImpl
