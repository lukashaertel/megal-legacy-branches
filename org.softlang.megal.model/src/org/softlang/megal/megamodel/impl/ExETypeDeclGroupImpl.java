/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.megamodel.ExETypeDecl;
import org.softlang.megal.megamodel.ExETypeDeclGroup;
import org.softlang.megal.megamodel.MegamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex EType Decl Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExETypeDeclGroupImpl#getExETypeDecls <em>Ex EType Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExETypeDeclGroupImpl extends DeclGroupImpl implements ExETypeDeclGroup {
	/**
	 * The cached value of the '{@link #getExETypeDecls() <em>Ex EType Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExETypeDecls()
	 * @generated
	 * @ordered
	 */
	protected ExETypeDecl exETypeDecls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExETypeDeclGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.EX_ETYPE_DECL_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExETypeDecl getExETypeDecls() {
		return exETypeDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExETypeDecls(ExETypeDecl newExETypeDecls, NotificationChain msgs) {
		ExETypeDecl oldExETypeDecls = exETypeDecls;
		exETypeDecls = newExETypeDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS, oldExETypeDecls, newExETypeDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExETypeDecls(ExETypeDecl newExETypeDecls) {
		if (newExETypeDecls != exETypeDecls) {
			NotificationChain msgs = null;
			if (exETypeDecls != null)
				msgs = ((InternalEObject)exETypeDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS, null, msgs);
			if (newExETypeDecls != null)
				msgs = ((InternalEObject)newExETypeDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS, null, msgs);
			msgs = basicSetExETypeDecls(newExETypeDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS, newExETypeDecls, newExETypeDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegamodelPackage.EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS:
				return basicSetExETypeDecls(null, msgs);
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
			case MegamodelPackage.EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS:
				return getExETypeDecls();
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
			case MegamodelPackage.EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS:
				setExETypeDecls((ExETypeDecl)newValue);
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
			case MegamodelPackage.EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS:
				setExETypeDecls((ExETypeDecl)null);
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
			case MegamodelPackage.EX_ETYPE_DECL_GROUP__EX_ETYPE_DECLS:
				return exETypeDecls != null;
		}
		return super.eIsSet(featureID);
	}

} //ExETypeDeclGroupImpl
