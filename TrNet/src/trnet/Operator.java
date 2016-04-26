/**
 */
package trnet;

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
 *   <li>{@link trnet.Operator#getOperands <em>Operands</em>}</li>
 *   <li>{@link trnet.Operator#getResults <em>Results</em>}</li>
 *   <li>{@link trnet.Operator#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnet.TrnetPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends EObject
{
  /**
   * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
   * The list contents are of type {@link trnet.Operand}.
   * It is bidirectional and its opposite is '{@link trnet.Operand#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operands</em>' containment reference list.
   * @see trnet.TrnetPackage#getOperator_Operands()
   * @see trnet.Operand#getOperator
   * @model opposite="operator" containment="true" required="true"
   * @generated
   */
  EList<Operand> getOperands();

  /**
   * Returns the value of the '<em><b>Results</b></em>' containment reference list.
   * The list contents are of type {@link trnet.Result}.
   * It is bidirectional and its opposite is '{@link trnet.Result#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Results</em>' containment reference list.
   * @see trnet.TrnetPackage#getOperator_Results()
   * @see trnet.Result#getOperator
   * @model opposite="operator" containment="true" required="true"
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
   * @see trnet.TrnetPackage#getOperator_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnet.Operator#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Operator
