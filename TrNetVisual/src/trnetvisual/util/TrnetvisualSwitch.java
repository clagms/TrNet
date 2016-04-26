/**
 */
package trnetvisual.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import trnetvisual.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see trnetvisual.TrnetvisualPackage
 * @generated
 */
public class TrnetvisualSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TrnetvisualPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrnetvisualSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TrnetvisualPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TrnetvisualPackage.TR_NET_MODEL:
      {
        TrNetModel trNetModel = (TrNetModel)theEObject;
        T result = caseTrNetModel(trNetModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.NODE_PATTERN:
      {
        NodePattern nodePattern = (NodePattern)theEObject;
        T result = caseNodePattern(nodePattern);
        if (result == null) result = caseParameter(nodePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EDGE_PATTERN:
      {
        EdgePattern edgePattern = (EdgePattern)theEObject;
        T result = caseEdgePattern(edgePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.SAME:
      {
        Same same = (Same)theEObject;
        T result = caseSame(same);
        if (result == null) result = caseRestriction(same);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.DIFFERENT:
      {
        Different different = (Different)theEObject;
        T result = caseDifferent(different);
        if (result == null) result = caseRestriction(different);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.ATTRIBUTE_PATTERN:
      {
        AttributePattern attributePattern = (AttributePattern)theEObject;
        T result = caseAttributePattern(attributePattern);
        if (result == null) result = caseParameter(attributePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.KEEP:
      {
        Keep keep = (Keep)theEObject;
        T result = caseKeep(keep);
        if (result == null) result = caseRestriction(keep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.RESTRICTION:
      {
        Restriction restriction = (Restriction)theEObject;
        T result = caseRestriction(restriction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.MANDATORY_NODE:
      {
        MandatoryNode mandatoryNode = (MandatoryNode)theEObject;
        T result = caseMandatoryNode(mandatoryNode);
        if (result == null) result = caseNodePattern(mandatoryNode);
        if (result == null) result = caseParameter(mandatoryNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.OPTIONAL_NODE:
      {
        OptionalNode optionalNode = (OptionalNode)theEObject;
        T result = caseOptionalNode(optionalNode);
        if (result == null) result = caseNodePattern(optionalNode);
        if (result == null) result = caseParameter(optionalNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.COMBINATOR:
      {
        Combinator combinator = (Combinator)theEObject;
        T result = caseCombinator(combinator);
        if (result == null) result = caseOperator(combinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EXTERNAL:
      {
        External external = (External)theEObject;
        T result = caseExternal(external);
        if (result == null) result = caseOperator(external);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.OPERATOR:
      {
        Operator operator = (Operator)theEObject;
        T result = caseOperator(operator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.RESULT:
      {
        Result result = (Result)theEObject;
        T theResult = caseResult(result);
        if (theResult == null) theResult = defaultCase(theEObject);
        return theResult;
      }
      case TrnetvisualPackage.ANY_RESULT:
      {
        AnyResult anyResult = (AnyResult)theEObject;
        T result = caseAnyResult(anyResult);
        if (result == null) result = caseResult(anyResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.SOME_RESULT:
      {
        SomeResult someResult = (SomeResult)theEObject;
        T result = caseSomeResult(someResult);
        if (result == null) result = caseResult(someResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.OPERAND:
      {
        Operand operand = (Operand)theEObject;
        T result = caseOperand(operand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.ANY_OPERAND:
      {
        AnyOperand anyOperand = (AnyOperand)theEObject;
        T result = caseAnyOperand(anyOperand);
        if (result == null) result = caseOperand(anyOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.SOME_OPERAND:
      {
        SomeOperand someOperand = (SomeOperand)theEObject;
        T result = caseSomeOperand(someOperand);
        if (result == null) result = caseOperand(someOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.ANTI_OPERAND:
      {
        AntiOperand antiOperand = (AntiOperand)theEObject;
        T result = caseAntiOperand(antiOperand);
        if (result == null) result = caseOperand(antiOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.OPTIONAL_OPERAND:
      {
        OptionalOperand optionalOperand = (OptionalOperand)theEObject;
        T result = caseOptionalOperand(optionalOperand);
        if (result == null) result = caseOperand(optionalOperand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.FLOW_RULE:
      {
        FlowRule flowRule = (FlowRule)theEObject;
        T result = caseFlowRule(flowRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.NEXT:
      {
        Next next = (Next)theEObject;
        T result = caseNext(next);
        if (result == null) result = caseFlowRule(next);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EVENTUALLY:
      {
        Eventually eventually = (Eventually)theEObject;
        T result = caseEventually(eventually);
        if (result == null) result = caseFlowRule(eventually);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.NEXT_DERIVED:
      {
        NextDerived nextDerived = (NextDerived)theEObject;
        T result = caseNextDerived(nextDerived);
        if (result == null) result = caseFlowRule(nextDerived);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.ATTRIBUTE_CALCULATION:
      {
        AttributeCalculation attributeCalculation = (AttributeCalculation)theEObject;
        T result = caseAttributeCalculation(attributeCalculation);
        if (result == null) result = caseRestriction(attributeCalculation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL:
      {
        ExternalAttributeCalculationCall externalAttributeCalculationCall = (ExternalAttributeCalculationCall)theEObject;
        T result = caseExternalAttributeCalculationCall(externalAttributeCalculationCall);
        if (result == null) result = caseAttributeCalculation(externalAttributeCalculationCall);
        if (result == null) result = caseRestriction(externalAttributeCalculationCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.APPLICATION_CONDITION:
      {
        ApplicationCondition applicationCondition = (ApplicationCondition)theEObject;
        T result = caseApplicationCondition(applicationCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EXTERNAL_CONDITION_CALL:
      {
        ExternalConditionCall externalConditionCall = (ExternalConditionCall)theEObject;
        T result = caseExternalConditionCall(externalConditionCall);
        if (result == null) result = caseApplicationCondition(externalConditionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EXTERNAL_ACTION_CALL:
      {
        ExternalActionCall externalActionCall = (ExternalActionCall)theEObject;
        T result = caseExternalActionCall(externalActionCall);
        if (result == null) result = caseAction(externalActionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EXTERNAL_ATTRIBUTE_CALCULATION_CALL_PARAMETER:
      {
        ExternalAttributeCalculationCallParameter externalAttributeCalculationCallParameter = (ExternalAttributeCalculationCallParameter)theEObject;
        T result = caseExternalAttributeCalculationCallParameter(externalAttributeCalculationCallParameter);
        if (result == null) result = caseParameterRef(externalAttributeCalculationCallParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EXTERNAL_CONDITION_CALL_PARAMETER:
      {
        ExternalConditionCallParameter externalConditionCallParameter = (ExternalConditionCallParameter)theEObject;
        T result = caseExternalConditionCallParameter(externalConditionCallParameter);
        if (result == null) result = caseParameterRef(externalConditionCallParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EXTERNAL_ACTION_CALL_PARAMETER:
      {
        ExternalActionCallParameter externalActionCallParameter = (ExternalActionCallParameter)theEObject;
        T result = caseExternalActionCallParameter(externalActionCallParameter);
        if (result == null) result = caseParameterRef(externalActionCallParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.PARAMETER_REF:
      {
        ParameterRef parameterRef = (ParameterRef)theEObject;
        T result = caseParameterRef(parameterRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.CALCULATION:
      {
        Calculation calculation = (Calculation)theEObject;
        T result = caseCalculation(calculation);
        if (result == null) result = caseParameter(calculation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL:
      {
        ExternalCalculationCall externalCalculationCall = (ExternalCalculationCall)theEObject;
        T result = caseExternalCalculationCall(externalCalculationCall);
        if (result == null) result = caseCalculation(externalCalculationCall);
        if (result == null) result = caseParameter(externalCalculationCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TrnetvisualPackage.EXTERNAL_CALCULATION_CALL_PARAMETER:
      {
        ExternalCalculationCallParameter externalCalculationCallParameter = (ExternalCalculationCallParameter)theEObject;
        T result = caseExternalCalculationCallParameter(externalCalculationCallParameter);
        if (result == null) result = caseParameterRef(externalCalculationCallParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tr Net Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tr Net Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrNetModel(TrNetModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodePattern(NodePattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edge Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edge Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEdgePattern(EdgePattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Same</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Same</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSame(Same object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Different</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Different</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDifferent(Different object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributePattern(AttributePattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Keep</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Keep</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeep(Keep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestriction(Restriction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mandatory Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mandatory Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMandatoryNode(MandatoryNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optional Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optional Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionalNode(OptionalNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCombinator(Combinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternal(External object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperator(Operator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResult(Result object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyResult(AnyResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeResult(SomeResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperand(Operand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyOperand(AnyOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeOperand(SomeOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anti Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anti Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAntiOperand(AntiOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optional Operand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optional Operand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionalOperand(OptionalOperand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowRule(FlowRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Next</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Next</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNext(Next object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Eventually</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Eventually</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventually(Eventually object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Next Derived</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Next Derived</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNextDerived(NextDerived object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Calculation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Calculation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeCalculation(AttributeCalculation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Attribute Calculation Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Attribute Calculation Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalAttributeCalculationCall(ExternalAttributeCalculationCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationCondition(ApplicationCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Condition Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Condition Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalConditionCall(ExternalConditionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Action Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Action Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalActionCall(ExternalActionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Attribute Calculation Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Attribute Calculation Call Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalAttributeCalculationCallParameter(ExternalAttributeCalculationCallParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Condition Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Condition Call Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalConditionCallParameter(ExternalConditionCallParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Action Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Action Call Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalActionCallParameter(ExternalActionCallParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterRef(ParameterRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Calculation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Calculation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCalculation(Calculation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Calculation Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Calculation Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalCalculationCall(ExternalCalculationCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Calculation Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Calculation Call Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalCalculationCallParameter(ExternalCalculationCallParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TrnetvisualSwitch
