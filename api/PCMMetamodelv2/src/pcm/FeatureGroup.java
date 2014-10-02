/**
 */
package pcm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcm.FeatureGroup#getSubfeatures <em>Subfeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcm.PcmPackage#getFeatureGroup()
 * @model
 * @generated
 */
public interface FeatureGroup extends AbstractFeature {
	/**
	 * Returns the value of the '<em><b>Subfeatures</b></em>' containment reference list.
	 * The list contents are of type {@link pcm.AbstractFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subfeatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfeatures</em>' containment reference list.
	 * @see pcm.PcmPackage#getFeatureGroup_Subfeatures()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractFeature> getSubfeatures();

} // FeatureGroup
