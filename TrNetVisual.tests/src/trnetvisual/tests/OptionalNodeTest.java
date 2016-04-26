/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.OptionalNode;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Optional Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionalNodeTest extends NodePatternTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(OptionalNodeTest.class);
  }

  /**
   * Constructs a new Optional Node test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalNodeTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Optional Node test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected OptionalNode getFixture()
  {
    return (OptionalNode)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createOptionalNode());
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

} //OptionalNodeTest
