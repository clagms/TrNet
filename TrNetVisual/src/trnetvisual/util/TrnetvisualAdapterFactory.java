/**
 */
package trnetvisual.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import trnetvisual.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see trnetvisual.TrnetvisualPackage
 * @generated
 */
public class TrnetvisualAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TrnetvisualPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrnetvisualAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TrnetvisualPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrnetvisualSwitch<Adapter> modelSwitch =
    new TrnetvisualSwitch<Adapter>()
    {
      @Override
      public Adapter caseTrNetModel(TrNetModel object)
      {
        return createTrNetModelAdapter();
      }
      @Override
      public Adapter caseNodePattern(NodePattern object)
      {
        return createNodePatternAdapter();
      }
      @Override
      public Adapter caseEdgePattern(EdgePattern object)
      {
        return createEdgePatternAdapter();
      }
      @Override
      public Adapter casePattern(Pattern object)
      {
        return createPatternAdapter();
      }
      @Override
      public Adapter caseSame(Same object)
      {
        return createSameAdapter();
      }
      @Override
      public Adapter caseDifferent(Different object)
      {
        return createDifferentAdapter();
      }
      @Override
      public Adapter caseAttributePattern(AttributePattern object)
      {
        return createAttributePatternAdapter();
      }
      @Override
      public Adapter caseKeep(Keep object)
      {
        return createKeepAdapter();
      }
      @Override
      public Adapter caseRestriction(Restriction object)
      {
        return createRestrictionAdapter();
      }
      @Override
      public Adapter caseMandatoryNode(MandatoryNode object)
      {
        return createMandatoryNodeAdapter();
      }
      @Override
      public Adapter caseOptionalNode(OptionalNode object)
      {
        return createOptionalNodeAdapter();
      }
      @Override
      public Adapter caseCombinator(Combinator object)
      {
        return createCombinatorAdapter();
      }
      @Override
      public Adapter caseExternal(External object)
      {
        return createExternalAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseResult(Result object)
      {
        return createResultAdapter();
      }
      @Override
      public Adapter caseAnyResult(AnyResult object)
      {
        return createAnyResultAdapter();
      }
      @Override
      public Adapter caseSomeResult(SomeResult object)
      {
        return createSomeResultAdapter();
      }
      @Override
      public Adapter caseOperand(Operand object)
      {
        return createOperandAdapter();
      }
      @Override
      public Adapter caseAnyOperand(AnyOperand object)
      {
        return createAnyOperandAdapter();
      }
      @Override
      public Adapter caseSomeOperand(SomeOperand object)
      {
        return createSomeOperandAdapter();
      }
      @Override
      public Adapter caseAntiOperand(AntiOperand object)
      {
        return createAntiOperandAdapter();
      }
      @Override
      public Adapter caseOptionalOperand(OptionalOperand object)
      {
        return createOptionalOperandAdapter();
      }
      @Override
      public Adapter caseFlowRule(FlowRule object)
      {
        return createFlowRuleAdapter();
      }
      @Override
      public Adapter caseNext(Next object)
      {
        return createNextAdapter();
      }
      @Override
      public Adapter caseEventually(Eventually object)
      {
        return createEventuallyAdapter();
      }
      @Override
      public Adapter caseNextDerived(NextDerived object)
      {
        return createNextDerivedAdapter();
      }
      @Override
      public Adapter caseAttributeCalculation(AttributeCalculation object)
      {
        return createAttributeCalculationAdapter();
      }
      @Override
      public Adapter caseExternalAttributeCalculationCall(ExternalAttributeCalculationCall object)
      {
        return createExternalAttributeCalculationCallAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseApplicationCondition(ApplicationCondition object)
      {
        return createApplicationConditionAdapter();
      }
      @Override
      public Adapter caseExternalConditionCall(ExternalConditionCall object)
      {
        return createExternalConditionCallAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseExternalActionCall(ExternalActionCall object)
      {
        return createExternalActionCallAdapter();
      }
      @Override
      public Adapter caseExternalAttributeCalculationCallParameter(ExternalAttributeCalculationCallParameter object)
      {
        return createExternalAttributeCalculationCallParameterAdapter();
      }
      @Override
      public Adapter caseExternalConditionCallParameter(ExternalConditionCallParameter object)
      {
        return createExternalConditionCallParameterAdapter();
      }
      @Override
      public Adapter caseExternalActionCallParameter(ExternalActionCallParameter object)
      {
        return createExternalActionCallParameterAdapter();
      }
      @Override
      public Adapter caseParameterRef(ParameterRef object)
      {
        return createParameterRefAdapter();
      }
      @Override
      public Adapter caseCalculation(Calculation object)
      {
        return createCalculationAdapter();
      }
      @Override
      public Adapter caseExternalCalculationCall(ExternalCalculationCall object)
      {
        return createExternalCalculationCallAdapter();
      }
      @Override
      public Adapter caseExternalCalculationCallParameter(ExternalCalculationCallParameter object)
      {
        return createExternalCalculationCallParameterAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.TrNetModel <em>Tr Net Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.TrNetModel
   * @generated
   */
  public Adapter createTrNetModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.NodePattern <em>Node Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.NodePattern
   * @generated
   */
  public Adapter createNodePatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.EdgePattern <em>Edge Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.EdgePattern
   * @generated
   */
  public Adapter createEdgePatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Same <em>Same</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Same
   * @generated
   */
  public Adapter createSameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Different <em>Different</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Different
   * @generated
   */
  public Adapter createDifferentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.AttributePattern <em>Attribute Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.AttributePattern
   * @generated
   */
  public Adapter createAttributePatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Keep <em>Keep</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Keep
   * @generated
   */
  public Adapter createKeepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Restriction
   * @generated
   */
  public Adapter createRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.MandatoryNode <em>Mandatory Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.MandatoryNode
   * @generated
   */
  public Adapter createMandatoryNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.OptionalNode <em>Optional Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.OptionalNode
   * @generated
   */
  public Adapter createOptionalNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Combinator <em>Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Combinator
   * @generated
   */
  public Adapter createCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.External <em>External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.External
   * @generated
   */
  public Adapter createExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Result <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Result
   * @generated
   */
  public Adapter createResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.AnyResult <em>Any Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.AnyResult
   * @generated
   */
  public Adapter createAnyResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.SomeResult <em>Some Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.SomeResult
   * @generated
   */
  public Adapter createSomeResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Operand
   * @generated
   */
  public Adapter createOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.AnyOperand <em>Any Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.AnyOperand
   * @generated
   */
  public Adapter createAnyOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.SomeOperand <em>Some Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.SomeOperand
   * @generated
   */
  public Adapter createSomeOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.AntiOperand <em>Anti Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.AntiOperand
   * @generated
   */
  public Adapter createAntiOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.OptionalOperand <em>Optional Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.OptionalOperand
   * @generated
   */
  public Adapter createOptionalOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.FlowRule <em>Flow Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.FlowRule
   * @generated
   */
  public Adapter createFlowRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Next <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Next
   * @generated
   */
  public Adapter createNextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Eventually <em>Eventually</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Eventually
   * @generated
   */
  public Adapter createEventuallyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.NextDerived <em>Next Derived</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.NextDerived
   * @generated
   */
  public Adapter createNextDerivedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.AttributeCalculation <em>Attribute Calculation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.AttributeCalculation
   * @generated
   */
  public Adapter createAttributeCalculationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ExternalAttributeCalculationCall <em>External Attribute Calculation Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ExternalAttributeCalculationCall
   * @generated
   */
  public Adapter createExternalAttributeCalculationCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ApplicationCondition <em>Application Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ApplicationCondition
   * @generated
   */
  public Adapter createApplicationConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ExternalConditionCall <em>External Condition Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ExternalConditionCall
   * @generated
   */
  public Adapter createExternalConditionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ExternalActionCall <em>External Action Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ExternalActionCall
   * @generated
   */
  public Adapter createExternalActionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ExternalAttributeCalculationCallParameter <em>External Attribute Calculation Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ExternalAttributeCalculationCallParameter
   * @generated
   */
  public Adapter createExternalAttributeCalculationCallParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ExternalConditionCallParameter <em>External Condition Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ExternalConditionCallParameter
   * @generated
   */
  public Adapter createExternalConditionCallParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ExternalActionCallParameter <em>External Action Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ExternalActionCallParameter
   * @generated
   */
  public Adapter createExternalActionCallParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ParameterRef <em>Parameter Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ParameterRef
   * @generated
   */
  public Adapter createParameterRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.Calculation <em>Calculation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.Calculation
   * @generated
   */
  public Adapter createCalculationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ExternalCalculationCall <em>External Calculation Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ExternalCalculationCall
   * @generated
   */
  public Adapter createExternalCalculationCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnetvisual.ExternalCalculationCallParameter <em>External Calculation Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnetvisual.ExternalCalculationCallParameter
   * @generated
   */
  public Adapter createExternalCalculationCallParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TrnetvisualAdapterFactory
