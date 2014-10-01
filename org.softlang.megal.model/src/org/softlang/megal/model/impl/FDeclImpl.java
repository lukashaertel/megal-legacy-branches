/**
 */
package org.softlang.megal.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.model.EType;
import org.softlang.megal.model.FDecl;
import org.softlang.megal.model.MegalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FDecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.FDeclImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.FDeclImpl#getCodomain <em>Codomain</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.FDeclImpl#isDependent <em>Dependent</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.FDeclImpl#isParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FDeclImpl extends NamedDeclImpl implements FDecl {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EType domain;

	/**
	 * The cached value of the '{@link #getCodomain() <em>Codomain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodomain()
	 * @generated
	 * @ordered
	 */
	protected EType codomain;

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
	protected FDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegalPackage.Literals.FDECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(EType newDomain, NotificationChain msgs) {
		EType oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegalPackage.FDECL__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(EType newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegalPackage.FDECL__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegalPackage.FDECL__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FDECL__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getCodomain() {
		return codomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodomain(EType newCodomain, NotificationChain msgs) {
		EType oldCodomain = codomain;
		codomain = newCodomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegalPackage.FDECL__CODOMAIN, oldCodomain, newCodomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodomain(EType newCodomain) {
		if (newCodomain != codomain) {
			NotificationChain msgs = null;
			if (codomain != null)
				msgs = ((InternalEObject)codomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegalPackage.FDECL__CODOMAIN, null, msgs);
			if (newCodomain != null)
				msgs = ((InternalEObject)newCodomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegalPackage.FDECL__CODOMAIN, null, msgs);
			msgs = basicSetCodomain(newCodomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FDECL__CODOMAIN, newCodomain, newCodomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FDECL__DEPENDENT, oldDependent, dependent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MegalPackage.FDECL__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegalPackage.FDECL__DOMAIN:
				return basicSetDomain(null, msgs);
			case MegalPackage.FDECL__CODOMAIN:
				return basicSetCodomain(null, msgs);
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
			case MegalPackage.FDECL__DOMAIN:
				return getDomain();
			case MegalPackage.FDECL__CODOMAIN:
				return getCodomain();
			case MegalPackage.FDECL__DEPENDENT:
				return isDependent();
			case MegalPackage.FDECL__PARAMETER:
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
			case MegalPackage.FDECL__DOMAIN:
				setDomain((EType)newValue);
				return;
			case MegalPackage.FDECL__CODOMAIN:
				setCodomain((EType)newValue);
				return;
			case MegalPackage.FDECL__DEPENDENT:
				setDependent((Boolean)newValue);
				return;
			case MegalPackage.FDECL__PARAMETER:
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
			case MegalPackage.FDECL__DOMAIN:
				setDomain((EType)null);
				return;
			case MegalPackage.FDECL__CODOMAIN:
				setCodomain((EType)null);
				return;
			case MegalPackage.FDECL__DEPENDENT:
				setDependent(DEPENDENT_EDEFAULT);
				return;
			case MegalPackage.FDECL__PARAMETER:
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
			case MegalPackage.FDECL__DOMAIN:
				return domain != null;
			case MegalPackage.FDECL__CODOMAIN:
				return codomain != null;
			case MegalPackage.FDECL__DEPENDENT:
				return dependent != DEPENDENT_EDEFAULT;
			case MegalPackage.FDECL__PARAMETER:
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

} //FDeclImpl
