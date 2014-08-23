/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.softlang.megal.megamodel.EDecl;
import org.softlang.megal.megamodel.EType;
import org.softlang.megal.megamodel.MegamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.EDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.EDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.EDeclImpl#getShowname <em>Showname</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.EDeclImpl#isIsParameter <em>Is Parameter</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.EDeclImpl#isIsDependent <em>Is Dependent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EDeclImpl extends MinimalEObjectImpl.Container implements EDecl {
	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.EDECL__NAME).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getShowname() <em>Showname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowname()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SHOWNAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.EDECL__SHOWNAME).getSettingDelegate();

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
	 * The default value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPENDENT_EDEFAULT = false;

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
		return MegamodelPackage.Literals.EDECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getType() {
		EType type = basicGetType();
		return type != null && type.eIsProxy() ? (EType)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType basicGetType() {
		// TODO: implement this method to return the 'Type' reference
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
	public String getShowname() {
		return (String)SHOWNAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsParameter() {
		// TODO: implement this method to return the 'Is Parameter' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDependent() {
		// TODO: implement this method to return the 'Is Dependent' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MegamodelPackage.EDECL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MegamodelPackage.EDECL__NAME:
				return getName();
			case MegamodelPackage.EDECL__SHOWNAME:
				return getShowname();
			case MegamodelPackage.EDECL__IS_PARAMETER:
				return isIsParameter();
			case MegamodelPackage.EDECL__IS_DEPENDENT:
				return isIsDependent();
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
			case MegamodelPackage.EDECL__TYPE:
				return basicGetType() != null;
			case MegamodelPackage.EDECL__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case MegamodelPackage.EDECL__SHOWNAME:
				return SHOWNAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case MegamodelPackage.EDECL__IS_PARAMETER:
				return isIsParameter() != IS_PARAMETER_EDEFAULT;
			case MegamodelPackage.EDECL__IS_DEPENDENT:
				return isIsDependent() != IS_DEPENDENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EDeclImpl
