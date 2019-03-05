package nl.hva.ict.ss.pathfinding.Custom;

import java.util.ArrayList;

public class PrintClass {

    public PrintClass() {

    }

    public  void printResults(ArrayList<Result> resultList) {

        System.out.println("bitmapname");

        for (int i = 0; i < resultList.size() ; i++) {
            System.out.println("" + resultList.get(i).getBitmapName() );

        }

        System.out.println("Tiles");

        for (int i = 0; i < resultList.size() ; i++) {
            System.out.println("" + resultList.get(i).getTiles() );

        }

        System.out.println("Length");

        for (int i = 0; i < resultList.size() ; i++) {
            System.out.println("" + resultList.get(i).getLength() );

        }

        System.out.println("Cost");

        for (int i = 0; i < resultList.size() ; i++) {
            System.out.println("" + resultList.get(i).getCost() );

        }

    }
}
