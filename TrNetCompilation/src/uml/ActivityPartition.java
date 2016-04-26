/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ActivityPartition#getNode <em>Node</em>}</li>
 *   <li>{@link uml.ActivityPartition#getEdge <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getActivityPartition()
 * @model
 * @generated
 */
public interface ActivityPartition extends NamedElement, ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see uml.UmlPackage#getActivityPartition_Node()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' reference list.
	 * The list contents are of type {@link uml.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' reference list.
	 * @see uml.UmlPackage#getActivityPartition_Edge()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

} // ActivityPartition
