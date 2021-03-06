/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Font Resolution Met Tech</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFontResolutionMetTech()
 * @model
 * @generated
 */
public enum FontResolutionMetTech implements Enumerator {
	/**
     * The '<em><b>Const Fixedmetric</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_FIXEDMETRIC_VALUE
     * @generated
     * @ordered
     */
	CONST_FIXEDMETRIC(1, "ConstFixedmetric", "ConstFixedmetric"),

	/**
     * The '<em><b>Const Relativemetric</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_RELATIVEMETRIC_VALUE
     * @generated
     * @ordered
     */
	CONST_RELATIVEMETRIC(2, "ConstRelativemetric", "ConstRelativemetric");

	/**
     * The '<em><b>Const Fixedmetric</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Fixedmetric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_FIXEDMETRIC
     * @model name="ConstFixedmetric"
     * @generated
     * @ordered
     */
	public static final int CONST_FIXEDMETRIC_VALUE = 1;

	/**
     * The '<em><b>Const Relativemetric</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Relativemetric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_RELATIVEMETRIC
     * @model name="ConstRelativemetric"
     * @generated
     * @ordered
     */
	public static final int CONST_RELATIVEMETRIC_VALUE = 2;

	/**
     * An array of all the '<em><b>Font Resolution Met Tech</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final FontResolutionMetTech[] VALUES_ARRAY =
		new FontResolutionMetTech[] {
            CONST_FIXEDMETRIC,
            CONST_RELATIVEMETRIC,
        };

	/**
     * A public read-only list of all the '<em><b>Font Resolution Met Tech</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<FontResolutionMetTech> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Font Resolution Met Tech</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FontResolutionMetTech get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FontResolutionMetTech result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Font Resolution Met Tech</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FontResolutionMetTech getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FontResolutionMetTech result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Font Resolution Met Tech</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FontResolutionMetTech get(int value) {
        switch (value) {
            case CONST_FIXEDMETRIC_VALUE: return CONST_FIXEDMETRIC;
            case CONST_RELATIVEMETRIC_VALUE: return CONST_RELATIVEMETRIC;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private FontResolutionMetTech(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLiteral() {
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        return literal;
    }
	
} //FontResolutionMetTech
