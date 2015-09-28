package com.mycompany.JerseyVersionSample.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class Order {
	
	@GET
	@Path("/{param}")
	@Consumes({"application/vnd.order.v1+json"})
	@Produces({"application/vnd.order.v1+json"})
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}

}
