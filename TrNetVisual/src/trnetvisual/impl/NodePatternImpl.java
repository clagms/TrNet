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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import trnetvisual.AttributePattern;
import trnetvisual.Different;
import trnetvisual.EdgePattern;
import trnetvisual.Keep;
import trnetvisual.NodePattern;
import trnetvisual.Pattern;
import trnetvisual.Same;
import trnetvisual.TrnetvisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getSameOut <em>Same Out</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getSameIn <em>Same In</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getKeepIn <em>Keep In</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getKeepOut <em>Keep Out</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getDifferentIn <em>Different In</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getDifferentOut <em>Different Out</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.impl.NodePatternImpl#getExpectedNumberOfDistinctValues <em>Expected Number Of Distinct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodePatternImpl extends ParameterImpl implements NodePattern
{
  /**
   * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncoming()
   * @generated
   * @ordered
   */
  protected EList<EdgePattern> incoming;

  /**
   * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoing()
   * @generated
   * @ordered
   */
  protected EList<EdgePattern> outgoing;

  /**
   * The cached value of the '{@link #getSameOut() <em>Same Out</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSameOut()
   * @generated
   * @ordered
   */
  protected EList<Same> sameOut;

  /**
   * The cached value of the '{@link #getSameIn() <em>Same In</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSameIn()
   * @generated
   * @ordered
   */
  protected EList<Same> sameIn;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<AttributePattern> attributes;

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
   * The cached value of the '{@link #getKeepIn() <em>Keep In</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeepIn()
   * @generated
   * @ordered
   */
  protected EList<Keep> keepIn;

  /**
   * The cached value of the '{@link #getKeepOut() <em>Keep Out</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeepOut()
   * @generated
   * @ordered
   */
  protected EList<Keep> keepOut;

  /**
   * The cached value of the '{@link #getDifferentIn() <em>Different In</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifferentIn()
   * @generated
   * @ordered
   */
  protected EList<Different> differentIn;

  /**
   * The cached value of the '{@link #getDifferentOut() <em>Different Out</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifferentOut()
   * @generated
   * @ordered
   */
  protected EList<Different> differentOut;

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
  protected NodePatternImpl()
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
    return TrnetvisualPackage.Literals.NODE_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EdgePattern> getIncoming()
  {
    if (incoming == null)
    {
      incoming = new EObjectWithInverseResolvingEList<EdgePattern>(EdgePattern.class, this, TrnetvisualPackage.NODE_PATTERN__INCOMING, TrnetvisualPackage.EDGE_PATTERN__TARGET);
    }
    return incoming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EdgePattern> getOutgoing()
  {
    if (outgoing == null)
    {
      outgoing = new EObjectWithInverseResolvingEList<EdgePattern>(EdgePattern.class, this, TrnetvisualPackage.NODE_PATTERN__OUTGOING, TrnetvisualPackage.EDGE_PATTERN__SOURCE);
    }
    return outgoing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Same> getSameOut()
  {
    if (sameOut == null)
    {
      sameOut = new EObjectWithInverseResolvingEList<Same>(Same.class, this, TrnetvisualPackage.NODE_PATTERN__SAME_OUT, TrnetvisualPackage.SAME__SOURCE);
    }
    return sameOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Same> getSameIn()
  {
    if (sameIn == null)
    {
      sameIn = new EObjectWithInverseResolvingEList<Same>(Same.class, this, TrnetvisualPackage.NODE_PATTERN__SAME_IN, TrnetvisualPackage.SAME__TARGET);
    }
    return sameIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern getPattern()
  {
    if (eContainerFeatureID() != TrnetvisualPackage.NODE_PATTERN__PATTERN) return null;
    return (Pattern)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPattern, TrnetvisualPackage.NODE_PATTERN__PATTERN, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(Pattern newPattern)
  {
    if (newPattern != eInternalContainer() || (eContainerFeatureID() != TrnetvisualPackage.NODE_PATTERN__PATTERN && newPattern != null))
    {
      if (EcoreUtil.isAncestor(this, newPattern))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, TrnetvisualPackage.PATTERN__NODES, Pattern.class, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.NODE_PATTERN__PATTERN, newPattern, newPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributePattern> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentWithInverseEList<AttributePattern>(AttributePattern.class, this, TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES, TrnetvisualPackage.ATTRIBUTE_PATTERN__OWNER_NODE);
    }
    return attributes;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.NODE_PATTERN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Keep> getKeepIn()
  {
    if (keepIn == null)
    {
      keepIn = new EObjectWithInverseResolvingEList<Keep>(Keep.class, this, TrnetvisualPackage.NODE_PATTERN__KEEP_IN, TrnetvisualPackage.KEEP__TARGET);
    }
    return keepIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Keep> getKeepOut()
  {
    if (keepOut == null)
    {
      keepOut = new EObjectWithInverseResolvingEList<Keep>(Keep.class, this, TrnetvisualPackage.NODE_PATTERN__KEEP_OUT, TrnetvisualPackage.KEEP__SOURCE);
    }
    return keepOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Different> getDifferentIn()
  {
    if (differentIn == null)
    {
      differentIn = new EObjectWithInverseResolvingEList<Different>(Different.class, this, TrnetvisualPackage.NODE_PATTERN__DIFFERENT_IN, TrnetvisualPackage.DIFFERENT__TARGET);
    }
    return differentIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Different> getDifferentOut()
  {
    if (differentOut == null)
    {
      differentOut = new EObjectWithInverseResolvingEList<Different>(Different.class, this, TrnetvisualPackage.NODE_PATTERN__DIFFERENT_OUT, TrnetvisualPackage.DIFFERENT__SOURCE);
    }
    return differentOut;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.NODE_PATTERN__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES, oldExpectedNumberOfDistinctValues, expectedNumberOfDistinctValues));
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
      case TrnetvisualPackage.NODE_PATTERN__INCOMING:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__OUTGOING:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__SAME_OUT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSameOut()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__SAME_IN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSameIn()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__PATTERN:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetPattern((Pattern)otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__KEEP_IN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getKeepIn()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__KEEP_OUT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getKeepOut()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_IN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getDifferentIn()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_OUT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getDifferentOut()).basicAdd(otherEnd, msgs);
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
      case TrnetvisualPackage.NODE_PATTERN__INCOMING:
        return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__OUTGOING:
        return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__SAME_OUT:
        return ((InternalEList<?>)getSameOut()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__SAME_IN:
        return ((InternalEList<?>)getSameIn()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__PATTERN:
        return basicSetPattern(null, msgs);
      case TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__KEEP_IN:
        return ((InternalEList<?>)getKeepIn()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__KEEP_OUT:
        return ((InternalEList<?>)getKeepOut()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_IN:
        return ((InternalEList<?>)getDifferentIn()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_OUT:
        return ((InternalEList<?>)getDifferentOut()).basicRemove(otherEnd, msgs);
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
      case TrnetvisualPackage.NODE_PATTERN__PATTERN:
        return eInternalContainer().eInverseRemove(this, TrnetvisualPackage.PATTERN__NODES, Pattern.class, msgs);
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
      case TrnetvisualPackage.NODE_PATTERN__INCOMING:
        return getIncoming();
      case TrnetvisualPackage.NODE_PATTERN__OUTGOING:
        return getOutgoing();
      case TrnetvisualPackage.NODE_PATTERN__SAME_OUT:
        return getSameOut();
      case TrnetvisualPackage.NODE_PATTERN__SAME_IN:
        return getSameIn();
      case TrnetvisualPackage.NODE_PATTERN__PATTERN:
        return getPattern();
      case TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES:
        return getAttributes();
      case TrnetvisualPackage.NODE_PATTERN__NAME:
        return getName();
      case TrnetvisualPackage.NODE_PATTERN__KEEP_IN:
        return getKeepIn();
      case TrnetvisualPackage.NODE_PATTERN__KEEP_OUT:
        return getKeepOut();
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_IN:
        return getDifferentIn();
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_OUT:
        return getDifferentOut();
      case TrnetvisualPackage.NODE_PATTERN__ID:
        return getId();
      case TrnetvisualPackage.NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES:
        return getExpectedNumberOfDistinctValues();
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
      case TrnetvisualPackage.NODE_PATTERN__INCOMING:
        getIncoming().clear();
        getIncoming().addAll((Collection<? extends EdgePattern>)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__OUTGOING:
        getOutgoing().clear();
        getOutgoing().addAll((Collection<? extends EdgePattern>)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__SAME_OUT:
        getSameOut().clear();
        getSameOut().addAll((Collection<? extends Same>)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__SAME_IN:
        getSameIn().clear();
        getSameIn().addAll((Collection<? extends Same>)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__PATTERN:
        setPattern((Pattern)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AttributePattern>)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__NAME:
        setName((String)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__KEEP_IN:
        getKeepIn().clear();
        getKeepIn().addAll((Collection<? extends Keep>)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__KEEP_OUT:
        getKeepOut().clear();
        getKeepOut().addAll((Collection<? extends Keep>)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_IN:
        getDifferentIn().clear();
        getDifferentIn().addAll((Collection<? extends Different>)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_OUT:
        getDifferentOut().clear();
        getDifferentOut().addAll((Collection<? extends Different>)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__ID:
        setId((String)newValue);
        return;
      case TrnetvisualPackage.NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES:
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
      case TrnetvisualPackage.NODE_PATTERN__INCOMING:
        getIncoming().clear();
        return;
      case TrnetvisualPackage.NODE_PATTERN__OUTGOING:
        getOutgoing().clear();
        return;
      case TrnetvisualPackage.NODE_PATTERN__SAME_OUT:
        getSameOut().clear();
        return;
      case TrnetvisualPackage.NODE_PATTERN__SAME_IN:
        getSameIn().clear();
        return;
      case TrnetvisualPackage.NODE_PATTERN__PATTERN:
        setPattern((Pattern)null);
        return;
      case TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES:
        getAttributes().clear();
        return;
      case TrnetvisualPackage.NODE_PATTERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TrnetvisualPackage.NODE_PATTERN__KEEP_IN:
        getKeepIn().clear();
        return;
      case TrnetvisualPackage.NODE_PATTERN__KEEP_OUT:
        getKeepOut().clear();
        return;
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_IN:
        getDifferentIn().clear();
        return;
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_OUT:
        getDifferentOut().clear();
        return;
      case TrnetvisualPackage.NODE_PATTERN__ID:
        setId(ID_EDEFAULT);
        return;
      case TrnetvisualPackage.NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES:
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
      case TrnetvisualPackage.NODE_PATTERN__INCOMING:
        return incoming != null && !incoming.isEmpty();
      case TrnetvisualPackage.NODE_PATTERN__OUTGOING:
        return outgoing != null && !outgoing.isEmpty();
      case TrnetvisualPackage.NODE_PATTERN__SAME_OUT:
        return sameOut != null && !sameOut.isEmpty();
      case TrnetvisualPackage.NODE_PATTERN__SAME_IN:
        return sameIn != null && !sameIn.isEmpty();
      case TrnetvisualPackage.NODE_PATTERN__PATTERN:
        return getPattern() != null;
      case TrnetvisualPackage.NODE_PATTERN__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case TrnetvisualPackage.NODE_PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TrnetvisualPackage.NODE_PATTERN__KEEP_IN:
        return keepIn != null && !keepIn.isEmpty();
      case TrnetvisualPackage.NODE_PATTERN__KEEP_OUT:
        return keepOut != null && !keepOut.isEmpty();
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_IN:
        return differentIn != null && !differentIn.isEmpty();
      case TrnetvisualPackage.NODE_PATTERN__DIFFERENT_OUT:
        return differentOut != null && !differentOut.isEmpty();
      case TrnetvisualPackage.NODE_PATTERN__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case TrnetvisualPackage.NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES:
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
    result.append(", id: ");
    result.append(id);
    result.append(", expectedNumberOfDistinctValues: ");
    result.append(expectedNumberOfDistinctValues);
    result.append(')');
    return result.toString();
  }

} //NodePatternImpl
