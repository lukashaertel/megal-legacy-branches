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
 * An implementation of the model object '<em><b>EType Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.impl.ETypeDeclImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.ETypeDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.impl.ETypeDeclImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ETypeDeclImpl extends MinimalEObjectImpl.Container implements ETypeDecl {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETypeDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.ETYPE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getSupertype() {
		EType supertype = basicGetSupertype();
		return supertype != null && supertype.eIsProxy() ? (EType)eResolveProxy((InternalEObject)supertype) : supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType basicGetSupertype() {
		// TODO: implement this method to return the 'Supertype' reference
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
		// TODO: implement this method to return the 'Name' attribute
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MegamodelPackage.ETYPE_DECL__SUPERTYPE:
				if (resolve) return getSupertype();
				return basicGetSupertype();
			case MegamodelPackage.ETYPE_DECL__NAME:
				return getName();
			case MegamodelPackage.ETYPE_DECL__ARGS:
				return getArgs();
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
			case MegamodelPackage.ETYPE_DECL__SUPERTYPE:
				return basicGetSupertype() != null;
			case MegamodelPackage.ETYPE_DECL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case MegamodelPackage.ETYPE_DECL__ARGS:
				return !getArgs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ETypeDeclImpl
