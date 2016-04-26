/**
 */
package decompositionprocess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link decompositionprocess.Split#getMinCost <em>Min Cost</em>}</li>
 *   <li>{@link decompositionprocess.Split#getOp <em>Op</em>}</li>
 *   <li>{@link decompositionprocess.Split#getParent <em>Parent</em>}</li>
 *   <li>{@link decompositionprocess.Split#getMaxCost <em>Max Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see decompositionprocess.DecompositionprocessPackage#getSplit()
 * @model abstract="true"
 * @generated
 */
public interface Split extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cost</em>' attribute.
	 * @see #setMinCost(double)
	 * @see decompositionprocess.DecompositionprocessPackage#getSplit_MinCost()
	 * @model
	 * @generated
	 */
	double getMinCost();

	/**
	 * Sets the value of the '{@link decompositionprocess.Split#getMinCost <em>Min Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cost</em>' attribute.
	 * @see #getMinCost()
	 * @generated
	 */
	void setMinCost(double value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link decompositionprocess.DecomposeOp#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(DecomposeOp)
	 * @see decompositionprocess.DecompositionprocessPackage#getSplit_Op()
	 * @see decompositionprocess.DecomposeOp#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	DecomposeOp getOp();

	/**
	 * Sets the value of the '{@link decompositionprocess.Split#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(DecomposeOp value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link decompositionprocess.DecomposeOp#getSplits <em>Splits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DecomposeOp)
	 * @see decompositionprocess.DecompositionprocessPackage#getSplit_Parent()
	 * @see decompositionprocess.DecomposeOp#getSplits
	 * @model opposite="splits" required="true" transient="false"
	 * @generated
	 */
	DecomposeOp getParent();

	/**
	 * Sets the value of the '{@link decompositionprocess.Split#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DecomposeOp value);

	/**
	 * Returns the value of the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cost</em>' attribute.
	 * @see #setMaxCost(double)
	 * @see decompositionprocess.DecompositionprocessPackage#getSplit_MaxCost()
	 * @model
	 * @generated
	 */
	double getMaxCost();

	/**
	 * Sets the value of the '{@link decompositionprocess.Split#getMaxCost <em>Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cost</em>' attribute.
	 * @see #getMaxCost()
	 * @generated
	 */
	void setMaxCost(double value);

} // Split
