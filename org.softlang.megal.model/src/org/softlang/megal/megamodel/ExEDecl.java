/**
 */
package org.softlang.megal.megamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex EDecl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.ExEDecl#getExName <em>Ex Name</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.ExEDecl#getExShowname <em>Ex Showname</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.ExEDecl#isExIsParameter <em>Ex Is Parameter</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.ExEDecl#isExIsDependent <em>Ex Is Dependent</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.ExEDecl#getExType <em>Ex Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getExEDecl()
 * @model
 * @generated
 */
public interface ExEDecl extends EDecl {
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
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExEDecl_ExName()
	 * @model required="true"
	 * @generated
	 */
	String getExName();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExEDecl#getExName <em>Ex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Name</em>' attribute.
	 * @see #getExName()
	 * @generated
	 */
	void setExName(String value);

	/**
	 * Returns the value of the '<em><b>Ex Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Showname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Showname</em>' attribute.
	 * @see #setExShowname(String)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExEDecl_ExShowname()
	 * @model
	 * @generated
	 */
	String getExShowname();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExEDecl#getExShowname <em>Ex Showname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Showname</em>' attribute.
	 * @see #getExShowname()
	 * @generated
	 */
	void setExShowname(String value);

	/**
	 * Returns the value of the '<em><b>Ex Is Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Is Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Is Parameter</em>' attribute.
	 * @see #setExIsParameter(boolean)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExEDecl_ExIsParameter()
	 * @model required="true"
	 * @generated
	 */
	boolean isExIsParameter();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExEDecl#isExIsParameter <em>Ex Is Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Is Parameter</em>' attribute.
	 * @see #isExIsParameter()
	 * @generated
	 */
	void setExIsParameter(boolean value);

	/**
	 * Returns the value of the '<em><b>Ex Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Is Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Is Dependent</em>' attribute.
	 * @see #setExIsDependent(boolean)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExEDecl_ExIsDependent()
	 * @model required="true"
	 * @generated
	 */
	boolean isExIsDependent();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExEDecl#isExIsDependent <em>Ex Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Is Dependent</em>' attribute.
	 * @see #isExIsDependent()
	 * @generated
	 */
	void setExIsDependent(boolean value);

	/**
	 * Returns the value of the '<em><b>Ex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Type</em>' containment reference.
	 * @see #setExType(ExEType)
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getExEDecl_ExType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExEType getExType();

	/**
	 * Sets the value of the '{@link org.softlang.megal.megamodel.ExEDecl#getExType <em>Ex Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Type</em>' containment reference.
	 * @see #getExType()
	 * @generated
	 */
	void setExType(ExEType value);

} // ExEDecl
