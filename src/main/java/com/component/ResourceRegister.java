package com.component;

import org.glassfish.jersey.server.ResourceConfig;

import com.controller.SpringController;

public class ResourceRegister extends ResourceConfig {

    public ResourceRegister () {
        register(SpringController.class);
    }
}
