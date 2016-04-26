/**
 */
package decompositionprocess;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see decompositionprocess.DecompositionprocessFactory
 * @model kind="package"
 * @generated
 */
public interface DecompositionprocessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "decompositionprocess";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://decompositionprocess/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "decompositionprocess";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecompositionprocessPackage eINSTANCE = decompositionprocess.impl.DecompositionprocessPackageImpl.init();

	/**
	 * The meta object id for the '{@link decompositionprocess.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decompositionprocess.impl.SplitImpl
	 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 2;

	/**
	 * The feature id for the '<em><b>Min Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__MIN_COST = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__OP = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__MAX_COST = 3;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link decompositionprocess.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decompositionprocess.impl.DecompositionImpl
	 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Min Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__MIN_COST = SPLIT__MIN_COST;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__OP = SPLIT__OP;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__PARENT = SPLIT__PARENT;

	/**
	 * The feature id for the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__MAX_COST = SPLIT__MAX_COST;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__FILE = SPLIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = SPLIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link decompositionprocess.impl.DecomposeOpImpl <em>Decompose Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decompositionprocess.impl.DecomposeOpImpl
	 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getDecomposeOp()
	 * @generated
	 */
	int DECOMPOSE_OP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSE_OP__ID = 0;

	/**
	 * The feature id for the '<em><b>Splits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSE_OP__SPLITS = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSE_OP__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSE_OP__MIN = 3;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSE_OP__MAX = 4;

	/**
	 * The number of structural features of the '<em>Decompose Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSE_OP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link decompositionprocess.impl.OperandSplitImpl <em>Operand Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decompositionprocess.impl.OperandSplitImpl
	 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getOperandSplit()
	 * @generated
	 */
	int OPERAND_SPLIT = 3;

	/**
	 * The feature id for the '<em><b>Min Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_SPLIT__MIN_COST = SPLIT__MIN_COST;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_SPLIT__OP = SPLIT__OP;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_SPLIT__PARENT = SPLIT__PARENT;

	/**
	 * The feature id for the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_SPLIT__MAX_COST = SPLIT__MAX_COST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_SPLIT__ID = SPLIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operand Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_SPLIT_FEATURE_COUNT = SPLIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link decompositionprocess.impl.GenericSplitImpl <em>Generic Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see decompositionprocess.impl.GenericSplitImpl
	 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getGenericSplit()
	 * @generated
	 */
	int GENERIC_SPLIT = 4;

	/**
	 * The feature id for the '<em><b>Min Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SPLIT__MIN_COST = SPLIT__MIN_COST;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SPLIT__OP = SPLIT__OP;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SPLIT__PARENT = SPLIT__PARENT;

	/**
	 * The feature id for the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SPLIT__MAX_COST = SPLIT__MAX_COST;

	/**
	 * The number of structural features of the '<em>Generic Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SPLIT_FEATURE_COUNT = SPLIT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link decompositionprocess.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see decompositionprocess.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for the attribute '{@link decompositionprocess.Decomposition#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see decompositionprocess.Decomposition#getFile()
	 * @see #getDecomposition()
	 * @generated
	 */
	EAttribute getDecomposition_File();

	/**
	 * Returns the meta object for class '{@link decompositionprocess.DecomposeOp <em>Decompose Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decompose Op</em>'.
	 * @see decompositionprocess.DecomposeOp
	 * @generated
	 */
	EClass getDecomposeOp();

	/**
	 * Returns the meta object for the attribute '{@link decompositionprocess.DecomposeOp#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see decompositionprocess.DecomposeOp#getId()
	 * @see #getDecomposeOp()
	 * @generated
	 */
	EAttribute getDecomposeOp_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link decompositionprocess.DecomposeOp#getSplits <em>Splits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Splits</em>'.
	 * @see decompositionprocess.DecomposeOp#getSplits()
	 * @see #getDecomposeOp()
	 * @generated
	 */
	EReference getDecomposeOp_Splits();

	/**
	 * Returns the meta object for the container reference '{@link decompositionprocess.DecomposeOp#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see decompositionprocess.DecomposeOp#getParent()
	 * @see #getDecomposeOp()
	 * @generated
	 */
	EReference getDecomposeOp_Parent();

	/**
	 * Returns the meta object for the reference '{@link decompositionprocess.DecomposeOp#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see decompositionprocess.DecomposeOp#getMin()
	 * @see #getDecomposeOp()
	 * @generated
	 */
	EReference getDecomposeOp_Min();

	/**
	 * Returns the meta object for the reference '{@link decompositionprocess.DecomposeOp#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see decompositionprocess.DecomposeOp#getMax()
	 * @see #getDecomposeOp()
	 * @generated
	 */
	EReference getDecomposeOp_Max();

	/**
	 * Returns the meta object for class '{@link decompositionprocess.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see decompositionprocess.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the attribute '{@link decompositionprocess.Split#getMinCost <em>Min Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cost</em>'.
	 * @see decompositionprocess.Split#getMinCost()
	 * @see #getSplit()
	 * @generated
	 */
	EAttribute getSplit_MinCost();

	/**
	 * Returns the meta object for the containment reference '{@link decompositionprocess.Split#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see decompositionprocess.Split#getOp()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Op();

	/**
	 * Returns the meta object for the container reference '{@link decompositionprocess.Split#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see decompositionprocess.Split#getParent()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_Parent();

	/**
	 * Returns the meta object for the attribute '{@link decompositionprocess.Split#getMaxCost <em>Max Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cost</em>'.
	 * @see decompositionprocess.Split#getMaxCost()
	 * @see #getSplit()
	 * @generated
	 */
	EAttribute getSplit_MaxCost();

	/**
	 * Returns the meta object for class '{@link decompositionprocess.OperandSplit <em>Operand Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand Split</em>'.
	 * @see decompositionprocess.OperandSplit
	 * @generated
	 */
	EClass getOperandSplit();

	/**
	 * Returns the meta object for the attribute '{@link decompositionprocess.OperandSplit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see decompositionprocess.OperandSplit#getId()
	 * @see #getOperandSplit()
	 * @generated
	 */
	EAttribute getOperandSplit_Id();

	/**
	 * Returns the meta object for class '{@link decompositionprocess.GenericSplit <em>Generic Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Split</em>'.
	 * @see decompositionprocess.GenericSplit
	 * @generated
	 */
	EClass getGenericSplit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DecompositionprocessFactory getDecompositionprocessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link decompositionprocess.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decompositionprocess.impl.DecompositionImpl
		 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECOMPOSITION__FILE = eINSTANCE.getDecomposition_File();

		/**
		 * The meta object literal for the '{@link decompositionprocess.impl.DecomposeOpImpl <em>Decompose Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decompositionprocess.impl.DecomposeOpImpl
		 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getDecomposeOp()
		 * @generated
		 */
		EClass DECOMPOSE_OP = eINSTANCE.getDecomposeOp();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECOMPOSE_OP__ID = eINSTANCE.getDecomposeOp_Id();

		/**
		 * The meta object literal for the '<em><b>Splits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSE_OP__SPLITS = eINSTANCE.getDecomposeOp_Splits();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSE_OP__PARENT = eINSTANCE.getDecomposeOp_Parent();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSE_OP__MIN = eINSTANCE.getDecomposeOp_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSE_OP__MAX = eINSTANCE.getDecomposeOp_Max();

		/**
		 * The meta object literal for the '{@link decompositionprocess.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decompositionprocess.impl.SplitImpl
		 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getSplit()
		 * @generated
		 */
		EClass SPLIT = eINSTANCE.getSplit();

		/**
		 * The meta object literal for the '<em><b>Min Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT__MIN_COST = eINSTANCE.getSplit_MinCost();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__OP = eINSTANCE.getSplit_Op();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__PARENT = eINSTANCE.getSplit_Parent();

		/**
		 * The meta object literal for the '<em><b>Max Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT__MAX_COST = eINSTANCE.getSplit_MaxCost();

		/**
		 * The meta object literal for the '{@link decompositionprocess.impl.OperandSplitImpl <em>Operand Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decompositionprocess.impl.OperandSplitImpl
		 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getOperandSplit()
		 * @generated
		 */
		EClass OPERAND_SPLIT = eINSTANCE.getOperandSplit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERAND_SPLIT__ID = eINSTANCE.getOperandSplit_Id();

		/**
		 * The meta object literal for the '{@link decompositionprocess.impl.GenericSplitImpl <em>Generic Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see decompositionprocess.impl.GenericSplitImpl
		 * @see decompositionprocess.impl.DecompositionprocessPackageImpl#getGenericSplit()
		 * @generated
		 */
		EClass GENERIC_SPLIT = eINSTANCE.getGenericSplit();

	}

} //DecompositionprocessPackage
