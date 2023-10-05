/**
 */
package pertiNetz2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pertiNetz2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PertiNetz2FactoryImpl extends EFactoryImpl implements PertiNetz2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PertiNetz2Factory init() {
		try {
			PertiNetz2Factory thePertiNetz2Factory = (PertiNetz2Factory) EPackage.Registry.INSTANCE
					.getEFactory(PertiNetz2Package.eNS_URI);
			if (thePertiNetz2Factory != null) {
				return thePertiNetz2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PertiNetz2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertiNetz2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PertiNetz2Package.TRANSITION:
			return createTransition();
		case PertiNetz2Package.STELLE:
			return createStelle();
		case PertiNetz2Package.MARKE:
			return createMarke();
		case PertiNetz2Package.PETRINETZ:
			return createPetrinetz();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stelle createStelle() {
		StelleImpl stelle = new StelleImpl();
		return stelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marke createMarke() {
		MarkeImpl marke = new MarkeImpl();
		return marke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetz createPetrinetz() {
		PetrinetzImpl petrinetz = new PetrinetzImpl();
		return petrinetz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PertiNetz2Package getPertiNetz2Package() {
		return (PertiNetz2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PertiNetz2Package getPackage() {
		return PertiNetz2Package.eINSTANCE;
	}

} //PertiNetz2FactoryImpl
