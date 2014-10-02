/**
 */
package pcmmm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import pcmmm.And;
import pcmmm.DomainCollection;
import pcmmm.Empty;
import pcmmm.Extra;
import pcmmm.Feature;
import pcmmm.FeatureFamily;
import pcmmm.Header;
import pcmmm.Inconsistent;
import pcmmm.Matrix;
import pcmmm.Multiple;
import pcmmm.Or;
import pcmmm.PCM;
import pcmmm.Partial;
import pcmmm.PcmmmFactory;
import pcmmm.PcmmmPackage;
import pcmmm.Product;
import pcmmm.ProductFamily;
import pcmmm.Unknown;
import pcmmm.ValuedCell;
import pcmmm.VariabilityConceptRef;
import pcmmm.XOr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmmmFactoryImpl extends EFactoryImpl implements PcmmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmmmFactory init() {
		try {
			PcmmmFactory thePcmmmFactory = (PcmmmFactory)EPackage.Registry.INSTANCE.getEFactory(PcmmmPackage.eNS_URI);
			if (thePcmmmFactory != null) {
				return thePcmmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcmmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PcmmmPackage.PCM: return createPCM();
			case PcmmmPackage.MATRIX: return createMatrix();
			case PcmmmPackage.PRODUCT_FAMILY: return createProductFamily();
			case PcmmmPackage.PRODUCT: return createProduct();
			case PcmmmPackage.FEATURE_FAMILY: return createFeatureFamily();
			case PcmmmPackage.FEATURE: return createFeature();
			case PcmmmPackage.HEADER: return createHeader();
			case PcmmmPackage.EXTRA: return createExtra();
			case PcmmmPackage.BOOLEAN: return createBoolean();
			case PcmmmPackage.PARTIAL: return createPartial();
			case PcmmmPackage.MULTIPLE: return createMultiple();
			case PcmmmPackage.UNKNOWN: return createUnknown();
			case PcmmmPackage.EMPTY: return createEmpty();
			case PcmmmPackage.INCONSISTENT: return createInconsistent();
			case PcmmmPackage.VALUED_CELL: return createValuedCell();
			case PcmmmPackage.AND: return createAnd();
			case PcmmmPackage.OR: return createOr();
			case PcmmmPackage.XOR: return createXOr();
			case PcmmmPackage.DOMAIN_COLLECTION: return createDomainCollection();
			case PcmmmPackage.ENUM: return createEnum();
			case PcmmmPackage.VARIABILITY_CONCEPT_REF: return createVariabilityConceptRef();
			case PcmmmPackage.INTEGER: return createInteger();
			case PcmmmPackage.DOUBLE: return createDouble();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM createPCM() {
		PCMImpl pcm = new PCMImpl();
		return pcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFamily createProductFamily() {
		ProductFamilyImpl productFamily = new ProductFamilyImpl();
		return productFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureFamily createFeatureFamily() {
		FeatureFamilyImpl featureFamily = new FeatureFamilyImpl();
		return featureFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extra createExtra() {
		ExtraImpl extra = new ExtraImpl();
		return extra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pcmmm.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partial createPartial() {
		PartialImpl partial = new PartialImpl();
		return partial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiple createMultiple() {
		MultipleImpl multiple = new MultipleImpl();
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unknown createUnknown() {
		UnknownImpl unknown = new UnknownImpl();
		return unknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty createEmpty() {
		EmptyImpl empty = new EmptyImpl();
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inconsistent createInconsistent() {
		InconsistentImpl inconsistent = new InconsistentImpl();
		return inconsistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuedCell createValuedCell() {
		ValuedCellImpl valuedCell = new ValuedCellImpl();
		return valuedCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOr createXOr() {
		XOrImpl xOr = new XOrImpl();
		return xOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainCollection createDomainCollection() {
		DomainCollectionImpl domainCollection = new DomainCollectionImpl();
		return domainCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pcmmm.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariabilityConceptRef createVariabilityConceptRef() {
		VariabilityConceptRefImpl variabilityConceptRef = new VariabilityConceptRefImpl();
		return variabilityConceptRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pcmmm.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pcmmm.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmmmPackage getPcmmmPackage() {
		return (PcmmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcmmmPackage getPackage() {
		return PcmmmPackage.eINSTANCE;
	}

} //PcmmmFactoryImpl
