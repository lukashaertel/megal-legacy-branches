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
 * @see org.softlang.megal.model.MegalFactory
 * @model kind="package"
 * @generated
 */
public interface MegalPackage extends EPackage {
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
	String eNS_URI = "http://softlang.org/megamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MegalPackage eINSTANCE = org.softlang.megal.model.impl.MegalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.MegamodelImpl <em>Megamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.MegamodelImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getMegamodel()
	 * @generated
	 */
	int MEGAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>EType Decls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__ETYPE_DECLS = 1;

	/**
	 * The feature id for the '<em><b>RType Decls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__RTYPE_DECLS = 2;

	/**
	 * The feature id for the '<em><b>EDecls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__EDECLS = 3;

	/**
	 * The feature id for the '<em><b>RDecls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL__RDECLS = 4;

	/**
	 * The number of structural features of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Megamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEGAMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.DeclImpl <em>Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.DeclImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getDecl()
	 * @generated
	 */
	int DECL = 1;

	/**
	 * The number of structural features of the '<em>Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.NamedDeclImpl <em>Named Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.NamedDeclImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getNamedDecl()
	 * @generated
	 */
	int NAMED_DECL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECL__NAME = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECL__SHOWNAME = DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Named Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DECL_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.ETypeDeclImpl <em>EType Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.ETypeDeclImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getETypeDecl()
	 * @generated
	 */
	int ETYPE_DECL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL__NAME = NAMED_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL__SHOWNAME = NAMED_DECL__SHOWNAME;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL__SUPERTYPE = NAMED_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL_FEATURE_COUNT = NAMED_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_DECL_OPERATION_COUNT = NAMED_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.RTypeDeclImpl <em>RType Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.RTypeDeclImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getRTypeDecl()
	 * @generated
	 */
	int RTYPE_DECL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL__NAME = NAMED_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL__SHOWNAME = NAMED_DECL__SHOWNAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL__LEFT = NAMED_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL__RIGHT = NAMED_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL_FEATURE_COUNT = NAMED_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RType Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTYPE_DECL_OPERATION_COUNT = NAMED_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.EDeclImpl <em>EDecl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.EDeclImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getEDecl()
	 * @generated
	 */
	int EDECL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__NAME = NAMED_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__SHOWNAME = NAMED_DECL__SHOWNAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__TYPE = NAMED_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__DEPENDENT = NAMED_DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL__PARAMETER = NAMED_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL_FEATURE_COUNT = NAMED_DECL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDECL_OPERATION_COUNT = NAMED_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.RDeclImpl <em>RDecl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.RDeclImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getRDecl()
	 * @generated
	 */
	int RDECL = 6;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL__LEFT = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL__TYPE = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL__RIGHT = DECL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>RDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDECL_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.ETypeImpl <em>EType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.ETypeImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 7;

	/**
	 * The feature id for the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE__DEF = 0;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE__MANY = 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE__ARGS = 2;

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
	 * The meta object id for the '{@link org.softlang.megal.model.impl.AppDeclImpl <em>App Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.AppDeclImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getAppDecl()
	 * @generated
	 */
	int APP_DECL = 8;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DECL__FUNCTION = DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DECL__INPUT = DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DECL__OUTPUT = DECL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>App Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DECL_FEATURE_COUNT = DECL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>App Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DECL_OPERATION_COUNT = DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.softlang.megal.model.impl.FDeclImpl <em>FDecl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.softlang.megal.model.impl.FDeclImpl
	 * @see org.softlang.megal.model.impl.MegalPackageImpl#getFDecl()
	 * @generated
	 */
	int FDECL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDECL__NAME = NAMED_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDECL__SHOWNAME = NAMED_DECL__SHOWNAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDECL__DOMAIN = NAMED_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDECL__CODOMAIN = NAMED_DECL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDECL__DEPENDENT = NAMED_DECL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDECL__PARAMETER = NAMED_DECL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDECL_FEATURE_COUNT = NAMED_DECL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>FDecl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDECL_OPERATION_COUNT = NAMED_DECL_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference list '{@link org.softlang.megal.model.Megamodel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see org.softlang.megal.model.Megamodel#getImports()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Megamodel#getETypeDecls <em>EType Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Decls</em>'.
	 * @see org.softlang.megal.model.Megamodel#getETypeDecls()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_ETypeDecls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Megamodel#getRTypeDecls <em>RType Decls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RType Decls</em>'.
	 * @see org.softlang.megal.model.Megamodel#getRTypeDecls()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_RTypeDecls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Megamodel#getEDecls <em>EDecls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EDecls</em>'.
	 * @see org.softlang.megal.model.Megamodel#getEDecls()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_EDecls();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.Megamodel#getRDecls <em>RDecls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RDecls</em>'.
	 * @see org.softlang.megal.model.Megamodel#getRDecls()
	 * @see #getMegamodel()
	 * @generated
	 */
	EReference getMegamodel_RDecls();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.Decl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decl</em>'.
	 * @see org.softlang.megal.model.Decl
	 * @generated
	 */
	EClass getDecl();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.NamedDecl <em>Named Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Decl</em>'.
	 * @see org.softlang.megal.model.NamedDecl
	 * @generated
	 */
	EClass getNamedDecl();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.NamedDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.softlang.megal.model.NamedDecl#getName()
	 * @see #getNamedDecl()
	 * @generated
	 */
	EAttribute getNamedDecl_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.NamedDecl#getShowname <em>Showname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Showname</em>'.
	 * @see org.softlang.megal.model.NamedDecl#getShowname()
	 * @see #getNamedDecl()
	 * @generated
	 */
	EAttribute getNamedDecl_Showname();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.ETypeDecl <em>EType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType Decl</em>'.
	 * @see org.softlang.megal.model.ETypeDecl
	 * @generated
	 */
	EClass getETypeDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.ETypeDecl#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supertype</em>'.
	 * @see org.softlang.megal.model.ETypeDecl#getSupertype()
	 * @see #getETypeDecl()
	 * @generated
	 */
	EReference getETypeDecl_Supertype();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.RTypeDecl <em>RType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RType Decl</em>'.
	 * @see org.softlang.megal.model.RTypeDecl
	 * @generated
	 */
	EClass getRTypeDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.RTypeDecl#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.softlang.megal.model.RTypeDecl#getLeft()
	 * @see #getRTypeDecl()
	 * @generated
	 */
	EReference getRTypeDecl_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.RTypeDecl#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.softlang.megal.model.RTypeDecl#getRight()
	 * @see #getRTypeDecl()
	 * @generated
	 */
	EReference getRTypeDecl_Right();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.EDecl <em>EDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDecl</em>'.
	 * @see org.softlang.megal.model.EDecl
	 * @generated
	 */
	EClass getEDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.EDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.softlang.megal.model.EDecl#getType()
	 * @see #getEDecl()
	 * @generated
	 */
	EReference getEDecl_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.EDecl#isDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent</em>'.
	 * @see org.softlang.megal.model.EDecl#isDependent()
	 * @see #getEDecl()
	 * @generated
	 */
	EAttribute getEDecl_Dependent();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.EDecl#isParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see org.softlang.megal.model.EDecl#isParameter()
	 * @see #getEDecl()
	 * @generated
	 */
	EAttribute getEDecl_Parameter();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.RDecl <em>RDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDecl</em>'.
	 * @see org.softlang.megal.model.RDecl
	 * @generated
	 */
	EClass getRDecl();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.RDecl#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see org.softlang.megal.model.RDecl#getLeft()
	 * @see #getRDecl()
	 * @generated
	 */
	EReference getRDecl_Left();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.RDecl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.softlang.megal.model.RDecl#getType()
	 * @see #getRDecl()
	 * @generated
	 */
	EReference getRDecl_Type();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.RDecl#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see org.softlang.megal.model.RDecl#getRight()
	 * @see #getRDecl()
	 * @generated
	 */
	EReference getRDecl_Right();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType</em>'.
	 * @see org.softlang.megal.model.EType
	 * @generated
	 */
	EClass getEType();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.EType#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def</em>'.
	 * @see org.softlang.megal.model.EType#getDef()
	 * @see #getEType()
	 * @generated
	 */
	EReference getEType_Def();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.EType#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.softlang.megal.model.EType#isMany()
	 * @see #getEType()
	 * @generated
	 */
	EAttribute getEType_Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.softlang.megal.model.EType#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see org.softlang.megal.model.EType#getArgs()
	 * @see #getEType()
	 * @generated
	 */
	EReference getEType_Args();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.AppDecl <em>App Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Decl</em>'.
	 * @see org.softlang.megal.model.AppDecl
	 * @generated
	 */
	EClass getAppDecl();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.AppDecl#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.softlang.megal.model.AppDecl#getFunction()
	 * @see #getAppDecl()
	 * @generated
	 */
	EReference getAppDecl_Function();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.AppDecl#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see org.softlang.megal.model.AppDecl#getInput()
	 * @see #getAppDecl()
	 * @generated
	 */
	EReference getAppDecl_Input();

	/**
	 * Returns the meta object for the reference '{@link org.softlang.megal.model.AppDecl#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see org.softlang.megal.model.AppDecl#getOutput()
	 * @see #getAppDecl()
	 * @generated
	 */
	EReference getAppDecl_Output();

	/**
	 * Returns the meta object for class '{@link org.softlang.megal.model.FDecl <em>FDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FDecl</em>'.
	 * @see org.softlang.megal.model.FDecl
	 * @generated
	 */
	EClass getFDecl();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.FDecl#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.softlang.megal.model.FDecl#getDomain()
	 * @see #getFDecl()
	 * @generated
	 */
	EReference getFDecl_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link org.softlang.megal.model.FDecl#getCodomain <em>Codomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Codomain</em>'.
	 * @see org.softlang.megal.model.FDecl#getCodomain()
	 * @see #getFDecl()
	 * @generated
	 */
	EReference getFDecl_Codomain();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.FDecl#isDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent</em>'.
	 * @see org.softlang.megal.model.FDecl#isDependent()
	 * @see #getFDecl()
	 * @generated
	 */
	EAttribute getFDecl_Dependent();

	/**
	 * Returns the meta object for the attribute '{@link org.softlang.megal.model.FDecl#isParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see org.softlang.megal.model.FDecl#isParameter()
	 * @see #getFDecl()
	 * @generated
	 */
	EAttribute getFDecl_Parameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MegalFactory getMegalFactory();

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
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.MegamodelImpl <em>Megamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.MegamodelImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getMegamodel()
		 * @generated
		 */
		EClass MEGAMODEL = eINSTANCE.getMegamodel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__IMPORTS = eINSTANCE.getMegamodel_Imports();

		/**
		 * The meta object literal for the '<em><b>EType Decls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__ETYPE_DECLS = eINSTANCE.getMegamodel_ETypeDecls();

		/**
		 * The meta object literal for the '<em><b>RType Decls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__RTYPE_DECLS = eINSTANCE.getMegamodel_RTypeDecls();

		/**
		 * The meta object literal for the '<em><b>EDecls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__EDECLS = eINSTANCE.getMegamodel_EDecls();

		/**
		 * The meta object literal for the '<em><b>RDecls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEGAMODEL__RDECLS = eINSTANCE.getMegamodel_RDecls();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.DeclImpl <em>Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.DeclImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getDecl()
		 * @generated
		 */
		EClass DECL = eINSTANCE.getDecl();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.NamedDeclImpl <em>Named Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.NamedDeclImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getNamedDecl()
		 * @generated
		 */
		EClass NAMED_DECL = eINSTANCE.getNamedDecl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_DECL__NAME = eINSTANCE.getNamedDecl_Name();

		/**
		 * The meta object literal for the '<em><b>Showname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_DECL__SHOWNAME = eINSTANCE.getNamedDecl_Showname();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.ETypeDeclImpl <em>EType Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.ETypeDeclImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getETypeDecl()
		 * @generated
		 */
		EClass ETYPE_DECL = eINSTANCE.getETypeDecl();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_DECL__SUPERTYPE = eINSTANCE.getETypeDecl_Supertype();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.RTypeDeclImpl <em>RType Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.RTypeDeclImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getRTypeDecl()
		 * @generated
		 */
		EClass RTYPE_DECL = eINSTANCE.getRTypeDecl();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTYPE_DECL__LEFT = eINSTANCE.getRTypeDecl_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTYPE_DECL__RIGHT = eINSTANCE.getRTypeDecl_Right();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.EDeclImpl <em>EDecl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.EDeclImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getEDecl()
		 * @generated
		 */
		EClass EDECL = eINSTANCE.getEDecl();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDECL__TYPE = eINSTANCE.getEDecl_Type();

		/**
		 * The meta object literal for the '<em><b>Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDECL__DEPENDENT = eINSTANCE.getEDecl_Dependent();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDECL__PARAMETER = eINSTANCE.getEDecl_Parameter();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.RDeclImpl <em>RDecl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.RDeclImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getRDecl()
		 * @generated
		 */
		EClass RDECL = eINSTANCE.getRDecl();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDECL__LEFT = eINSTANCE.getRDecl_Left();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDECL__TYPE = eINSTANCE.getRDecl_Type();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDECL__RIGHT = eINSTANCE.getRDecl_Right();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.ETypeImpl <em>EType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.ETypeImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getEType()
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
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPE__MANY = eINSTANCE.getEType_Many();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE__ARGS = eINSTANCE.getEType_Args();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.AppDeclImpl <em>App Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.AppDeclImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getAppDecl()
		 * @generated
		 */
		EClass APP_DECL = eINSTANCE.getAppDecl();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_DECL__FUNCTION = eINSTANCE.getAppDecl_Function();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_DECL__INPUT = eINSTANCE.getAppDecl_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_DECL__OUTPUT = eINSTANCE.getAppDecl_Output();

		/**
		 * The meta object literal for the '{@link org.softlang.megal.model.impl.FDeclImpl <em>FDecl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.softlang.megal.model.impl.FDeclImpl
		 * @see org.softlang.megal.model.impl.MegalPackageImpl#getFDecl()
		 * @generated
		 */
		EClass FDECL = eINSTANCE.getFDecl();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FDECL__DOMAIN = eINSTANCE.getFDecl_Domain();

		/**
		 * The meta object literal for the '<em><b>Codomain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FDECL__CODOMAIN = eINSTANCE.getFDecl_Codomain();

		/**
		 * The meta object literal for the '<em><b>Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FDECL__DEPENDENT = eINSTANCE.getFDecl_Dependent();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FDECL__PARAMETER = eINSTANCE.getFDecl_Parameter();

	}

} //MegalPackage
