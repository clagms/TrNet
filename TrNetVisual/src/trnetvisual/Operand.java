/**
 */
package trnetvisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.Operand#getOperator <em>Operator</em>}</li>
 *   <li>{@link trnetvisual.Operand#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnetvisual.Operand#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getOperand()
 * @model abstract="true"
 *        annotation="gmf.link source='pattern' target='operator' target.decoration='arrow' width='3'"
 * @generated
 */
public interface Operand extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Operator#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' reference.
   * @see #setOperator(Operator)
   * @see trnetvisual.TrnetvisualPackage#getOperand_Operator()
   * @see trnetvisual.Operator#getOperands
   * @model opposite="operands" required="true"
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link trnetvisual.Operand#getOperator <em>Operator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Pattern#getOutgoingOperands <em>Outgoing Operands</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference.
   * @see #setPattern(Pattern)
   * @see trnetvisual.TrnetvisualPackage#getOperand_Pattern()
   * @see trnetvisual.Pattern#getOutgoingOperands
   * @model opposite="outgoingOperands" required="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link trnetvisual.Operand#getPattern <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

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
   * @see trnetvisual.TrnetvisualPackage#getOperand_Index()
   * @model required="true"
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link trnetvisual.Operand#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

} // Operand
