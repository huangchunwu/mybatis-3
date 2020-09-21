package org.apache.ibatis.testcontainers;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
public class MixedLifecycleTests {

  // will be shared between test methods
  @Container
  private static final MySQLContainer MY_SQL_CONTAINER = new MySQLContainer();

  // will be started before and stopped after each test method
  @Container
  private final PostgreSQLContainer postgresqlContainer = new PostgreSQLContainer()
    .withDatabaseName("foo")
    .withUsername("foo")
    .withPassword("secret");

  @Test
  void test() {
    assertTrue(MY_SQL_CONTAINER.isRunning());
    assertTrue(postgresqlContainer.isRunning());
  }
}
