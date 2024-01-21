package com.cynor.allshopping;


import android.app.Activity;

import android.content.Intent;

import android.net.Uri;
import android.os.*;

import android.util.*;

import android.view.View;

import android.widget.*;
import android.widget.ImageView;

import java.util.*;


public class about extends Activity {


    private ImageView imageview3;
    private ImageView imageview2;
    private ImageView imageview4;

    private Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_about);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {


        imageview3 = findViewById(R.id.imageview3);
        imageview2 = findViewById(R.id.imageview2);
        imageview4 = findViewById(R.id.imageview4);

        imageview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://in.linkedin.com/in/the-cynor-29525a233"));
                startActivity(intent);
            }
        });

        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://instagram.com/cynor_official?igshid=MzRlODBiNWFlZA=="));
                startActivity(intent);
            }
        });

        imageview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100083637183949"));
                startActivity(intent);
            }
        });
    }

    private void initializeLogic() {
    }


    @Deprecated
    public void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }

    @Deprecated
    public int getLocationX(View _v) {
        int _location[] = new int[2];
        _v.getLocationInWindow(_location);
        return _location[0];
    }

    @Deprecated
    public int getLocationY(View _v) {
        int _location[] = new int[2];
        _v.getLocationInWindow(_location);
        return _location[1];
    }

    @Deprecated
    public int getRandom(int _min, int _max) {
        Random random = new Random();
        return random.nextInt(_max - _min + 1) + _min;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
        ArrayList<Double> _result = new ArrayList<Double>();
        SparseBooleanArray _arr = _list.getCheckedItemPositions();
        for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
            if (_arr.valueAt(_iIdx))
                _result.add((double)_arr.keyAt(_iIdx));
        }
        return _result;
    }

    @Deprecated
    public float getDip(int _input) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}