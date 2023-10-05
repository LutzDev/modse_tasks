/**
 */
package pertiNetz2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pertiNetz2.Transition#getName <em>Name</em>}</li>
 *   <li>{@link pertiNetz2.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link pertiNetz2.Transition#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see pertiNetz2.PertiNetz2Package#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonEmptyName nonEmptyInput nonEmptyOutput'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nonEmptyName='self.name.size()&gt;0' nonEmptyInput='self.input-&gt;size()&gt; 0' nonEmptyOutput='self.output-&gt;size()&gt; 0'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pertiNetz2.PertiNetz2Package#getTransition_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pertiNetz2.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link pertiNetz2.Stelle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see pertiNetz2.PertiNetz2Package#getTransition_Input()
	 * @model required="true"
	 * @generated
	 */
	EList<Stelle> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link pertiNetz2.Stelle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see pertiNetz2.PertiNetz2Package#getTransition_Output()
	 * @model required="true"
	 * @generated
	 */
	EList<Stelle> getOutput();

} // Transition
