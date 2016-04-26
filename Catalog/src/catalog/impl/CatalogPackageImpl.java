/**
 */
package catalog.impl;

import catalog.AttributeCatalog;
import catalog.AttributeCatalogSample;
import catalog.CatalogFactory;
import catalog.CatalogModel;
import catalog.CatalogPackage;
import catalog.NamedElement;
import catalog.ReferenceCatalog;
import catalog.ReferenceCatalogSample;
import catalog.TypeCatalog;
import catalog.TypeCatalogSample;

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
public class CatalogPackageImpl extends EPackageImpl implements CatalogPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass catalogModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeCatalogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeCatalogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceCatalogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeCatalogSampleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeCatalogSampleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceCatalogSampleEClass = null;

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
   * @see catalog.CatalogPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CatalogPackageImpl()
  {
    super(eNS_URI, CatalogFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link CatalogPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CatalogPackage init()
  {
    if (isInited) return (CatalogPackage)EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI);

    // Obtain or create and register package
    CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CatalogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CatalogPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCatalogPackage.createPackageContents();

    // Initialize created meta-data
    theCatalogPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCatalogPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CatalogPackage.eNS_URI, theCatalogPackage);
    return theCatalogPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCatalogModel()
  {
    return catalogModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCatalogModel_Types()
  {
    return (EReference)catalogModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCatalogModel_References()
  {
    return (EReference)catalogModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeCatalog()
  {
    return typeCatalogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeCatalog_Attributes()
  {
    return (EReference)typeCatalogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeCatalog_OutgoingReferences()
  {
    return (EReference)typeCatalogEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeCatalog_IncomingReferences()
  {
    return (EReference)typeCatalogEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeCatalog_Super()
  {
    return (EReference)typeCatalogEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeCatalog_Samples()
  {
    return (EReference)typeCatalogEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeCatalog_AggregatedNumberOfInstances()
  {
    return (EAttribute)typeCatalogEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeCatalog()
  {
    return attributeCatalogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeCatalog_Samples()
  {
    return (EReference)attributeCatalogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeCatalog_AggregatedNumberOfDistinctValues()
  {
    return (EAttribute)attributeCatalogEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceCatalog()
  {
    return referenceCatalogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceCatalog_Source()
  {
    return (EReference)referenceCatalogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceCatalog_Target()
  {
    return (EReference)referenceCatalogEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceCatalog_Samples()
  {
    return (EReference)referenceCatalogEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceCatalog_AggregatedNumberOfDistinctSourceInstances()
  {
    return (EAttribute)referenceCatalogEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceCatalog_AggregatedNumberOfDistinctTargetInstances()
  {
    return (EAttribute)referenceCatalogEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceCatalog_AggregatedNumberOfInstances()
  {
    return (EAttribute)referenceCatalogEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeCatalogSample()
  {
    return typeCatalogSampleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeCatalogSample_NumberOfInstances()
  {
    return (EAttribute)typeCatalogSampleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeCatalogSample_Meta()
  {
    return (EReference)typeCatalogSampleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeCatalogSample_Index()
  {
    return (EAttribute)typeCatalogSampleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeCatalogSample()
  {
    return attributeCatalogSampleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeCatalogSample_Meta()
  {
    return (EReference)attributeCatalogSampleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeCatalogSample_Index()
  {
    return (EAttribute)attributeCatalogSampleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeCatalogSample_NumberOfDistinctValues()
  {
    return (EAttribute)attributeCatalogSampleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceCatalogSample()
  {
    return referenceCatalogSampleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceCatalogSample_Meta()
  {
    return (EReference)referenceCatalogSampleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceCatalogSample_NumberOfDistinctSourceInstances()
  {
    return (EAttribute)referenceCatalogSampleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceCatalogSample_NumberOfDistinctTargetInstances()
  {
    return (EAttribute)referenceCatalogSampleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceCatalogSample_Index()
  {
    return (EAttribute)referenceCatalogSampleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceCatalogSample_NumberOfInstances()
  {
    return (EAttribute)referenceCatalogSampleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatalogFactory getCatalogFactory()
  {
    return (CatalogFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    catalogModelEClass = createEClass(CATALOG_MODEL);
    createEReference(catalogModelEClass, CATALOG_MODEL__TYPES);
    createEReference(catalogModelEClass, CATALOG_MODEL__REFERENCES);

    typeCatalogEClass = createEClass(TYPE_CATALOG);
    createEReference(typeCatalogEClass, TYPE_CATALOG__ATTRIBUTES);
    createEReference(typeCatalogEClass, TYPE_CATALOG__OUTGOING_REFERENCES);
    createEReference(typeCatalogEClass, TYPE_CATALOG__INCOMING_REFERENCES);
    createEReference(typeCatalogEClass, TYPE_CATALOG__SUPER);
    createEReference(typeCatalogEClass, TYPE_CATALOG__SAMPLES);
    createEAttribute(typeCatalogEClass, TYPE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES);

    attributeCatalogEClass = createEClass(ATTRIBUTE_CATALOG);
    createEReference(attributeCatalogEClass, ATTRIBUTE_CATALOG__SAMPLES);
    createEAttribute(attributeCatalogEClass, ATTRIBUTE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_VALUES);

    referenceCatalogEClass = createEClass(REFERENCE_CATALOG);
    createEReference(referenceCatalogEClass, REFERENCE_CATALOG__SOURCE);
    createEReference(referenceCatalogEClass, REFERENCE_CATALOG__TARGET);
    createEReference(referenceCatalogEClass, REFERENCE_CATALOG__SAMPLES);
    createEAttribute(referenceCatalogEClass, REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES);
    createEAttribute(referenceCatalogEClass, REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES);
    createEAttribute(referenceCatalogEClass, REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    typeCatalogSampleEClass = createEClass(TYPE_CATALOG_SAMPLE);
    createEAttribute(typeCatalogSampleEClass, TYPE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES);
    createEReference(typeCatalogSampleEClass, TYPE_CATALOG_SAMPLE__META);
    createEAttribute(typeCatalogSampleEClass, TYPE_CATALOG_SAMPLE__INDEX);

    attributeCatalogSampleEClass = createEClass(ATTRIBUTE_CATALOG_SAMPLE);
    createEReference(attributeCatalogSampleEClass, ATTRIBUTE_CATALOG_SAMPLE__META);
    createEAttribute(attributeCatalogSampleEClass, ATTRIBUTE_CATALOG_SAMPLE__INDEX);
    createEAttribute(attributeCatalogSampleEClass, ATTRIBUTE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_VALUES);

    referenceCatalogSampleEClass = createEClass(REFERENCE_CATALOG_SAMPLE);
    createEReference(referenceCatalogSampleEClass, REFERENCE_CATALOG_SAMPLE__META);
    createEAttribute(referenceCatalogSampleEClass, REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_SOURCE_INSTANCES);
    createEAttribute(referenceCatalogSampleEClass, REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_TARGET_INSTANCES);
    createEAttribute(referenceCatalogSampleEClass, REFERENCE_CATALOG_SAMPLE__INDEX);
    createEAttribute(referenceCatalogSampleEClass, REFERENCE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    typeCatalogEClass.getESuperTypes().add(this.getNamedElement());
    attributeCatalogEClass.getESuperTypes().add(this.getNamedElement());
    referenceCatalogEClass.getESuperTypes().add(this.getNamedElement());

    // Initialize classes and features; add operations and parameters
    initEClass(catalogModelEClass, CatalogModel.class, "CatalogModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCatalogModel_Types(), this.getTypeCatalog(), null, "types", null, 0, -1, CatalogModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCatalogModel_References(), this.getReferenceCatalog(), null, "references", null, 0, -1, CatalogModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeCatalogEClass, TypeCatalog.class, "TypeCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeCatalog_Attributes(), this.getAttributeCatalog(), null, "attributes", null, 0, -1, TypeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeCatalog_OutgoingReferences(), this.getReferenceCatalog(), this.getReferenceCatalog_Source(), "outgoingReferences", null, 0, -1, TypeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeCatalog_IncomingReferences(), this.getReferenceCatalog(), this.getReferenceCatalog_Target(), "incomingReferences", null, 0, -1, TypeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeCatalog_Super(), this.getTypeCatalog(), null, "super", null, 0, -1, TypeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeCatalog_Samples(), this.getTypeCatalogSample(), this.getTypeCatalogSample_Meta(), "samples", null, 0, -1, TypeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeCatalog_AggregatedNumberOfInstances(), ecorePackage.getEInt(), "aggregatedNumberOfInstances", null, 0, 1, TypeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeCatalogEClass, AttributeCatalog.class, "AttributeCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeCatalog_Samples(), this.getAttributeCatalogSample(), this.getAttributeCatalogSample_Meta(), "samples", null, 0, -1, AttributeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeCatalog_AggregatedNumberOfDistinctValues(), ecorePackage.getEInt(), "aggregatedNumberOfDistinctValues", null, 0, 1, AttributeCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceCatalogEClass, ReferenceCatalog.class, "ReferenceCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceCatalog_Source(), this.getTypeCatalog(), this.getTypeCatalog_OutgoingReferences(), "source", null, 1, 1, ReferenceCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceCatalog_Target(), this.getTypeCatalog(), this.getTypeCatalog_IncomingReferences(), "target", null, 1, 1, ReferenceCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceCatalog_Samples(), this.getReferenceCatalogSample(), this.getReferenceCatalogSample_Meta(), "samples", null, 0, -1, ReferenceCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceCatalog_AggregatedNumberOfDistinctSourceInstances(), ecorePackage.getEInt(), "aggregatedNumberOfDistinctSourceInstances", null, 0, 1, ReferenceCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceCatalog_AggregatedNumberOfDistinctTargetInstances(), ecorePackage.getEInt(), "aggregatedNumberOfDistinctTargetInstances", null, 0, 1, ReferenceCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceCatalog_AggregatedNumberOfInstances(), ecorePackage.getEInt(), "aggregatedNumberOfInstances", null, 0, 1, ReferenceCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeCatalogSampleEClass, TypeCatalogSample.class, "TypeCatalogSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeCatalogSample_NumberOfInstances(), ecorePackage.getEInt(), "numberOfInstances", null, 1, 1, TypeCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeCatalogSample_Meta(), this.getTypeCatalog(), this.getTypeCatalog_Samples(), "meta", null, 1, 1, TypeCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeCatalogSample_Index(), ecorePackage.getEInt(), "index", null, 1, 1, TypeCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeCatalogSampleEClass, AttributeCatalogSample.class, "AttributeCatalogSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeCatalogSample_Meta(), this.getAttributeCatalog(), this.getAttributeCatalog_Samples(), "meta", null, 1, 1, AttributeCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeCatalogSample_Index(), ecorePackage.getEInt(), "index", null, 1, 1, AttributeCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeCatalogSample_NumberOfDistinctValues(), ecorePackage.getEInt(), "numberOfDistinctValues", null, 1, 1, AttributeCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceCatalogSampleEClass, ReferenceCatalogSample.class, "ReferenceCatalogSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceCatalogSample_Meta(), this.getReferenceCatalog(), this.getReferenceCatalog_Samples(), "meta", null, 1, 1, ReferenceCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceCatalogSample_NumberOfDistinctSourceInstances(), ecorePackage.getEInt(), "numberOfDistinctSourceInstances", null, 1, 1, ReferenceCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceCatalogSample_NumberOfDistinctTargetInstances(), ecorePackage.getEInt(), "numberOfDistinctTargetInstances", null, 1, 1, ReferenceCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceCatalogSample_Index(), ecorePackage.getEInt(), "index", null, 1, 1, ReferenceCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferenceCatalogSample_NumberOfInstances(), ecorePackage.getEInt(), "numberOfInstances", null, 1, 1, ReferenceCatalogSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CatalogPackageImpl
