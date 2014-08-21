/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.megamodel.ExEDecl;
import org.softlang.megal.megamodel.ExEDeclGroup;
import org.softlang.megal.megamodel.MegamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex EDecl Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExEDeclGroupImpl#getExEDecls <em>Ex EDecls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExEDeclGroupImpl extends DeclGroupImpl implements ExEDeclGroup {
	/**
	 * The cached value of the '{@link #getExEDecls() <em>Ex EDecls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExEDecls()
	 * @generated
	 * @ordered
	 */
	protected ExEDecl exEDecls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExEDeclGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.EX_EDECL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExEDecl getExEDecls() {
		return exEDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExEDecls(ExEDecl newExEDecls, NotificationChain msgs) {
		ExEDecl oldExEDecls = exEDecls;
		exEDecls = newExEDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_EDECL_GROUP__EX_EDECLS, oldExEDecls, newExEDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExEDecls(ExEDecl newExEDecls) {
		if (newExEDecls != exEDecls) {
			NotificationChain msgs = null;
			if (exEDecls != null)
				msgs = ((InternalEObject)exEDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_EDECL_GROUP__EX_EDECLS, null, msgs);
			if (newExEDecls != null)
				msgs = ((InternalEObject)newExEDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_EDECL_GROUP__EX_EDECLS, null, msgs);
			msgs = basicSetExEDecls(newExEDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_EDECL_GROUP__EX_EDECLS, newExEDecls, newExEDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegamodelPackage.EX_EDECL_GROUP__EX_EDECLS:
				return basicSetExEDecls(null, msgs);
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
			case MegamodelPackage.EX_EDECL_GROUP__EX_EDECLS:
				return getExEDecls();
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
			case MegamodelPackage.EX_EDECL_GROUP__EX_EDECLS:
				setExEDecls((ExEDecl)newValue);
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
			case MegamodelPackage.EX_EDECL_GROUP__EX_EDECLS:
				setExEDecls((ExEDecl)null);
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
			case MegamodelPackage.EX_EDECL_GROUP__EX_EDECLS:
				return exEDecls != null;
		}
		return super.eIsSet(featureID);
	}

} //ExEDeclGroupImpl
