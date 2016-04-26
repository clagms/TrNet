/**
 */
package trnet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tr Net Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnet.TrNetModel#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link trnet.TrNetModel#getOperators <em>Operators</em>}</li>
 *   <li>{@link trnet.TrNetModel#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnet.TrnetPackage#getTrNetModel()
 * @model
 * @generated
 */
public interface TrNetModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
   * The list contents are of type {@link trnet.Pattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' containment reference list.
   * @see trnet.TrnetPackage#getTrNetModel_Patterns()
   * @model containment="true"
   * @generated
   */
  EList<Pattern> getPatterns();

  /**
   * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
   * The list contents are of type {@link trnet.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' containment reference list.
   * @see trnet.TrnetPackage#getTrNetModel_Operators()
   * @model containment="true"
   * @generated
   */
  EList<Operator> getOperators();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see trnet.TrnetPackage#getTrNetModel_Id()
   * @model required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link trnet.TrNetModel#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // TrNetModel
