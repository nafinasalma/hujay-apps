package com.example.asus.hujayapps;

import android.annotation.SuppressLint;
import android.content.Context;
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
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HurufFragment extends Fragment {

    MediaPlayer mediaPlayer;
    ImageButton btnNext, btnPrev, btnSound;
    ImageView ivGambar, ivLafadz, ivMenyambung;
    TextView tvTitle, tvCaraPengunaan, tvCaraPenulisan, tvDibacaFathah, tvDibacaKasrah, tvDibacaDhomah;
    TeoriSatuActivity activity;

    private String baca = "Maka dibaca ";

    private String title, teori, order;
    private LinearLayout rlBackground;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentButtonClick mListener;

    public HurufFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public HurufFragment(String title) {
        this.title = title;
    }

    public HurufFragment(String title, String order) {
        this.title = title;
        this.order = order;
    }

//    public static HurufFragment newInstance(String param1, String param2) {
//        HurufFragment fragment = new HurufFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
 //   }

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

        rlBackground = v.findViewById(R.id.rlBackground);
        btnNext = v.findViewById(R.id.ibNextsatu);
        btnPrev = v.findViewById(R.id.ibPrevsatu);

        if(order != null && order.equalsIgnoreCase("pertama"))
            btnPrev.setVisibility(View.INVISIBLE);
        else if(order != null && order.equalsIgnoreCase("terakhir"))
            btnNext.setVisibility(View.INVISIBLE);

        //rlBackground = v.findViewById(R.id.rlBackground);
        //btnNext = v.findViewById(R.id.ibNextsatu);
        //btnPrev = v.findViewById(R.id.ibPrevsatu);
        btnSound = v.findViewById(R.id.ibSoundsatu);
        ivGambar = v.findViewById(R.id.ivSatugambar);
        tvTitle = v.findViewById(R.id.tvTittlesatu);
        tvCaraPengunaan = v.findViewById(R.id.tvCaraPengunaan);
        tvCaraPenulisan = v.findViewById(R.id.tvCaraPenulisan);
        ivLafadz = v.findViewById(R.id.ivLafadz);
        ivMenyambung = v.findViewById(R.id.ivMenyambungHuruf);
        tvDibacaFathah = v.findViewById(R.id.tvDibacaFathah);
        tvDibacaKasrah = v.findViewById(R.id.tvDibacaKasrah);
        tvDibacaDhomah = v.findViewById(R.id.tvDibacaDhomah);

        tvTitle.setText(title);
        tvCaraPengunaan.setText(v.getContext().getResources().getString(getActivity().getResources().getIdentifier(title+"carapengunaan", "string",
                getActivity().getPackageName())));
        tvCaraPenulisan.setText(v.getContext().getResources().getString(getActivity().getResources().getIdentifier(title+"carapenulisan", "string",
                getActivity().getPackageName())));
        tvDibacaFathah.setText(baca+v.getContext().getResources().getString(getActivity().getResources().getIdentifier(title+"fathah", "string",
                getActivity().getPackageName())));
        tvDibacaKasrah.setText(baca+v.getContext().getResources().getString(getActivity().getResources().getIdentifier(title+"kasrah", "string",
                getActivity().getPackageName())));
        tvDibacaDhomah.setText(baca+v.getContext().getResources().getString(getActivity().getResources().getIdentifier(title+"dhomah", "string",
                getActivity().getPackageName())));
        ivLafadz.setImageDrawable(v.getContext().getResources()
                .getDrawable(getActivity().getResources().getIdentifier(title+"harokat", "drawable",
                        getActivity().getPackageName())));
//        ivMenyambung.setImageDrawable(v.getContext().getResources()
//                .getDrawable(getActivity().getResources().getIdentifier("penulisan"+title, "drawable",
//                        getActivity().getPackageName())));
        ivGambar.setImageDrawable(v.getContext().getResources()
                .getDrawable(getActivity().getResources().getIdentifier("hurup"+title, "drawable",
                        getActivity().getPackageName())));

        mediaPlayer = MediaPlayer.create(getContext(), getContext().getResources().getIdentifier(title, "raw", getContext().getPackageName()));
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mediaPlayer.isPlaying())
                    mediaPlayer.start();
                else
                    mediaPlayer.stop();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mListener != null)
                    mListener.onFragmentButtonClick("next");
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mListener != null)
                    mListener.onFragmentButtonClick("prev");
            }
        });
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentButtonClick) {
            mListener = (OnFragmentButtonClick) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentButtonClick {
        void onFragmentButtonClick(String button);
    }

    //public interface OnFragmentInteractionListener {
      //  void onFragmentInteraction(Uri uri);
   // }

    public String getTitle() {
        return title;
    }
}
