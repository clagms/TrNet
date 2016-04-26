/**
 */
package catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Catalog Sample</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link catalog.ReferenceCatalogSample#getMeta <em>Meta</em>}</li>
 *   <li>{@link catalog.ReferenceCatalogSample#getNumberOfDistinctSourceInstances <em>Number Of Distinct Source Instances</em>}</li>
 *   <li>{@link catalog.ReferenceCatalogSample#getNumberOfDistinctTargetInstances <em>Number Of Distinct Target Instances</em>}</li>
 *   <li>{@link catalog.ReferenceCatalogSample#getIndex <em>Index</em>}</li>
 *   <li>{@link catalog.ReferenceCatalogSample#getNumberOfInstances <em>Number Of Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see catalog.CatalogPackage#getReferenceCatalogSample()
 * @model
 * @generated
 */
public interface ReferenceCatalogSample extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link catalog.ReferenceCatalog#getSamples <em>Samples</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' container reference.
   * @see #setMeta(ReferenceCatalog)
   * @see catalog.CatalogPackage#getReferenceCatalogSample_Meta()
   * @see catalog.ReferenceCatalog#getSamples
   * @model opposite="samples" required="true" transient="false"
   * @generated
   */
  ReferenceCatalog getMeta();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalogSample#getMeta <em>Meta</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta</em>' container reference.
   * @see #getMeta()
   * @generated
   */
  void setMeta(ReferenceCatalog value);

  /**
   * Returns the value of the '<em><b>Number Of Distinct Source Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Of Distinct Source Instances</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Of Distinct Source Instances</em>' attribute.
   * @see #setNumberOfDistinctSourceInstances(int)
   * @see catalog.CatalogPackage#getReferenceCatalogSample_NumberOfDistinctSourceInstances()
   * @model required="true"
   * @generated
   */
  int getNumberOfDistinctSourceInstances();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalogSample#getNumberOfDistinctSourceInstances <em>Number Of Distinct Source Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Of Distinct Source Instances</em>' attribute.
   * @see #getNumberOfDistinctSourceInstances()
   * @generated
   */
  void setNumberOfDistinctSourceInstances(int value);

  /**
   * Returns the value of the '<em><b>Number Of Distinct Target Instances</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number Of Distinct Target Instances</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number Of Distinct Target Instances</em>' attribute.
   * @see #setNumberOfDistinctTargetInstances(int)
   * @see catalog.CatalogPackage#getReferenceCatalogSample_NumberOfDistinctTargetInstances()
   * @model required="true"
   * @generated
   */
  int getNumberOfDistinctTargetInstances();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalogSample#getNumberOfDistinctTargetInstances <em>Number Of Distinct Target Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Of Distinct Target Instances</em>' attribute.
   * @see #getNumberOfDistinctTargetInstances()
   * @generated
   */
  void setNumberOfDistinctTargetInstances(int value);

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
   * @see catalog.CatalogPackage#getReferenceCatalogSample_Index()
   * @model required="true"
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalogSample#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

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
   * @see catalog.CatalogPackage#getReferenceCatalogSample_NumberOfInstances()
   * @model required="true"
   * @generated
   */
  int getNumberOfInstances();

  /**
   * Sets the value of the '{@link catalog.ReferenceCatalogSample#getNumberOfInstances <em>Number Of Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number Of Instances</em>' attribute.
   * @see #getNumberOfInstances()
   * @generated
   */
  void setNumberOfInstances(int value);

} // ReferenceCatalogSample
