package com.quizz.ui.code;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.quizz.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Code_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Code_Fragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Code_Fragment() {
        // Required empty public constructor
    }

    CircleImageView image1,image2,image3,image4,image5,image6,image7,image8;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Code_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Code_Fragment newInstance(String param1, String param2) {
        Code_Fragment fragment = new Code_Fragment();
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
        View view = inflater.inflate(R.layout.fragment_code_, container, false);

        image1 = view.findViewById(R.id.chapter1);
        image2 = view.findViewById(R.id.chapter2);
        image3 = view.findViewById(R.id.chapter3);
        image4 = view.findViewById(R.id.chapter4);
        image5 = view.findViewById(R.id.chapter5);
        image6 = view.findViewById(R.id.chapter6);
        image7 = view.findViewById(R.id.chapter7);
        image8 = view.findViewById(R.id.chapter8);

        loadImage();
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);

        return view;
    }
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
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                .into(image5);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                .into(image6);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                .into(image7);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/quizz-app-773c7.appspot.com/o/linked_list.png?alt=media&token=710de380-87c9-4d7d-86c2-c523ea16085f")
                .into(image8);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(),CodeCategory.class);
        switch (view.getId()){
            case R.id.chapter1:
                intent.putExtra("codeCategory","chapter1");
                startActivity(intent);
                break;
            case R.id.chapter2:
                intent.putExtra("codeCategory","chapter2");
                startActivity(intent);
                break;
            case R.id.chapter3:
                intent.putExtra("codeCategory","chapter3");
                startActivity(intent);
                break;
            case R.id.chapter4:
                intent.putExtra("codeCategory","chapter4");
                startActivity(intent);
                break;
            case R.id.chapter5:
                intent.putExtra("codeCategory","chapter5");
                startActivity(intent);
                break;
            case R.id.chapter6:
                intent.putExtra("codeCategory","chapter6");
                startActivity(intent);
                break;
            case R.id.chapter7:
                intent.putExtra("codeCategory","chapter7");
                startActivity(intent);
                break;
            case R.id.chapter8:
                intent.putExtra("codeCategory","chapter8");
                startActivity(intent);
                break;
        }

    }
}