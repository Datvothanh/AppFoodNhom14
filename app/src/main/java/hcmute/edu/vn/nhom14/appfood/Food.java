package hcmute.edu.vn.nhom14.appfood;

public class Food {
    private int IdFood;
    private String TenFood;
    private String Rating;
    private String Price;

    public Food(int idfood, String tenfood, String numberrating, String price){
        IdFood = idfood;
        TenFood = tenfood;
        Rating = numberrating;
        Price = price;
    }

    public int getIdFood() {
        return IdFood;
    }

    public void setIdFood(int idFood) {
        IdFood = idFood;
    }

    public String getTenFood() {
        return TenFood;
    }

    public void setTenFood(String tenFood) {
        TenFood = tenFood;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
