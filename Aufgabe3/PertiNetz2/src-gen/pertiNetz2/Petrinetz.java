/**
 */
package pertiNetz2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinetz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pertiNetz2.Petrinetz#getTransition <em>Transition</em>}</li>
 *   <li>{@link pertiNetz2.Petrinetz#getStellen <em>Stellen</em>}</li>
 * </ul>
 *
 * @see pertiNetz2.PertiNetz2Package#getPetrinetz()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueStelle uniqueTransition atLeastOneMarke accesableStelle'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueStelle='self.stellen-&gt;collect(name)-&gt;isUnique(t|t)' uniqueTransition='self.transition-&gt;collect(name)-&gt;isUnique(t|t)' atLeastOneMarke='self.stellen-&gt;collect(marken)-&gt;size()-&gt;sum()&gt; 0' accesableStelle='\n\t\t\tself.stellen-&gt;asSet() = self.transition-&gt;collect(output)-&gt;asSet()-&gt;union(self.transition-&gt;collect(input)-&gt;asSet())'"
 * @generated
 */
public interface Petrinetz extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link pertiNetz2.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see pertiNetz2.PertiNetz2Package#getPetrinetz_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Stellen</b></em>' containment reference list.
	 * The list contents are of type {@link pertiNetz2.Stelle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stellen</em>' containment reference list.
	 * @see pertiNetz2.PertiNetz2Package#getPetrinetz_Stellen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stelle> getStellen();

} // Petrinetz
