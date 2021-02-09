package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConverterTest {

  //constant variables have "static final", SCREAMING_SNAKE_CASE
  static final float CELSIUS_TOLERANCE    = 0.001f;
  static final float FAHRENHEIT_TOLERANCE = 0.0018f;
  static final float[] celsius            = {-40, 0, 100};
  static final float[] fahrenheit         = {-40, 32, 212};

  @Test
  void convertFToC() {
    assertEquals(100.55555, TempConverter.convertFToC(213), CELSIUS_TOLERANCE);

    for (int i = 0; i < celsius.length; i++) {
      float expected = celsius[i];
      float actual = TempConverter.convertFToC(fahrenheit[i]);
      System.out.printf("Expected celsius = %.3f; input fahrenheit = %.3f; actual celsius = %.3f%n",
          expected, fahrenheit[i], actual);
      assertEquals(expected, actual, CELSIUS_TOLERANCE);
    }
  }

  @Test
  void convertCToF() {
    for (int i = 0; i < fahrenheit.length; i++) {
      float expected = fahrenheit[i];
      float actual = TempConverter.convertCToF(celsius[i]);
      System.out.printf(
          "Expected fahrenheit = %.3f; input celsius = %.3f; actual fahrenheit = %.3f%n",
          expected, celsius[i], actual);
      assertEquals(fahrenheit[i], TempConverter.convertCToF(celsius[i]), FAHRENHEIT_TOLERANCE);
    }
  }
}