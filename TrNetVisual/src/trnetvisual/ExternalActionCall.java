/**
 */
package trnetvisual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Action Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.ExternalActionCall#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.ExternalActionCall#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link trnetvisual.ExternalActionCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getExternalActionCall()
 * @model annotation="gmf.node label='id' figure='rectangle' size='120,30' color='176,255,161'"
 * @generated
 */
public interface ExternalActionCall extends Action
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
   * @see trnetvisual.TrnetvisualPackage#getExternalActionCall_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalActionCall#getId <em>Id</em>}' attribute.
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
   * @see trnetvisual.TrnetvisualPackage#getExternalActionCall_QualifiedName()
   * @model required="true"
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalActionCall#getQualifiedName <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Name</em>' attribute.
   * @see #getQualifiedName()
   * @generated
   */
  void setQualifiedName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.ExternalActionCallParameter}.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalActionCallParameter#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getExternalActionCall_Parameters()
   * @see trnetvisual.ExternalActionCallParameter#getOwner
   * @model opposite="owner" containment="true"
   * @generated
   */
  EList<ExternalActionCallParameter> getParameters();

} // ExternalActionCall
