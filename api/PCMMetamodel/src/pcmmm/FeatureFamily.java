/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.FeatureFamily#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getFeatureFamily()
 * @model
 * @generated
 */
public interface FeatureFamily extends AbstractFeature {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link pcmmm.AbstractFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see pcmmm.PcmmmPackage#getFeatureFamily_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractFeature> getFeatures();

} // FeatureFamily
