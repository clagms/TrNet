/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.Next;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Next</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NextTest extends FlowRuleTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(NextTest.class);
  }

  /**
   * Constructs a new Next test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NextTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Next test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Next getFixture()
  {
    return (Next)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createNext());
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

} //NextTest
