/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm;

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
 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface FsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt/fsm/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmPackage eINSTANCE = org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NamedElementImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.StateMachineImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_STATES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INITIAL_STATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CURRENT_STATE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unprocessed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__UNPROCESSED_STRING = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Consummed String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CONSUMMED_STRING = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Produced String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PRODUCED_STRING = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.StateImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.TransitionImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.VariableImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberVariableImpl <em>Number Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberVariableImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getNumberVariable()
	 * @generated
	 */
	int NUMBER_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.GuardImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 6;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NOT = 0;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberGuardImpl <em>Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberGuardImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getNumberGuard()
	 * @generated
	 */
	int NUMBER_GUARD = 7;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__NOT = GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__VALUE = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD__SOURCE = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.EqualNumberGuardImpl <em>Equal Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.EqualNumberGuardImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getEqualNumberGuard()
	 * @generated
	 */
	int EQUAL_NUMBER_GUARD = 8;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_NUMBER_GUARD__NOT = NUMBER_GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_NUMBER_GUARD__VALUE = NUMBER_GUARD__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_NUMBER_GUARD__SOURCE = NUMBER_GUARD__SOURCE;

	/**
	 * The number of structural features of the '<em>Equal Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_NUMBER_GUARD_FEATURE_COUNT = NUMBER_GUARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.ActionImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberActionImpl <em>Number Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberActionImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getNumberAction()
	 * @generated
	 */
	int NUMBER_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ACTION__VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ACTION__TARGET = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ACTION__EXPRESSION = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.LessThanNumberGuardImpl <em>Less Than Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.LessThanNumberGuardImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getLessThanNumberGuard()
	 * @generated
	 */
	int LESS_THAN_NUMBER_GUARD = 11;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_NUMBER_GUARD__NOT = NUMBER_GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_NUMBER_GUARD__VALUE = NUMBER_GUARD__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_NUMBER_GUARD__SOURCE = NUMBER_GUARD__SOURCE;

	/**
	 * The number of structural features of the '<em>Less Than Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_NUMBER_GUARD_FEATURE_COUNT = NUMBER_GUARD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.GreaterThanNumberGuardImpl <em>Greater Than Number Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.GreaterThanNumberGuardImpl
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getGreaterThanNumberGuard()
	 * @generated
	 */
	int GREATER_THAN_NUMBER_GUARD = 12;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_NUMBER_GUARD__NOT = NUMBER_GUARD__NOT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_NUMBER_GUARD__VALUE = NUMBER_GUARD__VALUE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_NUMBER_GUARD__SOURCE = NUMBER_GUARD__SOURCE;

	/**
	 * The number of structural features of the '<em>Greater Than Number Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_NUMBER_GUARD_FEATURE_COUNT = NUMBER_GUARD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned States</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getOwnedStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_OwnedStates();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getInitialState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getOwnedTransitions <em>Owned Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Transitions</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getOwnedTransitions()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_OwnedTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getVariables()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Variables();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getCurrentState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_CurrentState();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getUnprocessedString <em>Unprocessed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unprocessed String</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getUnprocessedString()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_UnprocessedString();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getConsummedString <em>Consummed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consummed String</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getConsummedString()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_ConsummedString();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getProducedString <em>Produced String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produced String</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getProducedString()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_ProducedString();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning FSM</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Output();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable <em>Number Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Variable</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable
	 * @generated
	 */
	EClass getNumberVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable#getInitialValue()
	 * @see #getNumberVariable()
	 * @generated
	 */
	EAttribute getNumberVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberVariable#getValue()
	 * @see #getNumberVariable()
	 * @generated
	 */
	EAttribute getNumberVariable_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Guard#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Guard#isNot()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Not();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberGuard <em>Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Guard</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberGuard
	 * @generated
	 */
	EClass getNumberGuard();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberGuard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberGuard#getValue()
	 * @see #getNumberGuard()
	 * @generated
	 */
	EAttribute getNumberGuard_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberGuard#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberGuard#getSource()
	 * @see #getNumberGuard()
	 * @generated
	 */
	EReference getNumberGuard_Source();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.EqualNumberGuard <em>Equal Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Number Guard</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.EqualNumberGuard
	 * @generated
	 */
	EClass getEqualNumberGuard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberAction <em>Number Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Action</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberAction
	 * @generated
	 */
	EClass getNumberAction();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberAction#getValue()
	 * @see #getNumberAction()
	 * @generated
	 */
	EAttribute getNumberAction_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberAction#getTarget()
	 * @see #getNumberAction()
	 * @generated
	 */
	EReference getNumberAction_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberAction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.NumberAction#getExpression()
	 * @see #getNumberAction()
	 * @generated
	 */
	EAttribute getNumberAction_Expression();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.LessThanNumberGuard <em>Less Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Number Guard</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.LessThanNumberGuard
	 * @generated
	 */
	EClass getLessThanNumberGuard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.GreaterThanNumberGuard <em>Greater Than Number Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Number Guard</em>'.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.GreaterThanNumberGuard
	 * @generated
	 */
	EClass getGreaterThanNumberGuard();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FsmFactory getFsmFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.StateMachineImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__OWNED_STATES = eINSTANCE.getStateMachine_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__INITIAL_STATE = eINSTANCE.getStateMachine_InitialState();

		/**
		 * The meta object literal for the '<em><b>Owned Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__OWNED_TRANSITIONS = eINSTANCE.getStateMachine_OwnedTransitions();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__VARIABLES = eINSTANCE.getStateMachine_Variables();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__CURRENT_STATE = eINSTANCE.getStateMachine_CurrentState();

		/**
		 * The meta object literal for the '<em><b>Unprocessed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__UNPROCESSED_STRING = eINSTANCE.getStateMachine_UnprocessedString();

		/**
		 * The meta object literal for the '<em><b>Consummed String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__CONSUMMED_STRING = eINSTANCE.getStateMachine_ConsummedString();

		/**
		 * The meta object literal for the '<em><b>Produced String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__PRODUCED_STRING = eINSTANCE.getStateMachine_ProducedString();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.StateImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.TransitionImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NamedElementImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.VariableImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberVariableImpl <em>Number Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberVariableImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getNumberVariable()
		 * @generated
		 */
		EClass NUMBER_VARIABLE = eINSTANCE.getNumberVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VARIABLE__INITIAL_VALUE = eINSTANCE.getNumberVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VARIABLE__VALUE = eINSTANCE.getNumberVariable_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.GuardImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__NOT = eINSTANCE.getGuard_Not();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberGuardImpl <em>Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberGuardImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getNumberGuard()
		 * @generated
		 */
		EClass NUMBER_GUARD = eINSTANCE.getNumberGuard();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_GUARD__VALUE = eINSTANCE.getNumberGuard_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_GUARD__SOURCE = eINSTANCE.getNumberGuard_Source();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.EqualNumberGuardImpl <em>Equal Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.EqualNumberGuardImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getEqualNumberGuard()
		 * @generated
		 */
		EClass EQUAL_NUMBER_GUARD = eINSTANCE.getEqualNumberGuard();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.ActionImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberActionImpl <em>Number Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.NumberActionImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getNumberAction()
		 * @generated
		 */
		EClass NUMBER_ACTION = eINSTANCE.getNumberAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ACTION__VALUE = eINSTANCE.getNumberAction_Value();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_ACTION__TARGET = eINSTANCE.getNumberAction_Target();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ACTION__EXPRESSION = eINSTANCE.getNumberAction_Expression();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.LessThanNumberGuardImpl <em>Less Than Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.LessThanNumberGuardImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getLessThanNumberGuard()
		 * @generated
		 */
		EClass LESS_THAN_NUMBER_GUARD = eINSTANCE.getLessThanNumberGuard();

		/**
		 * The meta object literal for the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.GreaterThanNumberGuardImpl <em>Greater Than Number Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.GreaterThanNumberGuardImpl
		 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.impl.FsmPackageImpl#getGreaterThanNumberGuard()
		 * @generated
		 */
		EClass GREATER_THAN_NUMBER_GUARD = eINSTANCE.getGreaterThanNumberGuard();

	}

} //FsmPackage