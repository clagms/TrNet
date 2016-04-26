/**
 */
package decompositionprocess.impl;

import decompositionprocess.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecompositionprocessFactoryImpl extends EFactoryImpl implements DecompositionprocessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DecompositionprocessFactory init() {
		try {
			DecompositionprocessFactory theDecompositionprocessFactory = (DecompositionprocessFactory)EPackage.Registry.INSTANCE.getEFactory(DecompositionprocessPackage.eNS_URI);
			if (theDecompositionprocessFactory != null) {
				return theDecompositionprocessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DecompositionprocessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionprocessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DecompositionprocessPackage.DECOMPOSITION: return createDecomposition();
			case DecompositionprocessPackage.DECOMPOSE_OP: return createDecomposeOp();
			case DecompositionprocessPackage.OPERAND_SPLIT: return createOperandSplit();
			case DecompositionprocessPackage.GENERIC_SPLIT: return createGenericSplit();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition createDecomposition() {
		DecompositionImpl decomposition = new DecompositionImpl();
		return decomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecomposeOp createDecomposeOp() {
		DecomposeOpImpl decomposeOp = new DecomposeOpImpl();
		return decomposeOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandSplit createOperandSplit() {
		OperandSplitImpl operandSplit = new OperandSplitImpl();
		return operandSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericSplit createGenericSplit() {
		GenericSplitImpl genericSplit = new GenericSplitImpl();
		return genericSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionprocessPackage getDecompositionprocessPackage() {
		return (DecompositionprocessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DecompositionprocessPackage getPackage() {
		return DecompositionprocessPackage.eINSTANCE;
	}

} //DecompositionprocessFactoryImpl
