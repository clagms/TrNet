/**
 */
package catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Catalog Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalog.AttributeCatalogSample#getMeta <em>Meta</em>}</li>
 *   <li>{@link catalog.AttributeCatalogSample#getIndex <em>Index</em>}</li>
 *   <li>{@link catalog.AttributeCatalogSample#getNumberOfDistinctValues <em>Number Of Distinct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalog.CatalogPackage#getAttributeCatalogSample()
 * @model
 * @generated
 */
public interface AttributeCatalogSample extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link catalog.AttributeCatalog#getSamples <em>Samples</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' container reference.
   * @see #setMeta(AttributeCatalog)
   * @see catalog.CatalogPackage#getAttributeCatalogSample_Meta()
   * @see catalog.AttributeCatalog#getSamples
   * @model opposite="samples" required="true" transient="false"
   * @generated
   */
  AttributeCatalog getMeta();

  /**
   * Sets the value of the '{@link catalog.AttributeCatalogSample#getMeta <em>Meta</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta</em>' container reference.
   * @see #getMeta()
   * @generated
   */
  void setMeta(AttributeCatalog value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see catalog.CatalogPackage#getAttributeCatalogSample_Index()
   * @model required="true"
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link catalog.AttributeCatalogSample#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

  /**
   * Returns the value of the '<em><b>Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Of Distinct Values</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Of Distinct Values</em>' attribute.
   * @see #setNumberOfDistinctValues(int)
   * @see catalog.CatalogPackage#getAttributeCatalogSample_NumberOfDistinctValues()
   * @model required="true"
   * @generated
   */
  int getNumberOfDistinctValues();

  /**
   * Sets the value of the '{@link catalog.AttributeCatalogSample#getNumberOfDistinctValues <em>Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Of Distinct Values</em>' attribute.
   * @see #getNumberOfDistinctValues()
   * @generated
   */
  void setNumberOfDistinctValues(int value);

} // AttributeCatalogSample
