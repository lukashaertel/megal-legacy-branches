/**
 */
package org.softlang.megal.megamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex RDecl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.ExRDecl#getExType <em>Ex Type</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.ExRDecl#getExLeft <em>Ex Left</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.ExRDecl#getExRight <em>Ex Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getExRDecl()
 * @model
 * @generated
 */
public interface ExRDecl extends RDecl {
	/**
	 * Returns the value of the '<em><b>Ex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Type</em>' reference.
	 * @see #setExType(RTypeDecl)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExRDecl_ExType()
	 * @model required="true"
	 * @generated
	 */
	RTypeDecl getExType();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExRDecl#getExType <em>Ex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Type</em>' reference.
	 * @see #getExType()
	 * @generated
	 */
	void setExType(RTypeDecl value);

	/**
	 * Returns the value of the '<em><b>Ex Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Left</em>' reference.
	 * @see #setExLeft(EDecl)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExRDecl_ExLeft()
	 * @model required="true"
	 * @generated
	 */
	EDecl getExLeft();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExRDecl#getExLeft <em>Ex Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Left</em>' reference.
	 * @see #getExLeft()
	 * @generated
	 */
	void setExLeft(EDecl value);

	/**
	 * Returns the value of the '<em><b>Ex Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Right</em>' reference.
	 * @see #setExRight(EDecl)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExRDecl_ExRight()
	 * @model required="true"
	 * @generated
	 */
	EDecl getExRight();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExRDecl#getExRight <em>Ex Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Right</em>' reference.
	 * @see #getExRight()
	 * @generated
	 */
	void setExRight(EDecl value);

} // ExRDecl
