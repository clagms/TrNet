/**
 */
package catalog.util;

import catalog.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see catalog.CatalogPackage
 * @generated
 */
public class CatalogAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CatalogPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatalogAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CatalogPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CatalogSwitch<Adapter> modelSwitch =
    new CatalogSwitch<Adapter>()
    {
      @Override
      public Adapter caseCatalogModel(CatalogModel object)
      {
        return createCatalogModelAdapter();
      }
      @Override
      public Adapter caseTypeCatalog(TypeCatalog object)
      {
        return createTypeCatalogAdapter();
      }
      @Override
      public Adapter caseAttributeCatalog(AttributeCatalog object)
      {
        return createAttributeCatalogAdapter();
      }
      @Override
      public Adapter caseReferenceCatalog(ReferenceCatalog object)
      {
        return createReferenceCatalogAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseTypeCatalogSample(TypeCatalogSample object)
      {
        return createTypeCatalogSampleAdapter();
      }
      @Override
      public Adapter caseAttributeCatalogSample(AttributeCatalogSample object)
      {
        return createAttributeCatalogSampleAdapter();
      }
      @Override
      public Adapter caseReferenceCatalogSample(ReferenceCatalogSample object)
      {
        return createReferenceCatalogSampleAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link catalog.CatalogModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see catalog.CatalogModel
   * @generated
   */
  public Adapter createCatalogModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link catalog.TypeCatalog <em>Type Catalog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see catalog.TypeCatalog
   * @generated
   */
  public Adapter createTypeCatalogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link catalog.AttributeCatalog <em>Attribute Catalog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see catalog.AttributeCatalog
   * @generated
   */
  public Adapter createAttributeCatalogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link catalog.ReferenceCatalog <em>Reference Catalog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see catalog.ReferenceCatalog
   * @generated
   */
  public Adapter createReferenceCatalogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link catalog.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see catalog.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link catalog.TypeCatalogSample <em>Type Catalog Sample</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see catalog.TypeCatalogSample
   * @generated
   */
  public Adapter createTypeCatalogSampleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link catalog.AttributeCatalogSample <em>Attribute Catalog Sample</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see catalog.AttributeCatalogSample
   * @generated
   */
  public Adapter createAttributeCatalogSampleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link catalog.ReferenceCatalogSample <em>Reference Catalog Sample</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see catalog.ReferenceCatalogSample
   * @generated
   */
  public Adapter createReferenceCatalogSampleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CatalogAdapterFactory
