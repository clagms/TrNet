/**
 */
package catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Catalog Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalog.TypeCatalogSample#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link catalog.TypeCatalogSample#getMeta <em>Meta</em>}</li>
 *   <li>{@link catalog.TypeCatalogSample#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalog.CatalogPackage#getTypeCatalogSample()
 * @model
 * @generated
 */
public interface TypeCatalogSample extends EObject
{
  /**
   * Returns the value of the '<em><b>Number Of Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Of Instances</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Of Instances</em>' attribute.
   * @see #setNumberOfInstances(int)
   * @see catalog.CatalogPackage#getTypeCatalogSample_NumberOfInstances()
   * @model required="true"
   * @generated
   */
  int getNumberOfInstances();

  /**
   * Sets the value of the '{@link catalog.TypeCatalogSample#getNumberOfInstances <em>Number Of Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Of Instances</em>' attribute.
   * @see #getNumberOfInstances()
   * @generated
   */
  void setNumberOfInstances(int value);

  /**
   * Returns the value of the '<em><b>Meta</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link catalog.TypeCatalog#getSamples <em>Samples</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' container reference.
   * @see #setMeta(TypeCatalog)
   * @see catalog.CatalogPackage#getTypeCatalogSample_Meta()
   * @see catalog.TypeCatalog#getSamples
   * @model opposite="samples" required="true" transient="false"
   * @generated
   */
  TypeCatalog getMeta();

  /**
   * Sets the value of the '{@link catalog.TypeCatalogSample#getMeta <em>Meta</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta</em>' container reference.
   * @see #getMeta()
   * @generated
   */
  void setMeta(TypeCatalog value);

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
   * @see catalog.CatalogPackage#getTypeCatalogSample_Index()
   * @model required="true"
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link catalog.TypeCatalogSample#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

} // TypeCatalogSample
