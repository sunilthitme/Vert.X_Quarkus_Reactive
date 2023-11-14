package org.quarkus;

import io.vertx.core.Vertx;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.logging.Logger;

@Path("/eventbus")
public class EventBusResource {

    public static final Logger log=Logger.getLogger(String.valueOf(EventBusResource.class));
    @Inject
    Vertx vertx;

    @GET
    @Path("/publish")
    public String publishMessage(){
        log.info("inside publish");
        vertx.eventBus().publish("example-address","Message From Quarkus");
        return "messege publish to event bus";
    }

    @GET
    @Path("/consume")
    public String consumeMessage(){
        log.info("inside consumeMessage");
        vertx.eventBus().consumer("example_address").handler(message->{
            String body=message.body().toString();

            System.out.println("Recieved message "+body);
            log.info("inside consumeMessage after  "+body);
        });
        return "listening from message";
    }

}
