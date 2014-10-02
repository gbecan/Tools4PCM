/**
 */
package pcmmm.impl;

import java.lang.Boolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pcmmm.Constraint;
import pcmmm.PcmmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pcmmm.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link pcmmm.impl.ConstraintImpl#isConfident <em>Confident</em>}</li>
 *   <li>{@link pcmmm.impl.ConstraintImpl#getVerbatim <em>Verbatim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
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
	 * The default value of the '{@link #isConfident() <em>Confident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfident()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfident() <em>Confident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfident()
	 * @generated
	 * @ordered
	 */
	protected boolean confident = CONFIDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerbatim() <em>Verbatim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbatim()
	 * @generated
	 * @ordered
	 */
	protected static final String VERBATIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerbatim() <em>Verbatim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbatim()
	 * @generated
	 * @ordered
	 */
	protected String verbatim = VERBATIM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmmPackage.Literals.CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfident() {
		return confident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfident(boolean newConfident) {
		boolean oldConfident = confident;
		confident = newConfident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.CONSTRAINT__CONFIDENT, oldConfident, confident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerbatim() {
		return verbatim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerbatim(String newVerbatim) {
		String oldVerbatim = verbatim;
		verbatim = newVerbatim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.CONSTRAINT__VERBATIM, oldVerbatim, verbatim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmmmPackage.CONSTRAINT__NAME:
				return getName();
			case PcmmmPackage.CONSTRAINT__CONFIDENT:
				return isConfident();
			case PcmmmPackage.CONSTRAINT__VERBATIM:
				return getVerbatim();
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
			case PcmmmPackage.CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case PcmmmPackage.CONSTRAINT__CONFIDENT:
				setConfident((Boolean)newValue);
				return;
			case PcmmmPackage.CONSTRAINT__VERBATIM:
				setVerbatim((String)newValue);
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
			case PcmmmPackage.CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PcmmmPackage.CONSTRAINT__CONFIDENT:
				setConfident(CONFIDENT_EDEFAULT);
				return;
			case PcmmmPackage.CONSTRAINT__VERBATIM:
				setVerbatim(VERBATIM_EDEFAULT);
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
			case PcmmmPackage.CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PcmmmPackage.CONSTRAINT__CONFIDENT:
				return confident != CONFIDENT_EDEFAULT;
			case PcmmmPackage.CONSTRAINT__VERBATIM:
				return VERBATIM_EDEFAULT == null ? verbatim != null : !VERBATIM_EDEFAULT.equals(verbatim);
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
		result.append(", confident: ");
		result.append(confident);
		result.append(", verbatim: ");
		result.append(verbatim);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
