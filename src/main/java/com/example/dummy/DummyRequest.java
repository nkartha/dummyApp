package com.example.dummy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("word")
public class DummyRequest {

    @Path("{word}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String example(@PathParam("word") String word) {
       return word + "!!!!";
    }

}