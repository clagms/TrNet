/**
 */
package DB;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DB.ForeignKey#getSource <em>Source</em>}</li>
 *   <li>{@link DB.ForeignKey#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see DB.DBPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends DatabaseElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Column)
	 * @see DB.DBPackage#getForeignKey_Source()
	 * @model required="true"
	 * @generated
	 */
	Column getSource();

	/**
	 * Sets the value of the '{@link DB.ForeignKey#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Column value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Column)
	 * @see DB.DBPackage#getForeignKey_Target()
	 * @model required="true"
	 * @generated
	 */
	Column getTarget();

	/**
	 * Sets the value of the '{@link DB.ForeignKey#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Column value);

} // ForeignKey
