/**
 */
package megamodel.util;

import megamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see megamodel.MegamodelPackage
 * @generated
 */
public class MegamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MegamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = MegamodelPackage.eINSTANCE;
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
			case MegamodelPackage.MEGAMODEL: {
				Megamodel megamodel = (Megamodel)theEObject;
				T result = caseMegamodel(megamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.DECL_GROUP: {
				DeclGroup declGroup = (DeclGroup)theEObject;
				T result = caseDeclGroup(declGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.ETYPE_DECL: {
				ETypeDecl eTypeDecl = (ETypeDecl)theEObject;
				T result = caseETypeDecl(eTypeDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.RTYPE_DECL: {
				RTypeDecl rTypeDecl = (RTypeDecl)theEObject;
				T result = caseRTypeDecl(rTypeDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EDECL: {
				EDecl eDecl = (EDecl)theEObject;
				T result = caseEDecl(eDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.RDECL: {
				RDecl rDecl = (RDecl)theEObject;
				T result = caseRDecl(rDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.ETYPE: {
				EType eType = (EType)theEObject;
				T result = caseEType(eType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EX_ETYPE_DECL_GROUP: {
				ExETypeDeclGroup exETypeDeclGroup = (ExETypeDeclGroup)theEObject;
				T result = caseExETypeDeclGroup(exETypeDeclGroup);
				if (result == null) result = caseDeclGroup(exETypeDeclGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EX_ETYPE_DECL: {
				ExETypeDecl exETypeDecl = (ExETypeDecl)theEObject;
				T result = caseExETypeDecl(exETypeDecl);
				if (result == null) result = caseETypeDecl(exETypeDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EX_ETYPE: {
				ExEType exEType = (ExEType)theEObject;
				T result = caseExEType(exEType);
				if (result == null) result = caseEType(exEType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EX_RTYPE_DECL_GROUP: {
				ExRTypeDeclGroup exRTypeDeclGroup = (ExRTypeDeclGroup)theEObject;
				T result = caseExRTypeDeclGroup(exRTypeDeclGroup);
				if (result == null) result = caseDeclGroup(exRTypeDeclGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EX_RTYPE_DECL: {
				ExRTypeDecl exRTypeDecl = (ExRTypeDecl)theEObject;
				T result = caseExRTypeDecl(exRTypeDecl);
				if (result == null) result = caseRTypeDecl(exRTypeDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EX_EDECL_GROUP: {
				ExEDeclGroup exEDeclGroup = (ExEDeclGroup)theEObject;
				T result = caseExEDeclGroup(exEDeclGroup);
				if (result == null) result = caseDeclGroup(exEDeclGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EX_EDECL: {
				ExEDecl exEDecl = (ExEDecl)theEObject;
				T result = caseExEDecl(exEDecl);
				if (result == null) result = caseEDecl(exEDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EX_RDECL: {
				ExRDecl exRDecl = (ExRDecl)theEObject;
				T result = caseExRDecl(exRDecl);
				if (result == null) result = caseRDecl(exRDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MegamodelPackage.EX_RDECL_GROUP: {
				ExRDeclGroup exRDeclGroup = (ExRDeclGroup)theEObject;
				T result = caseExRDeclGroup(exRDeclGroup);
				if (result == null) result = caseDeclGroup(exRDeclGroup);
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
	 * Returns the result of interpreting the object as an instance of '<em>Decl Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decl Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclGroup(DeclGroup object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ex EType Decl Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex EType Decl Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExETypeDeclGroup(ExETypeDeclGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ex EType Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex EType Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExETypeDecl(ExETypeDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ex EType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex EType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExEType(ExEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ex RType Decl Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex RType Decl Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExRTypeDeclGroup(ExRTypeDeclGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ex RType Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex RType Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExRTypeDecl(ExRTypeDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ex EDecl Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex EDecl Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExEDeclGroup(ExEDeclGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ex EDecl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex EDecl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExEDecl(ExEDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ex RDecl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex RDecl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExRDecl(ExRDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ex RDecl Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ex RDecl Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExRDeclGroup(ExRDeclGroup object) {
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

} //MegamodelSwitch
