/**
 */
package decompositionprocess.impl;

import decompositionprocess.DecomposeOp;
import decompositionprocess.DecompositionprocessPackage;
import decompositionprocess.Split;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link decompositionprocess.impl.SplitImpl#getMinCost <em>Min Cost</em>}</li>
 *   <li>{@link decompositionprocess.impl.SplitImpl#getOp <em>Op</em>}</li>
 *   <li>{@link decompositionprocess.impl.SplitImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link decompositionprocess.impl.SplitImpl#getMaxCost <em>Max Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SplitImpl extends EObjectImpl implements Split {
	/**
	 * The default value of the '{@link #getMinCost() <em>Min Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCost()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinCost() <em>Min Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCost()
	 * @generated
	 * @ordered
	 */
	protected double minCost = MIN_COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected DecomposeOp op;

	/**
	 * The default value of the '{@link #getMaxCost() <em>Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCost()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxCost() <em>Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCost()
	 * @generated
	 * @ordered
	 */
	protected double maxCost = MAX_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecompositionprocessPackage.Literals.SPLIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinCost() {
		return minCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCost(double newMinCost) {
		double oldMinCost = minCost;
		minCost = newMinCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionprocessPackage.SPLIT__MIN_COST, oldMinCost, minCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecomposeOp getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(DecomposeOp newOp, NotificationChain msgs) {
		DecomposeOp oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecompositionprocessPackage.SPLIT__OP, oldOp, newOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(DecomposeOp newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject)op).eInverseRemove(this, DecompositionprocessPackage.DECOMPOSE_OP__PARENT, DecomposeOp.class, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, DecompositionprocessPackage.DECOMPOSE_OP__PARENT, DecomposeOp.class, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionprocessPackage.SPLIT__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecomposeOp getParent() {
		if (eContainerFeatureID() != DecompositionprocessPackage.SPLIT__PARENT) return null;
		return (DecomposeOp)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DecomposeOp newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DecompositionprocessPackage.SPLIT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DecomposeOp newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DecompositionprocessPackage.SPLIT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DecompositionprocessPackage.DECOMPOSE_OP__SPLITS, DecomposeOp.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionprocessPackage.SPLIT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxCost() {
		return maxCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCost(double newMaxCost) {
		double oldMaxCost = maxCost;
		maxCost = newMaxCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecompositionprocessPackage.SPLIT__MAX_COST, oldMaxCost, maxCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecompositionprocessPackage.SPLIT__OP:
				if (op != null)
					msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecompositionprocessPackage.SPLIT__OP, null, msgs);
				return basicSetOp((DecomposeOp)otherEnd, msgs);
			case DecompositionprocessPackage.SPLIT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((DecomposeOp)otherEnd, msgs);
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
			case DecompositionprocessPackage.SPLIT__OP:
				return basicSetOp(null, msgs);
			case DecompositionprocessPackage.SPLIT__PARENT:
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
			case DecompositionprocessPackage.SPLIT__PARENT:
				return eInternalContainer().eInverseRemove(this, DecompositionprocessPackage.DECOMPOSE_OP__SPLITS, DecomposeOp.class, msgs);
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
			case DecompositionprocessPackage.SPLIT__MIN_COST:
				return getMinCost();
			case DecompositionprocessPackage.SPLIT__OP:
				return getOp();
			case DecompositionprocessPackage.SPLIT__PARENT:
				return getParent();
			case DecompositionprocessPackage.SPLIT__MAX_COST:
				return getMaxCost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DecompositionprocessPackage.SPLIT__MIN_COST:
				setMinCost((Double)newValue);
				return;
			case DecompositionprocessPackage.SPLIT__OP:
				setOp((DecomposeOp)newValue);
				return;
			case DecompositionprocessPackage.SPLIT__PARENT:
				setParent((DecomposeOp)newValue);
				return;
			case DecompositionprocessPackage.SPLIT__MAX_COST:
				setMaxCost((Double)newValue);
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
			case DecompositionprocessPackage.SPLIT__MIN_COST:
				setMinCost(MIN_COST_EDEFAULT);
				return;
			case DecompositionprocessPackage.SPLIT__OP:
				setOp((DecomposeOp)null);
				return;
			case DecompositionprocessPackage.SPLIT__PARENT:
				setParent((DecomposeOp)null);
				return;
			case DecompositionprocessPackage.SPLIT__MAX_COST:
				setMaxCost(MAX_COST_EDEFAULT);
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
			case DecompositionprocessPackage.SPLIT__MIN_COST:
				return minCost != MIN_COST_EDEFAULT;
			case DecompositionprocessPackage.SPLIT__OP:
				return op != null;
			case DecompositionprocessPackage.SPLIT__PARENT:
				return getParent() != null;
			case DecompositionprocessPackage.SPLIT__MAX_COST:
				return maxCost != MAX_COST_EDEFAULT;
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
		result.append(" (minCost: ");
		result.append(minCost);
		result.append(", maxCost: ");
		result.append(maxCost);
		result.append(')');
		return result.toString();
	}

} //SplitImpl
