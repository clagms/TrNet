/**
 */
package minuml1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link minuml1.StateMachine#getTop <em>Top</em>}</li>
 *   <li>{@link minuml1.StateMachine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see minuml1.Minuml1Package#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' containment reference.
	 * @see #setTop(State)
	 * @see minuml1.Minuml1Package#getStateMachine_Top()
	 * @model containment="true" required="true"
	 * @generated
	 */
	State getTop();

	/**
	 * Sets the value of the '{@link minuml1.StateMachine#getTop <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' containment reference.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(State value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link minuml1.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see minuml1.Minuml1Package#getStateMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // StateMachine
