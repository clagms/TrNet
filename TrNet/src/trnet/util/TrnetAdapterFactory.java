/**
 */
package trnet.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import trnet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see trnet.TrnetPackage
 * @generated
 */
public class TrnetAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TrnetPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrnetAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TrnetPackage.eINSTANCE;
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
  protected TrnetSwitch<Adapter> modelSwitch =
    new TrnetSwitch<Adapter>()
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
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseCombinator(Combinator object)
      {
        return createCombinatorAdapter();
      }
      @Override
      public Adapter caseRestriction(Restriction object)
      {
        return createRestrictionAdapter();
      }
      @Override
      public Adapter caseSame(Same object)
      {
        return createSameAdapter();
      }
      @Override
      public Adapter caseAttributePattern(AttributePattern object)
      {
        return createAttributePatternAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseKeep(Keep object)
      {
        return createKeepAdapter();
      }
      @Override
      public Adapter caseOperand(Operand object)
      {
        return createOperandAdapter();
      }
      @Override
      public Adapter caseResult(Result object)
      {
        return createResultAdapter();
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
      public Adapter caseAnyOperand(AnyOperand object)
      {
        return createAnyOperandAdapter();
      }
      @Override
      public Adapter caseSomeResult(SomeResult object)
      {
        return createSomeResultAdapter();
      }
      @Override
      public Adapter caseAnyResult(AnyResult object)
      {
        return createAnyResultAdapter();
      }
      @Override
      public Adapter caseDifferent(Different object)
      {
        return createDifferentAdapter();
      }
      @Override
      public Adapter caseExternal(External object)
      {
        return createExternalAdapter();
      }
      @Override
      public Adapter caseUnion(Union object)
      {
        return createUnionAdapter();
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
      public Adapter caseExpressionOperator(ExpressionOperator object)
      {
        return createExpressionOperatorAdapter();
      }
      @Override
      public Adapter caseEquality(Equality object)
      {
        return createEqualityAdapter();
      }
      @Override
      public Adapter caseOptionalOperand(OptionalOperand object)
      {
        return createOptionalOperandAdapter();
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
   * Creates a new adapter for an object of class '{@link trnet.TrNetModel <em>Tr Net Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.TrNetModel
   * @generated
   */
  public Adapter createTrNetModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.NodePattern <em>Node Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.NodePattern
   * @generated
   */
  public Adapter createNodePatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.EdgePattern <em>Edge Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.EdgePattern
   * @generated
   */
  public Adapter createEdgePatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Combinator <em>Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Combinator
   * @generated
   */
  public Adapter createCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Restriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Restriction
   * @generated
   */
  public Adapter createRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Same <em>Same</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Same
   * @generated
   */
  public Adapter createSameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.AttributePattern <em>Attribute Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.AttributePattern
   * @generated
   */
  public Adapter createAttributePatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Keep <em>Keep</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Keep
   * @generated
   */
  public Adapter createKeepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Operand
   * @generated
   */
  public Adapter createOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Result <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Result
   * @generated
   */
  public Adapter createResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.SomeOperand <em>Some Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.SomeOperand
   * @generated
   */
  public Adapter createSomeOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.AntiOperand <em>Anti Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.AntiOperand
   * @generated
   */
  public Adapter createAntiOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.AnyOperand <em>Any Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.AnyOperand
   * @generated
   */
  public Adapter createAnyOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.SomeResult <em>Some Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.SomeResult
   * @generated
   */
  public Adapter createSomeResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.AnyResult <em>Any Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.AnyResult
   * @generated
   */
  public Adapter createAnyResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Different <em>Different</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Different
   * @generated
   */
  public Adapter createDifferentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.External <em>External</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.External
   * @generated
   */
  public Adapter createExternalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Union <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Union
   * @generated
   */
  public Adapter createUnionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.MandatoryNode <em>Mandatory Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.MandatoryNode
   * @generated
   */
  public Adapter createMandatoryNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.OptionalNode <em>Optional Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.OptionalNode
   * @generated
   */
  public Adapter createOptionalNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.ExpressionOperator <em>Expression Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.ExpressionOperator
   * @generated
   */
  public Adapter createExpressionOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.Equality
   * @generated
   */
  public Adapter createEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link trnet.OptionalOperand <em>Optional Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see trnet.OptionalOperand
   * @generated
   */
  public Adapter createOptionalOperandAdapter()
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

} //TrnetAdapterFactory
