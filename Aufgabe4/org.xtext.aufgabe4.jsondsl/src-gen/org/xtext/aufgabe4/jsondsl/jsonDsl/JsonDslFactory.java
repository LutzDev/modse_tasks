/**
 * generated by Xtext 2.25.0
 */
package org.xtext.aufgabe4.jsondsl.jsonDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.aufgabe4.jsondsl.jsonDsl.JsonDslPackage
 * @generated
 */
public interface JsonDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonDslFactory eINSTANCE = org.xtext.aufgabe4.jsondsl.jsonDsl.impl.JsonDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>JSON Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Document</em>'.
   * @generated
   */
  JSON_Document createJSON_Document();

  /**
   * Returns a new object of class '<em>JSON Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Value</em>'.
   * @generated
   */
  JSON_Value createJSON_Value();

  /**
   * Returns a new object of class '<em>JSON Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Array</em>'.
   * @generated
   */
  JSON_Array createJSON_Array();

  /**
   * Returns a new object of class '<em>JSON String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON String</em>'.
   * @generated
   */
  JSON_String createJSON_String();

  /**
   * Returns a new object of class '<em>JSON Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Boolean</em>'.
   * @generated
   */
  JSON_Boolean createJSON_Boolean();

  /**
   * Returns a new object of class '<em>JSON Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Number</em>'.
   * @generated
   */
  JSON_Number createJSON_Number();

  /**
   * Returns a new object of class '<em>JSON Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Member</em>'.
   * @generated
   */
  JSON_Member createJSON_Member();

  /**
   * Returns a new object of class '<em>JSON Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON Object</em>'.
   * @generated
   */
  JSON_Object createJSON_Object();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JsonDslPackage getJsonDslPackage();

} //JsonDslFactory
