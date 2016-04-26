/**
 */
package catalog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalog.TypeCatalog#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link catalog.TypeCatalog#getOutgoingReferences <em>Outgoing References</em>}</li>
 *   <li>{@link catalog.TypeCatalog#getIncomingReferences <em>Incoming References</em>}</li>
 *   <li>{@link catalog.TypeCatalog#getSuper <em>Super</em>}</li>
 *   <li>{@link catalog.TypeCatalog#getSamples <em>Samples</em>}</li>
 *   <li>{@link catalog.TypeCatalog#getAggregatedNumberOfInstances <em>Aggregated Number Of Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalog.CatalogPackage#getTypeCatalog()
 * @model
 * @generated
 */
public interface TypeCatalog extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link catalog.AttributeCatalog}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see catalog.CatalogPackage#getTypeCatalog_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AttributeCatalog> getAttributes();

  /**
   * Returns the value of the '<em><b>Outgoing References</b></em>' reference list.
   * The list contents are of type {@link catalog.ReferenceCatalog}.
   * It is bidirectional and its opposite is '{@link catalog.ReferenceCatalog#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing References</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing References</em>' reference list.
   * @see catalog.CatalogPackage#getTypeCatalog_OutgoingReferences()
   * @see catalog.ReferenceCatalog#getSource
   * @model opposite="source"
   * @generated
   */
  EList<ReferenceCatalog> getOutgoingReferences();

  /**
   * Returns the value of the '<em><b>Incoming References</b></em>' reference list.
   * The list contents are of type {@link catalog.ReferenceCatalog}.
   * It is bidirectional and its opposite is '{@link catalog.ReferenceCatalog#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming References</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming References</em>' reference list.
   * @see catalog.CatalogPackage#getTypeCatalog_IncomingReferences()
   * @see catalog.ReferenceCatalog#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<ReferenceCatalog> getIncomingReferences();

  /**
   * Returns the value of the '<em><b>Super</b></em>' reference list.
   * The list contents are of type {@link catalog.TypeCatalog}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super</em>' reference list.
   * @see catalog.CatalogPackage#getTypeCatalog_Super()
   * @model
   * @generated
   */
  EList<TypeCatalog> getSuper();

  /**
   * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
   * The list contents are of type {@link catalog.TypeCatalogSample}.
   * It is bidirectional and its opposite is '{@link catalog.TypeCatalogSample#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Samples</em>' containment reference list.
   * @see catalog.CatalogPackage#getTypeCatalog_Samples()
   * @see catalog.TypeCatalogSample#getMeta
   * @model opposite="meta" containment="true"
   * @generated
   */
  EList<TypeCatalogSample> getSamples();

  /**
   * Returns the value of the '<em><b>Aggregated Number Of Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregated Number Of Instances</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregated Number Of Instances</em>' attribute.
   * @see #setAggregatedNumberOfInstances(int)
   * @see catalog.CatalogPackage#getTypeCatalog_AggregatedNumberOfInstances()
   * @model
   * @generated
   */
  int getAggregatedNumberOfInstances();

  /**
   * Sets the value of the '{@link catalog.TypeCatalog#getAggregatedNumberOfInstances <em>Aggregated Number Of Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregated Number Of Instances</em>' attribute.
   * @see #getAggregatedNumberOfInstances()
   * @generated
   */
  void setAggregatedNumberOfInstances(int value);

} // TypeCatalog
