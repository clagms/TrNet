/**
 */
package catalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see catalog.CatalogPackage
 * @generated
 */
public interface CatalogFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CatalogFactory eINSTANCE = catalog.impl.CatalogFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  CatalogModel createCatalogModel();

  /**
   * Returns a new object of class '<em>Type Catalog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Catalog</em>'.
   * @generated
   */
  TypeCatalog createTypeCatalog();

  /**
   * Returns a new object of class '<em>Attribute Catalog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Catalog</em>'.
   * @generated
   */
  AttributeCatalog createAttributeCatalog();

  /**
   * Returns a new object of class '<em>Reference Catalog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Catalog</em>'.
   * @generated
   */
  ReferenceCatalog createReferenceCatalog();

  /**
   * Returns a new object of class '<em>Type Catalog Sample</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Catalog Sample</em>'.
   * @generated
   */
  TypeCatalogSample createTypeCatalogSample();

  /**
   * Returns a new object of class '<em>Attribute Catalog Sample</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Catalog Sample</em>'.
   * @generated
   */
  AttributeCatalogSample createAttributeCatalogSample();

  /**
   * Returns a new object of class '<em>Reference Catalog Sample</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Catalog Sample</em>'.
   * @generated
   */
  ReferenceCatalogSample createReferenceCatalogSample();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CatalogPackage getCatalogPackage();

} //CatalogFactory
