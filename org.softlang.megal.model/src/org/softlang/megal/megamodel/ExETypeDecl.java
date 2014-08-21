/**
 */
package org.softlang.megal.megamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex EType Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.ExETypeDecl#getExSupertype <em>Ex Supertype</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.ExETypeDecl#getExName <em>Ex Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getExETypeDecl()
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
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExETypeDecl_ExSupertype()
	 * @model containment="true"
	 * @generated
	 */
	ExEType getExSupertype();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExETypeDecl#getExSupertype <em>Ex Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Supertype</em>' containment reference.
	 * @see #getExSupertype()
	 * @generated
	 */
	void setExSupertype(ExEType value);

	/**
	 * Returns the value of the '<em><b>Ex Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Name</em>' attribute.
	 * @see #setExName(String)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExETypeDecl_ExName()
	 * @model required="true"
	 * @generated
	 */
	String getExName();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExETypeDecl#getExName <em>Ex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Name</em>' attribute.
	 * @see #getExName()
	 * @generated
	 */
	void setExName(String value);

} // ExETypeDecl
