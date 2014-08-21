/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.megamodel.ExRDecl;
import org.softlang.megal.megamodel.ExRDeclGroup;
import org.softlang.megal.megamodel.MegamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex RDecl Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExRDeclGroupImpl#getExRDecls <em>Ex RDecls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExRDeclGroupImpl extends DeclGroupImpl implements ExRDeclGroup {
	/**
	 * The cached value of the '{@link #getExRDecls() <em>Ex RDecls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExRDecls()
	 * @generated
	 * @ordered
	 */
	protected ExRDecl exRDecls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExRDeclGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.EX_RDECL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExRDecl getExRDecls() {
		return exRDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExRDecls(ExRDecl newExRDecls, NotificationChain msgs) {
		ExRDecl oldExRDecls = exRDecls;
		exRDecls = newExRDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RDECL_GROUP__EX_RDECLS, oldExRDecls, newExRDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExRDecls(ExRDecl newExRDecls) {
		if (newExRDecls != exRDecls) {
			NotificationChain msgs = null;
			if (exRDecls != null)
				msgs = ((InternalEObject)exRDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_RDECL_GROUP__EX_RDECLS, null, msgs);
			if (newExRDecls != null)
				msgs = ((InternalEObject)newExRDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_RDECL_GROUP__EX_RDECLS, null, msgs);
			msgs = basicSetExRDecls(newExRDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RDECL_GROUP__EX_RDECLS, newExRDecls, newExRDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegamodelPackage.EX_RDECL_GROUP__EX_RDECLS:
				return basicSetExRDecls(null, msgs);
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
			case MegamodelPackage.EX_RDECL_GROUP__EX_RDECLS:
				return getExRDecls();
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
			case MegamodelPackage.EX_RDECL_GROUP__EX_RDECLS:
				setExRDecls((ExRDecl)newValue);
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
			case MegamodelPackage.EX_RDECL_GROUP__EX_RDECLS:
				setExRDecls((ExRDecl)null);
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
			case MegamodelPackage.EX_RDECL_GROUP__EX_RDECLS:
				return exRDecls != null;
		}
		return super.eIsSet(featureID);
	}

} //ExRDeclGroupImpl
