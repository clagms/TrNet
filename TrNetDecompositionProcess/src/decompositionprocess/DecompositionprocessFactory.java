/**
 */
package decompositionprocess;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see decompositionprocess.DecompositionprocessPackage
 * @generated
 */
public interface DecompositionprocessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecompositionprocessFactory eINSTANCE = decompositionprocess.impl.DecompositionprocessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decomposition</em>'.
	 * @generated
	 */
	Decomposition createDecomposition();

	/**
	 * Returns a new object of class '<em>Decompose Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decompose Op</em>'.
	 * @generated
	 */
	DecomposeOp createDecomposeOp();

	/**
	 * Returns a new object of class '<em>Operand Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operand Split</em>'.
	 * @generated
	 */
	OperandSplit createOperandSplit();

	/**
	 * Returns a new object of class '<em>Generic Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Split</em>'.
	 * @generated
	 */
	GenericSplit createGenericSplit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DecompositionprocessPackage getDecompositionprocessPackage();

} //DecompositionprocessFactory
