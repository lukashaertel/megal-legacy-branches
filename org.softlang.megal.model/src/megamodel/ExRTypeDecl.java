/**
 */
package megamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex RType Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link megamodel.ExRTypeDecl#getExLeft <em>Ex Left</em>}</li>
 *   <li>{@link megamodel.ExRTypeDecl#getExRight <em>Ex Right</em>}</li>
 *   <li>{@link megamodel.ExRTypeDecl#getExName <em>Ex Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see megamodel.MegamodelPackage#getExRTypeDecl()
 * @model
 * @generated
 */
public interface ExRTypeDecl extends RTypeDecl {
	/**
	 * Returns the value of the '<em><b>Ex Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Left</em>' containment reference.
	 * @see #setExLeft(ExEType)
	 * @see megamodel.MegamodelPackage#getExRTypeDecl_ExLeft()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExEType getExLeft();

	/**
	 * Sets the value of the '{@link megamodel.ExRTypeDecl#getExLeft <em>Ex Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Left</em>' containment reference.
	 * @see #getExLeft()
	 * @generated
	 */
	void setExLeft(ExEType value);

	/**
	 * Returns the value of the '<em><b>Ex Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Right</em>' containment reference.
	 * @see #setExRight(ExEType)
	 * @see megamodel.MegamodelPackage#getExRTypeDecl_ExRight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExEType getExRight();

	/**
	 * Sets the value of the '{@link megamodel.ExRTypeDecl#getExRight <em>Ex Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Right</em>' containment reference.
	 * @see #getExRight()
	 * @generated
	 */
	void setExRight(ExEType value);

	/**
	 * Returns the value of the '<em><b>Ex Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Name</em>' attribute.
	 * @see #setExName(String)
	 * @see megamodel.MegamodelPackage#getExRTypeDecl_ExName()
	 * @model required="true"
	 * @generated
	 */
	String getExName();

	/**
	 * Sets the value of the '{@link megamodel.ExRTypeDecl#getExName <em>Ex Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Name</em>' attribute.
	 * @see #getExName()
	 * @generated
	 */
	void setExName(String value);

} // ExRTypeDecl
