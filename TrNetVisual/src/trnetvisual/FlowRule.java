/**
 */
package trnetvisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.FlowRule#getSource <em>Source</em>}</li>
 *   <li>{@link trnetvisual.FlowRule#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getFlowRule()
 * @model abstract="true"
 *        annotation="gmf.link source='source' target='target' target.decoration='arrow' width='3'"
 * @generated
 */
public interface FlowRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Operator#getFlowOut <em>Flow Out</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Operator)
   * @see trnetvisual.TrnetvisualPackage#getFlowRule_Source()
   * @see trnetvisual.Operator#getFlowOut
   * @model opposite="flowOut" required="true"
   * @generated
   */
  Operator getSource();

  /**
   * Sets the value of the '{@link trnetvisual.FlowRule#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Operator value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Operator#getFlowIn <em>Flow In</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Operator)
   * @see trnetvisual.TrnetvisualPackage#getFlowRule_Target()
   * @see trnetvisual.Operator#getFlowIn
   * @model opposite="flowIn" required="true"
   * @generated
   */
  Operator getTarget();

  /**
   * Sets the value of the '{@link trnetvisual.FlowRule#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Operator value);

} // FlowRule
