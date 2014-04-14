/**
 */
package pcmmm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcmmm.PcmmmPackage
 * @generated
 */
public interface PcmmmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmmmFactory eINSTANCE = pcmmm.impl.PcmmmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM</em>'.
	 * @generated
	 */
	PCM createPCM();

	/**
	 * Returns a new object of class '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix</em>'.
	 * @generated
	 */
	Matrix createMatrix();

	/**
	 * Returns a new object of class '<em>Product Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Family</em>'.
	 * @generated
	 */
	ProductFamily createProductFamily();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Feature Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Family</em>'.
	 * @generated
	 */
	FeatureFamily createFeatureFamily();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns a new object of class '<em>Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extra</em>'.
	 * @generated
	 */
	Extra createExtra();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Partial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial</em>'.
	 * @generated
	 */
	Partial createPartial();

	/**
	 * Returns a new object of class '<em>Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple</em>'.
	 * @generated
	 */
	Multiple createMultiple();

	/**
	 * Returns a new object of class '<em>Unknown</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown</em>'.
	 * @generated
	 */
	Unknown createUnknown();

	/**
	 * Returns a new object of class '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty</em>'.
	 * @generated
	 */
	Empty createEmpty();

	/**
	 * Returns a new object of class '<em>Inconsistent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inconsistent</em>'.
	 * @generated
	 */
	Inconsistent createInconsistent();

	/**
	 * Returns a new object of class '<em>Valued Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valued Cell</em>'.
	 * @generated
	 */
	ValuedCell createValuedCell();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>XOr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XOr</em>'.
	 * @generated
	 */
	XOr createXOr();

	/**
	 * Returns a new object of class '<em>Domain Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Collection</em>'.
	 * @generated
	 */
	DomainCollection createDomainCollection();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns a new object of class '<em>Variability Concept Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variability Concept Ref</em>'.
	 * @generated
	 */
	VariabilityConceptRef createVariabilityConceptRef();

	/**
	 * Returns a new object of class '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer</em>'.
	 * @generated
	 */
	Integer createInteger();

	/**
	 * Returns a new object of class '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double</em>'.
	 * @generated
	 */
	Double createDouble();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcmmmPackage getPcmmmPackage();

} //PcmmmFactory
