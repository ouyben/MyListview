package com.ouyben.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * TODO :
 * Created by owen
 * on 2016-10-13.
 */

public class ChildAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mList;
    private LayoutInflater mInflater;

    public ChildAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        ViewHolder holder;
        if (v == null) {
            v = mInflater.inflate(R.layout.item_child, parent, false);
            holder = new ViewHolder(v);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }
        holder.tv.setText("Parent item:" + mList.size() + ", Child item:" + position);
        return v;
    }

    public static class ViewHolder {
        public TextView tv;

        public ViewHolder(View rootView) {
            this.tv = (TextView) rootView.findViewById(R.id.tv);
        }

    }
}
