/**
 */
package fsmTrace.States.fsm;

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
 * @see fsmTrace.States.fsm.FsmFactory
 * @model kind="package"
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
	String eNS_URI = "fsmTrace_fsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FsmPackage eINSTANCE = fsmTrace.States.fsm.impl.FsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fsmTrace.States.fsm.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.fsm.impl.TracedNamedElementImpl
	 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedNamedElement()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.fsm.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.fsm.impl.TracedVariableImpl
	 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedVariable()
	 * @generated
	 */
	int TRACED_VARIABLE = 5;

	/**
	 * The number of structural features of the '<em>Traced Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fsmTrace.States.fsm.impl.TracedNumberVariableImpl <em>Traced Number Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.fsm.impl.TracedNumberVariableImpl
	 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedNumberVariable()
	 * @generated
	 */
	int TRACED_NUMBER_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NUMBER_VARIABLE__ORIGINAL_OBJECT = TRACED_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NUMBER_VARIABLE__VALUE_SEQUENCE = TRACED_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Number Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NUMBER_VARIABLE_FEATURE_COUNT = TRACED_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fsmTrace.States.fsm.impl.TracedStateImpl <em>Traced State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.fsm.impl.TracedStateImpl
	 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedState()
	 * @generated
	 */
	int TRACED_STATE = 2;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fsmTrace.States.fsm.impl.TracedStateMachineImpl <em>Traced State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.fsm.impl.TracedStateMachineImpl
	 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedStateMachine()
	 * @generated
	 */
	int TRACED_STATE_MACHINE = 3;

	/**
	 * The feature id for the '<em><b>Current State Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_MACHINE__CURRENT_STATE_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_MACHINE__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_STATE_MACHINE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fsmTrace.States.fsm.impl.TracedTransitionImpl <em>Traced Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fsmTrace.States.fsm.impl.TracedTransitionImpl
	 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedTransition()
	 * @generated
	 */
	int TRACED_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSITION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fsmTrace.States.fsm.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element</em>'.
	 * @see fsmTrace.States.fsm.TracedNamedElement
	 * @generated
	 */
	EClass getTracedNamedElement();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.fsm.TracedNumberVariable <em>Traced Number Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Number Variable</em>'.
	 * @see fsmTrace.States.fsm.TracedNumberVariable
	 * @generated
	 */
	EClass getTracedNumberVariable();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.States.fsm.TracedNumberVariable#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see fsmTrace.States.fsm.TracedNumberVariable#getOriginalObject()
	 * @see #getTracedNumberVariable()
	 * @generated
	 */
	EReference getTracedNumberVariable_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.States.fsm.TracedNumberVariable#getValueSequence <em>Value Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Sequence</em>'.
	 * @see fsmTrace.States.fsm.TracedNumberVariable#getValueSequence()
	 * @see #getTracedNumberVariable()
	 * @generated
	 */
	EReference getTracedNumberVariable_ValueSequence();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.fsm.TracedState <em>Traced State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced State</em>'.
	 * @see fsmTrace.States.fsm.TracedState
	 * @generated
	 */
	EClass getTracedState();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.States.fsm.TracedState#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see fsmTrace.States.fsm.TracedState#getOriginalObject()
	 * @see #getTracedState()
	 * @generated
	 */
	EReference getTracedState_OriginalObject();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.fsm.TracedStateMachine <em>Traced State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced State Machine</em>'.
	 * @see fsmTrace.States.fsm.TracedStateMachine
	 * @generated
	 */
	EClass getTracedStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link fsmTrace.States.fsm.TracedStateMachine#getCurrentStateSequence <em>Current State Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current State Sequence</em>'.
	 * @see fsmTrace.States.fsm.TracedStateMachine#getCurrentStateSequence()
	 * @see #getTracedStateMachine()
	 * @generated
	 */
	EReference getTracedStateMachine_CurrentStateSequence();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.States.fsm.TracedStateMachine#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see fsmTrace.States.fsm.TracedStateMachine#getOriginalObject()
	 * @see #getTracedStateMachine()
	 * @generated
	 */
	EReference getTracedStateMachine_OriginalObject();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.fsm.TracedTransition <em>Traced Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Transition</em>'.
	 * @see fsmTrace.States.fsm.TracedTransition
	 * @generated
	 */
	EClass getTracedTransition();

	/**
	 * Returns the meta object for the reference '{@link fsmTrace.States.fsm.TracedTransition#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see fsmTrace.States.fsm.TracedTransition#getOriginalObject()
	 * @see #getTracedTransition()
	 * @generated
	 */
	EReference getTracedTransition_OriginalObject();

	/**
	 * Returns the meta object for class '{@link fsmTrace.States.fsm.TracedVariable <em>Traced Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Variable</em>'.
	 * @see fsmTrace.States.fsm.TracedVariable
	 * @generated
	 */
	EClass getTracedVariable();

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
		 * The meta object literal for the '{@link fsmTrace.States.fsm.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.fsm.impl.TracedNamedElementImpl
		 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedNamedElement()
		 * @generated
		 */
		EClass TRACED_NAMED_ELEMENT = eINSTANCE.getTracedNamedElement();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.fsm.impl.TracedNumberVariableImpl <em>Traced Number Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.fsm.impl.TracedNumberVariableImpl
		 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedNumberVariable()
		 * @generated
		 */
		EClass TRACED_NUMBER_VARIABLE = eINSTANCE.getTracedNumberVariable();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_NUMBER_VARIABLE__ORIGINAL_OBJECT = eINSTANCE.getTracedNumberVariable_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Value Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_NUMBER_VARIABLE__VALUE_SEQUENCE = eINSTANCE.getTracedNumberVariable_ValueSequence();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.fsm.impl.TracedStateImpl <em>Traced State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.fsm.impl.TracedStateImpl
		 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedState()
		 * @generated
		 */
		EClass TRACED_STATE = eINSTANCE.getTracedState();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_STATE__ORIGINAL_OBJECT = eINSTANCE.getTracedState_OriginalObject();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.fsm.impl.TracedStateMachineImpl <em>Traced State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.fsm.impl.TracedStateMachineImpl
		 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedStateMachine()
		 * @generated
		 */
		EClass TRACED_STATE_MACHINE = eINSTANCE.getTracedStateMachine();

		/**
		 * The meta object literal for the '<em><b>Current State Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_STATE_MACHINE__CURRENT_STATE_SEQUENCE = eINSTANCE.getTracedStateMachine_CurrentStateSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_STATE_MACHINE__ORIGINAL_OBJECT = eINSTANCE.getTracedStateMachine_OriginalObject();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.fsm.impl.TracedTransitionImpl <em>Traced Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.fsm.impl.TracedTransitionImpl
		 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedTransition()
		 * @generated
		 */
		EClass TRACED_TRANSITION = eINSTANCE.getTracedTransition();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSITION__ORIGINAL_OBJECT = eINSTANCE.getTracedTransition_OriginalObject();

		/**
		 * The meta object literal for the '{@link fsmTrace.States.fsm.impl.TracedVariableImpl <em>Traced Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fsmTrace.States.fsm.impl.TracedVariableImpl
		 * @see fsmTrace.States.fsm.impl.FsmPackageImpl#getTracedVariable()
		 * @generated
		 */
		EClass TRACED_VARIABLE = eINSTANCE.getTracedVariable();

	}

} //FsmPackage
