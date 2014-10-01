/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RType Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.RTypeDecl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.model.RTypeDecl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.MegalPackage#getRTypeDecl()
 * @model
 * @generated
 */
public interface RTypeDecl extends NamedDecl {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(EType)
	 * @see org.softlang.megal.model.MegalPackage#getRTypeDecl_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EType getLeft();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.RTypeDecl#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(EType value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(EType)
	 * @see org.softlang.megal.model.MegalPackage#getRTypeDecl_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EType getRight();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.RTypeDecl#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(EType value);

} // RTypeDecl
