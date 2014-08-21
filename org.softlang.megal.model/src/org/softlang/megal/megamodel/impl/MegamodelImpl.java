/**
 */
package org.softlang.megal.megamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.softlang.megal.megamodel.DeclGroup;
import org.softlang.megal.megamodel.Megamodel;
import org.softlang.megal.megamodel.MegamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Megamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.MegamodelImpl#getDecls <em>Decls</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.MegamodelImpl#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MegamodelImpl extends MinimalEObjectImpl.Container implements Megamodel {
	/**
	 * The cached value of the '{@link #getDecls() <em>Decls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecls()
	 * @generated
	 * @ordered
	 */
	protected EList<DeclGroup> decls;

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
		return MegamodelPackage.Literals.MEGAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeclGroup> getDecls() {
		if (decls == null) {
			decls = new EObjectContainmentEList<DeclGroup>(DeclGroup.class, this, MegamodelPackage.MEGAMODEL__DECLS);
		}
		return decls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Megamodel> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<Megamodel>(Megamodel.class, this, MegamodelPackage.MEGAMODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegamodelPackage.MEGAMODEL__DECLS:
				return ((InternalEList<?>)getDecls()).basicRemove(otherEnd, msgs);
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
			case MegamodelPackage.MEGAMODEL__DECLS:
				return getDecls();
			case MegamodelPackage.MEGAMODEL__IMPORTS:
				return getImports();
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
			case MegamodelPackage.MEGAMODEL__DECLS:
				getDecls().clear();
				getDecls().addAll((Collection<? extends DeclGroup>)newValue);
				return;
			case MegamodelPackage.MEGAMODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Megamodel>)newValue);
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
			case MegamodelPackage.MEGAMODEL__DECLS:
				getDecls().clear();
				return;
			case MegamodelPackage.MEGAMODEL__IMPORTS:
				getImports().clear();
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
			case MegamodelPackage.MEGAMODEL__DECLS:
				return decls != null && !decls.isEmpty();
			case MegamodelPackage.MEGAMODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MegamodelImpl
