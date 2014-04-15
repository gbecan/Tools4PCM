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
 *   <li>{@link pcmmm.impl.ValuedCellImpl#getMyHeaderProducts <em>My Header Products</em>}</li>
 *   <li>{@link pcmmm.impl.ValuedCellImpl#getMyHeaderFeatures <em>My Header Features</em>}</li>
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
	 * The cached value of the '{@link #getMyHeaderProducts() <em>My Header Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyHeaderProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractProduct> myHeaderProducts;

	/**
	 * The cached value of the '{@link #getMyHeaderFeatures() <em>My Header Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyHeaderFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFeature> myHeaderFeatures;

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
	public EList<AbstractProduct> getMyHeaderProducts() {
		if (myHeaderProducts == null) {
			myHeaderProducts = new EObjectWithInverseResolvingEList.ManyInverse<AbstractProduct>(AbstractProduct.class, this, PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCTS, PcmmmPackage.ABSTRACT_PRODUCT__MY_VALUED_CELLS);
		}
		return myHeaderProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFeature> getMyHeaderFeatures() {
		if (myHeaderFeatures == null) {
			myHeaderFeatures = new EObjectWithInverseResolvingEList.ManyInverse<AbstractFeature>(AbstractFeature.class, this, PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURES, PcmmmPackage.ABSTRACT_FEATURE__MY_VALUED_CELLS);
		}
		return myHeaderFeatures;
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
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMyHeaderProducts()).basicAdd(otherEnd, msgs);
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMyHeaderFeatures()).basicAdd(otherEnd, msgs);
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
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCTS:
				return ((InternalEList<?>)getMyHeaderProducts()).basicRemove(otherEnd, msgs);
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURES:
				return ((InternalEList<?>)getMyHeaderFeatures()).basicRemove(otherEnd, msgs);
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
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCTS:
				return getMyHeaderProducts();
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURES:
				return getMyHeaderFeatures();
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
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCTS:
				getMyHeaderProducts().clear();
				getMyHeaderProducts().addAll((Collection<? extends AbstractProduct>)newValue);
				return;
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURES:
				getMyHeaderFeatures().clear();
				getMyHeaderFeatures().addAll((Collection<? extends AbstractFeature>)newValue);
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
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCTS:
				getMyHeaderProducts().clear();
				return;
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURES:
				getMyHeaderFeatures().clear();
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
			case PcmmmPackage.VALUED_CELL__MY_HEADER_PRODUCTS:
				return myHeaderProducts != null && !myHeaderProducts.isEmpty();
			case PcmmmPackage.VALUED_CELL__MY_HEADER_FEATURES:
				return myHeaderFeatures != null && !myHeaderFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValuedCellImpl
