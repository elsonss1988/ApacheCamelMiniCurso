package org.acme.camel;

import org.apache.camel.builder.RouteBuilder;

public class IntegracaoArquivo extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:tmp/in/")
                .routeId("integracao-arquivo")
                .to("file:tmp/out/");
    }
}
