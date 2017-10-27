package br.edu.ufam.icet.rocha.cleandro.appeduc.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.edu.ufam.icet.rocha.cleandro.appeduc.R;

/**
 * Created by Cleandro Rocha on 25/07/2016.
 */
public class FragmentMC extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mc, container, false);

    }
}
