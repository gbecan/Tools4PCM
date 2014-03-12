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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcmmm.DomainCollection;
import pcmmm.PCM;
import pcmmm.PcmmmPackage;
import pcmmm.ProductComparisonPage;
import pcmmm.VariabilityConcept;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Comparison Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pcmmm.impl.ProductComparisonPageImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link pcmmm.impl.ProductComparisonPageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link pcmmm.impl.ProductComparisonPageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link pcmmm.impl.ProductComparisonPageImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link pcmmm.impl.ProductComparisonPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link pcmmm.impl.ProductComparisonPageImpl#getDomainCollection <em>Domain Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductComparisonPageImpl extends MinimalEObjectImpl.Container implements ProductComparisonPage {
	/**
	 * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectives()
	 * @generated
	 * @ordered
	 */
	protected EList<PCM> perspectives;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<String> description;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<VariabilityConcept> concepts;

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
	 * The cached value of the '{@link #getDomainCollection() <em>Domain Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainCollection()
	 * @generated
	 * @ordered
	 */
	protected DomainCollection domainCollection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductComparisonPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmmPackage.Literals.PRODUCT_COMPARISON_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCM> getPerspectives() {
		if (perspectives == null) {
			perspectives = new EObjectContainmentEList<PCM>(PCM.class, this, PcmmmPackage.PRODUCT_COMPARISON_PAGE__PERSPECTIVES);
		}
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.PRODUCT_COMPARISON_PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDescription() {
		if (description == null) {
			description = new EDataTypeUniqueEList<String>(String.class, this, PcmmmPackage.PRODUCT_COMPARISON_PAGE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariabilityConcept> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentEList<VariabilityConcept>(VariabilityConcept.class, this, PcmmmPackage.PRODUCT_COMPARISON_PAGE__CONCEPTS);
		}
		return concepts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.PRODUCT_COMPARISON_PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainCollection getDomainCollection() {
		return domainCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainCollection(DomainCollection newDomainCollection, NotificationChain msgs) {
		DomainCollection oldDomainCollection = domainCollection;
		domainCollection = newDomainCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcmmmPackage.PRODUCT_COMPARISON_PAGE__DOMAIN_COLLECTION, oldDomainCollection, newDomainCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainCollection(DomainCollection newDomainCollection) {
		if (newDomainCollection != domainCollection) {
			NotificationChain msgs = null;
			if (domainCollection != null)
				msgs = ((InternalEObject)domainCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcmmmPackage.PRODUCT_COMPARISON_PAGE__DOMAIN_COLLECTION, null, msgs);
			if (newDomainCollection != null)
				msgs = ((InternalEObject)newDomainCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcmmmPackage.PRODUCT_COMPARISON_PAGE__DOMAIN_COLLECTION, null, msgs);
			msgs = basicSetDomainCollection(newDomainCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.PRODUCT_COMPARISON_PAGE__DOMAIN_COLLECTION, newDomainCollection, newDomainCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__PERSPECTIVES:
				return ((InternalEList<?>)getPerspectives()).basicRemove(otherEnd, msgs);
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__CONCEPTS:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__DOMAIN_COLLECTION:
				return basicSetDomainCollection(null, msgs);
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
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__PERSPECTIVES:
				return getPerspectives();
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__TITLE:
				return getTitle();
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__DESCRIPTION:
				return getDescription();
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__CONCEPTS:
				return getConcepts();
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__NAME:
				return getName();
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__DOMAIN_COLLECTION:
				return getDomainCollection();
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
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__PERSPECTIVES:
				getPerspectives().clear();
				getPerspectives().addAll((Collection<? extends PCM>)newValue);
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends String>)newValue);
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__CONCEPTS:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends VariabilityConcept>)newValue);
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__NAME:
				setName((String)newValue);
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__DOMAIN_COLLECTION:
				setDomainCollection((DomainCollection)newValue);
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
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__PERSPECTIVES:
				getPerspectives().clear();
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__DESCRIPTION:
				getDescription().clear();
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__CONCEPTS:
				getConcepts().clear();
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__DOMAIN_COLLECTION:
				setDomainCollection((DomainCollection)null);
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
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__PERSPECTIVES:
				return perspectives != null && !perspectives.isEmpty();
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__CONCEPTS:
				return concepts != null && !concepts.isEmpty();
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE__DOMAIN_COLLECTION:
				return domainCollection != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProductComparisonPageImpl
