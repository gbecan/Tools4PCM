/**
 */
package pcmmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pcmmm.PcmmmFactory
 * @model kind="package"
 * @generated
 */
public interface PcmmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcmmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "pcmmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcmmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmmmPackage eINSTANCE = pcmmm.impl.PcmmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcmmm.impl.VariabilityConceptImpl <em>Variability Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.VariabilityConceptImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getVariabilityConcept()
	 * @generated
	 */
	int VARIABILITY_CONCEPT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT__CONSTRAINTS = 1;

	/**
	 * The number of structural features of the '<em>Variability Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variability Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.AbstractProductImpl <em>Abstract Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.AbstractProductImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getAbstractProduct()
	 * @generated
	 */
	int ABSTRACT_PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__NAME = VARIABILITY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__CONSTRAINTS = VARIABILITY_CONCEPT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>My Valued Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT__MY_VALUED_CELLS = VARIABILITY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT_FEATURE_COUNT = VARIABILITY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PRODUCT_OPERATION_COUNT = VARIABILITY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.CellImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__VERBATIM = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__NOTE = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__LINK = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ROW = 4;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ROWSPAN = 5;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COLUMN = 6;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COLSPAN = 7;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.AbstractFeatureImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getAbstractFeature()
	 * @generated
	 */
	int ABSTRACT_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__NAME = VARIABILITY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__CONSTRAINTS = VARIABILITY_CONCEPT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>My Valued Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE__MY_VALUED_CELLS = VARIABILITY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_FEATURE_COUNT = VARIABILITY_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_OPERATION_COUNT = VARIABILITY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.PCMImpl <em>PCM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.PCMImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getPCM()
	 * @generated
	 */
	int PCM = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Matrices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM__MATRICES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM__CONCEPTS = 4;

	/**
	 * The feature id for the '<em><b>Domain Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM__DOMAIN_COLLECTION = 5;

	/**
	 * The number of structural features of the '<em>PCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>PCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.MatrixImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__CELLS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__ID = 2;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.ProductFamilyImpl <em>Product Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.ProductFamilyImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getProductFamily()
	 * @generated
	 */
	int PRODUCT_FAMILY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FAMILY__NAME = ABSTRACT_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FAMILY__CONSTRAINTS = ABSTRACT_PRODUCT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>My Valued Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FAMILY__MY_VALUED_CELLS = ABSTRACT_PRODUCT__MY_VALUED_CELLS;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FAMILY__PRODUCTS = ABSTRACT_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FAMILY_FEATURE_COUNT = ABSTRACT_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FAMILY_OPERATION_COUNT = ABSTRACT_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.ProductImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ABSTRACT_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONSTRAINTS = ABSTRACT_PRODUCT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>My Valued Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MY_VALUED_CELLS = ABSTRACT_PRODUCT__MY_VALUED_CELLS;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ABSTRACT_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = ABSTRACT_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.FeatureFamilyImpl <em>Feature Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.FeatureFamilyImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getFeatureFamily()
	 * @generated
	 */
	int FEATURE_FAMILY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FAMILY__NAME = ABSTRACT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FAMILY__CONSTRAINTS = ABSTRACT_FEATURE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>My Valued Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FAMILY__MY_VALUED_CELLS = ABSTRACT_FEATURE__MY_VALUED_CELLS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FAMILY__FEATURES = ABSTRACT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FAMILY_FEATURE_COUNT = ABSTRACT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FAMILY_OPERATION_COUNT = ABSTRACT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.FeatureImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = ABSTRACT_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONSTRAINTS = ABSTRACT_FEATURE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>My Valued Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MY_VALUED_CELLS = ABSTRACT_FEATURE__MY_VALUED_CELLS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DOMAIN = ABSTRACT_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = ABSTRACT_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = ABSTRACT_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.HeaderImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = CELL__NAME;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__VERBATIM = CELL__VERBATIM;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NOTE = CELL__NOTE;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__LINK = CELL__LINK;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ROW = CELL__ROW;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ROWSPAN = CELL__ROWSPAN;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__COLUMN = CELL__COLUMN;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__COLSPAN = CELL__COLSPAN;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__CONCEPT = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.ExtraImpl <em>Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.ExtraImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getExtra()
	 * @generated
	 */
	int EXTRA = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__NAME = CELL__NAME;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__VERBATIM = CELL__VERBATIM;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__NOTE = CELL__NOTE;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__LINK = CELL__LINK;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__ROW = CELL__ROW;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__ROWSPAN = CELL__ROWSPAN;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__COLUMN = CELL__COLUMN;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__COLSPAN = CELL__COLSPAN;

	/**
	 * The number of structural features of the '<em>Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FEATURE_COUNT = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.ConstraintImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONFIDENT = 1;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VERBATIM = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.SimpleImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__CONFIDENT = CONSTRAINT__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__VERBATIM = CONSTRAINT__VERBATIM;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.BooleanImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = SIMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__CONFIDENT = SIMPLE__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VERBATIM = SIMPLE__VERBATIM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VALUE = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.PartialImpl <em>Partial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.PartialImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getPartial()
	 * @generated
	 */
	int PARTIAL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL__CONFIDENT = CONSTRAINT__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL__VERBATIM = CONSTRAINT__VERBATIM;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL__CONDITION = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL__ARGUMENT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Partial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.MultipleImpl <em>Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.MultipleImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getMultiple()
	 * @generated
	 */
	int MULTIPLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__CONFIDENT = CONSTRAINT__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__VERBATIM = CONSTRAINT__VERBATIM;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE__CONTRAINTS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.UnknownImpl <em>Unknown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.UnknownImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getUnknown()
	 * @generated
	 */
	int UNKNOWN = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN__CONFIDENT = CONSTRAINT__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN__VERBATIM = CONSTRAINT__VERBATIM;

	/**
	 * The number of structural features of the '<em>Unknown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unknown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.EmptyImpl <em>Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.EmptyImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getEmpty()
	 * @generated
	 */
	int EMPTY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__CONFIDENT = CONSTRAINT__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__VERBATIM = CONSTRAINT__VERBATIM;

	/**
	 * The number of structural features of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.InconsistentImpl <em>Inconsistent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.InconsistentImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getInconsistent()
	 * @generated
	 */
	int INCONSISTENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENT__CONFIDENT = CONSTRAINT__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENT__VERBATIM = CONSTRAINT__VERBATIM;

	/**
	 * The number of structural features of the '<em>Inconsistent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inconsistent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCONSISTENT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.ValuedCellImpl <em>Valued Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.ValuedCellImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getValuedCell()
	 * @generated
	 */
	int VALUED_CELL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__NAME = CELL__NAME;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__VERBATIM = CELL__VERBATIM;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__NOTE = CELL__NOTE;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__LINK = CELL__LINK;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__ROW = CELL__ROW;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__ROWSPAN = CELL__ROWSPAN;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__COLUMN = CELL__COLUMN;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__COLSPAN = CELL__COLSPAN;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__INTERPRETATION = CELL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__CONCEPTS = CELL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>My Header Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__MY_HEADER_PRODUCTS = CELL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>My Header Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL__MY_HEADER_FEATURES = CELL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Valued Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Valued Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.AndImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = MULTIPLE__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__CONFIDENT = MULTIPLE__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__VERBATIM = MULTIPLE__VERBATIM;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__CONTRAINTS = MULTIPLE__CONTRAINTS;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = MULTIPLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = MULTIPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.OrImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getOr()
	 * @generated
	 */
	int OR = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = MULTIPLE__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__CONFIDENT = MULTIPLE__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__VERBATIM = MULTIPLE__VERBATIM;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__CONTRAINTS = MULTIPLE__CONTRAINTS;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = MULTIPLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = MULTIPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.XOrImpl <em>XOr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.XOrImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getXOr()
	 * @generated
	 */
	int XOR = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__NAME = MULTIPLE__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__CONFIDENT = MULTIPLE__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__VERBATIM = MULTIPLE__VERBATIM;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__CONTRAINTS = MULTIPLE__CONTRAINTS;

	/**
	 * The number of structural features of the '<em>XOr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = MULTIPLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XOr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = MULTIPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.DomainImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.DomainCollectionImpl <em>Domain Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.DomainCollectionImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getDomainCollection()
	 * @generated
	 */
	int DOMAIN_COLLECTION = 25;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_COLLECTION__DOMAINS = 0;

	/**
	 * The number of structural features of the '<em>Domain Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.EnumImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALUES = DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.VariabilityConceptRefImpl <em>Variability Concept Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.VariabilityConceptRefImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getVariabilityConceptRef()
	 * @generated
	 */
	int VARIABILITY_CONCEPT_REF = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT_REF__NAME = SIMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT_REF__CONFIDENT = SIMPLE__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT_REF__VERBATIM = SIMPLE__VERBATIM;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT_REF__CONCEPT = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variability Concept Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT_REF_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variability Concept Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABILITY_CONCEPT_REF_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.IntegerImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NAME = SIMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__CONFIDENT = SIMPLE__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VERBATIM = SIMPLE__VERBATIM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcmmm.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcmmm.impl.DoubleImpl
	 * @see pcmmm.impl.PcmmmPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__NAME = SIMPLE__NAME;

	/**
	 * The feature id for the '<em><b>Confident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__CONFIDENT = SIMPLE__CONFIDENT;

	/**
	 * The feature id for the '<em><b>Verbatim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__VERBATIM = SIMPLE__VERBATIM;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__VALUE = SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_OPERATION_COUNT = SIMPLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcmmm.AbstractProduct <em>Abstract Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Product</em>'.
	 * @see pcmmm.AbstractProduct
	 * @generated
	 */
	EClass getAbstractProduct();

	/**
	 * Returns the meta object for the reference list '{@link pcmmm.AbstractProduct#getMyValuedCells <em>My Valued Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>My Valued Cells</em>'.
	 * @see pcmmm.AbstractProduct#getMyValuedCells()
	 * @see #getAbstractProduct()
	 * @generated
	 */
	EReference getAbstractProduct_MyValuedCells();

	/**
	 * Returns the meta object for class '{@link pcmmm.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see pcmmm.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Cell#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcmmm.Cell#getName()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Name();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Cell#getVerbatim <em>Verbatim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verbatim</em>'.
	 * @see pcmmm.Cell#getVerbatim()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Verbatim();

	/**
	 * Returns the meta object for the attribute list '{@link pcmmm.Cell#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Note</em>'.
	 * @see pcmmm.Cell#getNote()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Note();

	/**
	 * Returns the meta object for the attribute list '{@link pcmmm.Cell#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Link</em>'.
	 * @see pcmmm.Cell#getLink()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Link();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Cell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see pcmmm.Cell#getRow()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Row();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Cell#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see pcmmm.Cell#getRowspan()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Cell#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see pcmmm.Cell#getColumn()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Column();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Cell#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see pcmmm.Cell#getColspan()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Colspan();

	/**
	 * Returns the meta object for class '{@link pcmmm.AbstractFeature <em>Abstract Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature</em>'.
	 * @see pcmmm.AbstractFeature
	 * @generated
	 */
	EClass getAbstractFeature();

	/**
	 * Returns the meta object for the reference list '{@link pcmmm.AbstractFeature#getMyValuedCells <em>My Valued Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>My Valued Cells</em>'.
	 * @see pcmmm.AbstractFeature#getMyValuedCells()
	 * @see #getAbstractFeature()
	 * @generated
	 */
	EReference getAbstractFeature_MyValuedCells();

	/**
	 * Returns the meta object for class '{@link pcmmm.PCM <em>PCM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM</em>'.
	 * @see pcmmm.PCM
	 * @generated
	 */
	EClass getPCM();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.PCM#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see pcmmm.PCM#getTitle()
	 * @see #getPCM()
	 * @generated
	 */
	EAttribute getPCM_Title();

	/**
	 * Returns the meta object for the attribute list '{@link pcmmm.PCM#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see pcmmm.PCM#getDescription()
	 * @see #getPCM()
	 * @generated
	 */
	EAttribute getPCM_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link pcmmm.PCM#getMatrices <em>Matrices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrices</em>'.
	 * @see pcmmm.PCM#getMatrices()
	 * @see #getPCM()
	 * @generated
	 */
	EReference getPCM_Matrices();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.PCM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcmmm.PCM#getName()
	 * @see #getPCM()
	 * @generated
	 */
	EAttribute getPCM_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pcmmm.PCM#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concepts</em>'.
	 * @see pcmmm.PCM#getConcepts()
	 * @see #getPCM()
	 * @generated
	 */
	EReference getPCM_Concepts();

	/**
	 * Returns the meta object for the containment reference '{@link pcmmm.PCM#getDomainCollection <em>Domain Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Collection</em>'.
	 * @see pcmmm.PCM#getDomainCollection()
	 * @see #getPCM()
	 * @generated
	 */
	EReference getPCM_DomainCollection();

	/**
	 * Returns the meta object for class '{@link pcmmm.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see pcmmm.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Matrix#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcmmm.Matrix#getName()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pcmmm.Matrix#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see pcmmm.Matrix#getCells()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Cells();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Matrix#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pcmmm.Matrix#getId()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Id();

	/**
	 * Returns the meta object for class '{@link pcmmm.ProductFamily <em>Product Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Family</em>'.
	 * @see pcmmm.ProductFamily
	 * @generated
	 */
	EClass getProductFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link pcmmm.ProductFamily#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see pcmmm.ProductFamily#getProducts()
	 * @see #getProductFamily()
	 * @generated
	 */
	EReference getProductFamily_Products();

	/**
	 * Returns the meta object for class '{@link pcmmm.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see pcmmm.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for class '{@link pcmmm.FeatureFamily <em>Feature Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Family</em>'.
	 * @see pcmmm.FeatureFamily
	 * @generated
	 */
	EClass getFeatureFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link pcmmm.FeatureFamily#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see pcmmm.FeatureFamily#getFeatures()
	 * @see #getFeatureFamily()
	 * @generated
	 */
	EReference getFeatureFamily_Features();

	/**
	 * Returns the meta object for class '{@link pcmmm.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see pcmmm.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference '{@link pcmmm.Feature#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see pcmmm.Feature#getDomain()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Domain();

	/**
	 * Returns the meta object for class '{@link pcmmm.VariabilityConcept <em>Variability Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability Concept</em>'.
	 * @see pcmmm.VariabilityConcept
	 * @generated
	 */
	EClass getVariabilityConcept();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.VariabilityConcept#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcmmm.VariabilityConcept#getName()
	 * @see #getVariabilityConcept()
	 * @generated
	 */
	EAttribute getVariabilityConcept_Name();

	/**
	 * Returns the meta object for the reference list '{@link pcmmm.VariabilityConcept#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraints</em>'.
	 * @see pcmmm.VariabilityConcept#getConstraints()
	 * @see #getVariabilityConcept()
	 * @generated
	 */
	EReference getVariabilityConcept_Constraints();

	/**
	 * Returns the meta object for class '{@link pcmmm.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see pcmmm.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the reference '{@link pcmmm.Header#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see pcmmm.Header#getConcept()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Concept();

	/**
	 * Returns the meta object for class '{@link pcmmm.Extra <em>Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra</em>'.
	 * @see pcmmm.Extra
	 * @generated
	 */
	EClass getExtra();

	/**
	 * Returns the meta object for class '{@link pcmmm.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see pcmmm.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcmmm.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Constraint#isConfident <em>Confident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confident</em>'.
	 * @see pcmmm.Constraint#isConfident()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Confident();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Constraint#getVerbatim <em>Verbatim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verbatim</em>'.
	 * @see pcmmm.Constraint#getVerbatim()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Verbatim();

	/**
	 * Returns the meta object for class '{@link pcmmm.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see pcmmm.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Boolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pcmmm.Boolean#isValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Value();

	/**
	 * Returns the meta object for class '{@link pcmmm.Partial <em>Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial</em>'.
	 * @see pcmmm.Partial
	 * @generated
	 */
	EClass getPartial();

	/**
	 * Returns the meta object for the containment reference '{@link pcmmm.Partial#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see pcmmm.Partial#getCondition()
	 * @see #getPartial()
	 * @generated
	 */
	EReference getPartial_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link pcmmm.Partial#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see pcmmm.Partial#getArgument()
	 * @see #getPartial()
	 * @generated
	 */
	EReference getPartial_Argument();

	/**
	 * Returns the meta object for class '{@link pcmmm.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see pcmmm.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for class '{@link pcmmm.Multiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple</em>'.
	 * @see pcmmm.Multiple
	 * @generated
	 */
	EClass getMultiple();

	/**
	 * Returns the meta object for the containment reference list '{@link pcmmm.Multiple#getContraints <em>Contraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contraints</em>'.
	 * @see pcmmm.Multiple#getContraints()
	 * @see #getMultiple()
	 * @generated
	 */
	EReference getMultiple_Contraints();

	/**
	 * Returns the meta object for class '{@link pcmmm.Unknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown</em>'.
	 * @see pcmmm.Unknown
	 * @generated
	 */
	EClass getUnknown();

	/**
	 * Returns the meta object for class '{@link pcmmm.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty</em>'.
	 * @see pcmmm.Empty
	 * @generated
	 */
	EClass getEmpty();

	/**
	 * Returns the meta object for class '{@link pcmmm.Inconsistent <em>Inconsistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inconsistent</em>'.
	 * @see pcmmm.Inconsistent
	 * @generated
	 */
	EClass getInconsistent();

	/**
	 * Returns the meta object for class '{@link pcmmm.ValuedCell <em>Valued Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valued Cell</em>'.
	 * @see pcmmm.ValuedCell
	 * @generated
	 */
	EClass getValuedCell();

	/**
	 * Returns the meta object for the containment reference '{@link pcmmm.ValuedCell#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpretation</em>'.
	 * @see pcmmm.ValuedCell#getInterpretation()
	 * @see #getValuedCell()
	 * @generated
	 */
	EReference getValuedCell_Interpretation();

	/**
	 * Returns the meta object for the reference list '{@link pcmmm.ValuedCell#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concepts</em>'.
	 * @see pcmmm.ValuedCell#getConcepts()
	 * @see #getValuedCell()
	 * @generated
	 */
	EReference getValuedCell_Concepts();

	/**
	 * Returns the meta object for the reference list '{@link pcmmm.ValuedCell#getMyHeaderProducts <em>My Header Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>My Header Products</em>'.
	 * @see pcmmm.ValuedCell#getMyHeaderProducts()
	 * @see #getValuedCell()
	 * @generated
	 */
	EReference getValuedCell_MyHeaderProducts();

	/**
	 * Returns the meta object for the reference list '{@link pcmmm.ValuedCell#getMyHeaderFeatures <em>My Header Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>My Header Features</em>'.
	 * @see pcmmm.ValuedCell#getMyHeaderFeatures()
	 * @see #getValuedCell()
	 * @generated
	 */
	EReference getValuedCell_MyHeaderFeatures();

	/**
	 * Returns the meta object for class '{@link pcmmm.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see pcmmm.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link pcmmm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see pcmmm.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link pcmmm.XOr <em>XOr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOr</em>'.
	 * @see pcmmm.XOr
	 * @generated
	 */
	EClass getXOr();

	/**
	 * Returns the meta object for class '{@link pcmmm.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see pcmmm.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcmmm.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for class '{@link pcmmm.DomainCollection <em>Domain Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Collection</em>'.
	 * @see pcmmm.DomainCollection
	 * @generated
	 */
	EClass getDomainCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link pcmmm.DomainCollection#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see pcmmm.DomainCollection#getDomains()
	 * @see #getDomainCollection()
	 * @generated
	 */
	EReference getDomainCollection_Domains();

	/**
	 * Returns the meta object for class '{@link pcmmm.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see pcmmm.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the reference list '{@link pcmmm.Enum#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see pcmmm.Enum#getValues()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Values();

	/**
	 * Returns the meta object for class '{@link pcmmm.VariabilityConceptRef <em>Variability Concept Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variability Concept Ref</em>'.
	 * @see pcmmm.VariabilityConceptRef
	 * @generated
	 */
	EClass getVariabilityConceptRef();

	/**
	 * Returns the meta object for the reference '{@link pcmmm.VariabilityConceptRef#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see pcmmm.VariabilityConceptRef#getConcept()
	 * @see #getVariabilityConceptRef()
	 * @generated
	 */
	EReference getVariabilityConceptRef_Concept();

	/**
	 * Returns the meta object for class '{@link pcmmm.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see pcmmm.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pcmmm.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link pcmmm.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see pcmmm.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for the attribute '{@link pcmmm.Double#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pcmmm.Double#getValue()
	 * @see #getDouble()
	 * @generated
	 */
	EAttribute getDouble_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcmmmFactory getPcmmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pcmmm.impl.AbstractProductImpl <em>Abstract Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.AbstractProductImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getAbstractProduct()
		 * @generated
		 */
		EClass ABSTRACT_PRODUCT = eINSTANCE.getAbstractProduct();

		/**
		 * The meta object literal for the '<em><b>My Valued Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PRODUCT__MY_VALUED_CELLS = eINSTANCE.getAbstractProduct_MyValuedCells();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.CellImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__NAME = eINSTANCE.getCell_Name();

		/**
		 * The meta object literal for the '<em><b>Verbatim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__VERBATIM = eINSTANCE.getCell_Verbatim();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__NOTE = eINSTANCE.getCell_Note();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__LINK = eINSTANCE.getCell_Link();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ROW = eINSTANCE.getCell_Row();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ROWSPAN = eINSTANCE.getCell_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__COLUMN = eINSTANCE.getCell_Column();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__COLSPAN = eINSTANCE.getCell_Colspan();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.AbstractFeatureImpl <em>Abstract Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.AbstractFeatureImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getAbstractFeature()
		 * @generated
		 */
		EClass ABSTRACT_FEATURE = eINSTANCE.getAbstractFeature();

		/**
		 * The meta object literal for the '<em><b>My Valued Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_FEATURE__MY_VALUED_CELLS = eINSTANCE.getAbstractFeature_MyValuedCells();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.PCMImpl <em>PCM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.PCMImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getPCM()
		 * @generated
		 */
		EClass PCM = eINSTANCE.getPCM();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM__TITLE = eINSTANCE.getPCM_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM__DESCRIPTION = eINSTANCE.getPCM_Description();

		/**
		 * The meta object literal for the '<em><b>Matrices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM__MATRICES = eINSTANCE.getPCM_Matrices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCM__NAME = eINSTANCE.getPCM_Name();

		/**
		 * The meta object literal for the '<em><b>Concepts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM__CONCEPTS = eINSTANCE.getPCM_Concepts();

		/**
		 * The meta object literal for the '<em><b>Domain Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCM__DOMAIN_COLLECTION = eINSTANCE.getPCM_DomainCollection();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.MatrixImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__NAME = eINSTANCE.getMatrix_Name();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__CELLS = eINSTANCE.getMatrix_Cells();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__ID = eINSTANCE.getMatrix_Id();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.ProductFamilyImpl <em>Product Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.ProductFamilyImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getProductFamily()
		 * @generated
		 */
		EClass PRODUCT_FAMILY = eINSTANCE.getProductFamily();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FAMILY__PRODUCTS = eINSTANCE.getProductFamily_Products();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.ProductImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.FeatureFamilyImpl <em>Feature Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.FeatureFamilyImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getFeatureFamily()
		 * @generated
		 */
		EClass FEATURE_FAMILY = eINSTANCE.getFeatureFamily();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_FAMILY__FEATURES = eINSTANCE.getFeatureFamily_Features();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.FeatureImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__DOMAIN = eINSTANCE.getFeature_Domain();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.VariabilityConceptImpl <em>Variability Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.VariabilityConceptImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getVariabilityConcept()
		 * @generated
		 */
		EClass VARIABILITY_CONCEPT = eINSTANCE.getVariabilityConcept();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABILITY_CONCEPT__NAME = eINSTANCE.getVariabilityConcept_Name();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_CONCEPT__CONSTRAINTS = eINSTANCE.getVariabilityConcept_Constraints();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.HeaderImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__CONCEPT = eINSTANCE.getHeader_Concept();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.ExtraImpl <em>Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.ExtraImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getExtra()
		 * @generated
		 */
		EClass EXTRA = eINSTANCE.getExtra();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.ConstraintImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Confident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CONFIDENT = eINSTANCE.getConstraint_Confident();

		/**
		 * The meta object literal for the '<em><b>Verbatim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__VERBATIM = eINSTANCE.getConstraint_Verbatim();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.BooleanImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.PartialImpl <em>Partial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.PartialImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getPartial()
		 * @generated
		 */
		EClass PARTIAL = eINSTANCE.getPartial();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL__CONDITION = eINSTANCE.getPartial_Condition();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL__ARGUMENT = eINSTANCE.getPartial_Argument();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.SimpleImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.MultipleImpl <em>Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.MultipleImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getMultiple()
		 * @generated
		 */
		EClass MULTIPLE = eINSTANCE.getMultiple();

		/**
		 * The meta object literal for the '<em><b>Contraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE__CONTRAINTS = eINSTANCE.getMultiple_Contraints();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.UnknownImpl <em>Unknown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.UnknownImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getUnknown()
		 * @generated
		 */
		EClass UNKNOWN = eINSTANCE.getUnknown();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.EmptyImpl <em>Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.EmptyImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getEmpty()
		 * @generated
		 */
		EClass EMPTY = eINSTANCE.getEmpty();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.InconsistentImpl <em>Inconsistent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.InconsistentImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getInconsistent()
		 * @generated
		 */
		EClass INCONSISTENT = eINSTANCE.getInconsistent();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.ValuedCellImpl <em>Valued Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.ValuedCellImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getValuedCell()
		 * @generated
		 */
		EClass VALUED_CELL = eINSTANCE.getValuedCell();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUED_CELL__INTERPRETATION = eINSTANCE.getValuedCell_Interpretation();

		/**
		 * The meta object literal for the '<em><b>Concepts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUED_CELL__CONCEPTS = eINSTANCE.getValuedCell_Concepts();

		/**
		 * The meta object literal for the '<em><b>My Header Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUED_CELL__MY_HEADER_PRODUCTS = eINSTANCE.getValuedCell_MyHeaderProducts();

		/**
		 * The meta object literal for the '<em><b>My Header Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUED_CELL__MY_HEADER_FEATURES = eINSTANCE.getValuedCell_MyHeaderFeatures();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.AndImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.OrImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.XOrImpl <em>XOr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.XOrImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getXOr()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXOr();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.DomainImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.DomainCollectionImpl <em>Domain Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.DomainCollectionImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getDomainCollection()
		 * @generated
		 */
		EClass DOMAIN_COLLECTION = eINSTANCE.getDomainCollection();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_COLLECTION__DOMAINS = eINSTANCE.getDomainCollection_Domains();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.EnumImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__VALUES = eINSTANCE.getEnum_Values();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.VariabilityConceptRefImpl <em>Variability Concept Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.VariabilityConceptRefImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getVariabilityConceptRef()
		 * @generated
		 */
		EClass VARIABILITY_CONCEPT_REF = eINSTANCE.getVariabilityConceptRef();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABILITY_CONCEPT_REF__CONCEPT = eINSTANCE.getVariabilityConceptRef_Concept();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.IntegerImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link pcmmm.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcmmm.impl.DoubleImpl
		 * @see pcmmm.impl.PcmmmPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE__VALUE = eINSTANCE.getDouble_Value();

	}

} //PcmmmPackage
