/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Combine Duplicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #setIsCombineDuplicate(boolean)
	 * @see uml.UmlPackage#getJoinNode_IsCombineDuplicate()
	 * @model default="true" dataType="uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsCombineDuplicate();

	/**
	 * Sets the value of the '{@link uml.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #isIsCombineDuplicate()
	 * @generated
	 */
	void setIsCombineDuplicate(boolean value);

} // JoinNode
