package com.example.bupt.ex4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String NAME="name";
    private final static String CLASSES="classes";
    private final static String NUMBER="number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = {"蔡","蔡凡","qwe"};
        String[] classes = {"计科1505","计科1508","网工1501"};
        String[] number = {"357","456","159"};

        List<Map<String,Object>> items = new ArrayList<>();

        for(int i = 0;i < name.length;i++){
            Map<String,Object> item = new HashMap<>();
            item.put(NAME,name[i]);
            item.put(CLASSES,classes[i]);
            item.put(NUMBER,number[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,CLASSES,NUMBER},new int[]{R.id.txtName,R.id.txtClasses,R.id.txtNumber});
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}

