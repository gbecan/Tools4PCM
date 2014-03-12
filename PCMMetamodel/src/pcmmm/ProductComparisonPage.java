/**
 */
package pcmmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Comparison Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.ProductComparisonPage#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link pcmmm.ProductComparisonPage#getTitle <em>Title</em>}</li>
 *   <li>{@link pcmmm.ProductComparisonPage#getDescription <em>Description</em>}</li>
 *   <li>{@link pcmmm.ProductComparisonPage#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link pcmmm.ProductComparisonPage#getName <em>Name</em>}</li>
 *   <li>{@link pcmmm.ProductComparisonPage#getDomainCollection <em>Domain Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getProductComparisonPage()
 * @model
 * @generated
 */
public interface ProductComparisonPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Perspectives</b></em>' containment reference list.
	 * The list contents are of type {@link pcmmm.PCM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspectives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspectives</em>' containment reference list.
	 * @see pcmmm.PcmmmPackage#getProductComparisonPage_Perspectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCM> getPerspectives();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see pcmmm.PcmmmPackage#getProductComparisonPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link pcmmm.ProductComparisonPage#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see pcmmm.PcmmmPackage#getProductComparisonPage_Description()
	 * @model
	 * @generated
	 */
	EList<String> getDescription();

	/**
	 * Returns the value of the '<em><b>Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link pcmmm.VariabilityConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concepts</em>' containment reference list.
	 * @see pcmmm.PcmmmPackage#getProductComparisonPage_Concepts()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariabilityConcept> getConcepts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pcmmm.PcmmmPackage#getProductComparisonPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pcmmm.ProductComparisonPage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Collection</em>' containment reference.
	 * @see #setDomainCollection(DomainCollection)
	 * @see pcmmm.PcmmmPackage#getProductComparisonPage_DomainCollection()
	 * @model containment="true"
	 * @generated
	 */
	DomainCollection getDomainCollection();

	/**
	 * Sets the value of the '{@link pcmmm.ProductComparisonPage#getDomainCollection <em>Domain Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Collection</em>' containment reference.
	 * @see #getDomainCollection()
	 * @generated
	 */
	void setDomainCollection(DomainCollection value);

} // ProductComparisonPage
