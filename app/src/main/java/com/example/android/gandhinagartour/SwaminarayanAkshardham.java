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
public class SwaminarayanAkshardham extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.akshardham_layout, container, false);

        ArrayList<Places> arrayList = new ArrayList<Places>();
        arrayList.add(new Places("Akshardham Mandir", getString(R.string.ak_d_1), R.drawable.akshardhamf));
        arrayList.add(new Places("Exhibition Halls", getString(R.string.ak_d_2), R.drawable.exibition));
        arrayList.add(new Places("Sat-Chit-Anand Water Show", getString(R.string.ak_d_3), R.drawable.watershow));
        arrayList.add(new Places("AARSH (Akshardham Centre for Applied Research in Social Harmony)", getString(R.string.ak_d_4), R.drawable.research));
        arrayList.add(new Places("Sahajanand Van", getString(R.string.ak_d_5), R.drawable.sahjanandvan));
        arrayList.add(new Places("Terror Attack", getString(R.string.ak_d_6), R.drawable.terrorist));
        CustomAdapter adapter = new CustomAdapter(getActivity(),arrayList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
