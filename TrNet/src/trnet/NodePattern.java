/**
 */
package trnet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnet.NodePattern#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link trnet.NodePattern#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link trnet.NodePattern#getSameOut <em>Same Out</em>}</li>
 *   <li>{@link trnet.NodePattern#getSameIn <em>Same In</em>}</li>
 *   <li>{@link trnet.NodePattern#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnet.NodePattern#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link trnet.NodePattern#getName <em>Name</em>}</li>
 *   <li>{@link trnet.NodePattern#getId <em>Id</em>}</li>
 *   <li>{@link trnet.NodePattern#getDifferentIn <em>Different In</em>}</li>
 *   <li>{@link trnet.NodePattern#getDifferentOut <em>Different Out</em>}</li>
 *   <li>{@link trnet.NodePattern#getKeepIn <em>Keep In</em>}</li>
 *   <li>{@link trnet.NodePattern#getKeepOut <em>Keep Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnet.TrnetPackage#getNodePattern()
 * @model abstract="true"
 * @generated
 */
public interface NodePattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Incoming</b></em>' reference list.
   * The list contents are of type {@link trnet.EdgePattern}.
   * It is bidirectional and its opposite is '{@link trnet.EdgePattern#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming</em>' reference list.
   * @see trnet.TrnetPackage#getNodePattern_Incoming()
   * @see trnet.EdgePattern#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<EdgePattern> getIncoming();

  /**
   * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
   * The list contents are of type {@link trnet.EdgePattern}.
   * It is bidirectional and its opposite is '{@link trnet.EdgePattern#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing</em>' reference list.
   * @see trnet.TrnetPackage#getNodePattern_Outgoing()
   * @see trnet.EdgePattern#getSource
   * @model opposite="source"
   * @generated
   */
  EList<EdgePattern> getOutgoing();

  /**
   * Returns the value of the '<em><b>Same Out</b></em>' reference list.
   * The list contents are of type {@link trnet.Same}.
   * It is bidirectional and its opposite is '{@link trnet.Same#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Same Out</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same Out</em>' reference list.
   * @see trnet.TrnetPackage#getNodePattern_SameOut()
   * @see trnet.Same#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Same> getSameOut();

  /**
   * Returns the value of the '<em><b>Same In</b></em>' reference list.
   * The list contents are of type {@link trnet.Same}.
   * It is bidirectional and its opposite is '{@link trnet.Same#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Same In</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Same In</em>' reference list.
   * @see trnet.TrnetPackage#getNodePattern_SameIn()
   * @see trnet.Same#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Same> getSameIn();

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link trnet.Pattern#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' container reference.
   * @see #setPattern(Pattern)
   * @see trnet.TrnetPackage#getNodePattern_Pattern()
   * @see trnet.Pattern#getNodes
   * @model opposite="nodes" required="true" transient="false"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link trnet.NodePattern#getPattern <em>Pattern</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' container reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link trnet.AttributePattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see trnet.TrnetPackage#getNodePattern_Attributes()
   * @model containment="true"
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
   * @see trnet.TrnetPackage#getNodePattern_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link trnet.NodePattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see trnet.TrnetPackage#getNodePattern_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnet.NodePattern#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Different In</b></em>' reference list.
   * The list contents are of type {@link trnet.Different}.
   * It is bidirectional and its opposite is '{@link trnet.Different#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Different In</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Different In</em>' reference list.
   * @see trnet.TrnetPackage#getNodePattern_DifferentIn()
   * @see trnet.Different#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Different> getDifferentIn();

  /**
   * Returns the value of the '<em><b>Different Out</b></em>' reference list.
   * The list contents are of type {@link trnet.Different}.
   * It is bidirectional and its opposite is '{@link trnet.Different#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Different Out</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Different Out</em>' reference list.
   * @see trnet.TrnetPackage#getNodePattern_DifferentOut()
   * @see trnet.Different#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Different> getDifferentOut();

  /**
   * Returns the value of the '<em><b>Keep In</b></em>' reference list.
   * The list contents are of type {@link trnet.Keep}.
   * It is bidirectional and its opposite is '{@link trnet.Keep#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keep In</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keep In</em>' reference list.
   * @see trnet.TrnetPackage#getNodePattern_KeepIn()
   * @see trnet.Keep#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Keep> getKeepIn();

  /**
   * Returns the value of the '<em><b>Keep Out</b></em>' reference list.
   * The list contents are of type {@link trnet.Keep}.
   * It is bidirectional and its opposite is '{@link trnet.Keep#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keep Out</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keep Out</em>' reference list.
   * @see trnet.TrnetPackage#getNodePattern_KeepOut()
   * @see trnet.Keep#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Keep> getKeepOut();

} // NodePattern
