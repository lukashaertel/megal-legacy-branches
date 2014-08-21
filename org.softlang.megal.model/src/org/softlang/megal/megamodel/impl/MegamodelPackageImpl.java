/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.softlang.megal.megamodel.DeclGroup;
import org.softlang.megal.megamodel.EDecl;
import org.softlang.megal.megamodel.EType;
import org.softlang.megal.megamodel.ETypeDecl;
import org.softlang.megal.megamodel.ExEDecl;
import org.softlang.megal.megamodel.ExEDeclGroup;
import org.softlang.megal.megamodel.ExEType;
import org.softlang.megal.megamodel.ExETypeDecl;
import org.softlang.megal.megamodel.ExETypeDeclGroup;
import org.softlang.megal.megamodel.ExRDecl;
import org.softlang.megal.megamodel.ExRDeclGroup;
import org.softlang.megal.megamodel.ExRTypeDecl;
import org.softlang.megal.megamodel.ExRTypeDeclGroup;
import org.softlang.megal.megamodel.Megamodel;
import org.softlang.megal.megamodel.MegamodelFactory;
import org.softlang.megal.megamodel.MegamodelPackage;
import org.softlang.megal.megamodel.RDecl;
import org.softlang.megal.megamodel.RTypeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegamodelPackageImpl extends EPackageImpl implements MegamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass megamodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypeDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rTypeDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exETypeDeclGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exETypeDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exETypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exRTypeDeclGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exRTypeDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exEDeclGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exEDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exRDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exRDeclGroupEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.softlang.megal.megamodel.MegamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MegamodelPackageImpl() {
		super(eNS_URI, MegamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MegamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MegamodelPackage init() {
		if (isInited) return (MegamodelPackage)EPackage.Registry.INSTANCE.getEPackage(MegamodelPackage.eNS_URI);

		// Obtain or create and register package
		MegamodelPackageImpl theMegamodelPackage = (MegamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MegamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MegamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMegamodelPackage.createPackageContents();

		// Initialize created meta-data
		theMegamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMegamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MegamodelPackage.eNS_URI, theMegamodelPackage);
		return theMegamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMegamodel() {
		return megamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegamodel_Decls() {
		return (EReference)megamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMegamodel_Imports() {
		return (EReference)megamodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclGroup() {
		return declGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclGroup_ETypeDecls() {
		return (EReference)declGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclGroup_RTypeDecls() {
		return (EReference)declGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclGroup_EDecls() {
		return (EReference)declGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclGroup_RDecls() {
		return (EReference)declGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypeDecl() {
		return eTypeDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypeDecl_Supertype() {
		return (EReference)eTypeDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypeDecl_Name() {
		return (EAttribute)eTypeDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypeDecl_Args() {
		return (EReference)eTypeDeclEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTypeDecl() {
		return rTypeDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTypeDecl_Left() {
		return (EReference)rTypeDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTypeDecl_Right() {
		return (EReference)rTypeDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTypeDecl_Name() {
		return (EAttribute)rTypeDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDecl() {
		return eDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDecl_Type() {
		return (EReference)eDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDecl_Name() {
		return (EAttribute)eDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDecl_Showname() {
		return (EAttribute)eDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDecl_IsParameter() {
		return (EAttribute)eDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDecl_IsDependent() {
		return (EAttribute)eDeclEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDecl() {
		return rDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDecl_Type() {
		return (EReference)rDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDecl_Left() {
		return (EReference)rDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDecl_Right() {
		return (EReference)rDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEType() {
		return eTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEType_Def() {
		return (EReference)eTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEType_Args() {
		return (EReference)eTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEType_IsMany() {
		return (EAttribute)eTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExETypeDeclGroup() {
		return exETypeDeclGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExETypeDeclGroup_ExETypeDecls() {
		return (EReference)exETypeDeclGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExETypeDecl() {
		return exETypeDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExETypeDecl_ExSupertype() {
		return (EReference)exETypeDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExEType() {
		return exETypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExEType_ExDef() {
		return (EReference)exETypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExEType_ExArgs() {
		return (EReference)exETypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExEType_ExIsMany() {
		return (EAttribute)exETypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExRTypeDeclGroup() {
		return exRTypeDeclGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExRTypeDeclGroup_ExRTypeDecls() {
		return (EReference)exRTypeDeclGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExRTypeDecl() {
		return exRTypeDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExRTypeDecl_ExLeft() {
		return (EReference)exRTypeDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExRTypeDecl_ExRight() {
		return (EReference)exRTypeDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExRTypeDecl_ExName() {
		return (EAttribute)exRTypeDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExEDeclGroup() {
		return exEDeclGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExEDeclGroup_ExEDecls() {
		return (EReference)exEDeclGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExEDecl() {
		return exEDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExEDecl_ExName() {
		return (EAttribute)exEDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExEDecl_ExShowname() {
		return (EAttribute)exEDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExEDecl_ExIsParameter() {
		return (EAttribute)exEDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExEDecl_ExIsDependent() {
		return (EAttribute)exEDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExEDecl_ExType() {
		return (EReference)exEDeclEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExRDecl() {
		return exRDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExRDecl_ExType() {
		return (EReference)exRDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExRDecl_ExLeft() {
		return (EReference)exRDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExRDecl_ExRight() {
		return (EReference)exRDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExRDeclGroup() {
		return exRDeclGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExRDeclGroup_ExRDecls() {
		return (EReference)exRDeclGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegamodelFactory getMegamodelFactory() {
		return (MegamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		megamodelEClass = createEClass(MEGAMODEL);
		createEReference(megamodelEClass, MEGAMODEL__DECLS);
		createEReference(megamodelEClass, MEGAMODEL__IMPORTS);

		declGroupEClass = createEClass(DECL_GROUP);
		createEReference(declGroupEClass, DECL_GROUP__ETYPE_DECLS);
		createEReference(declGroupEClass, DECL_GROUP__RTYPE_DECLS);
		createEReference(declGroupEClass, DECL_GROUP__EDECLS);
		createEReference(declGroupEClass, DECL_GROUP__RDECLS);

		eTypeDeclEClass = createEClass(ETYPE_DECL);
		createEReference(eTypeDeclEClass, ETYPE_DECL__SUPERTYPE);
		createEAttribute(eTypeDeclEClass, ETYPE_DECL__NAME);
		createEReference(eTypeDeclEClass, ETYPE_DECL__ARGS);

		rTypeDeclEClass = createEClass(RTYPE_DECL);
		createEReference(rTypeDeclEClass, RTYPE_DECL__LEFT);
		createEReference(rTypeDeclEClass, RTYPE_DECL__RIGHT);
		createEAttribute(rTypeDeclEClass, RTYPE_DECL__NAME);

		eDeclEClass = createEClass(EDECL);
		createEReference(eDeclEClass, EDECL__TYPE);
		createEAttribute(eDeclEClass, EDECL__NAME);
		createEAttribute(eDeclEClass, EDECL__SHOWNAME);
		createEAttribute(eDeclEClass, EDECL__IS_PARAMETER);
		createEAttribute(eDeclEClass, EDECL__IS_DEPENDENT);

		rDeclEClass = createEClass(RDECL);
		createEReference(rDeclEClass, RDECL__TYPE);
		createEReference(rDeclEClass, RDECL__LEFT);
		createEReference(rDeclEClass, RDECL__RIGHT);

		eTypeEClass = createEClass(ETYPE);
		createEReference(eTypeEClass, ETYPE__DEF);
		createEReference(eTypeEClass, ETYPE__ARGS);
		createEAttribute(eTypeEClass, ETYPE__IS_MANY);

		exETypeDeclGroupEClass = createEClass(EX_ETYPE_DECL_GROUP);
		createEReference(exETypeDeclGroupEClass, EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS);

		exETypeDeclEClass = createEClass(EX_ETYPE_DECL);
		createEReference(exETypeDeclEClass, EX_ETYPE_DECL__EX_SUPERTYPE);

		exETypeEClass = createEClass(EX_ETYPE);
		createEReference(exETypeEClass, EX_ETYPE__EX_DEF);
		createEReference(exETypeEClass, EX_ETYPE__EX_ARGS);
		createEAttribute(exETypeEClass, EX_ETYPE__EX_IS_MANY);

		exRTypeDeclGroupEClass = createEClass(EX_RTYPE_DECL_GROUP);
		createEReference(exRTypeDeclGroupEClass, EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS);

		exRTypeDeclEClass = createEClass(EX_RTYPE_DECL);
		createEReference(exRTypeDeclEClass, EX_RTYPE_DECL__EX_LEFT);
		createEReference(exRTypeDeclEClass, EX_RTYPE_DECL__EX_RIGHT);
		createEAttribute(exRTypeDeclEClass, EX_RTYPE_DECL__EX_NAME);

		exEDeclGroupEClass = createEClass(EX_EDECL_GROUP);
		createEReference(exEDeclGroupEClass, EX_EDECL_GROUP__EX_EDECLS);

		exEDeclEClass = createEClass(EX_EDECL);
		createEAttribute(exEDeclEClass, EX_EDECL__EX_NAME);
		createEAttribute(exEDeclEClass, EX_EDECL__EX_SHOWNAME);
		createEAttribute(exEDeclEClass, EX_EDECL__EX_IS_PARAMETER);
		createEAttribute(exEDeclEClass, EX_EDECL__EX_IS_DEPENDENT);
		createEReference(exEDeclEClass, EX_EDECL__EX_TYPE);

		exRDeclEClass = createEClass(EX_RDECL);
		createEReference(exRDeclEClass, EX_RDECL__EX_TYPE);
		createEReference(exRDeclEClass, EX_RDECL__EX_LEFT);
		createEReference(exRDeclEClass, EX_RDECL__EX_RIGHT);

		exRDeclGroupEClass = createEClass(EX_RDECL_GROUP);
		createEReference(exRDeclGroupEClass, EX_RDECL_GROUP__EX_RDECLS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		exETypeDeclGroupEClass.getESuperTypes().add(this.getDeclGroup());
		exETypeDeclEClass.getESuperTypes().add(this.getETypeDecl());
		exETypeEClass.getESuperTypes().add(this.getEType());
		exRTypeDeclGroupEClass.getESuperTypes().add(this.getDeclGroup());
		exRTypeDeclEClass.getESuperTypes().add(this.getRTypeDecl());
		exEDeclGroupEClass.getESuperTypes().add(this.getDeclGroup());
		exEDeclEClass.getESuperTypes().add(this.getEDecl());
		exRDeclEClass.getESuperTypes().add(this.getRDecl());
		exRDeclGroupEClass.getESuperTypes().add(this.getDeclGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(megamodelEClass, Megamodel.class, "Megamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMegamodel_Decls(), this.getDeclGroup(), null, "decls", null, 0, -1, Megamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMegamodel_Imports(), this.getMegamodel(), null, "imports", null, 0, -1, Megamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declGroupEClass, DeclGroup.class, "DeclGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclGroup_ETypeDecls(), this.getETypeDecl(), null, "eTypeDecls", null, 0, -1, DeclGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDeclGroup_RTypeDecls(), this.getRTypeDecl(), null, "rTypeDecls", null, 0, -1, DeclGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDeclGroup_EDecls(), this.getEDecl(), null, "eDecls", null, 0, -1, DeclGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDeclGroup_RDecls(), this.getRDecl(), null, "rDecls", null, 0, -1, DeclGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eTypeDeclEClass, ETypeDecl.class, "ETypeDecl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETypeDecl_Supertype(), this.getEType(), null, "supertype", null, 0, 1, ETypeDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypeDecl_Name(), ecorePackage.getEString(), "name", null, 1, 1, ETypeDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getETypeDecl_Args(), this.getEType(), null, "args", null, 0, -1, ETypeDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rTypeDeclEClass, RTypeDecl.class, "RTypeDecl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTypeDecl_Left(), this.getEType(), null, "left", null, 1, 1, RTypeDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRTypeDecl_Right(), this.getEType(), null, "right", null, 1, 1, RTypeDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTypeDecl_Name(), ecorePackage.getEString(), "name", null, 1, 1, RTypeDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eDeclEClass, EDecl.class, "EDecl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDecl_Type(), this.getEType(), null, "type", null, 1, 1, EDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDecl_Name(), ecorePackage.getEString(), "name", null, 1, 1, EDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDecl_Showname(), ecorePackage.getEString(), "showname", null, 0, 1, EDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDecl_IsParameter(), ecorePackage.getEBoolean(), "isParameter", null, 1, 1, EDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDecl_IsDependent(), ecorePackage.getEBoolean(), "isDependent", null, 1, 1, EDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rDeclEClass, RDecl.class, "RDecl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDecl_Type(), this.getRTypeDecl(), null, "type", null, 1, 1, RDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRDecl_Left(), this.getEDecl(), null, "left", null, 1, 1, RDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRDecl_Right(), this.getEDecl(), null, "right", null, 1, 1, RDecl.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eTypeEClass, EType.class, "EType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEType_Def(), this.getETypeDecl(), null, "def", null, 1, 1, EType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEType_Args(), this.getEType(), null, "args", null, 0, -1, EType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEType_IsMany(), ecorePackage.getEBoolean(), "isMany", null, 1, 1, EType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exETypeDeclGroupEClass, ExETypeDeclGroup.class, "ExETypeDeclGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExETypeDeclGroup_ExETypeDecls(), this.getExETypeDecl(), null, "exETypeDecls", null, 1, 1, ExETypeDeclGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exETypeDeclEClass, ExETypeDecl.class, "ExETypeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExETypeDecl_ExSupertype(), this.getExEType(), null, "exSupertype", null, 0, 1, ExETypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exETypeEClass, ExEType.class, "ExEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExEType_ExDef(), this.getETypeDecl(), null, "exDef", null, 1, 1, ExEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExEType_ExArgs(), this.getExEType(), null, "exArgs", null, 0, -1, ExEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExEType_ExIsMany(), ecorePackage.getEBoolean(), "exIsMany", null, 1, 1, ExEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exRTypeDeclGroupEClass, ExRTypeDeclGroup.class, "ExRTypeDeclGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExRTypeDeclGroup_ExRTypeDecls(), this.getExRTypeDecl(), null, "exRTypeDecls", null, 1, 1, ExRTypeDeclGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exRTypeDeclEClass, ExRTypeDecl.class, "ExRTypeDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExRTypeDecl_ExLeft(), this.getExEType(), null, "exLeft", null, 1, 1, ExRTypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExRTypeDecl_ExRight(), this.getExEType(), null, "exRight", null, 1, 1, ExRTypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExRTypeDecl_ExName(), ecorePackage.getEString(), "exName", null, 1, 1, ExRTypeDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exEDeclGroupEClass, ExEDeclGroup.class, "ExEDeclGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExEDeclGroup_ExEDecls(), this.getExEDecl(), null, "exEDecls", null, 1, 1, ExEDeclGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exEDeclEClass, ExEDecl.class, "ExEDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExEDecl_ExName(), ecorePackage.getEString(), "exName", null, 1, 1, ExEDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExEDecl_ExShowname(), ecorePackage.getEString(), "exShowname", null, 0, 1, ExEDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExEDecl_ExIsParameter(), ecorePackage.getEBoolean(), "exIsParameter", null, 1, 1, ExEDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExEDecl_ExIsDependent(), ecorePackage.getEBoolean(), "exIsDependent", null, 1, 1, ExEDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExEDecl_ExType(), this.getExEType(), null, "exType", null, 1, 1, ExEDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exRDeclEClass, ExRDecl.class, "ExRDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExRDecl_ExType(), this.getRTypeDecl(), null, "exType", null, 1, 1, ExRDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExRDecl_ExLeft(), this.getEDecl(), null, "exLeft", null, 1, 1, ExRDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExRDecl_ExRight(), this.getEDecl(), null, "exRight", null, 1, 1, ExRDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exRDeclGroupEClass, ExRDeclGroup.class, "ExRDeclGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExRDeclGroup_ExRDecls(), this.getExRDecl(), null, "exRDecls", null, 1, 1, ExRDeclGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MegamodelPackageImpl
