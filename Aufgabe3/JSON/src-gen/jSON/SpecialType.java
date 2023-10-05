/**
 */
package jSON;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jSON.SpecialType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jSON.JSONPackage#getSpecialType()
 * @model
 * @generated
 */
public interface SpecialType extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link jSON.SpecialTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see jSON.SpecialTypes
	 * @see #setValue(SpecialTypes)
	 * @see jSON.JSONPackage#getSpecialType_Value()
	 * @model
	 * @generated
	 */
	SpecialTypes getValue();

	/**
	 * Sets the value of the '{@link jSON.SpecialType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see jSON.SpecialTypes
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SpecialTypes value);

} // SpecialType
