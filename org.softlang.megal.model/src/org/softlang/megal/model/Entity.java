/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.Entity#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.Entity#isIsParameter <em>Is Parameter</em>}</li>
 *   <li>{@link org.softlang.megal.model.Entity#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link org.softlang.megal.model.Entity#getRepresentativeName <em>Representative Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.Entity#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.model.Entity#getGenerics <em>Generics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
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
	 * @see org.softlang.megal.model.ModelPackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Parameter</em>' attribute.
	 * @see #setIsParameter(boolean)
	 * @see org.softlang.megal.model.ModelPackage#getEntity_IsParameter()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsParameter();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Entity#isIsParameter <em>Is Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Parameter</em>' attribute.
	 * @see #isIsParameter()
	 * @generated
	 */
	void setIsParameter(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dependent</em>' attribute.
	 * @see #setIsDependent(boolean)
	 * @see org.softlang.megal.model.ModelPackage#getEntity_IsDependent()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsDependent();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Entity#isIsDependent <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dependent</em>' attribute.
	 * @see #isIsDependent()
	 * @generated
	 */
	void setIsDependent(boolean value);

	/**
	 * Returns the value of the '<em><b>Representative Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representative Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representative Name</em>' attribute.
	 * @see #setRepresentativeName(String)
	 * @see org.softlang.megal.model.ModelPackage#getEntity_RepresentativeName()
	 * @model
	 * @generated
	 */
	String getRepresentativeName();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Entity#getRepresentativeName <em>Representative Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representative Name</em>' attribute.
	 * @see #getRepresentativeName()
	 * @generated
	 */
	void setRepresentativeName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Declared)
	 * @see org.softlang.megal.model.ModelPackage#getEntity_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Declared getType();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Entity#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Declared value);

	/**
	 * Returns the value of the '<em><b>Generics</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.model.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generics</em>' reference list.
	 * @see org.softlang.megal.model.ModelPackage#getEntity_Generics()
	 * @model
	 * @generated
	 */
	EList<Entity> getGenerics();

} // Entity
