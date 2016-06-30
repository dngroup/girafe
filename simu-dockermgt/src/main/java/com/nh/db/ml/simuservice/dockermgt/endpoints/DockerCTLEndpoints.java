package com.nh.db.ml.simuservice.dockermgt.endpoints;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.github.dockerjava.api.model.Container;
import com.nh.db.ml.simuservice.dockermgt.service.DockerService;

@Component
@Path("/")
public class DockerCTLEndpoints {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(DockerCTLEndpoints.class);
	
	@Inject
	DockerService dockerService;



	@GET
	public String message() {
		 List<Container> containers = dockerService.getstatus();
		 String response = "";
		 for (Container container : containers) {
			 response= response +" "+  container.getNames()[0];
		}
		return response;
	}

	@POST
	@Path("{idDocker}/{bitrate}")	
	public Response setBitrate(@PathParam("idDocker") String idDocker,@PathParam("bitrate") Integer bitrate ) {
        dockerService.setBitrate(idDocker,bitrate);
		return Response.accepted().build();
	}
	
	@GET
	@Path("{idDocker}/{bitrate}")	
	public Response setBitrate2(@PathParam("idDocker") String idDocker,@PathParam("bitrate") Integer bitrate ) {
        dockerService.setBitrate(idDocker,bitrate);
		return Response.accepted().build();
	}
	
	@GET
	@Path("default")
	public Response setDefaultBitrate(){
		dockerService.setDefaultBitrate();
		return Response.accepted().build();
	}




}