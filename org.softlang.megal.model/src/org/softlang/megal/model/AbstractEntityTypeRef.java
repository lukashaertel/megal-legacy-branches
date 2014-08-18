/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Entity Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.AbstractEntityTypeRef#isIsMany <em>Is Many</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getAbstractEntityTypeRef()
 * @model abstract="true"
 * @generated
 */
public interface AbstractEntityTypeRef extends EObject {
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
	 * @see org.softlang.megal.model.ModelPackage#getAbstractEntityTypeRef_IsMany()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMany();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.AbstractEntityTypeRef#isIsMany <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Many</em>' attribute.
	 * @see #isIsMany()
	 * @generated
	 */
	void setIsMany(boolean value);

} // AbstractEntityTypeRef
