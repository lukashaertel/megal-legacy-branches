/**
 */
package org.softlang.megal.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.softlang.megal.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.softlang.megal.model.MegalPackage
 * @generated
 */
public class MegalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MegalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalSwitch() {
		if (modelPackage == null) {
			modelPackage = MegalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MegalPackage.MEGAMODEL: {
				Megamodel megamodel = (Megamodel)theEObject;
				T result = caseMegamodel(megamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.DECL: {
				Decl decl = (Decl)theEObject;
				T result = caseDecl(decl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.NAMED_DECL: {
				NamedDecl namedDecl = (NamedDecl)theEObject;
				T result = caseNamedDecl(namedDecl);
				if (result == null) result = caseDecl(namedDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.ETYPE_DECL: {
				ETypeDecl eTypeDecl = (ETypeDecl)theEObject;
				T result = caseETypeDecl(eTypeDecl);
				if (result == null) result = caseNamedDecl(eTypeDecl);
				if (result == null) result = caseDecl(eTypeDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.RTYPE_DECL: {
				RTypeDecl rTypeDecl = (RTypeDecl)theEObject;
				T result = caseRTypeDecl(rTypeDecl);
				if (result == null) result = caseNamedDecl(rTypeDecl);
				if (result == null) result = caseDecl(rTypeDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.EDECL: {
				EDecl eDecl = (EDecl)theEObject;
				T result = caseEDecl(eDecl);
				if (result == null) result = caseNamedDecl(eDecl);
				if (result == null) result = caseDecl(eDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.RDECL: {
				RDecl rDecl = (RDecl)theEObject;
				T result = caseRDecl(rDecl);
				if (result == null) result = caseDecl(rDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.ETYPE: {
				EType eType = (EType)theEObject;
				T result = caseEType(eType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.APP_DECL: {
				AppDecl appDecl = (AppDecl)theEObject;
				T result = caseAppDecl(appDecl);
				if (result == null) result = caseDecl(appDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegalPackage.FDECL: {
				FDecl fDecl = (FDecl)theEObject;
				T result = caseFDecl(fDecl);
				if (result == null) result = caseNamedDecl(fDecl);
				if (result == null) result = caseDecl(fDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Megamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Megamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMegamodel(Megamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecl(Decl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedDecl(NamedDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EType Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EType Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypeDecl(ETypeDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RType Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RType Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTypeDecl(RTypeDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDecl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDecl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDecl(EDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDecl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDecl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDecl(RDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEType(EType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppDecl(AppDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FDecl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FDecl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFDecl(FDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MegalSwitch
