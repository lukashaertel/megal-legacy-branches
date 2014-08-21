/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.EntityType#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.EntityType#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link org.softlang.megal.model.EntityType#isIsTop <em>Is Top</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getEntityType()
 * @model
 * @generated
 */
public interface EntityType extends EObject {
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
	 * @see org.softlang.megal.model.ModelPackage#getEntityType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.EntityType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' containment reference.
	 * @see #setSupertype(Declared)
	 * @see org.softlang.megal.model.ModelPackage#getEntityType_Supertype()
	 * @model containment="true"
	 * @generated
	 */
	Declared getSupertype();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.EntityType#getSupertype <em>Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' containment reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(Declared value);

	/**
	 * Returns the value of the '<em><b>Is Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Top</em>' attribute.
	 * @see #setIsTop(boolean)
	 * @see org.softlang.megal.model.ModelPackage#getEntityType_IsTop()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsTop();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.EntityType#isIsTop <em>Is Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Top</em>' attribute.
	 * @see #isIsTop()
	 * @generated
	 */
	void setIsTop(boolean value);

} // EntityType
