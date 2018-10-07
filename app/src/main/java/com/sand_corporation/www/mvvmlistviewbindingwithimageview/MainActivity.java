package com.sand_corporation.www.mvvmlistviewbindingwithimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.sand_corporation.www.mvvmlistviewbindingwithimageview.Adapter.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<ListViewModel> newsList;
    private CustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        newsList = new ArrayList<>();

        ListViewModel model1 = new ListViewModel();
        model1.setTitle("Kate Winslet");
        model1.setDescription("This is image of Kate Winslet");
        model1.setImageURL("https://e3.365dm.com/18/01/1600x900/skynews-kate-winslet_4217454.jpg?bypass-service-worker&20180129140119");

        ListViewModel model2 = new ListViewModel();
        model2.setTitle("Preity Zinta");
        model2.setDescription("This is image of Preity Zinta");
        model2.setImageURL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpQlUyORVant975sfxA4i3_Nn1RafhxKWv-Xe07UT0rZeDZMW-aQ");

        ListViewModel model3 = new ListViewModel();
        model3.setTitle("Preity Zinta");
        model3.setDescription("This is image of Preity Zinta");
        model3.setImageURL("http://stat3.bollywoodhungama.in/wp-content/uploads/2017/07/SHOCKING-Preity-Zinta-BLASTS-Farhan-Akhtar-and-Ritesh-Sidhwani-for-negatively-portraying-a-character-allegedly-based-on-her-in-their-web-show.jpg");

        ListViewModel model4 = new ListViewModel();
        model4.setTitle("Preity Zinta");
        model4.setDescription("This is image of Preity Zinta");
        model4.setImageURL("https://magazine50.com/wp-content/uploads/2016/07/preity-zinta-hot11.jpg");

        newsList.add(model1);
        newsList.add(model2);
        newsList.add(model3);
        newsList.add(model4);


        mAdapter = new CustomAdapter(MainActivity.this,newsList);
        listView.setAdapter(mAdapter);

    }


}
