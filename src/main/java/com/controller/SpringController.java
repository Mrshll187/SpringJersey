package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.DataSource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
@Component
public class SpringController {

    @Autowired
    private DataSource datasource;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
	
        return new String(datasource.load());
    }
}
