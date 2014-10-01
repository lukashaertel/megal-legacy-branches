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

import org.softlang.megal.model.EType;
import org.softlang.megal.model.ETypeDecl;
import org.softlang.megal.model.MegalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.ETypeImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.ETypeImpl#isMany <em>Many</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.ETypeImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETypeImpl extends MinimalEObjectImpl.Container implements EType {
	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected ETypeDecl def;

	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected boolean many = MANY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<EType> args;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegalPackage.Literals.ETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeDecl getDef() {
		if (def != null && def.eIsProxy()) {
			InternalEObject oldDef = (InternalEObject)def;
			def = (ETypeDecl)eResolveProxy(oldDef);
			if (def != oldDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegalPackage.ETYPE__DEF, oldDef, def));
			}
		}
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeDecl basicGetDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDef(ETypeDecl newDef) {
		ETypeDecl oldDef = def;
		def = newDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.ETYPE__DEF, oldDef, def));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMany() {
		return many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany(boolean newMany) {
		boolean oldMany = many;
		many = newMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.ETYPE__MANY, oldMany, many));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EType> getArgs() {
		if (args == null) {
			args = new EObjectContainmentEList<EType>(EType.class, this, MegalPackage.ETYPE__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegalPackage.ETYPE__ARGS:
				return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
			case MegalPackage.ETYPE__DEF:
				if (resolve) return getDef();
				return basicGetDef();
			case MegalPackage.ETYPE__MANY:
				return isMany();
			case MegalPackage.ETYPE__ARGS:
				return getArgs();
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
			case MegalPackage.ETYPE__DEF:
				setDef((ETypeDecl)newValue);
				return;
			case MegalPackage.ETYPE__MANY:
				setMany((Boolean)newValue);
				return;
			case MegalPackage.ETYPE__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends EType>)newValue);
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
			case MegalPackage.ETYPE__DEF:
				setDef((ETypeDecl)null);
				return;
			case MegalPackage.ETYPE__MANY:
				setMany(MANY_EDEFAULT);
				return;
			case MegalPackage.ETYPE__ARGS:
				getArgs().clear();
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
			case MegalPackage.ETYPE__DEF:
				return def != null;
			case MegalPackage.ETYPE__MANY:
				return many != MANY_EDEFAULT;
			case MegalPackage.ETYPE__ARGS:
				return args != null && !args.isEmpty();
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
		result.append(" (many: ");
		result.append(many);
		result.append(')');
		return result.toString();
	}

} //ETypeImpl
