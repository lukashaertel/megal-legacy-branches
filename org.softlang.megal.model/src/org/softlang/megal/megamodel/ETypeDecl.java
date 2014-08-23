/**
 */
package org.softlang.megal.megamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.ETypeDecl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.ETypeDecl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getETypeDecl()
 * @model abstract="true"
 * @generated
 */
public interface ETypeDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getETypeDecl_Supertype()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='org.softlang.megal.queries.supertype'"
	 * @generated
	 */
	EType getSupertype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getETypeDecl_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='org.softlang.megal.queries.name_ETypeDecl'"
	 * @generated
	 */
	String getName();

} // ETypeDecl
