/**
 */
package trnetvisual.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import trnetvisual.EdgePattern;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edge Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgePatternTest extends TestCase
{

  /**
   * The fixture for this Edge Pattern test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgePattern fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(EdgePatternTest.class);
  }

  /**
   * Constructs a new Edge Pattern test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgePatternTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Edge Pattern test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(EdgePattern fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Edge Pattern test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgePattern getFixture()
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
    setFixture(TrnetvisualFactory.eINSTANCE.createEdgePattern());
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

} //EdgePatternTest
