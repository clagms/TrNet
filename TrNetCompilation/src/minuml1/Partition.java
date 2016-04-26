/**
 */
package minuml1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link minuml1.Partition#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see minuml1.Minuml1Package#getPartition()
 * @model
 * @generated
 */
public interface Partition extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link minuml1.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see minuml1.Minuml1Package#getPartition_Contents()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getContents();

} // Partition
