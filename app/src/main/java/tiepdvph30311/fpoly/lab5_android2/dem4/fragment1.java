package tiepdvph30311.fpoly.lab5_android2.dem4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import tiepdvph30311.fpoly.lab5_android2.R;


public class fragment1 extends Fragment {
    private EditText ednhap;
    private Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment1, container, false);
        ednhap=view.findViewById(R.id.id_ednhap);
        btn=view.findViewById(R.id.id_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }
}