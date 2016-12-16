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
public class IndrodaNaturePark extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.akshardham_layout, container, false);

        ArrayList<Places> arrayList = new ArrayList<Places>();

        arrayList.add(new Places("Indroda Dinosaur and Fossil Park", getString(R.string.in_1),R.drawable.indroda));
        arrayList.add(new Places("Foundation", getString(R.string.in_2),R.drawable.foundation));
        arrayList.add(new Places("Facts", getString(R.string.in_3),R.drawable.facts ));

        CustomAdapter2 adapter = new CustomAdapter2(getActivity(), arrayList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;

    }
}
