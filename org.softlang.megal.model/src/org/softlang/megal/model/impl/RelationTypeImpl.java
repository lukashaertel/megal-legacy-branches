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
import org.softlang.megal.model.ModelPackage;
import org.softlang.megal.model.RelationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.RelationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.RelationTypeImpl#getFromDomain <em>From Domain</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.RelationTypeImpl#getToDomain <em>To Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationTypeImpl extends MinimalEObjectImpl.Container implements RelationType {
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
	 * The cached value of the '{@link #getFromDomain() <em>From Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDomain()
	 * @generated
	 * @ordered
	 */
	protected Declared fromDomain;

	/**
	 * The cached value of the '{@link #getToDomain() <em>To Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDomain()
	 * @generated
	 * @ordered
	 */
	protected Declared toDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RELATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RELATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declared getFromDomain() {
		return fromDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromDomain(Declared newFromDomain, NotificationChain msgs) {
		Declared oldFromDomain = fromDomain;
		fromDomain = newFromDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RELATION_TYPE__FROM_DOMAIN, oldFromDomain, newFromDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDomain(Declared newFromDomain) {
		if (newFromDomain != fromDomain) {
			NotificationChain msgs = null;
			if (fromDomain != null)
				msgs = ((InternalEObject)fromDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RELATION_TYPE__FROM_DOMAIN, null, msgs);
			if (newFromDomain != null)
				msgs = ((InternalEObject)newFromDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RELATION_TYPE__FROM_DOMAIN, null, msgs);
			msgs = basicSetFromDomain(newFromDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RELATION_TYPE__FROM_DOMAIN, newFromDomain, newFromDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declared getToDomain() {
		return toDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToDomain(Declared newToDomain, NotificationChain msgs) {
		Declared oldToDomain = toDomain;
		toDomain = newToDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RELATION_TYPE__TO_DOMAIN, oldToDomain, newToDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDomain(Declared newToDomain) {
		if (newToDomain != toDomain) {
			NotificationChain msgs = null;
			if (toDomain != null)
				msgs = ((InternalEObject)toDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RELATION_TYPE__TO_DOMAIN, null, msgs);
			if (newToDomain != null)
				msgs = ((InternalEObject)newToDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RELATION_TYPE__TO_DOMAIN, null, msgs);
			msgs = basicSetToDomain(newToDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RELATION_TYPE__TO_DOMAIN, newToDomain, newToDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RELATION_TYPE__FROM_DOMAIN:
				return basicSetFromDomain(null, msgs);
			case ModelPackage.RELATION_TYPE__TO_DOMAIN:
				return basicSetToDomain(null, msgs);
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
			case ModelPackage.RELATION_TYPE__NAME:
				return getName();
			case ModelPackage.RELATION_TYPE__FROM_DOMAIN:
				return getFromDomain();
			case ModelPackage.RELATION_TYPE__TO_DOMAIN:
				return getToDomain();
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
			case ModelPackage.RELATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.RELATION_TYPE__FROM_DOMAIN:
				setFromDomain((Declared)newValue);
				return;
			case ModelPackage.RELATION_TYPE__TO_DOMAIN:
				setToDomain((Declared)newValue);
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
			case ModelPackage.RELATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.RELATION_TYPE__FROM_DOMAIN:
				setFromDomain((Declared)null);
				return;
			case ModelPackage.RELATION_TYPE__TO_DOMAIN:
				setToDomain((Declared)null);
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
			case ModelPackage.RELATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.RELATION_TYPE__FROM_DOMAIN:
				return fromDomain != null;
			case ModelPackage.RELATION_TYPE__TO_DOMAIN:
				return toDomain != null;
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
		result.append(')');
		return result.toString();
	}

} //RelationTypeImpl
