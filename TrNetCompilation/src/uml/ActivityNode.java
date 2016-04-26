/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link uml.ActivityNode#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see uml.UmlPackage#getActivityNode_Outgoing()
	 * @see uml.ActivityEdge#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see uml.UmlPackage#getActivityNode_Incoming()
	 * @see uml.ActivityEdge#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

} // ActivityNode
