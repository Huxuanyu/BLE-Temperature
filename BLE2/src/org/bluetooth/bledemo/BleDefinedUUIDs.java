package org.bluetooth.bledemo;

import java.util.UUID;				

public class BleDefinedUUIDs {		/*定义蓝牙UUID的类*/
	
	public static class Service {		/*定义服务的类*/
		final static public UUID HEART_RATE               = UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb");
	};
	
	public static class Characteristic {	/*定义蓝牙特性的类*/
		final static public UUID HEART_RATE_MEASUREMENT   = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb");
		final static public UUID MANUFACTURER_STRING      = UUID.fromString("00002a29-0000-1000-8000-00805f9b34fb");
		final static public UUID MODEL_NUMBER_STRING      = UUID.fromString("00002a24-0000-1000-8000-00805f9b34fb");
		final static public UUID FIRMWARE_REVISION_STRING = UUID.fromString("00002a26-0000-1000-8000-00805f9b34fb");
		final static public UUID APPEARANCE               = UUID.fromString("00002a01-0000-1000-8000-00805f9b34fb");
		final static public UUID BODY_SENSOR_LOCATION     = UUID.fromString("00002a38-0000-1000-8000-00805f9b34fb");
		final static public UUID BATTERY_LEVEL            = UUID.fromString("00002a19-0000-1000-8000-00805f9b34fb");
	}
	
	public static class Descriptor {	/*定义蓝牙说明的类*/
		final static public UUID CHAR_CLIENT_CONFIG       = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
	}
	
}
