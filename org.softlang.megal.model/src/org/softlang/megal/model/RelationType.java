/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.RelationType#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.RelationType#getFromDomain <em>From Domain</em>}</li>
 *   <li>{@link org.softlang.megal.model.RelationType#getToDomain <em>To Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getRelationType()
 * @model
 * @generated
 */
public interface RelationType extends EObject {
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
	 * @see org.softlang.megal.model.ModelPackage#getRelationType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.RelationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Domain</em>' containment reference.
	 * @see #setFromDomain(AbstractEntityTypeRef)
	 * @see org.softlang.megal.model.ModelPackage#getRelationType_FromDomain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractEntityTypeRef getFromDomain();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.RelationType#getFromDomain <em>From Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Domain</em>' containment reference.
	 * @see #getFromDomain()
	 * @generated
	 */
	void setFromDomain(AbstractEntityTypeRef value);

	/**
	 * Returns the value of the '<em><b>To Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Domain</em>' containment reference.
	 * @see #setToDomain(AbstractEntityTypeRef)
	 * @see org.softlang.megal.model.ModelPackage#getRelationType_ToDomain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractEntityTypeRef getToDomain();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.RelationType#getToDomain <em>To Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Domain</em>' containment reference.
	 * @see #getToDomain()
	 * @generated
	 */
	void setToDomain(AbstractEntityTypeRef value);

} // RelationType
