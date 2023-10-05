/**
 */
package pertiNetz2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pertiNetz2.PertiNetz2Package
 * @generated
 */
public interface PertiNetz2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PertiNetz2Factory eINSTANCE = pertiNetz2.impl.PertiNetz2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Stelle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stelle</em>'.
	 * @generated
	 */
	Stelle createStelle();

	/**
	 * Returns a new object of class '<em>Marke</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marke</em>'.
	 * @generated
	 */
	Marke createMarke();

	/**
	 * Returns a new object of class '<em>Petrinetz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petrinetz</em>'.
	 * @generated
	 */
	Petrinetz createPetrinetz();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PertiNetz2Package getPertiNetz2Package();

} //PertiNetz2Factory
