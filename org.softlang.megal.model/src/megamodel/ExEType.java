/**
 */
package megamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex EType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link megamodel.ExEType#getExDef <em>Ex Def</em>}</li>
 *   <li>{@link megamodel.ExEType#getExArgs <em>Ex Args</em>}</li>
 *   <li>{@link megamodel.ExEType#isExIsMany <em>Ex Is Many</em>}</li>
 * </ul>
 * </p>
 *
 * @see megamodel.MegamodelPackage#getExEType()
 * @model
 * @generated
 */
public interface ExEType extends EType {
	/**
	 * Returns the value of the '<em><b>Ex Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Def</em>' reference.
	 * @see #setExDef(ETypeDecl)
	 * @see megamodel.MegamodelPackage#getExEType_ExDef()
	 * @model required="true"
	 * @generated
	 */
	ETypeDecl getExDef();

	/**
	 * Sets the value of the '{@link megamodel.ExEType#getExDef <em>Ex Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Def</em>' reference.
	 * @see #getExDef()
	 * @generated
	 */
	void setExDef(ETypeDecl value);

	/**
	 * Returns the value of the '<em><b>Ex Args</b></em>' containment reference list.
	 * The list contents are of type {@link megamodel.ExEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Args</em>' containment reference list.
	 * @see megamodel.MegamodelPackage#getExEType_ExArgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExEType> getExArgs();

	/**
	 * Returns the value of the '<em><b>Ex Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Is Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Is Many</em>' attribute.
	 * @see #setExIsMany(boolean)
	 * @see megamodel.MegamodelPackage#getExEType_ExIsMany()
	 * @model required="true"
	 * @generated
	 */
	boolean isExIsMany();

	/**
	 * Sets the value of the '{@link megamodel.ExEType#isExIsMany <em>Ex Is Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Is Many</em>' attribute.
	 * @see #isExIsMany()
	 * @generated
	 */
	void setExIsMany(boolean value);

} // ExEType
