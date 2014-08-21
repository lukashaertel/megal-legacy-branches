/**
 */
package org.softlang.megal.megamodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.softlang.megal.megamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.softlang.megal.megamodel.MegamodelPackage
 * @generated
 */
public class MegamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MegamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MegamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MegamodelPackage.eINSTANCE;
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
	protected MegamodelSwitch<Adapter> modelSwitch =
		new MegamodelSwitch<Adapter>() {
			@Override
			public Adapter caseMegamodel(Megamodel object) {
				return createMegamodelAdapter();
			}
			@Override
			public Adapter caseDeclGroup(DeclGroup object) {
				return createDeclGroupAdapter();
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
			public Adapter caseExETypeDeclGroup(ExETypeDeclGroup object) {
				return createExETypeDeclGroupAdapter();
			}
			@Override
			public Adapter caseExETypeDecl(ExETypeDecl object) {
				return createExETypeDeclAdapter();
			}
			@Override
			public Adapter caseExEType(ExEType object) {
				return createExETypeAdapter();
			}
			@Override
			public Adapter caseExRTypeDeclGroup(ExRTypeDeclGroup object) {
				return createExRTypeDeclGroupAdapter();
			}
			@Override
			public Adapter caseExRTypeDecl(ExRTypeDecl object) {
				return createExRTypeDeclAdapter();
			}
			@Override
			public Adapter caseExEDeclGroup(ExEDeclGroup object) {
				return createExEDeclGroupAdapter();
			}
			@Override
			public Adapter caseExEDecl(ExEDecl object) {
				return createExEDeclAdapter();
			}
			@Override
			public Adapter caseExRDecl(ExRDecl object) {
				return createExRDeclAdapter();
			}
			@Override
			public Adapter caseExRDeclGroup(ExRDeclGroup object) {
				return createExRDeclGroupAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.Megamodel <em>Megamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.Megamodel
	 * @generated
	 */
	public Adapter createMegamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.DeclGroup <em>Decl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.DeclGroup
	 * @generated
	 */
	public Adapter createDeclGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ETypeDecl <em>EType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ETypeDecl
	 * @generated
	 */
	public Adapter createETypeDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.RTypeDecl <em>RType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.RTypeDecl
	 * @generated
	 */
	public Adapter createRTypeDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.EDecl <em>EDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.EDecl
	 * @generated
	 */
	public Adapter createEDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.RDecl <em>RDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.RDecl
	 * @generated
	 */
	public Adapter createRDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.EType
	 * @generated
	 */
	public Adapter createETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ExETypeDeclGroup <em>Ex EType Decl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ExETypeDeclGroup
	 * @generated
	 */
	public Adapter createExETypeDeclGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ExETypeDecl <em>Ex EType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ExETypeDecl
	 * @generated
	 */
	public Adapter createExETypeDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ExEType <em>Ex EType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ExEType
	 * @generated
	 */
	public Adapter createExETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ExRTypeDeclGroup <em>Ex RType Decl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ExRTypeDeclGroup
	 * @generated
	 */
	public Adapter createExRTypeDeclGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ExRTypeDecl <em>Ex RType Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ExRTypeDecl
	 * @generated
	 */
	public Adapter createExRTypeDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ExEDeclGroup <em>Ex EDecl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ExEDeclGroup
	 * @generated
	 */
	public Adapter createExEDeclGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ExEDecl <em>Ex EDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ExEDecl
	 * @generated
	 */
	public Adapter createExEDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ExRDecl <em>Ex RDecl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ExRDecl
	 * @generated
	 */
	public Adapter createExRDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.softlang.megal.megamodel.ExRDeclGroup <em>Ex RDecl Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.softlang.megal.megamodel.ExRDeclGroup
	 * @generated
	 */
	public Adapter createExRDeclGroupAdapter() {
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

} //MegamodelAdapterFactory
