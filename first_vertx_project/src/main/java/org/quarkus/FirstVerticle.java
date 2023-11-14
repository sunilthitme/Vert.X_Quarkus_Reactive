package org.quarkus;

import io.vertx.core.AbstractVerticle;

public class FirstVerticle extends AbstractVerticle {

    @Override
    public void start(){
        System.out.println("This is my first verticle");
    }
}
