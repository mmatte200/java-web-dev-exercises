package studios.RestaurantMenu;

public class MenuItem {


    private double price;
    private String category;
    private String description;
    private boolean isNew = true;
    /*/////////////////////////// CONSTRUCTOR /////////////////////////////////*/
    public MenuItem (double price, String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
    }


    /*/////////////////// GETTERS AND SETTERS /////////////////////*/

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }







}

