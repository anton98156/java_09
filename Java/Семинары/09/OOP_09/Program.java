package OOP_09;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {

        Сomputer airGray = new Сomputer ("MacBook Air", "M1", 79990, 8);
        Сomputer airSilver = new Сomputer ("MacBook Air", "M1", 80990, 8);
        Сomputer airGold = airSilver;
        Сomputer proGray = new Сomputer ("MacBook Pro", "I6", 76990, 8);
        Сomputer proSilver = new Сomputer ("MacBook Pro", "M1", 99090, 16);
        Сomputer proGold = new Сomputer ("MacBook Pro", "M2", 140990, 16);
        
        ArrayList<Сomputer> macbooks = new ArrayList<>();
        macbooks.add(airGray);
        macbooks.add(airSilver);
        macbooks.add(airGold);
        macbooks.add(proGray);
        macbooks.add(proSilver);
        macbooks.add(proGold);

        
        System.out.println(airGold.compareTo(proSilver));
        System.out.println(proGold.compareTo(airSilver));
        System.out.println(airGold.compareTo(airSilver));


        Collections.sort(macbooks);
        System.out.println("\nСортировка по возрастанию цены: ");
        System.out.println(macbooks);

        Collections.reverse(macbooks);
        System.out.println("\nСортировка по убыванию цены: ");
        System.out.println(macbooks);
        
    }
}
