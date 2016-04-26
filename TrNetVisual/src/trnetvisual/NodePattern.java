/**
 */
package trnetvisual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.NodePattern#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getSameOut <em>Same Out</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getSameIn <em>Same In</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getName <em>Name</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getKeepIn <em>Keep In</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getKeepOut <em>Keep Out</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getDifferentIn <em>Different In</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getDifferentOut <em>Different Out</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.NodePattern#getExpectedNumberOfDistinctValues <em>Expected Number Of Distinct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getNodePattern()
 * @model abstract="true"
 *        annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface NodePattern extends Parameter
{
  /**
   * Returns the value of the '<em><b>Incoming</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.EdgePattern}.
   * It is bidirectional and its opposite is '{@link trnetvisual.EdgePattern#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_Incoming()
   * @see trnetvisual.EdgePattern#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<EdgePattern> getIncoming();

  /**
   * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.EdgePattern}.
   * It is bidirectional and its opposite is '{@link trnetvisual.EdgePattern#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_Outgoing()
   * @see trnetvisual.EdgePattern#getSource
   * @model opposite="source"
   * @generated
   */
  EList<EdgePattern> getOutgoing();

  /**
   * Returns the value of the '<em><b>Same Out</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Same}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Same#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Same Out</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same Out</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_SameOut()
   * @see trnetvisual.Same#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Same> getSameOut();

  /**
   * Returns the value of the '<em><b>Same In</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Same}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Same#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Same In</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same In</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_SameIn()
   * @see trnetvisual.Same#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Same> getSameIn();

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Pattern#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' container reference.
   * @see #setPattern(Pattern)
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_Pattern()
   * @see trnetvisual.Pattern#getNodes
   * @model opposite="nodes" required="true" transient="false"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link trnetvisual.NodePattern#getPattern <em>Pattern</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' container reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.AttributePattern}.
   * It is bidirectional and its opposite is '{@link trnetvisual.AttributePattern#getOwnerNode <em>Owner Node</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_Attributes()
   * @see trnetvisual.AttributePattern#getOwnerNode
   * @model opposite="ownerNode" containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<AttributePattern> getAttributes();

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
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link trnetvisual.NodePattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Keep In</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Keep}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Keep#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keep In</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keep In</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_KeepIn()
   * @see trnetvisual.Keep#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Keep> getKeepIn();

  /**
   * Returns the value of the '<em><b>Keep Out</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Keep}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Keep#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keep Out</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keep Out</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_KeepOut()
   * @see trnetvisual.Keep#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Keep> getKeepOut();

  /**
   * Returns the value of the '<em><b>Different In</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Different}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Different#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Different In</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Different In</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_DifferentIn()
   * @see trnetvisual.Different#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Different> getDifferentIn();

  /**
   * Returns the value of the '<em><b>Different Out</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Different}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Different#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Different Out</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Different Out</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_DifferentOut()
   * @see trnetvisual.Different#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Different> getDifferentOut();

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
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnetvisual.NodePattern#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Expected Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expected Number Of Distinct Values</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expected Number Of Distinct Values</em>' attribute.
   * @see #setExpectedNumberOfDistinctValues(double)
   * @see trnetvisual.TrnetvisualPackage#getNodePattern_ExpectedNumberOfDistinctValues()
   * @model
   * @generated
   */
  double getExpectedNumberOfDistinctValues();

  /**
   * Sets the value of the '{@link trnetvisual.NodePattern#getExpectedNumberOfDistinctValues <em>Expected Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expected Number Of Distinct Values</em>' attribute.
   * @see #getExpectedNumberOfDistinctValues()
   * @generated
   */
  void setExpectedNumberOfDistinctValues(double value);

} // NodePattern
