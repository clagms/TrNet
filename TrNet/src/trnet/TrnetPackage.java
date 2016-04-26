/**
 */
package trnet;

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
 * @see trnet.TrnetFactory
 * @model kind="package"
 * @generated
 */
public interface TrnetPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "trnet";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://trnet/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "trnet";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TrnetPackage eINSTANCE = trnet.impl.TrnetPackageImpl.init();

  /**
   * The meta object id for the '{@link trnet.impl.TrNetModelImpl <em>Tr Net Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.TrNetModelImpl
   * @see trnet.impl.TrnetPackageImpl#getTrNetModel()
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
   * The number of structural features of the '<em>Tr Net Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TR_NET_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link trnet.impl.NodePatternImpl <em>Node Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.NodePatternImpl
   * @see trnet.impl.TrnetPackageImpl#getNodePattern()
   * @generated
   */
  int NODE_PATTERN = 1;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__INCOMING = 0;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__OUTGOING = 1;

  /**
   * The feature id for the '<em><b>Same Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__SAME_OUT = 2;

  /**
   * The feature id for the '<em><b>Same In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__SAME_IN = 3;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__PATTERN = 4;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__ATTRIBUTES = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__NAME = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__ID = 7;

  /**
   * The feature id for the '<em><b>Different In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__DIFFERENT_IN = 8;

  /**
   * The feature id for the '<em><b>Different Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__DIFFERENT_OUT = 9;

  /**
   * The feature id for the '<em><b>Keep In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__KEEP_IN = 10;

  /**
   * The feature id for the '<em><b>Keep Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN__KEEP_OUT = 11;

  /**
   * The number of structural features of the '<em>Node Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_PATTERN_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link trnet.impl.EdgePatternImpl <em>Edge Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.EdgePatternImpl
   * @see trnet.impl.TrnetPackageImpl#getEdgePattern()
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
   * The meta object id for the '{@link trnet.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.PatternImpl
   * @see trnet.impl.TrnetPackageImpl#getPattern()
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
   * The feature id for the '<em><b>Outgoing Operands</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__OUTGOING_OPERANDS = 2;

  /**
   * The feature id for the '<em><b>Incomming Results</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__INCOMMING_RESULTS = 3;

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
   * The meta object id for the '{@link trnet.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.OperatorImpl
   * @see trnet.impl.TrnetPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 4;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__OPERANDS = 0;

  /**
   * The feature id for the '<em><b>Results</b></em>' containment reference list.
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
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link trnet.impl.CombinatorImpl <em>Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.CombinatorImpl
   * @see trnet.impl.TrnetPackageImpl#getCombinator()
   * @generated
   */
  int COMBINATOR = 5;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR__OPERANDS = OPERATOR__OPERANDS;

  /**
   * The feature id for the '<em><b>Results</b></em>' containment reference list.
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
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR__RESTRICTIONS = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link trnet.impl.RestrictionImpl <em>Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.RestrictionImpl
   * @see trnet.impl.TrnetPackageImpl#getRestriction()
   * @generated
   */
  int RESTRICTION = 6;

  /**
   * The number of structural features of the '<em>Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESTRICTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link trnet.impl.SameImpl <em>Same</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.SameImpl
   * @see trnet.impl.TrnetPackageImpl#getSame()
   * @generated
   */
  int SAME = 7;

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
   * The meta object id for the '{@link trnet.impl.AttributePatternImpl <em>Attribute Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.AttributePatternImpl
   * @see trnet.impl.TrnetPackageImpl#getAttributePattern()
   * @generated
   */
  int ATTRIBUTE_PATTERN = 8;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__NAME = 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN__OPERATOR = 2;

  /**
   * The number of structural features of the '<em>Attribute Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PATTERN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link trnet.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.ExpressionImpl
   * @see trnet.impl.TrnetPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link trnet.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.StringLiteralImpl
   * @see trnet.impl.TrnetPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link trnet.impl.KeepImpl <em>Keep</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.KeepImpl
   * @see trnet.impl.TrnetPackageImpl#getKeep()
   * @generated
   */
  int KEEP = 11;

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
   * The meta object id for the '{@link trnet.impl.OperandImpl <em>Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.OperandImpl
   * @see trnet.impl.TrnetPackageImpl#getOperand()
   * @generated
   */
  int OPERAND = 12;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERAND__OPERATOR = 1;

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
   * The meta object id for the '{@link trnet.impl.ResultImpl <em>Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.ResultImpl
   * @see trnet.impl.TrnetPackageImpl#getResult()
   * @generated
   */
  int RESULT = 13;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
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
   * The meta object id for the '{@link trnet.impl.SomeOperandImpl <em>Some Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.SomeOperandImpl
   * @see trnet.impl.TrnetPackageImpl#getSomeOperand()
   * @generated
   */
  int SOME_OPERAND = 14;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_OPERAND__PATTERN = OPERAND__PATTERN;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_OPERAND__OPERATOR = OPERAND__OPERATOR;

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
   * The meta object id for the '{@link trnet.impl.AntiOperandImpl <em>Anti Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.AntiOperandImpl
   * @see trnet.impl.TrnetPackageImpl#getAntiOperand()
   * @generated
   */
  int ANTI_OPERAND = 15;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_OPERAND__PATTERN = OPERAND__PATTERN;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_OPERAND__OPERATOR = OPERAND__OPERATOR;

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
   * The meta object id for the '{@link trnet.impl.AnyOperandImpl <em>Any Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.AnyOperandImpl
   * @see trnet.impl.TrnetPackageImpl#getAnyOperand()
   * @generated
   */
  int ANY_OPERAND = 16;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_OPERAND__PATTERN = OPERAND__PATTERN;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_OPERAND__OPERATOR = OPERAND__OPERATOR;

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
   * The meta object id for the '{@link trnet.impl.SomeResultImpl <em>Some Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.SomeResultImpl
   * @see trnet.impl.TrnetPackageImpl#getSomeResult()
   * @generated
   */
  int SOME_RESULT = 17;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOME_RESULT__PATTERN = RESULT__PATTERN;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
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
   * The meta object id for the '{@link trnet.impl.AnyResultImpl <em>Any Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.AnyResultImpl
   * @see trnet.impl.TrnetPackageImpl#getAnyResult()
   * @generated
   */
  int ANY_RESULT = 18;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_RESULT__PATTERN = RESULT__PATTERN;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
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
   * The meta object id for the '{@link trnet.impl.DifferentImpl <em>Different</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.DifferentImpl
   * @see trnet.impl.TrnetPackageImpl#getDifferent()
   * @generated
   */
  int DIFFERENT = 19;

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
   * The meta object id for the '{@link trnet.impl.ExternalImpl <em>External</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.ExternalImpl
   * @see trnet.impl.TrnetPackageImpl#getExternal()
   * @generated
   */
  int EXTERNAL = 20;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL__OPERANDS = OPERATOR__OPERANDS;

  /**
   * The feature id for the '<em><b>Results</b></em>' containment reference list.
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
   * The number of structural features of the '<em>External</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnet.impl.UnionImpl <em>Union</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.UnionImpl
   * @see trnet.impl.TrnetPackageImpl#getUnion()
   * @generated
   */
  int UNION = 21;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION__OPERANDS = OPERATOR__OPERANDS;

  /**
   * The feature id for the '<em><b>Results</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION__RESULTS = OPERATOR__RESULTS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION__ID = OPERATOR__ID;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION__RESTRICTIONS = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Union</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link trnet.impl.MandatoryNodeImpl <em>Mandatory Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.MandatoryNodeImpl
   * @see trnet.impl.TrnetPackageImpl#getMandatoryNode()
   * @generated
   */
  int MANDATORY_NODE = 22;

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
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE__ID = NODE_PATTERN__ID;

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
   * The number of structural features of the '<em>Mandatory Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_NODE_FEATURE_COUNT = NODE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnet.impl.OptionalNodeImpl <em>Optional Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.OptionalNodeImpl
   * @see trnet.impl.TrnetPackageImpl#getOptionalNode()
   * @generated
   */
  int OPTIONAL_NODE = 23;

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
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE__ID = NODE_PATTERN__ID;

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
   * The number of structural features of the '<em>Optional Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_NODE_FEATURE_COUNT = NODE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnet.impl.ExpressionOperatorImpl <em>Expression Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.ExpressionOperatorImpl
   * @see trnet.impl.TrnetPackageImpl#getExpressionOperator()
   * @generated
   */
  int EXPRESSION_OPERATOR = 24;

  /**
   * The number of structural features of the '<em>Expression Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_OPERATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link trnet.impl.EqualityImpl <em>Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.EqualityImpl
   * @see trnet.impl.TrnetPackageImpl#getEquality()
   * @generated
   */
  int EQUALITY = 25;

  /**
   * The number of structural features of the '<em>Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_FEATURE_COUNT = EXPRESSION_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link trnet.impl.OptionalOperandImpl <em>Optional Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trnet.impl.OptionalOperandImpl
   * @see trnet.impl.TrnetPackageImpl#getOptionalOperand()
   * @generated
   */
  int OPTIONAL_OPERAND = 26;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_OPERAND__PATTERN = OPERAND__PATTERN;

  /**
   * The feature id for the '<em><b>Operator</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_OPERAND__OPERATOR = OPERAND__OPERATOR;

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
   * Returns the meta object for class '{@link trnet.TrNetModel <em>Tr Net Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tr Net Model</em>'.
   * @see trnet.TrNetModel
   * @generated
   */
  EClass getTrNetModel();

  /**
   * Returns the meta object for the containment reference list '{@link trnet.TrNetModel#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see trnet.TrNetModel#getPatterns()
   * @see #getTrNetModel()
   * @generated
   */
  EReference getTrNetModel_Patterns();

  /**
   * Returns the meta object for the containment reference list '{@link trnet.TrNetModel#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operators</em>'.
   * @see trnet.TrNetModel#getOperators()
   * @see #getTrNetModel()
   * @generated
   */
  EReference getTrNetModel_Operators();

  /**
   * Returns the meta object for the attribute '{@link trnet.TrNetModel#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnet.TrNetModel#getId()
   * @see #getTrNetModel()
   * @generated
   */
  EAttribute getTrNetModel_Id();

  /**
   * Returns the meta object for class '{@link trnet.NodePattern <em>Node Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Pattern</em>'.
   * @see trnet.NodePattern
   * @generated
   */
  EClass getNodePattern();

  /**
   * Returns the meta object for the reference list '{@link trnet.NodePattern#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming</em>'.
   * @see trnet.NodePattern#getIncoming()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_Incoming();

  /**
   * Returns the meta object for the reference list '{@link trnet.NodePattern#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing</em>'.
   * @see trnet.NodePattern#getOutgoing()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_Outgoing();

  /**
   * Returns the meta object for the reference list '{@link trnet.NodePattern#getSameOut <em>Same Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Same Out</em>'.
   * @see trnet.NodePattern#getSameOut()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_SameOut();

  /**
   * Returns the meta object for the reference list '{@link trnet.NodePattern#getSameIn <em>Same In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Same In</em>'.
   * @see trnet.NodePattern#getSameIn()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_SameIn();

  /**
   * Returns the meta object for the container reference '{@link trnet.NodePattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pattern</em>'.
   * @see trnet.NodePattern#getPattern()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_Pattern();

  /**
   * Returns the meta object for the containment reference list '{@link trnet.NodePattern#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see trnet.NodePattern#getAttributes()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_Attributes();

  /**
   * Returns the meta object for the attribute '{@link trnet.NodePattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see trnet.NodePattern#getName()
   * @see #getNodePattern()
   * @generated
   */
  EAttribute getNodePattern_Name();

  /**
   * Returns the meta object for the attribute '{@link trnet.NodePattern#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnet.NodePattern#getId()
   * @see #getNodePattern()
   * @generated
   */
  EAttribute getNodePattern_Id();

  /**
   * Returns the meta object for the reference list '{@link trnet.NodePattern#getDifferentIn <em>Different In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Different In</em>'.
   * @see trnet.NodePattern#getDifferentIn()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_DifferentIn();

  /**
   * Returns the meta object for the reference list '{@link trnet.NodePattern#getDifferentOut <em>Different Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Different Out</em>'.
   * @see trnet.NodePattern#getDifferentOut()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_DifferentOut();

  /**
   * Returns the meta object for the reference list '{@link trnet.NodePattern#getKeepIn <em>Keep In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Keep In</em>'.
   * @see trnet.NodePattern#getKeepIn()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_KeepIn();

  /**
   * Returns the meta object for the reference list '{@link trnet.NodePattern#getKeepOut <em>Keep Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Keep Out</em>'.
   * @see trnet.NodePattern#getKeepOut()
   * @see #getNodePattern()
   * @generated
   */
  EReference getNodePattern_KeepOut();

  /**
   * Returns the meta object for class '{@link trnet.EdgePattern <em>Edge Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Pattern</em>'.
   * @see trnet.EdgePattern
   * @generated
   */
  EClass getEdgePattern();

  /**
   * Returns the meta object for the reference '{@link trnet.EdgePattern#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see trnet.EdgePattern#getSource()
   * @see #getEdgePattern()
   * @generated
   */
  EReference getEdgePattern_Source();

  /**
   * Returns the meta object for the reference '{@link trnet.EdgePattern#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see trnet.EdgePattern#getTarget()
   * @see #getEdgePattern()
   * @generated
   */
  EReference getEdgePattern_Target();

  /**
   * Returns the meta object for the container reference '{@link trnet.EdgePattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Pattern</em>'.
   * @see trnet.EdgePattern#getPattern()
   * @see #getEdgePattern()
   * @generated
   */
  EReference getEdgePattern_Pattern();

  /**
   * Returns the meta object for the attribute '{@link trnet.EdgePattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see trnet.EdgePattern#getName()
   * @see #getEdgePattern()
   * @generated
   */
  EAttribute getEdgePattern_Name();

  /**
   * Returns the meta object for class '{@link trnet.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see trnet.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the containment reference list '{@link trnet.Pattern#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see trnet.Pattern#getNodes()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link trnet.Pattern#getEdges <em>Edges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edges</em>'.
   * @see trnet.Pattern#getEdges()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Edges();

  /**
   * Returns the meta object for the reference list '{@link trnet.Pattern#getOutgoingOperands <em>Outgoing Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing Operands</em>'.
   * @see trnet.Pattern#getOutgoingOperands()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_OutgoingOperands();

  /**
   * Returns the meta object for the reference list '{@link trnet.Pattern#getIncommingResults <em>Incomming Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incomming Results</em>'.
   * @see trnet.Pattern#getIncommingResults()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_IncommingResults();

  /**
   * Returns the meta object for the attribute '{@link trnet.Pattern#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnet.Pattern#getId()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Id();

  /**
   * Returns the meta object for the attribute '{@link trnet.Pattern#getExpected_size <em>Expected size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expected size</em>'.
   * @see trnet.Pattern#getExpected_size()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Expected_size();

  /**
   * Returns the meta object for class '{@link trnet.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see trnet.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the containment reference list '{@link trnet.Operator#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see trnet.Operator#getOperands()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Operands();

  /**
   * Returns the meta object for the containment reference list '{@link trnet.Operator#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Results</em>'.
   * @see trnet.Operator#getResults()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Results();

  /**
   * Returns the meta object for the attribute '{@link trnet.Operator#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see trnet.Operator#getId()
   * @see #getOperator()
   * @generated
   */
  EAttribute getOperator_Id();

  /**
   * Returns the meta object for class '{@link trnet.Combinator <em>Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combinator</em>'.
   * @see trnet.Combinator
   * @generated
   */
  EClass getCombinator();

  /**
   * Returns the meta object for the containment reference list '{@link trnet.Combinator#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see trnet.Combinator#getRestrictions()
   * @see #getCombinator()
   * @generated
   */
  EReference getCombinator_Restrictions();

  /**
   * Returns the meta object for class '{@link trnet.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Restriction</em>'.
   * @see trnet.Restriction
   * @generated
   */
  EClass getRestriction();

  /**
   * Returns the meta object for class '{@link trnet.Same <em>Same</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Same</em>'.
   * @see trnet.Same
   * @generated
   */
  EClass getSame();

  /**
   * Returns the meta object for the reference '{@link trnet.Same#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see trnet.Same#getSource()
   * @see #getSame()
   * @generated
   */
  EReference getSame_Source();

  /**
   * Returns the meta object for the reference '{@link trnet.Same#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see trnet.Same#getTarget()
   * @see #getSame()
   * @generated
   */
  EReference getSame_Target();

  /**
   * Returns the meta object for class '{@link trnet.AttributePattern <em>Attribute Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Pattern</em>'.
   * @see trnet.AttributePattern
   * @generated
   */
  EClass getAttributePattern();

  /**
   * Returns the meta object for the containment reference '{@link trnet.AttributePattern#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see trnet.AttributePattern#getExpression()
   * @see #getAttributePattern()
   * @generated
   */
  EReference getAttributePattern_Expression();

  /**
   * Returns the meta object for the attribute '{@link trnet.AttributePattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see trnet.AttributePattern#getName()
   * @see #getAttributePattern()
   * @generated
   */
  EAttribute getAttributePattern_Name();

  /**
   * Returns the meta object for the containment reference '{@link trnet.AttributePattern#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operator</em>'.
   * @see trnet.AttributePattern#getOperator()
   * @see #getAttributePattern()
   * @generated
   */
  EReference getAttributePattern_Operator();

  /**
   * Returns the meta object for class '{@link trnet.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see trnet.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link trnet.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see trnet.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link trnet.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see trnet.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link trnet.Keep <em>Keep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Keep</em>'.
   * @see trnet.Keep
   * @generated
   */
  EClass getKeep();

  /**
   * Returns the meta object for the reference '{@link trnet.Keep#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see trnet.Keep#getSource()
   * @see #getKeep()
   * @generated
   */
  EReference getKeep_Source();

  /**
   * Returns the meta object for the reference '{@link trnet.Keep#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see trnet.Keep#getTarget()
   * @see #getKeep()
   * @generated
   */
  EReference getKeep_Target();

  /**
   * Returns the meta object for class '{@link trnet.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operand</em>'.
   * @see trnet.Operand
   * @generated
   */
  EClass getOperand();

  /**
   * Returns the meta object for the reference '{@link trnet.Operand#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pattern</em>'.
   * @see trnet.Operand#getPattern()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Pattern();

  /**
   * Returns the meta object for the container reference '{@link trnet.Operand#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Operator</em>'.
   * @see trnet.Operand#getOperator()
   * @see #getOperand()
   * @generated
   */
  EReference getOperand_Operator();

  /**
   * Returns the meta object for the attribute '{@link trnet.Operand#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see trnet.Operand#getIndex()
   * @see #getOperand()
   * @generated
   */
  EAttribute getOperand_Index();

  /**
   * Returns the meta object for class '{@link trnet.Result <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result</em>'.
   * @see trnet.Result
   * @generated
   */
  EClass getResult();

  /**
   * Returns the meta object for the reference '{@link trnet.Result#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pattern</em>'.
   * @see trnet.Result#getPattern()
   * @see #getResult()
   * @generated
   */
  EReference getResult_Pattern();

  /**
   * Returns the meta object for the container reference '{@link trnet.Result#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Operator</em>'.
   * @see trnet.Result#getOperator()
   * @see #getResult()
   * @generated
   */
  EReference getResult_Operator();

  /**
   * Returns the meta object for class '{@link trnet.SomeOperand <em>Some Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Operand</em>'.
   * @see trnet.SomeOperand
   * @generated
   */
  EClass getSomeOperand();

  /**
   * Returns the meta object for the attribute '{@link trnet.SomeOperand#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see trnet.SomeOperand#getCount()
   * @see #getSomeOperand()
   * @generated
   */
  EAttribute getSomeOperand_Count();

  /**
   * Returns the meta object for class '{@link trnet.AntiOperand <em>Anti Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anti Operand</em>'.
   * @see trnet.AntiOperand
   * @generated
   */
  EClass getAntiOperand();

  /**
   * Returns the meta object for class '{@link trnet.AnyOperand <em>Any Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Operand</em>'.
   * @see trnet.AnyOperand
   * @generated
   */
  EClass getAnyOperand();

  /**
   * Returns the meta object for class '{@link trnet.SomeResult <em>Some Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Some Result</em>'.
   * @see trnet.SomeResult
   * @generated
   */
  EClass getSomeResult();

  /**
   * Returns the meta object for the attribute '{@link trnet.SomeResult#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see trnet.SomeResult#getCount()
   * @see #getSomeResult()
   * @generated
   */
  EAttribute getSomeResult_Count();

  /**
   * Returns the meta object for class '{@link trnet.AnyResult <em>Any Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Result</em>'.
   * @see trnet.AnyResult
   * @generated
   */
  EClass getAnyResult();

  /**
   * Returns the meta object for class '{@link trnet.Different <em>Different</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Different</em>'.
   * @see trnet.Different
   * @generated
   */
  EClass getDifferent();

  /**
   * Returns the meta object for the reference '{@link trnet.Different#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see trnet.Different#getSource()
   * @see #getDifferent()
   * @generated
   */
  EReference getDifferent_Source();

  /**
   * Returns the meta object for the reference '{@link trnet.Different#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see trnet.Different#getTarget()
   * @see #getDifferent()
   * @generated
   */
  EReference getDifferent_Target();

  /**
   * Returns the meta object for class '{@link trnet.External <em>External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External</em>'.
   * @see trnet.External
   * @generated
   */
  EClass getExternal();

  /**
   * Returns the meta object for class '{@link trnet.Union <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union</em>'.
   * @see trnet.Union
   * @generated
   */
  EClass getUnion();

  /**
   * Returns the meta object for the containment reference list '{@link trnet.Union#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see trnet.Union#getRestrictions()
   * @see #getUnion()
   * @generated
   */
  EReference getUnion_Restrictions();

  /**
   * Returns the meta object for class '{@link trnet.MandatoryNode <em>Mandatory Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Node</em>'.
   * @see trnet.MandatoryNode
   * @generated
   */
  EClass getMandatoryNode();

  /**
   * Returns the meta object for class '{@link trnet.OptionalNode <em>Optional Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Node</em>'.
   * @see trnet.OptionalNode
   * @generated
   */
  EClass getOptionalNode();

  /**
   * Returns the meta object for class '{@link trnet.ExpressionOperator <em>Expression Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Operator</em>'.
   * @see trnet.ExpressionOperator
   * @generated
   */
  EClass getExpressionOperator();

  /**
   * Returns the meta object for class '{@link trnet.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality</em>'.
   * @see trnet.Equality
   * @generated
   */
  EClass getEquality();

  /**
   * Returns the meta object for class '{@link trnet.OptionalOperand <em>Optional Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Operand</em>'.
   * @see trnet.OptionalOperand
   * @generated
   */
  EClass getOptionalOperand();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TrnetFactory getTrnetFactory();

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
     * The meta object literal for the '{@link trnet.impl.TrNetModelImpl <em>Tr Net Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.TrNetModelImpl
     * @see trnet.impl.TrnetPackageImpl#getTrNetModel()
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
     * The meta object literal for the '{@link trnet.impl.NodePatternImpl <em>Node Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.NodePatternImpl
     * @see trnet.impl.TrnetPackageImpl#getNodePattern()
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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_PATTERN__ID = eINSTANCE.getNodePattern_Id();

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
     * The meta object literal for the '{@link trnet.impl.EdgePatternImpl <em>Edge Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.EdgePatternImpl
     * @see trnet.impl.TrnetPackageImpl#getEdgePattern()
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
     * The meta object literal for the '{@link trnet.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.PatternImpl
     * @see trnet.impl.TrnetPackageImpl#getPattern()
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
     * The meta object literal for the '<em><b>Outgoing Operands</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__OUTGOING_OPERANDS = eINSTANCE.getPattern_OutgoingOperands();

    /**
     * The meta object literal for the '<em><b>Incomming Results</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__INCOMMING_RESULTS = eINSTANCE.getPattern_IncommingResults();

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
     * The meta object literal for the '{@link trnet.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.OperatorImpl
     * @see trnet.impl.TrnetPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__OPERANDS = eINSTANCE.getOperator_Operands();

    /**
     * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
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
     * The meta object literal for the '{@link trnet.impl.CombinatorImpl <em>Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.CombinatorImpl
     * @see trnet.impl.TrnetPackageImpl#getCombinator()
     * @generated
     */
    EClass COMBINATOR = eINSTANCE.getCombinator();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMBINATOR__RESTRICTIONS = eINSTANCE.getCombinator_Restrictions();

    /**
     * The meta object literal for the '{@link trnet.impl.RestrictionImpl <em>Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.RestrictionImpl
     * @see trnet.impl.TrnetPackageImpl#getRestriction()
     * @generated
     */
    EClass RESTRICTION = eINSTANCE.getRestriction();

    /**
     * The meta object literal for the '{@link trnet.impl.SameImpl <em>Same</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.SameImpl
     * @see trnet.impl.TrnetPackageImpl#getSame()
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
     * The meta object literal for the '{@link trnet.impl.AttributePatternImpl <em>Attribute Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.AttributePatternImpl
     * @see trnet.impl.TrnetPackageImpl#getAttributePattern()
     * @generated
     */
    EClass ATTRIBUTE_PATTERN = eINSTANCE.getAttributePattern();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_PATTERN__EXPRESSION = eINSTANCE.getAttributePattern_Expression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_PATTERN__NAME = eINSTANCE.getAttributePattern_Name();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_PATTERN__OPERATOR = eINSTANCE.getAttributePattern_Operator();

    /**
     * The meta object literal for the '{@link trnet.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.ExpressionImpl
     * @see trnet.impl.TrnetPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link trnet.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.StringLiteralImpl
     * @see trnet.impl.TrnetPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link trnet.impl.KeepImpl <em>Keep</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.KeepImpl
     * @see trnet.impl.TrnetPackageImpl#getKeep()
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
     * The meta object literal for the '{@link trnet.impl.OperandImpl <em>Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.OperandImpl
     * @see trnet.impl.TrnetPackageImpl#getOperand()
     * @generated
     */
    EClass OPERAND = eINSTANCE.getOperand();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__PATTERN = eINSTANCE.getOperand_Pattern();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERAND__OPERATOR = eINSTANCE.getOperand_Operator();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERAND__INDEX = eINSTANCE.getOperand_Index();

    /**
     * The meta object literal for the '{@link trnet.impl.ResultImpl <em>Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.ResultImpl
     * @see trnet.impl.TrnetPackageImpl#getResult()
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
     * The meta object literal for the '<em><b>Operator</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT__OPERATOR = eINSTANCE.getResult_Operator();

    /**
     * The meta object literal for the '{@link trnet.impl.SomeOperandImpl <em>Some Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.SomeOperandImpl
     * @see trnet.impl.TrnetPackageImpl#getSomeOperand()
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
     * The meta object literal for the '{@link trnet.impl.AntiOperandImpl <em>Anti Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.AntiOperandImpl
     * @see trnet.impl.TrnetPackageImpl#getAntiOperand()
     * @generated
     */
    EClass ANTI_OPERAND = eINSTANCE.getAntiOperand();

    /**
     * The meta object literal for the '{@link trnet.impl.AnyOperandImpl <em>Any Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.AnyOperandImpl
     * @see trnet.impl.TrnetPackageImpl#getAnyOperand()
     * @generated
     */
    EClass ANY_OPERAND = eINSTANCE.getAnyOperand();

    /**
     * The meta object literal for the '{@link trnet.impl.SomeResultImpl <em>Some Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.SomeResultImpl
     * @see trnet.impl.TrnetPackageImpl#getSomeResult()
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
     * The meta object literal for the '{@link trnet.impl.AnyResultImpl <em>Any Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.AnyResultImpl
     * @see trnet.impl.TrnetPackageImpl#getAnyResult()
     * @generated
     */
    EClass ANY_RESULT = eINSTANCE.getAnyResult();

    /**
     * The meta object literal for the '{@link trnet.impl.DifferentImpl <em>Different</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.DifferentImpl
     * @see trnet.impl.TrnetPackageImpl#getDifferent()
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
     * The meta object literal for the '{@link trnet.impl.ExternalImpl <em>External</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.ExternalImpl
     * @see trnet.impl.TrnetPackageImpl#getExternal()
     * @generated
     */
    EClass EXTERNAL = eINSTANCE.getExternal();

    /**
     * The meta object literal for the '{@link trnet.impl.UnionImpl <em>Union</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.UnionImpl
     * @see trnet.impl.TrnetPackageImpl#getUnion()
     * @generated
     */
    EClass UNION = eINSTANCE.getUnion();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION__RESTRICTIONS = eINSTANCE.getUnion_Restrictions();

    /**
     * The meta object literal for the '{@link trnet.impl.MandatoryNodeImpl <em>Mandatory Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.MandatoryNodeImpl
     * @see trnet.impl.TrnetPackageImpl#getMandatoryNode()
     * @generated
     */
    EClass MANDATORY_NODE = eINSTANCE.getMandatoryNode();

    /**
     * The meta object literal for the '{@link trnet.impl.OptionalNodeImpl <em>Optional Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.OptionalNodeImpl
     * @see trnet.impl.TrnetPackageImpl#getOptionalNode()
     * @generated
     */
    EClass OPTIONAL_NODE = eINSTANCE.getOptionalNode();

    /**
     * The meta object literal for the '{@link trnet.impl.ExpressionOperatorImpl <em>Expression Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.ExpressionOperatorImpl
     * @see trnet.impl.TrnetPackageImpl#getExpressionOperator()
     * @generated
     */
    EClass EXPRESSION_OPERATOR = eINSTANCE.getExpressionOperator();

    /**
     * The meta object literal for the '{@link trnet.impl.EqualityImpl <em>Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.EqualityImpl
     * @see trnet.impl.TrnetPackageImpl#getEquality()
     * @generated
     */
    EClass EQUALITY = eINSTANCE.getEquality();

    /**
     * The meta object literal for the '{@link trnet.impl.OptionalOperandImpl <em>Optional Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trnet.impl.OptionalOperandImpl
     * @see trnet.impl.TrnetPackageImpl#getOptionalOperand()
     * @generated
     */
    EClass OPTIONAL_OPERAND = eINSTANCE.getOptionalOperand();

  }

} //TrnetPackage
