package org.tmlux.tmluxcodebase;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.cassandra.CassandraContainer;
import org.testcontainers.chromadb.ChromaDBContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.elasticsearch.ElasticsearchContainer;
import org.testcontainers.kafka.KafkaContainer;
import org.testcontainers.mssqlserver.MSSQLServerContainer;
import org.testcontainers.neo4j.Neo4jContainer;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

    @Bean
    @ServiceConnection
    CassandraContainer cassandraContainer() {
        return new CassandraContainer(DockerImageName.parse("cassandra:latest"));
    }

    @Bean
    @ServiceConnection
    ChromaDBContainer chromaContainer() {
        return new ChromaDBContainer(DockerImageName.parse("chromadb/chroma:latest"));
    }

    @Bean
    @ServiceConnection
    ElasticsearchContainer elasticsearchContainer() {
        return new ElasticsearchContainer(DockerImageName.parse("elasticsearch:7.17.10"));
    }

    @Bean
    @ServiceConnection
    KafkaContainer kafkaContainer() {
        return new KafkaContainer(DockerImageName.parse("apache/kafka-native:latest"));
    }

    @Bean
    @ServiceConnection
    Neo4jContainer neo4jContainer() {
        return new Neo4jContainer(DockerImageName.parse("neo4j:latest"));
    }

    @Bean
    @ServiceConnection
    PostgreSQLContainer postgresContainer() {
        return new PostgreSQLContainer(DockerImageName.parse("postgres:latest"));
    }

    @Bean
    @ServiceConnection(name = "redis")
    GenericContainer<?> redisContainer() {
        return new GenericContainer<>(DockerImageName.parse("redis:latest")).withExposedPorts(6379);
    }

    @Bean
    @ServiceConnection(name = "redis")
    GenericContainer<?> redisStackContainer() {
        return new GenericContainer<>(DockerImageName.parse("redis/redis-stack:latest")).withExposedPorts(6379);
    }

    @Bean
    @ServiceConnection
    MSSQLServerContainer sqlServerContainer() {
        return new MSSQLServerContainer(DockerImageName.parse("mcr.microsoft.com/mssql/server:latest"));
    }

}
