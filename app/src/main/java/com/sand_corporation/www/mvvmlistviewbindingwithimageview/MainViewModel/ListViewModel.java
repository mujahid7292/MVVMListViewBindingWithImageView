package com.sand_corporation.www.mvvmlistviewbindingwithimageview.MainViewModel;

import android.databinding.BaseObservable;

public class ListViewModel extends BaseObservable {

    public String title, description, imageURL;

    public ListViewModel() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
