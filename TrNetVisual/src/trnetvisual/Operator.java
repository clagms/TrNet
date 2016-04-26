/**
 */
package trnetvisual;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.Operator#getOperands <em>Operands</em>}</li>
 *   <li>{@link trnetvisual.Operator#getResults <em>Results</em>}</li>
 *   <li>{@link trnetvisual.Operator#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.Operator#getFlowOut <em>Flow Out</em>}</li>
 *   <li>{@link trnetvisual.Operator#getFlowIn <em>Flow In</em>}</li>
 *   <li>{@link trnetvisual.Operator#getConditions <em>Conditions</em>}</li>
 *   <li>{@link trnetvisual.Operator#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getOperator()
 * @model abstract="true"
 *        annotation="gmf.node foo='bar'"
 * @generated
 */
public interface Operator extends EObject
{
  /**
   * Returns the value of the '<em><b>Operands</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Operand}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Operand#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operands</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operands</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getOperator_Operands()
   * @see trnetvisual.Operand#getOperator
   * @model opposite="operator"
   * @generated
   */
  EList<Operand> getOperands();

  /**
   * Returns the value of the '<em><b>Results</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.Result}.
   * It is bidirectional and its opposite is '{@link trnetvisual.Result#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Results</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getOperator_Results()
   * @see trnetvisual.Result#getOperator
   * @model opposite="operator"
   * @generated
   */
  EList<Result> getResults();

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
   * @see trnetvisual.TrnetvisualPackage#getOperator_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnetvisual.Operator#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Flow Out</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.FlowRule}.
   * It is bidirectional and its opposite is '{@link trnetvisual.FlowRule#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flow Out</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow Out</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getOperator_FlowOut()
   * @see trnetvisual.FlowRule#getSource
   * @model opposite="source"
   * @generated
   */
  EList<FlowRule> getFlowOut();

  /**
   * Returns the value of the '<em><b>Flow In</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.FlowRule}.
   * It is bidirectional and its opposite is '{@link trnetvisual.FlowRule#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flow In</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow In</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getOperator_FlowIn()
   * @see trnetvisual.FlowRule#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<FlowRule> getFlowIn();

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.ApplicationCondition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getOperator_Conditions()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<ApplicationCondition> getConditions();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getOperator_Actions()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<Action> getActions();

} // Operator
