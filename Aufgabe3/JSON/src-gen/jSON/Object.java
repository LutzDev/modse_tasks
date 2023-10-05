/**
 */
package jSON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jSON.Object#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see jSON.JSONPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Value {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link jSON.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see jSON.JSONPackage#getObject_Member()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMember();

} // Object
