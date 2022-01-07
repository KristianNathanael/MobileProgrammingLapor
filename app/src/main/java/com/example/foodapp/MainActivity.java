package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.Activity.Adapter.CategoryAdapter;
import com.example.foodapp.Activity.Adapter.PopularAdapter;
import com.example.foodapp.Activity.Domain.CategoryDomain;
import com.example.foodapp.Activity.Domain.FoodDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList, recyclerViewPopularList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewPopular() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList = findViewById(R.id.rc2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodlist = new ArrayList<>();
        foodlist.add(new FoodDomain("Pizza-Beeflovers","pizza1","sausages, beef, beef burger, chicken meat, paprika", 9.76));
        foodlist.add(new FoodDomain("Pizza-BlackpepperBeef","pizza2","blackpepper sauce, beef, sausages, chicken meat, paprika", 8.79));
        foodlist.add(new FoodDomain("Pizza-CheeseChicken","pizza3","cheese melt sauce, chicken meat, mayo sauce, fresh oregano", 8.5));

        adapter2 = new PopularAdapter(foodlist);
        recyclerViewPopularList.setAdapter(adapter2);
    }

    private void recyclerViewCategory(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList = findViewById(R.id.rc1);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("Pizza-BeefLovers", "cat_1"));
        categoryList.add(new CategoryDomain("Pizza-BlackpepperBeef", "cat_2"));
        categoryList.add(new CategoryDomain("Pizza-CheeseChicken", "cat_3"));
        categoryList.add(new CategoryDomain("Pizza-Frankfurter", "cat_4"));
        categoryList.add(new CategoryDomain("Pizza-Splitza", "cat_5"));

        adapter = new CategoryAdapter(categoryList);
        recyclerViewCategoryList.setAdapter(adapter);
    }
}