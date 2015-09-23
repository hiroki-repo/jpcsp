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

import java.util.Stack;

import org.apache.log4j.Logger;

import jpcsp.format.rco.vsmx.VSMX;
import jpcsp.format.rco.vsmx.VSMXCode;
import jpcsp.format.rco.vsmx.VSMXGroup;
import jpcsp.format.rco.vsmx.VSMXMem;

public class VSMXInterpreter {
	private static final Logger log = VSMX.log;
	private VSMXMem mem;
	private int pc;
	private boolean exit;
	private Stack<VSMXBaseObject> stack;
	private Stack<VSMXCallState> callStates;
	private VSMXCallState callState;
	private VSMXObject globalVariables;

	public VSMXInterpreter(VSMX vsmx) {
		mem = vsmx.getMem();
	}

	private void interpret(VSMXGroup code) {
		VSMXBaseObject o1, o2, o3, o;
		float f1, f2, f;
		boolean b;
		switch (code.getOpcode()) {
			case VSMXCode.VID_NOTHING:
				break;
			case VSMXCode.VID_OPERATOR_ASSIGN:
				o1 = stack.pop();
				o2 = stack.pop();
				if (o2 instanceof VSMXReference) {
					((VSMXReference) o2).assign(o1);
				}
				break;
			case VSMXCode.VID_OPERATOR_ADD:
				f1 = stack.pop().getFloatValue();
				f2 = stack.pop().getFloatValue();
				f = f1 + f2;
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_OPERATOR_SUBTRACT:
				f1 = stack.pop().getFloatValue();
				f2 = stack.pop().getFloatValue();
				f = f1 - f2;
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_OPERATOR_MULTIPLY:
				f1 = stack.pop().getFloatValue();
				f2 = stack.pop().getFloatValue();
				f = f1 * f2;
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_OPERATOR_DIVIDE:
				f1 = stack.pop().getFloatValue();
				f2 = stack.pop().getFloatValue();
				f = f1 / f2;
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_OPERATOR_MOD:
				f1 = stack.pop().getFloatValue();
				f2 = stack.pop().getFloatValue();
				f = f1 % f2;
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_OPERATOR_POSITIVE:
				f1 = stack.pop().getFloatValue();
				f = f1;
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_OPERATOR_NEGATE:
				f1 = stack.pop().getFloatValue();
				f = -f1;
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_OPERATOR_NOT:
				b = stack.pop().getBooleanValue();
				b = !b;
				stack.push(VSMXBoolean.getValue(b));
				break;
			case VSMXCode.VID_P_INCREMENT:
				o = stack.pop();
				f = o.getFloatValue();
				f += 1f;
				o.setFloatValue(f);
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_P_DECREMENT:
				o = stack.pop();
				f = o.getFloatValue();
				f -= 1f;
				o.setFloatValue(f);
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_INCREMENT:
				o = stack.pop();
				f = o.getFloatValue();
				o.setFloatValue(f + 1f);
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_DECREMENT:
				o = stack.pop();
				f = o.getFloatValue();
				o.setFloatValue(f - 1f);
				stack.push(new VSMXNumber(f));
				break;
			case VSMXCode.VID_OPERATOR_EQUAL:
				o1 = stack.pop();
				o2 = stack.pop();
				b = o1.equals(o2);
				stack.push(VSMXBoolean.getValue(b));
				break;
			case VSMXCode.VID_OPERATOR_NOT_EQUAL:
				o1 = stack.pop();
				o2 = stack.pop();
				b = !o1.equals(o2);
				stack.push(VSMXBoolean.getValue(b));
				break;
			case VSMXCode.VID_OPERATOR_IDENTITY:
				o1 = stack.pop();
				o2 = stack.pop();
				b = o1 == o2;
				stack.push(VSMXBoolean.getValue(b));
				break;
			case VSMXCode.VID_OPERATOR_NON_IDENTITY:
				o1 = stack.pop();
				o2 = stack.pop();
				b = o1 != o2;
				stack.push(VSMXBoolean.getValue(b));
				break;
			case VSMXCode.VID_OPERATOR_LT:
				f1 = stack.pop().getFloatValue();
				f2 = stack.pop().getFloatValue();
				b = f1 < f2;
				stack.push(VSMXBoolean.getValue(b));
				break;
			case VSMXCode.VID_OPERATOR_LTE:
				f1 = stack.pop().getFloatValue();
				f2 = stack.pop().getFloatValue();
				b = f1 <= f2;
				stack.push(VSMXBoolean.getValue(b));
				break;
			case VSMXCode.VID_OPERATOR_GTE:
				f1 = stack.pop().getFloatValue();
				f2 = stack.pop().getFloatValue();
				b = f1 >= f2;
				stack.push(VSMXBoolean.getValue(b));
				break;
			case VSMXCode.VID_OPERATOR_GT:
				f1 = stack.pop().getFloatValue();
				f2 = stack.pop().getFloatValue();
				b = f1 > f2;
				stack.push(VSMXBoolean.getValue(b));
				break;
			case VSMXCode.VID_OPERATOR_INSTANCEOF:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_OPERATOR_IN:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_OPERATOR_TYPEOF:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_OPERATOR_B_AND:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_OPERATOR_B_XOR:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_OPERATOR_B_OR:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_OPERATOR_B_NOT:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_OPERATOR_LSHIFT:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_OPERATOR_RSHIFT:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_OPERATOR_URSHIFT:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_STACK_COPY:
				o1 = stack.peek();
				stack.push(o1);
				break;
			case VSMXCode.VID_STACK_SWAP:
				o1 = stack.pop();
				o2 = stack.pop();
				stack.push(o1);
				stack.push(o2);
				break;
			case VSMXCode.VID_END_STMT:
				break;
			case VSMXCode.VID_CONST_NULL:
				stack.push(VSMXNull.singleton);
				break;
			case VSMXCode.VID_CONST_EMPTYARRAY:
				o = new VSMXArray();
				stack.push(o);
				break;
			case VSMXCode.VID_CONST_BOOL:
				if (code.value == 0) {
					stack.push(VSMXBoolean.singletonFalse);
				} else {
					stack.push(VSMXBoolean.singletonTrue);
				}
				break;
			case VSMXCode.VID_CONST_INT:
				stack.push(new VSMXNumber((float) code.value));
				break;
			case VSMXCode.VID_CONST_FLOAT:
				stack.push(new VSMXNumber(code.getFloatValue()));
				break;
			case VSMXCode.VID_CONST_STRING:
				stack.push(new VSMXString(mem.texts[code.value]));
				break;
			case VSMXCode.VID_CONST_OBJECT:
				break;
			case VSMXCode.VID_FUNCTION:
				stack.push(new VSMXFunction((code.id >> 8) & 0xFF, (code.id >> 24) & 0xFF, code.value));
				break;
			case VSMXCode.VID_ARRAY:
				stack.push(new VSMXArray());
				break;
			case VSMXCode.VID_THIS:
				stack.push(callState.getThisObject());
				break;
			case VSMXCode.VID_UNNAMED_VAR:
				stack.push(callState.getLocalVar(code.value));
				break;
			case VSMXCode.VID_VARIABLE:
				stack.push(new VSMXReference(globalVariables, mem.names[code.value]));
				break;
			case VSMXCode.VID_PROPERTY:
				o1 = stack.pop();
				if (o1 instanceof VSMXObject) {
					stack.push(new VSMXReference((VSMXObject) o1, mem.properties[code.value]));
				}
				break;
			case VSMXCode.VID_METHOD:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_SET_ATTR:
				o1 = stack.pop();
				o2 = stack.pop();
				o2.setPropertyValue(mem.properties[code.value], o1);
				break;
			case VSMXCode.VID_UNSET:
				o1 = stack.pop();
				o1.deletePropertyValue(mem.properties[code.value]);
				break;
			case VSMXCode.VID_OBJ_ADD_ATTR:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_ARRAY_INDEX:
				o1 = stack.pop();
				o2 = stack.pop();
				if (o2 instanceof VSMXArray) {
					o = o2.getPropertyValue(Integer.toString(o1.getIntValue()));
				} else {
					o = VSMXUndefined.singleton;
				}
				stack.push(o);
				break;
			case VSMXCode.VID_ARRAY_INDEX_ASSIGN:
				o1 = stack.pop();
				o2 = stack.pop();
				o3 = stack.pop().getValue();
				if (o3 instanceof VSMXArray) {
					o3.setPropertyValue(Integer.toString(o2.getIntValue()), o3);
				}
				break;
			case VSMXCode.VID_ARRAY_DELETE:
				o1 = stack.pop();
				o2 = stack.pop();
				if (o2 instanceof VSMXArray) {
					o2.deletePropertyValue(Integer.toString(o1.getIntValue()));
				}
				break;
			case VSMXCode.VID_ARRAY_PUSH:
				o1 = stack.pop().getValue();
				o2 = stack.pop();
				if (o2 instanceof VSMXArray) {
					int length = o2.getLength();
					o2.setPropertyValue(Integer.toString(length), o1);
					stack.push(o2);
				}
				break;
			case VSMXCode.VID_JUMP:
				pc = code.value;
				break;
			case VSMXCode.VID_JUMP_TRUE:
				o1 = stack.pop();
				b = o1.getBooleanValue();
				if (b) {
					pc = code.value;
				}
				break;
			case VSMXCode.VID_JUMP_FALSE:
				o1 = stack.pop();
				b = !o1.getBooleanValue();
				if (b) {
					pc = code.value;
				}
				break;
			case VSMXCode.VID_CALL_FUNC:
				VSMXBaseObject arguments[] = new VSMXBaseObject[code.value + 1];
				arguments[0] = VSMXNull.singleton;
				for (int i = 0; i < code.value; i++) {
					arguments[code.value - i] = stack.pop();
				}
				o = stack.pop();
				if (o instanceof VSMXFunction) {
					VSMXFunction function = (VSMXFunction) o;
					callStates.push(callState);
					callState = new VSMXCallState(VSMXNull.singleton, function.getLocalVars(), pc);
					for (int i = 0; i <= function.getArgs() && i <= code.value; i++) {
						callState.setLocalVar(i, arguments[i]);
					}
					pc = function.getStartLine();
				}
				break;
			case VSMXCode.VID_CALL_METHOD:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_CALL_NEW:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_RETURN:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_THROW:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_TRY_BLOCK_IN:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_TRY_BLOCK_OUT:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_CATCH_FINALLY_BLOCK_IN:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_CATCH_FINALLY_BLOCK_OUT:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_END:
				exit = true;
				break;
			case VSMXCode.VID_DEBUG_FILE:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_DEBUG_LINE:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			case VSMXCode.VID_MAKE_FLOAT_ARRAY:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
			default:
				log.warn(String.format("Line#%d unimplemented %s", pc - 4, code));
				break;
		}
	}

	public void run() {
		pc = 0;
		exit = false;
		stack = new Stack<VSMXBaseObject>();
		callStates = new Stack<VSMXCallState>();
		callState = new VSMXCallState(VSMXNull.singleton, 0, 0);
		globalVariables = new VSMXObject();

		while (!exit) {
			VSMXGroup code = mem.codes[pc];
			if (log.isTraceEnabled()) {
				log.trace(String.format("Interpret Line#%d: %s", pc, code));
			}
			pc++;
			interpret(code);
		}
	}
}
