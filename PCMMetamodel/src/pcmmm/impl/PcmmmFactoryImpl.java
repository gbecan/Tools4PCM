/**
 */
package pcmmm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcmmm.And;
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
import pcmmm.PCM;
import pcmmm.Partial;
import pcmmm.PcmmmFactory;
import pcmmm.PcmmmPackage;
import pcmmm.Product;
import pcmmm.ProductComparisonPage;
import pcmmm.ProductFamily;
import pcmmm.Simple;
import pcmmm.Unknwon;
import pcmmm.ValuedCell;
import pcmmm.XOr;
import pcmmm.YesNO;

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
			case PcmmmPackage.PRODUCT_COMPARISON_PAGE: return createProductComparisonPage();
			case PcmmmPackage.HEADER: return createHeader();
			case PcmmmPackage.EXTRA: return createExtra();
			case PcmmmPackage.BOOLEAN: return createBoolean();
			case PcmmmPackage.PARTIAL: return createPartial();
			case PcmmmPackage.SIMPLE: return createSimple();
			case PcmmmPackage.MULTIPLE: return createMultiple();
			case PcmmmPackage.UNKNWON: return createUnknwon();
			case PcmmmPackage.EMPTY: return createEmpty();
			case PcmmmPackage.INCONSISTENT: return createInconsistent();
			case PcmmmPackage.VALUED_CELL: return createValuedCell();
			case PcmmmPackage.AND: return createAnd();
			case PcmmmPackage.OR: return createOr();
			case PcmmmPackage.XOR: return createXOr();
			case PcmmmPackage.DOMAIN: return createDomain();
			case PcmmmPackage.INTERVAL: return createInterval();
			case PcmmmPackage.DOMAIN_COLLECTION: return createDomainCollection();
			case PcmmmPackage.ORDERED_DOMAIN: return createOrderedDomain();
			case PcmmmPackage.YES_NO: return createYesNO();
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
	public ProductComparisonPage createProductComparisonPage() {
		ProductComparisonPageImpl productComparisonPage = new ProductComparisonPageImpl();
		return productComparisonPage;
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
	public Simple createSimple() {
		SimpleImpl simple = new SimpleImpl();
		return simple;
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
	public Unknwon createUnknwon() {
		UnknwonImpl unknwon = new UnknwonImpl();
		return unknwon;
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
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
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
	public OrderedDomain createOrderedDomain() {
		OrderedDomainImpl orderedDomain = new OrderedDomainImpl();
		return orderedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNO createYesNO() {
		YesNOImpl yesNO = new YesNOImpl();
		return yesNO;
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
