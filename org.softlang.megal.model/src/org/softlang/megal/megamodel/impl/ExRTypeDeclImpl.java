/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.megamodel.ExEType;
import org.softlang.megal.megamodel.ExRTypeDecl;
import org.softlang.megal.megamodel.MegamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex RType Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExRTypeDeclImpl#getExLeft <em>Ex Left</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExRTypeDeclImpl#getExRight <em>Ex Right</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.ExRTypeDeclImpl#getExName <em>Ex Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExRTypeDeclImpl extends RTypeDeclImpl implements ExRTypeDecl {
	/**
	 * The cached value of the '{@link #getExLeft() <em>Ex Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExLeft()
	 * @generated
	 * @ordered
	 */
	protected ExEType exLeft;

	/**
	 * The cached value of the '{@link #getExRight() <em>Ex Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExRight()
	 * @generated
	 * @ordered
	 */
	protected ExEType exRight;

	/**
	 * The default value of the '{@link #getExName() <em>Ex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExName()
	 * @generated
	 * @ordered
	 */
	protected static final String EX_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExName() <em>Ex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExName()
	 * @generated
	 * @ordered
	 */
	protected String exName = EX_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExRTypeDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.EX_RTYPE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExEType getExLeft() {
		return exLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExLeft(ExEType newExLeft, NotificationChain msgs) {
		ExEType oldExLeft = exLeft;
		exLeft = newExLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RTYPE_DECL__EX_LEFT, oldExLeft, newExLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExLeft(ExEType newExLeft) {
		if (newExLeft != exLeft) {
			NotificationChain msgs = null;
			if (exLeft != null)
				msgs = ((InternalEObject)exLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_RTYPE_DECL__EX_LEFT, null, msgs);
			if (newExLeft != null)
				msgs = ((InternalEObject)newExLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_RTYPE_DECL__EX_LEFT, null, msgs);
			msgs = basicSetExLeft(newExLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RTYPE_DECL__EX_LEFT, newExLeft, newExLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExEType getExRight() {
		return exRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExRight(ExEType newExRight, NotificationChain msgs) {
		ExEType oldExRight = exRight;
		exRight = newExRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RTYPE_DECL__EX_RIGHT, oldExRight, newExRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExRight(ExEType newExRight) {
		if (newExRight != exRight) {
			NotificationChain msgs = null;
			if (exRight != null)
				msgs = ((InternalEObject)exRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_RTYPE_DECL__EX_RIGHT, null, msgs);
			if (newExRight != null)
				msgs = ((InternalEObject)newExRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_RTYPE_DECL__EX_RIGHT, null, msgs);
			msgs = basicSetExRight(newExRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RTYPE_DECL__EX_RIGHT, newExRight, newExRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExName() {
		return exName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExName(String newExName) {
		String oldExName = exName;
		exName = newExName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_RTYPE_DECL__EX_NAME, oldExName, exName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegamodelPackage.EX_RTYPE_DECL__EX_LEFT:
				return basicSetExLeft(null, msgs);
			case MegamodelPackage.EX_RTYPE_DECL__EX_RIGHT:
				return basicSetExRight(null, msgs);
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
			case MegamodelPackage.EX_RTYPE_DECL__EX_LEFT:
				return getExLeft();
			case MegamodelPackage.EX_RTYPE_DECL__EX_RIGHT:
				return getExRight();
			case MegamodelPackage.EX_RTYPE_DECL__EX_NAME:
				return getExName();
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
			case MegamodelPackage.EX_RTYPE_DECL__EX_LEFT:
				setExLeft((ExEType)newValue);
				return;
			case MegamodelPackage.EX_RTYPE_DECL__EX_RIGHT:
				setExRight((ExEType)newValue);
				return;
			case MegamodelPackage.EX_RTYPE_DECL__EX_NAME:
				setExName((String)newValue);
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
			case MegamodelPackage.EX_RTYPE_DECL__EX_LEFT:
				setExLeft((ExEType)null);
				return;
			case MegamodelPackage.EX_RTYPE_DECL__EX_RIGHT:
				setExRight((ExEType)null);
				return;
			case MegamodelPackage.EX_RTYPE_DECL__EX_NAME:
				setExName(EX_NAME_EDEFAULT);
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
			case MegamodelPackage.EX_RTYPE_DECL__EX_LEFT:
				return exLeft != null;
			case MegamodelPackage.EX_RTYPE_DECL__EX_RIGHT:
				return exRight != null;
			case MegamodelPackage.EX_RTYPE_DECL__EX_NAME:
				return EX_NAME_EDEFAULT == null ? exName != null : !EX_NAME_EDEFAULT.equals(exName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (exName: ");
		result.append(exName);
		result.append(')');
		return result.toString();
	}

} //ExRTypeDeclImpl
