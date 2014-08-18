/**
 */
package org.softlang.megal.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.softlang.megal.model.AbstractEntityRef;
import org.softlang.megal.model.AbstractEntityTypeRef;
import org.softlang.megal.model.Entity;
import org.softlang.megal.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.EntityImpl#isIsParameter <em>Is Parameter</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.EntityImpl#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.EntityImpl#getRepresentativeName <em>Representative Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.EntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.EntityImpl#getGenerics <em>Generics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * The default value of the '{@link #isIsParameter() <em>Is Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsParameter() <em>Is Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean isParameter = IS_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean isDependent = IS_DEPENDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentativeName() <em>Representative Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentativeName()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATIVE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentativeName() <em>Representative Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentativeName()
	 * @generated
	 * @ordered
	 */
	protected String representativeName = REPRESENTATIVE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AbstractEntityTypeRef type;

	/**
	 * The cached value of the '{@link #getGenerics() <em>Generics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerics()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEntityRef> generics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsParameter() {
		return isParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsParameter(boolean newIsParameter) {
		boolean oldIsParameter = isParameter;
		isParameter = newIsParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__IS_PARAMETER, oldIsParameter, isParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDependent() {
		return isDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDependent(boolean newIsDependent) {
		boolean oldIsDependent = isDependent;
		isDependent = newIsDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__IS_DEPENDENT, oldIsDependent, isDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentativeName() {
		return representativeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentativeName(String newRepresentativeName) {
		String oldRepresentativeName = representativeName;
		representativeName = newRepresentativeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__REPRESENTATIVE_NAME, oldRepresentativeName, representativeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntityTypeRef getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AbstractEntityTypeRef newType, NotificationChain msgs) {
		AbstractEntityTypeRef oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AbstractEntityTypeRef newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ENTITY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ENTITY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEntityRef> getGenerics() {
		if (generics == null) {
			generics = new EObjectContainmentEList<AbstractEntityRef>(AbstractEntityRef.class, this, ModelPackage.ENTITY__GENERICS);
		}
		return generics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ENTITY__TYPE:
				return basicSetType(null, msgs);
			case ModelPackage.ENTITY__GENERICS:
				return ((InternalEList<?>)getGenerics()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ENTITY__NAME:
				return getName();
			case ModelPackage.ENTITY__IS_PARAMETER:
				return isIsParameter();
			case ModelPackage.ENTITY__IS_DEPENDENT:
				return isIsDependent();
			case ModelPackage.ENTITY__REPRESENTATIVE_NAME:
				return getRepresentativeName();
			case ModelPackage.ENTITY__TYPE:
				return getType();
			case ModelPackage.ENTITY__GENERICS:
				return getGenerics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ENTITY__IS_PARAMETER:
				setIsParameter((Boolean)newValue);
				return;
			case ModelPackage.ENTITY__IS_DEPENDENT:
				setIsDependent((Boolean)newValue);
				return;
			case ModelPackage.ENTITY__REPRESENTATIVE_NAME:
				setRepresentativeName((String)newValue);
				return;
			case ModelPackage.ENTITY__TYPE:
				setType((AbstractEntityTypeRef)newValue);
				return;
			case ModelPackage.ENTITY__GENERICS:
				getGenerics().clear();
				getGenerics().addAll((Collection<? extends AbstractEntityRef>)newValue);
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
			case ModelPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ENTITY__IS_PARAMETER:
				setIsParameter(IS_PARAMETER_EDEFAULT);
				return;
			case ModelPackage.ENTITY__IS_DEPENDENT:
				setIsDependent(IS_DEPENDENT_EDEFAULT);
				return;
			case ModelPackage.ENTITY__REPRESENTATIVE_NAME:
				setRepresentativeName(REPRESENTATIVE_NAME_EDEFAULT);
				return;
			case ModelPackage.ENTITY__TYPE:
				setType((AbstractEntityTypeRef)null);
				return;
			case ModelPackage.ENTITY__GENERICS:
				getGenerics().clear();
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
			case ModelPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ENTITY__IS_PARAMETER:
				return isParameter != IS_PARAMETER_EDEFAULT;
			case ModelPackage.ENTITY__IS_DEPENDENT:
				return isDependent != IS_DEPENDENT_EDEFAULT;
			case ModelPackage.ENTITY__REPRESENTATIVE_NAME:
				return REPRESENTATIVE_NAME_EDEFAULT == null ? representativeName != null : !REPRESENTATIVE_NAME_EDEFAULT.equals(representativeName);
			case ModelPackage.ENTITY__TYPE:
				return type != null;
			case ModelPackage.ENTITY__GENERICS:
				return generics != null && !generics.isEmpty();
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
		result.append(", isParameter: ");
		result.append(isParameter);
		result.append(", isDependent: ");
		result.append(isDependent);
		result.append(", representativeName: ");
		result.append(representativeName);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
