/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */
package jpcsp.format.rco.vsmx.interpreter;

public class VSMXReference extends VSMXBaseObject {
	private VSMXObject refObject;
	private String refProperty;

	public VSMXReference(VSMXObject refObject, String refProperty) {
		this.refObject = refObject;
		this.refProperty = refProperty;
	}

	public void assign(VSMXBaseObject value) {
		refObject.setPropertyValue(refProperty, value.getValue());
	}

	private VSMXBaseObject getRef() {
		return refObject.getPropertyValue(refProperty);
	}

	@Override
	public VSMXBaseObject getValue() {
		return getRef();
	}

	@Override
	public float getFloatValue() {
		return getRef().getFloatValue();
	}

	@Override
	public int getIntValue() {
		return getRef().getIntValue();
	}

	@Override
	public boolean getBooleanValue() {
		return getRef().getBooleanValue();
	}

	@Override
	public boolean equals(VSMXBaseObject value) {
		return getRef().equals(value);
	}

	@Override
	public VSMXBaseObject getPropertyValue(String name) {
		return getRef().getPropertyValue(name);
	}

	@Override
	public void setPropertyValue(String name, VSMXBaseObject value) {
		getRef().setPropertyValue(name, value);
	}

	@Override
	public void deletePropertyValue(String name) {
		getRef().deletePropertyValue(name);
	}

	@Override
	public int getLength() {
		return getRef().getLength();
	}

	@Override
	public void setFloatValue(float value) {
		getRef().setFloatValue(value);
	}

	@Override
	public String toString() {
		return String.format("@OBJ.%s=%s", refProperty, getRef());
	}
}
