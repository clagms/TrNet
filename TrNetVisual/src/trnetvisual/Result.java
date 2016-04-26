/**
 */
package trnetvisual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.Result#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnetvisual.Result#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getResult()
 * @model abstract="true"
 *        annotation="gmf.link source='operator' target='pattern' target.decoration='arrow' width='3'"
 * @generated
 */
public interface Result extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Pattern#getIncomingResults <em>Incoming Results</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference.
   * @see #setPattern(Pattern)
   * @see trnetvisual.TrnetvisualPackage#getResult_Pattern()
   * @see trnetvisual.Pattern#getIncomingResults
   * @model opposite="incomingResults" required="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link trnetvisual.Result#getPattern <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Operator#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' reference.
   * @see #setOperator(Operator)
   * @see trnetvisual.TrnetvisualPackage#getResult_Operator()
   * @see trnetvisual.Operator#getResults
   * @model opposite="results" required="true"
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link trnetvisual.Result#getOperator <em>Operator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

} // Result
