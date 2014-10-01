/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FDecl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.FDecl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.softlang.megal.model.FDecl#getCodomain <em>Codomain</em>}</li>
 *   <li>{@link org.softlang.megal.model.FDecl#isDependent <em>Dependent</em>}</li>
 *   <li>{@link org.softlang.megal.model.FDecl#isParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.MegalPackage#getFDecl()
 * @model
 * @generated
 */
public interface FDecl extends NamedDecl {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(EType)
	 * @see org.softlang.megal.model.MegalPackage#getFDecl_Domain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EType getDomain();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.FDecl#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(EType value);

	/**
	 * Returns the value of the '<em><b>Codomain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codomain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codomain</em>' containment reference.
	 * @see #setCodomain(EType)
	 * @see org.softlang.megal.model.MegalPackage#getFDecl_Codomain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EType getCodomain();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.FDecl#getCodomain <em>Codomain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codomain</em>' containment reference.
	 * @see #getCodomain()
	 * @generated
	 */
	void setCodomain(EType value);

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
	 * @see org.softlang.megal.model.MegalPackage#getFDecl_Dependent()
	 * @model required="true"
	 * @generated
	 */
	boolean isDependent();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.FDecl#isDependent <em>Dependent</em>}' attribute.
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
	 * @see org.softlang.megal.model.MegalPackage#getFDecl_Parameter()
	 * @model required="true"
	 * @generated
	 */
	boolean isParameter();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.FDecl#isParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #isParameter()
	 * @generated
	 */
	void setParameter(boolean value);

} // FDecl
