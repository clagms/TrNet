/**
 */
package trnetvisual;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.Parameter#getExternalAttributeCalculationCallRef <em>External Attribute Calculation Call Ref</em>}</li>
 *   <li>{@link trnetvisual.Parameter#getExternalConditionCallRef <em>External Condition Call Ref</em>}</li>
 *   <li>{@link trnetvisual.Parameter#getExternalActionCallRef <em>External Action Call Ref</em>}</li>
 *   <li>{@link trnetvisual.Parameter#getExternalCalculationCallRef <em>External Calculation Call Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>External Attribute Calculation Call Ref</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.ExternalAttributeCalculationCallParameter}.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalAttributeCalculationCallParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Attribute Calculation Call Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Attribute Calculation Call Ref</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getParameter_ExternalAttributeCalculationCallRef()
   * @see trnetvisual.ExternalAttributeCalculationCallParameter#getParameter
   * @model opposite="parameter"
   * @generated
   */
  EList<ExternalAttributeCalculationCallParameter> getExternalAttributeCalculationCallRef();

  /**
   * Returns the value of the '<em><b>External Condition Call Ref</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.ExternalConditionCallParameter}.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalConditionCallParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Condition Call Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Condition Call Ref</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getParameter_ExternalConditionCallRef()
   * @see trnetvisual.ExternalConditionCallParameter#getParameter
   * @model opposite="parameter"
   * @generated
   */
  EList<ExternalConditionCallParameter> getExternalConditionCallRef();

  /**
   * Returns the value of the '<em><b>External Action Call Ref</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.ExternalActionCallParameter}.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalActionCallParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Action Call Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Action Call Ref</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getParameter_ExternalActionCallRef()
   * @see trnetvisual.ExternalActionCallParameter#getParameter
   * @model opposite="parameter"
   * @generated
   */
  EList<ExternalActionCallParameter> getExternalActionCallRef();

  /**
   * Returns the value of the '<em><b>External Calculation Call Ref</b></em>' reference list.
   * The list contents are of type {@link trnetvisual.ExternalCalculationCallParameter}.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalCalculationCallParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Calculation Call Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Calculation Call Ref</em>' reference list.
   * @see trnetvisual.TrnetvisualPackage#getParameter_ExternalCalculationCallRef()
   * @see trnetvisual.ExternalCalculationCallParameter#getParameter
   * @model opposite="parameter"
   * @generated
   */
  EList<ExternalCalculationCallParameter> getExternalCalculationCallRef();

} // Parameter
