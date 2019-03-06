package nl.hva.ict.ss.pathfinding.pathfinding;

import java.util.ArrayList;

public class Result {
    private String bitmapName;
    private String tiles;
    private String length;
    private String cost;


    public String getLength() {
        return this.length;
    }

    public String getCost() {
        return this.cost;
    }

    public String getBitmapName() {
        return this.bitmapName;
    }

    public String getTiles() {
        return this.tiles;
    }


    public Result(String bitmapName, String tiles, String length, String cost) {
        this.bitmapName = bitmapName;
        this.tiles = tiles;
        this.length = length;
        this.cost = cost;
    }

}

