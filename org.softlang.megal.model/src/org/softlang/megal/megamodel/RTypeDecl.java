/**
 */
package org.softlang.megal.megamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RType Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.RTypeDecl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.RTypeDecl#getRight <em>Right</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.RTypeDecl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getRTypeDecl()
 * @model abstract="true"
 * @generated
 */
public interface RTypeDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getRTypeDecl_Left()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EType getLeft();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getRTypeDecl_Right()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EType getRight();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getRTypeDecl_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // RTypeDecl
