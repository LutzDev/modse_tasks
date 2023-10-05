/**
 */
package pertiNetz2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pertiNetz2.PertiNetz2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PertiNetz2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pertiNetz2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pertiNetz2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pertiNetz2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PertiNetz2Package eINSTANCE = pertiNetz2.impl.PertiNetz2PackageImpl.init();

	/**
	 * The meta object id for the '{@link pertiNetz2.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pertiNetz2.impl.TransitionImpl
	 * @see pertiNetz2.impl.PertiNetz2PackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pertiNetz2.impl.StelleImpl <em>Stelle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pertiNetz2.impl.StelleImpl
	 * @see pertiNetz2.impl.PertiNetz2PackageImpl#getStelle()
	 * @generated
	 */
	int STELLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STELLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Marken</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STELLE__MARKEN = 1;

	/**
	 * The number of structural features of the '<em>Stelle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STELLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stelle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STELLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pertiNetz2.impl.MarkeImpl <em>Marke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pertiNetz2.impl.MarkeImpl
	 * @see pertiNetz2.impl.PertiNetz2PackageImpl#getMarke()
	 * @generated
	 */
	int MARKE = 2;

	/**
	 * The number of structural features of the '<em>Marke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Marke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pertiNetz2.impl.PetrinetzImpl <em>Petrinetz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pertiNetz2.impl.PetrinetzImpl
	 * @see pertiNetz2.impl.PertiNetz2PackageImpl#getPetrinetz()
	 * @generated
	 */
	int PETRINETZ = 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETZ__TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Stellen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETZ__STELLEN = 1;

	/**
	 * The number of structural features of the '<em>Petrinetz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETZ_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Petrinetz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETZ_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pertiNetz2.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see pertiNetz2.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link pertiNetz2.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pertiNetz2.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference list '{@link pertiNetz2.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see pertiNetz2.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Input();

	/**
	 * Returns the meta object for the reference list '{@link pertiNetz2.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see pertiNetz2.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Output();

	/**
	 * Returns the meta object for class '{@link pertiNetz2.Stelle <em>Stelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stelle</em>'.
	 * @see pertiNetz2.Stelle
	 * @generated
	 */
	EClass getStelle();

	/**
	 * Returns the meta object for the attribute '{@link pertiNetz2.Stelle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pertiNetz2.Stelle#getName()
	 * @see #getStelle()
	 * @generated
	 */
	EAttribute getStelle_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pertiNetz2.Stelle#getMarken <em>Marken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Marken</em>'.
	 * @see pertiNetz2.Stelle#getMarken()
	 * @see #getStelle()
	 * @generated
	 */
	EReference getStelle_Marken();

	/**
	 * Returns the meta object for class '{@link pertiNetz2.Marke <em>Marke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marke</em>'.
	 * @see pertiNetz2.Marke
	 * @generated
	 */
	EClass getMarke();

	/**
	 * Returns the meta object for class '{@link pertiNetz2.Petrinetz <em>Petrinetz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinetz</em>'.
	 * @see pertiNetz2.Petrinetz
	 * @generated
	 */
	EClass getPetrinetz();

	/**
	 * Returns the meta object for the containment reference list '{@link pertiNetz2.Petrinetz#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see pertiNetz2.Petrinetz#getTransition()
	 * @see #getPetrinetz()
	 * @generated
	 */
	EReference getPetrinetz_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link pertiNetz2.Petrinetz#getStellen <em>Stellen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stellen</em>'.
	 * @see pertiNetz2.Petrinetz#getStellen()
	 * @see #getPetrinetz()
	 * @generated
	 */
	EReference getPetrinetz_Stellen();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PertiNetz2Factory getPertiNetz2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pertiNetz2.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pertiNetz2.impl.TransitionImpl
		 * @see pertiNetz2.impl.PertiNetz2PackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '{@link pertiNetz2.impl.StelleImpl <em>Stelle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pertiNetz2.impl.StelleImpl
		 * @see pertiNetz2.impl.PertiNetz2PackageImpl#getStelle()
		 * @generated
		 */
		EClass STELLE = eINSTANCE.getStelle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STELLE__NAME = eINSTANCE.getStelle_Name();

		/**
		 * The meta object literal for the '<em><b>Marken</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STELLE__MARKEN = eINSTANCE.getStelle_Marken();

		/**
		 * The meta object literal for the '{@link pertiNetz2.impl.MarkeImpl <em>Marke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pertiNetz2.impl.MarkeImpl
		 * @see pertiNetz2.impl.PertiNetz2PackageImpl#getMarke()
		 * @generated
		 */
		EClass MARKE = eINSTANCE.getMarke();

		/**
		 * The meta object literal for the '{@link pertiNetz2.impl.PetrinetzImpl <em>Petrinetz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pertiNetz2.impl.PetrinetzImpl
		 * @see pertiNetz2.impl.PertiNetz2PackageImpl#getPetrinetz()
		 * @generated
		 */
		EClass PETRINETZ = eINSTANCE.getPetrinetz();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRINETZ__TRANSITION = eINSTANCE.getPetrinetz_Transition();

		/**
		 * The meta object literal for the '<em><b>Stellen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRINETZ__STELLEN = eINSTANCE.getPetrinetz_Stellen();

	}

} //PertiNetz2Package
