/**
 */
package trnetvisual.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import trnetvisual.TrNetModel;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tr Net Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrNetModelTest extends TestCase
{

  /**
   * The fixture for this Tr Net Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrNetModel fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TrNetModelTest.class);
  }

  /**
   * Constructs a new Tr Net Model test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrNetModelTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Tr Net Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TrNetModel fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Tr Net Model test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrNetModel getFixture()
  {
    return fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createTrNetModel());
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

} //TrNetModelTest
