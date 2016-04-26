/**
 */
package catalog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalog.ReferenceCatalog#getSource <em>Source</em>}</li>
 *   <li>{@link catalog.ReferenceCatalog#getTarget <em>Target</em>}</li>
 *   <li>{@link catalog.ReferenceCatalog#getSamples <em>Samples</em>}</li>
 *   <li>{@link catalog.ReferenceCatalog#getAggregatedNumberOfDistinctSourceInstances <em>Aggregated Number Of Distinct Source Instances</em>}</li>
 *   <li>{@link catalog.ReferenceCatalog#getAggregatedNumberOfDistinctTargetInstances <em>Aggregated Number Of Distinct Target Instances</em>}</li>
 *   <li>{@link catalog.ReferenceCatalog#getAggregatedNumberOfInstances <em>Aggregated Number Of Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalog.CatalogPackage#getReferenceCatalog()
 * @model
 * @generated
 */
public interface ReferenceCatalog extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link catalog.TypeCatalog#getOutgoingReferences <em>Outgoing References</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(TypeCatalog)
   * @see catalog.CatalogPackage#getReferenceCatalog_Source()
   * @see catalog.TypeCatalog#getOutgoingReferences
   * @model opposite="outgoingReferences" required="true"
   * @generated
   */
  TypeCatalog getSource();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalog#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(TypeCatalog value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link catalog.TypeCatalog#getIncomingReferences <em>Incoming References</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(TypeCatalog)
   * @see catalog.CatalogPackage#getReferenceCatalog_Target()
   * @see catalog.TypeCatalog#getIncomingReferences
   * @model opposite="incomingReferences" required="true"
   * @generated
   */
  TypeCatalog getTarget();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalog#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(TypeCatalog value);

  /**
   * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
   * The list contents are of type {@link catalog.ReferenceCatalogSample}.
   * It is bidirectional and its opposite is '{@link catalog.ReferenceCatalogSample#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Samples</em>' containment reference list.
   * @see catalog.CatalogPackage#getReferenceCatalog_Samples()
   * @see catalog.ReferenceCatalogSample#getMeta
   * @model opposite="meta" containment="true"
   * @generated
   */
  EList<ReferenceCatalogSample> getSamples();

  /**
   * Returns the value of the '<em><b>Aggregated Number Of Distinct Source Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregated Number Of Distinct Source Instances</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregated Number Of Distinct Source Instances</em>' attribute.
   * @see #setAggregatedNumberOfDistinctSourceInstances(int)
   * @see catalog.CatalogPackage#getReferenceCatalog_AggregatedNumberOfDistinctSourceInstances()
   * @model
   * @generated
   */
  int getAggregatedNumberOfDistinctSourceInstances();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalog#getAggregatedNumberOfDistinctSourceInstances <em>Aggregated Number Of Distinct Source Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregated Number Of Distinct Source Instances</em>' attribute.
   * @see #getAggregatedNumberOfDistinctSourceInstances()
   * @generated
   */
  void setAggregatedNumberOfDistinctSourceInstances(int value);

  /**
   * Returns the value of the '<em><b>Aggregated Number Of Distinct Target Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregated Number Of Distinct Target Instances</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregated Number Of Distinct Target Instances</em>' attribute.
   * @see #setAggregatedNumberOfDistinctTargetInstances(int)
   * @see catalog.CatalogPackage#getReferenceCatalog_AggregatedNumberOfDistinctTargetInstances()
   * @model
   * @generated
   */
  int getAggregatedNumberOfDistinctTargetInstances();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalog#getAggregatedNumberOfDistinctTargetInstances <em>Aggregated Number Of Distinct Target Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregated Number Of Distinct Target Instances</em>' attribute.
   * @see #getAggregatedNumberOfDistinctTargetInstances()
   * @generated
   */
  void setAggregatedNumberOfDistinctTargetInstances(int value);

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
   * @see catalog.CatalogPackage#getReferenceCatalog_AggregatedNumberOfInstances()
   * @model
   * @generated
   */
  int getAggregatedNumberOfInstances();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalog#getAggregatedNumberOfInstances <em>Aggregated Number Of Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregated Number Of Instances</em>' attribute.
   * @see #getAggregatedNumberOfInstances()
   * @generated
   */
  void setAggregatedNumberOfInstances(int value);

} // ReferenceCatalog
