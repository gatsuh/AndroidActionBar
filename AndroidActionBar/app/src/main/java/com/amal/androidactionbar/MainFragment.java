package com.amal.androidactionbar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    @Override
    public  View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.main_fragment, container, false);

        return view;
    }

}
