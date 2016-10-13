package com.ouyben.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO :
 * Created by owen
 * on 2016-10-13.
 */

public class ParentAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mList;
    private LayoutInflater mInflater;

    public ParentAdapter(Context context, List<String> list) {
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
            v = mInflater.inflate(R.layout.item_parent, parent, false);
            holder = new ViewHolder(v);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < position + 1; i++) {
            strings.add("" + i);
        }
        ChildAdapter adapter = new ChildAdapter(mContext, strings);
        holder.child_listview.setAdapter(adapter);
        return v;
    }

    public static class ViewHolder {
        public FullListview child_listview;

        public ViewHolder(View rootView) {
            this.child_listview = (FullListview) rootView.findViewById(R.id.child_listview);
        }

    }
}
