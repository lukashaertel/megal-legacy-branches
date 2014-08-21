/**
 */
package megamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Megamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link megamodel.Megamodel#getDecls <em>Decls</em>}</li>
 *   <li>{@link megamodel.Megamodel#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see megamodel.MegamodelPackage#getMegamodel()
 * @model
 * @generated
 */
public interface Megamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Decls</b></em>' containment reference list.
	 * The list contents are of type {@link megamodel.DeclGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decls</em>' containment reference list.
	 * @see megamodel.MegamodelPackage#getMegamodel_Decls()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeclGroup> getDecls();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link megamodel.Megamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see megamodel.MegamodelPackage#getMegamodel_Imports()
	 * @model
	 * @generated
	 */
	EList<Megamodel> getImports();

} // Megamodel
