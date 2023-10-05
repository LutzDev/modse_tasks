/**
 */
package pertiNetz2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import pertiNetz2.Marke;
import pertiNetz2.PertiNetz2Factory;
import pertiNetz2.PertiNetz2Package;
import pertiNetz2.Petrinetz;
import pertiNetz2.Stelle;
import pertiNetz2.Transition;
import pertiNetz2.util.PertiNetz2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PertiNetz2PackageImpl extends EPackageImpl implements PertiNetz2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stelleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petrinetzEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pertiNetz2.PertiNetz2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PertiNetz2PackageImpl() {
		super(eNS_URI, PertiNetz2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PertiNetz2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PertiNetz2Package init() {
		if (isInited)
			return (PertiNetz2Package) EPackage.Registry.INSTANCE.getEPackage(PertiNetz2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredPertiNetz2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		PertiNetz2PackageImpl thePertiNetz2Package = registeredPertiNetz2Package instanceof PertiNetz2PackageImpl
				? (PertiNetz2PackageImpl) registeredPertiNetz2Package
				: new PertiNetz2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePertiNetz2Package.createPackageContents();

		// Initialize created meta-data
		thePertiNetz2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(thePertiNetz2Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return PertiNetz2Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		thePertiNetz2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PertiNetz2Package.eNS_URI, thePertiNetz2Package);
		return thePertiNetz2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Input() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Output() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStelle() {
		return stelleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStelle_Name() {
		return (EAttribute) stelleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStelle_Marken() {
		return (EReference) stelleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarke() {
		return markeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetrinetz() {
		return petrinetzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetrinetz_Transition() {
		return (EReference) petrinetzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetrinetz_Stellen() {
		return (EReference) petrinetzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertiNetz2Factory getPertiNetz2Factory() {
		return (PertiNetz2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__NAME);
		createEReference(transitionEClass, TRANSITION__INPUT);
		createEReference(transitionEClass, TRANSITION__OUTPUT);

		stelleEClass = createEClass(STELLE);
		createEAttribute(stelleEClass, STELLE__NAME);
		createEReference(stelleEClass, STELLE__MARKEN);

		markeEClass = createEClass(MARKE);

		petrinetzEClass = createEClass(PETRINETZ);
		createEReference(petrinetzEClass, PETRINETZ__TRANSITION);
		createEReference(petrinetzEClass, PETRINETZ__STELLEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", "", 0, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Input(), this.getStelle(), null, "input", null, 1, -1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Output(), this.getStelle(), null, "output", null, 1, -1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stelleEClass, Stelle.class, "Stelle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStelle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stelle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStelle_Marken(), this.getMarke(), null, "marken", null, 0, -1, Stelle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(markeEClass, Marke.class, "Marke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(petrinetzEClass, Petrinetz.class, "Petrinetz", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetrinetz_Transition(), this.getTransition(), null, "transition", null, 0, -1,
				Petrinetz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetrinetz_Stellen(), this.getStelle(), null, "stellen", null, 0, -1, Petrinetz.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(transitionEClass, source,
				new String[] { "constraints", "nonEmptyName nonEmptyInput nonEmptyOutput" });
		addAnnotation(stelleEClass, source, new String[] { "constraints", "nonEmptyName" });
		addAnnotation(petrinetzEClass, source,
				new String[] { "constraints", "uniqueStelle uniqueTransition atLeastOneMarke accesableStelle" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(transitionEClass, source, new String[] { "nonEmptyName", "self.name.size()>0", "nonEmptyInput",
				"self.input->size()> 0", "nonEmptyOutput", "self.output->size()> 0" });
		addAnnotation(stelleEClass, source, new String[] { "nonEmptyName", "self.name.size()> 0" });
		addAnnotation(petrinetzEClass, source, new String[] { "uniqueStelle",
				"self.stellen->collect(name)->isUnique(t|t)", "uniqueTransition",
				"self.transition->collect(name)->isUnique(t|t)", "atLeastOneMarke",
				"self.stellen->collect(marken)->size()->sum()> 0", "accesableStelle",
				"\n\t\t\tself.stellen->asSet() = self.transition->collect(output)->asSet()->union(self.transition->collect(input)->asSet())" });
	}

} //PertiNetz2PackageImpl
