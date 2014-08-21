/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.megamodel.ExEType;
import org.softlang.megal.megamodel.ExETypeDecl;
import org.softlang.megal.megamodel.MegamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex EType Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExETypeDeclImpl#getExSupertype <em>Ex Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExETypeDeclImpl extends ETypeDeclImpl implements ExETypeDecl {
	/**
	 * The cached value of the '{@link #getExSupertype() <em>Ex Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExSupertype()
	 * @generated
	 * @ordered
	 */
	protected ExEType exSupertype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExETypeDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.EX_ETYPE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExEType getExSupertype() {
		return exSupertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExSupertype(ExEType newExSupertype, NotificationChain msgs) {
		ExEType oldExSupertype = exSupertype;
		exSupertype = newExSupertype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_ETYPE_DECL__EX_SUPERTYPE, oldExSupertype, newExSupertype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExSupertype(ExEType newExSupertype) {
		if (newExSupertype != exSupertype) {
			NotificationChain msgs = null;
			if (exSupertype != null)
				msgs = ((InternalEObject)exSupertype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_ETYPE_DECL__EX_SUPERTYPE, null, msgs);
			if (newExSupertype != null)
				msgs = ((InternalEObject)newExSupertype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_ETYPE_DECL__EX_SUPERTYPE, null, msgs);
			msgs = basicSetExSupertype(newExSupertype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_ETYPE_DECL__EX_SUPERTYPE, newExSupertype, newExSupertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegamodelPackage.EX_ETYPE_DECL__EX_SUPERTYPE:
				return basicSetExSupertype(null, msgs);
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
			case MegamodelPackage.EX_ETYPE_DECL__EX_SUPERTYPE:
				return getExSupertype();
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
			case MegamodelPackage.EX_ETYPE_DECL__EX_SUPERTYPE:
				setExSupertype((ExEType)newValue);
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
			case MegamodelPackage.EX_ETYPE_DECL__EX_SUPERTYPE:
				setExSupertype((ExEType)null);
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
			case MegamodelPackage.EX_ETYPE_DECL__EX_SUPERTYPE:
				return exSupertype != null;
		}
		return super.eIsSet(featureID);
	}

} //ExETypeDeclImpl
