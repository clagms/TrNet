/**
 */
package decompositionprocess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decompose Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link decompositionprocess.DecomposeOp#getId <em>Id</em>}</li>
 *   <li>{@link decompositionprocess.DecomposeOp#getSplits <em>Splits</em>}</li>
 *   <li>{@link decompositionprocess.DecomposeOp#getParent <em>Parent</em>}</li>
 *   <li>{@link decompositionprocess.DecomposeOp#getMin <em>Min</em>}</li>
 *   <li>{@link decompositionprocess.DecomposeOp#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see decompositionprocess.DecompositionprocessPackage#getDecomposeOp()
 * @model
 * @generated
 */
public interface DecomposeOp extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see decompositionprocess.DecompositionprocessPackage#getDecomposeOp_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link decompositionprocess.DecomposeOp#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Splits</b></em>' containment reference list.
	 * The list contents are of type {@link decompositionprocess.Split}.
	 * It is bidirectional and its opposite is '{@link decompositionprocess.Split#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Splits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splits</em>' containment reference list.
	 * @see decompositionprocess.DecompositionprocessPackage#getDecomposeOp_Splits()
	 * @see decompositionprocess.Split#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Split> getSplits();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link decompositionprocess.Split#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Split)
	 * @see decompositionprocess.DecompositionprocessPackage#getDecomposeOp_Parent()
	 * @see decompositionprocess.Split#getOp
	 * @model opposite="op" required="true" transient="false"
	 * @generated
	 */
	Split getParent();

	/**
	 * Sets the value of the '{@link decompositionprocess.DecomposeOp#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Split value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(Split)
	 * @see decompositionprocess.DecompositionprocessPackage#getDecomposeOp_Min()
	 * @model
	 * @generated
	 */
	Split getMin();

	/**
	 * Sets the value of the '{@link decompositionprocess.DecomposeOp#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Split value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(Split)
	 * @see decompositionprocess.DecompositionprocessPackage#getDecomposeOp_Max()
	 * @model
	 * @generated
	 */
	Split getMax();

	/**
	 * Sets the value of the '{@link decompositionprocess.DecomposeOp#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Split value);

} // DecomposeOp
