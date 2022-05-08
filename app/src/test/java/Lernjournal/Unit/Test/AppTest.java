/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Lernjournal.Unit.Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {
    @Test 
        public void BussenConverter_keineBusse (){
        Bussenconverter busse = new Bussenconverter();
        Assertions.assertEquals("Keine Busse", busse.convert(0));
    }
    @Test
        public void Bussenconverter_Bussevon20(){
        Bussenconverter busse = new Bussenconverter();
        Assertions.assertEquals("Busse von CHF 20", busse.convert(5));
        }
    @Test 
        public void Bussenconverter_Bussevon60(){
        Bussenconverter busse = new Bussenconverter();
        Assertions.assertEquals("Busse von CHF 60", busse.convert(10));
        }
    @Test
        public void Bussenconverter_Bussevon120(){
        Bussenconverter busse = new Bussenconverter();
        Assertions.assertEquals("Busse von CHF 120", busse.convert(13));
        }
    @Test
        public void Bussenconverter_Bussevon180(){
        Bussenconverter busse = new Bussenconverter();
        Assertions.assertEquals("Busse von CHF 180", busse.convert(16));
        }
    @Test
        public void Bussenconverter_Bussevon260(){
        Bussenconverter busse = new Bussenconverter();
        Assertions.assertEquals("Busse von CHF 260", busse.convert(23));
        }
    @Test
        public void Bussenconverter_AnzeigemitVerwarnung(){
        Bussenconverter busse = new Bussenconverter();
        Assertions.assertEquals("Anzeige mit Verwarnung", busse.convert(29));
        }
    @Test
        public void Bussenconverter_AnzeigeFüE1M(){
        Bussenconverter busse = new Bussenconverter();
        Assertions.assertEquals ("Anzeige und Führerausweisentzug von mind. 1 Monat", busse.convert(33));
        }
}
