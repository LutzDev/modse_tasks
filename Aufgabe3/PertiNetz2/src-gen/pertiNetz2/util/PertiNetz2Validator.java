/**
 */
package pertiNetz2.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pertiNetz2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pertiNetz2.PertiNetz2Package
 * @generated
 */
public class PertiNetz2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PertiNetz2Validator INSTANCE = new PertiNetz2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pertiNetz2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertiNetz2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return PertiNetz2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case PertiNetz2Package.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case PertiNetz2Package.STELLE:
			return validateStelle((Stelle) value, diagnostics, context);
		case PertiNetz2Package.MARKE:
			return validateMarke((Marke) value, diagnostics, context);
		case PertiNetz2Package.PETRINETZ:
			return validatePetrinetz((Petrinetz) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransition_nonEmptyName(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransition_nonEmptyInput(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransition_nonEmptyOutput(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonEmptyName constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__NON_EMPTY_NAME__EEXPRESSION = "self.name.size()>0";

	/**
	 * Validates the nonEmptyName constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_nonEmptyName(Transition transition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PertiNetz2Package.Literals.TRANSITION, transition, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nonEmptyName",
				TRANSITION__NON_EMPTY_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nonEmptyInput constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__NON_EMPTY_INPUT__EEXPRESSION = "self.input->size()> 0";

	/**
	 * Validates the nonEmptyInput constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_nonEmptyInput(Transition transition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PertiNetz2Package.Literals.TRANSITION, transition, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nonEmptyInput",
				TRANSITION__NON_EMPTY_INPUT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nonEmptyOutput constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__NON_EMPTY_OUTPUT__EEXPRESSION = "self.output->size()> 0";

	/**
	 * Validates the nonEmptyOutput constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_nonEmptyOutput(Transition transition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PertiNetz2Package.Literals.TRANSITION, transition, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nonEmptyOutput",
				TRANSITION__NON_EMPTY_OUTPUT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStelle(Stelle stelle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stelle, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(stelle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(stelle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(stelle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(stelle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(stelle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(stelle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(stelle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(stelle, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStelle_nonEmptyName(stelle, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonEmptyName constraint of '<em>Stelle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STELLE__NON_EMPTY_NAME__EEXPRESSION = "self.name.size()> 0";

	/**
	 * Validates the nonEmptyName constraint of '<em>Stelle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStelle_nonEmptyName(Stelle stelle, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PertiNetz2Package.Literals.STELLE, stelle, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nonEmptyName", STELLE__NON_EMPTY_NAME__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarke(Marke marke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(marke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetrinetz(Petrinetz petrinetz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(petrinetz, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetrinetz_uniqueStelle(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetrinetz_uniqueTransition(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetrinetz_atLeastOneMarke(petrinetz, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetrinetz_accesableStelle(petrinetz, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueStelle constraint of '<em>Petrinetz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRINETZ__UNIQUE_STELLE__EEXPRESSION = "self.stellen->collect(name)->isUnique(t|t)";

	/**
	 * Validates the uniqueStelle constraint of '<em>Petrinetz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetrinetz_uniqueStelle(Petrinetz petrinetz, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PertiNetz2Package.Literals.PETRINETZ, petrinetz, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueStelle",
				PETRINETZ__UNIQUE_STELLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the uniqueTransition constraint of '<em>Petrinetz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRINETZ__UNIQUE_TRANSITION__EEXPRESSION = "self.transition->collect(name)->isUnique(t|t)";

	/**
	 * Validates the uniqueTransition constraint of '<em>Petrinetz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetrinetz_uniqueTransition(Petrinetz petrinetz, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PertiNetz2Package.Literals.PETRINETZ, petrinetz, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "uniqueTransition",
				PETRINETZ__UNIQUE_TRANSITION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the atLeastOneMarke constraint of '<em>Petrinetz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRINETZ__AT_LEAST_ONE_MARKE__EEXPRESSION = "self.stellen->collect(marken)->size()->sum()> 0";

	/**
	 * Validates the atLeastOneMarke constraint of '<em>Petrinetz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetrinetz_atLeastOneMarke(Petrinetz petrinetz, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PertiNetz2Package.Literals.PETRINETZ, petrinetz, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "atLeastOneMarke",
				PETRINETZ__AT_LEAST_ONE_MARKE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the accesableStelle constraint of '<em>Petrinetz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRINETZ__ACCESABLE_STELLE__EEXPRESSION = "\n"
			+ "\t\t\tself.stellen->asSet() = self.transition->collect(output)->asSet()->union(self.transition->collect(input)->asSet())";

	/**
	 * Validates the accesableStelle constraint of '<em>Petrinetz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetrinetz_accesableStelle(Petrinetz petrinetz, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PertiNetz2Package.Literals.PETRINETZ, petrinetz, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "accesableStelle",
				PETRINETZ__ACCESABLE_STELLE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PertiNetz2Validator
