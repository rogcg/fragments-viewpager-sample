package com.rogcg.fragmentssample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class FirstFragment extends ListFragment
{
    private ArrayList<String> itemsArray = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        itemsArray.add("Item 1");
        itemsArray.add("Item 2");
        itemsArray.add("Item 3");
        itemsArray.add("Item 4");
        itemsArray.add("Item 5");
        itemsArray.add("Item 6");
        itemsArray.add("Item 7");
        itemsArray.add("Item 8");
        itemsArray.add("Item 9");
        itemsArray.add("Item 10");
        itemsArray.add("Item 11");
        itemsArray.add("Item 12");
        itemsArray.add("Item 13");
        itemsArray.add("Item 14");
        itemsArray.add("Item 15");
        itemsArray.add("Item 16");
        itemsArray.add("Item 17");
        itemsArray.add("Item 18");
        itemsArray.add("Item 19");
        itemsArray.add("Item 20");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        // Populates list with our static array
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, itemsArray);
        setListAdapter(adapter);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    @Override
    public void onStart()
    {
        super.onStart();
    }

    @Override
    public void onResume()
    {
        super.onResume();
    }
}

