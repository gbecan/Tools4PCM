/**
 */
package pcmmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link pcmmm.Constraint#isConfident <em>Confident</em>}</li>
 *   <li>{@link pcmmm.Constraint#getVerbatim <em>Verbatim</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
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
	 * @see pcmmm.PcmmmPackage#getConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pcmmm.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confident</em>' attribute.
	 * @see #setConfident(boolean)
	 * @see pcmmm.PcmmmPackage#getConstraint_Confident()
	 * @model
	 * @generated
	 */
	boolean isConfident();

	/**
	 * Sets the value of the '{@link pcmmm.Constraint#isConfident <em>Confident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confident</em>' attribute.
	 * @see #isConfident()
	 * @generated
	 */
	void setConfident(boolean value);

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
	 * @see pcmmm.PcmmmPackage#getConstraint_Verbatim()
	 * @model
	 * @generated
	 */
	String getVerbatim();

	/**
	 * Sets the value of the '{@link pcmmm.Constraint#getVerbatim <em>Verbatim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbatim</em>' attribute.
	 * @see #getVerbatim()
	 * @generated
	 */
	void setVerbatim(String value);

} // Constraint
