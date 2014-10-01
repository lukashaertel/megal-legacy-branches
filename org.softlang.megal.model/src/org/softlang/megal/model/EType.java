/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.EType#getDef <em>Def</em>}</li>
 *   <li>{@link org.softlang.megal.model.EType#isMany <em>Many</em>}</li>
 *   <li>{@link org.softlang.megal.model.EType#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.MegalPackage#getEType()
 * @model
 * @generated
 */
public interface EType extends EObject {
	/**
	 * Returns the value of the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' reference.
	 * @see #setDef(ETypeDecl)
	 * @see org.softlang.megal.model.MegalPackage#getEType_Def()
	 * @model required="true"
	 * @generated
	 */
	ETypeDecl getDef();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.EType#getDef <em>Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(ETypeDecl value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see org.softlang.megal.model.MegalPackage#getEType_Many()
	 * @model required="true"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.EType#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.EType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see org.softlang.megal.model.MegalPackage#getEType_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<EType> getArgs();

} // EType
