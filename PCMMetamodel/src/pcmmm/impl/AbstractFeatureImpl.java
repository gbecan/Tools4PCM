/**
 */
package pcmmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcmmm.AbstractFeature;
import pcmmm.PcmmmPackage;
import pcmmm.ValuedCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pcmmm.impl.AbstractFeatureImpl#getMyValuedCells <em>My Valued Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractFeatureImpl extends VariabilityConceptImpl implements AbstractFeature {
	/**
	 * The cached value of the '{@link #getMyValuedCells() <em>My Valued Cells</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyValuedCells()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuedCell> myValuedCells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmmPackage.Literals.ABSTRACT_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuedCell> getMyValuedCells() {
		if (myValuedCells == null) {
			myValuedCells = new EObjectWithInverseResolvingEList.ManyInverse<ValuedCell>(ValuedCell.class, this, PcmmmPackage.ABSTRACT_FEATURE__MY_VALUED_CELLS, PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURES);
		}
		return myValuedCells;
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
			case PcmmmPackage.ABSTRACT_FEATURE__MY_VALUED_CELLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMyValuedCells()).basicAdd(otherEnd, msgs);
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
			case PcmmmPackage.ABSTRACT_FEATURE__MY_VALUED_CELLS:
				return ((InternalEList<?>)getMyValuedCells()).basicRemove(otherEnd, msgs);
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
			case PcmmmPackage.ABSTRACT_FEATURE__MY_VALUED_CELLS:
				return getMyValuedCells();
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
			case PcmmmPackage.ABSTRACT_FEATURE__MY_VALUED_CELLS:
				getMyValuedCells().clear();
				getMyValuedCells().addAll((Collection<? extends ValuedCell>)newValue);
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
			case PcmmmPackage.ABSTRACT_FEATURE__MY_VALUED_CELLS:
				getMyValuedCells().clear();
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
			case PcmmmPackage.ABSTRACT_FEATURE__MY_VALUED_CELLS:
				return myValuedCells != null && !myValuedCells.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractFeatureImpl
