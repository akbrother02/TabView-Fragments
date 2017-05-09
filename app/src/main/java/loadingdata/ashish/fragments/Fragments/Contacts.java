package loadingdata.ashish.fragments.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import loadingdata.ashish.fragments.R;

public class Contacts extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_top_rated, container, false);
         
        return rootView;
    }
}