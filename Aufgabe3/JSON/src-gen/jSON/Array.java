/**
 */
package jSON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jSON.Array#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see jSON.JSONPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link jSON.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see jSON.JSONPackage#getArray_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Value> getValue();

} // Array
