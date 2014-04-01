/**
 */
package pcmmm.impl;

import com.google.gwt.user.client.rpc.GwtTransient;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcmmm.Domain;
import pcmmm.Interval;
import pcmmm.PcmmmPackage;
import pcmmm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pcmmm.impl.DomainImpl#getIntervals <em>Intervals</em>}</li>
 *   <li>{@link pcmmm.impl.DomainImpl#getDomainLitteral <em>Domain Litteral</em>}</li>
 *   <li>{@link pcmmm.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link pcmmm.impl.DomainImpl#getDomainType <em>Domain Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getIntervals() <em>Intervals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervals()
	 * @generated
	 * @ordered
	 */
	@GwtTransient
	protected EList<Interval> intervals;

	/**
	 * The cached value of the '{@link #getDomainLitteral() <em>Domain Litteral</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainLitteral()
	 * @generated
	 * @ordered
	 */
	@GwtTransient
	protected EList<String> domainLitteral;

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
	@GwtTransient
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainType() <em>Domain Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainType()
	 * @generated
	 * @ordered
	 */
	@GwtTransient
	protected Type domainType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmmPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interval> getIntervals() {
		if (intervals == null) {
			intervals = new EObjectContainmentEList<Interval>(Interval.class, this, PcmmmPackage.DOMAIN__INTERVALS);
		}
		return intervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDomainLitteral() {
		if (domainLitteral == null) {
			domainLitteral = new EDataTypeUniqueEList<String>(String.class, this, PcmmmPackage.DOMAIN__DOMAIN_LITTERAL);
		}
		return domainLitteral;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getDomainType() {
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainType(Type newDomainType, NotificationChain msgs) {
		Type oldDomainType = domainType;
		domainType = newDomainType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcmmmPackage.DOMAIN__DOMAIN_TYPE, oldDomainType, newDomainType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainType(Type newDomainType) {
		if (newDomainType != domainType) {
			NotificationChain msgs = null;
			if (domainType != null)
				msgs = ((InternalEObject)domainType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcmmmPackage.DOMAIN__DOMAIN_TYPE, null, msgs);
			if (newDomainType != null)
				msgs = ((InternalEObject)newDomainType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcmmmPackage.DOMAIN__DOMAIN_TYPE, null, msgs);
			msgs = basicSetDomainType(newDomainType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.DOMAIN__DOMAIN_TYPE, newDomainType, newDomainType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcmmmPackage.DOMAIN__INTERVALS:
				return ((InternalEList<?>)getIntervals()).basicRemove(otherEnd, msgs);
			case PcmmmPackage.DOMAIN__DOMAIN_TYPE:
				return basicSetDomainType(null, msgs);
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
			case PcmmmPackage.DOMAIN__INTERVALS:
				return getIntervals();
			case PcmmmPackage.DOMAIN__DOMAIN_LITTERAL:
				return getDomainLitteral();
			case PcmmmPackage.DOMAIN__NAME:
				return getName();
			case PcmmmPackage.DOMAIN__DOMAIN_TYPE:
				return getDomainType();
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
			case PcmmmPackage.DOMAIN__INTERVALS:
				getIntervals().clear();
				getIntervals().addAll((Collection<? extends Interval>)newValue);
				return;
			case PcmmmPackage.DOMAIN__DOMAIN_LITTERAL:
				getDomainLitteral().clear();
				getDomainLitteral().addAll((Collection<? extends String>)newValue);
				return;
			case PcmmmPackage.DOMAIN__NAME:
				setName((String)newValue);
				return;
			case PcmmmPackage.DOMAIN__DOMAIN_TYPE:
				setDomainType((Type)newValue);
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
			case PcmmmPackage.DOMAIN__INTERVALS:
				getIntervals().clear();
				return;
			case PcmmmPackage.DOMAIN__DOMAIN_LITTERAL:
				getDomainLitteral().clear();
				return;
			case PcmmmPackage.DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PcmmmPackage.DOMAIN__DOMAIN_TYPE:
				setDomainType((Type)null);
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
			case PcmmmPackage.DOMAIN__INTERVALS:
				return intervals != null && !intervals.isEmpty();
			case PcmmmPackage.DOMAIN__DOMAIN_LITTERAL:
				return domainLitteral != null && !domainLitteral.isEmpty();
			case PcmmmPackage.DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PcmmmPackage.DOMAIN__DOMAIN_TYPE:
				return domainType != null;
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
		result.append(" (domainLitteral: ");
		result.append(domainLitteral);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
