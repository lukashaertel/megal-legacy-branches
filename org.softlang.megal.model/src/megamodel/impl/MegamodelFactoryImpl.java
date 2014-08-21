/**
 */
package megamodel.impl;

import megamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MegamodelFactoryImpl extends EFactoryImpl implements MegamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MegamodelFactory init() {
		try {
			MegamodelFactory theMegamodelFactory = (MegamodelFactory)EPackage.Registry.INSTANCE.getEFactory(MegamodelPackage.eNS_URI);
			if (theMegamodelFactory != null) {
				return theMegamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MegamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegamodelFactoryImpl() {
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
			case MegamodelPackage.MEGAMODEL: return createMegamodel();
			case MegamodelPackage.EX_ETYPE_DECL_GROUP: return createExETypeDeclGroup();
			case MegamodelPackage.EX_ETYPE_DECL: return createExETypeDecl();
			case MegamodelPackage.EX_ETYPE: return createExEType();
			case MegamodelPackage.EX_RTYPE_DECL_GROUP: return createExRTypeDeclGroup();
			case MegamodelPackage.EX_RTYPE_DECL: return createExRTypeDecl();
			case MegamodelPackage.EX_EDECL_GROUP: return createExEDeclGroup();
			case MegamodelPackage.EX_EDECL: return createExEDecl();
			case MegamodelPackage.EX_RDECL: return createExRDecl();
			case MegamodelPackage.EX_RDECL_GROUP: return createExRDeclGroup();
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
	public ExETypeDeclGroup createExETypeDeclGroup() {
		ExETypeDeclGroupImpl exETypeDeclGroup = new ExETypeDeclGroupImpl();
		return exETypeDeclGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExETypeDecl createExETypeDecl() {
		ExETypeDeclImpl exETypeDecl = new ExETypeDeclImpl();
		return exETypeDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExEType createExEType() {
		ExETypeImpl exEType = new ExETypeImpl();
		return exEType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExRTypeDeclGroup createExRTypeDeclGroup() {
		ExRTypeDeclGroupImpl exRTypeDeclGroup = new ExRTypeDeclGroupImpl();
		return exRTypeDeclGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExRTypeDecl createExRTypeDecl() {
		ExRTypeDeclImpl exRTypeDecl = new ExRTypeDeclImpl();
		return exRTypeDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExEDeclGroup createExEDeclGroup() {
		ExEDeclGroupImpl exEDeclGroup = new ExEDeclGroupImpl();
		return exEDeclGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExEDecl createExEDecl() {
		ExEDeclImpl exEDecl = new ExEDeclImpl();
		return exEDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExRDecl createExRDecl() {
		ExRDeclImpl exRDecl = new ExRDeclImpl();
		return exRDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExRDeclGroup createExRDeclGroup() {
		ExRDeclGroupImpl exRDeclGroup = new ExRDeclGroupImpl();
		return exRDeclGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegamodelPackage getMegamodelPackage() {
		return (MegamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MegamodelPackage getPackage() {
		return MegamodelPackage.eINSTANCE;
	}

} //MegamodelFactoryImpl
