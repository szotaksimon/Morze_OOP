package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Feladatok {
    private HashMap<String, String> adatok;
    private HashMap<String, String> idezetek;

    public Feladatok(){
        this.adatok = new HashMap<>();
        this.idezetek = new HashMap<>();
        //Beolvasas();
        Beolvasas2();
        kiirSzerzokEsIdezetek();
        //kiir();
        //System.out.println("Karakterek száma: " + karakterekSzama());
        //bekertKarakterMorzeKodja();
    }

    private void Beolvasas() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("morzeabc.txt"));
            br.readLine();
            String sor = br.readLine();
            while(sor != null){
                String [] st = sor.split("\t");
                String betu = st[0];
                String kod = st[1];
                Kod k = new Kod(betu, kod);
                adatok.putIfAbsent(betu, kod);

                sor = br.readLine();
            }
            br.close();
        } catch (IOException e){
            e.getMessage();
        }
    }

    private void Beolvasas2(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("morze.txt"));
            String sor = br.readLine();
            while(sor != null){
                String [] st = sor.split(";");
                String szerzo = st[0];
                String idezet = st[1];
                sor.split("\\s{7}");
                sor.split("\\s{3}");
                Idezet i = new Idezet(szerzo, idezet);
                idezetek.putIfAbsent(szerzo, idezet);

                sor = br.readLine();
            }
            br.close();
        } catch (IOException e){
            e.getMessage();
        }
    }

    private void kiir(){
        for(Map.Entry<String, String> entry : adatok.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    private void kiirSzerzokEsIdezetek(){
        for (Map.Entry<String, String> entry : idezetek.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    private int karakterekSzama(){
        return adatok.size();
    }

    private void bekertKarakterMorzeKodja(){
        System.out.print("Adja meg a keresendő karaktert: ");
        Scanner sc = new Scanner(System.in);
        String karakter = sc.nextLine().toUpperCase();
        if(adatok.containsKey(karakter)){
            System.out.println(karakter + " = " + adatok.get(karakter));
        }else{
            System.out.println("Nem található a kódtárban ilyen karakter.");
        }
    }

    private void Morze2Szoveg(){
        
    }
}
