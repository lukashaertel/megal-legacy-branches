/**
 */
package org.softlang.megal.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.softlang.megal.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.softlang.megal.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseAbstractEntityRef(AbstractEntityRef object) {
				return createAbstractEntityRefAdapter();
			}
			@Override
			public Adapter casePointerEntityRef(PointerEntityRef object) {
				return createPointerEntityRefAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseRelationType(RelationType object) {
				return createRelationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRelationTypeRef(AbstractRelationTypeRef object) {
				return createAbstractRelationTypeRefAdapter();
			}
			@Override
			public Adapter casePointerRelationTypeRef(PointerRelationTypeRef object) {
				return createPointerRelationTypeRefAdapter();
			}
			@Override
			public Adapter caseEntityType(EntityType object) {
				return createEntityTypeAdapter();
			}
			@Override
			public Adapter caseAbstractEntityTypeRef(AbstractEntityTypeRef object) {
				return createAbstractEntityTypeRefAdapter();
			}
			@Override
			public Adapter caseTopEntityTypeRef(TopEntityTypeRef object) {
				return createTopEntityTypeRefAdapter();
			}
			@Override
			public Adapter casePointerEntityTypeRef(PointerEntityTypeRef object) {
				return createPointerEntityTypeRefAdapter();
			}
			@Override
			public Adapter caseSugar(Sugar object) {
				return createSugarAdapter();
			}
			@Override
			public Adapter caseFunctionApplication(FunctionApplication object) {
				return createFunctionApplicationAdapter();
			}
			@Override
			public Adapter caseAbstractDeclarationRef(AbstractDeclarationRef object) {
				return createAbstractDeclarationRefAdapter();
			}
			@Override
			public Adapter casePreludeDeclarationRef(PreludeDeclarationRef object) {
				return createPreludeDeclarationRefAdapter();
			}
			@Override
			public Adapter casePointerDeclarationRef(PointerDeclarationRef object) {
				return createPointerDeclarationRefAdapter();
			}
			@Override
			public Adapter caseMegamodel(Megamodel object) {
				return createMegamodelAdapter();
			}
			@Override
			public Adapter caseAbstractPart(AbstractPart object) {
				return createAbstractPartAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.AbstractEntityRef <em>Abstract Entity Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.AbstractEntityRef
	 * @generated
	 */
	public Adapter createAbstractEntityRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.PointerEntityRef <em>Pointer Entity Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.PointerEntityRef
	 * @generated
	 */
	public Adapter createPointerEntityRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.RelationType
	 * @generated
	 */
	public Adapter createRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.AbstractRelationTypeRef <em>Abstract Relation Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.AbstractRelationTypeRef
	 * @generated
	 */
	public Adapter createAbstractRelationTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.PointerRelationTypeRef <em>Pointer Relation Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.PointerRelationTypeRef
	 * @generated
	 */
	public Adapter createPointerRelationTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.AbstractEntityTypeRef <em>Abstract Entity Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.AbstractEntityTypeRef
	 * @generated
	 */
	public Adapter createAbstractEntityTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.TopEntityTypeRef <em>Top Entity Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.TopEntityTypeRef
	 * @generated
	 */
	public Adapter createTopEntityTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.PointerEntityTypeRef <em>Pointer Entity Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.PointerEntityTypeRef
	 * @generated
	 */
	public Adapter createPointerEntityTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.Sugar <em>Sugar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.Sugar
	 * @generated
	 */
	public Adapter createSugarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.FunctionApplication <em>Function Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.FunctionApplication
	 * @generated
	 */
	public Adapter createFunctionApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.AbstractDeclarationRef <em>Abstract Declaration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.AbstractDeclarationRef
	 * @generated
	 */
	public Adapter createAbstractDeclarationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.PreludeDeclarationRef <em>Prelude Declaration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.PreludeDeclarationRef
	 * @generated
	 */
	public Adapter createPreludeDeclarationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.PointerDeclarationRef <em>Pointer Declaration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.PointerDeclarationRef
	 * @generated
	 */
	public Adapter createPointerDeclarationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.Megamodel <em>Megamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.Megamodel
	 * @generated
	 */
	public Adapter createMegamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.AbstractPart <em>Abstract Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.AbstractPart
	 * @generated
	 */
	public Adapter createAbstractPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
