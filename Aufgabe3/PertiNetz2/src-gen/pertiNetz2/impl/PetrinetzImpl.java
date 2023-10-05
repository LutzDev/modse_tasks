/**
 */
package pertiNetz2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pertiNetz2.PertiNetz2Package;
import pertiNetz2.Petrinetz;
import pertiNetz2.Stelle;
import pertiNetz2.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petrinetz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pertiNetz2.impl.PetrinetzImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link pertiNetz2.impl.PetrinetzImpl#getStellen <em>Stellen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PetrinetzImpl extends MinimalEObjectImpl.Container implements Petrinetz {
	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getStellen() <em>Stellen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStellen()
	 * @generated
	 * @ordered
	 */
	protected EList<Stelle> stellen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetrinetzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PertiNetz2Package.Literals.PETRINETZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this,
					PertiNetz2Package.PETRINETZ__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stelle> getStellen() {
		if (stellen == null) {
			stellen = new EObjectContainmentEList<Stelle>(Stelle.class, this, PertiNetz2Package.PETRINETZ__STELLEN);
		}
		return stellen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PertiNetz2Package.PETRINETZ__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
		case PertiNetz2Package.PETRINETZ__STELLEN:
			return ((InternalEList<?>) getStellen()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PertiNetz2Package.PETRINETZ__TRANSITION:
			return getTransition();
		case PertiNetz2Package.PETRINETZ__STELLEN:
			return getStellen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PertiNetz2Package.PETRINETZ__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case PertiNetz2Package.PETRINETZ__STELLEN:
			getStellen().clear();
			getStellen().addAll((Collection<? extends Stelle>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PertiNetz2Package.PETRINETZ__TRANSITION:
			getTransition().clear();
			return;
		case PertiNetz2Package.PETRINETZ__STELLEN:
			getStellen().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PertiNetz2Package.PETRINETZ__TRANSITION:
			return transition != null && !transition.isEmpty();
		case PertiNetz2Package.PETRINETZ__STELLEN:
			return stellen != null && !stellen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PetrinetzImpl
