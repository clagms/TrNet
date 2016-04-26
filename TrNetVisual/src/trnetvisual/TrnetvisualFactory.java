/**
 */
package trnetvisual;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trnetvisual.TrnetvisualPackage
 * @generated
 */
public interface TrnetvisualFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TrnetvisualFactory eINSTANCE = trnetvisual.impl.TrnetvisualFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Tr Net Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tr Net Model</em>'.
   * @generated
   */
  TrNetModel createTrNetModel();

  /**
   * Returns a new object of class '<em>Edge Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edge Pattern</em>'.
   * @generated
   */
  EdgePattern createEdgePattern();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Same</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Same</em>'.
   * @generated
   */
  Same createSame();

  /**
   * Returns a new object of class '<em>Different</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Different</em>'.
   * @generated
   */
  Different createDifferent();

  /**
   * Returns a new object of class '<em>Attribute Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Pattern</em>'.
   * @generated
   */
  AttributePattern createAttributePattern();

  /**
   * Returns a new object of class '<em>Keep</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Keep</em>'.
   * @generated
   */
  Keep createKeep();

  /**
   * Returns a new object of class '<em>Mandatory Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatory Node</em>'.
   * @generated
   */
  MandatoryNode createMandatoryNode();

  /**
   * Returns a new object of class '<em>Optional Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Node</em>'.
   * @generated
   */
  OptionalNode createOptionalNode();

  /**
   * Returns a new object of class '<em>Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combinator</em>'.
   * @generated
   */
  Combinator createCombinator();

  /**
   * Returns a new object of class '<em>External</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External</em>'.
   * @generated
   */
  External createExternal();

  /**
   * Returns a new object of class '<em>Any Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Result</em>'.
   * @generated
   */
  AnyResult createAnyResult();

  /**
   * Returns a new object of class '<em>Some Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Result</em>'.
   * @generated
   */
  SomeResult createSomeResult();

  /**
   * Returns a new object of class '<em>Any Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Operand</em>'.
   * @generated
   */
  AnyOperand createAnyOperand();

  /**
   * Returns a new object of class '<em>Some Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Operand</em>'.
   * @generated
   */
  SomeOperand createSomeOperand();

  /**
   * Returns a new object of class '<em>Anti Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anti Operand</em>'.
   * @generated
   */
  AntiOperand createAntiOperand();

  /**
   * Returns a new object of class '<em>Optional Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Operand</em>'.
   * @generated
   */
  OptionalOperand createOptionalOperand();

  /**
   * Returns a new object of class '<em>Next</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Next</em>'.
   * @generated
   */
  Next createNext();

  /**
   * Returns a new object of class '<em>Eventually</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Eventually</em>'.
   * @generated
   */
  Eventually createEventually();

  /**
   * Returns a new object of class '<em>Next Derived</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Next Derived</em>'.
   * @generated
   */
  NextDerived createNextDerived();

  /**
   * Returns a new object of class '<em>External Attribute Calculation Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Attribute Calculation Call</em>'.
   * @generated
   */
  ExternalAttributeCalculationCall createExternalAttributeCalculationCall();

  /**
   * Returns a new object of class '<em>External Condition Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Condition Call</em>'.
   * @generated
   */
  ExternalConditionCall createExternalConditionCall();

  /**
   * Returns a new object of class '<em>External Action Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Action Call</em>'.
   * @generated
   */
  ExternalActionCall createExternalActionCall();

  /**
   * Returns a new object of class '<em>External Attribute Calculation Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Attribute Calculation Call Parameter</em>'.
   * @generated
   */
  ExternalAttributeCalculationCallParameter createExternalAttributeCalculationCallParameter();

  /**
   * Returns a new object of class '<em>External Condition Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Condition Call Parameter</em>'.
   * @generated
   */
  ExternalConditionCallParameter createExternalConditionCallParameter();

  /**
   * Returns a new object of class '<em>External Action Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Action Call Parameter</em>'.
   * @generated
   */
  ExternalActionCallParameter createExternalActionCallParameter();

  /**
   * Returns a new object of class '<em>Parameter Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Ref</em>'.
   * @generated
   */
  ParameterRef createParameterRef();

  /**
   * Returns a new object of class '<em>External Calculation Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Calculation Call</em>'.
   * @generated
   */
  ExternalCalculationCall createExternalCalculationCall();

  /**
   * Returns a new object of class '<em>External Calculation Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External Calculation Call Parameter</em>'.
   * @generated
   */
  ExternalCalculationCallParameter createExternalCalculationCallParameter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TrnetvisualPackage getTrnetvisualPackage();

} //TrnetvisualFactory
