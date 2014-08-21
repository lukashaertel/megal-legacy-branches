/**
 */
package org.softlang.megal.megamodel;

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
 * @see org.softlang.megal.megamodel.MegamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface MegamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "megamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://softlang.org/megamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MegamodelPackage eINSTANCE = org.softlang.megal.megamodel.impl.MegamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.MegamodelImpl <em>Megamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.MegamodelImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getMegamodel()
	 * @generated
	 */
	int MEGAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Decls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__DECLS = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.DeclGroupImpl <em>Decl Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.DeclGroupImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getDeclGroup()
	 * @generated
	 */
	int DECL_GROUP = 1;

	/**
	 * The feature id for the '<em><b>EType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_GROUP__ETYPE_DECLS = 0;

	/**
	 * The feature id for the '<em><b>RType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_GROUP__RTYPE_DECLS = 1;

	/**
	 * The feature id for the '<em><b>EDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_GROUP__EDECLS = 2;

	/**
	 * The feature id for the '<em><b>RDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_GROUP__RDECLS = 3;

	/**
	 * The number of structural features of the '<em>Decl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Decl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ETypeDeclImpl <em>EType Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ETypeDeclImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getETypeDecl()
	 * @generated
	 */
	int ETYPE_DECL = 2;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL__SUPERTYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL__ARGS = 2;

	/**
	 * The number of structural features of the '<em>EType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.RTypeDeclImpl <em>RType Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.RTypeDeclImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getRTypeDecl()
	 * @generated
	 */
	int RTYPE_DECL = 3;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL__RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL__NAME = 2;

	/**
	 * The number of structural features of the '<em>RType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>RType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.EDeclImpl <em>EDecl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.EDeclImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getEDecl()
	 * @generated
	 */
	int EDECL = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__SHOWNAME = 2;

	/**
	 * The feature id for the '<em><b>Is Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__IS_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__IS_DEPENDENT = 4;

	/**
	 * The number of structural features of the '<em>EDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.RDeclImpl <em>RDecl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.RDeclImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getRDecl()
	 * @generated
	 */
	int RDECL = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL__RIGHT = 2;

	/**
	 * The number of structural features of the '<em>RDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>RDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ETypeImpl <em>EType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ETypeImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 6;

	/**
	 * The feature id for the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE__DEF = 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE__ARGS = 1;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE__IS_MANY = 2;

	/**
	 * The number of structural features of the '<em>EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ExETypeDeclGroupImpl <em>Ex EType Decl Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ExETypeDeclGroupImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExETypeDeclGroup()
	 * @generated
	 */
	int EX_ETYPE_DECL_GROUP = 7;

	/**
	 * The feature id for the '<em><b>EType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL_GROUP__ETYPE_DECLS = DECL_GROUP__ETYPE_DECLS;

	/**
	 * The feature id for the '<em><b>RType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL_GROUP__RTYPE_DECLS = DECL_GROUP__RTYPE_DECLS;

	/**
	 * The feature id for the '<em><b>EDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL_GROUP__EDECLS = DECL_GROUP__EDECLS;

	/**
	 * The feature id for the '<em><b>RDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL_GROUP__RDECLS = DECL_GROUP__RDECLS;

	/**
	 * The feature id for the '<em><b>Ex EType Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS = DECL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ex EType Decl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL_GROUP_FEATURE_COUNT = DECL_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ex EType Decl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL_GROUP_OPERATION_COUNT = DECL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ExETypeDeclImpl <em>Ex EType Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ExETypeDeclImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExETypeDecl()
	 * @generated
	 */
	int EX_ETYPE_DECL = 8;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL__SUPERTYPE = ETYPE_DECL__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL__NAME = ETYPE_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL__ARGS = ETYPE_DECL__ARGS;

	/**
	 * The feature id for the '<em><b>Ex Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL__EX_SUPERTYPE = ETYPE_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ex EType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL_FEATURE_COUNT = ETYPE_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ex EType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_DECL_OPERATION_COUNT = ETYPE_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ExETypeImpl <em>Ex EType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ExETypeImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExEType()
	 * @generated
	 */
	int EX_ETYPE = 9;

	/**
	 * The feature id for the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE__DEF = ETYPE__DEF;

	/**
	 * The feature id for the '<em><b>Args</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE__ARGS = ETYPE__ARGS;

	/**
	 * The feature id for the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE__IS_MANY = ETYPE__IS_MANY;

	/**
	 * The feature id for the '<em><b>Ex Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE__EX_DEF = ETYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ex Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE__EX_ARGS = ETYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ex Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE__EX_IS_MANY = ETYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ex EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_FEATURE_COUNT = ETYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ex EType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_ETYPE_OPERATION_COUNT = ETYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ExRTypeDeclGroupImpl <em>Ex RType Decl Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ExRTypeDeclGroupImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExRTypeDeclGroup()
	 * @generated
	 */
	int EX_RTYPE_DECL_GROUP = 10;

	/**
	 * The feature id for the '<em><b>EType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL_GROUP__ETYPE_DECLS = DECL_GROUP__ETYPE_DECLS;

	/**
	 * The feature id for the '<em><b>RType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL_GROUP__RTYPE_DECLS = DECL_GROUP__RTYPE_DECLS;

	/**
	 * The feature id for the '<em><b>EDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL_GROUP__EDECLS = DECL_GROUP__EDECLS;

	/**
	 * The feature id for the '<em><b>RDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL_GROUP__RDECLS = DECL_GROUP__RDECLS;

	/**
	 * The feature id for the '<em><b>Ex RType Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS = DECL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ex RType Decl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL_GROUP_FEATURE_COUNT = DECL_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ex RType Decl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL_GROUP_OPERATION_COUNT = DECL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ExRTypeDeclImpl <em>Ex RType Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ExRTypeDeclImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExRTypeDecl()
	 * @generated
	 */
	int EX_RTYPE_DECL = 11;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL__LEFT = RTYPE_DECL__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL__RIGHT = RTYPE_DECL__RIGHT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL__NAME = RTYPE_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Ex Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL__EX_LEFT = RTYPE_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ex Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL__EX_RIGHT = RTYPE_DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ex Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL__EX_NAME = RTYPE_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ex RType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL_FEATURE_COUNT = RTYPE_DECL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ex RType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RTYPE_DECL_OPERATION_COUNT = RTYPE_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ExEDeclGroupImpl <em>Ex EDecl Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ExEDeclGroupImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExEDeclGroup()
	 * @generated
	 */
	int EX_EDECL_GROUP = 12;

	/**
	 * The feature id for the '<em><b>EType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL_GROUP__ETYPE_DECLS = DECL_GROUP__ETYPE_DECLS;

	/**
	 * The feature id for the '<em><b>RType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL_GROUP__RTYPE_DECLS = DECL_GROUP__RTYPE_DECLS;

	/**
	 * The feature id for the '<em><b>EDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL_GROUP__EDECLS = DECL_GROUP__EDECLS;

	/**
	 * The feature id for the '<em><b>RDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL_GROUP__RDECLS = DECL_GROUP__RDECLS;

	/**
	 * The feature id for the '<em><b>Ex EDecls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL_GROUP__EX_EDECLS = DECL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ex EDecl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL_GROUP_FEATURE_COUNT = DECL_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ex EDecl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL_GROUP_OPERATION_COUNT = DECL_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ExEDeclImpl <em>Ex EDecl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ExEDeclImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExEDecl()
	 * @generated
	 */
	int EX_EDECL = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__TYPE = EDECL__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__NAME = EDECL__NAME;

	/**
	 * The feature id for the '<em><b>Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__SHOWNAME = EDECL__SHOWNAME;

	/**
	 * The feature id for the '<em><b>Is Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__IS_PARAMETER = EDECL__IS_PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__IS_DEPENDENT = EDECL__IS_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Ex Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__EX_NAME = EDECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ex Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__EX_SHOWNAME = EDECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ex Is Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__EX_IS_PARAMETER = EDECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ex Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__EX_IS_DEPENDENT = EDECL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL__EX_TYPE = EDECL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ex EDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL_FEATURE_COUNT = EDECL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ex EDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_EDECL_OPERATION_COUNT = EDECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ExRDeclImpl <em>Ex RDecl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ExRDeclImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExRDecl()
	 * @generated
	 */
	int EX_RDECL = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL__TYPE = RDECL__TYPE;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL__LEFT = RDECL__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL__RIGHT = RDECL__RIGHT;

	/**
	 * The feature id for the '<em><b>Ex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL__EX_TYPE = RDECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ex Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL__EX_LEFT = RDECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ex Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL__EX_RIGHT = RDECL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ex RDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL_FEATURE_COUNT = RDECL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ex RDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL_OPERATION_COUNT = RDECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.megamodel.impl.ExRDeclGroupImpl <em>Ex RDecl Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.megamodel.impl.ExRDeclGroupImpl
	 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExRDeclGroup()
	 * @generated
	 */
	int EX_RDECL_GROUP = 15;

	/**
	 * The feature id for the '<em><b>EType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL_GROUP__ETYPE_DECLS = DECL_GROUP__ETYPE_DECLS;

	/**
	 * The feature id for the '<em><b>RType Decls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL_GROUP__RTYPE_DECLS = DECL_GROUP__RTYPE_DECLS;

	/**
	 * The feature id for the '<em><b>EDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL_GROUP__EDECLS = DECL_GROUP__EDECLS;

	/**
	 * The feature id for the '<em><b>RDecls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL_GROUP__RDECLS = DECL_GROUP__RDECLS;

	/**
	 * The feature id for the '<em><b>Ex RDecls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL_GROUP__EX_RDECLS = DECL_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ex RDecl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL_GROUP_FEATURE_COUNT = DECL_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ex RDecl Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EX_RDECL_GROUP_OPERATION_COUNT = DECL_GROUP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.Megamodel <em>Megamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Megamodel</em>'.
	 * @see org.softlang.megal.megamodel.Megamodel
	 * @generated
	 */
	EClass getMegamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.megamodel.Megamodel#getDecls <em>Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decls</em>'.
	 * @see org.softlang.megal.megamodel.Megamodel#getDecls()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Decls();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.megamodel.Megamodel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see org.softlang.megal.megamodel.Megamodel#getImports()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Imports();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.DeclGroup <em>Decl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decl Group</em>'.
	 * @see org.softlang.megal.megamodel.DeclGroup
	 * @generated
	 */
	EClass getDeclGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.megamodel.DeclGroup#getETypeDecls <em>EType Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EType Decls</em>'.
	 * @see org.softlang.megal.megamodel.DeclGroup#getETypeDecls()
	 * @see #getDeclGroup()
	 * @generated
	 */
	EReference getDeclGroup_ETypeDecls();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.megamodel.DeclGroup#getRTypeDecls <em>RType Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RType Decls</em>'.
	 * @see org.softlang.megal.megamodel.DeclGroup#getRTypeDecls()
	 * @see #getDeclGroup()
	 * @generated
	 */
	EReference getDeclGroup_RTypeDecls();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.megamodel.DeclGroup#getEDecls <em>EDecls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EDecls</em>'.
	 * @see org.softlang.megal.megamodel.DeclGroup#getEDecls()
	 * @see #getDeclGroup()
	 * @generated
	 */
	EReference getDeclGroup_EDecls();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.megamodel.DeclGroup#getRDecls <em>RDecls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RDecls</em>'.
	 * @see org.softlang.megal.megamodel.DeclGroup#getRDecls()
	 * @see #getDeclGroup()
	 * @generated
	 */
	EReference getDeclGroup_RDecls();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ETypeDecl <em>EType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType Decl</em>'.
	 * @see org.softlang.megal.megamodel.ETypeDecl
	 * @generated
	 */
	EClass getETypeDecl();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.ETypeDecl#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertype</em>'.
	 * @see org.softlang.megal.megamodel.ETypeDecl#getSupertype()
	 * @see #getETypeDecl()
	 * @generated
	 */
	EReference getETypeDecl_Supertype();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.ETypeDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.megamodel.ETypeDecl#getName()
	 * @see #getETypeDecl()
	 * @generated
	 */
	EAttribute getETypeDecl_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.megamodel.ETypeDecl#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Args</em>'.
	 * @see org.softlang.megal.megamodel.ETypeDecl#getArgs()
	 * @see #getETypeDecl()
	 * @generated
	 */
	EReference getETypeDecl_Args();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.RTypeDecl <em>RType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RType Decl</em>'.
	 * @see org.softlang.megal.megamodel.RTypeDecl
	 * @generated
	 */
	EClass getRTypeDecl();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.RTypeDecl#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.softlang.megal.megamodel.RTypeDecl#getLeft()
	 * @see #getRTypeDecl()
	 * @generated
	 */
	EReference getRTypeDecl_Left();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.RTypeDecl#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.softlang.megal.megamodel.RTypeDecl#getRight()
	 * @see #getRTypeDecl()
	 * @generated
	 */
	EReference getRTypeDecl_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.RTypeDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.megamodel.RTypeDecl#getName()
	 * @see #getRTypeDecl()
	 * @generated
	 */
	EAttribute getRTypeDecl_Name();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.EDecl <em>EDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDecl</em>'.
	 * @see org.softlang.megal.megamodel.EDecl
	 * @generated
	 */
	EClass getEDecl();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.EDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.softlang.megal.megamodel.EDecl#getType()
	 * @see #getEDecl()
	 * @generated
	 */
	EReference getEDecl_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.EDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.megamodel.EDecl#getName()
	 * @see #getEDecl()
	 * @generated
	 */
	EAttribute getEDecl_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.EDecl#getShowname <em>Showname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Showname</em>'.
	 * @see org.softlang.megal.megamodel.EDecl#getShowname()
	 * @see #getEDecl()
	 * @generated
	 */
	EAttribute getEDecl_Showname();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.EDecl#isIsParameter <em>Is Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Parameter</em>'.
	 * @see org.softlang.megal.megamodel.EDecl#isIsParameter()
	 * @see #getEDecl()
	 * @generated
	 */
	EAttribute getEDecl_IsParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.EDecl#isIsDependent <em>Is Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dependent</em>'.
	 * @see org.softlang.megal.megamodel.EDecl#isIsDependent()
	 * @see #getEDecl()
	 * @generated
	 */
	EAttribute getEDecl_IsDependent();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.RDecl <em>RDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDecl</em>'.
	 * @see org.softlang.megal.megamodel.RDecl
	 * @generated
	 */
	EClass getRDecl();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.RDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.softlang.megal.megamodel.RDecl#getType()
	 * @see #getRDecl()
	 * @generated
	 */
	EReference getRDecl_Type();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.RDecl#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.softlang.megal.megamodel.RDecl#getLeft()
	 * @see #getRDecl()
	 * @generated
	 */
	EReference getRDecl_Left();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.RDecl#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.softlang.megal.megamodel.RDecl#getRight()
	 * @see #getRDecl()
	 * @generated
	 */
	EReference getRDecl_Right();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType</em>'.
	 * @see org.softlang.megal.megamodel.EType
	 * @generated
	 */
	EClass getEType();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.EType#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def</em>'.
	 * @see org.softlang.megal.megamodel.EType#getDef()
	 * @see #getEType()
	 * @generated
	 */
	EReference getEType_Def();

	/**
	 * Returns the meta object for the reference list '{@link org.softlang.megal.megamodel.EType#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Args</em>'.
	 * @see org.softlang.megal.megamodel.EType#getArgs()
	 * @see #getEType()
	 * @generated
	 */
	EReference getEType_Args();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.EType#isIsMany <em>Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Many</em>'.
	 * @see org.softlang.megal.megamodel.EType#isIsMany()
	 * @see #getEType()
	 * @generated
	 */
	EAttribute getEType_IsMany();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ExETypeDeclGroup <em>Ex EType Decl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ex EType Decl Group</em>'.
	 * @see org.softlang.megal.megamodel.ExETypeDeclGroup
	 * @generated
	 */
	EClass getExETypeDeclGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.megamodel.ExETypeDeclGroup#getExETypeDecls <em>Ex EType Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ex EType Decls</em>'.
	 * @see org.softlang.megal.megamodel.ExETypeDeclGroup#getExETypeDecls()
	 * @see #getExETypeDeclGroup()
	 * @generated
	 */
	EReference getExETypeDeclGroup_ExETypeDecls();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ExETypeDecl <em>Ex EType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ex EType Decl</em>'.
	 * @see org.softlang.megal.megamodel.ExETypeDecl
	 * @generated
	 */
	EClass getExETypeDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.megamodel.ExETypeDecl#getExSupertype <em>Ex Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ex Supertype</em>'.
	 * @see org.softlang.megal.megamodel.ExETypeDecl#getExSupertype()
	 * @see #getExETypeDecl()
	 * @generated
	 */
	EReference getExETypeDecl_ExSupertype();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ExEType <em>Ex EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ex EType</em>'.
	 * @see org.softlang.megal.megamodel.ExEType
	 * @generated
	 */
	EClass getExEType();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.ExEType#getExDef <em>Ex Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ex Def</em>'.
	 * @see org.softlang.megal.megamodel.ExEType#getExDef()
	 * @see #getExEType()
	 * @generated
	 */
	EReference getExEType_ExDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.megamodel.ExEType#getExArgs <em>Ex Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ex Args</em>'.
	 * @see org.softlang.megal.megamodel.ExEType#getExArgs()
	 * @see #getExEType()
	 * @generated
	 */
	EReference getExEType_ExArgs();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.ExEType#isExIsMany <em>Ex Is Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ex Is Many</em>'.
	 * @see org.softlang.megal.megamodel.ExEType#isExIsMany()
	 * @see #getExEType()
	 * @generated
	 */
	EAttribute getExEType_ExIsMany();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ExRTypeDeclGroup <em>Ex RType Decl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ex RType Decl Group</em>'.
	 * @see org.softlang.megal.megamodel.ExRTypeDeclGroup
	 * @generated
	 */
	EClass getExRTypeDeclGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.megamodel.ExRTypeDeclGroup#getExRTypeDecls <em>Ex RType Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ex RType Decls</em>'.
	 * @see org.softlang.megal.megamodel.ExRTypeDeclGroup#getExRTypeDecls()
	 * @see #getExRTypeDeclGroup()
	 * @generated
	 */
	EReference getExRTypeDeclGroup_ExRTypeDecls();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ExRTypeDecl <em>Ex RType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ex RType Decl</em>'.
	 * @see org.softlang.megal.megamodel.ExRTypeDecl
	 * @generated
	 */
	EClass getExRTypeDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.megamodel.ExRTypeDecl#getExLeft <em>Ex Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ex Left</em>'.
	 * @see org.softlang.megal.megamodel.ExRTypeDecl#getExLeft()
	 * @see #getExRTypeDecl()
	 * @generated
	 */
	EReference getExRTypeDecl_ExLeft();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.megamodel.ExRTypeDecl#getExRight <em>Ex Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ex Right</em>'.
	 * @see org.softlang.megal.megamodel.ExRTypeDecl#getExRight()
	 * @see #getExRTypeDecl()
	 * @generated
	 */
	EReference getExRTypeDecl_ExRight();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.ExRTypeDecl#getExName <em>Ex Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ex Name</em>'.
	 * @see org.softlang.megal.megamodel.ExRTypeDecl#getExName()
	 * @see #getExRTypeDecl()
	 * @generated
	 */
	EAttribute getExRTypeDecl_ExName();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ExEDeclGroup <em>Ex EDecl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ex EDecl Group</em>'.
	 * @see org.softlang.megal.megamodel.ExEDeclGroup
	 * @generated
	 */
	EClass getExEDeclGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.megamodel.ExEDeclGroup#getExEDecls <em>Ex EDecls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ex EDecls</em>'.
	 * @see org.softlang.megal.megamodel.ExEDeclGroup#getExEDecls()
	 * @see #getExEDeclGroup()
	 * @generated
	 */
	EReference getExEDeclGroup_ExEDecls();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ExEDecl <em>Ex EDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ex EDecl</em>'.
	 * @see org.softlang.megal.megamodel.ExEDecl
	 * @generated
	 */
	EClass getExEDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.ExEDecl#getExName <em>Ex Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ex Name</em>'.
	 * @see org.softlang.megal.megamodel.ExEDecl#getExName()
	 * @see #getExEDecl()
	 * @generated
	 */
	EAttribute getExEDecl_ExName();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.ExEDecl#getExShowname <em>Ex Showname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ex Showname</em>'.
	 * @see org.softlang.megal.megamodel.ExEDecl#getExShowname()
	 * @see #getExEDecl()
	 * @generated
	 */
	EAttribute getExEDecl_ExShowname();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.ExEDecl#isExIsParameter <em>Ex Is Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ex Is Parameter</em>'.
	 * @see org.softlang.megal.megamodel.ExEDecl#isExIsParameter()
	 * @see #getExEDecl()
	 * @generated
	 */
	EAttribute getExEDecl_ExIsParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.megamodel.ExEDecl#isExIsDependent <em>Ex Is Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ex Is Dependent</em>'.
	 * @see org.softlang.megal.megamodel.ExEDecl#isExIsDependent()
	 * @see #getExEDecl()
	 * @generated
	 */
	EAttribute getExEDecl_ExIsDependent();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.megamodel.ExEDecl#getExType <em>Ex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ex Type</em>'.
	 * @see org.softlang.megal.megamodel.ExEDecl#getExType()
	 * @see #getExEDecl()
	 * @generated
	 */
	EReference getExEDecl_ExType();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ExRDecl <em>Ex RDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ex RDecl</em>'.
	 * @see org.softlang.megal.megamodel.ExRDecl
	 * @generated
	 */
	EClass getExRDecl();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.ExRDecl#getExType <em>Ex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ex Type</em>'.
	 * @see org.softlang.megal.megamodel.ExRDecl#getExType()
	 * @see #getExRDecl()
	 * @generated
	 */
	EReference getExRDecl_ExType();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.ExRDecl#getExLeft <em>Ex Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ex Left</em>'.
	 * @see org.softlang.megal.megamodel.ExRDecl#getExLeft()
	 * @see #getExRDecl()
	 * @generated
	 */
	EReference getExRDecl_ExLeft();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.megamodel.ExRDecl#getExRight <em>Ex Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ex Right</em>'.
	 * @see org.softlang.megal.megamodel.ExRDecl#getExRight()
	 * @see #getExRDecl()
	 * @generated
	 */
	EReference getExRDecl_ExRight();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.megamodel.ExRDeclGroup <em>Ex RDecl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ex RDecl Group</em>'.
	 * @see org.softlang.megal.megamodel.ExRDeclGroup
	 * @generated
	 */
	EClass getExRDeclGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.megamodel.ExRDeclGroup#getExRDecls <em>Ex RDecls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ex RDecls</em>'.
	 * @see org.softlang.megal.megamodel.ExRDeclGroup#getExRDecls()
	 * @see #getExRDeclGroup()
	 * @generated
	 */
	EReference getExRDeclGroup_ExRDecls();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MegamodelFactory getMegamodelFactory();

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
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.MegamodelImpl <em>Megamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.MegamodelImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getMegamodel()
		 * @generated
		 */
		EClass MEGAMODEL = eINSTANCE.getMegamodel();

		/**
		 * The meta object literal for the '<em><b>Decls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__DECLS = eINSTANCE.getMegamodel_Decls();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__IMPORTS = eINSTANCE.getMegamodel_Imports();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.DeclGroupImpl <em>Decl Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.DeclGroupImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getDeclGroup()
		 * @generated
		 */
		EClass DECL_GROUP = eINSTANCE.getDeclGroup();

		/**
		 * The meta object literal for the '<em><b>EType Decls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECL_GROUP__ETYPE_DECLS = eINSTANCE.getDeclGroup_ETypeDecls();

		/**
		 * The meta object literal for the '<em><b>RType Decls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECL_GROUP__RTYPE_DECLS = eINSTANCE.getDeclGroup_RTypeDecls();

		/**
		 * The meta object literal for the '<em><b>EDecls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECL_GROUP__EDECLS = eINSTANCE.getDeclGroup_EDecls();

		/**
		 * The meta object literal for the '<em><b>RDecls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECL_GROUP__RDECLS = eINSTANCE.getDeclGroup_RDecls();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ETypeDeclImpl <em>EType Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ETypeDeclImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getETypeDecl()
		 * @generated
		 */
		EClass ETYPE_DECL = eINSTANCE.getETypeDecl();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_DECL__SUPERTYPE = eINSTANCE.getETypeDecl_Supertype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPE_DECL__NAME = eINSTANCE.getETypeDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_DECL__ARGS = eINSTANCE.getETypeDecl_Args();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.RTypeDeclImpl <em>RType Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.RTypeDeclImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getRTypeDecl()
		 * @generated
		 */
		EClass RTYPE_DECL = eINSTANCE.getRTypeDecl();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTYPE_DECL__LEFT = eINSTANCE.getRTypeDecl_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTYPE_DECL__RIGHT = eINSTANCE.getRTypeDecl_Right();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTYPE_DECL__NAME = eINSTANCE.getRTypeDecl_Name();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.EDeclImpl <em>EDecl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.EDeclImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getEDecl()
		 * @generated
		 */
		EClass EDECL = eINSTANCE.getEDecl();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDECL__TYPE = eINSTANCE.getEDecl_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDECL__NAME = eINSTANCE.getEDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Showname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDECL__SHOWNAME = eINSTANCE.getEDecl_Showname();

		/**
		 * The meta object literal for the '<em><b>Is Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDECL__IS_PARAMETER = eINSTANCE.getEDecl_IsParameter();

		/**
		 * The meta object literal for the '<em><b>Is Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDECL__IS_DEPENDENT = eINSTANCE.getEDecl_IsDependent();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.RDeclImpl <em>RDecl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.RDeclImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getRDecl()
		 * @generated
		 */
		EClass RDECL = eINSTANCE.getRDecl();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDECL__TYPE = eINSTANCE.getRDecl_Type();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDECL__LEFT = eINSTANCE.getRDecl_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDECL__RIGHT = eINSTANCE.getRDecl_Right();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ETypeImpl <em>EType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ETypeImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getEType()
		 * @generated
		 */
		EClass ETYPE = eINSTANCE.getEType();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE__DEF = eINSTANCE.getEType_Def();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE__ARGS = eINSTANCE.getEType_Args();

		/**
		 * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPE__IS_MANY = eINSTANCE.getEType_IsMany();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ExETypeDeclGroupImpl <em>Ex EType Decl Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ExETypeDeclGroupImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExETypeDeclGroup()
		 * @generated
		 */
		EClass EX_ETYPE_DECL_GROUP = eINSTANCE.getExETypeDeclGroup();

		/**
		 * The meta object literal for the '<em><b>Ex EType Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS = eINSTANCE.getExETypeDeclGroup_ExETypeDecls();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ExETypeDeclImpl <em>Ex EType Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ExETypeDeclImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExETypeDecl()
		 * @generated
		 */
		EClass EX_ETYPE_DECL = eINSTANCE.getExETypeDecl();

		/**
		 * The meta object literal for the '<em><b>Ex Supertype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_ETYPE_DECL__EX_SUPERTYPE = eINSTANCE.getExETypeDecl_ExSupertype();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ExETypeImpl <em>Ex EType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ExETypeImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExEType()
		 * @generated
		 */
		EClass EX_ETYPE = eINSTANCE.getExEType();

		/**
		 * The meta object literal for the '<em><b>Ex Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_ETYPE__EX_DEF = eINSTANCE.getExEType_ExDef();

		/**
		 * The meta object literal for the '<em><b>Ex Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_ETYPE__EX_ARGS = eINSTANCE.getExEType_ExArgs();

		/**
		 * The meta object literal for the '<em><b>Ex Is Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_ETYPE__EX_IS_MANY = eINSTANCE.getExEType_ExIsMany();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ExRTypeDeclGroupImpl <em>Ex RType Decl Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ExRTypeDeclGroupImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExRTypeDeclGroup()
		 * @generated
		 */
		EClass EX_RTYPE_DECL_GROUP = eINSTANCE.getExRTypeDeclGroup();

		/**
		 * The meta object literal for the '<em><b>Ex RType Decls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS = eINSTANCE.getExRTypeDeclGroup_ExRTypeDecls();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ExRTypeDeclImpl <em>Ex RType Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ExRTypeDeclImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExRTypeDecl()
		 * @generated
		 */
		EClass EX_RTYPE_DECL = eINSTANCE.getExRTypeDecl();

		/**
		 * The meta object literal for the '<em><b>Ex Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_RTYPE_DECL__EX_LEFT = eINSTANCE.getExRTypeDecl_ExLeft();

		/**
		 * The meta object literal for the '<em><b>Ex Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_RTYPE_DECL__EX_RIGHT = eINSTANCE.getExRTypeDecl_ExRight();

		/**
		 * The meta object literal for the '<em><b>Ex Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_RTYPE_DECL__EX_NAME = eINSTANCE.getExRTypeDecl_ExName();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ExEDeclGroupImpl <em>Ex EDecl Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ExEDeclGroupImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExEDeclGroup()
		 * @generated
		 */
		EClass EX_EDECL_GROUP = eINSTANCE.getExEDeclGroup();

		/**
		 * The meta object literal for the '<em><b>Ex EDecls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_EDECL_GROUP__EX_EDECLS = eINSTANCE.getExEDeclGroup_ExEDecls();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ExEDeclImpl <em>Ex EDecl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ExEDeclImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExEDecl()
		 * @generated
		 */
		EClass EX_EDECL = eINSTANCE.getExEDecl();

		/**
		 * The meta object literal for the '<em><b>Ex Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_EDECL__EX_NAME = eINSTANCE.getExEDecl_ExName();

		/**
		 * The meta object literal for the '<em><b>Ex Showname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_EDECL__EX_SHOWNAME = eINSTANCE.getExEDecl_ExShowname();

		/**
		 * The meta object literal for the '<em><b>Ex Is Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_EDECL__EX_IS_PARAMETER = eINSTANCE.getExEDecl_ExIsParameter();

		/**
		 * The meta object literal for the '<em><b>Ex Is Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EX_EDECL__EX_IS_DEPENDENT = eINSTANCE.getExEDecl_ExIsDependent();

		/**
		 * The meta object literal for the '<em><b>Ex Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_EDECL__EX_TYPE = eINSTANCE.getExEDecl_ExType();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ExRDeclImpl <em>Ex RDecl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ExRDeclImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExRDecl()
		 * @generated
		 */
		EClass EX_RDECL = eINSTANCE.getExRDecl();

		/**
		 * The meta object literal for the '<em><b>Ex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_RDECL__EX_TYPE = eINSTANCE.getExRDecl_ExType();

		/**
		 * The meta object literal for the '<em><b>Ex Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_RDECL__EX_LEFT = eINSTANCE.getExRDecl_ExLeft();

		/**
		 * The meta object literal for the '<em><b>Ex Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_RDECL__EX_RIGHT = eINSTANCE.getExRDecl_ExRight();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.megamodel.impl.ExRDeclGroupImpl <em>Ex RDecl Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.megamodel.impl.ExRDeclGroupImpl
		 * @see org.softlang.megal.megamodel.impl.MegamodelPackageImpl#getExRDeclGroup()
		 * @generated
		 */
		EClass EX_RDECL_GROUP = eINSTANCE.getExRDeclGroup();

		/**
		 * The meta object literal for the '<em><b>Ex RDecls</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EX_RDECL_GROUP__EX_RDECLS = eINSTANCE.getExRDeclGroup_ExRDecls();

	}

} //MegamodelPackage
