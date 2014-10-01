/**
 */
package org.softlang.megal.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.softlang.megal.model.EDecl;
import org.softlang.megal.model.ETypeDecl;
import org.softlang.megal.model.MegalPackage;
import org.softlang.megal.model.Megamodel;
import org.softlang.megal.model.RDecl;
import org.softlang.megal.model.RTypeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Megamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.MegamodelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.MegamodelImpl#getETypeDecls <em>EType Decls</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.MegamodelImpl#getRTypeDecls <em>RType Decls</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.MegamodelImpl#getEDecls <em>EDecls</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.MegamodelImpl#getRDecls <em>RDecls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MegamodelImpl extends MinimalEObjectImpl.Container implements Megamodel {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Megamodel> imports;

	/**
	 * The cached value of the '{@link #getETypeDecls() <em>EType Decls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeDecls()
	 * @generated
	 * @ordered
	 */
	protected EList<ETypeDecl> eTypeDecls;

	/**
	 * The cached value of the '{@link #getRTypeDecls() <em>RType Decls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTypeDecls()
	 * @generated
	 * @ordered
	 */
	protected EList<RTypeDecl> rTypeDecls;

	/**
	 * The cached value of the '{@link #getEDecls() <em>EDecls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDecls()
	 * @generated
	 * @ordered
	 */
	protected EList<EDecl> eDecls;

	/**
	 * The cached value of the '{@link #getRDecls() <em>RDecls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDecls()
	 * @generated
	 * @ordered
	 */
	protected EList<RDecl> rDecls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MegamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegalPackage.Literals.MEGAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Megamodel> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<Megamodel>(Megamodel.class, this, MegalPackage.MEGAMODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETypeDecl> getETypeDecls() {
		if (eTypeDecls == null) {
			eTypeDecls = new EObjectContainmentEList<ETypeDecl>(ETypeDecl.class, this, MegalPackage.MEGAMODEL__ETYPE_DECLS);
		}
		return eTypeDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RTypeDecl> getRTypeDecls() {
		if (rTypeDecls == null) {
			rTypeDecls = new EObjectContainmentEList<RTypeDecl>(RTypeDecl.class, this, MegalPackage.MEGAMODEL__RTYPE_DECLS);
		}
		return rTypeDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDecl> getEDecls() {
		if (eDecls == null) {
			eDecls = new EObjectContainmentEList<EDecl>(EDecl.class, this, MegalPackage.MEGAMODEL__EDECLS);
		}
		return eDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RDecl> getRDecls() {
		if (rDecls == null) {
			rDecls = new EObjectContainmentEList<RDecl>(RDecl.class, this, MegalPackage.MEGAMODEL__RDECLS);
		}
		return rDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegalPackage.MEGAMODEL__ETYPE_DECLS:
				return ((InternalEList<?>)getETypeDecls()).basicRemove(otherEnd, msgs);
			case MegalPackage.MEGAMODEL__RTYPE_DECLS:
				return ((InternalEList<?>)getRTypeDecls()).basicRemove(otherEnd, msgs);
			case MegalPackage.MEGAMODEL__EDECLS:
				return ((InternalEList<?>)getEDecls()).basicRemove(otherEnd, msgs);
			case MegalPackage.MEGAMODEL__RDECLS:
				return ((InternalEList<?>)getRDecls()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MegalPackage.MEGAMODEL__IMPORTS:
				return getImports();
			case MegalPackage.MEGAMODEL__ETYPE_DECLS:
				return getETypeDecls();
			case MegalPackage.MEGAMODEL__RTYPE_DECLS:
				return getRTypeDecls();
			case MegalPackage.MEGAMODEL__EDECLS:
				return getEDecls();
			case MegalPackage.MEGAMODEL__RDECLS:
				return getRDecls();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MegalPackage.MEGAMODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Megamodel>)newValue);
				return;
			case MegalPackage.MEGAMODEL__ETYPE_DECLS:
				getETypeDecls().clear();
				getETypeDecls().addAll((Collection<? extends ETypeDecl>)newValue);
				return;
			case MegalPackage.MEGAMODEL__RTYPE_DECLS:
				getRTypeDecls().clear();
				getRTypeDecls().addAll((Collection<? extends RTypeDecl>)newValue);
				return;
			case MegalPackage.MEGAMODEL__EDECLS:
				getEDecls().clear();
				getEDecls().addAll((Collection<? extends EDecl>)newValue);
				return;
			case MegalPackage.MEGAMODEL__RDECLS:
				getRDecls().clear();
				getRDecls().addAll((Collection<? extends RDecl>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MegalPackage.MEGAMODEL__IMPORTS:
				getImports().clear();
				return;
			case MegalPackage.MEGAMODEL__ETYPE_DECLS:
				getETypeDecls().clear();
				return;
			case MegalPackage.MEGAMODEL__RTYPE_DECLS:
				getRTypeDecls().clear();
				return;
			case MegalPackage.MEGAMODEL__EDECLS:
				getEDecls().clear();
				return;
			case MegalPackage.MEGAMODEL__RDECLS:
				getRDecls().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MegalPackage.MEGAMODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case MegalPackage.MEGAMODEL__ETYPE_DECLS:
				return eTypeDecls != null && !eTypeDecls.isEmpty();
			case MegalPackage.MEGAMODEL__RTYPE_DECLS:
				return rTypeDecls != null && !rTypeDecls.isEmpty();
			case MegalPackage.MEGAMODEL__EDECLS:
				return eDecls != null && !eDecls.isEmpty();
			case MegalPackage.MEGAMODEL__RDECLS:
				return rDecls != null && !rDecls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MegamodelImpl
