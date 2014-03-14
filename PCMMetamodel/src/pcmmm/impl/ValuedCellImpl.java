/**
 */
package pcmmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcmmm.AbstractFeature;
import pcmmm.AbstractProduct;
import pcmmm.Constraint;
import pcmmm.PcmmmPackage;
import pcmmm.ValuedCell;
import pcmmm.VariabilityConcept;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valued Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pcmmm.impl.ValuedCellImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link pcmmm.impl.ValuedCellImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link pcmmm.impl.ValuedCellImpl#getMyHeaderProduct <em>My Header Product</em>}</li>
 *   <li>{@link pcmmm.impl.ValuedCellImpl#getMyHeaderFeature <em>My Header Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValuedCellImpl extends CellImpl implements ValuedCell {
	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected Constraint interpretation;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concepts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<VariabilityConcept> concepts;

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
	protected ValuedCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmmPackage.Literals.VALUED_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpretation(Constraint newInterpretation, NotificationChain msgs) {
		Constraint oldInterpretation = interpretation;
		interpretation = newInterpretation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcmmmPackage.VALUED_CELL__INTERPRETATION, oldInterpretation, newInterpretation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretation(Constraint newInterpretation) {
		if (newInterpretation != interpretation) {
			NotificationChain msgs = null;
			if (interpretation != null)
				msgs = ((InternalEObject)interpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcmmmPackage.VALUED_CELL__INTERPRETATION, null, msgs);
			if (newInterpretation != null)
				msgs = ((InternalEObject)newInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcmmmPackage.VALUED_CELL__INTERPRETATION, null, msgs);
			msgs = basicSetInterpretation(newInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.VALUED_CELL__INTERPRETATION, newInterpretation, newInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariabilityConcept> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectWithInverseResolvingEList.ManyInverse<VariabilityConcept>(VariabilityConcept.class, this, PcmmmPackage.VALUED_CELL__CONCEPTS, PcmmmPackage.VARIABILITY_CONCEPT__CONSTRAINTS);
		}
		return concepts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCT, oldMyHeaderProduct, myHeaderProduct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCT, oldMyHeaderProduct, myHeaderProduct));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURE, oldMyHeaderFeature, myHeaderFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURE, oldMyHeaderFeature, myHeaderFeature));
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
			case PcmmmPackage.VALUED_CELL__CONCEPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcepts()).basicAdd(otherEnd, msgs);
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
			case PcmmmPackage.VALUED_CELL__INTERPRETATION:
				return basicSetInterpretation(null, msgs);
			case PcmmmPackage.VALUED_CELL__CONCEPTS:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
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
			case PcmmmPackage.VALUED_CELL__INTERPRETATION:
				return getInterpretation();
			case PcmmmPackage.VALUED_CELL__CONCEPTS:
				return getConcepts();
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCT:
				if (resolve) return getMyHeaderProduct();
				return basicGetMyHeaderProduct();
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcmmmPackage.VALUED_CELL__INTERPRETATION:
				setInterpretation((Constraint)newValue);
				return;
			case PcmmmPackage.VALUED_CELL__CONCEPTS:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends VariabilityConcept>)newValue);
				return;
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCT:
				setMyHeaderProduct((AbstractProduct)newValue);
				return;
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURE:
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
			case PcmmmPackage.VALUED_CELL__INTERPRETATION:
				setInterpretation((Constraint)null);
				return;
			case PcmmmPackage.VALUED_CELL__CONCEPTS:
				getConcepts().clear();
				return;
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCT:
				setMyHeaderProduct((AbstractProduct)null);
				return;
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURE:
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
			case PcmmmPackage.VALUED_CELL__INTERPRETATION:
				return interpretation != null;
			case PcmmmPackage.VALUED_CELL__CONCEPTS:
				return concepts != null && !concepts.isEmpty();
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCT:
				return myHeaderProduct != null;
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURE:
				return myHeaderFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //ValuedCellImpl
