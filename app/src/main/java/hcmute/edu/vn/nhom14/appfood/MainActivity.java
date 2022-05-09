package hcmute.edu.vn.nhom14.appfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.webkit.WebHistoryItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    Database databaseMenu;
//    Database databasePopular;
//    Database databaseRecommend;
//
//    ListView lvFood;
//    ListView lvFoodPopular;
//    ListView lvFoodRecommend;
//
//    ArrayList<Food> arrayFood;
//    ArrayList<FoodPopular> arrayFoodPopular;
//    ArrayList<FoodRecommend> arrayFoodRecommend;
//
//    FoodAdapter adapter;
//    FoodPopularAdapter adapterPopular;
//    FoodRecommendAdapter adapterRecommend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        databaseMenu = new Database(this, "food.sqlite", null , 1);
//        databasePopular = new Database(this, "foodPopular.sqlite", null , 1);
//        databaseRecommend = new Database(this, "foodRecommend.sqlite", null , 1);
//        databaseMenu.QueryData("CREATE TABLE IF NOT EXISTS Food(Id INTEGER PRIMARY KEY AUTOINCREMENT, TenMA VARCHAR , Rating VARCHAR , Price VARCHAR)");
//        databasePopular.QueryData("CREATE TABLE IF NOT EXISTS FoodPopular(Id INTEGER PRIMARY KEY AUTOINCREMENT, TenMA VARCHAR , Rating VARCHAR , Price VARCHAR)");
//        databaseRecommend.QueryData("CREATE TABLE IF NOT EXISTS FoodRecommend(Id INTEGER PRIMARY KEY AUTOINCREMENT, TenMA VARCHAR , Rating VARCHAR , Price VARCHAR)");
////        databaseMenu.QueryData("INSERT INTO Food VALUES(null, 'Hamburger' , '4.5', '32')");
////        databasePopular.QueryData("INSERT INTO FoodPopular VALUES(null, 'Hamburger' , '4.5', '32')");
////        databaseRecommend.QueryData("INSERT INTO FoodRecommend VALUES(null, 'Hamburger' , '4.5', '32')");
//
//        lvFood = (ListView) findViewById(R.id.list_menu);
//        lvFoodPopular = (ListView) findViewById(R.id.list_popular);
//        lvFoodRecommend = (ListView) findViewById(R.id.list_recommened);
//
//        arrayFood = new ArrayList<>();
//        arrayFoodPopular = new ArrayList<>();
//        arrayFoodRecommend = new ArrayList<>();
//
//        adapter = new FoodAdapter(this, R.layout.allmenu_recycler_items, arrayFood);
//        adapterPopular = new FoodPopularAdapter(this, R.layout.allmenu_recycler_items, arrayFoodPopular);
//        adapterRecommend = new FoodRecommendAdapter(this, R.layout.allmenu_recycler_items, arrayFoodRecommend);
//
//        lvFood.setAdapter(adapter);
//        lvFoodPopular.setAdapter(adapterPopular);
//        lvFoodRecommend.setAdapter(adapterRecommend);
//        //tạo database Monan
//
//
//
//
//
//
//        //tạo bảng Mena
//
//        //Insert data
//       // database.QueryData("INSERT INTO Menu VALUES(null, 'lam bt')");
//
//        //Select data
//        //Menu
//        Cursor dataFood = databaseMenu.GetData("SELECT * FROM Food");
//        while (dataFood.moveToNext()){
//            String ten = dataFood.getString(1);
//            int id = dataFood.getInt(0);
//            String rating = dataFood.getString(2);
//            String price = dataFood.getString(3);
//            arrayFood.add(new Food(id,ten,rating,price));
//        }
//        //Popular
//        Cursor dataFoodPopular = databasePopular.GetData("SELECT * FROM FoodPopular");
//        while (dataFoodPopular.moveToNext()){
//            String ten = dataFoodPopular.getString(1);
//            int id = dataFoodPopular.getInt(0);
//            String rating = dataFoodPopular.getString(2);
//            String price = dataFoodPopular.getString(3);
//            arrayFoodPopular.add(new FoodPopular(id,ten,rating,price));
//        }
//        //Recommend
//        Cursor dataFoodRecommend = databaseRecommend.GetData("SELECT * FROM FoodRecommend");
//        while (dataFoodRecommend.moveToNext()){
//            String ten = dataFoodRecommend.getString(1);
//            int id = dataFoodRecommend.getInt(0);
//            String rating = dataFoodRecommend.getString(2);
//            String price = dataFoodRecommend.getString(3);
//            arrayFoodRecommend.add(new FoodRecommend(id,ten,rating,price));
//        }
//
//        adapter.notifyDataSetChanged();
//        adapterPopular.notifyDataSetChanged();
//        adapterRecommend.notifyDataSetChanged();
//
    }
}