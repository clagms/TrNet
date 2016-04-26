/**
 */
package minuml1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link minuml1.StateVertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link minuml1.StateVertex#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see minuml1.Minuml1Package#getStateVertex()
 * @model abstract="true"
 * @generated
 */
public interface StateVertex extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link minuml1.Transition}.
	 * It is bidirectional and its opposite is '{@link minuml1.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see minuml1.Minuml1Package#getStateVertex_Outgoing()
	 * @see minuml1.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link minuml1.Transition}.
	 * It is bidirectional and its opposite is '{@link minuml1.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see minuml1.Minuml1Package#getStateVertex_Incoming()
	 * @see minuml1.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

} // StateVertex
