/**
 */
package decompositionprocess.impl;

import decompositionprocess.DecomposeOp;
import decompositionprocess.DecompositionprocessPackage;
import decompositionprocess.Split;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decompose Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link decompositionprocess.impl.DecomposeOpImpl#getId <em>Id</em>}</li>
 *   <li>{@link decompositionprocess.impl.DecomposeOpImpl#getSplits <em>Splits</em>}</li>
 *   <li>{@link decompositionprocess.impl.DecomposeOpImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link decompositionprocess.impl.DecomposeOpImpl#getMin <em>Min</em>}</li>
 *   <li>{@link decompositionprocess.impl.DecomposeOpImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecomposeOpImpl extends EObjectImpl implements DecomposeOp {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSplits() <em>Splits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplits()
	 * @generated
	 * @ordered
	 */
	protected EList<Split> splits;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Split min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Split max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecomposeOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecompositionprocessPackage.Literals.DECOMPOSE_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionprocessPackage.DECOMPOSE_OP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Split> getSplits() {
		if (splits == null) {
			splits = new EObjectContainmentWithInverseEList<Split>(Split.class, this, DecompositionprocessPackage.DECOMPOSE_OP__SPLITS, DecompositionprocessPackage.SPLIT__PARENT);
		}
		return splits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split getParent() {
		if (eContainerFeatureID() != DecompositionprocessPackage.DECOMPOSE_OP__PARENT) return null;
		return (Split)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Split newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DecompositionprocessPackage.DECOMPOSE_OP__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Split newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DecompositionprocessPackage.DECOMPOSE_OP__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DecompositionprocessPackage.SPLIT__OP, Split.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionprocessPackage.DECOMPOSE_OP__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split getMin() {
		if (min != null && min.eIsProxy()) {
			InternalEObject oldMin = (InternalEObject)min;
			min = (Split)eResolveProxy(oldMin);
			if (min != oldMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DecompositionprocessPackage.DECOMPOSE_OP__MIN, oldMin, min));
			}
		}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split basicGetMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(Split newMin) {
		Split oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionprocessPackage.DECOMPOSE_OP__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split getMax() {
		if (max != null && max.eIsProxy()) {
			InternalEObject oldMax = (InternalEObject)max;
			max = (Split)eResolveProxy(oldMax);
			if (max != oldMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DecompositionprocessPackage.DECOMPOSE_OP__MAX, oldMax, max));
			}
		}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Split basicGetMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(Split newMax) {
		Split oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionprocessPackage.DECOMPOSE_OP__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecompositionprocessPackage.DECOMPOSE_OP__SPLITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSplits()).basicAdd(otherEnd, msgs);
			case DecompositionprocessPackage.DECOMPOSE_OP__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Split)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecompositionprocessPackage.DECOMPOSE_OP__SPLITS:
				return ((InternalEList<?>)getSplits()).basicRemove(otherEnd, msgs);
			case DecompositionprocessPackage.DECOMPOSE_OP__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DecompositionprocessPackage.DECOMPOSE_OP__PARENT:
				return eInternalContainer().eInverseRemove(this, DecompositionprocessPackage.SPLIT__OP, Split.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecompositionprocessPackage.DECOMPOSE_OP__ID:
				return getId();
			case DecompositionprocessPackage.DECOMPOSE_OP__SPLITS:
				return getSplits();
			case DecompositionprocessPackage.DECOMPOSE_OP__PARENT:
				return getParent();
			case DecompositionprocessPackage.DECOMPOSE_OP__MIN:
				if (resolve) return getMin();
				return basicGetMin();
			case DecompositionprocessPackage.DECOMPOSE_OP__MAX:
				if (resolve) return getMax();
				return basicGetMax();
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
			case DecompositionprocessPackage.DECOMPOSE_OP__ID:
				setId((String)newValue);
				return;
			case DecompositionprocessPackage.DECOMPOSE_OP__SPLITS:
				getSplits().clear();
				getSplits().addAll((Collection<? extends Split>)newValue);
				return;
			case DecompositionprocessPackage.DECOMPOSE_OP__PARENT:
				setParent((Split)newValue);
				return;
			case DecompositionprocessPackage.DECOMPOSE_OP__MIN:
				setMin((Split)newValue);
				return;
			case DecompositionprocessPackage.DECOMPOSE_OP__MAX:
				setMax((Split)newValue);
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
			case DecompositionprocessPackage.DECOMPOSE_OP__ID:
				setId(ID_EDEFAULT);
				return;
			case DecompositionprocessPackage.DECOMPOSE_OP__SPLITS:
				getSplits().clear();
				return;
			case DecompositionprocessPackage.DECOMPOSE_OP__PARENT:
				setParent((Split)null);
				return;
			case DecompositionprocessPackage.DECOMPOSE_OP__MIN:
				setMin((Split)null);
				return;
			case DecompositionprocessPackage.DECOMPOSE_OP__MAX:
				setMax((Split)null);
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
			case DecompositionprocessPackage.DECOMPOSE_OP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DecompositionprocessPackage.DECOMPOSE_OP__SPLITS:
				return splits != null && !splits.isEmpty();
			case DecompositionprocessPackage.DECOMPOSE_OP__PARENT:
				return getParent() != null;
			case DecompositionprocessPackage.DECOMPOSE_OP__MIN:
				return min != null;
			case DecompositionprocessPackage.DECOMPOSE_OP__MAX:
				return max != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DecomposeOpImpl
