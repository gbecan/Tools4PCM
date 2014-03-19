/**
 */
package pcmmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.Partial#getCondition <em>Condition</em>}</li>
 *   <li>{@link pcmmm.Partial#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getPartial()
 * @model
 * @generated
 */
public interface Partial extends Constraint {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Constraint)
	 * @see pcmmm.PcmmmPackage#getPartial_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getCondition();

	/**
	 * Sets the value of the '{@link pcmmm.Partial#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Constraint)
	 * @see pcmmm.PcmmmPackage#getPartial_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getArgument();

	/**
	 * Sets the value of the '{@link pcmmm.Partial#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Constraint value);

} // Partial
