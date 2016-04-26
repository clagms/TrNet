/**
 */
package minuml1.impl;

import java.util.Collection;

import minuml1.Minuml1Package;
import minuml1.Partition;
import minuml1.RootActivityGraph;
import minuml1.State;
import minuml1.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link minuml1.impl.RootActivityGraphImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link minuml1.impl.RootActivityGraphImpl#getTop <em>Top</em>}</li>
 *   <li>{@link minuml1.impl.RootActivityGraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link minuml1.impl.RootActivityGraphImpl#getPartition <em>Partition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootActivityGraphImpl extends MinimalEObjectImpl.Container implements RootActivityGraph {
	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected State top;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<Partition> partition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootActivityGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Minuml1Package.Literals.ROOT_ACTIVITY_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, Minuml1Package.ROOT_ACTIVITY_GRAPH__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTop(State newTop, NotificationChain msgs) {
		State oldTop = top;
		top = newTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Minuml1Package.ROOT_ACTIVITY_GRAPH__TOP, oldTop, newTop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(State newTop) {
		if (newTop != top) {
			NotificationChain msgs = null;
			if (top != null)
				msgs = ((InternalEObject)top).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Minuml1Package.ROOT_ACTIVITY_GRAPH__TOP, null, msgs);
			if (newTop != null)
				msgs = ((InternalEObject)newTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Minuml1Package.ROOT_ACTIVITY_GRAPH__TOP, null, msgs);
			msgs = basicSetTop(newTop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Minuml1Package.ROOT_ACTIVITY_GRAPH__TOP, newTop, newTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Minuml1Package.ROOT_ACTIVITY_GRAPH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partition> getPartition() {
		if (partition == null) {
			partition = new EObjectContainmentEList<Partition>(Partition.class, this, Minuml1Package.ROOT_ACTIVITY_GRAPH__PARTITION);
		}
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TOP:
				return basicSetTop(null, msgs);
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__PARTITION:
				return ((InternalEList<?>)getPartition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TRANSITIONS:
				return getTransitions();
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TOP:
				return getTop();
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__NAME:
				return getName();
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__PARTITION:
				return getPartition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TOP:
				setTop((State)newValue);
				return;
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__NAME:
				setName((String)newValue);
				return;
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__PARTITION:
				getPartition().clear();
				getPartition().addAll((Collection<? extends Partition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TRANSITIONS:
				getTransitions().clear();
				return;
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TOP:
				setTop((State)null);
				return;
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__PARTITION:
				getPartition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__TOP:
				return top != null;
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Minuml1Package.ROOT_ACTIVITY_GRAPH__PARTITION:
				return partition != null && !partition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RootActivityGraphImpl
