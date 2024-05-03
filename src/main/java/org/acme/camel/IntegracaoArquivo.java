package org.acme.camel;

import org.apache.camel.builder.RouteBuilder;

public class IntegracaoArquivo extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:{{diretorioEntrada}}?delay=5000")
                .routeId("integracao-arquivo")
                .log("Processando o arquivo: ${file:name}")
                .to("file:{{diretorioSaida}}");
    }
}
