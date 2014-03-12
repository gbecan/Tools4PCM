/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.Domain#getIntervals <em>Intervals</em>}</li>
 *   <li>{@link pcmmm.Domain#getDomainLitteral <em>Domain Litteral</em>}</li>
 *   <li>{@link pcmmm.Domain#getName <em>Name</em>}</li>
 *   <li>{@link pcmmm.Domain#getDomainType <em>Domain Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Intervals</b></em>' containment reference list.
	 * The list contents are of type {@link pcmmm.Interval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervals</em>' containment reference list.
	 * @see pcmmm.PcmmmPackage#getDomain_Intervals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interval> getIntervals();

	/**
	 * Returns the value of the '<em><b>Domain Litteral</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Litteral</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Litteral</em>' attribute list.
	 * @see pcmmm.PcmmmPackage#getDomain_DomainLitteral()
	 * @model
	 * @generated
	 */
	EList<String> getDomainLitteral();

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
	 * @see pcmmm.PcmmmPackage#getDomain_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pcmmm.Domain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Type</em>' containment reference.
	 * @see #setDomainType(Type)
	 * @see pcmmm.PcmmmPackage#getDomain_DomainType()
	 * @model containment="true"
	 * @generated
	 */
	Type getDomainType();

	/**
	 * Sets the value of the '{@link pcmmm.Domain#getDomainType <em>Domain Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Type</em>' containment reference.
	 * @see #getDomainType()
	 * @generated
	 */
	void setDomainType(Type value);

} // Domain
