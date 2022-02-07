package com.example.taboan_capstone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class admin extends Fragment {

    Button btn_add, btn_update, btn_report, btn_inventory;
    TextView tv_admin;
    public admin() {
        // Required empty public constructor
    }


    public static admin newInstance(String param1, String param2) {
        admin fragment = new admin();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_admin, container, false);

        btn_add = v.findViewById(R.id.btn_add);
        btn_update = v.findViewById(R.id.btn_update);
        btn_report = v.findViewById(R.id.btn_report);
        btn_inventory = v.findViewById(R.id.btn_inventory);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addProducts addProducts1 = new addProducts();
                FragmentTransaction transaction = getFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_slide_right, R.anim.exit_slide_left, R.anim.enter_slide_left, R.anim.exit_slide_right);
                transaction.replace(R.id.mainLayout, addProducts1).addToBackStack("tag");
                transaction.commit();
            }
        });
        return v;
    }

}