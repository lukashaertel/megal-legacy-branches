/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.Relation#getFrom <em>From</em>}</li>
 *   <li>{@link org.softlang.megal.model.Relation#getTo <em>To</em>}</li>
 *   <li>{@link org.softlang.megal.model.Relation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(AbstractEntityRef)
	 * @see org.softlang.megal.model.ModelPackage#getRelation_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractEntityRef getFrom();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Relation#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractEntityRef value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(AbstractEntityRef)
	 * @see org.softlang.megal.model.ModelPackage#getRelation_To()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractEntityRef getTo();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Relation#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AbstractEntityRef value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AbstractRelationTypeRef)
	 * @see org.softlang.megal.model.ModelPackage#getRelation_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractRelationTypeRef getType();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Relation#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractRelationTypeRef value);

} // Relation
