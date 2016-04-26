/**
 */
package trnetvisual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Some Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.SomeResult#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getSomeResult()
 * @model
 * @generated
 */
public interface SomeResult extends Result
{
  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(int)
   * @see trnetvisual.TrnetvisualPackage#getSomeResult_Count()
   * @model required="true"
   * @generated
   */
  int getCount();

  /**
   * Sets the value of the '{@link trnetvisual.SomeResult#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
  void setCount(int value);

} // SomeResult
