/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.Different;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Different</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DifferentTest extends RestrictionTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DifferentTest.class);
  }

  /**
   * Constructs a new Different test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DifferentTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Different test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Different getFixture()
  {
    return (Different)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createDifferent());
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

} //DifferentTest
