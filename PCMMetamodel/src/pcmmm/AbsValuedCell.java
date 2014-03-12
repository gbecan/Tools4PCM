/**
 */
package pcmmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abs Valued Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pcmmm.AbsValuedCell#getMyHeaderProduct <em>My Header Product</em>}</li>
 *   <li>{@link pcmmm.AbsValuedCell#getMyHeaderFeature <em>My Header Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see pcmmm.PcmmmPackage#getAbsValuedCell()
 * @model abstract="true"
 * @generated
 */
public interface AbsValuedCell extends Cell {
	/**
	 * Returns the value of the '<em><b>My Header Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Header Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Header Product</em>' reference.
	 * @see #setMyHeaderProduct(AbstractProduct)
	 * @see pcmmm.PcmmmPackage#getAbsValuedCell_MyHeaderProduct()
	 * @model required="true"
	 * @generated
	 */
	AbstractProduct getMyHeaderProduct();

	/**
	 * Sets the value of the '{@link pcmmm.AbsValuedCell#getMyHeaderProduct <em>My Header Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Header Product</em>' reference.
	 * @see #getMyHeaderProduct()
	 * @generated
	 */
	void setMyHeaderProduct(AbstractProduct value);

	/**
	 * Returns the value of the '<em><b>My Header Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Header Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Header Feature</em>' reference.
	 * @see #setMyHeaderFeature(AbstractFeature)
	 * @see pcmmm.PcmmmPackage#getAbsValuedCell_MyHeaderFeature()
	 * @model required="true"
	 * @generated
	 */
	AbstractFeature getMyHeaderFeature();

	/**
	 * Sets the value of the '{@link pcmmm.AbsValuedCell#getMyHeaderFeature <em>My Header Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Header Feature</em>' reference.
	 * @see #getMyHeaderFeature()
	 * @generated
	 */
	void setMyHeaderFeature(AbstractFeature value);

} // AbsValuedCell
