/**
 */
package decompositionprocess.impl;

import decompositionprocess.DecomposeOp;
import decompositionprocess.Decomposition;
import decompositionprocess.DecompositionprocessFactory;
import decompositionprocess.DecompositionprocessPackage;
import decompositionprocess.GenericSplit;
import decompositionprocess.OperandSplit;
import decompositionprocess.Split;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecompositionprocessPackageImpl extends EPackageImpl implements DecompositionprocessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decomposeOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericSplitEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see decompositionprocess.DecompositionprocessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DecompositionprocessPackageImpl() {
		super(eNS_URI, DecompositionprocessFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DecompositionprocessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DecompositionprocessPackage init() {
		if (isInited) return (DecompositionprocessPackage)EPackage.Registry.INSTANCE.getEPackage(DecompositionprocessPackage.eNS_URI);

		// Obtain or create and register package
		DecompositionprocessPackageImpl theDecompositionprocessPackage = (DecompositionprocessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DecompositionprocessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DecompositionprocessPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDecompositionprocessPackage.createPackageContents();

		// Initialize created meta-data
		theDecompositionprocessPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDecompositionprocessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DecompositionprocessPackage.eNS_URI, theDecompositionprocessPackage);
		return theDecompositionprocessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecomposition() {
		return decompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecomposition_File() {
		return (EAttribute)decompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecomposeOp() {
		return decomposeOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecomposeOp_Id() {
		return (EAttribute)decomposeOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposeOp_Splits() {
		return (EReference)decomposeOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposeOp_Parent() {
		return (EReference)decomposeOpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposeOp_Min() {
		return (EReference)decomposeOpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposeOp_Max() {
		return (EReference)decomposeOpEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplit() {
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplit_MinCost() {
		return (EAttribute)splitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_Op() {
		return (EReference)splitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplit_Parent() {
		return (EReference)splitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplit_MaxCost() {
		return (EAttribute)splitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperandSplit() {
		return operandSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperandSplit_Id() {
		return (EAttribute)operandSplitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericSplit() {
		return genericSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionprocessFactory getDecompositionprocessFactory() {
		return (DecompositionprocessFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		decompositionEClass = createEClass(DECOMPOSITION);
		createEAttribute(decompositionEClass, DECOMPOSITION__FILE);

		decomposeOpEClass = createEClass(DECOMPOSE_OP);
		createEAttribute(decomposeOpEClass, DECOMPOSE_OP__ID);
		createEReference(decomposeOpEClass, DECOMPOSE_OP__SPLITS);
		createEReference(decomposeOpEClass, DECOMPOSE_OP__PARENT);
		createEReference(decomposeOpEClass, DECOMPOSE_OP__MIN);
		createEReference(decomposeOpEClass, DECOMPOSE_OP__MAX);

		splitEClass = createEClass(SPLIT);
		createEAttribute(splitEClass, SPLIT__MIN_COST);
		createEReference(splitEClass, SPLIT__OP);
		createEReference(splitEClass, SPLIT__PARENT);
		createEAttribute(splitEClass, SPLIT__MAX_COST);

		operandSplitEClass = createEClass(OPERAND_SPLIT);
		createEAttribute(operandSplitEClass, OPERAND_SPLIT__ID);

		genericSplitEClass = createEClass(GENERIC_SPLIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		decompositionEClass.getESuperTypes().add(this.getSplit());
		operandSplitEClass.getESuperTypes().add(this.getSplit());
		genericSplitEClass.getESuperTypes().add(this.getSplit());

		// Initialize classes and features; add operations and parameters
		initEClass(decompositionEClass, Decomposition.class, "Decomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecomposition_File(), ecorePackage.getEString(), "file", null, 0, 1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decomposeOpEClass, DecomposeOp.class, "DecomposeOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecomposeOp_Id(), ecorePackage.getEString(), "id", null, 0, 1, DecomposeOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecomposeOp_Splits(), this.getSplit(), this.getSplit_Parent(), "splits", null, 0, -1, DecomposeOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecomposeOp_Parent(), this.getSplit(), this.getSplit_Op(), "parent", null, 1, 1, DecomposeOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecomposeOp_Min(), this.getSplit(), null, "min", null, 0, 1, DecomposeOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecomposeOp_Max(), this.getSplit(), null, "max", null, 0, 1, DecomposeOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitEClass, Split.class, "Split", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSplit_MinCost(), ecorePackage.getEDouble(), "minCost", null, 0, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplit_Op(), this.getDecomposeOp(), this.getDecomposeOp_Parent(), "op", null, 0, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplit_Parent(), this.getDecomposeOp(), this.getDecomposeOp_Splits(), "parent", null, 1, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSplit_MaxCost(), ecorePackage.getEDouble(), "maxCost", null, 0, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operandSplitEClass, OperandSplit.class, "OperandSplit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperandSplit_Id(), ecorePackage.getEString(), "id", null, 0, 1, OperandSplit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericSplitEClass, GenericSplit.class, "GenericSplit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DecompositionprocessPackageImpl
