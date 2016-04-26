/**
 */
package minuml1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link minuml1.Pseudostate#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see minuml1.Minuml1Package#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends StateVertex {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link minuml1.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see minuml1.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see minuml1.Minuml1Package#getPseudostate_Kind()
	 * @model required="true"
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link minuml1.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see minuml1.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

} // Pseudostate
