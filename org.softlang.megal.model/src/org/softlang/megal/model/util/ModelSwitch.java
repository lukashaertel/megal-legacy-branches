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
 * @see org.softlang.megal.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
			case ModelPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseAbstractPart(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_ENTITY_REF: {
				AbstractEntityRef abstractEntityRef = (AbstractEntityRef)theEObject;
				T result = caseAbstractEntityRef(abstractEntityRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POINTER_ENTITY_REF: {
				PointerEntityRef pointerEntityRef = (PointerEntityRef)theEObject;
				T result = casePointerEntityRef(pointerEntityRef);
				if (result == null) result = caseAbstractEntityRef(pointerEntityRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RELATION_TYPE: {
				RelationType relationType = (RelationType)theEObject;
				T result = caseRelationType(relationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_RELATION_TYPE_REF: {
				AbstractRelationTypeRef abstractRelationTypeRef = (AbstractRelationTypeRef)theEObject;
				T result = caseAbstractRelationTypeRef(abstractRelationTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POINTER_RELATION_TYPE_REF: {
				PointerRelationTypeRef pointerRelationTypeRef = (PointerRelationTypeRef)theEObject;
				T result = casePointerRelationTypeRef(pointerRelationTypeRef);
				if (result == null) result = caseAbstractRelationTypeRef(pointerRelationTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENTITY_TYPE: {
				EntityType entityType = (EntityType)theEObject;
				T result = caseEntityType(entityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_ENTITY_TYPE_REF: {
				AbstractEntityTypeRef abstractEntityTypeRef = (AbstractEntityTypeRef)theEObject;
				T result = caseAbstractEntityTypeRef(abstractEntityTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TOP_ENTITY_TYPE_REF: {
				TopEntityTypeRef topEntityTypeRef = (TopEntityTypeRef)theEObject;
				T result = caseTopEntityTypeRef(topEntityTypeRef);
				if (result == null) result = caseAbstractEntityTypeRef(topEntityTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POINTER_ENTITY_TYPE_REF: {
				PointerEntityTypeRef pointerEntityTypeRef = (PointerEntityTypeRef)theEObject;
				T result = casePointerEntityTypeRef(pointerEntityTypeRef);
				if (result == null) result = caseAbstractEntityTypeRef(pointerEntityTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SUGAR: {
				Sugar sugar = (Sugar)theEObject;
				T result = caseSugar(sugar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FUNCTION_APPLICATION: {
				FunctionApplication functionApplication = (FunctionApplication)theEObject;
				T result = caseFunctionApplication(functionApplication);
				if (result == null) result = caseSugar(functionApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_DECLARATION_REF: {
				AbstractDeclarationRef abstractDeclarationRef = (AbstractDeclarationRef)theEObject;
				T result = caseAbstractDeclarationRef(abstractDeclarationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRELUDE_DECLARATION_REF: {
				PreludeDeclarationRef preludeDeclarationRef = (PreludeDeclarationRef)theEObject;
				T result = casePreludeDeclarationRef(preludeDeclarationRef);
				if (result == null) result = caseAbstractDeclarationRef(preludeDeclarationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POINTER_DECLARATION_REF: {
				PointerDeclarationRef pointerDeclarationRef = (PointerDeclarationRef)theEObject;
				T result = casePointerDeclarationRef(pointerDeclarationRef);
				if (result == null) result = caseAbstractDeclarationRef(pointerDeclarationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MEGAMODEL: {
				Megamodel megamodel = (Megamodel)theEObject;
				T result = caseMegamodel(megamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_PART: {
				AbstractPart abstractPart = (AbstractPart)theEObject;
				T result = caseAbstractPart(abstractPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseAbstractPart(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Entity Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Entity Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEntityRef(AbstractEntityRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Entity Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Entity Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerEntityRef(PointerEntityRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationType(RelationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Relation Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Relation Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRelationTypeRef(AbstractRelationTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Relation Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Relation Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerRelationTypeRef(PointerRelationTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityType(EntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Entity Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Entity Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEntityTypeRef(AbstractEntityTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Entity Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Entity Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopEntityTypeRef(TopEntityTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Entity Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Entity Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerEntityTypeRef(PointerEntityTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sugar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sugar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSugar(Sugar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionApplication(FunctionApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Declaration Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Declaration Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDeclarationRef(AbstractDeclarationRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prelude Declaration Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prelude Declaration Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreludeDeclarationRef(PreludeDeclarationRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Declaration Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Declaration Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerDeclarationRef(PointerDeclarationRef object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPart(AbstractPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
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

} //ModelSwitch
