package hcmute.edu.vn.nhom14.appfood;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class FoodPopularAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<FoodPopular> FoodPopularList;

    public FoodPopularAdapter(Context context, int layout, List<FoodPopular> foodPopularList) {
        this.context = context;
        this.layout = layout;
        FoodPopularList = foodPopularList;
    }

    @Override
    public int getCount() {
        return FoodPopularList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHoler{
        TextView txtTen;
        TextView inRating;
        TextView inPrice;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        FoodPopularAdapter.ViewHoler holder;

        if(view == null){
            holder = new FoodPopularAdapter.ViewHoler();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtTen = (TextView) view.findViewById(R.id.menu_name);
            holder.inRating = (TextView) view.findViewById(R.id.menu_rating);
            holder.inPrice = (TextView) view.findViewById(R.id.menu_price);
            view.setTag(holder);
        }else {
            holder = (FoodPopularAdapter.ViewHoler) view.getTag();
        }

        FoodPopular food = FoodPopularList.get(i);

        holder.txtTen.setText(food.getTenFood());
        holder.inRating.setText(food.getRating());
        holder.inPrice.setText(food.getPrice());
        return view;
    }
}
