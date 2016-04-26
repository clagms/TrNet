/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.MandatoryNode;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mandatory Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MandatoryNodeTest extends NodePatternTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MandatoryNodeTest.class);
  }

  /**
   * Constructs a new Mandatory Node test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MandatoryNodeTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Mandatory Node test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected MandatoryNode getFixture()
  {
    return (MandatoryNode)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createMandatoryNode());
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

} //MandatoryNodeTest
