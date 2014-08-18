/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Relation Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.PointerRelationTypeRef#getRefered <em>Refered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getPointerRelationTypeRef()
 * @model
 * @generated
 */
public interface PointerRelationTypeRef extends AbstractRelationTypeRef {
	/**
	 * Returns the value of the '<em><b>Refered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refered</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refered</em>' reference.
	 * @see #setRefered(RelationType)
	 * @see org.softlang.megal.model.ModelPackage#getPointerRelationTypeRef_Refered()
	 * @model required="true"
	 * @generated
	 */
	RelationType getRefered();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.PointerRelationTypeRef#getRefered <em>Refered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refered</em>' reference.
	 * @see #getRefered()
	 * @generated
	 */
	void setRefered(RelationType value);

} // PointerRelationTypeRef
