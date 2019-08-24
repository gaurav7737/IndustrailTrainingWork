package org.accolite.java.EmployeeManagement.controller;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.accolite.java.EmployeeManagement.dto.EmployeeDTO;
import org.accolite.java.EmployeeManagement.service.EmployeeService;

@Path("EmployeeController")
public class EmployeeController {
	
	    /**
	     * Method handling HTTP GET requests. The returned object will be sent
	     * to the client as "text/plain" media type.
	     *
	     * @return String that will be returned as a text/plain response.
	     */
	
		static EmployeeService e = new EmployeeService();
	
	    @GET
	    @Path("list")
	    @Produces(MediaType.APPLICATION_JSON)
	    public ArrayList<EmployeeDTO> getAllEmployees() {
	    	//.e.ArrayList<EmployeeDTO> eList=  e.getAllEmployee();
	    	return e.getAllEmployee();
	 		
	    }
	    
	    @GET
	    @Path("{ID}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public EmployeeDTO getbyid(@PathParam("ID") String id) {
	    	return e.getById(id);
	    	
	    }
	    
	    @POST
		@Path("update")
	    @Produces(MediaType.APPLICATION_JSON)
		@Consumes({"application/xml", "application/json"})
	    public ArrayList<EmployeeDTO> update(EmployeeDTO emp){
	    	return e.updateEmployee(emp);
	    	
	    }
	    
	    
	    
	    
	    
	    
	
//@PathParam(Ïd) int id;
}
