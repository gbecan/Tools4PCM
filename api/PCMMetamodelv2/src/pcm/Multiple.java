/**
 */
package pcm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcm.Multiple#getSubvalues <em>Subvalues</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcm.PcmPackage#getMultiple()
 * @model
 * @generated
 */
public interface Multiple extends Value {
	/**
	 * Returns the value of the '<em><b>Subvalues</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subvalues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subvalues</em>' containment reference list.
	 * @see pcm.PcmPackage#getMultiple_Subvalues()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Value> getSubvalues();

} // Multiple
