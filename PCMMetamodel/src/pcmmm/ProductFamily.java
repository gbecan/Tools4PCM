/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.ProductFamily#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getProductFamily()
 * @model
 * @generated
 */
public interface ProductFamily extends AbstractProduct {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link pcmmm.AbstractProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see pcmmm.PcmmmPackage#getProductFamily_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractProduct> getProducts();

} // ProductFamily
