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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trnet.EdgePattern;
import trnet.NodePattern;
import trnet.Operand;
import trnet.Pattern;
import trnet.Result;
import trnet.TrnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trnet.impl.PatternImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link trnet.impl.PatternImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link trnet.impl.PatternImpl#getOutgoingOperands <em>Outgoing Operands</em>}</li>
 *   <li>{@link trnet.impl.PatternImpl#getIncommingResults <em>Incomming Results</em>}</li>
 *   <li>{@link trnet.impl.PatternImpl#getId <em>Id</em>}</li>
 *   <li>{@link trnet.impl.PatternImpl#getExpected_size <em>Expected size</em>}</li>
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
   * The cached value of the '{@link #getOutgoingOperands() <em>Outgoing Operands</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingOperands()
   * @generated
   * @ordered
   */
  protected EList<Operand> outgoingOperands;

  /**
   * The cached value of the '{@link #getIncommingResults() <em>Incomming Results</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncommingResults()
   * @generated
   * @ordered
   */
  protected EList<Result> incommingResults;

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
  protected static final int EXPECTED_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getExpected_size() <em>Expected size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpected_size()
   * @generated
   * @ordered
   */
  protected int expected_size = EXPECTED_SIZE_EDEFAULT;

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
    return TrnetPackage.Literals.PATTERN;
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
      nodes = new EObjectContainmentWithInverseEList<NodePattern>(NodePattern.class, this, TrnetPackage.PATTERN__NODES, TrnetPackage.NODE_PATTERN__PATTERN);
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
      edges = new EObjectContainmentWithInverseEList<EdgePattern>(EdgePattern.class, this, TrnetPackage.PATTERN__EDGES, TrnetPackage.EDGE_PATTERN__PATTERN);
    }
    return edges;
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
      outgoingOperands = new EObjectWithInverseResolvingEList<Operand>(Operand.class, this, TrnetPackage.PATTERN__OUTGOING_OPERANDS, TrnetPackage.OPERAND__PATTERN);
    }
    return outgoingOperands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Result> getIncommingResults()
  {
    if (incommingResults == null)
    {
      incommingResults = new EObjectWithInverseResolvingEList<Result>(Result.class, this, TrnetPackage.PATTERN__INCOMMING_RESULTS, TrnetPackage.RESULT__PATTERN);
    }
    return incommingResults;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.PATTERN__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getExpected_size()
  {
    return expected_size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpected_size(int newExpected_size)
  {
    int oldExpected_size = expected_size;
    expected_size = newExpected_size;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TrnetPackage.PATTERN__EXPECTED_SIZE, oldExpected_size, expected_size));
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
      case TrnetPackage.PATTERN__NODES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
      case TrnetPackage.PATTERN__EDGES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdges()).basicAdd(otherEnd, msgs);
      case TrnetPackage.PATTERN__OUTGOING_OPERANDS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingOperands()).basicAdd(otherEnd, msgs);
      case TrnetPackage.PATTERN__INCOMMING_RESULTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncommingResults()).basicAdd(otherEnd, msgs);
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
      case TrnetPackage.PATTERN__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case TrnetPackage.PATTERN__EDGES:
        return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
      case TrnetPackage.PATTERN__OUTGOING_OPERANDS:
        return ((InternalEList<?>)getOutgoingOperands()).basicRemove(otherEnd, msgs);
      case TrnetPackage.PATTERN__INCOMMING_RESULTS:
        return ((InternalEList<?>)getIncommingResults()).basicRemove(otherEnd, msgs);
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
      case TrnetPackage.PATTERN__NODES:
        return getNodes();
      case TrnetPackage.PATTERN__EDGES:
        return getEdges();
      case TrnetPackage.PATTERN__OUTGOING_OPERANDS:
        return getOutgoingOperands();
      case TrnetPackage.PATTERN__INCOMMING_RESULTS:
        return getIncommingResults();
      case TrnetPackage.PATTERN__ID:
        return getId();
      case TrnetPackage.PATTERN__EXPECTED_SIZE:
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
      case TrnetPackage.PATTERN__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends NodePattern>)newValue);
        return;
      case TrnetPackage.PATTERN__EDGES:
        getEdges().clear();
        getEdges().addAll((Collection<? extends EdgePattern>)newValue);
        return;
      case TrnetPackage.PATTERN__OUTGOING_OPERANDS:
        getOutgoingOperands().clear();
        getOutgoingOperands().addAll((Collection<? extends Operand>)newValue);
        return;
      case TrnetPackage.PATTERN__INCOMMING_RESULTS:
        getIncommingResults().clear();
        getIncommingResults().addAll((Collection<? extends Result>)newValue);
        return;
      case TrnetPackage.PATTERN__ID:
        setId((String)newValue);
        return;
      case TrnetPackage.PATTERN__EXPECTED_SIZE:
        setExpected_size((Integer)newValue);
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
      case TrnetPackage.PATTERN__NODES:
        getNodes().clear();
        return;
      case TrnetPackage.PATTERN__EDGES:
        getEdges().clear();
        return;
      case TrnetPackage.PATTERN__OUTGOING_OPERANDS:
        getOutgoingOperands().clear();
        return;
      case TrnetPackage.PATTERN__INCOMMING_RESULTS:
        getIncommingResults().clear();
        return;
      case TrnetPackage.PATTERN__ID:
        setId(ID_EDEFAULT);
        return;
      case TrnetPackage.PATTERN__EXPECTED_SIZE:
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
      case TrnetPackage.PATTERN__NODES:
        return nodes != null && !nodes.isEmpty();
      case TrnetPackage.PATTERN__EDGES:
        return edges != null && !edges.isEmpty();
      case TrnetPackage.PATTERN__OUTGOING_OPERANDS:
        return outgoingOperands != null && !outgoingOperands.isEmpty();
      case TrnetPackage.PATTERN__INCOMMING_RESULTS:
        return incommingResults != null && !incommingResults.isEmpty();
      case TrnetPackage.PATTERN__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case TrnetPackage.PATTERN__EXPECTED_SIZE:
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
