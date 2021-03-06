/* This autogenerated file is part of jpcsp. */
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

package jpcsp.HLE.modules150;

import jpcsp.HLE.Modules;
import jpcsp.HLE.modules.HLEModule;
import jpcsp.HLE.modules.HLEModuleFunction;
import jpcsp.HLE.modules.HLEModuleManager;

import jpcsp.Memory;
import jpcsp.Processor;

import jpcsp.Allegrex.CpuState; // New-Style Processor

public class sceNetAdhocAuth_driver implements HLEModule {
	@Override
	public String getName() { return "sceNetAdhocAuth_driver"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceNetAdhocAuthInitFunction, 0x86004235);
			mm.addFunction(sceNetAdhocAuthTermFunction, 0x6074D8F1);
			mm.addFunction(sceNetAdhocAuth_driver_89F2A732Function, 0x89F2A732);
			mm.addFunction(sceNetAdhocAuth_driver_2E6AA271Function, 0x2E6AA271);
			mm.addFunction(sceNetAdhocAuth_driver_6CE209A3Function, 0x6CE209A3);
			mm.addFunction(sceNetAdhocAuth_driver_2AD8C677Function, 0x2AD8C677);
			mm.addFunction(sceNetAdhocAuth_driver_BD144DA6Function, 0xBD144DA6);
			mm.addFunction(sceNetAdhocAuth_driver_1F9A90B8Function, 0x1F9A90B8);
			mm.addFunction(sceNetAdhocAuth_driver_76F26AB0Function, 0x76F26AB0);
			mm.addFunction(sceNetAdhocAuth_driver_312BD812Function, 0x312BD812);
			mm.addFunction(sceNetAdhocAuth_driver_72AAC6D3Function, 0x72AAC6D3);
			mm.addFunction(sceNetAdhocAuth_driver_AAB06250Function, 0xAAB06250);
			mm.addFunction(sceNetAdhocAuth_driver_015A8A64Function, 0x015A8A64);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceNetAdhocAuthInitFunction);
			mm.removeFunction(sceNetAdhocAuthTermFunction);
			mm.removeFunction(sceNetAdhocAuth_driver_89F2A732Function);
			mm.removeFunction(sceNetAdhocAuth_driver_2E6AA271Function);
			mm.removeFunction(sceNetAdhocAuth_driver_6CE209A3Function);
			mm.removeFunction(sceNetAdhocAuth_driver_2AD8C677Function);
			mm.removeFunction(sceNetAdhocAuth_driver_BD144DA6Function);
			mm.removeFunction(sceNetAdhocAuth_driver_1F9A90B8Function);
			mm.removeFunction(sceNetAdhocAuth_driver_76F26AB0Function);
			mm.removeFunction(sceNetAdhocAuth_driver_312BD812Function);
			mm.removeFunction(sceNetAdhocAuth_driver_72AAC6D3Function);
			mm.removeFunction(sceNetAdhocAuth_driver_AAB06250Function);
			mm.removeFunction(sceNetAdhocAuth_driver_015A8A64Function);
			
		}
	}
	
	
	public void sceNetAdhocAuthInit(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuthInit [0x86004235]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuthTerm(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuthTerm [0x6074D8F1]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_89F2A732(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_89F2A732 [0x89F2A732]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_2E6AA271(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_2E6AA271 [0x2E6AA271]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_6CE209A3(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_6CE209A3 [0x6CE209A3]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_2AD8C677(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_2AD8C677 [0x2AD8C677]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_BD144DA6(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_BD144DA6 [0xBD144DA6]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_1F9A90B8(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_1F9A90B8 [0x1F9A90B8]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_76F26AB0(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_76F26AB0 [0x76F26AB0]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_312BD812(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_312BD812 [0x312BD812]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_72AAC6D3(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_72AAC6D3 [0x72AAC6D3]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_AAB06250(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_AAB06250 [0xAAB06250]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceNetAdhocAuth_driver_015A8A64(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceNetAdhocAuth_driver_015A8A64 [0x015A8A64]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public final HLEModuleFunction sceNetAdhocAuthInitFunction = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuthInit") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuthInit(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuthInit(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuthTermFunction = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuthTerm") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuthTerm(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuthTerm(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_89F2A732Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_89F2A732") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_89F2A732(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_89F2A732(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_2E6AA271Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_2E6AA271") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_2E6AA271(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_2E6AA271(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_6CE209A3Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_6CE209A3") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_6CE209A3(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_6CE209A3(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_2AD8C677Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_2AD8C677") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_2AD8C677(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_2AD8C677(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_BD144DA6Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_BD144DA6") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_BD144DA6(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_BD144DA6(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_1F9A90B8Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_1F9A90B8") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_1F9A90B8(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_1F9A90B8(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_76F26AB0Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_76F26AB0") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_76F26AB0(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_76F26AB0(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_312BD812Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_312BD812") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_312BD812(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_312BD812(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_72AAC6D3Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_72AAC6D3") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_72AAC6D3(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_72AAC6D3(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_AAB06250Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_AAB06250") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_AAB06250(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_AAB06250(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetAdhocAuth_driver_015A8A64Function = new HLEModuleFunction("sceNetAdhocAuth_driver", "sceNetAdhocAuth_driver_015A8A64") {
		@Override
		public final void execute(Processor processor) {
			sceNetAdhocAuth_driver_015A8A64(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetAdhocAuth_driverModule.sceNetAdhocAuth_driver_015A8A64(processor);";
		}
	};
    
};
