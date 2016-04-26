/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.ExternalConditionCall;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Condition Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalConditionCallTest extends ApplicationConditionTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ExternalConditionCallTest.class);
  }

  /**
   * Constructs a new External Condition Call test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalConditionCallTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this External Condition Call test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ExternalConditionCall getFixture()
  {
    return (ExternalConditionCall)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createExternalConditionCall());
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

} //ExternalConditionCallTest
