/**
 */
package org.softlang.megal.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.model.EType;
import org.softlang.megal.model.ETypeDecl;
import org.softlang.megal.model.MegalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EType Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.ETypeDeclImpl#getSupertype <em>Supertype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETypeDeclImpl extends NamedDeclImpl implements ETypeDecl {
	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected EType supertype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETypeDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegalPackage.Literals.ETYPE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertype(EType newSupertype, NotificationChain msgs) {
		EType oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegalPackage.ETYPE_DECL__SUPERTYPE, oldSupertype, newSupertype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(EType newSupertype) {
		if (newSupertype != supertype) {
			NotificationChain msgs = null;
			if (supertype != null)
				msgs = ((InternalEObject)supertype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegalPackage.ETYPE_DECL__SUPERTYPE, null, msgs);
			if (newSupertype != null)
				msgs = ((InternalEObject)newSupertype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegalPackage.ETYPE_DECL__SUPERTYPE, null, msgs);
			msgs = basicSetSupertype(newSupertype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.ETYPE_DECL__SUPERTYPE, newSupertype, newSupertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegalPackage.ETYPE_DECL__SUPERTYPE:
				return basicSetSupertype(null, msgs);
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
			case MegalPackage.ETYPE_DECL__SUPERTYPE:
				return getSupertype();
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
			case MegalPackage.ETYPE_DECL__SUPERTYPE:
				setSupertype((EType)newValue);
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
			case MegalPackage.ETYPE_DECL__SUPERTYPE:
				setSupertype((EType)null);
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
			case MegalPackage.ETYPE_DECL__SUPERTYPE:
				return supertype != null;
		}
		return super.eIsSet(featureID);
	}

} //ETypeDeclImpl
