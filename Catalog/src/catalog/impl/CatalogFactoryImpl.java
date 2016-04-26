/**
 */
package catalog.impl;

import catalog.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogFactoryImpl extends EFactoryImpl implements CatalogFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CatalogFactory init()
  {
    try
    {
      CatalogFactory theCatalogFactory = (CatalogFactory)EPackage.Registry.INSTANCE.getEFactory("http://catalog/1.0"); 
      if (theCatalogFactory != null)
      {
        return theCatalogFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CatalogFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatalogFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CatalogPackage.CATALOG_MODEL: return createCatalogModel();
      case CatalogPackage.TYPE_CATALOG: return createTypeCatalog();
      case CatalogPackage.ATTRIBUTE_CATALOG: return createAttributeCatalog();
      case CatalogPackage.REFERENCE_CATALOG: return createReferenceCatalog();
      case CatalogPackage.TYPE_CATALOG_SAMPLE: return createTypeCatalogSample();
      case CatalogPackage.ATTRIBUTE_CATALOG_SAMPLE: return createAttributeCatalogSample();
      case CatalogPackage.REFERENCE_CATALOG_SAMPLE: return createReferenceCatalogSample();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatalogModel createCatalogModel()
  {
    CatalogModelImpl catalogModel = new CatalogModelImpl();
    return catalogModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeCatalog createTypeCatalog()
  {
    TypeCatalogImpl typeCatalog = new TypeCatalogImpl();
    return typeCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeCatalog createAttributeCatalog()
  {
    AttributeCatalogImpl attributeCatalog = new AttributeCatalogImpl();
    return attributeCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceCatalog createReferenceCatalog()
  {
    ReferenceCatalogImpl referenceCatalog = new ReferenceCatalogImpl();
    return referenceCatalog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeCatalogSample createTypeCatalogSample()
  {
    TypeCatalogSampleImpl typeCatalogSample = new TypeCatalogSampleImpl();
    return typeCatalogSample;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeCatalogSample createAttributeCatalogSample()
  {
    AttributeCatalogSampleImpl attributeCatalogSample = new AttributeCatalogSampleImpl();
    return attributeCatalogSample;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceCatalogSample createReferenceCatalogSample()
  {
    ReferenceCatalogSampleImpl referenceCatalogSample = new ReferenceCatalogSampleImpl();
    return referenceCatalogSample;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatalogPackage getCatalogPackage()
  {
    return (CatalogPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CatalogPackage getPackage()
  {
    return CatalogPackage.eINSTANCE;
  }

} //CatalogFactoryImpl
