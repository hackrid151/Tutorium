package tutorium.penandpaper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testklasse für @DummyKlasse
 */
public class TestDummyKlasse {
  @Test
  public void testSollte23Liefern() {
    DummyKlasse dummyKlasse = new DummyKlasse();
    assertEquals(23, dummyKlasse.sollte23Liefern(), "Methode liefert nicht das erwartete Ergebnis.");
  }
}
