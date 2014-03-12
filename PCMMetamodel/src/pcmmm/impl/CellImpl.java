/**
 */
package pcmmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pcmmm.Cell;
import pcmmm.PcmmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pcmmm.impl.CellImpl#getName <em>Name</em>}</li>
 *   <li>{@link pcmmm.impl.CellImpl#getVerbatim <em>Verbatim</em>}</li>
 *   <li>{@link pcmmm.impl.CellImpl#getNote <em>Note</em>}</li>
 *   <li>{@link pcmmm.impl.CellImpl#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CellImpl extends MinimalEObjectImpl.Container implements Cell {
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
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<String> note;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<String> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmmmPackage.Literals.CELL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.CELL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.CELL__VERBATIM, oldVerbatim, verbatim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNote() {
		if (note == null) {
			note = new EDataTypeUniqueEList<String>(String.class, this, PcmmmPackage.CELL__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLink() {
		if (link == null) {
			link = new EDataTypeUniqueEList<String>(String.class, this, PcmmmPackage.CELL__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmmmPackage.CELL__NAME:
				return getName();
			case PcmmmPackage.CELL__VERBATIM:
				return getVerbatim();
			case PcmmmPackage.CELL__NOTE:
				return getNote();
			case PcmmmPackage.CELL__LINK:
				return getLink();
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
			case PcmmmPackage.CELL__NAME:
				setName((String)newValue);
				return;
			case PcmmmPackage.CELL__VERBATIM:
				setVerbatim((String)newValue);
				return;
			case PcmmmPackage.CELL__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends String>)newValue);
				return;
			case PcmmmPackage.CELL__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends String>)newValue);
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
			case PcmmmPackage.CELL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PcmmmPackage.CELL__VERBATIM:
				setVerbatim(VERBATIM_EDEFAULT);
				return;
			case PcmmmPackage.CELL__NOTE:
				getNote().clear();
				return;
			case PcmmmPackage.CELL__LINK:
				getLink().clear();
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
			case PcmmmPackage.CELL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PcmmmPackage.CELL__VERBATIM:
				return VERBATIM_EDEFAULT == null ? verbatim != null : !VERBATIM_EDEFAULT.equals(verbatim);
			case PcmmmPackage.CELL__NOTE:
				return note != null && !note.isEmpty();
			case PcmmmPackage.CELL__LINK:
				return link != null && !link.isEmpty();
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
		result.append(", verbatim: ");
		result.append(verbatim);
		result.append(", note: ");
		result.append(note);
		result.append(", link: ");
		result.append(link);
		result.append(')');
		return result.toString();
	}

} //CellImpl
