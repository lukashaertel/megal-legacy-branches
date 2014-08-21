/**
 */
package megamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDecl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link megamodel.EDecl#getType <em>Type</em>}</li>
 *   <li>{@link megamodel.EDecl#getName <em>Name</em>}</li>
 *   <li>{@link megamodel.EDecl#getShowname <em>Showname</em>}</li>
 *   <li>{@link megamodel.EDecl#isIsParameter <em>Is Parameter</em>}</li>
 *   <li>{@link megamodel.EDecl#isIsDependent <em>Is Dependent</em>}</li>
 * </ul>
 * </p>
 *
 * @see megamodel.MegamodelPackage#getEDecl()
 * @model abstract="true"
 * @generated
 */
public interface EDecl extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see megamodel.MegamodelPackage#getEDecl_Type()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EType getType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see megamodel.MegamodelPackage#getEDecl_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Showname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Showname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Showname</em>' attribute.
	 * @see megamodel.MegamodelPackage#getEDecl_Showname()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getShowname();

	/**
	 * Returns the value of the '<em><b>Is Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Parameter</em>' attribute.
	 * @see megamodel.MegamodelPackage#getEDecl_IsParameter()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsParameter();

	/**
	 * Returns the value of the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dependent</em>' attribute.
	 * @see megamodel.MegamodelPackage#getEDecl_IsDependent()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsDependent();

} // EDecl
