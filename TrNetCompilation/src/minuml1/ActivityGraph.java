/**
 */
package minuml1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link minuml1.ActivityGraph#getPartition <em>Partition</em>}</li>
 * </ul>
 * </p>
 *
 * @see minuml1.Minuml1Package#getActivityGraph()
 * @model
 * @generated
 */
public interface ActivityGraph extends StateMachine {
	/**
	 * Returns the value of the '<em><b>Partition</b></em>' containment reference list.
	 * The list contents are of type {@link minuml1.Partition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' containment reference list.
	 * @see minuml1.Minuml1Package#getActivityGraph_Partition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partition> getPartition();

} // ActivityGraph
