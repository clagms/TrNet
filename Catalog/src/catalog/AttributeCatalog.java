/**
 */
package catalog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalog.AttributeCatalog#getSamples <em>Samples</em>}</li>
 *   <li>{@link catalog.AttributeCatalog#getAggregatedNumberOfDistinctValues <em>Aggregated Number Of Distinct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalog.CatalogPackage#getAttributeCatalog()
 * @model
 * @generated
 */
public interface AttributeCatalog extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Samples</b></em>' containment reference list.
   * The list contents are of type {@link catalog.AttributeCatalogSample}.
   * It is bidirectional and its opposite is '{@link catalog.AttributeCatalogSample#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Samples</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Samples</em>' containment reference list.
   * @see catalog.CatalogPackage#getAttributeCatalog_Samples()
   * @see catalog.AttributeCatalogSample#getMeta
   * @model opposite="meta" containment="true"
   * @generated
   */
  EList<AttributeCatalogSample> getSamples();

  /**
   * Returns the value of the '<em><b>Aggregated Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregated Number Of Distinct Values</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregated Number Of Distinct Values</em>' attribute.
   * @see #setAggregatedNumberOfDistinctValues(int)
   * @see catalog.CatalogPackage#getAttributeCatalog_AggregatedNumberOfDistinctValues()
   * @model
   * @generated
   */
  int getAggregatedNumberOfDistinctValues();

  /**
   * Sets the value of the '{@link catalog.AttributeCatalog#getAggregatedNumberOfDistinctValues <em>Aggregated Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregated Number Of Distinct Values</em>' attribute.
   * @see #getAggregatedNumberOfDistinctValues()
   * @generated
   */
  void setAggregatedNumberOfDistinctValues(int value);

} // AttributeCatalog
