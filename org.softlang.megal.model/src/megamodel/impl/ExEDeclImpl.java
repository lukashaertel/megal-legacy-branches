/**
 */
package megamodel.impl;

import megamodel.ExEDecl;
import megamodel.ExEType;
import megamodel.MegamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex EDecl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link megamodel.impl.ExEDeclImpl#getExName <em>Ex Name</em>}</li>
 *   <li>{@link megamodel.impl.ExEDeclImpl#getExShowname <em>Ex Showname</em>}</li>
 *   <li>{@link megamodel.impl.ExEDeclImpl#isExIsParameter <em>Ex Is Parameter</em>}</li>
 *   <li>{@link megamodel.impl.ExEDeclImpl#isExIsDependent <em>Ex Is Dependent</em>}</li>
 *   <li>{@link megamodel.impl.ExEDeclImpl#getExType <em>Ex Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExEDeclImpl extends EDeclImpl implements ExEDecl {
	/**
	 * The default value of the '{@link #getExName() <em>Ex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExName()
	 * @generated
	 * @ordered
	 */
	protected static final String EX_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExName() <em>Ex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExName()
	 * @generated
	 * @ordered
	 */
	protected String exName = EX_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExShowname() <em>Ex Showname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExShowname()
	 * @generated
	 * @ordered
	 */
	protected static final String EX_SHOWNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExShowname() <em>Ex Showname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExShowname()
	 * @generated
	 * @ordered
	 */
	protected String exShowname = EX_SHOWNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isExIsParameter() <em>Ex Is Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExIsParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EX_IS_PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExIsParameter() <em>Ex Is Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExIsParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean exIsParameter = EX_IS_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isExIsDependent() <em>Ex Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExIsDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EX_IS_DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExIsDependent() <em>Ex Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExIsDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean exIsDependent = EX_IS_DEPENDENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExType() <em>Ex Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExType()
	 * @generated
	 * @ordered
	 */
	protected ExEType exType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExEDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MegamodelPackage.Literals.EX_EDECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExName() {
		return exName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExName(String newExName) {
		String oldExName = exName;
		exName = newExName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_EDECL__EX_NAME, oldExName, exName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExShowname() {
		return exShowname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExShowname(String newExShowname) {
		String oldExShowname = exShowname;
		exShowname = newExShowname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_EDECL__EX_SHOWNAME, oldExShowname, exShowname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExIsParameter() {
		return exIsParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExIsParameter(boolean newExIsParameter) {
		boolean oldExIsParameter = exIsParameter;
		exIsParameter = newExIsParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_EDECL__EX_IS_PARAMETER, oldExIsParameter, exIsParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExIsDependent() {
		return exIsDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExIsDependent(boolean newExIsDependent) {
		boolean oldExIsDependent = exIsDependent;
		exIsDependent = newExIsDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_EDECL__EX_IS_DEPENDENT, oldExIsDependent, exIsDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExEType getExType() {
		return exType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExType(ExEType newExType, NotificationChain msgs) {
		ExEType oldExType = exType;
		exType = newExType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_EDECL__EX_TYPE, oldExType, newExType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExType(ExEType newExType) {
		if (newExType != exType) {
			NotificationChain msgs = null;
			if (exType != null)
				msgs = ((InternalEObject)exType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_EDECL__EX_TYPE, null, msgs);
			if (newExType != null)
				msgs = ((InternalEObject)newExType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MegamodelPackage.EX_EDECL__EX_TYPE, null, msgs);
			msgs = basicSetExType(newExType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MegamodelPackage.EX_EDECL__EX_TYPE, newExType, newExType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MegamodelPackage.EX_EDECL__EX_TYPE:
				return basicSetExType(null, msgs);
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
			case MegamodelPackage.EX_EDECL__EX_NAME:
				return getExName();
			case MegamodelPackage.EX_EDECL__EX_SHOWNAME:
				return getExShowname();
			case MegamodelPackage.EX_EDECL__EX_IS_PARAMETER:
				return isExIsParameter();
			case MegamodelPackage.EX_EDECL__EX_IS_DEPENDENT:
				return isExIsDependent();
			case MegamodelPackage.EX_EDECL__EX_TYPE:
				return getExType();
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
			case MegamodelPackage.EX_EDECL__EX_NAME:
				setExName((String)newValue);
				return;
			case MegamodelPackage.EX_EDECL__EX_SHOWNAME:
				setExShowname((String)newValue);
				return;
			case MegamodelPackage.EX_EDECL__EX_IS_PARAMETER:
				setExIsParameter((Boolean)newValue);
				return;
			case MegamodelPackage.EX_EDECL__EX_IS_DEPENDENT:
				setExIsDependent((Boolean)newValue);
				return;
			case MegamodelPackage.EX_EDECL__EX_TYPE:
				setExType((ExEType)newValue);
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
			case MegamodelPackage.EX_EDECL__EX_NAME:
				setExName(EX_NAME_EDEFAULT);
				return;
			case MegamodelPackage.EX_EDECL__EX_SHOWNAME:
				setExShowname(EX_SHOWNAME_EDEFAULT);
				return;
			case MegamodelPackage.EX_EDECL__EX_IS_PARAMETER:
				setExIsParameter(EX_IS_PARAMETER_EDEFAULT);
				return;
			case MegamodelPackage.EX_EDECL__EX_IS_DEPENDENT:
				setExIsDependent(EX_IS_DEPENDENT_EDEFAULT);
				return;
			case MegamodelPackage.EX_EDECL__EX_TYPE:
				setExType((ExEType)null);
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
			case MegamodelPackage.EX_EDECL__EX_NAME:
				return EX_NAME_EDEFAULT == null ? exName != null : !EX_NAME_EDEFAULT.equals(exName);
			case MegamodelPackage.EX_EDECL__EX_SHOWNAME:
				return EX_SHOWNAME_EDEFAULT == null ? exShowname != null : !EX_SHOWNAME_EDEFAULT.equals(exShowname);
			case MegamodelPackage.EX_EDECL__EX_IS_PARAMETER:
				return exIsParameter != EX_IS_PARAMETER_EDEFAULT;
			case MegamodelPackage.EX_EDECL__EX_IS_DEPENDENT:
				return exIsDependent != EX_IS_DEPENDENT_EDEFAULT;
			case MegamodelPackage.EX_EDECL__EX_TYPE:
				return exType != null;
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
		result.append(" (exName: ");
		result.append(exName);
		result.append(", exShowname: ");
		result.append(exShowname);
		result.append(", exIsParameter: ");
		result.append(exIsParameter);
		result.append(", exIsDependent: ");
		result.append(exIsDependent);
		result.append(')');
		return result.toString();
	}

} //ExEDeclImpl
