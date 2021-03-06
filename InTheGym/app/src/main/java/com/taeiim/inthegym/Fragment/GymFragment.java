package com.taeiim.inthegym.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.taeiim.inthegym.Activity.DetailActivity;
import com.taeiim.inthegym.R;

/**
 * Created by parktaeim on 2018. 8. 12..
 */

public class GymFragment extends Fragment {
    private View rootView;
    LinearLayout gym_linearlayout1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_gym, container, false);
        gym_linearlayout1 = rootView.findViewById(R.id.gym_linearlayout1);
        gym_linearlayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), DetailActivity.class));
            }
        });

        return rootView;
    }

}
