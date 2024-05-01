package com.quizz.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.quizz.R;
import com.quizz.chaptertopics.TopicActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home_Fragment extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Home_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Home_Fragment newInstance(String param1, String param2) {
        Home_Fragment fragment = new Home_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    CardView heading1,heading2,heading3,heading4;
    ImageView image1,image2,image3,image4;

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
        View view = inflater.inflate(R.layout.fragment_home_, container, false);

        heading1 = view.findViewById(R.id.heading1);
        heading2 = view.findViewById(R.id.heading2);
        heading3 = view.findViewById(R.id.heading3);
        heading4 = view.findViewById(R.id.heading4);

        image1 = view.findViewById(R.id.image1);
        image2 = view.findViewById(R.id.image2);
        image3 = view.findViewById(R.id.image3);
        image4 = view.findViewById(R.id.image4);

        loadImage();

        heading1.setOnClickListener(this);
        heading2.setOnClickListener(this);
        heading3.setOnClickListener(this);
        heading4.setOnClickListener(this);


        return view;
    }


    //load anh tu firebase
    private void loadImage() {
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                .into(image1);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                .into(image2);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                .into(image3);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                .into(image4);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(),TopicActivity.class);
        switch (view.getId()){
            case R.id.heading1:
                intent.putExtra("chapterName","heading1");
                startActivity(intent);
                break;
            case R.id.heading2:
                intent.putExtra("chapterName","heading2");
                startActivity(intent);
                break;
            case R.id.heading3:
                intent.putExtra("chapterName","heading3");
                startActivity(intent);
                break;
            case R.id.heading4:
                intent.putExtra("chapterName","heading4");
                startActivity(intent);
                break;
        }
    }
}