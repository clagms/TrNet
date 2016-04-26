/**
 */
package trnetvisual;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tr Net Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.TrNetModel#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link trnetvisual.TrNetModel#getOperators <em>Operators</em>}</li>
 *   <li>{@link trnetvisual.TrNetModel#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.TrNetModel#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link trnetvisual.TrNetModel#getOperands <em>Operands</em>}</li>
 *   <li>{@link trnetvisual.TrNetModel#getResults <em>Results</em>}</li>
 *   <li>{@link trnetvisual.TrNetModel#getFlowRules <em>Flow Rules</em>}</li>
 *   <li>{@link trnetvisual.TrNetModel#getCalculations <em>Calculations</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getTrNetModel()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface TrNetModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.Pattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getTrNetModel_Patterns()
   * @model containment="true"
   * @generated
   */
  EList<Pattern> getPatterns();

  /**
   * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getTrNetModel_Operators()
   * @model containment="true"
   * @generated
   */
  EList<Operator> getOperators();

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
   * @see trnetvisual.TrnetvisualPackage#getTrNetModel_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnetvisual.TrNetModel#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.Restriction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrictions</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getTrNetModel_Restrictions()
   * @model containment="true"
   * @generated
   */
  EList<Restriction> getRestrictions();

  /**
   * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.Operand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operands</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getTrNetModel_Operands()
   * @model containment="true"
   * @generated
   */
  EList<Operand> getOperands();

  /**
   * Returns the value of the '<em><b>Results</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.Result}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Results</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getTrNetModel_Results()
   * @model containment="true"
   * @generated
   */
  EList<Result> getResults();

  /**
   * Returns the value of the '<em><b>Flow Rules</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.FlowRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flow Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow Rules</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getTrNetModel_FlowRules()
   * @model containment="true"
   * @generated
   */
  EList<FlowRule> getFlowRules();

  /**
   * Returns the value of the '<em><b>Calculations</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.Calculation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calculations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calculations</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getTrNetModel_Calculations()
   * @model containment="true"
   * @generated
   */
  EList<Calculation> getCalculations();

} // TrNetModel
