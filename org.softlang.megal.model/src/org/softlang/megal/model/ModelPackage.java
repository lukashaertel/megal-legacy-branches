/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.softlang.megal.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://softlang.wikidot.com/megal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.softlang.megal.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.AbstractPartImpl <em>Abstract Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.AbstractPartImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractPart()
	 * @generated
	 */
	int ABSTRACT_PART = 8;

	/**
	 * The number of structural features of the '<em>Abstract Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.DeclarationImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Entity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ENTITY_TYPES = ABSTRACT_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__RELATION_TYPES = ABSTRACT_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__RELATIONS = ABSTRACT_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ENTITIES = ABSTRACT_PART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sugar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__SUGAR = ABSTRACT_PART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Override Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__OVERRIDE_NAME = ABSTRACT_PART_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__NAME = ABSTRACT_PART_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__CONFIGURATION = ABSTRACT_PART_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__IMPORTS = ABSTRACT_PART_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Imported Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__IMPORTED_ENTITIES = ABSTRACT_PART_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Imported Relation Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__IMPORTED_RELATION_TYPES = ABSTRACT_PART_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Imported Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__IMPORTED_RELATIONS = ABSTRACT_PART_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Imported Entity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__IMPORTED_ENTITY_TYPES = ABSTRACT_PART_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = ABSTRACT_PART_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = ABSTRACT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.RelationImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TO = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.EntityImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_DEPENDENT = 2;

	/**
	 * The feature id for the '<em><b>Representative Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REPRESENTATIVE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Generics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GENERICS = 5;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.RelationTypeImpl <em>Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.RelationTypeImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>From Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__FROM_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>To Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__TO_DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.EntityTypeImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SUPERTYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__IS_TOP = 2;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.SugarImpl <em>Sugar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.SugarImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getSugar()
	 * @generated
	 */
	int SUGAR = 5;

	/**
	 * The number of structural features of the '<em>Sugar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sugar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUGAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.FunctionApplicationImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getFunctionApplication()
	 * @generated
	 */
	int FUNCTION_APPLICATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__NAME = SUGAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__INPUT = SUGAR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__OUTPUT = SUGAR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION_FEATURE_COUNT = SUGAR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION_OPERATION_COUNT = SUGAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.MegamodelImpl <em>Megamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.MegamodelImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getMegamodel()
	 * @generated
	 */
	int MEGAMODEL = 7;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__PARTS = 0;

	/**
	 * The number of structural features of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.BindingImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 9;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = ABSTRACT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = ABSTRACT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.DeclaredImpl <em>Declared</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.DeclaredImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getDeclared()
	 * @generated
	 */
	int DECLARED = 10;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED__IS_MANY = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED__DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Declared</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Declared</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.softlang.megal.model.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getEntityTypes <em>Entity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Types</em>'.
	 * @see org.softlang.megal.model.Declaration#getEntityTypes()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_EntityTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getRelationTypes <em>Relation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Types</em>'.
	 * @see org.softlang.megal.model.Declaration#getRelationTypes()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_RelationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.softlang.megal.model.Declaration#getRelations()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.softlang.megal.model.Declaration#getEntities()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getSugar <em>Sugar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sugar</em>'.
	 * @see org.softlang.megal.model.Declaration#getSugar()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Sugar();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.Declaration#getOverrideName <em>Override Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override Name</em>'.
	 * @see org.softlang.megal.model.Declaration#getOverrideName()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_OverrideName();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.Declaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.model.Declaration#getName()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.Declaration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see org.softlang.megal.model.Declaration#getConfiguration()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_Configuration();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.model.Declaration#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see org.softlang.megal.model.Declaration#getImports()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getImportedEntities <em>Imported Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Entities</em>'.
	 * @see org.softlang.megal.model.Declaration#getImportedEntities()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_ImportedEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getImportedRelationTypes <em>Imported Relation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Relation Types</em>'.
	 * @see org.softlang.megal.model.Declaration#getImportedRelationTypes()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_ImportedRelationTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getImportedRelations <em>Imported Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Relations</em>'.
	 * @see org.softlang.megal.model.Declaration#getImportedRelations()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_ImportedRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getImportedEntityTypes <em>Imported Entity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Entity Types</em>'.
	 * @see org.softlang.megal.model.Declaration#getImportedEntityTypes()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_ImportedEntityTypes();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.softlang.megal.model.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.Relation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.softlang.megal.model.Relation#getFrom()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_From();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.Relation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.softlang.megal.model.Relation#getTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_To();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.softlang.megal.model.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Type();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.softlang.megal.model.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.model.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.Entity#isIsParameter <em>Is Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Parameter</em>'.
	 * @see org.softlang.megal.model.Entity#isIsParameter()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_IsParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.Entity#isIsDependent <em>Is Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dependent</em>'.
	 * @see org.softlang.megal.model.Entity#isIsDependent()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_IsDependent();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.Entity#getRepresentativeName <em>Representative Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representative Name</em>'.
	 * @see org.softlang.megal.model.Entity#getRepresentativeName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_RepresentativeName();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.Entity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.softlang.megal.model.Entity#getType()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.model.Entity#getGenerics <em>Generics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generics</em>'.
	 * @see org.softlang.megal.model.Entity#getGenerics()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Generics();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Type</em>'.
	 * @see org.softlang.megal.model.RelationType
	 * @generated
	 */
	EClass getRelationType();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.RelationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.model.RelationType#getName()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.RelationType#getFromDomain <em>From Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Domain</em>'.
	 * @see org.softlang.megal.model.RelationType#getFromDomain()
	 * @see #getRelationType()
	 * @generated
	 */
	EReference getRelationType_FromDomain();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.RelationType#getToDomain <em>To Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Domain</em>'.
	 * @see org.softlang.megal.model.RelationType#getToDomain()
	 * @see #getRelationType()
	 * @generated
	 */
	EReference getRelationType_ToDomain();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see org.softlang.megal.model.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.EntityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.model.EntityType#getName()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.EntityType#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supertype</em>'.
	 * @see org.softlang.megal.model.EntityType#getSupertype()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Supertype();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.EntityType#isIsTop <em>Is Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Top</em>'.
	 * @see org.softlang.megal.model.EntityType#isIsTop()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_IsTop();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.Sugar <em>Sugar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sugar</em>'.
	 * @see org.softlang.megal.model.Sugar
	 * @generated
	 */
	EClass getSugar();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.FunctionApplication <em>Function Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Application</em>'.
	 * @see org.softlang.megal.model.FunctionApplication
	 * @generated
	 */
	EClass getFunctionApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.FunctionApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.model.FunctionApplication#getName()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EAttribute getFunctionApplication_Name();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.FunctionApplication#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see org.softlang.megal.model.FunctionApplication#getInput()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Input();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.FunctionApplication#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.softlang.megal.model.FunctionApplication#getOutput()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Output();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.Megamodel <em>Megamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Megamodel</em>'.
	 * @see org.softlang.megal.model.Megamodel
	 * @generated
	 */
	EClass getMegamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Megamodel#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.softlang.megal.model.Megamodel#getParts()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Parts();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.AbstractPart <em>Abstract Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Part</em>'.
	 * @see org.softlang.megal.model.AbstractPart
	 * @generated
	 */
	EClass getAbstractPart();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see org.softlang.megal.model.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.Declared <em>Declared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared</em>'.
	 * @see org.softlang.megal.model.Declared
	 * @generated
	 */
	EClass getDeclared();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.Declared#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see org.softlang.megal.model.Declared#isIsMany()
	 * @see #getDeclared()
	 * @generated
	 */
	EAttribute getDeclared_IsMany();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.Declared#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.softlang.megal.model.Declared#getDefinition()
	 * @see #getDeclared()
	 * @generated
	 */
	EReference getDeclared_Definition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.DeclarationImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Entity Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__ENTITY_TYPES = eINSTANCE.getDeclaration_EntityTypes();

		/**
		 * The meta object literal for the '<em><b>Relation Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__RELATION_TYPES = eINSTANCE.getDeclaration_RelationTypes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__RELATIONS = eINSTANCE.getDeclaration_Relations();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__ENTITIES = eINSTANCE.getDeclaration_Entities();

		/**
		 * The meta object literal for the '<em><b>Sugar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__SUGAR = eINSTANCE.getDeclaration_Sugar();

		/**
		 * The meta object literal for the '<em><b>Override Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION__OVERRIDE_NAME = eINSTANCE.getDeclaration_OverrideName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION__CONFIGURATION = eINSTANCE.getDeclaration_Configuration();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__IMPORTS = eINSTANCE.getDeclaration_Imports();

		/**
		 * The meta object literal for the '<em><b>Imported Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__IMPORTED_ENTITIES = eINSTANCE.getDeclaration_ImportedEntities();

		/**
		 * The meta object literal for the '<em><b>Imported Relation Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__IMPORTED_RELATION_TYPES = eINSTANCE.getDeclaration_ImportedRelationTypes();

		/**
		 * The meta object literal for the '<em><b>Imported Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__IMPORTED_RELATIONS = eINSTANCE.getDeclaration_ImportedRelations();

		/**
		 * The meta object literal for the '<em><b>Imported Entity Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__IMPORTED_ENTITY_TYPES = eINSTANCE.getDeclaration_ImportedEntityTypes();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.RelationImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__FROM = eINSTANCE.getRelation_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TO = eINSTANCE.getRelation_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.EntityImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Is Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IS_PARAMETER = eINSTANCE.getEntity_IsParameter();

		/**
		 * The meta object literal for the '<em><b>Is Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IS_DEPENDENT = eINSTANCE.getEntity_IsDependent();

		/**
		 * The meta object literal for the '<em><b>Representative Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__REPRESENTATIVE_NAME = eINSTANCE.getEntity_RepresentativeName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__TYPE = eINSTANCE.getEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Generics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__GENERICS = eINSTANCE.getEntity_Generics();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.RelationTypeImpl <em>Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.RelationTypeImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getRelationType()
		 * @generated
		 */
		EClass RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__NAME = eINSTANCE.getRelationType_Name();

		/**
		 * The meta object literal for the '<em><b>From Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TYPE__FROM_DOMAIN = eINSTANCE.getRelationType_FromDomain();

		/**
		 * The meta object literal for the '<em><b>To Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TYPE__TO_DOMAIN = eINSTANCE.getRelationType_ToDomain();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.EntityTypeImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__NAME = eINSTANCE.getEntityType_Name();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SUPERTYPE = eINSTANCE.getEntityType_Supertype();

		/**
		 * The meta object literal for the '<em><b>Is Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__IS_TOP = eINSTANCE.getEntityType_IsTop();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.SugarImpl <em>Sugar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.SugarImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getSugar()
		 * @generated
		 */
		EClass SUGAR = eINSTANCE.getSugar();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.FunctionApplicationImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getFunctionApplication()
		 * @generated
		 */
		EClass FUNCTION_APPLICATION = eINSTANCE.getFunctionApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_APPLICATION__NAME = eINSTANCE.getFunctionApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__INPUT = eINSTANCE.getFunctionApplication_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__OUTPUT = eINSTANCE.getFunctionApplication_Output();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.MegamodelImpl <em>Megamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.MegamodelImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getMegamodel()
		 * @generated
		 */
		EClass MEGAMODEL = eINSTANCE.getMegamodel();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__PARTS = eINSTANCE.getMegamodel_Parts();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.AbstractPartImpl <em>Abstract Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.AbstractPartImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractPart()
		 * @generated
		 */
		EClass ABSTRACT_PART = eINSTANCE.getAbstractPart();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.BindingImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.DeclaredImpl <em>Declared</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.DeclaredImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getDeclared()
		 * @generated
		 */
		EClass DECLARED = eINSTANCE.getDeclared();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED__IS_MANY = eINSTANCE.getDeclared_IsMany();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED__DEFINITION = eINSTANCE.getDeclared_Definition();

	}

} //ModelPackage
