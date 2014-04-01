/**
 */
package pcmmm.impl;

import com.google.gwt.user.client.rpc.GwtTransient;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcmmm.OrderedDomain;
import pcmmm.PcmmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pcmmm.impl.OrderedDomainImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link pcmmm.impl.OrderedDomainImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderedDomainImpl extends DomainImpl implements OrderedDomain {
	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	@GwtTransient
	protected EList<OrderedDomain> previous;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	@GwtTransient
	protected EList<OrderedDomain> next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmmPackage.Literals.ORDERED_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderedDomain> getPrevious() {
		if (previous == null) {
			previous = new EObjectWithInverseResolvingEList.ManyInverse<OrderedDomain>(OrderedDomain.class, this, PcmmmPackage.ORDERED_DOMAIN__PREVIOUS, PcmmmPackage.ORDERED_DOMAIN__NEXT);
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderedDomain> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse<OrderedDomain>(OrderedDomain.class, this, PcmmmPackage.ORDERED_DOMAIN__NEXT, PcmmmPackage.ORDERED_DOMAIN__PREVIOUS);
		}
		return next;
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
			case PcmmmPackage.ORDERED_DOMAIN__PREVIOUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrevious()).basicAdd(otherEnd, msgs);
			case PcmmmPackage.ORDERED_DOMAIN__NEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNext()).basicAdd(otherEnd, msgs);
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
			case PcmmmPackage.ORDERED_DOMAIN__PREVIOUS:
				return ((InternalEList<?>)getPrevious()).basicRemove(otherEnd, msgs);
			case PcmmmPackage.ORDERED_DOMAIN__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
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
			case PcmmmPackage.ORDERED_DOMAIN__PREVIOUS:
				return getPrevious();
			case PcmmmPackage.ORDERED_DOMAIN__NEXT:
				return getNext();
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
			case PcmmmPackage.ORDERED_DOMAIN__PREVIOUS:
				getPrevious().clear();
				getPrevious().addAll((Collection<? extends OrderedDomain>)newValue);
				return;
			case PcmmmPackage.ORDERED_DOMAIN__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends OrderedDomain>)newValue);
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
			case PcmmmPackage.ORDERED_DOMAIN__PREVIOUS:
				getPrevious().clear();
				return;
			case PcmmmPackage.ORDERED_DOMAIN__NEXT:
				getNext().clear();
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
			case PcmmmPackage.ORDERED_DOMAIN__PREVIOUS:
				return previous != null && !previous.isEmpty();
			case PcmmmPackage.ORDERED_DOMAIN__NEXT:
				return next != null && !next.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrderedDomainImpl
