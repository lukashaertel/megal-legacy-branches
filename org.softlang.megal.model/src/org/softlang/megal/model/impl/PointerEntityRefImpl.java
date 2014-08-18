/**
 */
package org.softlang.megal.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.softlang.megal.model.Entity;
import org.softlang.megal.model.ModelPackage;
import org.softlang.megal.model.PointerEntityRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Entity Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.PointerEntityRefImpl#getRefered <em>Refered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointerEntityRefImpl extends AbstractEntityRefImpl implements PointerEntityRef {
	/**
	 * The cached value of the '{@link #getRefered() <em>Refered</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefered()
	 * @generated
	 * @ordered
	 */
	protected Entity refered;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointerEntityRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.POINTER_ENTITY_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getRefered() {
		if (refered != null && refered.eIsProxy()) {
			InternalEObject oldRefered = (InternalEObject)refered;
			refered = (Entity)eResolveProxy(oldRefered);
			if (refered != oldRefered) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.POINTER_ENTITY_REF__REFERED, oldRefered, refered));
			}
		}
		return refered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetRefered() {
		return refered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefered(Entity newRefered) {
		Entity oldRefered = refered;
		refered = newRefered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.POINTER_ENTITY_REF__REFERED, oldRefered, refered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.POINTER_ENTITY_REF__REFERED:
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
			case ModelPackage.POINTER_ENTITY_REF__REFERED:
				setRefered((Entity)newValue);
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
			case ModelPackage.POINTER_ENTITY_REF__REFERED:
				setRefered((Entity)null);
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
			case ModelPackage.POINTER_ENTITY_REF__REFERED:
				return refered != null;
		}
		return super.eIsSet(featureID);
	}

} //PointerEntityRefImpl
