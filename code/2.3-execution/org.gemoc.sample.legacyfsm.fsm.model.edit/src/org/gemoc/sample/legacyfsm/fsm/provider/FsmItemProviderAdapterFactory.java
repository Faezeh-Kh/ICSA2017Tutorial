/**
 */
package org.gemoc.sample.legacyfsm.fsm.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.gemoc.sample.legacyfsm.fsm.util.FsmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmItemProviderAdapterFactory extends FsmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.StateMachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineItemProvider stateMachineItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateMachineAdapter() {
		if (stateMachineItemProvider == null) {
			stateMachineItemProvider = new StateMachineItemProvider(this);
		}

		return stateMachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.NumberVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberVariableItemProvider numberVariableItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.NumberVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberVariableAdapter() {
		if (numberVariableItemProvider == null) {
			numberVariableItemProvider = new NumberVariableItemProvider(this);
		}

		return numberVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.EqualNumberGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualNumberGuardItemProvider equalNumberGuardItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.EqualNumberGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualNumberGuardAdapter() {
		if (equalNumberGuardItemProvider == null) {
			equalNumberGuardItemProvider = new EqualNumberGuardItemProvider(this);
		}

		return equalNumberGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.AssignValueAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignValueActionItemProvider assignValueActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.AssignValueAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignValueActionAdapter() {
		if (assignValueActionItemProvider == null) {
			assignValueActionItemProvider = new AssignValueActionItemProvider(this);
		}

		return assignValueActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.LessThanNumberGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanNumberGuardItemProvider lessThanNumberGuardItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.LessThanNumberGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLessThanNumberGuardAdapter() {
		if (lessThanNumberGuardItemProvider == null) {
			lessThanNumberGuardItemProvider = new LessThanNumberGuardItemProvider(this);
		}

		return lessThanNumberGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.GreaterThanNumberGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterThanNumberGuardItemProvider greaterThanNumberGuardItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.GreaterThanNumberGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGreaterThanNumberGuardAdapter() {
		if (greaterThanNumberGuardItemProvider == null) {
			greaterThanNumberGuardItemProvider = new GreaterThanNumberGuardItemProvider(this);
		}

		return greaterThanNumberGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.IncreaseValueAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncreaseValueActionItemProvider increaseValueActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.IncreaseValueAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIncreaseValueActionAdapter() {
		if (increaseValueActionItemProvider == null) {
			increaseValueActionItemProvider = new IncreaseValueActionItemProvider(this);
		}

		return increaseValueActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecreaseValueActionItemProvider decreaseValueActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.gemoc.sample.legacyfsm.fsm.DecreaseValueAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecreaseValueActionAdapter() {
		if (decreaseValueActionItemProvider == null) {
			decreaseValueActionItemProvider = new DecreaseValueActionItemProvider(this);
		}

		return decreaseValueActionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (stateMachineItemProvider != null) stateMachineItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (numberVariableItemProvider != null) numberVariableItemProvider.dispose();
		if (equalNumberGuardItemProvider != null) equalNumberGuardItemProvider.dispose();
		if (assignValueActionItemProvider != null) assignValueActionItemProvider.dispose();
		if (lessThanNumberGuardItemProvider != null) lessThanNumberGuardItemProvider.dispose();
		if (greaterThanNumberGuardItemProvider != null) greaterThanNumberGuardItemProvider.dispose();
		if (increaseValueActionItemProvider != null) increaseValueActionItemProvider.dispose();
		if (decreaseValueActionItemProvider != null) decreaseValueActionItemProvider.dispose();
	}

}
