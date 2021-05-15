package studios.restrauntmenu;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean newItem;

    public String getName(){
        return name;
    }
    public void setMenuName(String aName){
        name = aName;
    }

    public Double getPrice(){
        return price;
    }
    public void setPrice(Double aPrice){
        price = aPrice;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String aDescription){
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String aCategory){
        category = aCategory;
    }

    public Boolean getNewItem(){
        return newItem;
    }
    public void setNewItem(Boolean aNewItem){
        newItem = aNewItem;
    }
}
