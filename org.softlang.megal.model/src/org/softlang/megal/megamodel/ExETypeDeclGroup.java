/**
 */
package org.softlang.megal.megamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex EType Decl Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.ExETypeDeclGroup#getExETypeDecls <em>Ex EType Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getExETypeDeclGroup()
 * @model
 * @generated
 */
public interface ExETypeDeclGroup extends DeclGroup {
	/**
	 * Returns the value of the '<em><b>Ex EType Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex EType Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex EType Decls</em>' containment reference.
	 * @see #setExETypeDecls(ExETypeDecl)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExETypeDeclGroup_ExETypeDecls()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExETypeDecl getExETypeDecls();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExETypeDeclGroup#getExETypeDecls <em>Ex EType Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex EType Decls</em>' containment reference.
	 * @see #getExETypeDecls()
	 * @generated
	 */
	void setExETypeDecls(ExETypeDecl value);

} // ExETypeDeclGroup
