package com.inflight.rest.InflightRest.database;

import java.util.HashMap;
import java.util.Map;

import com.inflight.rest.InflightRest.model.RedLight;

/**
 * 
 * @author pradeep
 *
 */

public class DatabaseClass {

	private static Map<Long, RedLight> redLights = new HashMap<>();

	public static Map<Long, RedLight> getRedLights() {
		return redLights;
	}

}
