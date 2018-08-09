package com.example.asus.hujayapps;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class CanvasFragment extends Fragment {

    private CanvasView canvasView;
    private ImageView imageView;
    private Button btnDelete, btnSave;
    private String title;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CanvasFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public CanvasFragment(String title) {
        this.title = title;
    }

    public static CanvasFragment newInstance(String param1, String param2) {
        CanvasFragment fragment = new CanvasFragment();
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
        View v = inflater.inflate(R.layout.fragment_canvas, container, false);

        canvasView = v.findViewById(R.id.canvas);
        imageView = v.findViewById(R.id.ivHuruf);
        btnDelete = v.findViewById(R.id.btnDelete);
        btnSave = v.findViewById(R.id.btnSave);

        imageView.setImageResource(v.getContext().getResources().getIdentifier(title+"nulis",
                "drawable", getActivity().getPackageName()));

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvasView.clearCanvas();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(view.getContext(), android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                        == PackageManager.PERMISSION_GRANTED) {
                    Log.v(TAG,"Permission is granted");
                } else {

                    Log.v(TAG,"Permission is revoked");
                    ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                }

                Toast.makeText(view.getContext(), "Saving...", Toast.LENGTH_SHORT).show();
                try {
                    canvasView.setDrawingCacheEnabled(true);
                    Bitmap bitmap = canvasView.getDrawingCache();
                    File f = null;
                    if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
                        File file = new File(Environment.getExternalStorageDirectory(),"HujayCanvasImages");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        String name = file.getAbsolutePath()+file.separator+title+System.currentTimeMillis()+".png";
                        f = new File(name);
                        Toast.makeText(view.getContext(), name, Toast.LENGTH_LONG).show();
                        Log.d("SAVE", name);
                    }
                    FileOutputStream ostream = new FileOutputStream(f);
                    bitmap.compress(Bitmap.CompressFormat.PNG, 10, ostream);
                    ostream.close();
                } catch(Exception e){
                    e.printStackTrace();
                }
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


    public void clearCanvas(View v) {
        canvasView.clearCanvas();
    }

    public String getTitle() {
        return title;
    }
}
