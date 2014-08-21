/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
	public EList<ETypeDecl> getETypeDecls() {
		// TODO: implement this method to return the 'EType Decls' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RTypeDecl> getRTypeDecls() {
		// TODO: implement this method to return the 'RType Decls' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDecl> getEDecls() {
		// TODO: implement this method to return the 'EDecls' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDecl> getRDecls() {
		// TODO: implement this method to return the 'RDecls' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
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
				return !getETypeDecls().isEmpty();
			case MegamodelPackage.DECL_GROUP__RTYPE_DECLS:
				return !getRTypeDecls().isEmpty();
			case MegamodelPackage.DECL_GROUP__EDECLS:
				return !getEDecls().isEmpty();
			case MegamodelPackage.DECL_GROUP__RDECLS:
				return !getRDecls().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeclGroupImpl
