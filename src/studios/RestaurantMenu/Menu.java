package studios.RestaurantMenu;

import studios.RestaurantMenu.MenuItem;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public void addItem(MenuItem newItem){
        this.items.add(newItem);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem item){
        this.items.remove(item);
    }

    public ArrayList<MenuItem> getItems(){
        return items;
    }

    public Date getLastUpdated(){
        return lastUpdated;
    }


}

/*
* Menu-multiple menu items ArrayList */