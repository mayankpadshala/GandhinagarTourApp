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
public class SaritaUdhyan extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.akshardham_layout, container, false);

        ArrayList<Places> arrayLists = new ArrayList<Places>();

        arrayLists.add(new Places("One", getString(R.string.s_1), R.drawable.one ));
        arrayLists.add(new Places("Two", getString(R.string.s_1), R.drawable.twoo));
        arrayLists.add(new Places("Three", getString(R.string.s_1), R.drawable.threee));
        arrayLists.add(new Places("Four", getString(R.string.s_1), R.drawable.fourr));

        CustomAdapter2 adapter = new CustomAdapter2(getActivity(),arrayLists);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
