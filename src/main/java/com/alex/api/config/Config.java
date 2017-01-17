package com.alex.api.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;

/**
 * Function:
 *
 * @author Alex
 * @date 2017/1/17
 */
@Configuration
@PropertySource("classpath:application.properties")
@EnableElasticsearchRepositories(basePackages = "com/alex/api/repository/data/elasticsearch")
public class Config {
    @Value("${elasticsearch.hostname}")
    private String hostname;
    @Value("${elasticsearch.port}")
    private Integer port;

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception{
        return new ElasticsearchTemplate(client());
    }

    @Bean
    public Client client() throws Exception{
//        int port=9300;
//        String hostname="10.10.12.48";
        TransportClient transportClient = TransportClient.builder().build();
        String[] addressList = hostname.split(",");
        for (int i = 0; i < addressList.length; i++) {
            transportClient.addTransportAddresses(new InetSocketTransportAddress(InetAddress.getByName(addressList[i]), port));
        }
        return transportClient;
    }

}
