package hcmute.edu.vn.nhom14.appfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Food> FoodList;

    public FoodAdapter(Context context, int layout, List<Food> foodList){
        this.context = context;
        this.layout = layout;
        FoodList = foodList;
    }
    @Override
    public int getCount() {
        return FoodList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtTen;
        TextView inRating;
        TextView inPrice;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtTen = (TextView) view.findViewById(R.id.menu_name);
            holder.inRating = (TextView) view.findViewById(R.id.menu_rating);
            holder.inPrice = (TextView) view.findViewById(R.id.menu_price);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        Food food = FoodList.get(i);

        holder.txtTen.setText(food.getTenFood());
        holder.inPrice.setText(food.getPrice());
        holder.inRating.setText(food.getRating());

        return view;
    }
}
