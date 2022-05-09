package Lernjournal.Unit.Test;

 public class Bussenconverter {
    public String convert (int i){
        if (i>0 && i<6){
            return "Busse von CHF 20";
        }
        if (i>=6 && i<11){
            return "Busse von CHF 60";
        }
        if (i>=10 && i<16){
            return "Busse von CHF 120";
        }
        if (i>=16 && i<21){
            return "Busse von CHF 180";
        }
        if (i>=21 && i<26){
            return "Busse von CHF 260";
        }
        if (i>=26 && i<31){
            return "Anzeige mit Verwarnung";
        }
        if (i>=31 && i<35){
            return "Anzeige und Führerausweisentzug von mind. 1 Monat";
        }
        if (i>=35 && i<80){
            return "Anzeige und Führerausweisentzug von mind. 3 Monaten";
        }
        if (i>=80){
            return "Raserdelikt Anzeige, Führerausweisentzug für mind. 2 Jahre, Fahreignungs-Untersuchung";
        }
            return "Keine Busse da keine Geschwindigkeitsüberschreitung";
    }
 }
