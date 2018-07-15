package com.example.asus.hujayapps;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HurufFragment extends Fragment {

    MediaPlayer mediaPlayer;
    ImageButton btnNext, btnPrev, btnSound, btnPopup;
    ImageView ivGambar;
    TextView tvTitle, tvTeori;
    TeoriSatuActivity activity;

    private String title, teori;
    private LinearLayout rlBackground;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public HurufFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public HurufFragment(String title) {
        this.title = title;
    }

    public static HurufFragment newInstance(String param1, String param2) {
        HurufFragment fragment = new HurufFragment();
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

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_huruf, container, false);

        activity = (TeoriSatuActivity) getActivity();
        rlBackground = v.findViewById(R.id.rlBackground);
        btnNext = v.findViewById(R.id.ibNextsatu);
        btnPrev = v.findViewById(R.id.ibPrevsatu);
        btnSound = v.findViewById(R.id.ibSoundsatu);
        btnPopup = v.findViewById(R.id.ibMakhrojsatu);
        ivGambar = v.findViewById(R.id.ivGambar);
        tvTitle = v.findViewById(R.id.tvTittlesatu);
        tvTeori = v.findViewById(R.id.tvTeorisatu);


        tvTitle.setText(title);
        tvTeori.setText(v.getContext().getResources().getString(getActivity().getResources().getIdentifier("teori"+title, "string",
                getActivity().getPackageName())));
//        ivGambar.setImageDrawable(v.getContext().getResources()
//                .getDrawable(getActivity().getResources().getIdentifier(title+"bg", "drawable",
//                        getActivity().getPackageName())));

        final MediaPlayer mp = MediaPlayer.create(v.getContext(), v.getContext().getResources().getIdentifier(title, "raw",
                v.getContext().getPackageName()));
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()) mp.start();
                else mp.stop();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.nextItem();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.prevItem();
            }
        });
        return v;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    public String getTitle() {
        return title;
    }
}
