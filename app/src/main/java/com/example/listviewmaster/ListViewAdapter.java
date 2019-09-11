package com.example.listviewmaster;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    public ArrayList<Model> casheirsList;
    Activity activity;

    public ListViewAdapter(Activity activity, ArrayList<Model> casheirsList) {
        super();
        this.activity = activity;
        this.casheirsList = casheirsList;
    }

    @Override
    public int getCount() {
        return casheirsList.size();
    }

    @Override
    public Object getItem(int position) {
        return casheirsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        TextView No;
        TextView Name;
        TextView Login;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {

        ViewHolder holder;
        LayoutInflater inflater = activity.getLayoutInflater();


        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_row, null);

            holder = new ViewHolder();
            holder.No = (TextView) convertView.findViewById(R.id.no);
            holder.Name = (TextView) convertView.findViewById(R.id.name);
            holder.Login = (TextView) convertView
                    .findViewById(R.id.login);

            convertView.setTag(holder);
            convertView.findViewById(R.id.edit).setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            Toast.makeText(parent.getContext(),"Edite Clicked.",Toast.LENGTH_SHORT).show();
                        }
                    }
            );
            convertView.findViewById(R.id.delete).setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            Toast.makeText(parent.getContext(),"Delete Clicked. ",Toast.LENGTH_SHORT).show();
                        }
                    }
            );
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Model item = casheirsList.get(position);
        holder.No.setText(item.getsNo().toString());
        holder.Name.setText(item.getName().toString());
        holder.Login.setText(item.getLogin().toString());

        return convertView;
    }

}
