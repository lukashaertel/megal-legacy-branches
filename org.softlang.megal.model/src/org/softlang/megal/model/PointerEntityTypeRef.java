/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Entity Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.PointerEntityTypeRef#getRefered <em>Refered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getPointerEntityTypeRef()
 * @model
 * @generated
 */
public interface PointerEntityTypeRef extends AbstractEntityTypeRef {
	/**
	 * Returns the value of the '<em><b>Refered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refered</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refered</em>' reference.
	 * @see #setRefered(EntityType)
	 * @see org.softlang.megal.model.ModelPackage#getPointerEntityTypeRef_Refered()
	 * @model required="true"
	 * @generated
	 */
	EntityType getRefered();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.PointerEntityTypeRef#getRefered <em>Refered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refered</em>' reference.
	 * @see #getRefered()
	 * @generated
	 */
	void setRefered(EntityType value);

} // PointerEntityTypeRef
