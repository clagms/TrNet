/**
 */
package trnet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trnet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrnetFactoryImpl extends EFactoryImpl implements TrnetFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TrnetFactory init()
  {
    try
    {
      TrnetFactory theTrnetFactory = (TrnetFactory)EPackage.Registry.INSTANCE.getEFactory("http://trnet/1.0"); 
      if (theTrnetFactory != null)
      {
        return theTrnetFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TrnetFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrnetFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TrnetPackage.TR_NET_MODEL: return createTrNetModel();
      case TrnetPackage.EDGE_PATTERN: return createEdgePattern();
      case TrnetPackage.PATTERN: return createPattern();
      case TrnetPackage.COMBINATOR: return createCombinator();
      case TrnetPackage.SAME: return createSame();
      case TrnetPackage.ATTRIBUTE_PATTERN: return createAttributePattern();
      case TrnetPackage.STRING_LITERAL: return createStringLiteral();
      case TrnetPackage.KEEP: return createKeep();
      case TrnetPackage.SOME_OPERAND: return createSomeOperand();
      case TrnetPackage.ANTI_OPERAND: return createAntiOperand();
      case TrnetPackage.ANY_OPERAND: return createAnyOperand();
      case TrnetPackage.SOME_RESULT: return createSomeResult();
      case TrnetPackage.ANY_RESULT: return createAnyResult();
      case TrnetPackage.DIFFERENT: return createDifferent();
      case TrnetPackage.EXTERNAL: return createExternal();
      case TrnetPackage.UNION: return createUnion();
      case TrnetPackage.MANDATORY_NODE: return createMandatoryNode();
      case TrnetPackage.OPTIONAL_NODE: return createOptionalNode();
      case TrnetPackage.EQUALITY: return createEquality();
      case TrnetPackage.OPTIONAL_OPERAND: return createOptionalOperand();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrNetModel createTrNetModel()
  {
    TrNetModelImpl trNetModel = new TrNetModelImpl();
    return trNetModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EdgePattern createEdgePattern()
  {
    EdgePatternImpl edgePattern = new EdgePatternImpl();
    return edgePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Combinator createCombinator()
  {
    CombinatorImpl combinator = new CombinatorImpl();
    return combinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Same createSame()
  {
    SameImpl same = new SameImpl();
    return same;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributePattern createAttributePattern()
  {
    AttributePatternImpl attributePattern = new AttributePatternImpl();
    return attributePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Keep createKeep()
  {
    KeepImpl keep = new KeepImpl();
    return keep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeOperand createSomeOperand()
  {
    SomeOperandImpl someOperand = new SomeOperandImpl();
    return someOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AntiOperand createAntiOperand()
  {
    AntiOperandImpl antiOperand = new AntiOperandImpl();
    return antiOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyOperand createAnyOperand()
  {
    AnyOperandImpl anyOperand = new AnyOperandImpl();
    return anyOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeResult createSomeResult()
  {
    SomeResultImpl someResult = new SomeResultImpl();
    return someResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyResult createAnyResult()
  {
    AnyResultImpl anyResult = new AnyResultImpl();
    return anyResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Different createDifferent()
  {
    DifferentImpl different = new DifferentImpl();
    return different;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public External createExternal()
  {
    ExternalImpl external = new ExternalImpl();
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Union createUnion()
  {
    UnionImpl union = new UnionImpl();
    return union;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MandatoryNode createMandatoryNode()
  {
    MandatoryNodeImpl mandatoryNode = new MandatoryNodeImpl();
    return mandatoryNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalNode createOptionalNode()
  {
    OptionalNodeImpl optionalNode = new OptionalNodeImpl();
    return optionalNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalOperand createOptionalOperand()
  {
    OptionalOperandImpl optionalOperand = new OptionalOperandImpl();
    return optionalOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrnetPackage getTrnetPackage()
  {
    return (TrnetPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TrnetPackage getPackage()
  {
    return TrnetPackage.eINSTANCE;
  }

} //TrnetFactoryImpl
