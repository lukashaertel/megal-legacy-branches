/**
 */
package org.softlang.megal.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.softlang.megal.model.Declared;
import org.softlang.megal.model.EntityType;
import org.softlang.megal.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.EntityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.EntityTypeImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.EntityTypeImpl#isIsTop <em>Is Top</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTypeImpl extends MinimalEObjectImpl.Container implements EntityType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected Declared supertype;

	/**
	 * The default value of the '{@link #isIsTop() <em>Is Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTop() <em>Is Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTop()
	 * @generated
	 * @ordered
	 */
	protected boolean isTop = IS_TOP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declared getSupertype() {
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertype(Declared newSupertype, NotificationChain msgs) {
		Declared oldSupertype = supertype;
		supertype = newSupertype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY_TYPE__SUPERTYPE, oldSupertype, newSupertype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertype(Declared newSupertype) {
		if (newSupertype != supertype) {
			NotificationChain msgs = null;
			if (supertype != null)
				msgs = ((InternalEObject)supertype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ENTITY_TYPE__SUPERTYPE, null, msgs);
			if (newSupertype != null)
				msgs = ((InternalEObject)newSupertype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ENTITY_TYPE__SUPERTYPE, null, msgs);
			msgs = basicSetSupertype(newSupertype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY_TYPE__SUPERTYPE, newSupertype, newSupertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTop() {
		return isTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTop(boolean newIsTop) {
		boolean oldIsTop = isTop;
		isTop = newIsTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY_TYPE__IS_TOP, oldIsTop, isTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ENTITY_TYPE__SUPERTYPE:
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
			case ModelPackage.ENTITY_TYPE__NAME:
				return getName();
			case ModelPackage.ENTITY_TYPE__SUPERTYPE:
				return getSupertype();
			case ModelPackage.ENTITY_TYPE__IS_TOP:
				return isIsTop();
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
			case ModelPackage.ENTITY_TYPE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ENTITY_TYPE__SUPERTYPE:
				setSupertype((Declared)newValue);
				return;
			case ModelPackage.ENTITY_TYPE__IS_TOP:
				setIsTop((Boolean)newValue);
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
			case ModelPackage.ENTITY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ENTITY_TYPE__SUPERTYPE:
				setSupertype((Declared)null);
				return;
			case ModelPackage.ENTITY_TYPE__IS_TOP:
				setIsTop(IS_TOP_EDEFAULT);
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
			case ModelPackage.ENTITY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ENTITY_TYPE__SUPERTYPE:
				return supertype != null;
			case ModelPackage.ENTITY_TYPE__IS_TOP:
				return isTop != IS_TOP_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isTop: ");
		result.append(isTop);
		result.append(')');
		return result.toString();
	}

} //EntityTypeImpl
