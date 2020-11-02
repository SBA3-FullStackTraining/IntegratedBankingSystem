package com.banking.ibs.management.serviceImpl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.banking.ibs.management.IIdentityManagement;

public class IdentityManagement implements IIdentityManagement
{

	@Override
	public String generateCustID() {
		return null;
	}

	
	public static Map<String, String> convertObjToMap(Object obj) {
        Map<String, String> map = new HashMap<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try { map.put(field.getName(), field.get(obj).toString()); } catch (Exception e) { }
        }
        return map;
    }
	

}
