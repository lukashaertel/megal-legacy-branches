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
 *   <li>{@link org.softlang.megal.model.Declaration#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getImports <em>Imports</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getImportedEntities <em>Imported Entities</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getImportedRelationTypes <em>Imported Relation Types</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getImportedRelations <em>Imported Relations</em>}</li>
 *   <li>{@link org.softlang.megal.model.Declaration#getImportedEntityTypes <em>Imported Entity Types</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link org.softlang.megal.model.Declaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_Imports()
	 * @model
	 * @generated
	 */
	EList<Declaration> getImports();

	/**
	 * Returns the value of the '<em><b>Imported Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Entities</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_ImportedEntities()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='org.softlang.megal.query.importedEntities'"
	 * @generated
	 */
	EList<Entity> getImportedEntities();

	/**
	 * Returns the value of the '<em><b>Imported Relation Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Relation Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Relation Types</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_ImportedRelationTypes()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='org.softlang.megal.query.importedRelationTypes'"
	 * @generated
	 */
	EList<RelationType> getImportedRelationTypes();

	/**
	 * Returns the value of the '<em><b>Imported Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Relations</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_ImportedRelations()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='org.softlang.megal.query.importedRelations'"
	 * @generated
	 */
	EList<Relation> getImportedRelations();

	/**
	 * Returns the value of the '<em><b>Imported Entity Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.softlang.megal.model.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Entity Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Entity Types</em>' containment reference list.
	 * @see org.softlang.megal.model.ModelPackage#getDeclaration_ImportedEntityTypes()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='org.softlang.megal.query.importedEntityTypes'"
	 * @generated
	 */
	EList<EntityType> getImportedEntityTypes();

} // Declaration
