/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.softlang.megal.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = org.softlang.megal.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration</em>'.
	 * @generated
	 */
	Declaration createDeclaration();

	/**
	 * Returns a new object of class '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation</em>'.
	 * @generated
	 */
	Relation createRelation();

	/**
	 * Returns a new object of class '<em>Pointer Entity Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Entity Ref</em>'.
	 * @generated
	 */
	PointerEntityRef createPointerEntityRef();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Type</em>'.
	 * @generated
	 */
	RelationType createRelationType();

	/**
	 * Returns a new object of class '<em>Pointer Relation Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Relation Type Ref</em>'.
	 * @generated
	 */
	PointerRelationTypeRef createPointerRelationTypeRef();

	/**
	 * Returns a new object of class '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Type</em>'.
	 * @generated
	 */
	EntityType createEntityType();

	/**
	 * Returns a new object of class '<em>Top Entity Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Entity Type Ref</em>'.
	 * @generated
	 */
	TopEntityTypeRef createTopEntityTypeRef();

	/**
	 * Returns a new object of class '<em>Pointer Entity Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Entity Type Ref</em>'.
	 * @generated
	 */
	PointerEntityTypeRef createPointerEntityTypeRef();

	/**
	 * Returns a new object of class '<em>Function Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Application</em>'.
	 * @generated
	 */
	FunctionApplication createFunctionApplication();

	/**
	 * Returns a new object of class '<em>Prelude Declaration Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prelude Declaration Ref</em>'.
	 * @generated
	 */
	PreludeDeclarationRef createPreludeDeclarationRef();

	/**
	 * Returns a new object of class '<em>Pointer Declaration Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Declaration Ref</em>'.
	 * @generated
	 */
	PointerDeclarationRef createPointerDeclarationRef();

	/**
	 * Returns a new object of class '<em>Megamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Megamodel</em>'.
	 * @generated
	 */
	Megamodel createMegamodel();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
