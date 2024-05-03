package org.acme.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.FileConstants;

public class IntegracaoArquivo extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:{{diretorioEntrada}}?delay=5000")
                .routeId("integracao-arquivo")
                .log("Processando o arquivo: ${file:name}")
                //.setHeader(FileConstants.FILE_NAME, simple("${date:now:ddMMyy_HHmmss}_${file:name}"))
                .to("file:{{diretorioSaida}}?fileName=${date:now:ddMMyy_HHmmss}_${file:name}");
    }
}
