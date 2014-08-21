/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.megamodel.ExRTypeDecl;
import org.softlang.megal.megamodel.ExRTypeDeclGroup;
import org.softlang.megal.megamodel.MegamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex RType Decl Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExRTypeDeclGroupImpl#getExRTypeDecls <em>Ex RType Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExRTypeDeclGroupImpl extends DeclGroupImpl implements ExRTypeDeclGroup {
	/**
	 * The cached value of the '{@link #getExRTypeDecls() <em>Ex RType Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExRTypeDecls()
	 * @generated
	 * @ordered
	 */
	protected ExRTypeDecl exRTypeDecls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExRTypeDeclGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.EX_RTYPE_DECL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExRTypeDecl getExRTypeDecls() {
		return exRTypeDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExRTypeDecls(ExRTypeDecl newExRTypeDecls, NotificationChain msgs) {
		ExRTypeDecl oldExRTypeDecls = exRTypeDecls;
		exRTypeDecls = newExRTypeDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS, oldExRTypeDecls, newExRTypeDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExRTypeDecls(ExRTypeDecl newExRTypeDecls) {
		if (newExRTypeDecls != exRTypeDecls) {
			NotificationChain msgs = null;
			if (exRTypeDecls != null)
				msgs = ((InternalEObject)exRTypeDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS, null, msgs);
			if (newExRTypeDecls != null)
				msgs = ((InternalEObject)newExRTypeDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS, null, msgs);
			msgs = basicSetExRTypeDecls(newExRTypeDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS, newExRTypeDecls, newExRTypeDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegamodelPackage.EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS:
				return basicSetExRTypeDecls(null, msgs);
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
			case MegamodelPackage.EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS:
				return getExRTypeDecls();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MegamodelPackage.EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS:
				setExRTypeDecls((ExRTypeDecl)newValue);
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
			case MegamodelPackage.EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS:
				setExRTypeDecls((ExRTypeDecl)null);
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
			case MegamodelPackage.EX_RTYPE_DECL_GROUP__EX_RTYPE_DECLS:
				return exRTypeDecls != null;
		}
		return super.eIsSet(featureID);
	}

} //ExRTypeDeclGroupImpl
