import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.itaykan.fbairlines_project.LandingData;

import java.util.List;

public class MyAdapter extends ArrayAdapter {


    Context _context;
    int _layout;
    Object[] _objects;


    public MyAdapter(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, resource, objects);

        _context = context;
        int layout = 0;
        _layout = layout;
        _objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d("=============", "Get view for " + position);

        View result = convertView;

        if (result == null) {
            Log.d("=======", "Drawing " + position);
            result = LayoutInflater.from(_context).inflate(android.R.layout.simple_list_item_1,
                    parent, false);
        }
        TextView tv = result.findViewById(android.R.id.text1);
        tv.setText(_objects.get(position).toString());

        return result;

    }
    }

