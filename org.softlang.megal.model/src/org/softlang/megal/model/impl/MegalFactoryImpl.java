/**
 */
package org.softlang.megal.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.softlang.megal.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegalFactoryImpl extends EFactoryImpl implements MegalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MegalFactory init() {
		try {
			MegalFactory theMegalFactory = (MegalFactory)EPackage.Registry.INSTANCE.getEFactory(MegalPackage.eNS_URI);
			if (theMegalFactory != null) {
				return theMegalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MegalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MegalPackage.MEGAMODEL: return createMegamodel();
			case MegalPackage.NAMED_DECL: return createNamedDecl();
			case MegalPackage.ETYPE_DECL: return createETypeDecl();
			case MegalPackage.RTYPE_DECL: return createRTypeDecl();
			case MegalPackage.EDECL: return createEDecl();
			case MegalPackage.RDECL: return createRDecl();
			case MegalPackage.ETYPE: return createEType();
			case MegalPackage.APP_DECL: return createAppDecl();
			case MegalPackage.FDECL: return createFDecl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Megamodel createMegamodel() {
		MegamodelImpl megamodel = new MegamodelImpl();
		return megamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedDecl createNamedDecl() {
		NamedDeclImpl namedDecl = new NamedDeclImpl();
		return namedDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeDecl createETypeDecl() {
		ETypeDeclImpl eTypeDecl = new ETypeDeclImpl();
		return eTypeDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTypeDecl createRTypeDecl() {
		RTypeDeclImpl rTypeDecl = new RTypeDeclImpl();
		return rTypeDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDecl createEDecl() {
		EDeclImpl eDecl = new EDeclImpl();
		return eDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDecl createRDecl() {
		RDeclImpl rDecl = new RDeclImpl();
		return rDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType createEType() {
		ETypeImpl eType = new ETypeImpl();
		return eType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppDecl createAppDecl() {
		AppDeclImpl appDecl = new AppDeclImpl();
		return appDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FDecl createFDecl() {
		FDeclImpl fDecl = new FDeclImpl();
		return fDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalPackage getMegalPackage() {
		return (MegalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MegalPackage getPackage() {
		return MegalPackage.eINSTANCE;
	}

} //MegalFactoryImpl
