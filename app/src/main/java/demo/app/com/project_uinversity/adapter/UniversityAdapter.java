package demo.app.com.project_uinversity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import demo.app.com.project_uinversity.R;
import demo.app.com.project_uinversity.model.UniversityModel;

public class UniversityAdapter extends BaseAdapter {
    private Context context;
    private List<UniversityModel> modelList;

    public UniversityAdapter(Context context, List<UniversityModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = View.inflate(context, R.layout.university,null);
        TextView textViewName = view.findViewById(R.id.txt_schoolName);
        ImageView imgLogo = view.findViewById(R.id.img_logo);

        UniversityModel profile = modelList.get(position);
        imgLogo.setImageResource(profile.getImgId());
        textViewName.setText(profile.getSchoolName());

        return view;
    }
}
