/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.FunctionApplication#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.FunctionApplication#getInput <em>Input</em>}</li>
 *   <li>{@link org.softlang.megal.model.FunctionApplication#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getFunctionApplication()
 * @model
 * @generated
 */
public interface FunctionApplication extends Sugar {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.softlang.megal.model.ModelPackage#getFunctionApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.FunctionApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Entity)
	 * @see org.softlang.megal.model.ModelPackage#getFunctionApplication_Input()
	 * @model required="true"
	 * @generated
	 */
	Entity getInput();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.FunctionApplication#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Entity value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Entity)
	 * @see org.softlang.megal.model.ModelPackage#getFunctionApplication_Output()
	 * @model required="true"
	 * @generated
	 */
	Entity getOutput();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.FunctionApplication#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Entity value);

} // FunctionApplication
