/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.ExternalActionCallParameter;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Action Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalActionCallParameterTest extends ParameterRefTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ExternalActionCallParameterTest.class);
  }

  /**
   * Constructs a new External Action Call Parameter test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalActionCallParameterTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this External Action Call Parameter test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ExternalActionCallParameter getFixture()
  {
    return (ExternalActionCallParameter)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createExternalActionCallParameter());
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

} //ExternalActionCallParameterTest
