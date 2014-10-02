/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valued Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.ValuedCell#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link pcmmm.ValuedCell#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link pcmmm.ValuedCell#getMyHeaderProducts <em>My Header Products</em>}</li>
 *   <li>{@link pcmmm.ValuedCell#getMyHeaderFeatures <em>My Header Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getValuedCell()
 * @model
 * @generated
 */
public interface ValuedCell extends Cell {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' containment reference.
	 * @see #setInterpretation(Constraint)
	 * @see pcmmm.PcmmmPackage#getValuedCell_Interpretation()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getInterpretation();

	/**
	 * Sets the value of the '{@link pcmmm.ValuedCell#getInterpretation <em>Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' containment reference.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(Constraint value);

	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' reference list.
	 * The list contents are of type {@link pcmmm.VariabilityConcept}.
	 * It is bidirectional and its opposite is '{@link pcmmm.VariabilityConcept#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' reference list.
	 * @see pcmmm.PcmmmPackage#getValuedCell_Concepts()
	 * @see pcmmm.VariabilityConcept#getConstraints
	 * @model opposite="constraints"
	 * @generated
	 */
	EList<VariabilityConcept> getConcepts();

	/**
	 * Returns the value of the '<em><b>My Header Products</b></em>' reference list.
	 * The list contents are of type {@link pcmmm.AbstractProduct}.
	 * It is bidirectional and its opposite is '{@link pcmmm.AbstractProduct#getMyValuedCells <em>My Valued Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Header Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Header Products</em>' reference list.
	 * @see pcmmm.PcmmmPackage#getValuedCell_MyHeaderProducts()
	 * @see pcmmm.AbstractProduct#getMyValuedCells
	 * @model opposite="myValuedCells" required="true"
	 * @generated
	 */
	EList<AbstractProduct> getMyHeaderProducts();

	/**
	 * Returns the value of the '<em><b>My Header Features</b></em>' reference list.
	 * The list contents are of type {@link pcmmm.AbstractFeature}.
	 * It is bidirectional and its opposite is '{@link pcmmm.AbstractFeature#getMyValuedCells <em>My Valued Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Header Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Header Features</em>' reference list.
	 * @see pcmmm.PcmmmPackage#getValuedCell_MyHeaderFeatures()
	 * @see pcmmm.AbstractFeature#getMyValuedCells
	 * @model opposite="myValuedCells" required="true"
	 * @generated
	 */
	EList<AbstractFeature> getMyHeaderFeatures();

} // ValuedCell
