/*
 * This file is part of GDL.
 *
 * GDL is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GDL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with GDL.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.s1ck.gdl.model.comparables;

/**
 * Selects a property of a variable
 */
public class PropertySelector implements ComparableExpression {

  /**
   * Elements variable
   */
  private String variable;

  /**
   * Elements property name
   */
  private String propertyName;

  public PropertySelector(String variable, String propertyName) {
    this.variable = variable;
    this.propertyName = propertyName;
  }

  /**
   * Returns the property name
   *
   * @return the property name
   */
  public String getPropertyName() {
    return propertyName;
  }

  /**
   * Returns the variable which references the element
   * @return variable name
   */
  @Override
  public String getVariable() {
    return this.variable;
  }

  @Override
  public String toString() {
    return variable + "." + propertyName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    PropertySelector that = (PropertySelector) o;

    if (variable != null ? !variable.equals(that.variable) : that.variable != null) return false;
    return propertyName != null ? propertyName.equals(that.propertyName) : that.propertyName == null;

  }

  @Override
  public int hashCode() {
    int result = variable != null ? variable.hashCode() : 0;
    result = 31 * result + (propertyName != null ? propertyName.hashCode() : 0);
    return result;
  }
}
