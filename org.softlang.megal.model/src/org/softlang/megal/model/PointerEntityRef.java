/**
 */
package org.softlang.megal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Entity Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.PointerEntityRef#getRefered <em>Refered</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getPointerEntityRef()
 * @model
 * @generated
 */
public interface PointerEntityRef extends AbstractEntityRef {
	/**
	 * Returns the value of the '<em><b>Refered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refered</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refered</em>' reference.
	 * @see #setRefered(Entity)
	 * @see org.softlang.megal.model.ModelPackage#getPointerEntityRef_Refered()
	 * @model required="true"
	 * @generated
	 */
	Entity getRefered();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.PointerEntityRef#getRefered <em>Refered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refered</em>' reference.
	 * @see #getRefered()
	 * @generated
	 */
	void setRefered(Entity value);

} // PointerEntityRef
