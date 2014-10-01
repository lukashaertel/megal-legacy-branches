/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.AppDecl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.softlang.megal.model.AppDecl#getInput <em>Input</em>}</li>
 *   <li>{@link org.softlang.megal.model.AppDecl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.MegalPackage#getAppDecl()
 * @model
 * @generated
 */
public interface AppDecl extends Decl {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(EDecl)
	 * @see org.softlang.megal.model.MegalPackage#getAppDecl_Function()
	 * @model required="true"
	 * @generated
	 */
	EDecl getFunction();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.AppDecl#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(EDecl value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(EDecl)
	 * @see org.softlang.megal.model.MegalPackage#getAppDecl_Input()
	 * @model required="true"
	 * @generated
	 */
	EDecl getInput();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.AppDecl#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(EDecl value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(EDecl)
	 * @see org.softlang.megal.model.MegalPackage#getAppDecl_Output()
	 * @model required="true"
	 * @generated
	 */
	EDecl getOutput();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.AppDecl#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(EDecl value);

} // AppDecl
