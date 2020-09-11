package org.acme.route;

import org.acme.processor.SimpleProcessor;
import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class SimpleRoute extends RouteBuilder {

    @Inject
    private SimpleProcessor simpleProcessor;

    @Override
    public void configure() throws Exception {
        rest("/myrest").get().to("direct:simpleRoute");

        from("direct:simpleRoute")
            .process(simpleProcessor);
    }
}
