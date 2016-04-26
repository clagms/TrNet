/**
 */
package minuml1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link minuml1.CompositeState#getSubvertex <em>Subvertex</em>}</li>
 * </ul>
 * </p>
 *
 * @see minuml1.Minuml1Package#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link minuml1.StateVertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvertex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see minuml1.Minuml1Package#getCompositeState_Subvertex()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateVertex> getSubvertex();

} // CompositeState
