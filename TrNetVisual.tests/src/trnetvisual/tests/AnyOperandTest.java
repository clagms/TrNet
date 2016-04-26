/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.AnyOperand;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Any Operand</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnyOperandTest extends OperandTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(AnyOperandTest.class);
  }

  /**
   * Constructs a new Any Operand test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyOperandTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Any Operand test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected AnyOperand getFixture()
  {
    return (AnyOperand)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createAnyOperand());
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

} //AnyOperandTest
