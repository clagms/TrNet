/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.ExternalCalculationCall;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Calculation Call</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalCalculationCallTest extends CalculationTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ExternalCalculationCallTest.class);
  }

  /**
   * Constructs a new External Calculation Call test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalCalculationCallTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this External Calculation Call test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ExternalCalculationCall getFixture()
  {
    return (ExternalCalculationCall)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createExternalCalculationCall());
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

} //ExternalCalculationCallTest
