/**
 */
package pcmmm.impl;

import java.lang.Integer;

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
 *   <li>{@link pcmmm.impl.CellImpl#getRow <em>Row</em>}</li>
 *   <li>{@link pcmmm.impl.CellImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link pcmmm.impl.CellImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link pcmmm.impl.CellImpl#getColspan <em>Colspan</em>}</li>
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
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWSPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected int rowspan = ROWSPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected static final int COLSPAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected int colspan = COLSPAN_EDEFAULT;

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
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.CELL__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowspan(int newRowspan) {
		int oldRowspan = rowspan;
		rowspan = newRowspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.CELL__ROWSPAN, oldRowspan, rowspan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.CELL__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColspan() {
		return colspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColspan(int newColspan) {
		int oldColspan = colspan;
		colspan = newColspan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcmmmPackage.CELL__COLSPAN, oldColspan, colspan));
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
			case PcmmmPackage.CELL__ROW:
				return getRow();
			case PcmmmPackage.CELL__ROWSPAN:
				return getRowspan();
			case PcmmmPackage.CELL__COLUMN:
				return getColumn();
			case PcmmmPackage.CELL__COLSPAN:
				return getColspan();
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
			case PcmmmPackage.CELL__ROW:
				setRow((Integer)newValue);
				return;
			case PcmmmPackage.CELL__ROWSPAN:
				setRowspan((Integer)newValue);
				return;
			case PcmmmPackage.CELL__COLUMN:
				setColumn((Integer)newValue);
				return;
			case PcmmmPackage.CELL__COLSPAN:
				setColspan((Integer)newValue);
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
			case PcmmmPackage.CELL__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case PcmmmPackage.CELL__ROWSPAN:
				setRowspan(ROWSPAN_EDEFAULT);
				return;
			case PcmmmPackage.CELL__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case PcmmmPackage.CELL__COLSPAN:
				setColspan(COLSPAN_EDEFAULT);
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
			case PcmmmPackage.CELL__ROW:
				return row != ROW_EDEFAULT;
			case PcmmmPackage.CELL__ROWSPAN:
				return rowspan != ROWSPAN_EDEFAULT;
			case PcmmmPackage.CELL__COLUMN:
				return column != COLUMN_EDEFAULT;
			case PcmmmPackage.CELL__COLSPAN:
				return colspan != COLSPAN_EDEFAULT;
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
		result.append(", row: ");
		result.append(row);
		result.append(", rowspan: ");
		result.append(rowspan);
		result.append(", column: ");
		result.append(column);
		result.append(", colspan: ");
		result.append(colspan);
		result.append(')');
		return result.toString();
	}

} //CellImpl
