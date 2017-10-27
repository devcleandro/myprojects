package br.edu.ufam.icet.rocha.cleandro.appeduc.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import br.edu.ufam.icet.rocha.cleandro.appeduc.R;


/**
 * Created by Cleandro Rocha on 25/07/2016.
 */
public class FragmentMA extends Fragment{



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ma, container, false);


    }

}
