package com.example.app7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.app7.iterater.Iterator;
import com.example.app7.iterater.MyConcreteList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyConcreteList<String> stringMyConcreteList = new MyConcreteList<>();
        stringMyConcreteList.add("啦啦啦");
        stringMyConcreteList.add("扎哈扎");
        Iterator iterator = stringMyConcreteList.iterator();
        while (iterator.hasNext()) {
            Log.e("TAG", "--------" + iterator.next());
        }
    }
}
