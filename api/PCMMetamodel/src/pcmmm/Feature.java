/**
 */
package pcmmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.Feature#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends AbstractFeature {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(Domain)
	 * @see pcmmm.PcmmmPackage#getFeature_Domain()
	 * @model required="true"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link pcmmm.Feature#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

} // Feature
