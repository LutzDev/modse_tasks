/**
 */
package pertiNetz2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pertiNetz2.Stelle#getName <em>Name</em>}</li>
 *   <li>{@link pertiNetz2.Stelle#getMarken <em>Marken</em>}</li>
 * </ul>
 *
 * @see pertiNetz2.PertiNetz2Package#getStelle()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonEmptyName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nonEmptyName='self.name.size()&gt; 0'"
 * @generated
 */
public interface Stelle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pertiNetz2.PertiNetz2Package#getStelle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pertiNetz2.Stelle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Marken</b></em>' containment reference list.
	 * The list contents are of type {@link pertiNetz2.Marke}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marken</em>' containment reference list.
	 * @see pertiNetz2.PertiNetz2Package#getStelle_Marken()
	 * @model containment="true"
	 * @generated
	 */
	EList<Marke> getMarken();

} // Stelle
