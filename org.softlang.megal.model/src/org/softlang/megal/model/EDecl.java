/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDecl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.EDecl#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.model.EDecl#isDependent <em>Dependent</em>}</li>
 *   <li>{@link org.softlang.megal.model.EDecl#isParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.MegalPackage#getEDecl()
 * @model
 * @generated
 */
public interface EDecl extends NamedDecl {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(EType)
	 * @see org.softlang.megal.model.MegalPackage#getEDecl_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EType getType();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.EDecl#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EType value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' attribute.
	 * @see #setDependent(boolean)
	 * @see org.softlang.megal.model.MegalPackage#getEDecl_Dependent()
	 * @model required="true"
	 * @generated
	 */
	boolean isDependent();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.EDecl#isDependent <em>Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' attribute.
	 * @see #isDependent()
	 * @generated
	 */
	void setDependent(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(boolean)
	 * @see org.softlang.megal.model.MegalPackage#getEDecl_Parameter()
	 * @model required="true"
	 * @generated
	 */
	boolean isParameter();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.EDecl#isParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #isParameter()
	 * @generated
	 */
	void setParameter(boolean value);

} // EDecl
