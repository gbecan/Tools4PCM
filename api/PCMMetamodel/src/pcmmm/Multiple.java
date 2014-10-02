/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.Multiple#getContraints <em>Contraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getMultiple()
 * @model
 * @generated
 */
public interface Multiple extends Constraint {
	/**
	 * Returns the value of the '<em><b>Contraints</b></em>' containment reference list.
	 * The list contents are of type {@link pcmmm.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraints</em>' containment reference list.
	 * @see pcmmm.PcmmmPackage#getMultiple_Contraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getContraints();

} // Multiple
