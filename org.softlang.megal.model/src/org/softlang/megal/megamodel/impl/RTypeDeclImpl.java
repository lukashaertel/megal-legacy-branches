/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.softlang.megal.megamodel.EType;
import org.softlang.megal.megamodel.MegamodelPackage;
import org.softlang.megal.megamodel.RTypeDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RType Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.RTypeDeclImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.RTypeDeclImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.RTypeDeclImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RTypeDeclImpl extends MinimalEObjectImpl.Container implements RTypeDecl {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.RTYPE_DECL__NAME).getSettingDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTypeDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.RTYPE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getLeft() {
		EType left = basicGetLeft();
		return left != null && left.eIsProxy() ? (EType)eResolveProxy((InternalEObject)left) : left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType basicGetLeft() {
		// TODO: implement this method to return the 'Left' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getRight() {
		EType right = basicGetRight();
		return right != null && right.eIsProxy() ? (EType)eResolveProxy((InternalEObject)right) : right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType basicGetRight() {
		// TODO: implement this method to return the 'Right' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MegamodelPackage.RTYPE_DECL__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case MegamodelPackage.RTYPE_DECL__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case MegamodelPackage.RTYPE_DECL__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MegamodelPackage.RTYPE_DECL__LEFT:
				return basicGetLeft() != null;
			case MegamodelPackage.RTYPE_DECL__RIGHT:
				return basicGetRight() != null;
			case MegamodelPackage.RTYPE_DECL__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //RTypeDeclImpl
