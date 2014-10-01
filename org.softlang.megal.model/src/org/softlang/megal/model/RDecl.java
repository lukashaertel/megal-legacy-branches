/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDecl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.RDecl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.model.RDecl#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.model.RDecl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.MegalPackage#getRDecl()
 * @model
 * @generated
 */
public interface RDecl extends Decl {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(EDecl)
	 * @see org.softlang.megal.model.MegalPackage#getRDecl_Left()
	 * @model required="true"
	 * @generated
	 */
	EDecl getLeft();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.RDecl#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(EDecl value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(RTypeDecl)
	 * @see org.softlang.megal.model.MegalPackage#getRDecl_Type()
	 * @model required="true"
	 * @generated
	 */
	RTypeDecl getType();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.RDecl#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RTypeDecl value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(EDecl)
	 * @see org.softlang.megal.model.MegalPackage#getRDecl_Right()
	 * @model required="true"
	 * @generated
	 */
	EDecl getRight();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.RDecl#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(EDecl value);

} // RDecl
