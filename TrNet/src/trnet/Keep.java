/**
 */
package trnet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnet.Keep#getSource <em>Source</em>}</li>
 *   <li>{@link trnet.Keep#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnet.TrnetPackage#getKeep()
 * @model
 * @generated
 */
public interface Keep extends Restriction
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnet.NodePattern#getKeepOut <em>Keep Out</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(NodePattern)
   * @see trnet.TrnetPackage#getKeep_Source()
   * @see trnet.NodePattern#getKeepOut
   * @model opposite="keepOut" required="true"
   * @generated
   */
  NodePattern getSource();

  /**
   * Sets the value of the '{@link trnet.Keep#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(NodePattern value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnet.NodePattern#getKeepIn <em>Keep In</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(NodePattern)
   * @see trnet.TrnetPackage#getKeep_Target()
   * @see trnet.NodePattern#getKeepIn
   * @model opposite="keepIn" required="true"
   * @generated
   */
  NodePattern getTarget();

  /**
   * Sets the value of the '{@link trnet.Keep#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(NodePattern value);

} // Keep
