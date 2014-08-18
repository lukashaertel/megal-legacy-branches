/**
 */
package org.softlang.megal.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.model.Declaration;
import org.softlang.megal.model.ModelPackage;
import org.softlang.megal.model.PointerDeclarationRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Declaration Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.PointerDeclarationRefImpl#getRefered <em>Refered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointerDeclarationRefImpl extends AbstractDeclarationRefImpl implements PointerDeclarationRef {
	/**
	 * The cached value of the '{@link #getRefered() <em>Refered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefered()
	 * @generated
	 * @ordered
	 */
	protected Declaration refered;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerDeclarationRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.POINTER_DECLARATION_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration getRefered() {
		if (refered != null && refered.eIsProxy()) {
			InternalEObject oldRefered = (InternalEObject)refered;
			refered = (Declaration)eResolveProxy(oldRefered);
			if (refered != oldRefered) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.POINTER_DECLARATION_REF__REFERED, oldRefered, refered));
			}
		}
		return refered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration basicGetRefered() {
		return refered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefered(Declaration newRefered) {
		Declaration oldRefered = refered;
		refered = newRefered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POINTER_DECLARATION_REF__REFERED, oldRefered, refered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.POINTER_DECLARATION_REF__REFERED:
				if (resolve) return getRefered();
				return basicGetRefered();
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
			case ModelPackage.POINTER_DECLARATION_REF__REFERED:
				setRefered((Declaration)newValue);
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
			case ModelPackage.POINTER_DECLARATION_REF__REFERED:
				setRefered((Declaration)null);
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
			case ModelPackage.POINTER_DECLARATION_REF__REFERED:
				return refered != null;
		}
		return super.eIsSet(featureID);
	}

} //PointerDeclarationRefImpl
