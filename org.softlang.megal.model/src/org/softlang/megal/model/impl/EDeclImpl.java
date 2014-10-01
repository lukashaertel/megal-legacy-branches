/**
 */
package org.softlang.megal.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.model.EDecl;
import org.softlang.megal.model.EType;
import org.softlang.megal.model.MegalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.EDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.EDeclImpl#isDependent <em>Dependent</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.EDeclImpl#isParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDeclImpl extends NamedDeclImpl implements EDecl {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EType type;

	/**
	 * The default value of the '{@link #isDependent() <em>Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDependent() <em>Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean dependent = DEPENDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean parameter = PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegalPackage.Literals.EDECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(EType newType, NotificationChain msgs) {
		EType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegalPackage.EDECL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegalPackage.EDECL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegalPackage.EDECL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.EDECL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependent(boolean newDependent) {
		boolean oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.EDECL__DEPENDENT, oldDependent, dependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(boolean newParameter) {
		boolean oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.EDECL__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegalPackage.EDECL__TYPE:
				return basicSetType(null, msgs);
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
			case MegalPackage.EDECL__TYPE:
				return getType();
			case MegalPackage.EDECL__DEPENDENT:
				return isDependent();
			case MegalPackage.EDECL__PARAMETER:
				return isParameter();
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
			case MegalPackage.EDECL__TYPE:
				setType((EType)newValue);
				return;
			case MegalPackage.EDECL__DEPENDENT:
				setDependent((Boolean)newValue);
				return;
			case MegalPackage.EDECL__PARAMETER:
				setParameter((Boolean)newValue);
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
			case MegalPackage.EDECL__TYPE:
				setType((EType)null);
				return;
			case MegalPackage.EDECL__DEPENDENT:
				setDependent(DEPENDENT_EDEFAULT);
				return;
			case MegalPackage.EDECL__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
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
			case MegalPackage.EDECL__TYPE:
				return type != null;
			case MegalPackage.EDECL__DEPENDENT:
				return dependent != DEPENDENT_EDEFAULT;
			case MegalPackage.EDECL__PARAMETER:
				return parameter != PARAMETER_EDEFAULT;
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
		result.append(" (dependent: ");
		result.append(dependent);
		result.append(", parameter: ");
		result.append(parameter);
		result.append(')');
		return result.toString();
	}

} //EDeclImpl
