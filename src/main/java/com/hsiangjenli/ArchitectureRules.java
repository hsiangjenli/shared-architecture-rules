package com.hsiangjenli;

import com.enofex.taikai.configures.Customizer;
import com.enofex.taikai.java.JavaConfigurer;
import com.enofex.taikai.quarkus.QuarkusConfigurer;
import com.enofex.taikai.spring.SpringConfigurer;
import com.enofex.taikai.test.TestConfigurer;

public final class ArchitectureRules {

  // TODO: Basic Java Rules
  public static final Customizer<JavaConfigurer> BASE_JAVA_RULES = java -> {};

  // TODO: Basic Spring Rules
  public static final Customizer<SpringConfigurer> BASE_SPRING = spring -> {};

  // TODO: Base Quarkus Rules
  public static final Customizer<QuarkusConfigurer> BASE_QUARKUS = quarkus -> {};

  // TODO: Base Test Rules
  public static final Customizer<TestConfigurer> BASE_TEST = test -> {};
}
