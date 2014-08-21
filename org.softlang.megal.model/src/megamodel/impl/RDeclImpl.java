/**
 */
package megamodel.impl;

import megamodel.EDecl;
import megamodel.MegamodelPackage;
import megamodel.RDecl;
import megamodel.RTypeDecl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link megamodel.impl.RDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link megamodel.impl.RDeclImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link megamodel.impl.RDeclImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RDeclImpl extends MinimalEObjectImpl.Container implements RDecl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.RDECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTypeDecl getType() {
		RTypeDecl type = basicGetType();
		return type != null && type.eIsProxy() ? (RTypeDecl)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTypeDecl basicGetType() {
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
	public EDecl getLeft() {
		EDecl left = basicGetLeft();
		return left != null && left.eIsProxy() ? (EDecl)eResolveProxy((InternalEObject)left) : left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDecl basicGetLeft() {
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
	public EDecl getRight() {
		EDecl right = basicGetRight();
		return right != null && right.eIsProxy() ? (EDecl)eResolveProxy((InternalEObject)right) : right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDecl basicGetRight() {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MegamodelPackage.RDECL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MegamodelPackage.RDECL__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case MegamodelPackage.RDECL__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
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
			case MegamodelPackage.RDECL__TYPE:
				return basicGetType() != null;
			case MegamodelPackage.RDECL__LEFT:
				return basicGetLeft() != null;
			case MegamodelPackage.RDECL__RIGHT:
				return basicGetRight() != null;
		}
		return super.eIsSet(featureID);
	}

} //RDeclImpl
