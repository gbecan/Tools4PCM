/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.DomainCollection#getDomains <em>Domains</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getDomainCollection()
 * @model
 * @generated
 */
public interface DomainCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
	 * The list contents are of type {@link pcmmm.Domain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference list.
	 * @see pcmmm.PcmmmPackage#getDomainCollection_Domains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Domain> getDomains();

} // DomainCollection
