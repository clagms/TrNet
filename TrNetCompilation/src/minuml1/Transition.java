/**
 */
package minuml1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link minuml1.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link minuml1.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link minuml1.Transition#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @see minuml1.Minuml1Package#getTransition()
 * @model
 * @generated
 */
public interface Transition extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link minuml1.StateVertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StateVertex)
	 * @see minuml1.Minuml1Package#getTransition_Source()
	 * @see minuml1.StateVertex#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	StateVertex getSource();

	/**
	 * Sets the value of the '{@link minuml1.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StateVertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link minuml1.StateVertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(StateVertex)
	 * @see minuml1.Minuml1Package#getTransition_Target()
	 * @see minuml1.StateVertex#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	StateVertex getTarget();

	/**
	 * Sets the value of the '{@link minuml1.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StateVertex value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Guard)
	 * @see minuml1.Minuml1Package#getTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link minuml1.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

} // Transition
