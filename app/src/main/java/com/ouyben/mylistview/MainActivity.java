package com.ouyben.mylistview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private RelativeLayout activity_main;

    private Context mContext;
    private ParentAdapter mAdapter;
    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        mContext = this;
        mList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            mList.add("");
        }
        mAdapter = new ParentAdapter(mContext, mList);
        listview.setAdapter(mAdapter);
    }

    private void initView() {
        listview = (ListView) findViewById(R.id.listview);
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);
    }
}
