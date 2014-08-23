/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.softlang.megal.megamodel.EType;
import org.softlang.megal.megamodel.ETypeDecl;
import org.softlang.megal.megamodel.MegamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.ETypeImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.ETypeImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.ETypeImpl#isIsMany <em>Is Many</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ETypeImpl extends MinimalEObjectImpl.Container implements EType {
	/**
	 * The cached setting delegate for the '{@link #getDef() <em>Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DEF__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.ETYPE__DEF).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getArgs() <em>Args</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ARGS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.ETYPE__ARGS).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #isIsMany() <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMany()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_MANY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MegamodelPackage.Literals.ETYPE__IS_MANY).getSettingDelegate();
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
		return MegamodelPackage.Literals.ETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeDecl getDef() {
		return (ETypeDecl)DEF__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeDecl basicGetDef() {
		return (ETypeDecl)DEF__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EType> getArgs() {
		return (EList<EType>)ARGS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMany() {
		return (Boolean)IS_MANY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MegamodelPackage.ETYPE__DEF:
				if (resolve) return getDef();
				return basicGetDef();
			case MegamodelPackage.ETYPE__ARGS:
				return getArgs();
			case MegamodelPackage.ETYPE__IS_MANY:
				return isIsMany();
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
			case MegamodelPackage.ETYPE__DEF:
				return DEF__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case MegamodelPackage.ETYPE__ARGS:
				return ARGS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case MegamodelPackage.ETYPE__IS_MANY:
				return IS_MANY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ETypeImpl
