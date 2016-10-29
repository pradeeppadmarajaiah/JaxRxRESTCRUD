package com.inflight.rest.InflightRest.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.inflight.rest.InflightRest.model.RedLight;
import com.inflight.rest.InflightRest.service.RedLightService;

/**
 * 
 * @author pradeep
 *
 */

@Path("/redLightConf")
@Consumes(value = { MediaType.TEXT_XML, MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.TEXT_XML, MediaType.APPLICATION_JSON })
public class RedLightResource {
	RedLightService redLightService = new RedLightService();

	@GET
	public List<RedLight> getRedLights() {
		return redLightService.getAllredLights();
	}

	@GET
	@Path("/{redLightId}")
	public RedLight getRedLight(@PathParam("redLightId") long id) {
		return redLightService.getRedLight(id);
	}

	@PUT
	@Path("/{redLightId}")
	public RedLight updateRedLight(@PathParam("redLightId") long id, RedLight redLight) {
		redLight.setId(id);
		return redLightService.updateRedLight(redLight);
	}

	@POST
	public RedLight addRedLight(RedLight redLight) {
		return redLightService.addRedLight(redLight);
	}

	@DELETE
	@Path("/{redLightId}")
	public RedLight deleteRedLight(@PathParam("redLightId") long id) {
		return redLightService.removeRedLight(id);
	}

}
