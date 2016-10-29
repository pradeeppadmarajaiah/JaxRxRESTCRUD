package com.inflight.rest.InflightRest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.inflight.rest.InflightRest.database.DatabaseClass;
import com.inflight.rest.InflightRest.exception.DataNotFoundException;
import com.inflight.rest.InflightRest.model.RedLight;

/**
 * 
 * @author pradeep
 *
 */
public class RedLightService {

	private Map<Long, RedLight> redlights = DatabaseClass.getRedLights();

	public RedLightService() {
		redlights.put(1L, new RedLight(1, 1, 10, "Adding red light config 1", new Date()));
		redlights.put(2L, new RedLight(2, 2, 20, "Adding red light config 2", new Date()));
	}

	public List<RedLight> getAllredLights() {
		return new ArrayList<RedLight>(redlights.values());
	}

	public RedLight getRedLight(long id) {

		RedLight redLight = redlights.get(id);
		if (redLight == null) {
			throw new DataNotFoundException("Message id " + id + " not exists.");

		} else {
			return redLight;
		}
	}

	public RedLight updateRedLight(RedLight redLight) {
		if (redLight.getId() <= 0) {
			return null;
		}
		redlights.put(redLight.getId(), redLight);
		return redLight;
	}

	public RedLight addRedLight(RedLight redLight) {
		redLight.setId(redlights.size() + 1);
		redlights.put(redLight.getId(), redLight);
		return redLight;
	}

	public RedLight removeRedLight(long id) {
		return redlights.remove(id);
	}

}
