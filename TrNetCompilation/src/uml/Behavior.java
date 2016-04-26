/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Behavior#isIsReentrant <em>Is Reentrant</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getBehavior()
 * @model abstract="true"
 * @generated
 */
public interface Behavior extends uml.Class {
	/**
	 * Returns the value of the '<em><b>Is Reentrant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reentrant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reentrant</em>' attribute.
	 * @see #setIsReentrant(boolean)
	 * @see uml.UmlPackage#getBehavior_IsReentrant()
	 * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReentrant();

	/**
	 * Sets the value of the '{@link uml.Behavior#isIsReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reentrant</em>' attribute.
	 * @see #isIsReentrant()
	 * @generated
	 */
	void setIsReentrant(boolean value);

} // Behavior
