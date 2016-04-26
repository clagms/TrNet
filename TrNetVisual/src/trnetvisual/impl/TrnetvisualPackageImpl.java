/**
 */
package trnetvisual.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import trnetvisual.Action;
import trnetvisual.AntiOperand;
import trnetvisual.AnyOperand;
import trnetvisual.AnyResult;
import trnetvisual.ApplicationCondition;
import trnetvisual.AttributeCalculation;
import trnetvisual.AttributePattern;
import trnetvisual.Calculation;
import trnetvisual.Combinator;
import trnetvisual.Different;
import trnetvisual.EdgePattern;
import trnetvisual.Eventually;
import trnetvisual.External;
import trnetvisual.ExternalActionCall;
import trnetvisual.ExternalActionCallParameter;
import trnetvisual.ExternalAttributeCalculationCall;
import trnetvisual.ExternalAttributeCalculationCallParameter;
import trnetvisual.ExternalCalculationCall;
import trnetvisual.ExternalCalculationCallParameter;
import trnetvisual.ExternalConditionCall;
import trnetvisual.ExternalConditionCallParameter;
import trnetvisual.FlowRule;
import trnetvisual.Keep;
import trnetvisual.MandatoryNode;
import trnetvisual.Next;
import trnetvisual.NextDerived;
import trnetvisual.NodePattern;
import trnetvisual.Operand;
import trnetvisual.Operator;
import trnetvisual.OptionalNode;
import trnetvisual.OptionalOperand;
import trnetvisual.Parameter;
import trnetvisual.ParameterRef;
import trnetvisual.Pattern;
import trnetvisual.Restriction;
import trnetvisual.Result;
import trnetvisual.Same;
import trnetvisual.SomeOperand;
import trnetvisual.SomeResult;
import trnetvisual.TrNetModel;
import trnetvisual.TrnetvisualFactory;
import trnetvisual.TrnetvisualPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrnetvisualPackageImpl extends EPackageImpl implements TrnetvisualPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trNetModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass differentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass combinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass someResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass someOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass antiOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalOperandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventuallyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nextDerivedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeCalculationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalAttributeCalculationCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalConditionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalActionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalAttributeCalculationCallParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalConditionCallParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalActionCallParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass calculationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalCalculationCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalCalculationCallParameterEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see trnetvisual.TrnetvisualPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TrnetvisualPackageImpl()
  {
    super(eNS_URI, TrnetvisualFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TrnetvisualPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TrnetvisualPackage init()
  {
    if (isInited) return (TrnetvisualPackage)EPackage.Registry.INSTANCE.getEPackage(TrnetvisualPackage.eNS_URI);

    // Obtain or create and register package
    TrnetvisualPackageImpl theTrnetvisualPackage = (TrnetvisualPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TrnetvisualPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TrnetvisualPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTrnetvisualPackage.createPackageContents();

    // Initialize created meta-data
    theTrnetvisualPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTrnetvisualPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TrnetvisualPackage.eNS_URI, theTrnetvisualPackage);
    return theTrnetvisualPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTrNetModel()
  {
    return trNetModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrNetModel_Patterns()
  {
    return (EReference)trNetModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrNetModel_Operators()
  {
    return (EReference)trNetModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTrNetModel_Id()
  {
    return (EAttribute)trNetModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrNetModel_Restrictions()
  {
    return (EReference)trNetModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrNetModel_Operands()
  {
    return (EReference)trNetModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrNetModel_Results()
  {
    return (EReference)trNetModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrNetModel_FlowRules()
  {
    return (EReference)trNetModelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTrNetModel_Calculations()
  {
    return (EReference)trNetModelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodePattern()
  {
    return nodePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_Incoming()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_Outgoing()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_SameOut()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_SameIn()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_Pattern()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_Attributes()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodePattern_Name()
  {
    return (EAttribute)nodePatternEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_KeepIn()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_KeepOut()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_DifferentIn()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodePattern_DifferentOut()
  {
    return (EReference)nodePatternEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodePattern_Id()
  {
    return (EAttribute)nodePatternEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodePattern_ExpectedNumberOfDistinctValues()
  {
    return (EAttribute)nodePatternEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdgePattern()
  {
    return edgePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgePattern_Source()
  {
    return (EReference)edgePatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgePattern_Target()
  {
    return (EReference)edgePatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgePattern_Pattern()
  {
    return (EReference)edgePatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEdgePattern_Name()
  {
    return (EAttribute)edgePatternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPattern()
  {
    return patternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_Nodes()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_Edges()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_IncomingResults()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_OutgoingOperands()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPattern_Id()
  {
    return (EAttribute)patternEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPattern_Expected_size()
  {
    return (EAttribute)patternEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSame()
  {
    return sameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSame_Source()
  {
    return (EReference)sameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSame_Target()
  {
    return (EReference)sameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDifferent()
  {
    return differentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDifferent_Source()
  {
    return (EReference)differentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDifferent_Target()
  {
    return (EReference)differentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributePattern()
  {
    return attributePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributePattern_Name()
  {
    return (EAttribute)attributePatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributePattern_AttributeExternalCalculationCall()
  {
    return (EReference)attributePatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributePattern_OwnerNode()
  {
    return (EReference)attributePatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributePattern_ExpectedNumberOfDistinctValues()
  {
    return (EAttribute)attributePatternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeep()
  {
    return keepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeep_Source()
  {
    return (EReference)keepEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeep_Target()
  {
    return (EReference)keepEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestriction()
  {
    return restrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMandatoryNode()
  {
    return mandatoryNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalNode()
  {
    return optionalNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCombinator()
  {
    return combinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternal()
  {
    return externalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_Operands()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_Results()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperator_Id()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_FlowOut()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_FlowIn()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_Conditions()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_Actions()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResult()
  {
    return resultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResult_Pattern()
  {
    return (EReference)resultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResult_Operator()
  {
    return (EReference)resultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyResult()
  {
    return anyResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSomeResult()
  {
    return someResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSomeResult_Count()
  {
    return (EAttribute)someResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperand()
  {
    return operandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperand_Operator()
  {
    return (EReference)operandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperand_Pattern()
  {
    return (EReference)operandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperand_Index()
  {
    return (EAttribute)operandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyOperand()
  {
    return anyOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSomeOperand()
  {
    return someOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSomeOperand_Count()
  {
    return (EAttribute)someOperandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAntiOperand()
  {
    return antiOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalOperand()
  {
    return optionalOperandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowRule()
  {
    return flowRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowRule_Source()
  {
    return (EReference)flowRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowRule_Target()
  {
    return (EReference)flowRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNext()
  {
    return nextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventually()
  {
    return eventuallyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNextDerived()
  {
    return nextDerivedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeCalculation()
  {
    return attributeCalculationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalAttributeCalculationCall()
  {
    return externalAttributeCalculationCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalAttributeCalculationCall_Id()
  {
    return (EAttribute)externalAttributeCalculationCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalAttributeCalculationCall_QualifiedName()
  {
    return (EAttribute)externalAttributeCalculationCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalAttributeCalculationCall_Result()
  {
    return (EReference)externalAttributeCalculationCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalAttributeCalculationCall_Parameters()
  {
    return (EReference)externalAttributeCalculationCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_ExternalAttributeCalculationCallRef()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_ExternalConditionCallRef()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_ExternalActionCallRef()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_ExternalCalculationCallRef()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationCondition()
  {
    return applicationConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalConditionCall()
  {
    return externalConditionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalConditionCall_Id()
  {
    return (EAttribute)externalConditionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalConditionCall_QualifiedName()
  {
    return (EAttribute)externalConditionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalConditionCall_Parameters()
  {
    return (EReference)externalConditionCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalActionCall()
  {
    return externalActionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalActionCall_Id()
  {
    return (EAttribute)externalActionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalActionCall_QualifiedName()
  {
    return (EAttribute)externalActionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalActionCall_Parameters()
  {
    return (EReference)externalActionCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalAttributeCalculationCallParameter()
  {
    return externalAttributeCalculationCallParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalAttributeCalculationCallParameter_Owner()
  {
    return (EReference)externalAttributeCalculationCallParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalAttributeCalculationCallParameter_Parameter()
  {
    return (EReference)externalAttributeCalculationCallParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalConditionCallParameter()
  {
    return externalConditionCallParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalConditionCallParameter_Owner()
  {
    return (EReference)externalConditionCallParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalConditionCallParameter_Parameter()
  {
    return (EReference)externalConditionCallParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalActionCallParameter()
  {
    return externalActionCallParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalActionCallParameter_Owner()
  {
    return (EReference)externalActionCallParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalActionCallParameter_Parameter()
  {
    return (EReference)externalActionCallParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterRef()
  {
    return parameterRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterRef_Index()
  {
    return (EAttribute)parameterRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCalculation()
  {
    return calculationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalCalculationCall()
  {
    return externalCalculationCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalCalculationCall_Id()
  {
    return (EAttribute)externalCalculationCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalCalculationCall_QualifiedName()
  {
    return (EAttribute)externalCalculationCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalCalculationCall_Parameters()
  {
    return (EReference)externalCalculationCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalCalculationCallParameter()
  {
    return externalCalculationCallParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalCalculationCallParameter_Owner()
  {
    return (EReference)externalCalculationCallParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalCalculationCallParameter_Parameter()
  {
    return (EReference)externalCalculationCallParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrnetvisualFactory getTrnetvisualFactory()
  {
    return (TrnetvisualFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    trNetModelEClass = createEClass(TR_NET_MODEL);
    createEReference(trNetModelEClass, TR_NET_MODEL__PATTERNS);
    createEReference(trNetModelEClass, TR_NET_MODEL__OPERATORS);
    createEAttribute(trNetModelEClass, TR_NET_MODEL__ID);
    createEReference(trNetModelEClass, TR_NET_MODEL__RESTRICTIONS);
    createEReference(trNetModelEClass, TR_NET_MODEL__OPERANDS);
    createEReference(trNetModelEClass, TR_NET_MODEL__RESULTS);
    createEReference(trNetModelEClass, TR_NET_MODEL__FLOW_RULES);
    createEReference(trNetModelEClass, TR_NET_MODEL__CALCULATIONS);

    nodePatternEClass = createEClass(NODE_PATTERN);
    createEReference(nodePatternEClass, NODE_PATTERN__INCOMING);
    createEReference(nodePatternEClass, NODE_PATTERN__OUTGOING);
    createEReference(nodePatternEClass, NODE_PATTERN__SAME_OUT);
    createEReference(nodePatternEClass, NODE_PATTERN__SAME_IN);
    createEReference(nodePatternEClass, NODE_PATTERN__PATTERN);
    createEReference(nodePatternEClass, NODE_PATTERN__ATTRIBUTES);
    createEAttribute(nodePatternEClass, NODE_PATTERN__NAME);
    createEReference(nodePatternEClass, NODE_PATTERN__KEEP_IN);
    createEReference(nodePatternEClass, NODE_PATTERN__KEEP_OUT);
    createEReference(nodePatternEClass, NODE_PATTERN__DIFFERENT_IN);
    createEReference(nodePatternEClass, NODE_PATTERN__DIFFERENT_OUT);
    createEAttribute(nodePatternEClass, NODE_PATTERN__ID);
    createEAttribute(nodePatternEClass, NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES);

    edgePatternEClass = createEClass(EDGE_PATTERN);
    createEReference(edgePatternEClass, EDGE_PATTERN__SOURCE);
    createEReference(edgePatternEClass, EDGE_PATTERN__TARGET);
    createEReference(edgePatternEClass, EDGE_PATTERN__PATTERN);
    createEAttribute(edgePatternEClass, EDGE_PATTERN__NAME);

    patternEClass = createEClass(PATTERN);
    createEReference(patternEClass, PATTERN__NODES);
    createEReference(patternEClass, PATTERN__EDGES);
    createEReference(patternEClass, PATTERN__INCOMING_RESULTS);
    createEReference(patternEClass, PATTERN__OUTGOING_OPERANDS);
    createEAttribute(patternEClass, PATTERN__ID);
    createEAttribute(patternEClass, PATTERN__EXPECTED_SIZE);

    sameEClass = createEClass(SAME);
    createEReference(sameEClass, SAME__SOURCE);
    createEReference(sameEClass, SAME__TARGET);

    differentEClass = createEClass(DIFFERENT);
    createEReference(differentEClass, DIFFERENT__SOURCE);
    createEReference(differentEClass, DIFFERENT__TARGET);

    attributePatternEClass = createEClass(ATTRIBUTE_PATTERN);
    createEAttribute(attributePatternEClass, ATTRIBUTE_PATTERN__NAME);
    createEReference(attributePatternEClass, ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL);
    createEReference(attributePatternEClass, ATTRIBUTE_PATTERN__OWNER_NODE);
    createEAttribute(attributePatternEClass, ATTRIBUTE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES);

    keepEClass = createEClass(KEEP);
    createEReference(keepEClass, KEEP__SOURCE);
    createEReference(keepEClass, KEEP__TARGET);

    restrictionEClass = createEClass(RESTRICTION);

    mandatoryNodeEClass = createEClass(MANDATORY_NODE);

    optionalNodeEClass = createEClass(OPTIONAL_NODE);

    combinatorEClass = createEClass(COMBINATOR);

    externalEClass = createEClass(EXTERNAL);

    operatorEClass = createEClass(OPERATOR);
    createEReference(operatorEClass, OPERATOR__OPERANDS);
    createEReference(operatorEClass, OPERATOR__RESULTS);
    createEAttribute(operatorEClass, OPERATOR__ID);
    createEReference(operatorEClass, OPERATOR__FLOW_OUT);
    createEReference(operatorEClass, OPERATOR__FLOW_IN);
    createEReference(operatorEClass, OPERATOR__CONDITIONS);
    createEReference(operatorEClass, OPERATOR__ACTIONS);

    resultEClass = createEClass(RESULT);
    createEReference(resultEClass, RESULT__PATTERN);
    createEReference(resultEClass, RESULT__OPERATOR);

    anyResultEClass = createEClass(ANY_RESULT);

    someResultEClass = createEClass(SOME_RESULT);
    createEAttribute(someResultEClass, SOME_RESULT__COUNT);

    operandEClass = createEClass(OPERAND);
    createEReference(operandEClass, OPERAND__OPERATOR);
    createEReference(operandEClass, OPERAND__PATTERN);
    createEAttribute(operandEClass, OPERAND__INDEX);

    anyOperandEClass = createEClass(ANY_OPERAND);

    someOperandEClass = createEClass(SOME_OPERAND);
    createEAttribute(someOperandEClass, SOME_OPERAND__COUNT);

    antiOperandEClass = createEClass(ANTI_OPERAND);

    optionalOperandEClass = createEClass(OPTIONAL_OPERAND);

    flowRuleEClass = createEClass(FLOW_RULE);
    createEReference(flowRuleEClass, FLOW_RULE__SOURCE);
    createEReference(flowRuleEClass, FLOW_RULE__TARGET);

    nextEClass = createEClass(NEXT);

    eventuallyEClass = createEClass(EVENTUALLY);

    nextDerivedEClass = createEClass(NEXT_DERIVED);

    attributeCalculationEClass = createEClass(ATTRIBUTE_CALCULATION);

    externalAttributeCalculationCallEClass = createEClass(EXTERNAL_ATTRIBUTE_CALCULATION_CALL);
    createEAttribute(externalAttributeCalculationCallEClass, EXTERNAL_ATTRIBUTE_CALCULATION_CALL__ID);
    createEAttribute(externalAttributeCalculationCallEClass, EXTERNAL_ATTRIBUTE_CALCULATION_CALL__QUALIFIED_NAME);
    createEReference(externalAttributeCalculationCallEClass, EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT);
    createEReference(externalAttributeCalculationCallEClass, EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF);
    createEReference(parameterEClass, PARAMETER__EXTERNAL_CONDITION_CALL_REF);
    createEReference(parameterEClass, PARAMETER__EXTERNAL_ACTION_CALL_REF);
    createEReference(parameterEClass, PARAMETER__EXTERNAL_CALCULATION_CALL_REF);

    applicationConditionEClass = createEClass(APPLICATION_CONDITION);

    externalConditionCallEClass = createEClass(EXTERNAL_CONDITION_CALL);
    createEAttribute(externalConditionCallEClass, EXTERNAL_CONDITION_CALL__ID);
    createEAttribute(externalConditionCallEClass, EXTERNAL_CONDITION_CALL__QUALIFIED_NAME);
    createEReference(externalConditionCallEClass, EXTERNAL_CONDITION_CALL__PARAMETERS);

    actionEClass = createEClass(ACTION);

    externalActionCallEClass = createEClass(EXTERNAL_ACTION_CALL);
    createEAttribute(externalActionCallEClass, EXTERNAL_ACTION_CALL__ID);
    createEAttribute(externalActionCallEClass, EXTERNAL_ACTION_CALL__QUALIFIED_NAME);
    createEReference(externalActionCallEClass, EXTERNAL_ACTION_CALL__PARAMETERS);

    externalAttributeCalculationCallParameterEClass = createEClass(EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER);
    createEReference(externalAttributeCalculationCallParameterEClass, EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER__OWNER);
    createEReference(externalAttributeCalculationCallParameterEClass, EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER__PARAMETER);

    externalConditionCallParameterEClass = createEClass(EXTERNAL_CONDITION_CALL_PARAMETER);
    createEReference(externalConditionCallParameterEClass, EXTERNAL_CONDITION_CALL_PARAMETER__OWNER);
    createEReference(externalConditionCallParameterEClass, EXTERNAL_CONDITION_CALL_PARAMETER__PARAMETER);

    externalActionCallParameterEClass = createEClass(EXTERNAL_ACTION_CALL_PARAMETER);
    createEReference(externalActionCallParameterEClass, EXTERNAL_ACTION_CALL_PARAMETER__OWNER);
    createEReference(externalActionCallParameterEClass, EXTERNAL_ACTION_CALL_PARAMETER__PARAMETER);

    parameterRefEClass = createEClass(PARAMETER_REF);
    createEAttribute(parameterRefEClass, PARAMETER_REF__INDEX);

    calculationEClass = createEClass(CALCULATION);

    externalCalculationCallEClass = createEClass(EXTERNAL_CALCULATION_CALL);
    createEAttribute(externalCalculationCallEClass, EXTERNAL_CALCULATION_CALL__ID);
    createEAttribute(externalCalculationCallEClass, EXTERNAL_CALCULATION_CALL__QUALIFIED_NAME);
    createEReference(externalCalculationCallEClass, EXTERNAL_CALCULATION_CALL__PARAMETERS);

    externalCalculationCallParameterEClass = createEClass(EXTERNAL_CALCULATION_CALL_PARAMETER);
    createEReference(externalCalculationCallParameterEClass, EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER);
    createEReference(externalCalculationCallParameterEClass, EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    nodePatternEClass.getESuperTypes().add(this.getParameter());
    sameEClass.getESuperTypes().add(this.getRestriction());
    differentEClass.getESuperTypes().add(this.getRestriction());
    attributePatternEClass.getESuperTypes().add(this.getParameter());
    keepEClass.getESuperTypes().add(this.getRestriction());
    mandatoryNodeEClass.getESuperTypes().add(this.getNodePattern());
    optionalNodeEClass.getESuperTypes().add(this.getNodePattern());
    combinatorEClass.getESuperTypes().add(this.getOperator());
    externalEClass.getESuperTypes().add(this.getOperator());
    anyResultEClass.getESuperTypes().add(this.getResult());
    someResultEClass.getESuperTypes().add(this.getResult());
    anyOperandEClass.getESuperTypes().add(this.getOperand());
    someOperandEClass.getESuperTypes().add(this.getOperand());
    antiOperandEClass.getESuperTypes().add(this.getOperand());
    optionalOperandEClass.getESuperTypes().add(this.getOperand());
    nextEClass.getESuperTypes().add(this.getFlowRule());
    eventuallyEClass.getESuperTypes().add(this.getFlowRule());
    nextDerivedEClass.getESuperTypes().add(this.getFlowRule());
    attributeCalculationEClass.getESuperTypes().add(this.getRestriction());
    externalAttributeCalculationCallEClass.getESuperTypes().add(this.getAttributeCalculation());
    externalConditionCallEClass.getESuperTypes().add(this.getApplicationCondition());
    externalActionCallEClass.getESuperTypes().add(this.getAction());
    externalAttributeCalculationCallParameterEClass.getESuperTypes().add(this.getParameterRef());
    externalConditionCallParameterEClass.getESuperTypes().add(this.getParameterRef());
    externalActionCallParameterEClass.getESuperTypes().add(this.getParameterRef());
    calculationEClass.getESuperTypes().add(this.getParameter());
    externalCalculationCallEClass.getESuperTypes().add(this.getCalculation());
    externalCalculationCallParameterEClass.getESuperTypes().add(this.getParameterRef());

    // Initialize classes and features; add operations and parameters
    initEClass(trNetModelEClass, TrNetModel.class, "TrNetModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTrNetModel_Patterns(), this.getPattern(), null, "patterns", null, 0, -1, TrNetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrNetModel_Operators(), this.getOperator(), null, "operators", null, 0, -1, TrNetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTrNetModel_Id(), ecorePackage.getEString(), "id", null, 1, 1, TrNetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrNetModel_Restrictions(), this.getRestriction(), null, "restrictions", null, 0, -1, TrNetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrNetModel_Operands(), this.getOperand(), null, "operands", null, 0, -1, TrNetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrNetModel_Results(), this.getResult(), null, "results", null, 0, -1, TrNetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrNetModel_FlowRules(), this.getFlowRule(), null, "flowRules", null, 0, -1, TrNetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTrNetModel_Calculations(), this.getCalculation(), null, "calculations", null, 0, -1, TrNetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodePatternEClass, NodePattern.class, "NodePattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodePattern_Incoming(), this.getEdgePattern(), this.getEdgePattern_Target(), "incoming", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodePattern_Outgoing(), this.getEdgePattern(), this.getEdgePattern_Source(), "outgoing", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodePattern_SameOut(), this.getSame(), this.getSame_Source(), "sameOut", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodePattern_SameIn(), this.getSame(), this.getSame_Target(), "sameIn", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodePattern_Pattern(), this.getPattern(), this.getPattern_Nodes(), "pattern", null, 1, 1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodePattern_Attributes(), this.getAttributePattern(), this.getAttributePattern_OwnerNode(), "attributes", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodePattern_Name(), ecorePackage.getEString(), "name", null, 1, 1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodePattern_KeepIn(), this.getKeep(), this.getKeep_Target(), "keepIn", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodePattern_KeepOut(), this.getKeep(), this.getKeep_Source(), "keepOut", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodePattern_DifferentIn(), this.getDifferent(), this.getDifferent_Target(), "differentIn", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodePattern_DifferentOut(), this.getDifferent(), this.getDifferent_Source(), "differentOut", null, 0, -1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodePattern_Id(), ecorePackage.getEString(), "id", null, 1, 1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodePattern_ExpectedNumberOfDistinctValues(), ecorePackage.getEDouble(), "expectedNumberOfDistinctValues", null, 0, 1, NodePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgePatternEClass, EdgePattern.class, "EdgePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEdgePattern_Source(), this.getNodePattern(), this.getNodePattern_Outgoing(), "source", null, 1, 1, EdgePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdgePattern_Target(), this.getNodePattern(), this.getNodePattern_Incoming(), "target", null, 1, 1, EdgePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdgePattern_Pattern(), this.getPattern(), this.getPattern_Edges(), "pattern", null, 1, 1, EdgePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEdgePattern_Name(), ecorePackage.getEString(), "name", null, 1, 1, EdgePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPattern_Nodes(), this.getNodePattern(), this.getNodePattern_Pattern(), "nodes", null, 1, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPattern_Edges(), this.getEdgePattern(), this.getEdgePattern_Pattern(), "edges", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPattern_IncomingResults(), this.getResult(), this.getResult_Pattern(), "incomingResults", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPattern_OutgoingOperands(), this.getOperand(), this.getOperand_Pattern(), "outgoingOperands", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPattern_Id(), ecorePackage.getEString(), "id", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPattern_Expected_size(), ecorePackage.getEDouble(), "expected_size", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sameEClass, Same.class, "Same", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSame_Source(), this.getNodePattern(), this.getNodePattern_SameOut(), "source", null, 1, 1, Same.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSame_Target(), this.getNodePattern(), this.getNodePattern_SameIn(), "target", null, 1, 1, Same.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(differentEClass, Different.class, "Different", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDifferent_Source(), this.getNodePattern(), this.getNodePattern_DifferentOut(), "source", null, 1, 1, Different.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDifferent_Target(), this.getNodePattern(), this.getNodePattern_DifferentIn(), "target", null, 1, 1, Different.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributePatternEClass, AttributePattern.class, "AttributePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributePattern_Name(), ecorePackage.getEString(), "name", null, 1, 1, AttributePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributePattern_AttributeExternalCalculationCall(), this.getExternalAttributeCalculationCall(), this.getExternalAttributeCalculationCall_Result(), "attributeExternalCalculationCall", null, 0, 1, AttributePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributePattern_OwnerNode(), this.getNodePattern(), this.getNodePattern_Attributes(), "ownerNode", null, 1, 1, AttributePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributePattern_ExpectedNumberOfDistinctValues(), ecorePackage.getEDouble(), "expectedNumberOfDistinctValues", null, 0, 1, AttributePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keepEClass, Keep.class, "Keep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKeep_Source(), this.getNodePattern(), this.getNodePattern_KeepOut(), "source", null, 1, 1, Keep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKeep_Target(), this.getNodePattern(), this.getNodePattern_KeepIn(), "target", null, 1, 1, Keep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restrictionEClass, Restriction.class, "Restriction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mandatoryNodeEClass, MandatoryNode.class, "MandatoryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optionalNodeEClass, OptionalNode.class, "OptionalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(combinatorEClass, Combinator.class, "Combinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalEClass, External.class, "External", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperator_Operands(), this.getOperand(), this.getOperand_Operator(), "operands", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_Results(), this.getResult(), this.getResult_Operator(), "results", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperator_Id(), ecorePackage.getEString(), "id", null, 1, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_FlowOut(), this.getFlowRule(), this.getFlowRule_Source(), "flowOut", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_FlowIn(), this.getFlowRule(), this.getFlowRule_Target(), "flowIn", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_Conditions(), this.getApplicationCondition(), null, "conditions", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperator_Actions(), this.getAction(), null, "actions", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultEClass, Result.class, "Result", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResult_Pattern(), this.getPattern(), this.getPattern_IncomingResults(), "pattern", null, 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResult_Operator(), this.getOperator(), this.getOperator_Results(), "operator", null, 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyResultEClass, AnyResult.class, "AnyResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(someResultEClass, SomeResult.class, "SomeResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSomeResult_Count(), ecorePackage.getEInt(), "count", null, 1, 1, SomeResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operandEClass, Operand.class, "Operand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperand_Operator(), this.getOperator(), this.getOperator_Operands(), "operator", null, 1, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperand_Pattern(), this.getPattern(), this.getPattern_OutgoingOperands(), "pattern", null, 1, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperand_Index(), ecorePackage.getEInt(), "index", null, 1, 1, Operand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyOperandEClass, AnyOperand.class, "AnyOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(someOperandEClass, SomeOperand.class, "SomeOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSomeOperand_Count(), ecorePackage.getEInt(), "count", null, 1, 1, SomeOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(antiOperandEClass, AntiOperand.class, "AntiOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optionalOperandEClass, OptionalOperand.class, "OptionalOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(flowRuleEClass, FlowRule.class, "FlowRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlowRule_Source(), this.getOperator(), this.getOperator_FlowOut(), "source", null, 1, 1, FlowRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlowRule_Target(), this.getOperator(), this.getOperator_FlowIn(), "target", null, 1, 1, FlowRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nextEClass, Next.class, "Next", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventuallyEClass, Eventually.class, "Eventually", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nextDerivedEClass, NextDerived.class, "NextDerived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeCalculationEClass, AttributeCalculation.class, "AttributeCalculation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalAttributeCalculationCallEClass, ExternalAttributeCalculationCall.class, "ExternalAttributeCalculationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalAttributeCalculationCall_Id(), ecorePackage.getEString(), "id", null, 1, 1, ExternalAttributeCalculationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExternalAttributeCalculationCall_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 1, 1, ExternalAttributeCalculationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalAttributeCalculationCall_Result(), this.getAttributePattern(), this.getAttributePattern_AttributeExternalCalculationCall(), "result", null, 1, 1, ExternalAttributeCalculationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalAttributeCalculationCall_Parameters(), this.getExternalAttributeCalculationCallParameter(), this.getExternalAttributeCalculationCallParameter_Owner(), "parameters", null, 0, -1, ExternalAttributeCalculationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_ExternalAttributeCalculationCallRef(), this.getExternalAttributeCalculationCallParameter(), this.getExternalAttributeCalculationCallParameter_Parameter(), "externalAttributeCalculationCallRef", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_ExternalConditionCallRef(), this.getExternalConditionCallParameter(), this.getExternalConditionCallParameter_Parameter(), "externalConditionCallRef", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_ExternalActionCallRef(), this.getExternalActionCallParameter(), this.getExternalActionCallParameter_Parameter(), "externalActionCallRef", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_ExternalCalculationCallRef(), this.getExternalCalculationCallParameter(), this.getExternalCalculationCallParameter_Parameter(), "externalCalculationCallRef", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationConditionEClass, ApplicationCondition.class, "ApplicationCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalConditionCallEClass, ExternalConditionCall.class, "ExternalConditionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalConditionCall_Id(), ecorePackage.getEString(), "id", null, 1, 1, ExternalConditionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExternalConditionCall_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 1, 1, ExternalConditionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalConditionCall_Parameters(), this.getExternalConditionCallParameter(), this.getExternalConditionCallParameter_Owner(), "parameters", null, 0, -1, ExternalConditionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalActionCallEClass, ExternalActionCall.class, "ExternalActionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalActionCall_Id(), ecorePackage.getEString(), "id", null, 1, 1, ExternalActionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExternalActionCall_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 1, 1, ExternalActionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalActionCall_Parameters(), this.getExternalActionCallParameter(), this.getExternalActionCallParameter_Owner(), "parameters", null, 0, -1, ExternalActionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalAttributeCalculationCallParameterEClass, ExternalAttributeCalculationCallParameter.class, "ExternalAttributeCalculationCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalAttributeCalculationCallParameter_Owner(), this.getExternalAttributeCalculationCall(), this.getExternalAttributeCalculationCall_Parameters(), "owner", null, 1, 1, ExternalAttributeCalculationCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalAttributeCalculationCallParameter_Parameter(), this.getParameter(), this.getParameter_ExternalAttributeCalculationCallRef(), "parameter", null, 1, 1, ExternalAttributeCalculationCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalConditionCallParameterEClass, ExternalConditionCallParameter.class, "ExternalConditionCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalConditionCallParameter_Owner(), this.getExternalConditionCall(), this.getExternalConditionCall_Parameters(), "owner", null, 1, 1, ExternalConditionCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalConditionCallParameter_Parameter(), this.getParameter(), this.getParameter_ExternalConditionCallRef(), "parameter", null, 1, 1, ExternalConditionCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalActionCallParameterEClass, ExternalActionCallParameter.class, "ExternalActionCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalActionCallParameter_Owner(), this.getExternalActionCall(), this.getExternalActionCall_Parameters(), "owner", null, 1, 1, ExternalActionCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalActionCallParameter_Parameter(), this.getParameter(), this.getParameter_ExternalActionCallRef(), "parameter", null, 1, 1, ExternalActionCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterRefEClass, ParameterRef.class, "ParameterRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterRef_Index(), ecorePackage.getEInt(), "index", null, 1, 1, ParameterRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(calculationEClass, Calculation.class, "Calculation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(externalCalculationCallEClass, ExternalCalculationCall.class, "ExternalCalculationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalCalculationCall_Id(), ecorePackage.getEString(), "id", null, 1, 1, ExternalCalculationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExternalCalculationCall_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, ExternalCalculationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalCalculationCall_Parameters(), this.getExternalCalculationCallParameter(), this.getExternalCalculationCallParameter_Owner(), "parameters", null, 0, -1, ExternalCalculationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalCalculationCallParameterEClass, ExternalCalculationCallParameter.class, "ExternalCalculationCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExternalCalculationCallParameter_Owner(), this.getExternalCalculationCall(), this.getExternalCalculationCall_Parameters(), "owner", null, 1, 1, ExternalCalculationCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalCalculationCallParameter_Parameter(), this.getParameter(), this.getParameter_ExternalCalculationCallRef(), "parameter", null, 1, 1, ExternalCalculationCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.compartment
    createGmf_3Annotations();
    // gmf.link
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																														
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (trNetModelEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																													
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (nodePatternEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "figure", "rectangle"
       });				
    addAnnotation
      (patternEClass, 
       source, 
       new String[] 
       {
       "label.placement", "none",
       "figure", "rounded",
       "tool.name", "Pattern"
       });				
    addAnnotation
      (attributePatternEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "figure", "rectangle"
       });			
    addAnnotation
      (mandatoryNodeEClass, 
       source, 
       new String[] 
       {
       "tool.name", "Node",
       "border.style", "solid"
       });		
    addAnnotation
      (combinatorEClass, 
       source, 
       new String[] 
       {
       "label.placement", "none",
       "figure", "rectangle",
       "color", "145,145,145",
       "tool.name", "Combine Operator"
       });		
    addAnnotation
      (externalEClass, 
       source, 
       new String[] 
       {
       "label.placement", "none",
       "figure", "rectangle",
       "color", "255,255,255",
       "tool.name", "External"
       });		
    addAnnotation
      (operatorEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });										
    addAnnotation
      (externalAttributeCalculationCallEClass, 
       source, 
       new String[] 
       {
       "label", "id",
       "figure", "rectangle",
       "size", "120,30",
       "color", "100,226,255"
       });			
    addAnnotation
      (externalConditionCallEClass, 
       source, 
       new String[] 
       {
       "label", "id",
       "figure", "rectangle",
       "size", "120,30",
       "color", "252,186,255"
       });		
    addAnnotation
      (externalActionCallEClass, 
       source, 
       new String[] 
       {
       "label", "id",
       "figure", "rectangle",
       "size", "120,30",
       "color", "176,255,161"
       });					
    addAnnotation
      (externalCalculationCallEClass, 
       source, 
       new String[] 
       {
       "label", "id",
       "figure", "rectangle",
       "size", "120,30",
       "color", "100,226,255"
       });	
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.compartment";					
    addAnnotation
      (getNodePattern_Attributes(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });				
    addAnnotation
      (getPattern_Nodes(), 
       source, 
       new String[] 
       {
       "collapsible", "false"
       });									
    addAnnotation
      (getOperator_Conditions(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });		
    addAnnotation
      (getOperator_Actions(), 
       source, 
       new String[] 
       {
       "collapsible", "true",
       "layout", "list"
       });															
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.link";						
    addAnnotation
      (edgePatternEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "source", "source",
       "target", "target",
       "target.decoration", "arrow",
       "width", "1",
       "tool.name", "Edge"
       });				
    addAnnotation
      (sameEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "color", "0,214,32",
       "tool.name", "Same Node",
       "width", "2"
       });			
    addAnnotation
      (keepEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "color", "51,153,255",
       "target.decoration", "arrow",
       "tool.name", "Keep Node",
       "width", "2"
       });								
    addAnnotation
      (resultEClass, 
       source, 
       new String[] 
       {
       "source", "operator",
       "target", "pattern",
       "target.decoration", "arrow",
       "width", "3"
       });		
    addAnnotation
      (anyResultEClass, 
       source, 
       new String[] 
       {
       "tool.name", "All Result"
       });		
    addAnnotation
      (operandEClass, 
       source, 
       new String[] 
       {
       "source", "pattern",
       "target", "operator",
       "target.decoration", "arrow",
       "width", "3"
       });		
    addAnnotation
      (anyOperandEClass, 
       source, 
       new String[] 
       {
       "tool.name", "All Operand"
       });		
    addAnnotation
      (flowRuleEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "target.decoration", "arrow",
       "width", "3"
       });		
    addAnnotation
      (nextDerivedEClass, 
       source, 
       new String[] 
       {
       "color", "255,207,254"
       });			
    addAnnotation
      (getExternalAttributeCalculationCall_Result(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "width", "3",
       "color", "90,90,90"
       });				
    addAnnotation
      (externalAttributeCalculationCallParameterEClass, 
       source, 
       new String[] 
       {
       "source", "owner",
       "target", "parameter",
       "label", "index",
       "target.decoration", "arrow",
       "width", "3",
       "color", "90,90,90",
       "style", "dash"
       });		
    addAnnotation
      (externalConditionCallParameterEClass, 
       source, 
       new String[] 
       {
       "source", "owner",
       "target", "parameter",
       "label", "index",
       "target.decoration", "arrow",
       "width", "3",
       "color", "90,90,90",
       "style", "dash"
       });		
    addAnnotation
      (externalActionCallParameterEClass, 
       source, 
       new String[] 
       {
       "source", "owner",
       "target", "parameter",
       "label", "index",
       "target.decoration", "arrow",
       "width", "3",
       "color", "90,90,90",
       "style", "dash"
       });			
    addAnnotation
      (externalCalculationCallParameterEClass, 
       source, 
       new String[] 
       {
       "source", "owner",
       "target", "parameter",
       "label", "index",
       "target.decoration", "arrow",
       "width", "3",
       "color", "90,90,90",
       "style", "dash"
       });
  }

} //TrnetvisualPackageImpl
