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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import trnet.AttributePattern;
import trnet.Different;
import trnet.EdgePattern;
import trnet.Keep;
import trnet.NodePattern;
import trnet.Pattern;
import trnet.Same;
import trnet.TrnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnet.impl.NodePatternImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getSameOut <em>Same Out</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getSameIn <em>Same In</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getId <em>Id</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getDifferentIn <em>Different In</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getDifferentOut <em>Different Out</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getKeepIn <em>Keep In</em>}</li>
 *   <li>{@link trnet.impl.NodePatternImpl#getKeepOut <em>Keep Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodePatternImpl extends EObjectImpl implements NodePattern
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
    return TrnetPackage.Literals.NODE_PATTERN;
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
      incoming = new EObjectWithInverseResolvingEList<EdgePattern>(EdgePattern.class, this, TrnetPackage.NODE_PATTERN__INCOMING, TrnetPackage.EDGE_PATTERN__TARGET);
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
      outgoing = new EObjectWithInverseResolvingEList<EdgePattern>(EdgePattern.class, this, TrnetPackage.NODE_PATTERN__OUTGOING, TrnetPackage.EDGE_PATTERN__SOURCE);
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
      sameOut = new EObjectWithInverseResolvingEList<Same>(Same.class, this, TrnetPackage.NODE_PATTERN__SAME_OUT, TrnetPackage.SAME__SOURCE);
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
      sameIn = new EObjectWithInverseResolvingEList<Same>(Same.class, this, TrnetPackage.NODE_PATTERN__SAME_IN, TrnetPackage.SAME__TARGET);
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
    if (eContainerFeatureID() != TrnetPackage.NODE_PATTERN__PATTERN) return null;
    return (Pattern)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPattern, TrnetPackage.NODE_PATTERN__PATTERN, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(Pattern newPattern)
  {
    if (newPattern != eInternalContainer() || (eContainerFeatureID() != TrnetPackage.NODE_PATTERN__PATTERN && newPattern != null))
    {
      if (EcoreUtil.isAncestor(this, newPattern))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, TrnetPackage.PATTERN__NODES, Pattern.class, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.NODE_PATTERN__PATTERN, newPattern, newPattern));
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
      attributes = new EObjectContainmentEList<AttributePattern>(AttributePattern.class, this, TrnetPackage.NODE_PATTERN__ATTRIBUTES);
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.NODE_PATTERN__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.NODE_PATTERN__ID, oldId, id));
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
      differentIn = new EObjectWithInverseResolvingEList<Different>(Different.class, this, TrnetPackage.NODE_PATTERN__DIFFERENT_IN, TrnetPackage.DIFFERENT__TARGET);
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
      differentOut = new EObjectWithInverseResolvingEList<Different>(Different.class, this, TrnetPackage.NODE_PATTERN__DIFFERENT_OUT, TrnetPackage.DIFFERENT__SOURCE);
    }
    return differentOut;
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
      keepIn = new EObjectWithInverseResolvingEList<Keep>(Keep.class, this, TrnetPackage.NODE_PATTERN__KEEP_IN, TrnetPackage.KEEP__TARGET);
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
      keepOut = new EObjectWithInverseResolvingEList<Keep>(Keep.class, this, TrnetPackage.NODE_PATTERN__KEEP_OUT, TrnetPackage.KEEP__SOURCE);
    }
    return keepOut;
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
      case TrnetPackage.NODE_PATTERN__INCOMING:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__OUTGOING:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__SAME_OUT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSameOut()).basicAdd(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__SAME_IN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSameIn()).basicAdd(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__PATTERN:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetPattern((Pattern)otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__DIFFERENT_IN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getDifferentIn()).basicAdd(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__DIFFERENT_OUT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getDifferentOut()).basicAdd(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__KEEP_IN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getKeepIn()).basicAdd(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__KEEP_OUT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getKeepOut()).basicAdd(otherEnd, msgs);
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
      case TrnetPackage.NODE_PATTERN__INCOMING:
        return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__OUTGOING:
        return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__SAME_OUT:
        return ((InternalEList<?>)getSameOut()).basicRemove(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__SAME_IN:
        return ((InternalEList<?>)getSameIn()).basicRemove(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__PATTERN:
        return basicSetPattern(null, msgs);
      case TrnetPackage.NODE_PATTERN__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__DIFFERENT_IN:
        return ((InternalEList<?>)getDifferentIn()).basicRemove(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__DIFFERENT_OUT:
        return ((InternalEList<?>)getDifferentOut()).basicRemove(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__KEEP_IN:
        return ((InternalEList<?>)getKeepIn()).basicRemove(otherEnd, msgs);
      case TrnetPackage.NODE_PATTERN__KEEP_OUT:
        return ((InternalEList<?>)getKeepOut()).basicRemove(otherEnd, msgs);
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
      case TrnetPackage.NODE_PATTERN__PATTERN:
        return eInternalContainer().eInverseRemove(this, TrnetPackage.PATTERN__NODES, Pattern.class, msgs);
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
      case TrnetPackage.NODE_PATTERN__INCOMING:
        return getIncoming();
      case TrnetPackage.NODE_PATTERN__OUTGOING:
        return getOutgoing();
      case TrnetPackage.NODE_PATTERN__SAME_OUT:
        return getSameOut();
      case TrnetPackage.NODE_PATTERN__SAME_IN:
        return getSameIn();
      case TrnetPackage.NODE_PATTERN__PATTERN:
        return getPattern();
      case TrnetPackage.NODE_PATTERN__ATTRIBUTES:
        return getAttributes();
      case TrnetPackage.NODE_PATTERN__NAME:
        return getName();
      case TrnetPackage.NODE_PATTERN__ID:
        return getId();
      case TrnetPackage.NODE_PATTERN__DIFFERENT_IN:
        return getDifferentIn();
      case TrnetPackage.NODE_PATTERN__DIFFERENT_OUT:
        return getDifferentOut();
      case TrnetPackage.NODE_PATTERN__KEEP_IN:
        return getKeepIn();
      case TrnetPackage.NODE_PATTERN__KEEP_OUT:
        return getKeepOut();
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
      case TrnetPackage.NODE_PATTERN__INCOMING:
        getIncoming().clear();
        getIncoming().addAll((Collection<? extends EdgePattern>)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__OUTGOING:
        getOutgoing().clear();
        getOutgoing().addAll((Collection<? extends EdgePattern>)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__SAME_OUT:
        getSameOut().clear();
        getSameOut().addAll((Collection<? extends Same>)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__SAME_IN:
        getSameIn().clear();
        getSameIn().addAll((Collection<? extends Same>)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__PATTERN:
        setPattern((Pattern)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AttributePattern>)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__NAME:
        setName((String)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__ID:
        setId((String)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__DIFFERENT_IN:
        getDifferentIn().clear();
        getDifferentIn().addAll((Collection<? extends Different>)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__DIFFERENT_OUT:
        getDifferentOut().clear();
        getDifferentOut().addAll((Collection<? extends Different>)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__KEEP_IN:
        getKeepIn().clear();
        getKeepIn().addAll((Collection<? extends Keep>)newValue);
        return;
      case TrnetPackage.NODE_PATTERN__KEEP_OUT:
        getKeepOut().clear();
        getKeepOut().addAll((Collection<? extends Keep>)newValue);
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
      case TrnetPackage.NODE_PATTERN__INCOMING:
        getIncoming().clear();
        return;
      case TrnetPackage.NODE_PATTERN__OUTGOING:
        getOutgoing().clear();
        return;
      case TrnetPackage.NODE_PATTERN__SAME_OUT:
        getSameOut().clear();
        return;
      case TrnetPackage.NODE_PATTERN__SAME_IN:
        getSameIn().clear();
        return;
      case TrnetPackage.NODE_PATTERN__PATTERN:
        setPattern((Pattern)null);
        return;
      case TrnetPackage.NODE_PATTERN__ATTRIBUTES:
        getAttributes().clear();
        return;
      case TrnetPackage.NODE_PATTERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TrnetPackage.NODE_PATTERN__ID:
        setId(ID_EDEFAULT);
        return;
      case TrnetPackage.NODE_PATTERN__DIFFERENT_IN:
        getDifferentIn().clear();
        return;
      case TrnetPackage.NODE_PATTERN__DIFFERENT_OUT:
        getDifferentOut().clear();
        return;
      case TrnetPackage.NODE_PATTERN__KEEP_IN:
        getKeepIn().clear();
        return;
      case TrnetPackage.NODE_PATTERN__KEEP_OUT:
        getKeepOut().clear();
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
      case TrnetPackage.NODE_PATTERN__INCOMING:
        return incoming != null && !incoming.isEmpty();
      case TrnetPackage.NODE_PATTERN__OUTGOING:
        return outgoing != null && !outgoing.isEmpty();
      case TrnetPackage.NODE_PATTERN__SAME_OUT:
        return sameOut != null && !sameOut.isEmpty();
      case TrnetPackage.NODE_PATTERN__SAME_IN:
        return sameIn != null && !sameIn.isEmpty();
      case TrnetPackage.NODE_PATTERN__PATTERN:
        return getPattern() != null;
      case TrnetPackage.NODE_PATTERN__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case TrnetPackage.NODE_PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TrnetPackage.NODE_PATTERN__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case TrnetPackage.NODE_PATTERN__DIFFERENT_IN:
        return differentIn != null && !differentIn.isEmpty();
      case TrnetPackage.NODE_PATTERN__DIFFERENT_OUT:
        return differentOut != null && !differentOut.isEmpty();
      case TrnetPackage.NODE_PATTERN__KEEP_IN:
        return keepIn != null && !keepIn.isEmpty();
      case TrnetPackage.NODE_PATTERN__KEEP_OUT:
        return keepOut != null && !keepOut.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //NodePatternImpl
