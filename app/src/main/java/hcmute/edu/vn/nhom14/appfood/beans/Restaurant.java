package hcmute.edu.vn.nhom14.appfood.beans;

public class Restaurant {
    private int IdFood;
    private String TenFood;
    private String Rating;
    private String Address;

    public Restaurant(int idFood, String tenFood, String rating, String address) {
        IdFood = idFood;
        TenFood = tenFood;
        Rating = rating;
        Address = address;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
