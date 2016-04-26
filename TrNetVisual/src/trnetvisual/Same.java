/**
 */
package trnetvisual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Same</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.Same#getSource <em>Source</em>}</li>
 *   <li>{@link trnetvisual.Same#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getSame()
 * @model annotation="gmf.link source='source' target='target' color='0,214,32' tool.name='Same Node' width='2'"
 * @generated
 */
public interface Same extends Restriction
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.NodePattern#getSameOut <em>Same Out</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(NodePattern)
   * @see trnetvisual.TrnetvisualPackage#getSame_Source()
   * @see trnetvisual.NodePattern#getSameOut
   * @model opposite="sameOut" required="true"
   * @generated
   */
  NodePattern getSource();

  /**
   * Sets the value of the '{@link trnetvisual.Same#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(NodePattern value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.NodePattern#getSameIn <em>Same In</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(NodePattern)
   * @see trnetvisual.TrnetvisualPackage#getSame_Target()
   * @see trnetvisual.NodePattern#getSameIn
   * @model opposite="sameIn" required="true"
   * @generated
   */
  NodePattern getTarget();

  /**
   * Sets the value of the '{@link trnetvisual.Same#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(NodePattern value);

} // Same
