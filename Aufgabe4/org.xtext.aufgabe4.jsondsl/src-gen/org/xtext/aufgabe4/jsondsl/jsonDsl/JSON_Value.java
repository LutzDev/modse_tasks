/**
 * generated by Xtext 2.25.0
 */
package org.xtext.aufgabe4.jsondsl.jsonDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.aufgabe4.jsondsl.jsonDsl.JSON_Value#getJson_value <em>Json value</em>}</li>
 * </ul>
 *
 * @see org.xtext.aufgabe4.jsondsl.jsonDsl.JsonDslPackage#getJSON_Value()
 * @model
 * @generated
 */
public interface JSON_Value extends EObject
{
  /**
   * Returns the value of the '<em><b>Json value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json value</em>' containment reference.
   * @see #setJson_value(EObject)
   * @see org.xtext.aufgabe4.jsondsl.jsonDsl.JsonDslPackage#getJSON_Value_Json_value()
   * @model containment="true"
   * @generated
   */
  EObject getJson_value();

  /**
   * Sets the value of the '{@link org.xtext.aufgabe4.jsondsl.jsonDsl.JSON_Value#getJson_value <em>Json value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json value</em>' containment reference.
   * @see #getJson_value()
   * @generated
   */
  void setJson_value(EObject value);

} // JSON_Value
