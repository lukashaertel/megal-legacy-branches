/**
 */
package org.softlang.megal.megamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.megamodel.EType#getDef <em>Def</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.EType#getArgs <em>Args</em>}</li>
 *   <li>{@link org.softlang.megal.megamodel.EType#isIsMany <em>Is Many</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.megamodel.MegamodelPackage#getEType()
 * @model abstract="true"
 * @generated
 */
public interface EType extends EObject {
	/**
	 * Returns the value of the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' reference.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getEType_Def()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ETypeDecl getDef();

	/**
	 * Returns the value of the '<em><b>Args</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.megamodel.EType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' reference list.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getEType_Args()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EType> getArgs();

	/**
	 * Returns the value of the '<em><b>Is Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Many</em>' attribute.
	 * @see org.softlang.megal.megamodel.MegamodelPackage#getEType_IsMany()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsMany();

} // EType
