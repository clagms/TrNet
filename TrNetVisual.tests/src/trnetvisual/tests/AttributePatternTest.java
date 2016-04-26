/**
 */
package trnetvisual.tests;

import junit.textui.TestRunner;

import trnetvisual.AttributePattern;
import trnetvisual.TrnetvisualFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributePatternTest extends ParameterTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(AttributePatternTest.class);
  }

  /**
   * Constructs a new Attribute Pattern test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributePatternTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Attribute Pattern test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected AttributePattern getFixture()
  {
    return (AttributePattern)fixture;
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
    setFixture(TrnetvisualFactory.eINSTANCE.createAttributePattern());
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

} //AttributePatternTest
