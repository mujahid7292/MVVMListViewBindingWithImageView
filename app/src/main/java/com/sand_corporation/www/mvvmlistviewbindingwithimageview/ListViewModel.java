package com.sand_corporation.www.mvvmlistviewbindingwithimageview;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @BindingAdapter("bind:imageURL")
    public static void bindImage(ImageView imageView, String imageURL){
        Picasso.get().load(imageURL).placeholder(R.drawable.ic_launcher_background).into(imageView);
    }
}
