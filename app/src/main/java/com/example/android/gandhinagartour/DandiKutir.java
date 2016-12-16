package com.example.android.gandhinagartour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mind on 15/12/16.
 */
public class DandiKutir extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.akshardham_layout, container,false);

        ArrayList<Places> arrayLists = new ArrayList<Places>();

        arrayLists.add(new Places("My life is my message(Gallery)", getString(R.string.kut_1), R.drawable.kutir));
        arrayLists.add(new Places("Gandhi in Ahmedabad", getString(R.string.kut_2), R.drawable.gandhiahm));
        arrayLists.add(new Places("Upasana Mandir", getString(R.string.kut_3), R.drawable.upasana));
        arrayLists.add(new Places("Library", getString(R.string.kut_4), R.drawable.library));
        arrayLists.add(new Places("Archives", getString(R.string.kut_5), R.drawable.archives));
        arrayLists.add(new Places("Ashram book store", getString(R.string.kut_6), R.drawable.bookstore));

        CustomAdapter adapter1 = new CustomAdapter(getActivity(),arrayLists);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter1);

        return rootView;
    }
}
