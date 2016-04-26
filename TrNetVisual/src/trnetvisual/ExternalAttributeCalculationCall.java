/**
 */
package trnetvisual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Attribute Calculation Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.ExternalAttributeCalculationCall#getId <em>Id</em>}</li>
 *   <li>{@link trnetvisual.ExternalAttributeCalculationCall#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link trnetvisual.ExternalAttributeCalculationCall#getResult <em>Result</em>}</li>
 *   <li>{@link trnetvisual.ExternalAttributeCalculationCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getExternalAttributeCalculationCall()
 * @model annotation="gmf.node label='id' figure='rectangle' size='120,30' color='100,226,255'"
 * @generated
 */
public interface ExternalAttributeCalculationCall extends AttributeCalculation
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
   * @see trnetvisual.TrnetvisualPackage#getExternalAttributeCalculationCall_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalAttributeCalculationCall#getId <em>Id</em>}' attribute.
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
   * @see trnetvisual.TrnetvisualPackage#getExternalAttributeCalculationCall_QualifiedName()
   * @model required="true"
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalAttributeCalculationCall#getQualifiedName <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Name</em>' attribute.
   * @see #getQualifiedName()
   * @generated
   */
  void setQualifiedName(String value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.AttributePattern#getAttributeExternalCalculationCall <em>Attribute External Calculation Call</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' reference.
   * @see #setResult(AttributePattern)
   * @see trnetvisual.TrnetvisualPackage#getExternalAttributeCalculationCall_Result()
   * @see trnetvisual.AttributePattern#getAttributeExternalCalculationCall
   * @model opposite="attributeExternalCalculationCall" required="true"
   *        annotation="gmf.link target.decoration='arrow' width='3' color='90,90,90'"
   * @generated
   */
  AttributePattern getResult();

  /**
   * Sets the value of the '{@link trnetvisual.ExternalAttributeCalculationCall#getResult <em>Result</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' reference.
   * @see #getResult()
   * @generated
   */
  void setResult(AttributePattern value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link trnetvisual.ExternalAttributeCalculationCallParameter}.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalAttributeCalculationCallParameter#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see trnetvisual.TrnetvisualPackage#getExternalAttributeCalculationCall_Parameters()
   * @see trnetvisual.ExternalAttributeCalculationCallParameter#getOwner
   * @model opposite="owner" containment="true"
   * @generated
   */
  EList<ExternalAttributeCalculationCallParameter> getParameters();

} // ExternalAttributeCalculationCall
