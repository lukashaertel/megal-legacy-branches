/**
 */
package org.softlang.megal.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.softlang.megal.model.Declaration#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getRelationTypes <em>Relation Types</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getSugar <em>Sugar</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getOverrideName <em>Override Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getImports <em>Imports</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.softlang.megal.model.ModelPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends AbstractPart {
	/**
	 * Returns the value of the '<em><b>Entity Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Types</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_EntityTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityType> getEntityTypes();

	/**
	 * Returns the value of the '<em><b>Relation Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Types</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_RelationTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationType> getRelationTypes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Sugar</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.Sugar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sugar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sugar</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_Sugar()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sugar> getSugar();

	/**
	 * Returns the value of the '<em><b>Override Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Name</em>' attribute.
	 * @see #setOverrideName(String)
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_OverrideName()
	 * @model
	 * @generated
	 */
	String getOverrideName();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Declaration#getOverrideName <em>Override Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Name</em>' attribute.
	 * @see #getOverrideName()
	 * @generated
	 */
	void setOverrideName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.AbstractDeclarationRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractDeclarationRef> getImports();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprectated field for legacy support
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link org.softlang.megal.model.Declaration#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

} // Declaration
