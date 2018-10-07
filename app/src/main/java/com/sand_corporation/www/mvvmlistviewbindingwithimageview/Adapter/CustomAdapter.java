package com.sand_corporation.www.mvvmlistviewbindingwithimageview.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.sand_corporation.www.mvvmlistviewbindingwithimageview.ListViewModel;
import com.sand_corporation.www.mvvmlistviewbindingwithimageview.R;
import com.sand_corporation.www.mvvmlistviewbindingwithimageview.databinding.ListViewBinding;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<ListViewModel> newsList;
    private ListViewBinding listViewBinding;

    public CustomAdapter(Context mContext, ArrayList<ListViewModel> newsList) {
        this.mContext = mContext;
        this.newsList = newsList;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int position) {
        return newsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.single_news,null);
            listViewBinding = DataBindingUtil.bind(convertView);
            convertView.setTag(listViewBinding);
        } else {
            listViewBinding = (ListViewBinding) convertView.getTag();
        }
        listViewBinding.setListViewModel(newsList.get(position));

        return listViewBinding.getRoot();
    }
}
