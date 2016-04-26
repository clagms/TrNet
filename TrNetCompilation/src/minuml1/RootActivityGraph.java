/**
 */
package minuml1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link minuml1.RootActivityGraph#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link minuml1.RootActivityGraph#getTop <em>Top</em>}</li>
 *   <li>{@link minuml1.RootActivityGraph#getName <em>Name</em>}</li>
 *   <li>{@link minuml1.RootActivityGraph#getPartition <em>Partition</em>}</li>
 * </ul>
 * </p>
 *
 * @see minuml1.Minuml1Package#getRootActivityGraph()
 * @model
 * @generated
 */
public interface RootActivityGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link minuml1.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see minuml1.Minuml1Package#getRootActivityGraph_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' containment reference.
	 * @see #setTop(State)
	 * @see minuml1.Minuml1Package#getRootActivityGraph_Top()
	 * @model containment="true" required="true"
	 * @generated
	 */
	State getTop();

	/**
	 * Sets the value of the '{@link minuml1.RootActivityGraph#getTop <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top</em>' containment reference.
	 * @see #getTop()
	 * @generated
	 */
	void setTop(State value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see minuml1.Minuml1Package#getRootActivityGraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link minuml1.RootActivityGraph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see minuml1.Minuml1Package#getRootActivityGraph_Partition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partition> getPartition();

} // RootActivityGraph
