/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.megamodel.EDecl;
import org.softlang.megal.megamodel.ExRDecl;
import org.softlang.megal.megamodel.MegamodelPackage;
import org.softlang.megal.megamodel.RTypeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex RDecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExRDeclImpl#getExType <em>Ex Type</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExRDeclImpl#getExLeft <em>Ex Left</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExRDeclImpl#getExRight <em>Ex Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExRDeclImpl extends RDeclImpl implements ExRDecl {
	/**
	 * The cached value of the '{@link #getExType() <em>Ex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExType()
	 * @generated
	 * @ordered
	 */
	protected RTypeDecl exType;

	/**
	 * The cached value of the '{@link #getExLeft() <em>Ex Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExLeft()
	 * @generated
	 * @ordered
	 */
	protected EDecl exLeft;

	/**
	 * The cached value of the '{@link #getExRight() <em>Ex Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExRight()
	 * @generated
	 * @ordered
	 */
	protected EDecl exRight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExRDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.EX_RDECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTypeDecl getExType() {
		if (exType != null && exType.eIsProxy()) {
			InternalEObject oldExType = (InternalEObject)exType;
			exType = (RTypeDecl)eResolveProxy(oldExType);
			if (exType != oldExType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegamodelPackage.EX_RDECL__EX_TYPE, oldExType, exType));
			}
		}
		return exType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTypeDecl basicGetExType() {
		return exType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExType(RTypeDecl newExType) {
		RTypeDecl oldExType = exType;
		exType = newExType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RDECL__EX_TYPE, oldExType, exType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDecl getExLeft() {
		if (exLeft != null && exLeft.eIsProxy()) {
			InternalEObject oldExLeft = (InternalEObject)exLeft;
			exLeft = (EDecl)eResolveProxy(oldExLeft);
			if (exLeft != oldExLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegamodelPackage.EX_RDECL__EX_LEFT, oldExLeft, exLeft));
			}
		}
		return exLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDecl basicGetExLeft() {
		return exLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExLeft(EDecl newExLeft) {
		EDecl oldExLeft = exLeft;
		exLeft = newExLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RDECL__EX_LEFT, oldExLeft, exLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDecl getExRight() {
		if (exRight != null && exRight.eIsProxy()) {
			InternalEObject oldExRight = (InternalEObject)exRight;
			exRight = (EDecl)eResolveProxy(oldExRight);
			if (exRight != oldExRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegamodelPackage.EX_RDECL__EX_RIGHT, oldExRight, exRight));
			}
		}
		return exRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDecl basicGetExRight() {
		return exRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExRight(EDecl newExRight) {
		EDecl oldExRight = exRight;
		exRight = newExRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RDECL__EX_RIGHT, oldExRight, exRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MegamodelPackage.EX_RDECL__EX_TYPE:
				if (resolve) return getExType();
				return basicGetExType();
			case MegamodelPackage.EX_RDECL__EX_LEFT:
				if (resolve) return getExLeft();
				return basicGetExLeft();
			case MegamodelPackage.EX_RDECL__EX_RIGHT:
				if (resolve) return getExRight();
				return basicGetExRight();
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
			case MegamodelPackage.EX_RDECL__EX_TYPE:
				setExType((RTypeDecl)newValue);
				return;
			case MegamodelPackage.EX_RDECL__EX_LEFT:
				setExLeft((EDecl)newValue);
				return;
			case MegamodelPackage.EX_RDECL__EX_RIGHT:
				setExRight((EDecl)newValue);
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
			case MegamodelPackage.EX_RDECL__EX_TYPE:
				setExType((RTypeDecl)null);
				return;
			case MegamodelPackage.EX_RDECL__EX_LEFT:
				setExLeft((EDecl)null);
				return;
			case MegamodelPackage.EX_RDECL__EX_RIGHT:
				setExRight((EDecl)null);
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
			case MegamodelPackage.EX_RDECL__EX_TYPE:
				return exType != null;
			case MegamodelPackage.EX_RDECL__EX_LEFT:
				return exLeft != null;
			case MegamodelPackage.EX_RDECL__EX_RIGHT:
				return exRight != null;
		}
		return super.eIsSet(featureID);
	}

} //ExRDeclImpl
