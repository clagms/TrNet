/**
 */
package minuml1.impl;

import minuml1.ActionState;
import minuml1.Minuml1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link minuml1.impl.ActionStateImpl#isIsDynamic <em>Is Dynamic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionStateImpl extends StateImpl implements ActionState {
	/**
	 * The default value of the '{@link #isIsDynamic() <em>Is Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DYNAMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDynamic() <em>Is Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDynamic()
	 * @generated
	 * @ordered
	 */
	protected boolean isDynamic = IS_DYNAMIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Minuml1Package.Literals.ACTION_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDynamic() {
		return isDynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDynamic(boolean newIsDynamic) {
		boolean oldIsDynamic = isDynamic;
		isDynamic = newIsDynamic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Minuml1Package.ACTION_STATE__IS_DYNAMIC, oldIsDynamic, isDynamic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Minuml1Package.ACTION_STATE__IS_DYNAMIC:
				return isIsDynamic();
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
			case Minuml1Package.ACTION_STATE__IS_DYNAMIC:
				setIsDynamic((Boolean)newValue);
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
			case Minuml1Package.ACTION_STATE__IS_DYNAMIC:
				setIsDynamic(IS_DYNAMIC_EDEFAULT);
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
			case Minuml1Package.ACTION_STATE__IS_DYNAMIC:
				return isDynamic != IS_DYNAMIC_EDEFAULT;
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
		result.append(" (isDynamic: ");
		result.append(isDynamic);
		result.append(')');
		return result.toString();
	}

} //ActionStateImpl
