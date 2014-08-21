/**
 */
package megamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see megamodel.MegamodelPackage
 * @generated
 */
public interface MegamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MegamodelFactory eINSTANCE = megamodel.impl.MegamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Megamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Megamodel</em>'.
	 * @generated
	 */
	Megamodel createMegamodel();

	/**
	 * Returns a new object of class '<em>Ex EType Decl Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex EType Decl Group</em>'.
	 * @generated
	 */
	ExETypeDeclGroup createExETypeDeclGroup();

	/**
	 * Returns a new object of class '<em>Ex EType Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex EType Decl</em>'.
	 * @generated
	 */
	ExETypeDecl createExETypeDecl();

	/**
	 * Returns a new object of class '<em>Ex EType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex EType</em>'.
	 * @generated
	 */
	ExEType createExEType();

	/**
	 * Returns a new object of class '<em>Ex RType Decl Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex RType Decl Group</em>'.
	 * @generated
	 */
	ExRTypeDeclGroup createExRTypeDeclGroup();

	/**
	 * Returns a new object of class '<em>Ex RType Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex RType Decl</em>'.
	 * @generated
	 */
	ExRTypeDecl createExRTypeDecl();

	/**
	 * Returns a new object of class '<em>Ex EDecl Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex EDecl Group</em>'.
	 * @generated
	 */
	ExEDeclGroup createExEDeclGroup();

	/**
	 * Returns a new object of class '<em>Ex EDecl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex EDecl</em>'.
	 * @generated
	 */
	ExEDecl createExEDecl();

	/**
	 * Returns a new object of class '<em>Ex RDecl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex RDecl</em>'.
	 * @generated
	 */
	ExRDecl createExRDecl();

	/**
	 * Returns a new object of class '<em>Ex RDecl Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ex RDecl Group</em>'.
	 * @generated
	 */
	ExRDeclGroup createExRDeclGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MegamodelPackage getMegamodelPackage();

} //MegamodelFactory
