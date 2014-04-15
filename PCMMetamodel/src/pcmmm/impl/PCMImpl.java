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
import pcmmm.Matrix;
import pcmmm.PCM;
import pcmmm.PcmmmPackage;
import pcmmm.VariabilityConcept;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pcmmm.impl.PCMImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link pcmmm.impl.PCMImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link pcmmm.impl.PCMImpl#getMatrices <em>Matrices</em>}</li>
 *   <li>{@link pcmmm.impl.PCMImpl#getName <em>Name</em>}</li>
 *   <li>{@link pcmmm.impl.PCMImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link pcmmm.impl.PCMImpl#getDomainCollection <em>Domain Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PCMImpl extends MinimalEObjectImpl.Container implements PCM {
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
	 * The cached value of the '{@link #getMatrices() <em>Matrices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrices()
	 * @generated
	 * @ordered
	 */
	protected EList<Matrix> matrices;

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
	 * The cached value of the '{@link #getConcepts() <em>Concepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<VariabilityConcept> concepts;

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
	protected PCMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmmPackage.Literals.PCM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.PCM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDescription() {
		if (description == null) {
			description = new EDataTypeUniqueEList<String>(String.class, this, PcmmmPackage.PCM__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matrix> getMatrices() {
		if (matrices == null) {
			matrices = new EObjectContainmentEList<Matrix>(Matrix.class, this, PcmmmPackage.PCM__MATRICES);
		}
		return matrices;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.PCM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariabilityConcept> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentEList<VariabilityConcept>(VariabilityConcept.class, this, PcmmmPackage.PCM__CONCEPTS);
		}
		return concepts;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcmmmPackage.PCM__DOMAIN_COLLECTION, oldDomainCollection, newDomainCollection);
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
				msgs = ((InternalEObject)domainCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcmmmPackage.PCM__DOMAIN_COLLECTION, null, msgs);
			if (newDomainCollection != null)
				msgs = ((InternalEObject)newDomainCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcmmmPackage.PCM__DOMAIN_COLLECTION, null, msgs);
			msgs = basicSetDomainCollection(newDomainCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.PCM__DOMAIN_COLLECTION, newDomainCollection, newDomainCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcmmmPackage.PCM__MATRICES:
				return ((InternalEList<?>)getMatrices()).basicRemove(otherEnd, msgs);
			case PcmmmPackage.PCM__CONCEPTS:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
			case PcmmmPackage.PCM__DOMAIN_COLLECTION:
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
			case PcmmmPackage.PCM__TITLE:
				return getTitle();
			case PcmmmPackage.PCM__DESCRIPTION:
				return getDescription();
			case PcmmmPackage.PCM__MATRICES:
				return getMatrices();
			case PcmmmPackage.PCM__NAME:
				return getName();
			case PcmmmPackage.PCM__CONCEPTS:
				return getConcepts();
			case PcmmmPackage.PCM__DOMAIN_COLLECTION:
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
			case PcmmmPackage.PCM__TITLE:
				setTitle((String)newValue);
				return;
			case PcmmmPackage.PCM__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends String>)newValue);
				return;
			case PcmmmPackage.PCM__MATRICES:
				getMatrices().clear();
				getMatrices().addAll((Collection<? extends Matrix>)newValue);
				return;
			case PcmmmPackage.PCM__NAME:
				setName((String)newValue);
				return;
			case PcmmmPackage.PCM__CONCEPTS:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends VariabilityConcept>)newValue);
				return;
			case PcmmmPackage.PCM__DOMAIN_COLLECTION:
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
			case PcmmmPackage.PCM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PcmmmPackage.PCM__DESCRIPTION:
				getDescription().clear();
				return;
			case PcmmmPackage.PCM__MATRICES:
				getMatrices().clear();
				return;
			case PcmmmPackage.PCM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PcmmmPackage.PCM__CONCEPTS:
				getConcepts().clear();
				return;
			case PcmmmPackage.PCM__DOMAIN_COLLECTION:
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
			case PcmmmPackage.PCM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PcmmmPackage.PCM__DESCRIPTION:
				return description != null && !description.isEmpty();
			case PcmmmPackage.PCM__MATRICES:
				return matrices != null && !matrices.isEmpty();
			case PcmmmPackage.PCM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PcmmmPackage.PCM__CONCEPTS:
				return concepts != null && !concepts.isEmpty();
			case PcmmmPackage.PCM__DOMAIN_COLLECTION:
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

} //PCMImpl
