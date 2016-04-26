/**
 */
package trnet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnet.EdgePattern#getSource <em>Source</em>}</li>
 *   <li>{@link trnet.EdgePattern#getTarget <em>Target</em>}</li>
 *   <li>{@link trnet.EdgePattern#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnet.EdgePattern#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnet.TrnetPackage#getEdgePattern()
 * @model
 * @generated
 */
public interface EdgePattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnet.NodePattern#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(NodePattern)
   * @see trnet.TrnetPackage#getEdgePattern_Source()
   * @see trnet.NodePattern#getOutgoing
   * @model opposite="outgoing" required="true"
   * @generated
   */
  NodePattern getSource();

  /**
   * Sets the value of the '{@link trnet.EdgePattern#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(NodePattern value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnet.NodePattern#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(NodePattern)
   * @see trnet.TrnetPackage#getEdgePattern_Target()
   * @see trnet.NodePattern#getIncoming
   * @model opposite="incoming" required="true"
   * @generated
   */
  NodePattern getTarget();

  /**
   * Sets the value of the '{@link trnet.EdgePattern#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(NodePattern value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link trnet.Pattern#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' container reference.
   * @see #setPattern(Pattern)
   * @see trnet.TrnetPackage#getEdgePattern_Pattern()
   * @see trnet.Pattern#getEdges
   * @model opposite="edges" required="true" transient="false"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link trnet.EdgePattern#getPattern <em>Pattern</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' container reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see trnet.TrnetPackage#getEdgePattern_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link trnet.EdgePattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EdgePattern
