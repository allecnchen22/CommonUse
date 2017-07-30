package com.example.allenchen.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class PageFragment extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters

    private int regImageId=0;

    public PageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment PageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PageFragment newInstance(int regImageId) {
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("regImageId",regImageId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("TAG","onCreate");
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            regImageId=getArguments().getInt("regImageId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d("TAG","onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d("TAG","onViewCreated");

        ImageView iv= (ImageView) view.findViewById(R.id.imageView);

        iv.setImageResource(regImageId);

    }

    @Override
    public void onAttach(Context context) {
        Log.d("TAG","onAttach");
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        Log.d("TAG","onDetach");
        super.onDetach();
    }

}
