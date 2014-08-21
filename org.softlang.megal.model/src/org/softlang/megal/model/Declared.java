/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.Declared#isIsMany <em>Is Many</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declared#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getDeclared()
 * @model
 * @generated
 */
public interface Declared extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Many</em>' attribute.
	 * @see #setIsMany(boolean)
	 * @see org.softlang.megal.model.ModelPackage#getDeclared_IsMany()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMany();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Declared#isIsMany <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Many</em>' attribute.
	 * @see #isIsMany()
	 * @generated
	 */
	void setIsMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(EntityType)
	 * @see org.softlang.megal.model.ModelPackage#getDeclared_Definition()
	 * @model required="true"
	 * @generated
	 */
	EntityType getDefinition();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Declared#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(EntityType value);

} // Declared
