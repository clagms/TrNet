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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trnetvisual.EdgePattern;
import trnetvisual.NodePattern;
import trnetvisual.Operand;
import trnetvisual.Pattern;
import trnetvisual.Result;
import trnetvisual.TrnetvisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnetvisual.impl.PatternImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link trnetvisual.impl.PatternImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link trnetvisual.impl.PatternImpl#getIncomingResults <em>Incoming Results</em>}</li>
 *   <li>{@link trnetvisual.impl.PatternImpl#getOutgoingOperands <em>Outgoing Operands</em>}</li>
 *   <li>{@link trnetvisual.impl.PatternImpl#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.impl.PatternImpl#getExpected_size <em>Expected size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternImpl extends EObjectImpl implements Pattern
{
  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<NodePattern> nodes;

  /**
   * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdges()
   * @generated
   * @ordered
   */
  protected EList<EdgePattern> edges;

  /**
   * The cached value of the '{@link #getIncomingResults() <em>Incoming Results</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomingResults()
   * @generated
   * @ordered
   */
  protected EList<Result> incomingResults;

  /**
   * The cached value of the '{@link #getOutgoingOperands() <em>Outgoing Operands</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingOperands()
   * @generated
   * @ordered
   */
  protected EList<Operand> outgoingOperands;

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
   * The default value of the '{@link #getExpected_size() <em>Expected size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpected_size()
   * @generated
   * @ordered
   */
  protected static final double EXPECTED_SIZE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getExpected_size() <em>Expected size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpected_size()
   * @generated
   * @ordered
   */
  protected double expected_size = EXPECTED_SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternImpl()
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
    return TrnetvisualPackage.Literals.PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodePattern> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentWithInverseEList<NodePattern>(NodePattern.class, this, TrnetvisualPackage.PATTERN__NODES, TrnetvisualPackage.NODE_PATTERN__PATTERN);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EdgePattern> getEdges()
  {
    if (edges == null)
    {
      edges = new EObjectContainmentWithInverseEList<EdgePattern>(EdgePattern.class, this, TrnetvisualPackage.PATTERN__EDGES, TrnetvisualPackage.EDGE_PATTERN__PATTERN);
    }
    return edges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Result> getIncomingResults()
  {
    if (incomingResults == null)
    {
      incomingResults = new EObjectWithInverseResolvingEList<Result>(Result.class, this, TrnetvisualPackage.PATTERN__INCOMING_RESULTS, TrnetvisualPackage.RESULT__PATTERN);
    }
    return incomingResults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operand> getOutgoingOperands()
  {
    if (outgoingOperands == null)
    {
      outgoingOperands = new EObjectWithInverseResolvingEList<Operand>(Operand.class, this, TrnetvisualPackage.PATTERN__OUTGOING_OPERANDS, TrnetvisualPackage.OPERAND__PATTERN);
    }
    return outgoingOperands;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.PATTERN__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getExpected_size()
  {
    return expected_size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpected_size(double newExpected_size)
  {
    double oldExpected_size = expected_size;
    expected_size = newExpected_size;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetvisualPackage.PATTERN__EXPECTED_SIZE, oldExpected_size, expected_size));
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
      case TrnetvisualPackage.PATTERN__NODES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.PATTERN__EDGES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdges()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.PATTERN__INCOMING_RESULTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingResults()).basicAdd(otherEnd, msgs);
      case TrnetvisualPackage.PATTERN__OUTGOING_OPERANDS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingOperands()).basicAdd(otherEnd, msgs);
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
      case TrnetvisualPackage.PATTERN__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.PATTERN__EDGES:
        return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.PATTERN__INCOMING_RESULTS:
        return ((InternalEList<?>)getIncomingResults()).basicRemove(otherEnd, msgs);
      case TrnetvisualPackage.PATTERN__OUTGOING_OPERANDS:
        return ((InternalEList<?>)getOutgoingOperands()).basicRemove(otherEnd, msgs);
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
      case TrnetvisualPackage.PATTERN__NODES:
        return getNodes();
      case TrnetvisualPackage.PATTERN__EDGES:
        return getEdges();
      case TrnetvisualPackage.PATTERN__INCOMING_RESULTS:
        return getIncomingResults();
      case TrnetvisualPackage.PATTERN__OUTGOING_OPERANDS:
        return getOutgoingOperands();
      case TrnetvisualPackage.PATTERN__ID:
        return getId();
      case TrnetvisualPackage.PATTERN__EXPECTED_SIZE:
        return getExpected_size();
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
      case TrnetvisualPackage.PATTERN__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends NodePattern>)newValue);
        return;
      case TrnetvisualPackage.PATTERN__EDGES:
        getEdges().clear();
        getEdges().addAll((Collection<? extends EdgePattern>)newValue);
        return;
      case TrnetvisualPackage.PATTERN__INCOMING_RESULTS:
        getIncomingResults().clear();
        getIncomingResults().addAll((Collection<? extends Result>)newValue);
        return;
      case TrnetvisualPackage.PATTERN__OUTGOING_OPERANDS:
        getOutgoingOperands().clear();
        getOutgoingOperands().addAll((Collection<? extends Operand>)newValue);
        return;
      case TrnetvisualPackage.PATTERN__ID:
        setId((String)newValue);
        return;
      case TrnetvisualPackage.PATTERN__EXPECTED_SIZE:
        setExpected_size((Double)newValue);
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
      case TrnetvisualPackage.PATTERN__NODES:
        getNodes().clear();
        return;
      case TrnetvisualPackage.PATTERN__EDGES:
        getEdges().clear();
        return;
      case TrnetvisualPackage.PATTERN__INCOMING_RESULTS:
        getIncomingResults().clear();
        return;
      case TrnetvisualPackage.PATTERN__OUTGOING_OPERANDS:
        getOutgoingOperands().clear();
        return;
      case TrnetvisualPackage.PATTERN__ID:
        setId(ID_EDEFAULT);
        return;
      case TrnetvisualPackage.PATTERN__EXPECTED_SIZE:
        setExpected_size(EXPECTED_SIZE_EDEFAULT);
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
      case TrnetvisualPackage.PATTERN__NODES:
        return nodes != null && !nodes.isEmpty();
      case TrnetvisualPackage.PATTERN__EDGES:
        return edges != null && !edges.isEmpty();
      case TrnetvisualPackage.PATTERN__INCOMING_RESULTS:
        return incomingResults != null && !incomingResults.isEmpty();
      case TrnetvisualPackage.PATTERN__OUTGOING_OPERANDS:
        return outgoingOperands != null && !outgoingOperands.isEmpty();
      case TrnetvisualPackage.PATTERN__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case TrnetvisualPackage.PATTERN__EXPECTED_SIZE:
        return expected_size != EXPECTED_SIZE_EDEFAULT;
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
    result.append(", expected_size: ");
    result.append(expected_size);
    result.append(')');
    return result.toString();
  }

} //PatternImpl
