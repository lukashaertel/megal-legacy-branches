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
 * @see org.softlang.megal.model.MegalPackage
 * @generated
 */
public class MegalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MegalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MegalPackage.eINSTANCE;
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
	protected MegalSwitch<Adapter> modelSwitch =
		new MegalSwitch<Adapter>() {
			@Override
			public Adapter caseMegamodel(Megamodel object) {
				return createMegamodelAdapter();
			}
			@Override
			public Adapter caseDecl(Decl object) {
				return createDeclAdapter();
			}
			@Override
			public Adapter caseNamedDecl(NamedDecl object) {
				return createNamedDeclAdapter();
			}
			@Override
			public Adapter caseETypeDecl(ETypeDecl object) {
				return createETypeDeclAdapter();
			}
			@Override
			public Adapter caseRTypeDecl(RTypeDecl object) {
				return createRTypeDeclAdapter();
			}
			@Override
			public Adapter caseEDecl(EDecl object) {
				return createEDeclAdapter();
			}
			@Override
			public Adapter caseRDecl(RDecl object) {
				return createRDeclAdapter();
			}
			@Override
			public Adapter caseEType(EType object) {
				return createETypeAdapter();
			}
			@Override
			public Adapter caseAppDecl(AppDecl object) {
				return createAppDeclAdapter();
			}
			@Override
			public Adapter caseFDecl(FDecl object) {
				return createFDeclAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.Decl <em>Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.Decl
	 * @generated
	 */
	public Adapter createDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.NamedDecl <em>Named Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.NamedDecl
	 * @generated
	 */
	public Adapter createNamedDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.ETypeDecl <em>EType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.ETypeDecl
	 * @generated
	 */
	public Adapter createETypeDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.RTypeDecl <em>RType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.RTypeDecl
	 * @generated
	 */
	public Adapter createRTypeDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.EDecl <em>EDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.EDecl
	 * @generated
	 */
	public Adapter createEDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.RDecl <em>RDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.RDecl
	 * @generated
	 */
	public Adapter createRDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.EType
	 * @generated
	 */
	public Adapter createETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.AppDecl <em>App Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.AppDecl
	 * @generated
	 */
	public Adapter createAppDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.model.FDecl <em>FDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.model.FDecl
	 * @generated
	 */
	public Adapter createFDeclAdapter() {
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

} //MegalAdapterFactory
