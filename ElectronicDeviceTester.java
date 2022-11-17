package com.assignment;

import com.assignment.electronicDevice.ElectroniDevice;

public class ElectronicDeviceTester {
	public static void main(String[] args) {
		
		ElectroniDevice electroniDevice = new ElectroniDevice();
		electroniDevice.makesTaskEasyer();
		
		
		ElectroniDevice electroniDevice2 = new ElectroniDevice();
		electroniDevice2.name = "Laptop";
		electroniDevice2.displayInfo();
	}

}
