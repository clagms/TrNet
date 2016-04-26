/**
 */
package trnetvisual.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trnetvisual.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrnetvisualFactoryImpl extends EFactoryImpl implements TrnetvisualFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TrnetvisualFactory init()
  {
    try
    {
      TrnetvisualFactory theTrnetvisualFactory = (TrnetvisualFactory)EPackage.Registry.INSTANCE.getEFactory("http://trnetvisual/1.0"); 
      if (theTrnetvisualFactory != null)
      {
        return theTrnetvisualFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TrnetvisualFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrnetvisualFactoryImpl()
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
      case TrnetvisualPackage.TR_NET_MODEL: return createTrNetModel();
      case TrnetvisualPackage.EDGE_PATTERN: return createEdgePattern();
      case TrnetvisualPackage.PATTERN: return createPattern();
      case TrnetvisualPackage.SAME: return createSame();
      case TrnetvisualPackage.DIFFERENT: return createDifferent();
      case TrnetvisualPackage.ATTRIBUTE_PATTERN: return createAttributePattern();
      case TrnetvisualPackage.KEEP: return createKeep();
      case TrnetvisualPackage.MANDATORY_NODE: return createMandatoryNode();
      case TrnetvisualPackage.OPTIONAL_NODE: return createOptionalNode();
      case TrnetvisualPackage.COMBINATOR: return createCombinator();
      case TrnetvisualPackage.EXTERNAL: return createExternal();
      case TrnetvisualPackage.ANY_RESULT: return createAnyResult();
      case TrnetvisualPackage.SOME_RESULT: return createSomeResult();
      case TrnetvisualPackage.ANY_OPERAND: return createAnyOperand();
      case TrnetvisualPackage.SOME_OPERAND: return createSomeOperand();
      case TrnetvisualPackage.ANTI_OPERAND: return createAntiOperand();
      case TrnetvisualPackage.OPTIONAL_OPERAND: return createOptionalOperand();
      case TrnetvisualPackage.NEXT: return createNext();
      case TrnetvisualPackage.EVENTUALLY: return createEventually();
      case TrnetvisualPackage.NEXT_DERIVED: return createNextDerived();
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL: return createExternalAttributeCalculationCall();
      case TrnetvisualPackage.EXTERNAL_CONDITION_CALL: return createExternalConditionCall();
      case TrnetvisualPackage.EXTERNAL_ACTION_CALL: return createExternalActionCall();
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER: return createExternalAttributeCalculationCallParameter();
      case TrnetvisualPackage.EXTERNAL_CONDITION_CALL_PARAMETER: return createExternalConditionCallParameter();
      case TrnetvisualPackage.EXTERNAL_ACTION_CALL_PARAMETER: return createExternalActionCallParameter();
      case TrnetvisualPackage.PARAMETER_REF: return createParameterRef();
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL: return createExternalCalculationCall();
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER: return createExternalCalculationCallParameter();
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
  public Next createNext()
  {
    NextImpl next = new NextImpl();
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Eventually createEventually()
  {
    EventuallyImpl eventually = new EventuallyImpl();
    return eventually;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NextDerived createNextDerived()
  {
    NextDerivedImpl nextDerived = new NextDerivedImpl();
    return nextDerived;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalAttributeCalculationCall createExternalAttributeCalculationCall()
  {
    ExternalAttributeCalculationCallImpl externalAttributeCalculationCall = new ExternalAttributeCalculationCallImpl();
    return externalAttributeCalculationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalConditionCall createExternalConditionCall()
  {
    ExternalConditionCallImpl externalConditionCall = new ExternalConditionCallImpl();
    return externalConditionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalActionCall createExternalActionCall()
  {
    ExternalActionCallImpl externalActionCall = new ExternalActionCallImpl();
    return externalActionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalAttributeCalculationCallParameter createExternalAttributeCalculationCallParameter()
  {
    ExternalAttributeCalculationCallParameterImpl externalAttributeCalculationCallParameter = new ExternalAttributeCalculationCallParameterImpl();
    return externalAttributeCalculationCallParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalConditionCallParameter createExternalConditionCallParameter()
  {
    ExternalConditionCallParameterImpl externalConditionCallParameter = new ExternalConditionCallParameterImpl();
    return externalConditionCallParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalActionCallParameter createExternalActionCallParameter()
  {
    ExternalActionCallParameterImpl externalActionCallParameter = new ExternalActionCallParameterImpl();
    return externalActionCallParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterRef createParameterRef()
  {
    ParameterRefImpl parameterRef = new ParameterRefImpl();
    return parameterRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalCalculationCall createExternalCalculationCall()
  {
    ExternalCalculationCallImpl externalCalculationCall = new ExternalCalculationCallImpl();
    return externalCalculationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalCalculationCallParameter createExternalCalculationCallParameter()
  {
    ExternalCalculationCallParameterImpl externalCalculationCallParameter = new ExternalCalculationCallParameterImpl();
    return externalCalculationCallParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrnetvisualPackage getTrnetvisualPackage()
  {
    return (TrnetvisualPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TrnetvisualPackage getPackage()
  {
    return TrnetvisualPackage.eINSTANCE;
  }

} //TrnetvisualFactoryImpl
