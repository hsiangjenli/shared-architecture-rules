package com.hsiangjenli;

import com.enofex.taikai.configures.Customizer;
import com.enofex.taikai.java.JavaConfigurer;
import com.enofex.taikai.quarkus.QuarkusConfigurer;
import com.enofex.taikai.spring.SpringConfigurer;
import com.enofex.taikai.test.TestConfigurer;

public final class ArchitectureRules {

  static int MAX_METHOD_PARAMETERS = 5;

  // TODO: Basic Java Rules
  public static final Customizer<JavaConfigurer> BASE_JAVA_RULES =
      java -> {
        java.noUsageOfDeprecatedAPIs().methodsShouldNotExceedMaxParameters(MAX_METHOD_PARAMETERS);
      };

  // TODO: Basic Spring Rules
  public static final Customizer<SpringConfigurer> BASE_SPRING = spring -> {};

  // TODO: Base Quarkus Rules
  public static final Customizer<QuarkusConfigurer> BASE_QUARKUS = quarkus -> {};

  // TODO: Base Test Rules
  public static final Customizer<TestConfigurer> BASE_TEST = test -> {};
}
