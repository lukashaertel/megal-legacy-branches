/**
 */
package org.softlang.megal.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.softlang.megal.model.Declaration;
import org.softlang.megal.model.Entity;
import org.softlang.megal.model.EntityType;
import org.softlang.megal.model.ModelPackage;
import org.softlang.megal.model.Relation;
import org.softlang.megal.model.RelationType;
import org.softlang.megal.model.Sugar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getRelationTypes <em>Relation Types</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getSugar <em>Sugar</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getOverrideName <em>Override Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getImportedEntities <em>Imported Entities</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getImportedRelationTypes <em>Imported Relation Types</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getImportedRelations <em>Imported Relations</em>}</li>
 *   <li>{@link org.softlang.megal.model.impl.DeclarationImpl#getImportedEntityTypes <em>Imported Entity Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationImpl extends AbstractPartImpl implements Declaration {
	/**
	 * The cached value of the '{@link #getEntityTypes() <em>Entity Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> entityTypes;

	/**
	 * The cached value of the '{@link #getRelationTypes() <em>Relation Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationType> relationTypes;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getSugar() <em>Sugar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSugar()
	 * @generated
	 * @ordered
	 */
	protected EList<Sugar> sugar;

	/**
	 * The default value of the '{@link #getOverrideName() <em>Override Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideName()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverrideName() <em>Override Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideName()
	 * @generated
	 * @ordered
	 */
	protected String overrideName = OVERRIDE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected String configuration = CONFIGURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> imports;

	/**
	 * The cached setting delegate for the '{@link #getImportedEntities() <em>Imported Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedEntities()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IMPORTED_ENTITIES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.DECLARATION__IMPORTED_ENTITIES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getImportedRelationTypes() <em>Imported Relation Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedRelationTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IMPORTED_RELATION_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.DECLARATION__IMPORTED_RELATION_TYPES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getImportedRelations() <em>Imported Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedRelations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IMPORTED_RELATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.DECLARATION__IMPORTED_RELATIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getImportedEntityTypes() <em>Imported Entity Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedEntityTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IMPORTED_ENTITY_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ModelPackage.Literals.DECLARATION__IMPORTED_ENTITY_TYPES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getEntityTypes() {
		if (entityTypes == null) {
			entityTypes = new EObjectContainmentEList<EntityType>(EntityType.class, this, ModelPackage.DECLARATION__ENTITY_TYPES);
		}
		return entityTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationType> getRelationTypes() {
		if (relationTypes == null) {
			relationTypes = new EObjectContainmentEList<RelationType>(RelationType.class, this, ModelPackage.DECLARATION__RELATION_TYPES);
		}
		return relationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, ModelPackage.DECLARATION__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, ModelPackage.DECLARATION__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sugar> getSugar() {
		if (sugar == null) {
			sugar = new EObjectContainmentEList<Sugar>(Sugar.class, this, ModelPackage.DECLARATION__SUGAR);
		}
		return sugar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverrideName() {
		return overrideName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideName(String newOverrideName) {
		String oldOverrideName = overrideName;
		overrideName = newOverrideName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DECLARATION__OVERRIDE_NAME, oldOverrideName, overrideName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if (getOverrideName() != null)
			return getOverrideName();

		if (eResource() != null) {
			URI uri = eResource().getURI();

			String ls = uri.lastSegment();
			String ex = uri.fileExtension();

			String name = ls.substring(0, ls.length() - ex.length());

			return StringExtensions.toFirstUpper(name);
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(String newConfiguration) {
		String oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DECLARATION__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<Declaration>(Declaration.class, this, ModelPackage.DECLARATION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getImportedEntities() {
		return (EList<Entity>)IMPORTED_ENTITIES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RelationType> getImportedRelationTypes() {
		return (EList<RelationType>)IMPORTED_RELATION_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relation> getImportedRelations() {
		return (EList<Relation>)IMPORTED_RELATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EntityType> getImportedEntityTypes() {
		return (EList<EntityType>)IMPORTED_ENTITY_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DECLARATION__ENTITY_TYPES:
				return ((InternalEList<?>)getEntityTypes()).basicRemove(otherEnd, msgs);
			case ModelPackage.DECLARATION__RELATION_TYPES:
				return ((InternalEList<?>)getRelationTypes()).basicRemove(otherEnd, msgs);
			case ModelPackage.DECLARATION__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.DECLARATION__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case ModelPackage.DECLARATION__SUGAR:
				return ((InternalEList<?>)getSugar()).basicRemove(otherEnd, msgs);
			case ModelPackage.DECLARATION__IMPORTED_ENTITIES:
				return ((InternalEList<?>)getImportedEntities()).basicRemove(otherEnd, msgs);
			case ModelPackage.DECLARATION__IMPORTED_RELATION_TYPES:
				return ((InternalEList<?>)getImportedRelationTypes()).basicRemove(otherEnd, msgs);
			case ModelPackage.DECLARATION__IMPORTED_RELATIONS:
				return ((InternalEList<?>)getImportedRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.DECLARATION__IMPORTED_ENTITY_TYPES:
				return ((InternalEList<?>)getImportedEntityTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DECLARATION__ENTITY_TYPES:
				return getEntityTypes();
			case ModelPackage.DECLARATION__RELATION_TYPES:
				return getRelationTypes();
			case ModelPackage.DECLARATION__RELATIONS:
				return getRelations();
			case ModelPackage.DECLARATION__ENTITIES:
				return getEntities();
			case ModelPackage.DECLARATION__SUGAR:
				return getSugar();
			case ModelPackage.DECLARATION__OVERRIDE_NAME:
				return getOverrideName();
			case ModelPackage.DECLARATION__NAME:
				return getName();
			case ModelPackage.DECLARATION__CONFIGURATION:
				return getConfiguration();
			case ModelPackage.DECLARATION__IMPORTS:
				return getImports();
			case ModelPackage.DECLARATION__IMPORTED_ENTITIES:
				return getImportedEntities();
			case ModelPackage.DECLARATION__IMPORTED_RELATION_TYPES:
				return getImportedRelationTypes();
			case ModelPackage.DECLARATION__IMPORTED_RELATIONS:
				return getImportedRelations();
			case ModelPackage.DECLARATION__IMPORTED_ENTITY_TYPES:
				return getImportedEntityTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.DECLARATION__ENTITY_TYPES:
				getEntityTypes().clear();
				getEntityTypes().addAll((Collection<? extends EntityType>)newValue);
				return;
			case ModelPackage.DECLARATION__RELATION_TYPES:
				getRelationTypes().clear();
				getRelationTypes().addAll((Collection<? extends RelationType>)newValue);
				return;
			case ModelPackage.DECLARATION__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case ModelPackage.DECLARATION__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ModelPackage.DECLARATION__SUGAR:
				getSugar().clear();
				getSugar().addAll((Collection<? extends Sugar>)newValue);
				return;
			case ModelPackage.DECLARATION__OVERRIDE_NAME:
				setOverrideName((String)newValue);
				return;
			case ModelPackage.DECLARATION__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case ModelPackage.DECLARATION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Declaration>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.DECLARATION__ENTITY_TYPES:
				getEntityTypes().clear();
				return;
			case ModelPackage.DECLARATION__RELATION_TYPES:
				getRelationTypes().clear();
				return;
			case ModelPackage.DECLARATION__RELATIONS:
				getRelations().clear();
				return;
			case ModelPackage.DECLARATION__ENTITIES:
				getEntities().clear();
				return;
			case ModelPackage.DECLARATION__SUGAR:
				getSugar().clear();
				return;
			case ModelPackage.DECLARATION__OVERRIDE_NAME:
				setOverrideName(OVERRIDE_NAME_EDEFAULT);
				return;
			case ModelPackage.DECLARATION__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case ModelPackage.DECLARATION__IMPORTS:
				getImports().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.DECLARATION__ENTITY_TYPES:
				return entityTypes != null && !entityTypes.isEmpty();
			case ModelPackage.DECLARATION__RELATION_TYPES:
				return relationTypes != null && !relationTypes.isEmpty();
			case ModelPackage.DECLARATION__RELATIONS:
				return relations != null && !relations.isEmpty();
			case ModelPackage.DECLARATION__ENTITIES:
				return entities != null && !entities.isEmpty();
			case ModelPackage.DECLARATION__SUGAR:
				return sugar != null && !sugar.isEmpty();
			case ModelPackage.DECLARATION__OVERRIDE_NAME:
				return OVERRIDE_NAME_EDEFAULT == null ? overrideName != null : !OVERRIDE_NAME_EDEFAULT.equals(overrideName);
			case ModelPackage.DECLARATION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ModelPackage.DECLARATION__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case ModelPackage.DECLARATION__IMPORTS:
				return imports != null && !imports.isEmpty();
			case ModelPackage.DECLARATION__IMPORTED_ENTITIES:
				return IMPORTED_ENTITIES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ModelPackage.DECLARATION__IMPORTED_RELATION_TYPES:
				return IMPORTED_RELATION_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ModelPackage.DECLARATION__IMPORTED_RELATIONS:
				return IMPORTED_RELATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ModelPackage.DECLARATION__IMPORTED_ENTITY_TYPES:
				return IMPORTED_ENTITY_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (overrideName: ");
		result.append(overrideName);
		result.append(", configuration: ");
		result.append(configuration);
		result.append(')');
		return result.toString();
	}

} //DeclarationImpl
