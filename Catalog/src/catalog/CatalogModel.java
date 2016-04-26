/**
 */
package catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalog.CatalogModel#getTypes <em>Types</em>}</li>
 *   <li>{@link catalog.CatalogModel#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalog.CatalogPackage#getCatalogModel()
 * @model
 * @generated
 */
public interface CatalogModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link catalog.TypeCatalog}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see catalog.CatalogPackage#getCatalogModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<TypeCatalog> getTypes();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link catalog.ReferenceCatalog}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see catalog.CatalogPackage#getCatalogModel_References()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceCatalog> getReferences();

} // CatalogModel
