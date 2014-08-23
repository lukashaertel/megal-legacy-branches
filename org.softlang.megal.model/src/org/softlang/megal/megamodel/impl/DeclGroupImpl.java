/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.softlang.megal.megamodel.DeclGroup;
import org.softlang.megal.megamodel.EDecl;
import org.softlang.megal.megamodel.ETypeDecl;
import org.softlang.megal.megamodel.MegamodelPackage;
import org.softlang.megal.megamodel.RDecl;
import org.softlang.megal.megamodel.RTypeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decl Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.DeclGroupImpl#getETypeDecls <em>EType Decls</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.DeclGroupImpl#getRTypeDecls <em>RType Decls</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.DeclGroupImpl#getEDecls <em>EDecls</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.DeclGroupImpl#getRDecls <em>RDecls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeclGroupImpl extends MinimalEObjectImpl.Container implements DeclGroup {
	/**
	 * The cached setting delegate for the '{@link #getETypeDecls() <em>EType Decls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeDecls()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ETYPE_DECLS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.DECL_GROUP__ETYPE_DECLS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getRTypeDecls() <em>RType Decls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTypeDecls()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RTYPE_DECLS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.DECL_GROUP__RTYPE_DECLS).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getEDecls() <em>EDecls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDecls()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EDECLS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.DECL_GROUP__EDECLS).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getRDecls() <em>RDecls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDecls()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RDECLS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.DECL_GROUP__RDECLS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.DECL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ETypeDecl> getETypeDecls() {
		return (EList<ETypeDecl>)ETYPE_DECLS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RTypeDecl> getRTypeDecls() {
		return (EList<RTypeDecl>)RTYPE_DECLS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EDecl> getEDecls() {
		return (EList<EDecl>)EDECLS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RDecl> getRDecls() {
		return (EList<RDecl>)RDECLS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MegamodelPackage.DECL_GROUP__ETYPE_DECLS:
				return getETypeDecls();
			case MegamodelPackage.DECL_GROUP__RTYPE_DECLS:
				return getRTypeDecls();
			case MegamodelPackage.DECL_GROUP__EDECLS:
				return getEDecls();
			case MegamodelPackage.DECL_GROUP__RDECLS:
				return getRDecls();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MegamodelPackage.DECL_GROUP__ETYPE_DECLS:
				return ETYPE_DECLS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case MegamodelPackage.DECL_GROUP__RTYPE_DECLS:
				return RTYPE_DECLS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case MegamodelPackage.DECL_GROUP__EDECLS:
				return EDECLS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case MegamodelPackage.DECL_GROUP__RDECLS:
				return RDECLS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //DeclGroupImpl
