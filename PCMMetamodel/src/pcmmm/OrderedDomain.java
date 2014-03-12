/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.OrderedDomain#getPrevious <em>Previous</em>}</li>
 *   <li>{@link pcmmm.OrderedDomain#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getOrderedDomain()
 * @model
 * @generated
 */
public interface OrderedDomain extends Domain {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link pcmmm.OrderedDomain}.
	 * It is bidirectional and its opposite is '{@link pcmmm.OrderedDomain#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see pcmmm.PcmmmPackage#getOrderedDomain_Previous()
	 * @see pcmmm.OrderedDomain#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<OrderedDomain> getPrevious();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link pcmmm.OrderedDomain}.
	 * It is bidirectional and its opposite is '{@link pcmmm.OrderedDomain#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see pcmmm.PcmmmPackage#getOrderedDomain_Next()
	 * @see pcmmm.OrderedDomain#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	EList<OrderedDomain> getNext();

} // OrderedDomain
