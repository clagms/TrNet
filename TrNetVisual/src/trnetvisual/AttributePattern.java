/**
 */
package trnetvisual;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnetvisual.AttributePattern#getName <em>Name</em>}</li>
 *   <li>{@link trnetvisual.AttributePattern#getAttributeExternalCalculationCall <em>Attribute External Calculation Call</em>}</li>
 *   <li>{@link trnetvisual.AttributePattern#getOwnerNode <em>Owner Node</em>}</li>
 *   <li>{@link trnetvisual.AttributePattern#getExpectedNumberOfDistinctValues <em>Expected Number Of Distinct Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnetvisual.TrnetvisualPackage#getAttributePattern()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface AttributePattern extends Parameter
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see trnetvisual.TrnetvisualPackage#getAttributePattern_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link trnetvisual.AttributePattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attribute External Calculation Call</b></em>' reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.ExternalAttributeCalculationCall#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute External Calculation Call</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute External Calculation Call</em>' reference.
   * @see #setAttributeExternalCalculationCall(ExternalAttributeCalculationCall)
   * @see trnetvisual.TrnetvisualPackage#getAttributePattern_AttributeExternalCalculationCall()
   * @see trnetvisual.ExternalAttributeCalculationCall#getResult
   * @model opposite="result"
   * @generated
   */
  ExternalAttributeCalculationCall getAttributeExternalCalculationCall();

  /**
   * Sets the value of the '{@link trnetvisual.AttributePattern#getAttributeExternalCalculationCall <em>Attribute External Calculation Call</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute External Calculation Call</em>' reference.
   * @see #getAttributeExternalCalculationCall()
   * @generated
   */
  void setAttributeExternalCalculationCall(ExternalAttributeCalculationCall value);

  /**
   * Returns the value of the '<em><b>Owner Node</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link trnetvisual.NodePattern#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner Node</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner Node</em>' container reference.
   * @see #setOwnerNode(NodePattern)
   * @see trnetvisual.TrnetvisualPackage#getAttributePattern_OwnerNode()
   * @see trnetvisual.NodePattern#getAttributes
   * @model opposite="attributes" required="true" transient="false"
   * @generated
   */
  NodePattern getOwnerNode();

  /**
   * Sets the value of the '{@link trnetvisual.AttributePattern#getOwnerNode <em>Owner Node</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner Node</em>' container reference.
   * @see #getOwnerNode()
   * @generated
   */
  void setOwnerNode(NodePattern value);

  /**
   * Returns the value of the '<em><b>Expected Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expected Number Of Distinct Values</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expected Number Of Distinct Values</em>' attribute.
   * @see #setExpectedNumberOfDistinctValues(double)
   * @see trnetvisual.TrnetvisualPackage#getAttributePattern_ExpectedNumberOfDistinctValues()
   * @model
   * @generated
   */
  double getExpectedNumberOfDistinctValues();

  /**
   * Sets the value of the '{@link trnetvisual.AttributePattern#getExpectedNumberOfDistinctValues <em>Expected Number Of Distinct Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expected Number Of Distinct Values</em>' attribute.
   * @see #getExpectedNumberOfDistinctValues()
   * @generated
   */
  void setExpectedNumberOfDistinctValues(double value);

} // AttributePattern
