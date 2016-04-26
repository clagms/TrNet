/**
 */
package trnetvisual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Calculation Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.ExternalCalculationCall#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.ExternalCalculationCall#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link trnetvisual.ExternalCalculationCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getExternalCalculationCall()
 * @model annotation="gmf.node label='id' figure='rectangle' size='120,30' color='100,226,255'"
 * @generated
 */
public interface ExternalCalculationCall extends Calculation
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see trnetvisual.TrnetvisualPackage#getExternalCalculationCall_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalCalculationCall#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Name</em>' attribute.
   * @see #setQualifiedName(String)
   * @see trnetvisual.TrnetvisualPackage#getExternalCalculationCall_QualifiedName()
   * @model
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalCalculationCall#getQualifiedName <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Name</em>' attribute.
   * @see #getQualifiedName()
   * @generated
   */
  void setQualifiedName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.ExternalCalculationCallParameter}.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalCalculationCallParameter#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getExternalCalculationCall_Parameters()
   * @see trnetvisual.ExternalCalculationCallParameter#getOwner
   * @model opposite="owner" containment="true"
   * @generated
   */
  EList<ExternalCalculationCallParameter> getParameters();

} // ExternalCalculationCall
