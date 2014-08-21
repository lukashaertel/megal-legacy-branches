/**
 */
package megamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex EType Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link megamodel.ExETypeDecl#getExSupertype <em>Ex Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @see megamodel.MegamodelPackage#getExETypeDecl()
 * @model
 * @generated
 */
public interface ExETypeDecl extends ETypeDecl {
	/**
	 * Returns the value of the '<em><b>Ex Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Supertype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Supertype</em>' containment reference.
	 * @see #setExSupertype(ExEType)
	 * @see megamodel.MegamodelPackage#getExETypeDecl_ExSupertype()
	 * @model containment="true"
	 * @generated
	 */
	ExEType getExSupertype();

	/**
	 * Sets the value of the '{@link megamodel.ExETypeDecl#getExSupertype <em>Ex Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Supertype</em>' containment reference.
	 * @see #getExSupertype()
	 * @generated
	 */
	void setExSupertype(ExEType value);

} // ExETypeDecl
