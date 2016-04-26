/**
 */
package trnetvisual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Action Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.ExternalActionCallParameter#getOwner <em>Owner</em>}</li>
 *   <li>{@link trnetvisual.ExternalActionCallParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getExternalActionCallParameter()
 * @model annotation="gmf.link source='owner' target='parameter' label='index' target.decoration='arrow' width='3' color='90,90,90' style='dash'"
 * @generated
 */
public interface ExternalActionCallParameter extends ParameterRef
{
  /**
   * Returns the value of the '<em><b>Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalActionCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' container reference.
   * @see #setOwner(ExternalActionCall)
   * @see trnetvisual.TrnetvisualPackage#getExternalActionCallParameter_Owner()
   * @see trnetvisual.ExternalActionCall#getParameters
   * @model opposite="parameters" required="true" transient="false"
   * @generated
   */
  ExternalActionCall getOwner();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalActionCallParameter#getOwner <em>Owner</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' container reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(ExternalActionCall value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Parameter#getExternalActionCallRef <em>External Action Call Ref</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference.
   * @see #setParameter(Parameter)
   * @see trnetvisual.TrnetvisualPackage#getExternalActionCallParameter_Parameter()
   * @see trnetvisual.Parameter#getExternalActionCallRef
   * @model opposite="externalActionCallRef" required="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalActionCallParameter#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

} // ExternalActionCallParameter
