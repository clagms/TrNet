/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.NextDerived;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Next Derived</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NextDerivedTest extends FlowRuleTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(NextDerivedTest.class);
  }

  /**
   * Constructs a new Next Derived test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NextDerivedTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Next Derived test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected NextDerived getFixture()
  {
    return (NextDerived)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createNextDerived());
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

} //NextDerivedTest
