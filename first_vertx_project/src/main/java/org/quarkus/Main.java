package org.quarkus;

import io.vertx.core.Vertx;
import jakarta.inject.Inject;

public class Main {

    public static void main(String[]args){

        Vertx vertx = Vertx.vertx();
        FirstVerticle firstVerticle=new FirstVerticle();
        vertx.deployVerticle(firstVerticle);






    }
}
