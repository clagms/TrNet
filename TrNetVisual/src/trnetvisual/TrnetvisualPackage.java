/**
 */
package trnetvisual;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see trnetvisual.TrnetvisualFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface TrnetvisualPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "trnetvisual";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://trnetvisual/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "trnetvisual";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TrnetvisualPackage eINSTANCE = trnetvisual.impl.TrnetvisualPackageImpl.init();

  /**
   * The meta object id for the '{@link trnetvisual.impl.TrNetModelImpl <em>Tr Net Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.TrNetModelImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getTrNetModel()
   * @generated
   */
  int TR_NET_MODEL = 0;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL__PATTERNS = 0;

  /**
   * The feature id for the '<em><b>Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL__OPERATORS = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL__ID = 2;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL__RESTRICTIONS = 3;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL__OPERANDS = 4;

  /**
   * The feature id for the '<em><b>Results</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL__RESULTS = 5;

  /**
   * The feature id for the '<em><b>Flow Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL__FLOW_RULES = 6;

  /**
   * The feature id for the '<em><b>Calculations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL__CALCULATIONS = 7;

  /**
   * The number of structural features of the '<em>Tr Net Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ParameterImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 28;

  /**
   * The feature id for the '<em><b>External Attribute Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF = 0;

  /**
   * The feature id for the '<em><b>External Condition Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__EXTERNAL_CONDITION_CALL_REF = 1;

  /**
   * The feature id for the '<em><b>External Action Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__EXTERNAL_ACTION_CALL_REF = 2;

  /**
   * The feature id for the '<em><b>External Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__EXTERNAL_CALCULATION_CALL_REF = 3;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link trnetvisual.impl.NodePatternImpl <em>Node Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.NodePatternImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getNodePattern()
   * @generated
   */
  int NODE_PATTERN = 1;

  /**
   * The feature id for the '<em><b>External Attribute Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF = PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Condition Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__EXTERNAL_CONDITION_CALL_REF = PARAMETER__EXTERNAL_CONDITION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Action Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__EXTERNAL_ACTION_CALL_REF = PARAMETER__EXTERNAL_ACTION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__EXTERNAL_CALCULATION_CALL_REF = PARAMETER__EXTERNAL_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__INCOMING = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__OUTGOING = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Same Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__SAME_OUT = PARAMETER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Same In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__SAME_IN = PARAMETER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__PATTERN = PARAMETER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__ATTRIBUTES = PARAMETER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__NAME = PARAMETER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Keep In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__KEEP_IN = PARAMETER_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Keep Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__KEEP_OUT = PARAMETER_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Different In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__DIFFERENT_IN = PARAMETER_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Different Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__DIFFERENT_OUT = PARAMETER_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__ID = PARAMETER_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Expected Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES = PARAMETER_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Node Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link trnetvisual.impl.EdgePatternImpl <em>Edge Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.EdgePatternImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getEdgePattern()
   * @generated
   */
  int EDGE_PATTERN = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_PATTERN__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_PATTERN__TARGET = 1;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_PATTERN__PATTERN = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_PATTERN__NAME = 3;

  /**
   * The number of structural features of the '<em>Edge Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_PATTERN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link trnetvisual.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.PatternImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 3;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__NODES = 0;

  /**
   * The feature id for the '<em><b>Edges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__EDGES = 1;

  /**
   * The feature id for the '<em><b>Incoming Results</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__INCOMING_RESULTS = 2;

  /**
   * The feature id for the '<em><b>Outgoing Operands</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__OUTGOING_OPERANDS = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__ID = 4;

  /**
   * The feature id for the '<em><b>Expected size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__EXPECTED_SIZE = 5;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link trnetvisual.impl.RestrictionImpl <em>Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.RestrictionImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getRestriction()
   * @generated
   */
  int RESTRICTION = 8;

  /**
   * The number of structural features of the '<em>Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.SameImpl <em>Same</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.SameImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getSame()
   * @generated
   */
  int SAME = 4;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAME__SOURCE = RESTRICTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAME__TARGET = RESTRICTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Same</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAME_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link trnetvisual.impl.DifferentImpl <em>Different</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.DifferentImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getDifferent()
   * @generated
   */
  int DIFFERENT = 5;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT__SOURCE = RESTRICTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT__TARGET = RESTRICTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Different</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link trnetvisual.impl.AttributePatternImpl <em>Attribute Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.AttributePatternImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getAttributePattern()
   * @generated
   */
  int ATTRIBUTE_PATTERN = 6;

  /**
   * The feature id for the '<em><b>External Attribute Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF = PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Condition Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__EXTERNAL_CONDITION_CALL_REF = PARAMETER__EXTERNAL_CONDITION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Action Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__EXTERNAL_ACTION_CALL_REF = PARAMETER__EXTERNAL_ACTION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__EXTERNAL_CALCULATION_CALL_REF = PARAMETER__EXTERNAL_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__NAME = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute External Calculation Call</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owner Node</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__OWNER_NODE = PARAMETER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expected Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES = PARAMETER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Attribute Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link trnetvisual.impl.KeepImpl <em>Keep</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.KeepImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getKeep()
   * @generated
   */
  int KEEP = 7;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEEP__SOURCE = RESTRICTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEEP__TARGET = RESTRICTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Keep</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEEP_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link trnetvisual.impl.MandatoryNodeImpl <em>Mandatory Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.MandatoryNodeImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getMandatoryNode()
   * @generated
   */
  int MANDATORY_NODE = 9;

  /**
   * The feature id for the '<em><b>External Attribute Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF = NODE_PATTERN__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Condition Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__EXTERNAL_CONDITION_CALL_REF = NODE_PATTERN__EXTERNAL_CONDITION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Action Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__EXTERNAL_ACTION_CALL_REF = NODE_PATTERN__EXTERNAL_ACTION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__EXTERNAL_CALCULATION_CALL_REF = NODE_PATTERN__EXTERNAL_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__INCOMING = NODE_PATTERN__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__OUTGOING = NODE_PATTERN__OUTGOING;

  /**
   * The feature id for the '<em><b>Same Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__SAME_OUT = NODE_PATTERN__SAME_OUT;

  /**
   * The feature id for the '<em><b>Same In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__SAME_IN = NODE_PATTERN__SAME_IN;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__PATTERN = NODE_PATTERN__PATTERN;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__ATTRIBUTES = NODE_PATTERN__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__NAME = NODE_PATTERN__NAME;

  /**
   * The feature id for the '<em><b>Keep In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__KEEP_IN = NODE_PATTERN__KEEP_IN;

  /**
   * The feature id for the '<em><b>Keep Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__KEEP_OUT = NODE_PATTERN__KEEP_OUT;

  /**
   * The feature id for the '<em><b>Different In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__DIFFERENT_IN = NODE_PATTERN__DIFFERENT_IN;

  /**
   * The feature id for the '<em><b>Different Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__DIFFERENT_OUT = NODE_PATTERN__DIFFERENT_OUT;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__ID = NODE_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Expected Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__EXPECTED_NUMBER_OF_DISTINCT_VALUES = NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES;

  /**
   * The number of structural features of the '<em>Mandatory Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE_FEATURE_COUNT = NODE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.OptionalNodeImpl <em>Optional Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.OptionalNodeImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getOptionalNode()
   * @generated
   */
  int OPTIONAL_NODE = 10;

  /**
   * The feature id for the '<em><b>External Attribute Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF = NODE_PATTERN__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Condition Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__EXTERNAL_CONDITION_CALL_REF = NODE_PATTERN__EXTERNAL_CONDITION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Action Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__EXTERNAL_ACTION_CALL_REF = NODE_PATTERN__EXTERNAL_ACTION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__EXTERNAL_CALCULATION_CALL_REF = NODE_PATTERN__EXTERNAL_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__INCOMING = NODE_PATTERN__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__OUTGOING = NODE_PATTERN__OUTGOING;

  /**
   * The feature id for the '<em><b>Same Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__SAME_OUT = NODE_PATTERN__SAME_OUT;

  /**
   * The feature id for the '<em><b>Same In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__SAME_IN = NODE_PATTERN__SAME_IN;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__PATTERN = NODE_PATTERN__PATTERN;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__ATTRIBUTES = NODE_PATTERN__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__NAME = NODE_PATTERN__NAME;

  /**
   * The feature id for the '<em><b>Keep In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__KEEP_IN = NODE_PATTERN__KEEP_IN;

  /**
   * The feature id for the '<em><b>Keep Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__KEEP_OUT = NODE_PATTERN__KEEP_OUT;

  /**
   * The feature id for the '<em><b>Different In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__DIFFERENT_IN = NODE_PATTERN__DIFFERENT_IN;

  /**
   * The feature id for the '<em><b>Different Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__DIFFERENT_OUT = NODE_PATTERN__DIFFERENT_OUT;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__ID = NODE_PATTERN__ID;

  /**
   * The feature id for the '<em><b>Expected Number Of Distinct Values</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__EXPECTED_NUMBER_OF_DISTINCT_VALUES = NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES;

  /**
   * The number of structural features of the '<em>Optional Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE_FEATURE_COUNT = NODE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.OperatorImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 13;

  /**
   * The feature id for the '<em><b>Operands</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__OPERANDS = 0;

  /**
   * The feature id for the '<em><b>Results</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__RESULTS = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__ID = 2;

  /**
   * The feature id for the '<em><b>Flow Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__FLOW_OUT = 3;

  /**
   * The feature id for the '<em><b>Flow In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__FLOW_IN = 4;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__CONDITIONS = 5;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__ACTIONS = 6;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link trnetvisual.impl.CombinatorImpl <em>Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.CombinatorImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getCombinator()
   * @generated
   */
  int COMBINATOR = 11;

  /**
   * The feature id for the '<em><b>Operands</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR__OPERANDS = OPERATOR__OPERANDS;

  /**
   * The feature id for the '<em><b>Results</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR__RESULTS = OPERATOR__RESULTS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR__ID = OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Flow Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR__FLOW_OUT = OPERATOR__FLOW_OUT;

  /**
   * The feature id for the '<em><b>Flow In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR__FLOW_IN = OPERATOR__FLOW_IN;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR__CONDITIONS = OPERATOR__CONDITIONS;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR__ACTIONS = OPERATOR__ACTIONS;

  /**
   * The number of structural features of the '<em>Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ExternalImpl <em>External</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ExternalImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternal()
   * @generated
   */
  int EXTERNAL = 12;

  /**
   * The feature id for the '<em><b>Operands</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__OPERANDS = OPERATOR__OPERANDS;

  /**
   * The feature id for the '<em><b>Results</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__RESULTS = OPERATOR__RESULTS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__ID = OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Flow Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__FLOW_OUT = OPERATOR__FLOW_OUT;

  /**
   * The feature id for the '<em><b>Flow In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__FLOW_IN = OPERATOR__FLOW_IN;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__CONDITIONS = OPERATOR__CONDITIONS;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__ACTIONS = OPERATOR__ACTIONS;

  /**
   * The number of structural features of the '<em>External</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ResultImpl <em>Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ResultImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getResult()
   * @generated
   */
  int RESULT = 14;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT__OPERATOR = 1;

  /**
   * The number of structural features of the '<em>Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link trnetvisual.impl.AnyResultImpl <em>Any Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.AnyResultImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getAnyResult()
   * @generated
   */
  int ANY_RESULT = 15;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_RESULT__PATTERN = RESULT__PATTERN;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_RESULT__OPERATOR = RESULT__OPERATOR;

  /**
   * The number of structural features of the '<em>Any Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.SomeResultImpl <em>Some Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.SomeResultImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getSomeResult()
   * @generated
   */
  int SOME_RESULT = 16;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_RESULT__PATTERN = RESULT__PATTERN;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_RESULT__OPERATOR = RESULT__OPERATOR;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_RESULT__COUNT = RESULT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Some Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_RESULT_FEATURE_COUNT = RESULT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link trnetvisual.impl.OperandImpl <em>Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.OperandImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getOperand()
   * @generated
   */
  int OPERAND = 17;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__PATTERN = 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__INDEX = 2;

  /**
   * The number of structural features of the '<em>Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link trnetvisual.impl.AnyOperandImpl <em>Any Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.AnyOperandImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getAnyOperand()
   * @generated
   */
  int ANY_OPERAND = 18;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_OPERAND__OPERATOR = OPERAND__OPERATOR;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_OPERAND__PATTERN = OPERAND__PATTERN;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_OPERAND__INDEX = OPERAND__INDEX;

  /**
   * The number of structural features of the '<em>Any Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.SomeOperandImpl <em>Some Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.SomeOperandImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getSomeOperand()
   * @generated
   */
  int SOME_OPERAND = 19;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_OPERAND__OPERATOR = OPERAND__OPERATOR;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_OPERAND__PATTERN = OPERAND__PATTERN;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_OPERAND__INDEX = OPERAND__INDEX;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_OPERAND__COUNT = OPERAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Some Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link trnetvisual.impl.AntiOperandImpl <em>Anti Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.AntiOperandImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getAntiOperand()
   * @generated
   */
  int ANTI_OPERAND = 20;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_OPERAND__OPERATOR = OPERAND__OPERATOR;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_OPERAND__PATTERN = OPERAND__PATTERN;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_OPERAND__INDEX = OPERAND__INDEX;

  /**
   * The number of structural features of the '<em>Anti Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.OptionalOperandImpl <em>Optional Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.OptionalOperandImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getOptionalOperand()
   * @generated
   */
  int OPTIONAL_OPERAND = 21;

  /**
   * The feature id for the '<em><b>Operator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_OPERAND__OPERATOR = OPERAND__OPERATOR;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_OPERAND__PATTERN = OPERAND__PATTERN;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_OPERAND__INDEX = OPERAND__INDEX;

  /**
   * The number of structural features of the '<em>Optional Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_OPERAND_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.FlowRuleImpl <em>Flow Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.FlowRuleImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getFlowRule()
   * @generated
   */
  int FLOW_RULE = 22;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_RULE__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_RULE__TARGET = 1;

  /**
   * The number of structural features of the '<em>Flow Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link trnetvisual.impl.NextImpl <em>Next</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.NextImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getNext()
   * @generated
   */
  int NEXT = 23;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT__SOURCE = FLOW_RULE__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT__TARGET = FLOW_RULE__TARGET;

  /**
   * The number of structural features of the '<em>Next</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_FEATURE_COUNT = FLOW_RULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.EventuallyImpl <em>Eventually</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.EventuallyImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getEventually()
   * @generated
   */
  int EVENTUALLY = 24;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTUALLY__SOURCE = FLOW_RULE__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTUALLY__TARGET = FLOW_RULE__TARGET;

  /**
   * The number of structural features of the '<em>Eventually</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTUALLY_FEATURE_COUNT = FLOW_RULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.NextDerivedImpl <em>Next Derived</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.NextDerivedImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getNextDerived()
   * @generated
   */
  int NEXT_DERIVED = 25;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_DERIVED__SOURCE = FLOW_RULE__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_DERIVED__TARGET = FLOW_RULE__TARGET;

  /**
   * The number of structural features of the '<em>Next Derived</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_DERIVED_FEATURE_COUNT = FLOW_RULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.AttributeCalculationImpl <em>Attribute Calculation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.AttributeCalculationImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getAttributeCalculation()
   * @generated
   */
  int ATTRIBUTE_CALCULATION = 26;

  /**
   * The number of structural features of the '<em>Attribute Calculation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CALCULATION_FEATURE_COUNT = RESTRICTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ExternalAttributeCalculationCallImpl <em>External Attribute Calculation Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ExternalAttributeCalculationCallImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalAttributeCalculationCall()
   * @generated
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL = 27;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL__ID = ATTRIBUTE_CALCULATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL__QUALIFIED_NAME = ATTRIBUTE_CALCULATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Result</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT = ATTRIBUTE_CALCULATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS = ATTRIBUTE_CALCULATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>External Attribute Calculation Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL_FEATURE_COUNT = ATTRIBUTE_CALCULATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ApplicationConditionImpl <em>Application Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ApplicationConditionImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getApplicationCondition()
   * @generated
   */
  int APPLICATION_CONDITION = 29;

  /**
   * The number of structural features of the '<em>Application Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ExternalConditionCallImpl <em>External Condition Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ExternalConditionCallImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalConditionCall()
   * @generated
   */
  int EXTERNAL_CONDITION_CALL = 30;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONDITION_CALL__ID = APPLICATION_CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONDITION_CALL__QUALIFIED_NAME = APPLICATION_CONDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONDITION_CALL__PARAMETERS = APPLICATION_CONDITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>External Condition Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONDITION_CALL_FEATURE_COUNT = APPLICATION_CONDITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ActionImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getAction()
   * @generated
   */
  int ACTION = 31;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ExternalActionCallImpl <em>External Action Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ExternalActionCallImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalActionCall()
   * @generated
   */
  int EXTERNAL_ACTION_CALL = 32;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ACTION_CALL__ID = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ACTION_CALL__QUALIFIED_NAME = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ACTION_CALL__PARAMETERS = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>External Action Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ACTION_CALL_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ParameterRefImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getParameterRef()
   * @generated
   */
  int PARAMETER_REF = 36;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF__INDEX = 0;

  /**
   * The number of structural features of the '<em>Parameter Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ExternalAttributeCalculationCallParameterImpl <em>External Attribute Calculation Call Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ExternalAttributeCalculationCallParameterImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalAttributeCalculationCallParameter()
   * @generated
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER = 33;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER__INDEX = PARAMETER_REF__INDEX;

  /**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER__OWNER = PARAMETER_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER__PARAMETER = PARAMETER_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>External Attribute Calculation Call Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER_FEATURE_COUNT = PARAMETER_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ExternalConditionCallParameterImpl <em>External Condition Call Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ExternalConditionCallParameterImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalConditionCallParameter()
   * @generated
   */
  int EXTERNAL_CONDITION_CALL_PARAMETER = 34;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONDITION_CALL_PARAMETER__INDEX = PARAMETER_REF__INDEX;

  /**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONDITION_CALL_PARAMETER__OWNER = PARAMETER_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONDITION_CALL_PARAMETER__PARAMETER = PARAMETER_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>External Condition Call Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONDITION_CALL_PARAMETER_FEATURE_COUNT = PARAMETER_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ExternalActionCallParameterImpl <em>External Action Call Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ExternalActionCallParameterImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalActionCallParameter()
   * @generated
   */
  int EXTERNAL_ACTION_CALL_PARAMETER = 35;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ACTION_CALL_PARAMETER__INDEX = PARAMETER_REF__INDEX;

  /**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ACTION_CALL_PARAMETER__OWNER = PARAMETER_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ACTION_CALL_PARAMETER__PARAMETER = PARAMETER_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>External Action Call Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_ACTION_CALL_PARAMETER_FEATURE_COUNT = PARAMETER_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link trnetvisual.impl.CalculationImpl <em>Calculation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.CalculationImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getCalculation()
   * @generated
   */
  int CALCULATION = 37;

  /**
   * The feature id for the '<em><b>External Attribute Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF = PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Condition Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION__EXTERNAL_CONDITION_CALL_REF = PARAMETER__EXTERNAL_CONDITION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Action Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION__EXTERNAL_ACTION_CALL_REF = PARAMETER__EXTERNAL_ACTION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION__EXTERNAL_CALCULATION_CALL_REF = PARAMETER__EXTERNAL_CALCULATION_CALL_REF;

  /**
   * The number of structural features of the '<em>Calculation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALCULATION_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ExternalCalculationCallImpl <em>External Calculation Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ExternalCalculationCallImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalCalculationCall()
   * @generated
   */
  int EXTERNAL_CALCULATION_CALL = 38;

  /**
   * The feature id for the '<em><b>External Attribute Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF = CALCULATION__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Condition Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL__EXTERNAL_CONDITION_CALL_REF = CALCULATION__EXTERNAL_CONDITION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Action Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL__EXTERNAL_ACTION_CALL_REF = CALCULATION__EXTERNAL_ACTION_CALL_REF;

  /**
   * The feature id for the '<em><b>External Calculation Call Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL__EXTERNAL_CALCULATION_CALL_REF = CALCULATION__EXTERNAL_CALCULATION_CALL_REF;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL__ID = CALCULATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL__QUALIFIED_NAME = CALCULATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL__PARAMETERS = CALCULATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>External Calculation Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL_FEATURE_COUNT = CALCULATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link trnetvisual.impl.ExternalCalculationCallParameterImpl <em>External Calculation Call Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnetvisual.impl.ExternalCalculationCallParameterImpl
   * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalCalculationCallParameter()
   * @generated
   */
  int EXTERNAL_CALCULATION_CALL_PARAMETER = 39;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL_PARAMETER__INDEX = PARAMETER_REF__INDEX;

  /**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER = PARAMETER_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER = PARAMETER_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>External Calculation Call Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CALCULATION_CALL_PARAMETER_FEATURE_COUNT = PARAMETER_REF_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link trnetvisual.TrNetModel <em>Tr Net Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tr Net Model</em>'.
   * @see trnetvisual.TrNetModel
   * @generated
   */
  EClass getTrNetModel();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.TrNetModel#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see trnetvisual.TrNetModel#getPatterns()
   * @see #getTrNetModel()
   * @generated
   */
  EReference getTrNetModel_Patterns();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.TrNetModel#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operators</em>'.
   * @see trnetvisual.TrNetModel#getOperators()
   * @see #getTrNetModel()
   * @generated
   */
  EReference getTrNetModel_Operators();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.TrNetModel#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnetvisual.TrNetModel#getId()
   * @see #getTrNetModel()
   * @generated
   */
  EAttribute getTrNetModel_Id();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.TrNetModel#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see trnetvisual.TrNetModel#getRestrictions()
   * @see #getTrNetModel()
   * @generated
   */
  EReference getTrNetModel_Restrictions();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.TrNetModel#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see trnetvisual.TrNetModel#getOperands()
   * @see #getTrNetModel()
   * @generated
   */
  EReference getTrNetModel_Operands();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.TrNetModel#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Results</em>'.
   * @see trnetvisual.TrNetModel#getResults()
   * @see #getTrNetModel()
   * @generated
   */
  EReference getTrNetModel_Results();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.TrNetModel#getFlowRules <em>Flow Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flow Rules</em>'.
   * @see trnetvisual.TrNetModel#getFlowRules()
   * @see #getTrNetModel()
   * @generated
   */
  EReference getTrNetModel_FlowRules();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.TrNetModel#getCalculations <em>Calculations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calculations</em>'.
   * @see trnetvisual.TrNetModel#getCalculations()
   * @see #getTrNetModel()
   * @generated
   */
  EReference getTrNetModel_Calculations();

  /**
   * Returns the meta object for class '{@link trnetvisual.NodePattern <em>Node Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Pattern</em>'.
   * @see trnetvisual.NodePattern
   * @generated
   */
  EClass getNodePattern();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.NodePattern#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming</em>'.
   * @see trnetvisual.NodePattern#getIncoming()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_Incoming();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.NodePattern#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing</em>'.
   * @see trnetvisual.NodePattern#getOutgoing()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_Outgoing();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.NodePattern#getSameOut <em>Same Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Same Out</em>'.
   * @see trnetvisual.NodePattern#getSameOut()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_SameOut();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.NodePattern#getSameIn <em>Same In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Same In</em>'.
   * @see trnetvisual.NodePattern#getSameIn()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_SameIn();

  /**
   * Returns the meta object for the container reference '{@link trnetvisual.NodePattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pattern</em>'.
   * @see trnetvisual.NodePattern#getPattern()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_Pattern();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.NodePattern#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see trnetvisual.NodePattern#getAttributes()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_Attributes();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.NodePattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see trnetvisual.NodePattern#getName()
   * @see #getNodePattern()
   * @generated
   */
  EAttribute getNodePattern_Name();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.NodePattern#getKeepIn <em>Keep In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Keep In</em>'.
   * @see trnetvisual.NodePattern#getKeepIn()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_KeepIn();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.NodePattern#getKeepOut <em>Keep Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Keep Out</em>'.
   * @see trnetvisual.NodePattern#getKeepOut()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_KeepOut();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.NodePattern#getDifferentIn <em>Different In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Different In</em>'.
   * @see trnetvisual.NodePattern#getDifferentIn()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_DifferentIn();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.NodePattern#getDifferentOut <em>Different Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Different Out</em>'.
   * @see trnetvisual.NodePattern#getDifferentOut()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_DifferentOut();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.NodePattern#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnetvisual.NodePattern#getId()
   * @see #getNodePattern()
   * @generated
   */
  EAttribute getNodePattern_Id();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.NodePattern#getExpectedNumberOfDistinctValues <em>Expected Number Of Distinct Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expected Number Of Distinct Values</em>'.
   * @see trnetvisual.NodePattern#getExpectedNumberOfDistinctValues()
   * @see #getNodePattern()
   * @generated
   */
  EAttribute getNodePattern_ExpectedNumberOfDistinctValues();

  /**
   * Returns the meta object for class '{@link trnetvisual.EdgePattern <em>Edge Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Pattern</em>'.
   * @see trnetvisual.EdgePattern
   * @generated
   */
  EClass getEdgePattern();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.EdgePattern#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see trnetvisual.EdgePattern#getSource()
   * @see #getEdgePattern()
   * @generated
   */
  EReference getEdgePattern_Source();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.EdgePattern#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see trnetvisual.EdgePattern#getTarget()
   * @see #getEdgePattern()
   * @generated
   */
  EReference getEdgePattern_Target();

  /**
   * Returns the meta object for the container reference '{@link trnetvisual.EdgePattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pattern</em>'.
   * @see trnetvisual.EdgePattern#getPattern()
   * @see #getEdgePattern()
   * @generated
   */
  EReference getEdgePattern_Pattern();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.EdgePattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see trnetvisual.EdgePattern#getName()
   * @see #getEdgePattern()
   * @generated
   */
  EAttribute getEdgePattern_Name();

  /**
   * Returns the meta object for class '{@link trnetvisual.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see trnetvisual.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.Pattern#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see trnetvisual.Pattern#getNodes()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.Pattern#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see trnetvisual.Pattern#getEdges()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Edges();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Pattern#getIncomingResults <em>Incoming Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming Results</em>'.
   * @see trnetvisual.Pattern#getIncomingResults()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_IncomingResults();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Pattern#getOutgoingOperands <em>Outgoing Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing Operands</em>'.
   * @see trnetvisual.Pattern#getOutgoingOperands()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_OutgoingOperands();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.Pattern#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnetvisual.Pattern#getId()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Id();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.Pattern#getExpected_size <em>Expected size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expected size</em>'.
   * @see trnetvisual.Pattern#getExpected_size()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Expected_size();

  /**
   * Returns the meta object for class '{@link trnetvisual.Same <em>Same</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Same</em>'.
   * @see trnetvisual.Same
   * @generated
   */
  EClass getSame();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Same#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see trnetvisual.Same#getSource()
   * @see #getSame()
   * @generated
   */
  EReference getSame_Source();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Same#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see trnetvisual.Same#getTarget()
   * @see #getSame()
   * @generated
   */
  EReference getSame_Target();

  /**
   * Returns the meta object for class '{@link trnetvisual.Different <em>Different</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Different</em>'.
   * @see trnetvisual.Different
   * @generated
   */
  EClass getDifferent();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Different#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see trnetvisual.Different#getSource()
   * @see #getDifferent()
   * @generated
   */
  EReference getDifferent_Source();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Different#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see trnetvisual.Different#getTarget()
   * @see #getDifferent()
   * @generated
   */
  EReference getDifferent_Target();

  /**
   * Returns the meta object for class '{@link trnetvisual.AttributePattern <em>Attribute Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Pattern</em>'.
   * @see trnetvisual.AttributePattern
   * @generated
   */
  EClass getAttributePattern();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.AttributePattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see trnetvisual.AttributePattern#getName()
   * @see #getAttributePattern()
   * @generated
   */
  EAttribute getAttributePattern_Name();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.AttributePattern#getAttributeExternalCalculationCall <em>Attribute External Calculation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute External Calculation Call</em>'.
   * @see trnetvisual.AttributePattern#getAttributeExternalCalculationCall()
   * @see #getAttributePattern()
   * @generated
   */
  EReference getAttributePattern_AttributeExternalCalculationCall();

  /**
   * Returns the meta object for the container reference '{@link trnetvisual.AttributePattern#getOwnerNode <em>Owner Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner Node</em>'.
   * @see trnetvisual.AttributePattern#getOwnerNode()
   * @see #getAttributePattern()
   * @generated
   */
  EReference getAttributePattern_OwnerNode();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.AttributePattern#getExpectedNumberOfDistinctValues <em>Expected Number Of Distinct Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expected Number Of Distinct Values</em>'.
   * @see trnetvisual.AttributePattern#getExpectedNumberOfDistinctValues()
   * @see #getAttributePattern()
   * @generated
   */
  EAttribute getAttributePattern_ExpectedNumberOfDistinctValues();

  /**
   * Returns the meta object for class '{@link trnetvisual.Keep <em>Keep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Keep</em>'.
   * @see trnetvisual.Keep
   * @generated
   */
  EClass getKeep();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Keep#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see trnetvisual.Keep#getSource()
   * @see #getKeep()
   * @generated
   */
  EReference getKeep_Source();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Keep#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see trnetvisual.Keep#getTarget()
   * @see #getKeep()
   * @generated
   */
  EReference getKeep_Target();

  /**
   * Returns the meta object for class '{@link trnetvisual.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restriction</em>'.
   * @see trnetvisual.Restriction
   * @generated
   */
  EClass getRestriction();

  /**
   * Returns the meta object for class '{@link trnetvisual.MandatoryNode <em>Mandatory Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Node</em>'.
   * @see trnetvisual.MandatoryNode
   * @generated
   */
  EClass getMandatoryNode();

  /**
   * Returns the meta object for class '{@link trnetvisual.OptionalNode <em>Optional Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Node</em>'.
   * @see trnetvisual.OptionalNode
   * @generated
   */
  EClass getOptionalNode();

  /**
   * Returns the meta object for class '{@link trnetvisual.Combinator <em>Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combinator</em>'.
   * @see trnetvisual.Combinator
   * @generated
   */
  EClass getCombinator();

  /**
   * Returns the meta object for class '{@link trnetvisual.External <em>External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External</em>'.
   * @see trnetvisual.External
   * @generated
   */
  EClass getExternal();

  /**
   * Returns the meta object for class '{@link trnetvisual.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see trnetvisual.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Operator#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Operands</em>'.
   * @see trnetvisual.Operator#getOperands()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Operands();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Operator#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Results</em>'.
   * @see trnetvisual.Operator#getResults()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Results();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.Operator#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnetvisual.Operator#getId()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_Id();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Operator#getFlowOut <em>Flow Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Flow Out</em>'.
   * @see trnetvisual.Operator#getFlowOut()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_FlowOut();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Operator#getFlowIn <em>Flow In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Flow In</em>'.
   * @see trnetvisual.Operator#getFlowIn()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_FlowIn();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.Operator#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see trnetvisual.Operator#getConditions()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Conditions();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.Operator#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see trnetvisual.Operator#getActions()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Actions();

  /**
   * Returns the meta object for class '{@link trnetvisual.Result <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result</em>'.
   * @see trnetvisual.Result
   * @generated
   */
  EClass getResult();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Result#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pattern</em>'.
   * @see trnetvisual.Result#getPattern()
   * @see #getResult()
   * @generated
   */
  EReference getResult_Pattern();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Result#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operator</em>'.
   * @see trnetvisual.Result#getOperator()
   * @see #getResult()
   * @generated
   */
  EReference getResult_Operator();

  /**
   * Returns the meta object for class '{@link trnetvisual.AnyResult <em>Any Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Result</em>'.
   * @see trnetvisual.AnyResult
   * @generated
   */
  EClass getAnyResult();

  /**
   * Returns the meta object for class '{@link trnetvisual.SomeResult <em>Some Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Result</em>'.
   * @see trnetvisual.SomeResult
   * @generated
   */
  EClass getSomeResult();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.SomeResult#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see trnetvisual.SomeResult#getCount()
   * @see #getSomeResult()
   * @generated
   */
  EAttribute getSomeResult_Count();

  /**
   * Returns the meta object for class '{@link trnetvisual.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand</em>'.
   * @see trnetvisual.Operand
   * @generated
   */
  EClass getOperand();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Operand#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operator</em>'.
   * @see trnetvisual.Operand#getOperator()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Operator();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.Operand#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pattern</em>'.
   * @see trnetvisual.Operand#getPattern()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Pattern();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.Operand#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see trnetvisual.Operand#getIndex()
   * @see #getOperand()
   * @generated
   */
  EAttribute getOperand_Index();

  /**
   * Returns the meta object for class '{@link trnetvisual.AnyOperand <em>Any Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Operand</em>'.
   * @see trnetvisual.AnyOperand
   * @generated
   */
  EClass getAnyOperand();

  /**
   * Returns the meta object for class '{@link trnetvisual.SomeOperand <em>Some Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Operand</em>'.
   * @see trnetvisual.SomeOperand
   * @generated
   */
  EClass getSomeOperand();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.SomeOperand#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see trnetvisual.SomeOperand#getCount()
   * @see #getSomeOperand()
   * @generated
   */
  EAttribute getSomeOperand_Count();

  /**
   * Returns the meta object for class '{@link trnetvisual.AntiOperand <em>Anti Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anti Operand</em>'.
   * @see trnetvisual.AntiOperand
   * @generated
   */
  EClass getAntiOperand();

  /**
   * Returns the meta object for class '{@link trnetvisual.OptionalOperand <em>Optional Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Operand</em>'.
   * @see trnetvisual.OptionalOperand
   * @generated
   */
  EClass getOptionalOperand();

  /**
   * Returns the meta object for class '{@link trnetvisual.FlowRule <em>Flow Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Rule</em>'.
   * @see trnetvisual.FlowRule
   * @generated
   */
  EClass getFlowRule();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.FlowRule#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see trnetvisual.FlowRule#getSource()
   * @see #getFlowRule()
   * @generated
   */
  EReference getFlowRule_Source();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.FlowRule#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see trnetvisual.FlowRule#getTarget()
   * @see #getFlowRule()
   * @generated
   */
  EReference getFlowRule_Target();

  /**
   * Returns the meta object for class '{@link trnetvisual.Next <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Next</em>'.
   * @see trnetvisual.Next
   * @generated
   */
  EClass getNext();

  /**
   * Returns the meta object for class '{@link trnetvisual.Eventually <em>Eventually</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eventually</em>'.
   * @see trnetvisual.Eventually
   * @generated
   */
  EClass getEventually();

  /**
   * Returns the meta object for class '{@link trnetvisual.NextDerived <em>Next Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Next Derived</em>'.
   * @see trnetvisual.NextDerived
   * @generated
   */
  EClass getNextDerived();

  /**
   * Returns the meta object for class '{@link trnetvisual.AttributeCalculation <em>Attribute Calculation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Calculation</em>'.
   * @see trnetvisual.AttributeCalculation
   * @generated
   */
  EClass getAttributeCalculation();

  /**
   * Returns the meta object for class '{@link trnetvisual.ExternalAttributeCalculationCall <em>External Attribute Calculation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Attribute Calculation Call</em>'.
   * @see trnetvisual.ExternalAttributeCalculationCall
   * @generated
   */
  EClass getExternalAttributeCalculationCall();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.ExternalAttributeCalculationCall#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnetvisual.ExternalAttributeCalculationCall#getId()
   * @see #getExternalAttributeCalculationCall()
   * @generated
   */
  EAttribute getExternalAttributeCalculationCall_Id();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.ExternalAttributeCalculationCall#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see trnetvisual.ExternalAttributeCalculationCall#getQualifiedName()
   * @see #getExternalAttributeCalculationCall()
   * @generated
   */
  EAttribute getExternalAttributeCalculationCall_QualifiedName();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.ExternalAttributeCalculationCall#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Result</em>'.
   * @see trnetvisual.ExternalAttributeCalculationCall#getResult()
   * @see #getExternalAttributeCalculationCall()
   * @generated
   */
  EReference getExternalAttributeCalculationCall_Result();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.ExternalAttributeCalculationCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see trnetvisual.ExternalAttributeCalculationCall#getParameters()
   * @see #getExternalAttributeCalculationCall()
   * @generated
   */
  EReference getExternalAttributeCalculationCall_Parameters();

  /**
   * Returns the meta object for class '{@link trnetvisual.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see trnetvisual.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Parameter#getExternalAttributeCalculationCallRef <em>External Attribute Calculation Call Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>External Attribute Calculation Call Ref</em>'.
   * @see trnetvisual.Parameter#getExternalAttributeCalculationCallRef()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_ExternalAttributeCalculationCallRef();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Parameter#getExternalConditionCallRef <em>External Condition Call Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>External Condition Call Ref</em>'.
   * @see trnetvisual.Parameter#getExternalConditionCallRef()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_ExternalConditionCallRef();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Parameter#getExternalActionCallRef <em>External Action Call Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>External Action Call Ref</em>'.
   * @see trnetvisual.Parameter#getExternalActionCallRef()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_ExternalActionCallRef();

  /**
   * Returns the meta object for the reference list '{@link trnetvisual.Parameter#getExternalCalculationCallRef <em>External Calculation Call Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>External Calculation Call Ref</em>'.
   * @see trnetvisual.Parameter#getExternalCalculationCallRef()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_ExternalCalculationCallRef();

  /**
   * Returns the meta object for class '{@link trnetvisual.ApplicationCondition <em>Application Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Condition</em>'.
   * @see trnetvisual.ApplicationCondition
   * @generated
   */
  EClass getApplicationCondition();

  /**
   * Returns the meta object for class '{@link trnetvisual.ExternalConditionCall <em>External Condition Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Condition Call</em>'.
   * @see trnetvisual.ExternalConditionCall
   * @generated
   */
  EClass getExternalConditionCall();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.ExternalConditionCall#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnetvisual.ExternalConditionCall#getId()
   * @see #getExternalConditionCall()
   * @generated
   */
  EAttribute getExternalConditionCall_Id();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.ExternalConditionCall#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see trnetvisual.ExternalConditionCall#getQualifiedName()
   * @see #getExternalConditionCall()
   * @generated
   */
  EAttribute getExternalConditionCall_QualifiedName();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.ExternalConditionCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see trnetvisual.ExternalConditionCall#getParameters()
   * @see #getExternalConditionCall()
   * @generated
   */
  EReference getExternalConditionCall_Parameters();

  /**
   * Returns the meta object for class '{@link trnetvisual.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see trnetvisual.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link trnetvisual.ExternalActionCall <em>External Action Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Action Call</em>'.
   * @see trnetvisual.ExternalActionCall
   * @generated
   */
  EClass getExternalActionCall();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.ExternalActionCall#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnetvisual.ExternalActionCall#getId()
   * @see #getExternalActionCall()
   * @generated
   */
  EAttribute getExternalActionCall_Id();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.ExternalActionCall#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see trnetvisual.ExternalActionCall#getQualifiedName()
   * @see #getExternalActionCall()
   * @generated
   */
  EAttribute getExternalActionCall_QualifiedName();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.ExternalActionCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see trnetvisual.ExternalActionCall#getParameters()
   * @see #getExternalActionCall()
   * @generated
   */
  EReference getExternalActionCall_Parameters();

  /**
   * Returns the meta object for class '{@link trnetvisual.ExternalAttributeCalculationCallParameter <em>External Attribute Calculation Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Attribute Calculation Call Parameter</em>'.
   * @see trnetvisual.ExternalAttributeCalculationCallParameter
   * @generated
   */
  EClass getExternalAttributeCalculationCallParameter();

  /**
   * Returns the meta object for the container reference '{@link trnetvisual.ExternalAttributeCalculationCallParameter#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see trnetvisual.ExternalAttributeCalculationCallParameter#getOwner()
   * @see #getExternalAttributeCalculationCallParameter()
   * @generated
   */
  EReference getExternalAttributeCalculationCallParameter_Owner();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.ExternalAttributeCalculationCallParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see trnetvisual.ExternalAttributeCalculationCallParameter#getParameter()
   * @see #getExternalAttributeCalculationCallParameter()
   * @generated
   */
  EReference getExternalAttributeCalculationCallParameter_Parameter();

  /**
   * Returns the meta object for class '{@link trnetvisual.ExternalConditionCallParameter <em>External Condition Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Condition Call Parameter</em>'.
   * @see trnetvisual.ExternalConditionCallParameter
   * @generated
   */
  EClass getExternalConditionCallParameter();

  /**
   * Returns the meta object for the container reference '{@link trnetvisual.ExternalConditionCallParameter#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see trnetvisual.ExternalConditionCallParameter#getOwner()
   * @see #getExternalConditionCallParameter()
   * @generated
   */
  EReference getExternalConditionCallParameter_Owner();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.ExternalConditionCallParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see trnetvisual.ExternalConditionCallParameter#getParameter()
   * @see #getExternalConditionCallParameter()
   * @generated
   */
  EReference getExternalConditionCallParameter_Parameter();

  /**
   * Returns the meta object for class '{@link trnetvisual.ExternalActionCallParameter <em>External Action Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Action Call Parameter</em>'.
   * @see trnetvisual.ExternalActionCallParameter
   * @generated
   */
  EClass getExternalActionCallParameter();

  /**
   * Returns the meta object for the container reference '{@link trnetvisual.ExternalActionCallParameter#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see trnetvisual.ExternalActionCallParameter#getOwner()
   * @see #getExternalActionCallParameter()
   * @generated
   */
  EReference getExternalActionCallParameter_Owner();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.ExternalActionCallParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see trnetvisual.ExternalActionCallParameter#getParameter()
   * @see #getExternalActionCallParameter()
   * @generated
   */
  EReference getExternalActionCallParameter_Parameter();

  /**
   * Returns the meta object for class '{@link trnetvisual.ParameterRef <em>Parameter Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Ref</em>'.
   * @see trnetvisual.ParameterRef
   * @generated
   */
  EClass getParameterRef();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.ParameterRef#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see trnetvisual.ParameterRef#getIndex()
   * @see #getParameterRef()
   * @generated
   */
  EAttribute getParameterRef_Index();

  /**
   * Returns the meta object for class '{@link trnetvisual.Calculation <em>Calculation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Calculation</em>'.
   * @see trnetvisual.Calculation
   * @generated
   */
  EClass getCalculation();

  /**
   * Returns the meta object for class '{@link trnetvisual.ExternalCalculationCall <em>External Calculation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Calculation Call</em>'.
   * @see trnetvisual.ExternalCalculationCall
   * @generated
   */
  EClass getExternalCalculationCall();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.ExternalCalculationCall#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnetvisual.ExternalCalculationCall#getId()
   * @see #getExternalCalculationCall()
   * @generated
   */
  EAttribute getExternalCalculationCall_Id();

  /**
   * Returns the meta object for the attribute '{@link trnetvisual.ExternalCalculationCall#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see trnetvisual.ExternalCalculationCall#getQualifiedName()
   * @see #getExternalCalculationCall()
   * @generated
   */
  EAttribute getExternalCalculationCall_QualifiedName();

  /**
   * Returns the meta object for the containment reference list '{@link trnetvisual.ExternalCalculationCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see trnetvisual.ExternalCalculationCall#getParameters()
   * @see #getExternalCalculationCall()
   * @generated
   */
  EReference getExternalCalculationCall_Parameters();

  /**
   * Returns the meta object for class '{@link trnetvisual.ExternalCalculationCallParameter <em>External Calculation Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Calculation Call Parameter</em>'.
   * @see trnetvisual.ExternalCalculationCallParameter
   * @generated
   */
  EClass getExternalCalculationCallParameter();

  /**
   * Returns the meta object for the container reference '{@link trnetvisual.ExternalCalculationCallParameter#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see trnetvisual.ExternalCalculationCallParameter#getOwner()
   * @see #getExternalCalculationCallParameter()
   * @generated
   */
  EReference getExternalCalculationCallParameter_Owner();

  /**
   * Returns the meta object for the reference '{@link trnetvisual.ExternalCalculationCallParameter#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see trnetvisual.ExternalCalculationCallParameter#getParameter()
   * @see #getExternalCalculationCallParameter()
   * @generated
   */
  EReference getExternalCalculationCallParameter_Parameter();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TrnetvisualFactory getTrnetvisualFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link trnetvisual.impl.TrNetModelImpl <em>Tr Net Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.TrNetModelImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getTrNetModel()
     * @generated
     */
    EClass TR_NET_MODEL = eINSTANCE.getTrNetModel();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TR_NET_MODEL__PATTERNS = eINSTANCE.getTrNetModel_Patterns();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TR_NET_MODEL__OPERATORS = eINSTANCE.getTrNetModel_Operators();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TR_NET_MODEL__ID = eINSTANCE.getTrNetModel_Id();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TR_NET_MODEL__RESTRICTIONS = eINSTANCE.getTrNetModel_Restrictions();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TR_NET_MODEL__OPERANDS = eINSTANCE.getTrNetModel_Operands();

    /**
     * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TR_NET_MODEL__RESULTS = eINSTANCE.getTrNetModel_Results();

    /**
     * The meta object literal for the '<em><b>Flow Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TR_NET_MODEL__FLOW_RULES = eINSTANCE.getTrNetModel_FlowRules();

    /**
     * The meta object literal for the '<em><b>Calculations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TR_NET_MODEL__CALCULATIONS = eINSTANCE.getTrNetModel_Calculations();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.NodePatternImpl <em>Node Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.NodePatternImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getNodePattern()
     * @generated
     */
    EClass NODE_PATTERN = eINSTANCE.getNodePattern();

    /**
     * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__INCOMING = eINSTANCE.getNodePattern_Incoming();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__OUTGOING = eINSTANCE.getNodePattern_Outgoing();

    /**
     * The meta object literal for the '<em><b>Same Out</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__SAME_OUT = eINSTANCE.getNodePattern_SameOut();

    /**
     * The meta object literal for the '<em><b>Same In</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__SAME_IN = eINSTANCE.getNodePattern_SameIn();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__PATTERN = eINSTANCE.getNodePattern_Pattern();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__ATTRIBUTES = eINSTANCE.getNodePattern_Attributes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_PATTERN__NAME = eINSTANCE.getNodePattern_Name();

    /**
     * The meta object literal for the '<em><b>Keep In</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__KEEP_IN = eINSTANCE.getNodePattern_KeepIn();

    /**
     * The meta object literal for the '<em><b>Keep Out</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__KEEP_OUT = eINSTANCE.getNodePattern_KeepOut();

    /**
     * The meta object literal for the '<em><b>Different In</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__DIFFERENT_IN = eINSTANCE.getNodePattern_DifferentIn();

    /**
     * The meta object literal for the '<em><b>Different Out</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_PATTERN__DIFFERENT_OUT = eINSTANCE.getNodePattern_DifferentOut();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_PATTERN__ID = eINSTANCE.getNodePattern_Id();

    /**
     * The meta object literal for the '<em><b>Expected Number Of Distinct Values</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES = eINSTANCE.getNodePattern_ExpectedNumberOfDistinctValues();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.EdgePatternImpl <em>Edge Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.EdgePatternImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getEdgePattern()
     * @generated
     */
    EClass EDGE_PATTERN = eINSTANCE.getEdgePattern();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_PATTERN__SOURCE = eINSTANCE.getEdgePattern_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_PATTERN__TARGET = eINSTANCE.getEdgePattern_Target();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_PATTERN__PATTERN = eINSTANCE.getEdgePattern_Pattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_PATTERN__NAME = eINSTANCE.getEdgePattern_Name();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.PatternImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__NODES = eINSTANCE.getPattern_Nodes();

    /**
     * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__EDGES = eINSTANCE.getPattern_Edges();

    /**
     * The meta object literal for the '<em><b>Incoming Results</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__INCOMING_RESULTS = eINSTANCE.getPattern_IncomingResults();

    /**
     * The meta object literal for the '<em><b>Outgoing Operands</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__OUTGOING_OPERANDS = eINSTANCE.getPattern_OutgoingOperands();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__ID = eINSTANCE.getPattern_Id();

    /**
     * The meta object literal for the '<em><b>Expected size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__EXPECTED_SIZE = eINSTANCE.getPattern_Expected_size();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.SameImpl <em>Same</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.SameImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getSame()
     * @generated
     */
    EClass SAME = eINSTANCE.getSame();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SAME__SOURCE = eINSTANCE.getSame_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SAME__TARGET = eINSTANCE.getSame_Target();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.DifferentImpl <em>Different</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.DifferentImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getDifferent()
     * @generated
     */
    EClass DIFFERENT = eINSTANCE.getDifferent();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENT__SOURCE = eINSTANCE.getDifferent_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENT__TARGET = eINSTANCE.getDifferent_Target();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.AttributePatternImpl <em>Attribute Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.AttributePatternImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getAttributePattern()
     * @generated
     */
    EClass ATTRIBUTE_PATTERN = eINSTANCE.getAttributePattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_PATTERN__NAME = eINSTANCE.getAttributePattern_Name();

    /**
     * The meta object literal for the '<em><b>Attribute External Calculation Call</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_PATTERN__ATTRIBUTE_EXTERNAL_CALCULATION_CALL = eINSTANCE.getAttributePattern_AttributeExternalCalculationCall();

    /**
     * The meta object literal for the '<em><b>Owner Node</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_PATTERN__OWNER_NODE = eINSTANCE.getAttributePattern_OwnerNode();

    /**
     * The meta object literal for the '<em><b>Expected Number Of Distinct Values</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_PATTERN__EXPECTED_NUMBER_OF_DISTINCT_VALUES = eINSTANCE.getAttributePattern_ExpectedNumberOfDistinctValues();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.KeepImpl <em>Keep</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.KeepImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getKeep()
     * @generated
     */
    EClass KEEP = eINSTANCE.getKeep();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEEP__SOURCE = eINSTANCE.getKeep_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEEP__TARGET = eINSTANCE.getKeep_Target();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.RestrictionImpl <em>Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.RestrictionImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getRestriction()
     * @generated
     */
    EClass RESTRICTION = eINSTANCE.getRestriction();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.MandatoryNodeImpl <em>Mandatory Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.MandatoryNodeImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getMandatoryNode()
     * @generated
     */
    EClass MANDATORY_NODE = eINSTANCE.getMandatoryNode();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.OptionalNodeImpl <em>Optional Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.OptionalNodeImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getOptionalNode()
     * @generated
     */
    EClass OPTIONAL_NODE = eINSTANCE.getOptionalNode();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.CombinatorImpl <em>Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.CombinatorImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getCombinator()
     * @generated
     */
    EClass COMBINATOR = eINSTANCE.getCombinator();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ExternalImpl <em>External</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ExternalImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternal()
     * @generated
     */
    EClass EXTERNAL = eINSTANCE.getExternal();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.OperatorImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__OPERANDS = eINSTANCE.getOperator_Operands();

    /**
     * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__RESULTS = eINSTANCE.getOperator_Results();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATOR__ID = eINSTANCE.getOperator_Id();

    /**
     * The meta object literal for the '<em><b>Flow Out</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__FLOW_OUT = eINSTANCE.getOperator_FlowOut();

    /**
     * The meta object literal for the '<em><b>Flow In</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__FLOW_IN = eINSTANCE.getOperator_FlowIn();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__CONDITIONS = eINSTANCE.getOperator_Conditions();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__ACTIONS = eINSTANCE.getOperator_Actions();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ResultImpl <em>Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ResultImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getResult()
     * @generated
     */
    EClass RESULT = eINSTANCE.getResult();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT__PATTERN = eINSTANCE.getResult_Pattern();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT__OPERATOR = eINSTANCE.getResult_Operator();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.AnyResultImpl <em>Any Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.AnyResultImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getAnyResult()
     * @generated
     */
    EClass ANY_RESULT = eINSTANCE.getAnyResult();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.SomeResultImpl <em>Some Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.SomeResultImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getSomeResult()
     * @generated
     */
    EClass SOME_RESULT = eINSTANCE.getSomeResult();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOME_RESULT__COUNT = eINSTANCE.getSomeResult_Count();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.OperandImpl <em>Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.OperandImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getOperand()
     * @generated
     */
    EClass OPERAND = eINSTANCE.getOperand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__OPERATOR = eINSTANCE.getOperand_Operator();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__PATTERN = eINSTANCE.getOperand_Pattern();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERAND__INDEX = eINSTANCE.getOperand_Index();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.AnyOperandImpl <em>Any Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.AnyOperandImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getAnyOperand()
     * @generated
     */
    EClass ANY_OPERAND = eINSTANCE.getAnyOperand();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.SomeOperandImpl <em>Some Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.SomeOperandImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getSomeOperand()
     * @generated
     */
    EClass SOME_OPERAND = eINSTANCE.getSomeOperand();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOME_OPERAND__COUNT = eINSTANCE.getSomeOperand_Count();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.AntiOperandImpl <em>Anti Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.AntiOperandImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getAntiOperand()
     * @generated
     */
    EClass ANTI_OPERAND = eINSTANCE.getAntiOperand();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.OptionalOperandImpl <em>Optional Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.OptionalOperandImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getOptionalOperand()
     * @generated
     */
    EClass OPTIONAL_OPERAND = eINSTANCE.getOptionalOperand();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.FlowRuleImpl <em>Flow Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.FlowRuleImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getFlowRule()
     * @generated
     */
    EClass FLOW_RULE = eINSTANCE.getFlowRule();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_RULE__SOURCE = eINSTANCE.getFlowRule_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_RULE__TARGET = eINSTANCE.getFlowRule_Target();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.NextImpl <em>Next</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.NextImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getNext()
     * @generated
     */
    EClass NEXT = eINSTANCE.getNext();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.EventuallyImpl <em>Eventually</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.EventuallyImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getEventually()
     * @generated
     */
    EClass EVENTUALLY = eINSTANCE.getEventually();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.NextDerivedImpl <em>Next Derived</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.NextDerivedImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getNextDerived()
     * @generated
     */
    EClass NEXT_DERIVED = eINSTANCE.getNextDerived();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.AttributeCalculationImpl <em>Attribute Calculation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.AttributeCalculationImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getAttributeCalculation()
     * @generated
     */
    EClass ATTRIBUTE_CALCULATION = eINSTANCE.getAttributeCalculation();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ExternalAttributeCalculationCallImpl <em>External Attribute Calculation Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ExternalAttributeCalculationCallImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalAttributeCalculationCall()
     * @generated
     */
    EClass EXTERNAL_ATTRIBUTE_CALCULATION_CALL = eINSTANCE.getExternalAttributeCalculationCall();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_ATTRIBUTE_CALCULATION_CALL__ID = eINSTANCE.getExternalAttributeCalculationCall_Id();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_ATTRIBUTE_CALCULATION_CALL__QUALIFIED_NAME = eINSTANCE.getExternalAttributeCalculationCall_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_ATTRIBUTE_CALCULATION_CALL__RESULT = eINSTANCE.getExternalAttributeCalculationCall_Result();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_ATTRIBUTE_CALCULATION_CALL__PARAMETERS = eINSTANCE.getExternalAttributeCalculationCall_Parameters();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ParameterImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>External Attribute Calculation Call Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__EXTERNAL_ATTRIBUTE_CALCULATION_CALL_REF = eINSTANCE.getParameter_ExternalAttributeCalculationCallRef();

    /**
     * The meta object literal for the '<em><b>External Condition Call Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__EXTERNAL_CONDITION_CALL_REF = eINSTANCE.getParameter_ExternalConditionCallRef();

    /**
     * The meta object literal for the '<em><b>External Action Call Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__EXTERNAL_ACTION_CALL_REF = eINSTANCE.getParameter_ExternalActionCallRef();

    /**
     * The meta object literal for the '<em><b>External Calculation Call Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__EXTERNAL_CALCULATION_CALL_REF = eINSTANCE.getParameter_ExternalCalculationCallRef();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ApplicationConditionImpl <em>Application Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ApplicationConditionImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getApplicationCondition()
     * @generated
     */
    EClass APPLICATION_CONDITION = eINSTANCE.getApplicationCondition();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ExternalConditionCallImpl <em>External Condition Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ExternalConditionCallImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalConditionCall()
     * @generated
     */
    EClass EXTERNAL_CONDITION_CALL = eINSTANCE.getExternalConditionCall();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_CONDITION_CALL__ID = eINSTANCE.getExternalConditionCall_Id();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_CONDITION_CALL__QUALIFIED_NAME = eINSTANCE.getExternalConditionCall_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_CONDITION_CALL__PARAMETERS = eINSTANCE.getExternalConditionCall_Parameters();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ActionImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ExternalActionCallImpl <em>External Action Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ExternalActionCallImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalActionCall()
     * @generated
     */
    EClass EXTERNAL_ACTION_CALL = eINSTANCE.getExternalActionCall();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_ACTION_CALL__ID = eINSTANCE.getExternalActionCall_Id();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_ACTION_CALL__QUALIFIED_NAME = eINSTANCE.getExternalActionCall_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_ACTION_CALL__PARAMETERS = eINSTANCE.getExternalActionCall_Parameters();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ExternalAttributeCalculationCallParameterImpl <em>External Attribute Calculation Call Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ExternalAttributeCalculationCallParameterImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalAttributeCalculationCallParameter()
     * @generated
     */
    EClass EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER = eINSTANCE.getExternalAttributeCalculationCallParameter();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER__OWNER = eINSTANCE.getExternalAttributeCalculationCallParameter_Owner();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER__PARAMETER = eINSTANCE.getExternalAttributeCalculationCallParameter_Parameter();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ExternalConditionCallParameterImpl <em>External Condition Call Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ExternalConditionCallParameterImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalConditionCallParameter()
     * @generated
     */
    EClass EXTERNAL_CONDITION_CALL_PARAMETER = eINSTANCE.getExternalConditionCallParameter();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_CONDITION_CALL_PARAMETER__OWNER = eINSTANCE.getExternalConditionCallParameter_Owner();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_CONDITION_CALL_PARAMETER__PARAMETER = eINSTANCE.getExternalConditionCallParameter_Parameter();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ExternalActionCallParameterImpl <em>External Action Call Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ExternalActionCallParameterImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalActionCallParameter()
     * @generated
     */
    EClass EXTERNAL_ACTION_CALL_PARAMETER = eINSTANCE.getExternalActionCallParameter();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_ACTION_CALL_PARAMETER__OWNER = eINSTANCE.getExternalActionCallParameter_Owner();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_ACTION_CALL_PARAMETER__PARAMETER = eINSTANCE.getExternalActionCallParameter_Parameter();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ParameterRefImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getParameterRef()
     * @generated
     */
    EClass PARAMETER_REF = eINSTANCE.getParameterRef();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_REF__INDEX = eINSTANCE.getParameterRef_Index();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.CalculationImpl <em>Calculation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.CalculationImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getCalculation()
     * @generated
     */
    EClass CALCULATION = eINSTANCE.getCalculation();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ExternalCalculationCallImpl <em>External Calculation Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ExternalCalculationCallImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalCalculationCall()
     * @generated
     */
    EClass EXTERNAL_CALCULATION_CALL = eINSTANCE.getExternalCalculationCall();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_CALCULATION_CALL__ID = eINSTANCE.getExternalCalculationCall_Id();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_CALCULATION_CALL__QUALIFIED_NAME = eINSTANCE.getExternalCalculationCall_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_CALCULATION_CALL__PARAMETERS = eINSTANCE.getExternalCalculationCall_Parameters();

    /**
     * The meta object literal for the '{@link trnetvisual.impl.ExternalCalculationCallParameterImpl <em>External Calculation Call Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnetvisual.impl.ExternalCalculationCallParameterImpl
     * @see trnetvisual.impl.TrnetvisualPackageImpl#getExternalCalculationCallParameter()
     * @generated
     */
    EClass EXTERNAL_CALCULATION_CALL_PARAMETER = eINSTANCE.getExternalCalculationCallParameter();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_CALCULATION_CALL_PARAMETER__OWNER = eINSTANCE.getExternalCalculationCallParameter_Owner();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_CALCULATION_CALL_PARAMETER__PARAMETER = eINSTANCE.getExternalCalculationCallParameter_Parameter();

  }

} //TrnetvisualPackage
