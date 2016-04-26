/**
 */
package trnetvisual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Condition Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.ExternalConditionCallParameter#getOwner <em>Owner</em>}</li>
 *   <li>{@link trnetvisual.ExternalConditionCallParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getExternalConditionCallParameter()
 * @model annotation="gmf.link source='owner' target='parameter' label='index' target.decoration='arrow' width='3' color='90,90,90' style='dash'"
 * @generated
 */
public interface ExternalConditionCallParameter extends ParameterRef
{
  /**
   * Returns the value of the '<em><b>Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalConditionCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' container reference.
   * @see #setOwner(ExternalConditionCall)
   * @see trnetvisual.TrnetvisualPackage#getExternalConditionCallParameter_Owner()
   * @see trnetvisual.ExternalConditionCall#getParameters
   * @model opposite="parameters" required="true" transient="false"
   * @generated
   */
  ExternalConditionCall getOwner();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalConditionCallParameter#getOwner <em>Owner</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' container reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(ExternalConditionCall value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Parameter#getExternalConditionCallRef <em>External Condition Call Ref</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference.
   * @see #setParameter(Parameter)
   * @see trnetvisual.TrnetvisualPackage#getExternalConditionCallParameter_Parameter()
   * @see trnetvisual.Parameter#getExternalConditionCallRef
   * @model opposite="externalConditionCallRef" required="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalConditionCallParameter#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

} // ExternalConditionCallParameter
