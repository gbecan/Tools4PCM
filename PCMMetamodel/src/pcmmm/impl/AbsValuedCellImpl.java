/**
 */
package pcmmm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcmmm.AbsValuedCell;
import pcmmm.AbstractFeature;
import pcmmm.AbstractProduct;
import pcmmm.PcmmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abs Valued Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pcmmm.impl.AbsValuedCellImpl#getMyHeaderProduct <em>My Header Product</em>}</li>
 *   <li>{@link pcmmm.impl.AbsValuedCellImpl#getMyHeaderFeature <em>My Header Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbsValuedCellImpl extends CellImpl implements AbsValuedCell {
	/**
	 * The cached value of the '{@link #getMyHeaderProduct() <em>My Header Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyHeaderProduct()
	 * @generated
	 * @ordered
	 */
	protected AbstractProduct myHeaderProduct;

	/**
	 * The cached value of the '{@link #getMyHeaderFeature() <em>My Header Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyHeaderFeature()
	 * @generated
	 * @ordered
	 */
	protected AbstractFeature myHeaderFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsValuedCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmmPackage.Literals.ABS_VALUED_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProduct getMyHeaderProduct() {
		if (myHeaderProduct != null && myHeaderProduct.eIsProxy()) {
			InternalEObject oldMyHeaderProduct = (InternalEObject)myHeaderProduct;
			myHeaderProduct = (AbstractProduct)eResolveProxy(oldMyHeaderProduct);
			if (myHeaderProduct != oldMyHeaderProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_PRODUCT, oldMyHeaderProduct, myHeaderProduct));
			}
		}
		return myHeaderProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProduct basicGetMyHeaderProduct() {
		return myHeaderProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyHeaderProduct(AbstractProduct newMyHeaderProduct) {
		AbstractProduct oldMyHeaderProduct = myHeaderProduct;
		myHeaderProduct = newMyHeaderProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_PRODUCT, oldMyHeaderProduct, myHeaderProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFeature getMyHeaderFeature() {
		if (myHeaderFeature != null && myHeaderFeature.eIsProxy()) {
			InternalEObject oldMyHeaderFeature = (InternalEObject)myHeaderFeature;
			myHeaderFeature = (AbstractFeature)eResolveProxy(oldMyHeaderFeature);
			if (myHeaderFeature != oldMyHeaderFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_FEATURE, oldMyHeaderFeature, myHeaderFeature));
			}
		}
		return myHeaderFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFeature basicGetMyHeaderFeature() {
		return myHeaderFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyHeaderFeature(AbstractFeature newMyHeaderFeature) {
		AbstractFeature oldMyHeaderFeature = myHeaderFeature;
		myHeaderFeature = newMyHeaderFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_FEATURE, oldMyHeaderFeature, myHeaderFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_PRODUCT:
				if (resolve) return getMyHeaderProduct();
				return basicGetMyHeaderProduct();
			case PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_FEATURE:
				if (resolve) return getMyHeaderFeature();
				return basicGetMyHeaderFeature();
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
			case PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_PRODUCT:
				setMyHeaderProduct((AbstractProduct)newValue);
				return;
			case PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_FEATURE:
				setMyHeaderFeature((AbstractFeature)newValue);
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
			case PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_PRODUCT:
				setMyHeaderProduct((AbstractProduct)null);
				return;
			case PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_FEATURE:
				setMyHeaderFeature((AbstractFeature)null);
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
			case PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_PRODUCT:
				return myHeaderProduct != null;
			case PcmmmPackage.ABS_VALUED_CELL__MY_HEADER_FEATURE:
				return myHeaderFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //AbsValuedCellImpl
