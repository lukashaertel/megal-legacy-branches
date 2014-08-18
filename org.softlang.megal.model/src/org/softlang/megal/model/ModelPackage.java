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
	int ABSTRACT_PART = 18;

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
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__IMPORTS = ABSTRACT_PART_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__CONFIGURATION = ABSTRACT_PART_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = ABSTRACT_PART_FEATURE_COUNT + 9;

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
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TO = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
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
	 * The meta object id for the '{@link org.softlang.megal.model.impl.AbstractEntityRefImpl <em>Abstract Entity Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.AbstractEntityRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractEntityRef()
	 * @generated
	 */
	int ABSTRACT_ENTITY_REF = 2;

	/**
	 * The number of structural features of the '<em>Abstract Entity Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_REF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Entity Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.PointerEntityRefImpl <em>Pointer Entity Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.PointerEntityRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPointerEntityRef()
	 * @generated
	 */
	int POINTER_ENTITY_REF = 3;

	/**
	 * The feature id for the '<em><b>Refered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ENTITY_REF__REFERED = ABSTRACT_ENTITY_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer Entity Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ENTITY_REF_FEATURE_COUNT = ABSTRACT_ENTITY_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pointer Entity Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ENTITY_REF_OPERATION_COUNT = ABSTRACT_ENTITY_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.EntityImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 4;

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
	 * The feature id for the '<em><b>Generics</b></em>' containment reference list.
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
	int RELATION_TYPE = 5;

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
	 * The meta object id for the '{@link org.softlang.megal.model.impl.AbstractRelationTypeRefImpl <em>Abstract Relation Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.AbstractRelationTypeRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractRelationTypeRef()
	 * @generated
	 */
	int ABSTRACT_RELATION_TYPE_REF = 6;

	/**
	 * The number of structural features of the '<em>Abstract Relation Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELATION_TYPE_REF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Relation Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELATION_TYPE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.PointerRelationTypeRefImpl <em>Pointer Relation Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.PointerRelationTypeRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPointerRelationTypeRef()
	 * @generated
	 */
	int POINTER_RELATION_TYPE_REF = 7;

	/**
	 * The feature id for the '<em><b>Refered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_RELATION_TYPE_REF__REFERED = ABSTRACT_RELATION_TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer Relation Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_RELATION_TYPE_REF_FEATURE_COUNT = ABSTRACT_RELATION_TYPE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pointer Relation Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_RELATION_TYPE_REF_OPERATION_COUNT = ABSTRACT_RELATION_TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.EntityTypeImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 8;

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
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.AbstractEntityTypeRefImpl <em>Abstract Entity Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.AbstractEntityTypeRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractEntityTypeRef()
	 * @generated
	 */
	int ABSTRACT_ENTITY_TYPE_REF = 9;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_TYPE_REF__IS_MANY = 0;

	/**
	 * The number of structural features of the '<em>Abstract Entity Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_TYPE_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Entity Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_TYPE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.TopEntityTypeRefImpl <em>Top Entity Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.TopEntityTypeRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getTopEntityTypeRef()
	 * @generated
	 */
	int TOP_ENTITY_TYPE_REF = 10;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ENTITY_TYPE_REF__IS_MANY = ABSTRACT_ENTITY_TYPE_REF__IS_MANY;

	/**
	 * The number of structural features of the '<em>Top Entity Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ENTITY_TYPE_REF_FEATURE_COUNT = ABSTRACT_ENTITY_TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Top Entity Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_ENTITY_TYPE_REF_OPERATION_COUNT = ABSTRACT_ENTITY_TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.PointerEntityTypeRefImpl <em>Pointer Entity Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.PointerEntityTypeRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPointerEntityTypeRef()
	 * @generated
	 */
	int POINTER_ENTITY_TYPE_REF = 11;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ENTITY_TYPE_REF__IS_MANY = ABSTRACT_ENTITY_TYPE_REF__IS_MANY;

	/**
	 * The feature id for the '<em><b>Refered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ENTITY_TYPE_REF__REFERED = ABSTRACT_ENTITY_TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer Entity Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ENTITY_TYPE_REF_FEATURE_COUNT = ABSTRACT_ENTITY_TYPE_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pointer Entity Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_ENTITY_TYPE_REF_OPERATION_COUNT = ABSTRACT_ENTITY_TYPE_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.SugarImpl <em>Sugar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.SugarImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getSugar()
	 * @generated
	 */
	int SUGAR = 12;

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
	int FUNCTION_APPLICATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__NAME = SUGAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__INPUT = SUGAR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
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
	 * The meta object id for the '{@link org.softlang.megal.model.impl.AbstractDeclarationRefImpl <em>Abstract Declaration Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.AbstractDeclarationRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractDeclarationRef()
	 * @generated
	 */
	int ABSTRACT_DECLARATION_REF = 14;

	/**
	 * The number of structural features of the '<em>Abstract Declaration Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION_REF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Declaration Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DECLARATION_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.PreludeDeclarationRefImpl <em>Prelude Declaration Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.PreludeDeclarationRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPreludeDeclarationRef()
	 * @generated
	 */
	int PRELUDE_DECLARATION_REF = 15;

	/**
	 * The number of structural features of the '<em>Prelude Declaration Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELUDE_DECLARATION_REF_FEATURE_COUNT = ABSTRACT_DECLARATION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prelude Declaration Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRELUDE_DECLARATION_REF_OPERATION_COUNT = ABSTRACT_DECLARATION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.PointerDeclarationRefImpl <em>Pointer Declaration Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.PointerDeclarationRefImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPointerDeclarationRef()
	 * @generated
	 */
	int POINTER_DECLARATION_REF = 16;

	/**
	 * The feature id for the '<em><b>Refered</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_DECLARATION_REF__REFERED = ABSTRACT_DECLARATION_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer Declaration Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_DECLARATION_REF_FEATURE_COUNT = ABSTRACT_DECLARATION_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pointer Declaration Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_DECLARATION_REF_OPERATION_COUNT = ABSTRACT_DECLARATION_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.MegamodelImpl <em>Megamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.MegamodelImpl
	 * @see org.softlang.megal.model.impl.ModelPackageImpl#getMegamodel()
	 * @generated
	 */
	int MEGAMODEL = 17;

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
	int BINDING = 19;

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
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Declaration#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.softlang.megal.model.Declaration#getImports()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Imports();

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
	 * Returns the meta object for class '{@link org.softlang.megal.model.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.softlang.megal.model.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.Relation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.softlang.megal.model.Relation#getFrom()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.Relation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.softlang.megal.model.Relation#getTo()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_To();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.softlang.megal.model.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Type();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.AbstractEntityRef <em>Abstract Entity Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Entity Ref</em>'.
	 * @see org.softlang.megal.model.AbstractEntityRef
	 * @generated
	 */
	EClass getAbstractEntityRef();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.PointerEntityRef <em>Pointer Entity Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Entity Ref</em>'.
	 * @see org.softlang.megal.model.PointerEntityRef
	 * @generated
	 */
	EClass getPointerEntityRef();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.PointerEntityRef#getRefered <em>Refered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refered</em>'.
	 * @see org.softlang.megal.model.PointerEntityRef#getRefered()
	 * @see #getPointerEntityRef()
	 * @generated
	 */
	EReference getPointerEntityRef_Refered();

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
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Entity#getGenerics <em>Generics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generics</em>'.
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
	 * Returns the meta object for class '{@link org.softlang.megal.model.AbstractRelationTypeRef <em>Abstract Relation Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Relation Type Ref</em>'.
	 * @see org.softlang.megal.model.AbstractRelationTypeRef
	 * @generated
	 */
	EClass getAbstractRelationTypeRef();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.PointerRelationTypeRef <em>Pointer Relation Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Relation Type Ref</em>'.
	 * @see org.softlang.megal.model.PointerRelationTypeRef
	 * @generated
	 */
	EClass getPointerRelationTypeRef();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.PointerRelationTypeRef#getRefered <em>Refered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refered</em>'.
	 * @see org.softlang.megal.model.PointerRelationTypeRef#getRefered()
	 * @see #getPointerRelationTypeRef()
	 * @generated
	 */
	EReference getPointerRelationTypeRef_Refered();

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
	 * Returns the meta object for class '{@link org.softlang.megal.model.AbstractEntityTypeRef <em>Abstract Entity Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Entity Type Ref</em>'.
	 * @see org.softlang.megal.model.AbstractEntityTypeRef
	 * @generated
	 */
	EClass getAbstractEntityTypeRef();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.AbstractEntityTypeRef#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see org.softlang.megal.model.AbstractEntityTypeRef#isIsMany()
	 * @see #getAbstractEntityTypeRef()
	 * @generated
	 */
	EAttribute getAbstractEntityTypeRef_IsMany();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.TopEntityTypeRef <em>Top Entity Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Entity Type Ref</em>'.
	 * @see org.softlang.megal.model.TopEntityTypeRef
	 * @generated
	 */
	EClass getTopEntityTypeRef();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.PointerEntityTypeRef <em>Pointer Entity Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Entity Type Ref</em>'.
	 * @see org.softlang.megal.model.PointerEntityTypeRef
	 * @generated
	 */
	EClass getPointerEntityTypeRef();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.PointerEntityTypeRef#getRefered <em>Refered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refered</em>'.
	 * @see org.softlang.megal.model.PointerEntityTypeRef#getRefered()
	 * @see #getPointerEntityTypeRef()
	 * @generated
	 */
	EReference getPointerEntityTypeRef_Refered();

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
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.FunctionApplication#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.softlang.megal.model.FunctionApplication#getInput()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.FunctionApplication#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.softlang.megal.model.FunctionApplication#getOutput()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Output();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.AbstractDeclarationRef <em>Abstract Declaration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Declaration Ref</em>'.
	 * @see org.softlang.megal.model.AbstractDeclarationRef
	 * @generated
	 */
	EClass getAbstractDeclarationRef();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.PreludeDeclarationRef <em>Prelude Declaration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prelude Declaration Ref</em>'.
	 * @see org.softlang.megal.model.PreludeDeclarationRef
	 * @generated
	 */
	EClass getPreludeDeclarationRef();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.PointerDeclarationRef <em>Pointer Declaration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Declaration Ref</em>'.
	 * @see org.softlang.megal.model.PointerDeclarationRef
	 * @generated
	 */
	EClass getPointerDeclarationRef();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.PointerDeclarationRef#getRefered <em>Refered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refered</em>'.
	 * @see org.softlang.megal.model.PointerDeclarationRef#getRefered()
	 * @see #getPointerDeclarationRef()
	 * @generated
	 */
	EReference getPointerDeclarationRef_Refered();

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
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__IMPORTS = eINSTANCE.getDeclaration_Imports();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION__CONFIGURATION = eINSTANCE.getDeclaration_Configuration();

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
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__FROM = eINSTANCE.getRelation_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TO = eINSTANCE.getRelation_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.AbstractEntityRefImpl <em>Abstract Entity Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.AbstractEntityRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractEntityRef()
		 * @generated
		 */
		EClass ABSTRACT_ENTITY_REF = eINSTANCE.getAbstractEntityRef();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.PointerEntityRefImpl <em>Pointer Entity Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.PointerEntityRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPointerEntityRef()
		 * @generated
		 */
		EClass POINTER_ENTITY_REF = eINSTANCE.getPointerEntityRef();

		/**
		 * The meta object literal for the '<em><b>Refered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_ENTITY_REF__REFERED = eINSTANCE.getPointerEntityRef_Refered();

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
		 * The meta object literal for the '<em><b>Generics</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.AbstractRelationTypeRefImpl <em>Abstract Relation Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.AbstractRelationTypeRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractRelationTypeRef()
		 * @generated
		 */
		EClass ABSTRACT_RELATION_TYPE_REF = eINSTANCE.getAbstractRelationTypeRef();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.PointerRelationTypeRefImpl <em>Pointer Relation Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.PointerRelationTypeRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPointerRelationTypeRef()
		 * @generated
		 */
		EClass POINTER_RELATION_TYPE_REF = eINSTANCE.getPointerRelationTypeRef();

		/**
		 * The meta object literal for the '<em><b>Refered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_RELATION_TYPE_REF__REFERED = eINSTANCE.getPointerRelationTypeRef_Refered();

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
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.AbstractEntityTypeRefImpl <em>Abstract Entity Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.AbstractEntityTypeRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractEntityTypeRef()
		 * @generated
		 */
		EClass ABSTRACT_ENTITY_TYPE_REF = eINSTANCE.getAbstractEntityTypeRef();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ENTITY_TYPE_REF__IS_MANY = eINSTANCE.getAbstractEntityTypeRef_IsMany();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.TopEntityTypeRefImpl <em>Top Entity Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.TopEntityTypeRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getTopEntityTypeRef()
		 * @generated
		 */
		EClass TOP_ENTITY_TYPE_REF = eINSTANCE.getTopEntityTypeRef();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.PointerEntityTypeRefImpl <em>Pointer Entity Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.PointerEntityTypeRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPointerEntityTypeRef()
		 * @generated
		 */
		EClass POINTER_ENTITY_TYPE_REF = eINSTANCE.getPointerEntityTypeRef();

		/**
		 * The meta object literal for the '<em><b>Refered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_ENTITY_TYPE_REF__REFERED = eINSTANCE.getPointerEntityTypeRef_Refered();

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
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__INPUT = eINSTANCE.getFunctionApplication_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__OUTPUT = eINSTANCE.getFunctionApplication_Output();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.AbstractDeclarationRefImpl <em>Abstract Declaration Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.AbstractDeclarationRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getAbstractDeclarationRef()
		 * @generated
		 */
		EClass ABSTRACT_DECLARATION_REF = eINSTANCE.getAbstractDeclarationRef();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.PreludeDeclarationRefImpl <em>Prelude Declaration Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.PreludeDeclarationRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPreludeDeclarationRef()
		 * @generated
		 */
		EClass PRELUDE_DECLARATION_REF = eINSTANCE.getPreludeDeclarationRef();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.PointerDeclarationRefImpl <em>Pointer Declaration Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.PointerDeclarationRefImpl
		 * @see org.softlang.megal.model.impl.ModelPackageImpl#getPointerDeclarationRef()
		 * @generated
		 */
		EClass POINTER_DECLARATION_REF = eINSTANCE.getPointerDeclarationRef();

		/**
		 * The meta object literal for the '<em><b>Refered</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_DECLARATION_REF__REFERED = eINSTANCE.getPointerDeclarationRef_Refered();

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

	}

} //ModelPackage
