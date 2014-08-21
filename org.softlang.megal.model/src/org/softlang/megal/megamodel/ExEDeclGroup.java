/**
 */
package org.softlang.megal.megamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex EDecl Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.ExEDeclGroup#getExEDecls <em>Ex EDecls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getExEDeclGroup()
 * @model
 * @generated
 */
public interface ExEDeclGroup extends DeclGroup {
	/**
	 * Returns the value of the '<em><b>Ex EDecls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex EDecls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex EDecls</em>' containment reference.
	 * @see #setExEDecls(ExEDecl)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExEDeclGroup_ExEDecls()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExEDecl getExEDecls();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExEDeclGroup#getExEDecls <em>Ex EDecls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex EDecls</em>' containment reference.
	 * @see #getExEDecls()
	 * @generated
	 */
	void setExEDecls(ExEDecl value);

} // ExEDeclGroup
