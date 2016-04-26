/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.SomeOperand;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Some Operand</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SomeOperandTest extends OperandTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SomeOperandTest.class);
  }

  /**
   * Constructs a new Some Operand test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeOperandTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Some Operand test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected SomeOperand getFixture()
  {
    return (SomeOperand)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createSomeOperand());
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

} //SomeOperandTest
