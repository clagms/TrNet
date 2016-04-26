/**
 */
package trnet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import trnet.EdgePattern;
import trnet.NodePattern;
import trnet.Pattern;
import trnet.TrnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnet.impl.EdgePatternImpl#getSource <em>Source</em>}</li>
 *   <li>{@link trnet.impl.EdgePatternImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link trnet.impl.EdgePatternImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnet.impl.EdgePatternImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgePatternImpl extends EObjectImpl implements EdgePattern
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected NodePattern source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected NodePattern target;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgePatternImpl()
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
    return TrnetPackage.Literals.EDGE_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodePattern getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (NodePattern)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrnetPackage.EDGE_PATTERN__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodePattern basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(NodePattern newSource, NotificationChain msgs)
  {
    NodePattern oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrnetPackage.EDGE_PATTERN__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(NodePattern newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, TrnetPackage.NODE_PATTERN__OUTGOING, NodePattern.class, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, TrnetPackage.NODE_PATTERN__OUTGOING, NodePattern.class, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.EDGE_PATTERN__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodePattern getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (NodePattern)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrnetPackage.EDGE_PATTERN__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodePattern basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(NodePattern newTarget, NotificationChain msgs)
  {
    NodePattern oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrnetPackage.EDGE_PATTERN__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(NodePattern newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, TrnetPackage.NODE_PATTERN__INCOMING, NodePattern.class, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, TrnetPackage.NODE_PATTERN__INCOMING, NodePattern.class, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.EDGE_PATTERN__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern getPattern()
  {
    if (eContainerFeatureID() != TrnetPackage.EDGE_PATTERN__PATTERN) return null;
    return (Pattern)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newPattern, TrnetPackage.EDGE_PATTERN__PATTERN, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(Pattern newPattern)
  {
    if (newPattern != eInternalContainer() || (eContainerFeatureID() != TrnetPackage.EDGE_PATTERN__PATTERN && newPattern != null))
    {
      if (EcoreUtil.isAncestor(this, newPattern))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, TrnetPackage.PATTERN__EDGES, Pattern.class, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.EDGE_PATTERN__PATTERN, newPattern, newPattern));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.EDGE_PATTERN__NAME, oldName, name));
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
      case TrnetPackage.EDGE_PATTERN__SOURCE:
        if (source != null)
          msgs = ((InternalEObject)source).eInverseRemove(this, TrnetPackage.NODE_PATTERN__OUTGOING, NodePattern.class, msgs);
        return basicSetSource((NodePattern)otherEnd, msgs);
      case TrnetPackage.EDGE_PATTERN__TARGET:
        if (target != null)
          msgs = ((InternalEObject)target).eInverseRemove(this, TrnetPackage.NODE_PATTERN__INCOMING, NodePattern.class, msgs);
        return basicSetTarget((NodePattern)otherEnd, msgs);
      case TrnetPackage.EDGE_PATTERN__PATTERN:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetPattern((Pattern)otherEnd, msgs);
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
      case TrnetPackage.EDGE_PATTERN__SOURCE:
        return basicSetSource(null, msgs);
      case TrnetPackage.EDGE_PATTERN__TARGET:
        return basicSetTarget(null, msgs);
      case TrnetPackage.EDGE_PATTERN__PATTERN:
        return basicSetPattern(null, msgs);
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
      case TrnetPackage.EDGE_PATTERN__PATTERN:
        return eInternalContainer().eInverseRemove(this, TrnetPackage.PATTERN__EDGES, Pattern.class, msgs);
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
      case TrnetPackage.EDGE_PATTERN__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case TrnetPackage.EDGE_PATTERN__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case TrnetPackage.EDGE_PATTERN__PATTERN:
        return getPattern();
      case TrnetPackage.EDGE_PATTERN__NAME:
        return getName();
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
      case TrnetPackage.EDGE_PATTERN__SOURCE:
        setSource((NodePattern)newValue);
        return;
      case TrnetPackage.EDGE_PATTERN__TARGET:
        setTarget((NodePattern)newValue);
        return;
      case TrnetPackage.EDGE_PATTERN__PATTERN:
        setPattern((Pattern)newValue);
        return;
      case TrnetPackage.EDGE_PATTERN__NAME:
        setName((String)newValue);
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
      case TrnetPackage.EDGE_PATTERN__SOURCE:
        setSource((NodePattern)null);
        return;
      case TrnetPackage.EDGE_PATTERN__TARGET:
        setTarget((NodePattern)null);
        return;
      case TrnetPackage.EDGE_PATTERN__PATTERN:
        setPattern((Pattern)null);
        return;
      case TrnetPackage.EDGE_PATTERN__NAME:
        setName(NAME_EDEFAULT);
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
      case TrnetPackage.EDGE_PATTERN__SOURCE:
        return source != null;
      case TrnetPackage.EDGE_PATTERN__TARGET:
        return target != null;
      case TrnetPackage.EDGE_PATTERN__PATTERN:
        return getPattern() != null;
      case TrnetPackage.EDGE_PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(')');
    return result.toString();
  }

} //EdgePatternImpl
