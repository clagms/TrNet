/**
 */
package trnetvisual;

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
 *   <li>{@link trnetvisual.Pattern#getNodes <em>Nodes</em>}</li>
 *   <li>{@link trnetvisual.Pattern#getEdges <em>Edges</em>}</li>
 *   <li>{@link trnetvisual.Pattern#getIncomingResults <em>Incoming Results</em>}</li>
 *   <li>{@link trnetvisual.Pattern#getOutgoingOperands <em>Outgoing Operands</em>}</li>
 *   <li>{@link trnetvisual.Pattern#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.Pattern#getExpected_size <em>Expected size</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getPattern()
 * @model annotation="gmf.node label.placement='none' figure='rounded' tool.name='Pattern'"
 * @generated
 */
public interface Pattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.NodePattern}.
   * It is bidirectional and its opposite is '{@link trnetvisual.NodePattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getPattern_Nodes()
   * @see trnetvisual.NodePattern#getPattern
   * @model opposite="pattern" containment="true" required="true"
   *        annotation="gmf.compartment collapsible='false'"
   * @generated
   */
  EList<NodePattern> getNodes();

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.EdgePattern}.
   * It is bidirectional and its opposite is '{@link trnetvisual.EdgePattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getPattern_Edges()
   * @see trnetvisual.EdgePattern#getPattern
   * @model opposite="pattern" containment="true"
   * @generated
   */
  EList<EdgePattern> getEdges();

  /**
   * Returns the value of the '<em><b>Incoming Results</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Result}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Result#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming Results</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming Results</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getPattern_IncomingResults()
   * @see trnetvisual.Result#getPattern
   * @model opposite="pattern"
   * @generated
   */
  EList<Result> getIncomingResults();

  /**
   * Returns the value of the '<em><b>Outgoing Operands</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Operand}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Operand#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Operands</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Operands</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getPattern_OutgoingOperands()
   * @see trnetvisual.Operand#getPattern
   * @model opposite="pattern"
   * @generated
   */
  EList<Operand> getOutgoingOperands();

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
   * @see trnetvisual.TrnetvisualPackage#getPattern_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnetvisual.Pattern#getId <em>Id</em>}' attribute.
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
   * @see #setExpected_size(double)
   * @see trnetvisual.TrnetvisualPackage#getPattern_Expected_size()
   * @model
   * @generated
   */
  double getExpected_size();

  /**
   * Sets the value of the '{@link trnetvisual.Pattern#getExpected_size <em>Expected size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expected size</em>' attribute.
   * @see #getExpected_size()
   * @generated
   */
  void setExpected_size(double value);

} // Pattern
