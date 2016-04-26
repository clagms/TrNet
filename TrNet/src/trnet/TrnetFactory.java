/**
 */
package trnet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trnet.TrnetPackage
 * @generated
 */
public interface TrnetFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TrnetFactory eINSTANCE = trnet.impl.TrnetFactoryImpl.init();

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
   * Returns a new object of class '<em>Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combinator</em>'.
   * @generated
   */
  Combinator createCombinator();

  /**
   * Returns a new object of class '<em>Same</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Same</em>'.
   * @generated
   */
  Same createSame();

  /**
   * Returns a new object of class '<em>Attribute Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Pattern</em>'.
   * @generated
   */
  AttributePattern createAttributePattern();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Keep</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Keep</em>'.
   * @generated
   */
  Keep createKeep();

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
   * Returns a new object of class '<em>Any Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Operand</em>'.
   * @generated
   */
  AnyOperand createAnyOperand();

  /**
   * Returns a new object of class '<em>Some Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Some Result</em>'.
   * @generated
   */
  SomeResult createSomeResult();

  /**
   * Returns a new object of class '<em>Any Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Result</em>'.
   * @generated
   */
  AnyResult createAnyResult();

  /**
   * Returns a new object of class '<em>Different</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Different</em>'.
   * @generated
   */
  Different createDifferent();

  /**
   * Returns a new object of class '<em>External</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>External</em>'.
   * @generated
   */
  External createExternal();

  /**
   * Returns a new object of class '<em>Union</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Union</em>'.
   * @generated
   */
  Union createUnion();

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
   * Returns a new object of class '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality</em>'.
   * @generated
   */
  Equality createEquality();

  /**
   * Returns a new object of class '<em>Optional Operand</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Operand</em>'.
   * @generated
   */
  OptionalOperand createOptionalOperand();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TrnetPackage getTrnetPackage();

} //TrnetFactory
