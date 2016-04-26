/**
 */
package trnet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnet.Pattern#getNodes <em>Nodes</em>}</li>
 *   <li>{@link trnet.Pattern#getEdges <em>Edges</em>}</li>
 *   <li>{@link trnet.Pattern#getOutgoingOperands <em>Outgoing Operands</em>}</li>
 *   <li>{@link trnet.Pattern#getIncommingResults <em>Incomming Results</em>}</li>
 *   <li>{@link trnet.Pattern#getId <em>Id</em>}</li>
 *   <li>{@link trnet.Pattern#getExpected_size <em>Expected size</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnet.TrnetPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link trnet.NodePattern}.
   * It is bidirectional and its opposite is '{@link trnet.NodePattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see trnet.TrnetPackage#getPattern_Nodes()
   * @see trnet.NodePattern#getPattern
   * @model opposite="pattern" containment="true" required="true"
   * @generated
   */
  EList<NodePattern> getNodes();

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link trnet.EdgePattern}.
   * It is bidirectional and its opposite is '{@link trnet.EdgePattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see trnet.TrnetPackage#getPattern_Edges()
   * @see trnet.EdgePattern#getPattern
   * @model opposite="pattern" containment="true"
   * @generated
   */
  EList<EdgePattern> getEdges();

  /**
   * Returns the value of the '<em><b>Outgoing Operands</b></em>' reference list.
   * The list contents are of type {@link trnet.Operand}.
   * It is bidirectional and its opposite is '{@link trnet.Operand#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Operands</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Operands</em>' reference list.
   * @see trnet.TrnetPackage#getPattern_OutgoingOperands()
   * @see trnet.Operand#getPattern
   * @model opposite="pattern"
   * @generated
   */
  EList<Operand> getOutgoingOperands();

  /**
   * Returns the value of the '<em><b>Incomming Results</b></em>' reference list.
   * The list contents are of type {@link trnet.Result}.
   * It is bidirectional and its opposite is '{@link trnet.Result#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incomming Results</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incomming Results</em>' reference list.
   * @see trnet.TrnetPackage#getPattern_IncommingResults()
   * @see trnet.Result#getPattern
   * @model opposite="pattern"
   * @generated
   */
  EList<Result> getIncommingResults();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see trnet.TrnetPackage#getPattern_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnet.Pattern#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Expected size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expected size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expected size</em>' attribute.
   * @see #setExpected_size(int)
   * @see trnet.TrnetPackage#getPattern_Expected_size()
   * @model
   * @generated
   */
  int getExpected_size();

  /**
   * Sets the value of the '{@link trnet.Pattern#getExpected_size <em>Expected size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expected size</em>' attribute.
   * @see #getExpected_size()
   * @generated
   */
  void setExpected_size(int value);

} // Pattern
