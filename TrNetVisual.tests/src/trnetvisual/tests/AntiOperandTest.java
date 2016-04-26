/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.AntiOperand;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Anti Operand</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AntiOperandTest extends OperandTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(AntiOperandTest.class);
  }

  /**
   * Constructs a new Anti Operand test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AntiOperandTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Anti Operand test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected AntiOperand getFixture()
  {
    return (AntiOperand)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createAntiOperand());
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

} //AntiOperandTest
