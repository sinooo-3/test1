package com.example.test1.Ui.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.example.test1.R;

public class FragmentThree extends Fragment {
    RadioButton rb_left,rb_right;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.right3, container, false);
        rb_left= (RadioButton) v.findViewById(R.id.rb_left);
        rb_right= (RadioButton) v.findViewById(R.id.rb_right);
        initEvent();
        return v;

    }

    private void initEvent() {



    }


}
