package config;

import com.google.inject.AbstractModule;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

public class Global extends AbstractModule {

    @Override
    public void configure(){
        RestClient restClient = RestClient.builder(
                new HttpHost("localhost",9200,"http")
        ).build();
        System.out.println("Succesfully connected");}
}
