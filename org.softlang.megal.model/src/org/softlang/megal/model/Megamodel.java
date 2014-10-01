/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Megamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.Megamodel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.softlang.megal.model.Megamodel#getETypeDecls <em>EType Decls</em>}</li>
 *   <li>{@link org.softlang.megal.model.Megamodel#getRTypeDecls <em>RType Decls</em>}</li>
 *   <li>{@link org.softlang.megal.model.Megamodel#getEDecls <em>EDecls</em>}</li>
 *   <li>{@link org.softlang.megal.model.Megamodel#getRDecls <em>RDecls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.MegalPackage#getMegamodel()
 * @model
 * @generated
 */
public interface Megamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.model.Megamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see org.softlang.megal.model.MegalPackage#getMegamodel_Imports()
	 * @model
	 * @generated
	 */
	EList<Megamodel> getImports();

	/**
	 * Returns the value of the '<em><b>EType Decls</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.ETypeDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Decls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Decls</em>' containment reference list.
	 * @see org.softlang.megal.model.MegalPackage#getMegamodel_ETypeDecls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETypeDecl> getETypeDecls();

	/**
	 * Returns the value of the '<em><b>RType Decls</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.RTypeDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RType Decls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RType Decls</em>' containment reference list.
	 * @see org.softlang.megal.model.MegalPackage#getMegamodel_RTypeDecls()
	 * @model containment="true"
	 * @generated
	 */
	EList<RTypeDecl> getRTypeDecls();

	/**
	 * Returns the value of the '<em><b>EDecls</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.EDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EDecls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDecls</em>' containment reference list.
	 * @see org.softlang.megal.model.MegalPackage#getMegamodel_EDecls()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDecl> getEDecls();

	/**
	 * Returns the value of the '<em><b>RDecls</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.RDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDecls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDecls</em>' containment reference list.
	 * @see org.softlang.megal.model.MegalPackage#getMegamodel_RDecls()
	 * @model containment="true"
	 * @generated
	 */
	EList<RDecl> getRDecls();

} // Megamodel
