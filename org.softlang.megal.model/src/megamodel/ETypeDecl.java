/**
 */
package megamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link megamodel.ETypeDecl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link megamodel.ETypeDecl#getName <em>Name</em>}</li>
 *   <li>{@link megamodel.ETypeDecl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see megamodel.MegamodelPackage#getETypeDecl()
 * @model abstract="true"
 * @generated
 */
public interface ETypeDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference.
	 * @see megamodel.MegamodelPackage#getETypeDecl_Supertype()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EType getSupertype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see megamodel.MegamodelPackage#getETypeDecl_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Args</b></em>' reference list.
	 * The list contents are of type {@link megamodel.EType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' reference list.
	 * @see megamodel.MegamodelPackage#getETypeDecl_Args()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EType> getArgs();

} // ETypeDecl
