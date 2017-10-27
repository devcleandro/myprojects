package br.edu.ufam.icet.rocha.cleandro.appeduc;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Cleandro Rocha on 25/07/2016.
 */
public class GridviewAdapter extends BaseAdapter {


    private ArrayList<String> listNomeDisc;
    private ArrayList<Integer> listImgDisc;
    private Activity activity;

    public GridviewAdapter(Activity activity, ArrayList<String> listNomeDisc, ArrayList<Integer> listImgDisc){
        super();
        this.listNomeDisc = listNomeDisc;
        this.listImgDisc = listImgDisc;
        this.activity = activity;

    }

    @Override
    public int getCount() {
        return listNomeDisc.size();
    }

    @Override
    public String getItem(int position) {
        return listNomeDisc.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public static class ViewHolder{
        public ImageView imageViewFlag;
        public TextView txtViewTitle;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder view;
        LayoutInflater inflater = activity.getLayoutInflater();
        if(convertView == null){
            view = new ViewHolder();
            convertView = inflater.inflate(R.layout.gridview_row, null);

            view.txtViewTitle = (TextView) convertView.findViewById(R.id.textView1);
            view.imageViewFlag = (ImageView) convertView.findViewById(R.id.imageView1);

            convertView.setTag(view);
        } else {
            view = (ViewHolder) convertView.getTag();
        }
        view.txtViewTitle.setText(listNomeDisc.get(position));
        view.imageViewFlag.setImageResource(listImgDisc.get(position));
        return convertView;
    }
}
