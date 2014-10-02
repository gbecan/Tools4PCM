/**
 */
package pcmmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variability Concept Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.VariabilityConceptRef#getConcept <em>Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getVariabilityConceptRef()
 * @model
 * @generated
 */
public interface VariabilityConceptRef extends Simple {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(VariabilityConcept)
	 * @see pcmmm.PcmmmPackage#getVariabilityConceptRef_Concept()
	 * @model
	 * @generated
	 */
	VariabilityConcept getConcept();

	/**
	 * Sets the value of the '{@link pcmmm.VariabilityConceptRef#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(VariabilityConcept value);

} // VariabilityConceptRef
