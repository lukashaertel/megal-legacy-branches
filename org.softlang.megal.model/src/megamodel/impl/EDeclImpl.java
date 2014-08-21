/**
 */
package megamodel.impl;

import megamodel.EDecl;
import megamodel.EType;
import megamodel.MegamodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link megamodel.impl.EDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link megamodel.impl.EDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link megamodel.impl.EDeclImpl#getShowname <em>Showname</em>}</li>
 *   <li>{@link megamodel.impl.EDeclImpl#isIsParameter <em>Is Parameter</em>}</li>
 *   <li>{@link megamodel.impl.EDeclImpl#isIsDependent <em>Is Dependent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EDeclImpl extends MinimalEObjectImpl.Container implements EDecl {
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
	 * The default value of the '{@link #getShowname() <em>Showname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowname()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOWNAME_EDEFAULT = null;

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
		// TODO: implement this method to return the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShowname() {
		// TODO: implement this method to return the 'Showname' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case MegamodelPackage.EDECL__SHOWNAME:
				return SHOWNAME_EDEFAULT == null ? getShowname() != null : !SHOWNAME_EDEFAULT.equals(getShowname());
			case MegamodelPackage.EDECL__IS_PARAMETER:
				return isIsParameter() != IS_PARAMETER_EDEFAULT;
			case MegamodelPackage.EDECL__IS_DEPENDENT:
				return isIsDependent() != IS_DEPENDENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EDeclImpl
