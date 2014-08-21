/**
 */
package org.softlang.megal.megamodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
	 * The default value of the '{@link #isIsMany() <em>Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANY_EDEFAULT = false;

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
		ETypeDecl def = basicGetDef();
		return def != null && def.eIsProxy() ? (ETypeDecl)eResolveProxy((InternalEObject)def) : def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeDecl basicGetDef() {
		// TODO: implement this method to return the 'Def' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EType> getArgs() {
		// TODO: implement this method to return the 'Args' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMany() {
		// TODO: implement this method to return the 'Is Many' attribute
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
				return basicGetDef() != null;
			case MegamodelPackage.ETYPE__ARGS:
				return !getArgs().isEmpty();
			case MegamodelPackage.ETYPE__IS_MANY:
				return isIsMany() != IS_MANY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ETypeImpl
