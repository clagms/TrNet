/**
 */
package catalog;

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
 * @see catalog.CatalogFactory
 * @model kind="package"
 * @generated
 */
public interface CatalogPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "catalog";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://catalog/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "catalog";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CatalogPackage eINSTANCE = catalog.impl.CatalogPackageImpl.init();

  /**
   * The meta object id for the '{@link catalog.impl.CatalogModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see catalog.impl.CatalogModelImpl
   * @see catalog.impl.CatalogPackageImpl#getCatalogModel()
   * @generated
   */
  int CATALOG_MODEL = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATALOG_MODEL__TYPES = 0;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATALOG_MODEL__REFERENCES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATALOG_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link catalog.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see catalog.impl.NamedElementImpl
   * @see catalog.impl.CatalogPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link catalog.impl.TypeCatalogImpl <em>Type Catalog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see catalog.impl.TypeCatalogImpl
   * @see catalog.impl.CatalogPackageImpl#getTypeCatalog()
   * @generated
   */
  int TYPE_CATALOG = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoing References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG__OUTGOING_REFERENCES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Incoming References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG__INCOMING_REFERENCES = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG__SUPER = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Samples</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG__SAMPLES = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Aggregated Number Of Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Type Catalog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link catalog.impl.AttributeCatalogImpl <em>Attribute Catalog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see catalog.impl.AttributeCatalogImpl
   * @see catalog.impl.CatalogPackageImpl#getAttributeCatalog()
   * @generated
   */
  int ATTRIBUTE_CATALOG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CATALOG__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Samples</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CATALOG__SAMPLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aggregated Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_VALUES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute Catalog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CATALOG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link catalog.impl.ReferenceCatalogImpl <em>Reference Catalog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see catalog.impl.ReferenceCatalogImpl
   * @see catalog.impl.CatalogPackageImpl#getReferenceCatalog()
   * @generated
   */
  int REFERENCE_CATALOG = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Samples</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG__SAMPLES = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Aggregated Number Of Distinct Source Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Aggregated Number Of Distinct Target Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Aggregated Number Of Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Reference Catalog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link catalog.impl.TypeCatalogSampleImpl <em>Type Catalog Sample</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see catalog.impl.TypeCatalogSampleImpl
   * @see catalog.impl.CatalogPackageImpl#getTypeCatalogSample()
   * @generated
   */
  int TYPE_CATALOG_SAMPLE = 5;

  /**
   * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES = 0;

  /**
   * The feature id for the '<em><b>Meta</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG_SAMPLE__META = 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG_SAMPLE__INDEX = 2;

  /**
   * The number of structural features of the '<em>Type Catalog Sample</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CATALOG_SAMPLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link catalog.impl.AttributeCatalogSampleImpl <em>Attribute Catalog Sample</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see catalog.impl.AttributeCatalogSampleImpl
   * @see catalog.impl.CatalogPackageImpl#getAttributeCatalogSample()
   * @generated
   */
  int ATTRIBUTE_CATALOG_SAMPLE = 6;

  /**
   * The feature id for the '<em><b>Meta</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CATALOG_SAMPLE__META = 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CATALOG_SAMPLE__INDEX = 1;

  /**
   * The feature id for the '<em><b>Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_VALUES = 2;

  /**
   * The number of structural features of the '<em>Attribute Catalog Sample</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CATALOG_SAMPLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link catalog.impl.ReferenceCatalogSampleImpl <em>Reference Catalog Sample</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see catalog.impl.ReferenceCatalogSampleImpl
   * @see catalog.impl.CatalogPackageImpl#getReferenceCatalogSample()
   * @generated
   */
  int REFERENCE_CATALOG_SAMPLE = 7;

  /**
   * The feature id for the '<em><b>Meta</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG_SAMPLE__META = 0;

  /**
   * The feature id for the '<em><b>Number Of Distinct Source Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_SOURCE_INSTANCES = 1;

  /**
   * The feature id for the '<em><b>Number Of Distinct Target Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_TARGET_INSTANCES = 2;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG_SAMPLE__INDEX = 3;

  /**
   * The feature id for the '<em><b>Number Of Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES = 4;

  /**
   * The number of structural features of the '<em>Reference Catalog Sample</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_CATALOG_SAMPLE_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link catalog.CatalogModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see catalog.CatalogModel
   * @generated
   */
  EClass getCatalogModel();

  /**
   * Returns the meta object for the containment reference list '{@link catalog.CatalogModel#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see catalog.CatalogModel#getTypes()
   * @see #getCatalogModel()
   * @generated
   */
  EReference getCatalogModel_Types();

  /**
   * Returns the meta object for the containment reference list '{@link catalog.CatalogModel#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see catalog.CatalogModel#getReferences()
   * @see #getCatalogModel()
   * @generated
   */
  EReference getCatalogModel_References();

  /**
   * Returns the meta object for class '{@link catalog.TypeCatalog <em>Type Catalog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Catalog</em>'.
   * @see catalog.TypeCatalog
   * @generated
   */
  EClass getTypeCatalog();

  /**
   * Returns the meta object for the containment reference list '{@link catalog.TypeCatalog#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see catalog.TypeCatalog#getAttributes()
   * @see #getTypeCatalog()
   * @generated
   */
  EReference getTypeCatalog_Attributes();

  /**
   * Returns the meta object for the reference list '{@link catalog.TypeCatalog#getOutgoingReferences <em>Outgoing References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing References</em>'.
   * @see catalog.TypeCatalog#getOutgoingReferences()
   * @see #getTypeCatalog()
   * @generated
   */
  EReference getTypeCatalog_OutgoingReferences();

  /**
   * Returns the meta object for the reference list '{@link catalog.TypeCatalog#getIncomingReferences <em>Incoming References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming References</em>'.
   * @see catalog.TypeCatalog#getIncomingReferences()
   * @see #getTypeCatalog()
   * @generated
   */
  EReference getTypeCatalog_IncomingReferences();

  /**
   * Returns the meta object for the reference list '{@link catalog.TypeCatalog#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super</em>'.
   * @see catalog.TypeCatalog#getSuper()
   * @see #getTypeCatalog()
   * @generated
   */
  EReference getTypeCatalog_Super();

  /**
   * Returns the meta object for the containment reference list '{@link catalog.TypeCatalog#getSamples <em>Samples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Samples</em>'.
   * @see catalog.TypeCatalog#getSamples()
   * @see #getTypeCatalog()
   * @generated
   */
  EReference getTypeCatalog_Samples();

  /**
   * Returns the meta object for the attribute '{@link catalog.TypeCatalog#getAggregatedNumberOfInstances <em>Aggregated Number Of Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregated Number Of Instances</em>'.
   * @see catalog.TypeCatalog#getAggregatedNumberOfInstances()
   * @see #getTypeCatalog()
   * @generated
   */
  EAttribute getTypeCatalog_AggregatedNumberOfInstances();

  /**
   * Returns the meta object for class '{@link catalog.AttributeCatalog <em>Attribute Catalog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Catalog</em>'.
   * @see catalog.AttributeCatalog
   * @generated
   */
  EClass getAttributeCatalog();

  /**
   * Returns the meta object for the containment reference list '{@link catalog.AttributeCatalog#getSamples <em>Samples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Samples</em>'.
   * @see catalog.AttributeCatalog#getSamples()
   * @see #getAttributeCatalog()
   * @generated
   */
  EReference getAttributeCatalog_Samples();

  /**
   * Returns the meta object for the attribute '{@link catalog.AttributeCatalog#getAggregatedNumberOfDistinctValues <em>Aggregated Number Of Distinct Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregated Number Of Distinct Values</em>'.
   * @see catalog.AttributeCatalog#getAggregatedNumberOfDistinctValues()
   * @see #getAttributeCatalog()
   * @generated
   */
  EAttribute getAttributeCatalog_AggregatedNumberOfDistinctValues();

  /**
   * Returns the meta object for class '{@link catalog.ReferenceCatalog <em>Reference Catalog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Catalog</em>'.
   * @see catalog.ReferenceCatalog
   * @generated
   */
  EClass getReferenceCatalog();

  /**
   * Returns the meta object for the reference '{@link catalog.ReferenceCatalog#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see catalog.ReferenceCatalog#getSource()
   * @see #getReferenceCatalog()
   * @generated
   */
  EReference getReferenceCatalog_Source();

  /**
   * Returns the meta object for the reference '{@link catalog.ReferenceCatalog#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see catalog.ReferenceCatalog#getTarget()
   * @see #getReferenceCatalog()
   * @generated
   */
  EReference getReferenceCatalog_Target();

  /**
   * Returns the meta object for the containment reference list '{@link catalog.ReferenceCatalog#getSamples <em>Samples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Samples</em>'.
   * @see catalog.ReferenceCatalog#getSamples()
   * @see #getReferenceCatalog()
   * @generated
   */
  EReference getReferenceCatalog_Samples();

  /**
   * Returns the meta object for the attribute '{@link catalog.ReferenceCatalog#getAggregatedNumberOfDistinctSourceInstances <em>Aggregated Number Of Distinct Source Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregated Number Of Distinct Source Instances</em>'.
   * @see catalog.ReferenceCatalog#getAggregatedNumberOfDistinctSourceInstances()
   * @see #getReferenceCatalog()
   * @generated
   */
  EAttribute getReferenceCatalog_AggregatedNumberOfDistinctSourceInstances();

  /**
   * Returns the meta object for the attribute '{@link catalog.ReferenceCatalog#getAggregatedNumberOfDistinctTargetInstances <em>Aggregated Number Of Distinct Target Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregated Number Of Distinct Target Instances</em>'.
   * @see catalog.ReferenceCatalog#getAggregatedNumberOfDistinctTargetInstances()
   * @see #getReferenceCatalog()
   * @generated
   */
  EAttribute getReferenceCatalog_AggregatedNumberOfDistinctTargetInstances();

  /**
   * Returns the meta object for the attribute '{@link catalog.ReferenceCatalog#getAggregatedNumberOfInstances <em>Aggregated Number Of Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregated Number Of Instances</em>'.
   * @see catalog.ReferenceCatalog#getAggregatedNumberOfInstances()
   * @see #getReferenceCatalog()
   * @generated
   */
  EAttribute getReferenceCatalog_AggregatedNumberOfInstances();

  /**
   * Returns the meta object for class '{@link catalog.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see catalog.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link catalog.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see catalog.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link catalog.TypeCatalogSample <em>Type Catalog Sample</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Catalog Sample</em>'.
   * @see catalog.TypeCatalogSample
   * @generated
   */
  EClass getTypeCatalogSample();

  /**
   * Returns the meta object for the attribute '{@link catalog.TypeCatalogSample#getNumberOfInstances <em>Number Of Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Of Instances</em>'.
   * @see catalog.TypeCatalogSample#getNumberOfInstances()
   * @see #getTypeCatalogSample()
   * @generated
   */
  EAttribute getTypeCatalogSample_NumberOfInstances();

  /**
   * Returns the meta object for the container reference '{@link catalog.TypeCatalogSample#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Meta</em>'.
   * @see catalog.TypeCatalogSample#getMeta()
   * @see #getTypeCatalogSample()
   * @generated
   */
  EReference getTypeCatalogSample_Meta();

  /**
   * Returns the meta object for the attribute '{@link catalog.TypeCatalogSample#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see catalog.TypeCatalogSample#getIndex()
   * @see #getTypeCatalogSample()
   * @generated
   */
  EAttribute getTypeCatalogSample_Index();

  /**
   * Returns the meta object for class '{@link catalog.AttributeCatalogSample <em>Attribute Catalog Sample</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Catalog Sample</em>'.
   * @see catalog.AttributeCatalogSample
   * @generated
   */
  EClass getAttributeCatalogSample();

  /**
   * Returns the meta object for the container reference '{@link catalog.AttributeCatalogSample#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Meta</em>'.
   * @see catalog.AttributeCatalogSample#getMeta()
   * @see #getAttributeCatalogSample()
   * @generated
   */
  EReference getAttributeCatalogSample_Meta();

  /**
   * Returns the meta object for the attribute '{@link catalog.AttributeCatalogSample#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see catalog.AttributeCatalogSample#getIndex()
   * @see #getAttributeCatalogSample()
   * @generated
   */
  EAttribute getAttributeCatalogSample_Index();

  /**
   * Returns the meta object for the attribute '{@link catalog.AttributeCatalogSample#getNumberOfDistinctValues <em>Number Of Distinct Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Of Distinct Values</em>'.
   * @see catalog.AttributeCatalogSample#getNumberOfDistinctValues()
   * @see #getAttributeCatalogSample()
   * @generated
   */
  EAttribute getAttributeCatalogSample_NumberOfDistinctValues();

  /**
   * Returns the meta object for class '{@link catalog.ReferenceCatalogSample <em>Reference Catalog Sample</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Catalog Sample</em>'.
   * @see catalog.ReferenceCatalogSample
   * @generated
   */
  EClass getReferenceCatalogSample();

  /**
   * Returns the meta object for the container reference '{@link catalog.ReferenceCatalogSample#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Meta</em>'.
   * @see catalog.ReferenceCatalogSample#getMeta()
   * @see #getReferenceCatalogSample()
   * @generated
   */
  EReference getReferenceCatalogSample_Meta();

  /**
   * Returns the meta object for the attribute '{@link catalog.ReferenceCatalogSample#getNumberOfDistinctSourceInstances <em>Number Of Distinct Source Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Of Distinct Source Instances</em>'.
   * @see catalog.ReferenceCatalogSample#getNumberOfDistinctSourceInstances()
   * @see #getReferenceCatalogSample()
   * @generated
   */
  EAttribute getReferenceCatalogSample_NumberOfDistinctSourceInstances();

  /**
   * Returns the meta object for the attribute '{@link catalog.ReferenceCatalogSample#getNumberOfDistinctTargetInstances <em>Number Of Distinct Target Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Of Distinct Target Instances</em>'.
   * @see catalog.ReferenceCatalogSample#getNumberOfDistinctTargetInstances()
   * @see #getReferenceCatalogSample()
   * @generated
   */
  EAttribute getReferenceCatalogSample_NumberOfDistinctTargetInstances();

  /**
   * Returns the meta object for the attribute '{@link catalog.ReferenceCatalogSample#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see catalog.ReferenceCatalogSample#getIndex()
   * @see #getReferenceCatalogSample()
   * @generated
   */
  EAttribute getReferenceCatalogSample_Index();

  /**
   * Returns the meta object for the attribute '{@link catalog.ReferenceCatalogSample#getNumberOfInstances <em>Number Of Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Of Instances</em>'.
   * @see catalog.ReferenceCatalogSample#getNumberOfInstances()
   * @see #getReferenceCatalogSample()
   * @generated
   */
  EAttribute getReferenceCatalogSample_NumberOfInstances();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CatalogFactory getCatalogFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link catalog.impl.CatalogModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see catalog.impl.CatalogModelImpl
     * @see catalog.impl.CatalogPackageImpl#getCatalogModel()
     * @generated
     */
    EClass CATALOG_MODEL = eINSTANCE.getCatalogModel();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATALOG_MODEL__TYPES = eINSTANCE.getCatalogModel_Types();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATALOG_MODEL__REFERENCES = eINSTANCE.getCatalogModel_References();

    /**
     * The meta object literal for the '{@link catalog.impl.TypeCatalogImpl <em>Type Catalog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see catalog.impl.TypeCatalogImpl
     * @see catalog.impl.CatalogPackageImpl#getTypeCatalog()
     * @generated
     */
    EClass TYPE_CATALOG = eINSTANCE.getTypeCatalog();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CATALOG__ATTRIBUTES = eINSTANCE.getTypeCatalog_Attributes();

    /**
     * The meta object literal for the '<em><b>Outgoing References</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CATALOG__OUTGOING_REFERENCES = eINSTANCE.getTypeCatalog_OutgoingReferences();

    /**
     * The meta object literal for the '<em><b>Incoming References</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CATALOG__INCOMING_REFERENCES = eINSTANCE.getTypeCatalog_IncomingReferences();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CATALOG__SUPER = eINSTANCE.getTypeCatalog_Super();

    /**
     * The meta object literal for the '<em><b>Samples</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CATALOG__SAMPLES = eINSTANCE.getTypeCatalog_Samples();

    /**
     * The meta object literal for the '<em><b>Aggregated Number Of Instances</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES = eINSTANCE.getTypeCatalog_AggregatedNumberOfInstances();

    /**
     * The meta object literal for the '{@link catalog.impl.AttributeCatalogImpl <em>Attribute Catalog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see catalog.impl.AttributeCatalogImpl
     * @see catalog.impl.CatalogPackageImpl#getAttributeCatalog()
     * @generated
     */
    EClass ATTRIBUTE_CATALOG = eINSTANCE.getAttributeCatalog();

    /**
     * The meta object literal for the '<em><b>Samples</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_CATALOG__SAMPLES = eINSTANCE.getAttributeCatalog_Samples();

    /**
     * The meta object literal for the '<em><b>Aggregated Number Of Distinct Values</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_VALUES = eINSTANCE.getAttributeCatalog_AggregatedNumberOfDistinctValues();

    /**
     * The meta object literal for the '{@link catalog.impl.ReferenceCatalogImpl <em>Reference Catalog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see catalog.impl.ReferenceCatalogImpl
     * @see catalog.impl.CatalogPackageImpl#getReferenceCatalog()
     * @generated
     */
    EClass REFERENCE_CATALOG = eINSTANCE.getReferenceCatalog();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_CATALOG__SOURCE = eINSTANCE.getReferenceCatalog_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_CATALOG__TARGET = eINSTANCE.getReferenceCatalog_Target();

    /**
     * The meta object literal for the '<em><b>Samples</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_CATALOG__SAMPLES = eINSTANCE.getReferenceCatalog_Samples();

    /**
     * The meta object literal for the '<em><b>Aggregated Number Of Distinct Source Instances</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_SOURCE_INSTANCES = eINSTANCE.getReferenceCatalog_AggregatedNumberOfDistinctSourceInstances();

    /**
     * The meta object literal for the '<em><b>Aggregated Number Of Distinct Target Instances</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_DISTINCT_TARGET_INSTANCES = eINSTANCE.getReferenceCatalog_AggregatedNumberOfDistinctTargetInstances();

    /**
     * The meta object literal for the '<em><b>Aggregated Number Of Instances</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CATALOG__AGGREGATED_NUMBER_OF_INSTANCES = eINSTANCE.getReferenceCatalog_AggregatedNumberOfInstances();

    /**
     * The meta object literal for the '{@link catalog.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see catalog.impl.NamedElementImpl
     * @see catalog.impl.CatalogPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link catalog.impl.TypeCatalogSampleImpl <em>Type Catalog Sample</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see catalog.impl.TypeCatalogSampleImpl
     * @see catalog.impl.CatalogPackageImpl#getTypeCatalogSample()
     * @generated
     */
    EClass TYPE_CATALOG_SAMPLE = eINSTANCE.getTypeCatalogSample();

    /**
     * The meta object literal for the '<em><b>Number Of Instances</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES = eINSTANCE.getTypeCatalogSample_NumberOfInstances();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_CATALOG_SAMPLE__META = eINSTANCE.getTypeCatalogSample_Meta();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_CATALOG_SAMPLE__INDEX = eINSTANCE.getTypeCatalogSample_Index();

    /**
     * The meta object literal for the '{@link catalog.impl.AttributeCatalogSampleImpl <em>Attribute Catalog Sample</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see catalog.impl.AttributeCatalogSampleImpl
     * @see catalog.impl.CatalogPackageImpl#getAttributeCatalogSample()
     * @generated
     */
    EClass ATTRIBUTE_CATALOG_SAMPLE = eINSTANCE.getAttributeCatalogSample();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_CATALOG_SAMPLE__META = eINSTANCE.getAttributeCatalogSample_Meta();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_CATALOG_SAMPLE__INDEX = eINSTANCE.getAttributeCatalogSample_Index();

    /**
     * The meta object literal for the '<em><b>Number Of Distinct Values</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_VALUES = eINSTANCE.getAttributeCatalogSample_NumberOfDistinctValues();

    /**
     * The meta object literal for the '{@link catalog.impl.ReferenceCatalogSampleImpl <em>Reference Catalog Sample</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see catalog.impl.ReferenceCatalogSampleImpl
     * @see catalog.impl.CatalogPackageImpl#getReferenceCatalogSample()
     * @generated
     */
    EClass REFERENCE_CATALOG_SAMPLE = eINSTANCE.getReferenceCatalogSample();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_CATALOG_SAMPLE__META = eINSTANCE.getReferenceCatalogSample_Meta();

    /**
     * The meta object literal for the '<em><b>Number Of Distinct Source Instances</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_SOURCE_INSTANCES = eINSTANCE.getReferenceCatalogSample_NumberOfDistinctSourceInstances();

    /**
     * The meta object literal for the '<em><b>Number Of Distinct Target Instances</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CATALOG_SAMPLE__NUMBER_OF_DISTINCT_TARGET_INSTANCES = eINSTANCE.getReferenceCatalogSample_NumberOfDistinctTargetInstances();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CATALOG_SAMPLE__INDEX = eINSTANCE.getReferenceCatalogSample_Index();

    /**
     * The meta object literal for the '<em><b>Number Of Instances</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_CATALOG_SAMPLE__NUMBER_OF_INSTANCES = eINSTANCE.getReferenceCatalogSample_NumberOfInstances();

  }

} //CatalogPackage
