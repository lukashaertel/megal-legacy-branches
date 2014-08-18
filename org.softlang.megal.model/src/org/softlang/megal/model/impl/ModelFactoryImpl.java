/**
 */
package org.softlang.megal.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.softlang.megal.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.DECLARATION: return createDeclaration();
			case ModelPackage.RELATION: return createRelation();
			case ModelPackage.POINTER_ENTITY_REF: return createPointerEntityRef();
			case ModelPackage.ENTITY: return createEntity();
			case ModelPackage.RELATION_TYPE: return createRelationType();
			case ModelPackage.POINTER_RELATION_TYPE_REF: return createPointerRelationTypeRef();
			case ModelPackage.ENTITY_TYPE: return createEntityType();
			case ModelPackage.TOP_ENTITY_TYPE_REF: return createTopEntityTypeRef();
			case ModelPackage.POINTER_ENTITY_TYPE_REF: return createPointerEntityTypeRef();
			case ModelPackage.FUNCTION_APPLICATION: return createFunctionApplication();
			case ModelPackage.PRELUDE_DECLARATION_REF: return createPreludeDeclarationRef();
			case ModelPackage.POINTER_DECLARATION_REF: return createPointerDeclarationRef();
			case ModelPackage.MEGAMODEL: return createMegamodel();
			case ModelPackage.BINDING: return createBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerEntityRef createPointerEntityRef() {
		PointerEntityRefImpl pointerEntityRef = new PointerEntityRefImpl();
		return pointerEntityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationType() {
		RelationTypeImpl relationType = new RelationTypeImpl();
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerRelationTypeRef createPointerRelationTypeRef() {
		PointerRelationTypeRefImpl pointerRelationTypeRef = new PointerRelationTypeRefImpl();
		return pointerRelationTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityType() {
		EntityTypeImpl entityType = new EntityTypeImpl();
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopEntityTypeRef createTopEntityTypeRef() {
		TopEntityTypeRefImpl topEntityTypeRef = new TopEntityTypeRefImpl();
		return topEntityTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerEntityTypeRef createPointerEntityTypeRef() {
		PointerEntityTypeRefImpl pointerEntityTypeRef = new PointerEntityTypeRefImpl();
		return pointerEntityTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionApplication createFunctionApplication() {
		FunctionApplicationImpl functionApplication = new FunctionApplicationImpl();
		return functionApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreludeDeclarationRef createPreludeDeclarationRef() {
		PreludeDeclarationRefImpl preludeDeclarationRef = new PreludeDeclarationRefImpl();
		return preludeDeclarationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerDeclarationRef createPointerDeclarationRef() {
		PointerDeclarationRefImpl pointerDeclarationRef = new PointerDeclarationRefImpl();
		return pointerDeclarationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Megamodel createMegamodel() {
		MegamodelImpl megamodel = new MegamodelImpl();
		return megamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
