/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.softlang.megal.model.MegalPackage
 * @generated
 */
public interface MegalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MegalFactory eINSTANCE = org.softlang.megal.model.impl.MegalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Megamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Megamodel</em>'.
	 * @generated
	 */
	Megamodel createMegamodel();

	/**
	 * Returns a new object of class '<em>Named Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Decl</em>'.
	 * @generated
	 */
	NamedDecl createNamedDecl();

	/**
	 * Returns a new object of class '<em>EType Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EType Decl</em>'.
	 * @generated
	 */
	ETypeDecl createETypeDecl();

	/**
	 * Returns a new object of class '<em>RType Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RType Decl</em>'.
	 * @generated
	 */
	RTypeDecl createRTypeDecl();

	/**
	 * Returns a new object of class '<em>EDecl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDecl</em>'.
	 * @generated
	 */
	EDecl createEDecl();

	/**
	 * Returns a new object of class '<em>RDecl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDecl</em>'.
	 * @generated
	 */
	RDecl createRDecl();

	/**
	 * Returns a new object of class '<em>EType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EType</em>'.
	 * @generated
	 */
	EType createEType();

	/**
	 * Returns a new object of class '<em>App Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Decl</em>'.
	 * @generated
	 */
	AppDecl createAppDecl();

	/**
	 * Returns a new object of class '<em>FDecl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FDecl</em>'.
	 * @generated
	 */
	FDecl createFDecl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MegalPackage getMegalPackage();

} //MegalFactory
