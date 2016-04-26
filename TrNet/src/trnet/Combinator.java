/**
 */
package trnet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trnet.Combinator#getRestrictions <em>Restrictions</em>}</li>
 * </ul>
 * </p>
 *
 * @see trnet.TrnetPackage#getCombinator()
 * @model
 * @generated
 */
public interface Combinator extends Operator
{
  /**
   * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
   * The list contents are of type {@link trnet.Restriction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restrictions</em>' containment reference list.
   * @see trnet.TrnetPackage#getCombinator_Restrictions()
   * @model containment="true"
   * @generated
   */
  EList<Restriction> getRestrictions();

} // Combinator
