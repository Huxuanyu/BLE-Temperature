package org.bluetooth.bledemo;

import java.util.HashMap;

import android.util.SparseArray;

public class BleNamesResolver {		/*分解蓝牙名称*/
	private static HashMap<String, String> mServices = new HashMap<String, String>();
	private static HashMap<String, String> mCharacteristics = new HashMap<String, String>();
	private static SparseArray<String> mValueFormats = new SparseArray<String>(); 		/*定义分析形式*/
	private static SparseArray<String> mAppearance = new SparseArray<String>();			/*定义外观*/
	private static SparseArray<String> mHeartRateSensorLocation = new SparseArray<String>();
	
	static public String resolveServiceName(final String uuid)			/*解析服务名称*/
	{
		String result = mServices.get(uuid);				/*将蓝牙设备UUID赋予到一个名为result的字符串中*/
		if(result == null) result = "未知服务";
		return result;
	}

	static public String resolveValueTypeDescription(final int format)			/*解析值类型的描述*/
	{
		Integer tmp = Integer.valueOf(format);							/*整数值的格式*/
		return mValueFormats.get(tmp, "未知版式");
	}	
	
	static public String resolveCharacteristicName(final String uuid)		/*解析特性名称*/
	{
		String result = mCharacteristics.get(uuid);					/*将UUID通过mCharacteristics赋予result*/
		if(result == null) result = "未知特征";
		return result;
	}
	
	static public String resolveUuid(final String uuid) {			/*解析UUID*/
		String result = mServices.get(uuid);
		if(result != null) return "服务: " + result;				/*返回result的值*/
		
		result = mCharacteristics.get(uuid);
		if(result != null) return "特性: " + result;
		
		result = "未知UUID";
		return result;
	}
	
	static public String resolveAppearance(int key) {				/*string函数解析外观，实参为key*/
		Integer tmp = Integer.valueOf(key);
		return mAppearance.get(tmp, "未知外观");			/*返回 温度没有被发现*/
	}
	
	static public String resolveHeartRateSensorLocation(int key) {		/*解析心率传感器位置*/
		Integer tmp = Integer.valueOf(key);
		return mHeartRateSensorLocation.get(tmp, "其他");		
	}
	
	static public boolean isService(final String uuid) {			/*boolean静态常量isService*/
		return mServices.containsKey(uuid);
	}

	static public boolean isCharacteristic(final String uuid) {		/*特性函数*/
		return mCharacteristics.containsKey(uuid);
	}	
	
	static {
		mServices.put("00001811-0000-1000-8000-00805f9b34fb", "Alert Notification Service");
		mServices.put("0000180f-0000-1000-8000-00805f9b34fb", "电量");
		mServices.put("00001810-0000-1000-8000-00805f9b34fb", "Blood Pressure");
		mServices.put("00001805-0000-1000-8000-00805f9b34fb", "Current Time Service");
		mServices.put("00001818-0000-1000-8000-00805f9b34fb", "Cycling Power");
		mServices.put("00001816-0000-1000-8000-00805f9b34fb", "Cycling Speed and Cadence");
		mServices.put("0000180a-0000-1000-8000-00805f9b34fb", "设备信息");
		mServices.put("00001800-0000-1000-8000-00805f9b34fb", "通用入口");
		mServices.put("00001801-0000-1000-8000-00805f9b34fb", "通用属性");
		mServices.put("00001808-0000-1000-8000-00805f9b34fb", "Glucose");
		mServices.put("00001809-0000-1000-8000-00805f9b34fb", "Health Thermometer");
		mServices.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate");
		mServices.put("00001812-0000-1000-8000-00805f9b34fb", "Human Interface Device");
		mServices.put("00001802-0000-1000-8000-00805f9b34fb", "Immediate Alert");
		mServices.put("00001803-0000-1000-8000-00805f9b34fb", "Link Loss");
		mServices.put("00001819-0000-1000-8000-00805f9b34fb", "Location and Navigation");
		mServices.put("00001807-0000-1000-8000-00805f9b34fb", "Next DST Change Service");
		mServices.put("0000180e-0000-1000-8000-00805f9b34fb", "Phone Alert Status Service");
		mServices.put("00001806-0000-1000-8000-00805f9b34fb", "Reference Time Update Service");
		mServices.put("00001814-0000-1000-8000-00805f9b34fb", "Running Speed and Cadence");
		mServices.put("00001813-0000-1000-8000-00805f9b34fb", "Scan Parameters");
		mServices.put("00001804-0000-1000-8000-00805f9b34fb", "Tx Power");
		
		mCharacteristics.put("00002a43-0000-1000-8000-00805f9b34fb", "Alert Category ID");
		mCharacteristics.put("00002a42-0000-1000-8000-00805f9b34fb", "Alert Category ID Bit Mask");
		mCharacteristics.put("00002a06-0000-1000-8000-00805f9b34fb", "Alert Level");
		mCharacteristics.put("00002a44-0000-1000-8000-00805f9b34fb", "Alert Notification Control Point");
		mCharacteristics.put("00002a3f-0000-1000-8000-00805f9b34fb", "Alert Status");
		mCharacteristics.put("00002a01-0000-1000-8000-00805f9b34fb", "外观");
		mCharacteristics.put("00002a19-0000-1000-8000-00805f9b34fb", "电量");
		mCharacteristics.put("00002a49-0000-1000-8000-00805f9b34fb", "Blood Pressure Feature");
		mCharacteristics.put("00002a35-0000-1000-8000-00805f9b34fb", "Blood Pressure Measurement");
		mCharacteristics.put("00002a38-0000-1000-8000-00805f9b34fb", "Body Sensor Location");
		mCharacteristics.put("00002a22-0000-1000-8000-00805f9b34fb", "Boot Keyboard Input Report");
		mCharacteristics.put("00002a32-0000-1000-8000-00805f9b34fb", "Boot Keyboard Output Report");
		mCharacteristics.put("00002a33-0000-1000-8000-00805f9b34fb", "Boot Mouse Input Report");
		mCharacteristics.put("00002a5c-0000-1000-8000-00805f9b34fb", "CSC Feature");
		mCharacteristics.put("00002a5b-0000-1000-8000-00805f9b34fb", "CSC Measurement");
		mCharacteristics.put("00002a2b-0000-1000-8000-00805f9b34fb", "Current Time");
		mCharacteristics.put("00002a66-0000-1000-8000-00805f9b34fb", "Cycling Power Control Point");
		mCharacteristics.put("00002a65-0000-1000-8000-00805f9b34fb", "Cycling Power Feature");
		mCharacteristics.put("00002a63-0000-1000-8000-00805f9b34fb", "Cycling Power Measurement");
		mCharacteristics.put("00002a64-0000-1000-8000-00805f9b34fb", "Cycling Power Vector");
		mCharacteristics.put("00002a08-0000-1000-8000-00805f9b34fb", "Date Time");
		mCharacteristics.put("00002a0a-0000-1000-8000-00805f9b34fb", "Day Date Time");
		mCharacteristics.put("00002a09-0000-1000-8000-00805f9b34fb", "Day of Week");
		mCharacteristics.put("00002a00-0000-1000-8000-00805f9b34fb", "设备名");
		mCharacteristics.put("00002a0d-0000-1000-8000-00805f9b34fb", "DST Offset");
		mCharacteristics.put("00002a0c-0000-1000-8000-00805f9b34fb", "Exact Time 256");
		mCharacteristics.put("00002a26-0000-1000-8000-00805f9b34fb", "Firmware Revision String");
		mCharacteristics.put("00002a51-0000-1000-8000-00805f9b34fb", "Glucose Feature");
		mCharacteristics.put("00002a18-0000-1000-8000-00805f9b34fb", "Glucose Measurement");
		mCharacteristics.put("00002a34-0000-1000-8000-00805f9b34fb", "Glucose Measurement Context");
		mCharacteristics.put("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Revision String");
		mCharacteristics.put("00002a39-0000-1000-8000-00805f9b34fb", "Heart Rate Control Point");
		mCharacteristics.put("00002a37-0000-1000-8000-00805f9b34fb", "Heart Rate Measurement");
		mCharacteristics.put("00002a4c-0000-1000-8000-00805f9b34fb", "HID Control Point");
		mCharacteristics.put("00002a4a-0000-1000-8000-00805f9b34fb", "HID Information");
		mCharacteristics.put("00002a2a-0000-1000-8000-00805f9b34fb", "IEEE 11073-20601 Regulatory Certification Data List");
		mCharacteristics.put("00002a36-0000-1000-8000-00805f9b34fb", "Intermediate Cuff Pressure");
		mCharacteristics.put("00002a1e-0000-1000-8000-00805f9b34fb", "Intermediate Temperature");
		mCharacteristics.put("00002a6b-0000-1000-8000-00805f9b34fb", "LN Control Point");
		mCharacteristics.put("00002a6a-0000-1000-8000-00805f9b34fb", "LN Feature");
		mCharacteristics.put("00002a0f-0000-1000-8000-00805f9b34fb", "Local Time Information");
		mCharacteristics.put("00002a67-0000-1000-8000-00805f9b34fb", "Location and Speed");
		mCharacteristics.put("00002a29-0000-1000-8000-00805f9b34fb", "制造商");
		mCharacteristics.put("00002a21-0000-1000-8000-00805f9b34fb", "Measurement Interval");
		mCharacteristics.put("00002a24-0000-1000-8000-00805f9b34fb", "Model Number String");
		mCharacteristics.put("00002a68-0000-1000-8000-00805f9b34fb", "Navigation");
		mCharacteristics.put("00002a46-0000-1000-8000-00805f9b34fb", "New Alert");
		mCharacteristics.put("00002a04-0000-1000-8000-00805f9b34fb", "Peripheral Preferred Connection Parameters");
		mCharacteristics.put("00002a02-0000-1000-8000-00805f9b34fb", "Peripheral Privacy Flag");
		mCharacteristics.put("00002a50-0000-1000-8000-00805f9b34fb", "PnP ID");
		mCharacteristics.put("00002a69-0000-1000-8000-00805f9b34fb", "Position Quality");
		mCharacteristics.put("00002a4e-0000-1000-8000-00805f9b34fb", "Protocol Mode");
		mCharacteristics.put("00002a03-0000-1000-8000-00805f9b34fb", "Reconnection Address");
		mCharacteristics.put("00002a52-0000-1000-8000-00805f9b34fb", "Record Access Control Point");
		mCharacteristics.put("00002a14-0000-1000-8000-00805f9b34fb", "Reference Time Information");
		mCharacteristics.put("00002a4d-0000-1000-8000-00805f9b34fb", "Report");
		mCharacteristics.put("00002a4b-0000-1000-8000-00805f9b34fb", "Report Map");
		mCharacteristics.put("00002a40-0000-1000-8000-00805f9b34fb", "Ringer Control Point");
		mCharacteristics.put("00002a41-0000-1000-8000-00805f9b34fb", "Ringer Setting");
		mCharacteristics.put("00002a54-0000-1000-8000-00805f9b34fb", "RSC Feature");
		mCharacteristics.put("00002a53-0000-1000-8000-00805f9b34fb", "RSC Measurement");
		mCharacteristics.put("00002a55-0000-1000-8000-00805f9b34fb", "SC Control Point");
		mCharacteristics.put("00002a4f-0000-1000-8000-00805f9b34fb", "Scan Interval Window");
		mCharacteristics.put("00002a31-0000-1000-8000-00805f9b34fb", "Scan Refresh");
		mCharacteristics.put("00002a5d-0000-1000-8000-00805f9b34fb", "Sensor Location");
		mCharacteristics.put("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number String");
		mCharacteristics.put("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed");
		mCharacteristics.put("00002a28-0000-1000-8000-00805f9b34fb", "Software Revision String");
		mCharacteristics.put("00002a47-0000-1000-8000-00805f9b34fb", "Supported New Alert Category");
		mCharacteristics.put("00002a48-0000-1000-8000-00805f9b34fb", "Supported Unread Alert Category");
		mCharacteristics.put("00002a23-0000-1000-8000-00805f9b34fb", "System ID");
		mCharacteristics.put("00002a1c-0000-1000-8000-00805f9b34fb", "Temperature Measurement");
		mCharacteristics.put("00002a1d-0000-1000-8000-00805f9b34fb", "Temperature Type");
		mCharacteristics.put("00002a12-0000-1000-8000-00805f9b34fb", "Time Accuracy");
		mCharacteristics.put("00002a13-0000-1000-8000-00805f9b34fb", "Time Source");
		mCharacteristics.put("00002a16-0000-1000-8000-00805f9b34fb", "Time Update Control Point");
		mCharacteristics.put("00002a17-0000-1000-8000-00805f9b34fb", "Time Update State");
		mCharacteristics.put("00002a11-0000-1000-8000-00805f9b34fb", "Time with DST");
		mCharacteristics.put("00002a0e-0000-1000-8000-00805f9b34fb", "Time Zone");
		mCharacteristics.put("00002a07-0000-1000-8000-00805f9b34fb", "Tx Power Level");
		mCharacteristics.put("00002a45-0000-1000-8000-00805f9b34fb", "Unread Alert Status");
		
		mValueFormats.put(Integer.valueOf(52), "32bit float");
		mValueFormats.put(Integer.valueOf(50), "16bit float");
		mValueFormats.put(Integer.valueOf(34), "16bit signed int");
		mValueFormats.put(Integer.valueOf(36), "32bit signed int");
		mValueFormats.put(Integer.valueOf(33), "8bit signed int");
		mValueFormats.put(Integer.valueOf(18), "16bit unsigned int");
		mValueFormats.put(Integer.valueOf(20), "32bit unsigned int");
		mValueFormats.put(Integer.valueOf(17), "8bit unsigned int");
		
		// 添加了两个外观字符串描述
		// https://developer.bluetooth.org/gatt/characteristics/Pages/CharacteristicViewer.aspx?u=org.bluetooth.characteristic.gap.appearance.xml
		//mAppearance.put(Integer.valueOf(833), "Heart Rate Sensor: Belt");
		mAppearance.put(Integer.valueOf(832), "Generic Heart Rate Sensor");
		mAppearance.put(Integer.valueOf(0), "Unknown");
		mAppearance.put(Integer.valueOf(64), "Generic Phone");
		mAppearance.put(Integer.valueOf(1157), "Cycling: Speed and Cadence Sensor");
		mAppearance.put(Integer.valueOf(1152), "General Cycling");
		mAppearance.put(Integer.valueOf(1153), "Cycling Computer");
		mAppearance.put(Integer.valueOf(1154), "Cycling: Speed Sensor");
		mAppearance.put(Integer.valueOf(1155), "Cycling: Cadence Sensor");
		mAppearance.put(Integer.valueOf(1156), "Cycling: Speed and Cadence Sensor");
		mAppearance.put(Integer.valueOf(1157), "Cycling: Power Sensor");
		
		mHeartRateSensorLocation.put(Integer.valueOf(0), "Other");
		mHeartRateSensorLocation.put(Integer.valueOf(1), "Chest");
		mHeartRateSensorLocation.put(Integer.valueOf(2), "Wrist");
		mHeartRateSensorLocation.put(Integer.valueOf(3), "Finger");
		mHeartRateSensorLocation.put(Integer.valueOf(4), "Hand");
		mHeartRateSensorLocation.put(Integer.valueOf(5), "Ear Lobe");
		mHeartRateSensorLocation.put(Integer.valueOf(6), "Foot");
	}
}
