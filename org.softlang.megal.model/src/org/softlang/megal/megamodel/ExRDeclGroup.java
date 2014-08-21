/**
 */
package org.softlang.megal.megamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex RDecl Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.ExRDeclGroup#getExRDecls <em>Ex RDecls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getExRDeclGroup()
 * @model
 * @generated
 */
public interface ExRDeclGroup extends DeclGroup {
	/**
	 * Returns the value of the '<em><b>Ex RDecls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex RDecls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex RDecls</em>' containment reference.
	 * @see #setExRDecls(ExRDecl)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExRDeclGroup_ExRDecls()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExRDecl getExRDecls();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExRDeclGroup#getExRDecls <em>Ex RDecls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex RDecls</em>' containment reference.
	 * @see #getExRDecls()
	 * @generated
	 */
	void setExRDecls(ExRDecl value);

} // ExRDeclGroup
