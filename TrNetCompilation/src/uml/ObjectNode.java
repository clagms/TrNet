/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ObjectNode#isIsControlType <em>Is Control Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getObjectNode()
 * @model abstract="true"
 * @generated
 */
public interface ObjectNode extends ActivityNode, TypedElement {
	/**
	 * Returns the value of the '<em><b>Is Control Type</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Control Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control Type</em>' attribute.
	 * @see #setIsControlType(boolean)
	 * @see uml.UmlPackage#getObjectNode_IsControlType()
	 * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsControlType();

	/**
	 * Sets the value of the '{@link uml.ObjectNode#isIsControlType <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control Type</em>' attribute.
	 * @see #isIsControlType()
	 * @generated
	 */
	void setIsControlType(boolean value);

} // ObjectNode
