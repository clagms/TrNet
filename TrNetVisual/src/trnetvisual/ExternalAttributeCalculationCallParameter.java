/**
 */
package trnetvisual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Attribute Calculation Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.ExternalAttributeCalculationCallParameter#getOwner <em>Owner</em>}</li>
 *   <li>{@link trnetvisual.ExternalAttributeCalculationCallParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getExternalAttributeCalculationCallParameter()
 * @model annotation="gmf.link source='owner' target='parameter' label='index' target.decoration='arrow' width='3' color='90,90,90' style='dash'"
 * @generated
 */
public interface ExternalAttributeCalculationCallParameter extends ParameterRef
{
  /**
   * Returns the value of the '<em><b>Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalAttributeCalculationCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' container reference.
   * @see #setOwner(ExternalAttributeCalculationCall)
   * @see trnetvisual.TrnetvisualPackage#getExternalAttributeCalculationCallParameter_Owner()
   * @see trnetvisual.ExternalAttributeCalculationCall#getParameters
   * @model opposite="parameters" required="true" transient="false"
   * @generated
   */
  ExternalAttributeCalculationCall getOwner();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalAttributeCalculationCallParameter#getOwner <em>Owner</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' container reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(ExternalAttributeCalculationCall value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.Parameter#getExternalAttributeCalculationCallRef <em>External Attribute Calculation Call Ref</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference.
   * @see #setParameter(Parameter)
   * @see trnetvisual.TrnetvisualPackage#getExternalAttributeCalculationCallParameter_Parameter()
   * @see trnetvisual.Parameter#getExternalAttributeCalculationCallRef
   * @model opposite="externalAttributeCalculationCallRef" required="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalAttributeCalculationCallParameter#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

} // ExternalAttributeCalculationCallParameter
