/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the Eclipse Public License as published by Eclipse, either
 * version 1.0 of the License, or (at your option) any later version. This
 * program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse Public License for
 * more details. You should have received a copy of the Eclipse Public License
 * along with this program. If not, see
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
package org.osate.ba.aadlba.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.osate.ba.aadlba.* ;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AadlBaFactoryImpl extends EFactoryImpl implements AadlBaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AadlBaFactory init()
  {
    try
    {
      AadlBaFactory theAadlBaFactory = (AadlBaFactory)EPackage.Registry.INSTANCE.getEFactory(AadlBaPackage.eNS_URI);
      if (theAadlBaFactory != null)
      {
        return theAadlBaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AadlBaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AadlBaFactoryImpl()
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
      case AadlBaPackage.ASSIGNMENT_ACTION: return (EObject)createAssignmentAction();
      case AadlBaPackage.ANY: return (EObject)createAny();
      case AadlBaPackage.BEHAVIOR_ACTION_BLOCK: return (EObject)createBehaviorActionBlock();
      case AadlBaPackage.BEHAVIOR_ACTION_SEQUENCE: return (EObject)createBehaviorActionSequence();
      case AadlBaPackage.BEHAVIOR_ACTION_SET: return (EObject)createBehaviorActionSet();
      case AadlBaPackage.BEHAVIOR_ANNEX: return (EObject)createBehaviorAnnex();
      case AadlBaPackage.BEHAVIOR_BOOLEAN_LITERAL: return (EObject)createBehaviorBooleanLiteral();
      case AadlBaPackage.BEHAVIOR_ENUMERATION_LITERAL: return (EObject)createBehaviorEnumerationLiteral();
      case AadlBaPackage.BEHAVIOR_INTEGER_LITERAL: return (EObject)createBehaviorIntegerLiteral();
      case AadlBaPackage.BEHAVIOR_PROPERTY_CONSTANT: return (EObject)createBehaviorPropertyConstant();
      case AadlBaPackage.BEHAVIOR_PROPERTY_VALUE: return (EObject)createBehaviorPropertyValue();
      case AadlBaPackage.BEHAVIOR_REAL_LITERAL: return (EObject)createBehaviorRealLiteral();
      case AadlBaPackage.BEHAVIOR_STATE: return (EObject)createBehaviorState();
      case AadlBaPackage.BEHAVIOR_STRING_LITERAL: return (EObject)createBehaviorStringLiteral();
      case AadlBaPackage.BEHAVIOR_TIME: return (EObject)createBehaviorTime();
      case AadlBaPackage.BEHAVIOR_TRANSITION: return (EObject)createBehaviorTransition();
      case AadlBaPackage.BEHAVIOR_VARIABLE: return (EObject)createBehaviorVariable();
      case AadlBaPackage.BEHAVIOR_VARIABLE_HOLDER: return (EObject)createBehaviorVariableHolder();
      case AadlBaPackage.CALLED_SUBPROGRAM_HOLDER: return (EObject)createCalledSubprogramHolder();
      case AadlBaPackage.COMPLETION_RELATIVE_TIMEOUT: return (EObject)createCompletionRelativeTimeout();
      case AadlBaPackage.DATA_ACCESS_HOLDER: return (EObject)createDataAccessHolder();
      case AadlBaPackage.DATA_ACCESS_PROTOTYPE_HOLDER: return (EObject)createDataAccessPrototypeHolder();
      case AadlBaPackage.DATA_COMPONENT_REFERENCE: return (EObject)createDataComponentReference();
      case AadlBaPackage.DATA_PORT_HOLDER: return (EObject)createDataPortHolder();
      case AadlBaPackage.DATA_SUBCOMPONENT_HOLDER: return (EObject)createDataSubcomponentHolder();
      case AadlBaPackage.DISPATCH_CONDITION: return (EObject)createDispatchCondition();
      case AadlBaPackage.DISPATCH_CONJUNCTION: return (EObject)createDispatchConjunction();
      case AadlBaPackage.DISPATCH_RELATIVE_TIMEOUT: return (EObject)createDispatchRelativeTimeout();
      case AadlBaPackage.DISPATCH_TRIGGER_CONDITION_STOP: return (EObject)createDispatchTriggerConditionStop();
      case AadlBaPackage.DISPATCH_TRIGGER_LOGICAL_EXPRESSION: return (EObject)createDispatchTriggerLogicalExpression();
      case AadlBaPackage.ELSE_STATEMENT: return (EObject)createElseStatement();
      case AadlBaPackage.EVENT_DATA_PORT_HOLDER: return (EObject)createEventDataPortHolder();
      case AadlBaPackage.EVENT_PORT_HOLDER: return (EObject)createEventPortHolder();
      case AadlBaPackage.EXECUTION_TIMEOUT_CATCH: return (EObject)createExecutionTimeoutCatch();
      case AadlBaPackage.FACTOR: return (EObject)createFactor();
      case AadlBaPackage.FEATURE_PROTOTYPE_HOLDER: return (EObject)createFeaturePrototypeHolder();
      case AadlBaPackage.FOR_OR_FOR_ALL_STATEMENT: return (EObject)createForOrForAllStatement();
      case AadlBaPackage.GROUP_HOLDER: return (EObject)createGroupHolder();
      case AadlBaPackage.GROUP_PROTOTYPE_HOLDER: return (EObject)createGroupPrototypeHolder();
      case AadlBaPackage.IF_STATEMENT: return (EObject)createIfStatement();
      case AadlBaPackage.INTEGER_RANGE: return (EObject)createIntegerRange();
      case AadlBaPackage.ITERATIVE_VARIABLE: return (EObject)createIterativeVariable();
      case AadlBaPackage.ITERATIVE_VARIABLE_HOLDER: return (EObject)createIterativeVariableHolder();
      case AadlBaPackage.LOCK_ACTION: return (EObject)createLockAction();
      case AadlBaPackage.OTHERWISE: return (EObject)createOtherwise();
      case AadlBaPackage.PARAMETER_HOLDER: return (EObject)createParameterHolder();
      case AadlBaPackage.PORT_COUNT_VALUE: return (EObject)createPortCountValue();
      case AadlBaPackage.PORT_DEQUEUE_ACTION: return (EObject)createPortDequeueAction();
      case AadlBaPackage.PORT_DEQUEUE_VALUE: return (EObject)createPortDequeueValue();
      case AadlBaPackage.PORT_FREEZE_ACTION: return (EObject)createPortFreezeAction();
      case AadlBaPackage.PORT_FRESH_VALUE: return (EObject)createPortFreshValue();
      case AadlBaPackage.PORT_PROTOTYPE_HOLDER: return (EObject)createPortPrototypeHolder();
      case AadlBaPackage.PORT_SEND_ACTION: return (EObject)createPortSendAction();
      case AadlBaPackage.RELATION: return (EObject)createRelation();
      case AadlBaPackage.SIMPLE_EXPRESSION: return (EObject)createSimpleExpression();
      case AadlBaPackage.STRUCT_UNION_ELEMENT: return (EObject)createStructUnionElement();
      case AadlBaPackage.STRUCT_UNION_ELEMENT_HOLDER: return (EObject)createStructUnionElementHolder();
      case AadlBaPackage.SUBPROGRAM_ACCESS_HOLDER: return (EObject)createSubprogramAccessHolder();
      case AadlBaPackage.SUBPROGRAM_CALL_ACTION: return (EObject)createSubprogramCallAction();
      case AadlBaPackage.SUBPROGRAM_HOLDER: return (EObject)createSubprogramHolder();
      case AadlBaPackage.SUBPROGRAM_PROTOTYPE_HOLDER: return (EObject)createSubprogramPrototypeHolder();
      case AadlBaPackage.TARGET: return (EObject)createTarget();
      case AadlBaPackage.TERM: return (EObject)createTerm();
      case AadlBaPackage.TIMED_ACTION: return (EObject)createTimedAction();
      case AadlBaPackage.UNLOCK_ACTION: return (EObject)createUnlockAction();
      case AadlBaPackage.VALUE_EXPRESSION: return (EObject)createValueExpression();
      case AadlBaPackage.WHILE_OR_DO_UNTIL_STATEMENT: return (EObject)createWhileOrDoUntilStatement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AadlBaPackage.BEHAVIOR_FEATURE_TYPE:
        return createBehaviorFeatureTypeFromString(eDataType, initialValue);
      case AadlBaPackage.BINARY_ADDING_OPERATOR:
        return createBinaryAddingOperatorFromString(eDataType, initialValue);
      case AadlBaPackage.BINARY_NUMERIC_OPERATOR:
        return createBinaryNumericOperatorFromString(eDataType, initialValue);
      case AadlBaPackage.DATA_REPRESENTATION:
        return createDataRepresentationFromString(eDataType, initialValue);
      case AadlBaPackage.FEATURE_TYPE:
        return createFeatureTypeFromString(eDataType, initialValue);
      case AadlBaPackage.LOGICAL_OPERATOR:
        return createLogicalOperatorFromString(eDataType, initialValue);
      case AadlBaPackage.MULTIPLYING_OPERATOR:
        return createMultiplyingOperatorFromString(eDataType, initialValue);
      case AadlBaPackage.RELATIONAL_OPERATOR:
        return createRelationalOperatorFromString(eDataType, initialValue);
      case AadlBaPackage.UNARY_ADDING_OPERATOR:
        return createUnaryAddingOperatorFromString(eDataType, initialValue);
      case AadlBaPackage.UNARY_BOOLEAN_OPERATOR:
        return createUnaryBooleanOperatorFromString(eDataType, initialValue);
      case AadlBaPackage.UNARY_NUMERIC_OPERATOR:
        return createUnaryNumericOperatorFromString(eDataType, initialValue);
      case AadlBaPackage.BOOLEAN:
        return createBooleanFromString(eDataType, initialValue);
      case AadlBaPackage.INTEGER:
        return createIntegerFromString(eDataType, initialValue);
      case AadlBaPackage.REAL:
        return createRealFromString(eDataType, initialValue);
      case AadlBaPackage.STRING:
        return createStringFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AadlBaPackage.BEHAVIOR_FEATURE_TYPE:
        return convertBehaviorFeatureTypeToString(eDataType, instanceValue);
      case AadlBaPackage.BINARY_ADDING_OPERATOR:
        return convertBinaryAddingOperatorToString(eDataType, instanceValue);
      case AadlBaPackage.BINARY_NUMERIC_OPERATOR:
        return convertBinaryNumericOperatorToString(eDataType, instanceValue);
      case AadlBaPackage.DATA_REPRESENTATION:
        return convertDataRepresentationToString(eDataType, instanceValue);
      case AadlBaPackage.FEATURE_TYPE:
        return convertFeatureTypeToString(eDataType, instanceValue);
      case AadlBaPackage.LOGICAL_OPERATOR:
        return convertLogicalOperatorToString(eDataType, instanceValue);
      case AadlBaPackage.MULTIPLYING_OPERATOR:
        return convertMultiplyingOperatorToString(eDataType, instanceValue);
      case AadlBaPackage.RELATIONAL_OPERATOR:
        return convertRelationalOperatorToString(eDataType, instanceValue);
      case AadlBaPackage.UNARY_ADDING_OPERATOR:
        return convertUnaryAddingOperatorToString(eDataType, instanceValue);
      case AadlBaPackage.UNARY_BOOLEAN_OPERATOR:
        return convertUnaryBooleanOperatorToString(eDataType, instanceValue);
      case AadlBaPackage.UNARY_NUMERIC_OPERATOR:
        return convertUnaryNumericOperatorToString(eDataType, instanceValue);
      case AadlBaPackage.BOOLEAN:
        return convertBooleanToString(eDataType, instanceValue);
      case AadlBaPackage.INTEGER:
        return convertIntegerToString(eDataType, instanceValue);
      case AadlBaPackage.REAL:
        return convertRealToString(eDataType, instanceValue);
      case AadlBaPackage.STRING:
        return convertStringToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentAction createAssignmentAction()
  {
    AssignmentActionImpl assignmentAction = new AssignmentActionImpl();
    return assignmentAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Any createAny()
  {
    AnyImpl any = new AnyImpl();
    return any;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorActionBlock createBehaviorActionBlock()
  {
    BehaviorActionBlockImpl behaviorActionBlock = new BehaviorActionBlockImpl();
    return behaviorActionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorActionSequence createBehaviorActionSequence()
  {
    BehaviorActionSequenceImpl behaviorActionSequence = new BehaviorActionSequenceImpl();
    return behaviorActionSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorActionSet createBehaviorActionSet()
  {
    BehaviorActionSetImpl behaviorActionSet = new BehaviorActionSetImpl();
    return behaviorActionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorAnnex createBehaviorAnnex()
  {
    BehaviorAnnexImpl behaviorAnnex = new BehaviorAnnexImpl();
    return behaviorAnnex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorBooleanLiteral createBehaviorBooleanLiteral()
  {
    BehaviorBooleanLiteralImpl behaviorBooleanLiteral = new BehaviorBooleanLiteralImpl();
    return behaviorBooleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorEnumerationLiteral createBehaviorEnumerationLiteral()
  {
    BehaviorEnumerationLiteralImpl behaviorEnumerationLiteral = new BehaviorEnumerationLiteralImpl();
    return behaviorEnumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorIntegerLiteral createBehaviorIntegerLiteral()
  {
    BehaviorIntegerLiteralImpl behaviorIntegerLiteral = new BehaviorIntegerLiteralImpl();
    return behaviorIntegerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorPropertyConstant createBehaviorPropertyConstant()
  {
    BehaviorPropertyConstantImpl behaviorPropertyConstant = new BehaviorPropertyConstantImpl();
    return behaviorPropertyConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorPropertyValue createBehaviorPropertyValue()
  {
    BehaviorPropertyValueImpl behaviorPropertyValue = new BehaviorPropertyValueImpl();
    return behaviorPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorRealLiteral createBehaviorRealLiteral()
  {
    BehaviorRealLiteralImpl behaviorRealLiteral = new BehaviorRealLiteralImpl();
    return behaviorRealLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorState createBehaviorState()
  {
    BehaviorStateImpl behaviorState = new BehaviorStateImpl();
    return behaviorState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorStringLiteral createBehaviorStringLiteral()
  {
    BehaviorStringLiteralImpl behaviorStringLiteral = new BehaviorStringLiteralImpl();
    return behaviorStringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorTime createBehaviorTime()
  {
    BehaviorTimeImpl behaviorTime = new BehaviorTimeImpl();
    return behaviorTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorTransition createBehaviorTransition()
  {
    BehaviorTransitionImpl behaviorTransition = new BehaviorTransitionImpl();
    return behaviorTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorVariable createBehaviorVariable()
  {
    BehaviorVariableImpl behaviorVariable = new BehaviorVariableImpl();
    return behaviorVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorVariableHolder createBehaviorVariableHolder()
  {
    BehaviorVariableHolderImpl behaviorVariableHolder = new BehaviorVariableHolderImpl();
    return behaviorVariableHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CalledSubprogramHolder createCalledSubprogramHolder()
  {
    CalledSubprogramHolderImpl calledSubprogramHolder = new CalledSubprogramHolderImpl();
    return calledSubprogramHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompletionRelativeTimeout createCompletionRelativeTimeout()
  {
    CompletionRelativeTimeoutImpl completionRelativeTimeout = new CompletionRelativeTimeoutImpl();
    return completionRelativeTimeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAccessHolder createDataAccessHolder()
  {
    DataAccessHolderImpl dataAccessHolder = new DataAccessHolderImpl();
    return dataAccessHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAccessPrototypeHolder createDataAccessPrototypeHolder()
  {
    DataAccessPrototypeHolderImpl dataAccessPrototypeHolder = new DataAccessPrototypeHolderImpl();
    return dataAccessPrototypeHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataComponentReference createDataComponentReference()
  {
    DataComponentReferenceImpl dataComponentReference = new DataComponentReferenceImpl();
    return dataComponentReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPortHolder createDataPortHolder()
  {
    DataPortHolderImpl dataPortHolder = new DataPortHolderImpl();
    return dataPortHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSubcomponentHolder createDataSubcomponentHolder()
  {
    DataSubcomponentHolderImpl dataSubcomponentHolder = new DataSubcomponentHolderImpl();
    return dataSubcomponentHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DispatchCondition createDispatchCondition()
  {
    DispatchConditionImpl dispatchCondition = new DispatchConditionImpl();
    return dispatchCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DispatchConjunction createDispatchConjunction()
  {
    DispatchConjunctionImpl dispatchConjunction = new DispatchConjunctionImpl();
    return dispatchConjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DispatchRelativeTimeout createDispatchRelativeTimeout()
  {
    DispatchRelativeTimeoutImpl dispatchRelativeTimeout = new DispatchRelativeTimeoutImpl();
    return dispatchRelativeTimeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DispatchTriggerConditionStop createDispatchTriggerConditionStop()
  {
    DispatchTriggerConditionStopImpl dispatchTriggerConditionStop = new DispatchTriggerConditionStopImpl();
    return dispatchTriggerConditionStop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DispatchTriggerLogicalExpression createDispatchTriggerLogicalExpression()
  {
    DispatchTriggerLogicalExpressionImpl dispatchTriggerLogicalExpression = new DispatchTriggerLogicalExpressionImpl();
    return dispatchTriggerLogicalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseStatement createElseStatement()
  {
    ElseStatementImpl elseStatement = new ElseStatementImpl();
    return elseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDataPortHolder createEventDataPortHolder()
  {
    EventDataPortHolderImpl eventDataPortHolder = new EventDataPortHolderImpl();
    return eventDataPortHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventPortHolder createEventPortHolder()
  {
    EventPortHolderImpl eventPortHolder = new EventPortHolderImpl();
    return eventPortHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutionTimeoutCatch createExecutionTimeoutCatch()
  {
    ExecutionTimeoutCatchImpl executionTimeoutCatch = new ExecutionTimeoutCatchImpl();
    return executionTimeoutCatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor createFactor()
  {
    FactorImpl factor = new FactorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeaturePrototypeHolder createFeaturePrototypeHolder()
  {
    FeaturePrototypeHolderImpl featurePrototypeHolder = new FeaturePrototypeHolderImpl();
    return featurePrototypeHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForOrForAllStatement createForOrForAllStatement()
  {
    ForOrForAllStatementImpl forOrForAllStatement = new ForOrForAllStatementImpl();
    return forOrForAllStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupHolder createGroupHolder()
  {
    GroupHolderImpl groupHolder = new GroupHolderImpl();
    return groupHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupPrototypeHolder createGroupPrototypeHolder()
  {
    GroupPrototypeHolderImpl groupPrototypeHolder = new GroupPrototypeHolderImpl();
    return groupPrototypeHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerRange createIntegerRange()
  {
    IntegerRangeImpl integerRange = new IntegerRangeImpl();
    return integerRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterativeVariable createIterativeVariable()
  {
    IterativeVariableImpl iterativeVariable = new IterativeVariableImpl();
    return iterativeVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterativeVariableHolder createIterativeVariableHolder()
  {
    IterativeVariableHolderImpl iterativeVariableHolder = new IterativeVariableHolderImpl();
    return iterativeVariableHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LockAction createLockAction()
  {
    LockActionImpl lockAction = new LockActionImpl();
    return lockAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Otherwise createOtherwise()
  {
    OtherwiseImpl otherwise = new OtherwiseImpl();
    return otherwise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterHolder createParameterHolder()
  {
    ParameterHolderImpl parameterHolder = new ParameterHolderImpl();
    return parameterHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortCountValue createPortCountValue()
  {
    PortCountValueImpl portCountValue = new PortCountValueImpl();
    return portCountValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortDequeueAction createPortDequeueAction()
  {
    PortDequeueActionImpl portDequeueAction = new PortDequeueActionImpl();
    return portDequeueAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortDequeueValue createPortDequeueValue()
  {
    PortDequeueValueImpl portDequeueValue = new PortDequeueValueImpl();
    return portDequeueValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortFreezeAction createPortFreezeAction()
  {
    PortFreezeActionImpl portFreezeAction = new PortFreezeActionImpl();
    return portFreezeAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortFreshValue createPortFreshValue()
  {
    PortFreshValueImpl portFreshValue = new PortFreshValueImpl();
    return portFreshValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortPrototypeHolder createPortPrototypeHolder()
  {
    PortPrototypeHolderImpl portPrototypeHolder = new PortPrototypeHolderImpl();
    return portPrototypeHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortSendAction createPortSendAction()
  {
    PortSendActionImpl portSendAction = new PortSendActionImpl();
    return portSendAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructUnionElement createStructUnionElement()
  {
    StructUnionElementImpl structUnionElement = new StructUnionElementImpl();
    return structUnionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructUnionElementHolder createStructUnionElementHolder()
  {
    StructUnionElementHolderImpl structUnionElementHolder = new StructUnionElementHolderImpl();
    return structUnionElementHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramAccessHolder createSubprogramAccessHolder()
  {
    SubprogramAccessHolderImpl subprogramAccessHolder = new SubprogramAccessHolderImpl();
    return subprogramAccessHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramCallAction createSubprogramCallAction()
  {
    SubprogramCallActionImpl subprogramCallAction = new SubprogramCallActionImpl();
    return subprogramCallAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramHolder createSubprogramHolder()
  {
    SubprogramHolderImpl subprogramHolder = new SubprogramHolderImpl();
    return subprogramHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprogramPrototypeHolder createSubprogramPrototypeHolder()
  {
    SubprogramPrototypeHolderImpl subprogramPrototypeHolder = new SubprogramPrototypeHolderImpl();
    return subprogramPrototypeHolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target createTarget()
  {
    TargetImpl target = new TargetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimedAction createTimedAction()
  {
    TimedActionImpl timedAction = new TimedActionImpl();
    return timedAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnlockAction createUnlockAction()
  {
    UnlockActionImpl unlockAction = new UnlockActionImpl();
    return unlockAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression createValueExpression()
  {
    ValueExpressionImpl valueExpression = new ValueExpressionImpl();
    return valueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileOrDoUntilStatement createWhileOrDoUntilStatement()
  {
    WhileOrDoUntilStatementImpl whileOrDoUntilStatement = new WhileOrDoUntilStatementImpl();
    return whileOrDoUntilStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorFeatureType createBehaviorFeatureTypeFromString(EDataType eDataType, String initialValue)
  {
    BehaviorFeatureType result = BehaviorFeatureType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBehaviorFeatureTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryAddingOperator createBinaryAddingOperatorFromString(EDataType eDataType, String initialValue)
  {
    BinaryAddingOperator result = BinaryAddingOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryAddingOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryNumericOperator createBinaryNumericOperatorFromString(EDataType eDataType, String initialValue)
  {
    BinaryNumericOperator result = BinaryNumericOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryNumericOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataRepresentation createDataRepresentationFromString(EDataType eDataType, String initialValue)
  {
    DataRepresentation result = DataRepresentation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataRepresentationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureType createFeatureTypeFromString(EDataType eDataType, String initialValue)
  {
    FeatureType result = FeatureType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFeatureTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue)
  {
    LogicalOperator result = LogicalOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplyingOperator createMultiplyingOperatorFromString(EDataType eDataType, String initialValue)
  {
    MultiplyingOperator result = MultiplyingOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMultiplyingOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue)
  {
    RelationalOperator result = RelationalOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryAddingOperator createUnaryAddingOperatorFromString(EDataType eDataType, String initialValue)
  {
    UnaryAddingOperator result = UnaryAddingOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryAddingOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryBooleanOperator createUnaryBooleanOperatorFromString(EDataType eDataType, String initialValue)
  {
    UnaryBooleanOperator result = UnaryBooleanOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryBooleanOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryNumericOperator createUnaryNumericOperatorFromString(EDataType eDataType, String initialValue)
  {
    UnaryNumericOperator result = UnaryNumericOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryNumericOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean createBooleanFromString(EDataType eDataType, String initialValue)
  {
    return (Boolean)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer createIntegerFromString(EDataType eDataType, String initialValue)
  {
    return (Integer)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIntegerToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Double createRealFromString(EDataType eDataType, String initialValue)
  {
    return (Double)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRealToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createStringFromString(EDataType eDataType, String initialValue)
  {
    return (String)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStringToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AadlBaPackage getAadlBaPackage()
  {
    return (AadlBaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AadlBaPackage getPackage()
  {
    return AadlBaPackage.eINSTANCE;
  }

} //AadlBaFactoryImpl
