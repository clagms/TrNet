/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.OptionalOperand;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Optional Operand</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionalOperandTest extends OperandTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(OptionalOperandTest.class);
  }

  /**
   * Constructs a new Optional Operand test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalOperandTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Optional Operand test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected OptionalOperand getFixture()
  {
    return (OptionalOperand)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(TrnetvisualFactory.eINSTANCE.createOptionalOperand());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //OptionalOperandTest
