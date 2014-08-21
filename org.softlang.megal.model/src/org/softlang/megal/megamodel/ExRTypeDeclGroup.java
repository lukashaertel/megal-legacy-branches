/**
 */
package org.softlang.megal.megamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex RType Decl Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.ExRTypeDeclGroup#getExRTypeDecls <em>Ex RType Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getExRTypeDeclGroup()
 * @model
 * @generated
 */
public interface ExRTypeDeclGroup extends DeclGroup {
	/**
	 * Returns the value of the '<em><b>Ex RType Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex RType Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex RType Decls</em>' containment reference.
	 * @see #setExRTypeDecls(ExRTypeDecl)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExRTypeDeclGroup_ExRTypeDecls()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExRTypeDecl getExRTypeDecls();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExRTypeDeclGroup#getExRTypeDecls <em>Ex RType Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex RType Decls</em>' containment reference.
	 * @see #getExRTypeDecls()
	 * @generated
	 */
	void setExRTypeDecls(ExRTypeDecl value);

} // ExRTypeDeclGroup
