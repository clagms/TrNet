/**
 */
package trnet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnet.Result#getPattern <em>Pattern</em>}</li>
 *   <li>{@link trnet.Result#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnet.TrnetPackage#getResult()
 * @model abstract="true"
 * @generated
 */
public interface Result extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnet.Pattern#getIncommingResults <em>Incomming Results</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference.
   * @see #setPattern(Pattern)
   * @see trnet.TrnetPackage#getResult_Pattern()
   * @see trnet.Pattern#getIncommingResults
   * @model opposite="incommingResults" required="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link trnet.Result#getPattern <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link trnet.Operator#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' container reference.
   * @see #setOperator(Operator)
   * @see trnet.TrnetPackage#getResult_Operator()
   * @see trnet.Operator#getResults
   * @model opposite="results" required="true" transient="false"
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link trnet.Result#getOperator <em>Operator</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' container reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

} // Result
