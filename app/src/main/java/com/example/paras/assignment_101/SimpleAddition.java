package com.example.paras.assignment_101;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by paras on 4/28/2018.
 */

//a class SimpleAddition which extends the Fragment class.
public class SimpleAddition extends Fragment {
    //initializing the variables.
    TextView textView;


    // method to mainly connect the layout of the fragment to the fragment's java class.
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle
            savedInstanceState) {
        //inflating the SimpleAddition.java file with the so created layout file for the same.
        return inflater.inflate(R.layout.simple_addition_layout,container,false);
    }

    //a method which is called when the main activity's onCreate is completed.
    // this is used here for the purpose that the UI on the main activity should be created before the textView to be created here.
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //initializing the text view by referencing the EditText's ID.
        textView = (TextView) getActivity().findViewById(R.id.viewText);
    }

    // method to change the text of the text view inside the fragment.
    public void changeText(String data){
        //setting the text of the text view to the data got from the edit text.
        textView.setText(data);
    }
}
