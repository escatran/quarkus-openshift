package org.acme.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import javax.inject.Singleton;

@Singleton
public class SimpleProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getMessage().setBody("Hello 123456", String.class);
    }
}
