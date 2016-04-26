/**
 */
package trnet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnet.Operand#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnet.Operand#getOperator <em>Operator</em>}</li>
 *   <li>{@link trnet.Operand#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnet.TrnetPackage#getOperand()
 * @model abstract="true"
 * @generated
 */
public interface Operand extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnet.Pattern#getOutgoingOperands <em>Outgoing Operands</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference.
   * @see #setPattern(Pattern)
   * @see trnet.TrnetPackage#getOperand_Pattern()
   * @see trnet.Pattern#getOutgoingOperands
   * @model opposite="outgoingOperands" required="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link trnet.Operand#getPattern <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link trnet.Operator#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' container reference.
   * @see #setOperator(Operator)
   * @see trnet.TrnetPackage#getOperand_Operator()
   * @see trnet.Operator#getOperands
   * @model opposite="operands" required="true" transient="false"
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link trnet.Operand#getOperator <em>Operator</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' container reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see trnet.TrnetPackage#getOperand_Index()
   * @model required="true"
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link trnet.Operand#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

} // Operand
