package com.example.paras.assignment_101;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //initializing the variables.
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //attaching the layout file with the java file.
        setContentView(R.layout.activity_main);
        //initializing the edit text by referencing the EditText's ID.
        editText = (EditText) findViewById(R.id.inputTextField);
        //initializing the button by referencing the Button's ID.
        button = (Button) findViewById(R.id.btnSubmit);
        //setting the onclick listener to the button.
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {    //onClick function.
        if (view.getId() == R.id.btnSubmit){    //checking if the desired button is pressed.

            // get the fragment manager object's instance in variable manager.
            FragmentManager manager = getFragmentManager();
            //creating object of the fragment defined in SimpleAddition class.
            SimpleAddition simpleAddition = (SimpleAddition) manager.findFragmentById(R.id.fragment);
            //calling the changeText function in SimpleAddition Fragment and passing the string received from edit text.
            simpleAddition.changeText(editText.getText().toString());
        }
    }
}
