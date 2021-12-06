package com.example.pakigsabot;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //References:
        ImageButton profileBtn = (ImageButton) view.findViewById(R.id.profileBtn);
        ImageButton shareBtn = (ImageButton) view.findViewById(R.id.shareBtn);
        ImageButton rateBtn = (ImageButton) view.findViewById(R.id.rateBtn);
        ImageButton signOutBtn = (ImageButton) view.findViewById(R.id.signoutHomeBtn);

        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profileScreen();
            }
        });

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareScreen();
            }
        });

        rateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rateScreen();
            }
        });

        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signOutApp();
            }
        });

        return view;
    }

    public void profileScreen(){
        Intent in = new Intent(getActivity(), Profile.class);
        in.putExtra("profile", "profile");
        startActivity(in);
    }

    public void shareScreen(){
        Intent in = new Intent(getActivity(), Share.class);
        in.putExtra("share", "share");
        startActivity(in);
    }

    public void rateScreen(){
        Intent in = new Intent(getActivity(), Rate.class);
        in.putExtra("rate", "rate");
        startActivity(in);
    }

    public void signOutApp(){
        Intent in = new Intent(getActivity(), Signin.class);
        in.putExtra("signin", "signin");
        startActivity(in);
    }
}