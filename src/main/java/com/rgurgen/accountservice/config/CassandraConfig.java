package com.rgurgen.accountservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${spring-cassandra.name.cassandra.keyspace.name}")
    private String keyspaceName;

    @Value("${spring-cassandra.name.cassandra.contact.point}")
    private String contactPoint;

    @Value("${spring-cassandra.name.cassandra.local-datacenter}")
    private String localDataCenter;

    @Value("${spring-cassandra.cassandra.basePackages}")
    private String basePackages;

    @Value("${spring-cassandra.name.cassandra.port}")
    private int port;

    @Value("${spring-cassandra.cassandra.username}")
    private String username;

    @Value("${spring-cassandra.cassandra.password}")
    private String password;

    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }

    @Override
    protected String getContactPoints() {
        return contactPoint;
    }

    @Override
    protected String getLocalDataCenter() {
        return localDataCenter;
    }

    @Override
    protected int getPort() {
        return port;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{basePackages};
    }
}
