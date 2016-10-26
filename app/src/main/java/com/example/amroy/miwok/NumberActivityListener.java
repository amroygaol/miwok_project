package com.example.amroy.miwok;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by AMROY on 26/10/2016.
 */

public class NumberActivityListener extends NumbersActivity {

    public void onClick(View view) {
        Toast toast = Toast.makeText(view.getContext(),
                "NUMBERS", Toast.LENGTH_LONG);
        toast.show();
    }
}
