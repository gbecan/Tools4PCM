/**
 */
package pcmmm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pcmmm.AbstractFeature;
import pcmmm.AbstractProduct;
import pcmmm.And;
import pcmmm.Cell;
import pcmmm.Constraint;
import pcmmm.Domain;
import pcmmm.DomainCollection;
import pcmmm.Empty;
import pcmmm.Extra;
import pcmmm.Feature;
import pcmmm.FeatureFamily;
import pcmmm.Header;
import pcmmm.Inconsistent;
import pcmmm.Interval;
import pcmmm.Matrix;
import pcmmm.Multiple;
import pcmmm.Or;
import pcmmm.OrderedDomain;
import pcmmm.Partial;
import pcmmm.PcmmmFactory;
import pcmmm.PcmmmPackage;
import pcmmm.Product;
import pcmmm.ProductFamily;
import pcmmm.Simple;
import pcmmm.Type;
import pcmmm.Unknwon;
import pcmmm.ValuedCell;
import pcmmm.VariabilityConcept;
import pcmmm.XOr;
import pcmmm.YesNO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmmmPackageImpl extends EPackageImpl implements PcmmmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variabilityConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknwonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inconsistentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuedCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yesNOEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pcmmm.PcmmmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcmmmPackageImpl() {
		super(eNS_URI, PcmmmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PcmmmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PcmmmPackage init() {
		if (isInited) return (PcmmmPackage)EPackage.Registry.INSTANCE.getEPackage(PcmmmPackage.eNS_URI);

		// Obtain or create and register package
		PcmmmPackageImpl thePcmmmPackage = (PcmmmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PcmmmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PcmmmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePcmmmPackage.createPackageContents();

		// Initialize created meta-data
		thePcmmmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcmmmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcmmmPackage.eNS_URI, thePcmmmPackage);
		return thePcmmmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractProduct() {
		return abstractProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Name() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Verbatim() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Note() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Link() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Row() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Rowspan() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Column() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Colspan() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeature() {
		return abstractFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM() {
		return pcmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCM_Title() {
		return (EAttribute)pcmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCM_Description() {
		return (EAttribute)pcmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_Matrix() {
		return (EReference)pcmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCM_Name() {
		return (EAttribute)pcmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_Concepts() {
		return (EReference)pcmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_DomainCollection() {
		return (EReference)pcmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrix() {
		return matrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_Name() {
		return (EAttribute)matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatrix_Cells() {
		return (EReference)matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductFamily() {
		return productFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductFamily_Products() {
		return (EReference)productFamilyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureFamily() {
		return featureFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureFamily_Features() {
		return (EReference)featureFamilyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariabilityConcept() {
		return variabilityConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariabilityConcept_Name() {
		return (EAttribute)variabilityConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariabilityConcept_Constraints() {
		return (EReference)variabilityConceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_Concept() {
		return (EReference)headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtra() {
		return extraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Name() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraint__Eval() {
		return constraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartial() {
		return partialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartial_Condition() {
		return (EReference)partialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartial_Argument() {
		return (EReference)partialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple() {
		return simpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_Concept() {
		return (EReference)simpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiple() {
		return multipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiple_Contraints() {
		return (EReference)multipleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknwon() {
		return unknwonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpty() {
		return emptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInconsistent() {
		return inconsistentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuedCell() {
		return valuedCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuedCell_Interpretation() {
		return (EReference)valuedCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuedCell_Concepts() {
		return (EReference)valuedCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuedCell_MyHeaderProduct() {
		return (EReference)valuedCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuedCell_MyHeaderFeature() {
		return (EReference)valuedCellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXOr() {
		return xOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Intervals() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_DomainLitteral() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_DomainType() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_Name() {
		return (EAttribute)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_Value() {
		return (EAttribute)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainCollection() {
		return domainCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainCollection_Domains() {
		return (EReference)domainCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedDomain() {
		return orderedDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderedDomain_Previous() {
		return (EReference)orderedDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderedDomain_Next() {
		return (EReference)orderedDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYesNO() {
		return yesNOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getYesNO__Eval() {
		return yesNOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmmmFactory getPcmmmFactory() {
		return (PcmmmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractProductEClass = createEClass(ABSTRACT_PRODUCT);

		cellEClass = createEClass(CELL);
		createEAttribute(cellEClass, CELL__NAME);
		createEAttribute(cellEClass, CELL__VERBATIM);
		createEAttribute(cellEClass, CELL__NOTE);
		createEAttribute(cellEClass, CELL__LINK);
		createEAttribute(cellEClass, CELL__ROW);
		createEAttribute(cellEClass, CELL__ROWSPAN);
		createEAttribute(cellEClass, CELL__COLUMN);
		createEAttribute(cellEClass, CELL__COLSPAN);

		abstractFeatureEClass = createEClass(ABSTRACT_FEATURE);

		pcmEClass = createEClass(PCM);
		createEAttribute(pcmEClass, PCM__TITLE);
		createEAttribute(pcmEClass, PCM__DESCRIPTION);
		createEReference(pcmEClass, PCM__MATRIX);
		createEAttribute(pcmEClass, PCM__NAME);
		createEReference(pcmEClass, PCM__CONCEPTS);
		createEReference(pcmEClass, PCM__DOMAIN_COLLECTION);

		matrixEClass = createEClass(MATRIX);
		createEAttribute(matrixEClass, MATRIX__NAME);
		createEReference(matrixEClass, MATRIX__CELLS);

		productFamilyEClass = createEClass(PRODUCT_FAMILY);
		createEReference(productFamilyEClass, PRODUCT_FAMILY__PRODUCTS);

		productEClass = createEClass(PRODUCT);

		featureFamilyEClass = createEClass(FEATURE_FAMILY);
		createEReference(featureFamilyEClass, FEATURE_FAMILY__FEATURES);

		featureEClass = createEClass(FEATURE);

		variabilityConceptEClass = createEClass(VARIABILITY_CONCEPT);
		createEAttribute(variabilityConceptEClass, VARIABILITY_CONCEPT__NAME);
		createEReference(variabilityConceptEClass, VARIABILITY_CONCEPT__CONSTRAINTS);

		headerEClass = createEClass(HEADER);
		createEReference(headerEClass, HEADER__CONCEPT);

		extraEClass = createEClass(EXTRA);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);
		createEOperation(constraintEClass, CONSTRAINT___EVAL);

		booleanEClass = createEClass(BOOLEAN);

		partialEClass = createEClass(PARTIAL);
		createEReference(partialEClass, PARTIAL__CONDITION);
		createEReference(partialEClass, PARTIAL__ARGUMENT);

		simpleEClass = createEClass(SIMPLE);
		createEReference(simpleEClass, SIMPLE__CONCEPT);

		multipleEClass = createEClass(MULTIPLE);
		createEReference(multipleEClass, MULTIPLE__CONTRAINTS);

		unknwonEClass = createEClass(UNKNWON);

		emptyEClass = createEClass(EMPTY);

		inconsistentEClass = createEClass(INCONSISTENT);

		valuedCellEClass = createEClass(VALUED_CELL);
		createEReference(valuedCellEClass, VALUED_CELL__INTERPRETATION);
		createEReference(valuedCellEClass, VALUED_CELL__CONCEPTS);
		createEReference(valuedCellEClass, VALUED_CELL__MY_HEADER_PRODUCT);
		createEReference(valuedCellEClass, VALUED_CELL__MY_HEADER_FEATURE);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		xOrEClass = createEClass(XOR);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__INTERVALS);
		createEAttribute(domainEClass, DOMAIN__DOMAIN_LITTERAL);
		createEAttribute(domainEClass, DOMAIN__NAME);
		createEReference(domainEClass, DOMAIN__DOMAIN_TYPE);

		intervalEClass = createEClass(INTERVAL);
		createEAttribute(intervalEClass, INTERVAL__NAME);
		createEAttribute(intervalEClass, INTERVAL__VALUE);

		domainCollectionEClass = createEClass(DOMAIN_COLLECTION);
		createEReference(domainCollectionEClass, DOMAIN_COLLECTION__DOMAINS);

		typeEClass = createEClass(TYPE);

		orderedDomainEClass = createEClass(ORDERED_DOMAIN);
		createEReference(orderedDomainEClass, ORDERED_DOMAIN__PREVIOUS);
		createEReference(orderedDomainEClass, ORDERED_DOMAIN__NEXT);

		yesNOEClass = createEClass(YES_NO);
		createEOperation(yesNOEClass, YES_NO___EVAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractProductEClass.getESuperTypes().add(this.getVariabilityConcept());
		abstractFeatureEClass.getESuperTypes().add(this.getVariabilityConcept());
		productFamilyEClass.getESuperTypes().add(this.getAbstractProduct());
		productEClass.getESuperTypes().add(this.getAbstractProduct());
		featureFamilyEClass.getESuperTypes().add(this.getAbstractFeature());
		featureEClass.getESuperTypes().add(this.getAbstractFeature());
		headerEClass.getESuperTypes().add(this.getCell());
		extraEClass.getESuperTypes().add(this.getCell());
		booleanEClass.getESuperTypes().add(this.getConstraint());
		partialEClass.getESuperTypes().add(this.getConstraint());
		simpleEClass.getESuperTypes().add(this.getConstraint());
		multipleEClass.getESuperTypes().add(this.getConstraint());
		unknwonEClass.getESuperTypes().add(this.getConstraint());
		emptyEClass.getESuperTypes().add(this.getConstraint());
		inconsistentEClass.getESuperTypes().add(this.getConstraint());
		valuedCellEClass.getESuperTypes().add(this.getCell());
		andEClass.getESuperTypes().add(this.getMultiple());
		orEClass.getESuperTypes().add(this.getMultiple());
		xOrEClass.getESuperTypes().add(this.getMultiple());
		orderedDomainEClass.getESuperTypes().add(this.getDomain());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractProductEClass, AbstractProduct.class, "AbstractProduct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cellEClass, Cell.class, "Cell", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCell_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Verbatim(), ecorePackage.getEString(), "verbatim", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Note(), ecorePackage.getEString(), "note", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Link(), ecorePackage.getEString(), "link", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Row(), ecorePackage.getEInt(), "row", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Rowspan(), ecorePackage.getEInt(), "rowspan", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Column(), ecorePackage.getEInt(), "column", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Colspan(), ecorePackage.getEInt(), "colspan", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFeatureEClass, AbstractFeature.class, "AbstractFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcmEClass, pcmmm.PCM.class, "PCM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCM_Title(), ecorePackage.getEString(), "title", null, 0, 1, pcmmm.PCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCM_Description(), ecorePackage.getEString(), "description", null, 0, -1, pcmmm.PCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_Matrix(), this.getMatrix(), null, "matrix", null, 0, -1, pcmmm.PCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCM_Name(), ecorePackage.getEString(), "name", null, 0, 1, pcmmm.PCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_Concepts(), this.getVariabilityConcept(), null, "concepts", null, 0, -1, pcmmm.PCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_DomainCollection(), this.getDomainCollection(), null, "domainCollection", null, 1, 1, pcmmm.PCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrix_Name(), ecorePackage.getEString(), "name", null, 0, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatrix_Cells(), this.getCell(), null, "cells", null, 0, -1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productFamilyEClass, ProductFamily.class, "ProductFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductFamily_Products(), this.getAbstractProduct(), null, "products", null, 0, -1, ProductFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureFamilyEClass, FeatureFamily.class, "FeatureFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureFamily_Features(), this.getAbstractFeature(), null, "features", null, 1, -1, FeatureFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variabilityConceptEClass, VariabilityConcept.class, "VariabilityConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariabilityConcept_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariabilityConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariabilityConcept_Constraints(), this.getValuedCell(), this.getValuedCell_Concepts(), "constraints", null, 0, -1, VariabilityConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeader_Concept(), this.getVariabilityConcept(), null, "concept", null, 1, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extraEClass, Extra.class, "Extra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConstraint__Eval(), null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanEClass, pcmmm.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partialEClass, Partial.class, "Partial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartial_Condition(), this.getConstraint(), null, "condition", null, 1, 1, Partial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartial_Argument(), this.getConstraint(), null, "argument", null, 1, 1, Partial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleEClass, Simple.class, "Simple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimple_Concept(), this.getVariabilityConcept(), null, "concept", null, 1, 1, Simple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleEClass, Multiple.class, "Multiple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiple_Contraints(), this.getConstraint(), null, "contraints", null, 2, -1, Multiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknwonEClass, Unknwon.class, "Unknwon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emptyEClass, Empty.class, "Empty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inconsistentEClass, Inconsistent.class, "Inconsistent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuedCellEClass, ValuedCell.class, "ValuedCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuedCell_Interpretation(), this.getConstraint(), null, "interpretation", null, 1, 1, ValuedCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuedCell_Concepts(), this.getVariabilityConcept(), this.getVariabilityConcept_Constraints(), "concepts", null, 0, -1, ValuedCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuedCell_MyHeaderProduct(), this.getAbstractProduct(), null, "myHeaderProduct", null, 1, 1, ValuedCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuedCell_MyHeaderFeature(), this.getAbstractFeature(), null, "myHeaderFeature", null, 1, 1, ValuedCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xOrEClass, XOr.class, "XOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_Intervals(), this.getInterval(), null, "intervals", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_DomainLitteral(), ecorePackage.getEString(), "domainLitteral", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "name", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_DomainType(), this.getType(), null, "domainType", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterval_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterval_Value(), ecorePackage.getEString(), "value", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainCollectionEClass, DomainCollection.class, "DomainCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainCollection_Domains(), this.getDomain(), null, "domains", null, 0, -1, DomainCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedDomainEClass, OrderedDomain.class, "OrderedDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderedDomain_Previous(), this.getOrderedDomain(), this.getOrderedDomain_Next(), "previous", null, 0, -1, OrderedDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderedDomain_Next(), this.getOrderedDomain(), this.getOrderedDomain_Previous(), "next", null, 0, -1, OrderedDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yesNOEClass, YesNO.class, "YesNO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getYesNO__Eval(), ecorePackage.getEBoolean(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PcmmmPackageImpl
