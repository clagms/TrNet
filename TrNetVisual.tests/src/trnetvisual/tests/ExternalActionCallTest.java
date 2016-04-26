/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.ExternalActionCall;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Action Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalActionCallTest extends ActionTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ExternalActionCallTest.class);
  }

  /**
   * Constructs a new External Action Call test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalActionCallTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this External Action Call test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ExternalActionCall getFixture()
  {
    return (ExternalActionCall)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createExternalActionCall());
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

} //ExternalActionCallTest
