/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.ETypeDecl#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.MegalPackage#getETypeDecl()
 * @model
 * @generated
 */
public interface ETypeDecl extends NamedDecl {
	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' containment reference.
	 * @see #setSupertype(EType)
	 * @see org.softlang.megal.model.MegalPackage#getETypeDecl_Supertype()
	 * @model containment="true"
	 * @generated
	 */
	EType getSupertype();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.ETypeDecl#getSupertype <em>Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' containment reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(EType value);

} // ETypeDecl
