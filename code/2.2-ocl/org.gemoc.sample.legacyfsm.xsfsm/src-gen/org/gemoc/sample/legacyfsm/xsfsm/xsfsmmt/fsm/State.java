/**
 */
package org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TutorialSect24'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TutorialSect24='Tuple {\n\tmessage : String = \'State has non-deterministic outgoing transitions\',\n\tstatus : Boolean = \n            self.outgoingTransitions->forAll(t1, t2 | (t1 <> t2 and t1.guard=null) implies t2.guard <> null)\n}.status'"
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(StateMachine)
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage#getState_OwningFSM()
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.StateMachine#getOwnedStates
	 * @model opposite="ownedStates" required="true" transient="false"
	 * @generated
	 */
	StateMachine getOwningFSM();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.State#getOwningFSM <em>Owning FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning FSM</em>' container reference.
	 * @see #getOwningFSM()
	 * @generated
	 */
	void setOwningFSM(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage#getState_OutgoingTransitions()
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.FsmPackage#getState_IncomingTransitions()
	 * @see org.gemoc.sample.legacyfsm.xsfsm.xsfsmmt.fsm.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

} // State
