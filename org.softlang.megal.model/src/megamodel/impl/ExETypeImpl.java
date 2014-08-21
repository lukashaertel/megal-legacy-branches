/**
 */
package megamodel.impl;

import java.util.Collection;

import megamodel.ETypeDecl;
import megamodel.ExEType;
import megamodel.MegamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex EType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link megamodel.impl.ExETypeImpl#getExDef <em>Ex Def</em>}</li>
 *   <li>{@link megamodel.impl.ExETypeImpl#getExArgs <em>Ex Args</em>}</li>
 *   <li>{@link megamodel.impl.ExETypeImpl#isExIsMany <em>Ex Is Many</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExETypeImpl extends ETypeImpl implements ExEType {
	/**
	 * The cached value of the '{@link #getExDef() <em>Ex Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExDef()
	 * @generated
	 * @ordered
	 */
	protected ETypeDecl exDef;

	/**
	 * The cached value of the '{@link #getExArgs() <em>Ex Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ExEType> exArgs;

	/**
	 * The default value of the '{@link #isExIsMany() <em>Ex Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExIsMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EX_IS_MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExIsMany() <em>Ex Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExIsMany()
	 * @generated
	 * @ordered
	 */
	protected boolean exIsMany = EX_IS_MANY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.EX_ETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeDecl getExDef() {
		if (exDef != null && exDef.eIsProxy()) {
			InternalEObject oldExDef = (InternalEObject)exDef;
			exDef = (ETypeDecl)eResolveProxy(oldExDef);
			if (exDef != oldExDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MegamodelPackage.EX_ETYPE__EX_DEF, oldExDef, exDef));
			}
		}
		return exDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeDecl basicGetExDef() {
		return exDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExDef(ETypeDecl newExDef) {
		ETypeDecl oldExDef = exDef;
		exDef = newExDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_ETYPE__EX_DEF, oldExDef, exDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExEType> getExArgs() {
		if (exArgs == null) {
			exArgs = new EObjectContainmentEList<ExEType>(ExEType.class, this, MegamodelPackage.EX_ETYPE__EX_ARGS);
		}
		return exArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExIsMany() {
		return exIsMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExIsMany(boolean newExIsMany) {
		boolean oldExIsMany = exIsMany;
		exIsMany = newExIsMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_ETYPE__EX_IS_MANY, oldExIsMany, exIsMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegamodelPackage.EX_ETYPE__EX_ARGS:
				return ((InternalEList<?>)getExArgs()).basicRemove(otherEnd, msgs);
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
			case MegamodelPackage.EX_ETYPE__EX_DEF:
				if (resolve) return getExDef();
				return basicGetExDef();
			case MegamodelPackage.EX_ETYPE__EX_ARGS:
				return getExArgs();
			case MegamodelPackage.EX_ETYPE__EX_IS_MANY:
				return isExIsMany();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MegamodelPackage.EX_ETYPE__EX_DEF:
				setExDef((ETypeDecl)newValue);
				return;
			case MegamodelPackage.EX_ETYPE__EX_ARGS:
				getExArgs().clear();
				getExArgs().addAll((Collection<? extends ExEType>)newValue);
				return;
			case MegamodelPackage.EX_ETYPE__EX_IS_MANY:
				setExIsMany((Boolean)newValue);
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
			case MegamodelPackage.EX_ETYPE__EX_DEF:
				setExDef((ETypeDecl)null);
				return;
			case MegamodelPackage.EX_ETYPE__EX_ARGS:
				getExArgs().clear();
				return;
			case MegamodelPackage.EX_ETYPE__EX_IS_MANY:
				setExIsMany(EX_IS_MANY_EDEFAULT);
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
			case MegamodelPackage.EX_ETYPE__EX_DEF:
				return exDef != null;
			case MegamodelPackage.EX_ETYPE__EX_ARGS:
				return exArgs != null && !exArgs.isEmpty();
			case MegamodelPackage.EX_ETYPE__EX_IS_MANY:
				return exIsMany != EX_IS_MANY_EDEFAULT;
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
		result.append(" (exIsMany: ");
		result.append(exIsMany);
		result.append(')');
		return result.toString();
	}

} //ExETypeImpl
