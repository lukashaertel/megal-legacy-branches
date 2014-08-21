/**
 */
package org.softlang.megal.megamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decl Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.DeclGroup#getETypeDecls <em>EType Decls</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.DeclGroup#getRTypeDecls <em>RType Decls</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.DeclGroup#getEDecls <em>EDecls</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.DeclGroup#getRDecls <em>RDecls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getDeclGroup()
 * @model abstract="true"
 * @generated
 */
public interface DeclGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>EType Decls</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.megamodel.ETypeDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Decls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Decls</em>' reference list.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getDeclGroup_ETypeDecls()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ETypeDecl> getETypeDecls();

	/**
	 * Returns the value of the '<em><b>RType Decls</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.megamodel.RTypeDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RType Decls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RType Decls</em>' reference list.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getDeclGroup_RTypeDecls()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<RTypeDecl> getRTypeDecls();

	/**
	 * Returns the value of the '<em><b>EDecls</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.megamodel.EDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDecls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDecls</em>' reference list.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getDeclGroup_EDecls()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EDecl> getEDecls();

	/**
	 * Returns the value of the '<em><b>RDecls</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.megamodel.RDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDecls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDecls</em>' reference list.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getDeclGroup_RDecls()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<RDecl> getRDecls();

} // DeclGroup
