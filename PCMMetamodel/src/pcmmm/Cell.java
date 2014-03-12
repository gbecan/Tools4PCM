/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.Cell#getName <em>Name</em>}</li>
 *   <li>{@link pcmmm.Cell#getVerbatim <em>Verbatim</em>}</li>
 *   <li>{@link pcmmm.Cell#getNote <em>Note</em>}</li>
 *   <li>{@link pcmmm.Cell#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getCell()
 * @model abstract="true"
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pcmmm.PcmmmPackage#getCell_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pcmmm.Cell#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verbatim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbatim</em>' attribute.
	 * @see #setVerbatim(String)
	 * @see pcmmm.PcmmmPackage#getCell_Verbatim()
	 * @model
	 * @generated
	 */
	String getVerbatim();

	/**
	 * Sets the value of the '{@link pcmmm.Cell#getVerbatim <em>Verbatim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbatim</em>' attribute.
	 * @see #getVerbatim()
	 * @generated
	 */
	void setVerbatim(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute list.
	 * @see pcmmm.PcmmmPackage#getCell_Note()
	 * @model
	 * @generated
	 */
	EList<String> getNote();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute list.
	 * @see pcmmm.PcmmmPackage#getCell_Link()
	 * @model
	 * @generated
	 */
	EList<String> getLink();

} // Cell
