/**
 */
package org.gemoc.sample.legacyfsm.fsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decrease Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction#getStepValue <em>Step Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getDecreaseValueAction()
 * @model
 * @generated
 */
public interface DecreaseValueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Step Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Value</em>' attribute.
	 * @see #setStepValue(long)
	 * @see org.gemoc.sample.legacyfsm.fsm.FsmPackage#getDecreaseValueAction_StepValue()
	 * @model required="true"
	 * @generated
	 */
	long getStepValue();

	/**
	 * Sets the value of the '{@link org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction#getStepValue <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Value</em>' attribute.
	 * @see #getStepValue()
	 * @generated
	 */
	void setStepValue(long value);

} // DecreaseValueAction
