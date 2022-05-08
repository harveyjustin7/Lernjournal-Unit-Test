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
            return "Keine Busse";
    }
 }
