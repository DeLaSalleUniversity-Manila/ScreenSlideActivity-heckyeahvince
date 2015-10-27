package com.example.heckyeahvince.hygeiaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WhatToKnowFragment_1 extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_what_to_know_fragment_1, container, false);

        TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
        tv.setText(getArguments().getString("msg"));

        return v;
    }

    public static WhatToKnowFragment_1 newInstance(String text) {

        WhatToKnowFragment_1 f = new WhatToKnowFragment_1();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}