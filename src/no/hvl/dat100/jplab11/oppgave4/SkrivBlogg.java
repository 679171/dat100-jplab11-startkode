package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        try (PrintWriter writer = new PrintWriter(mappe + "/" + filnavn)) {
            writer.print(samling.toString());
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
 
        Blogg blogg = new Blogg();
       

      
        String mappe = "/Users/tobiasmanthey/Documents/test";
        String filnavn = "blogg.dat";

      
        boolean success = skriv(blogg, mappe, filnavn);

        if (success) {
            System.out.println("Blogg written to file successfully.");
        } else {
            System.out.println("Failed to write blogg to file.");
        }
    }
}
