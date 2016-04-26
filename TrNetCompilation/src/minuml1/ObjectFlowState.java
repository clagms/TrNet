/**
 */
package minuml1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Flow State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link minuml1.ObjectFlowState#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see minuml1.Minuml1Package#getObjectFlowState()
 * @model
 * @generated
 */
public interface ObjectFlowState extends State {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ModelElement)
	 * @see minuml1.Minuml1Package#getObjectFlowState_Type()
	 * @model containment="true"
	 * @generated
	 */
	ModelElement getType();

	/**
	 * Sets the value of the '{@link minuml1.ObjectFlowState#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ModelElement value);

} // ObjectFlowState
