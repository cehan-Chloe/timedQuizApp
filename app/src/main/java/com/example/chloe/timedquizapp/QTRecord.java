package com.example.chloe.timedquizapp;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Chloe on 2016-10-28.
 */

public class QTRecord extends Activity implements View.OnClickListener{

    EditText inputID;
    Button buttonQuery;
    DB db;

    @Override
    public void onClick(View v) {
        // get The User id
        String userID = inputID.getText().toString();
        if(v.getId() == R.id.btnQuery){
            // fetch the columns form database
            Cursor cursor= db.getRecordData(userID);
//            String storedPassword= cursor.getString(cursor.getColumnIndex("PASSWORD"));
            // ????get the record from QMRecord table?????????

        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_query_qt);

        db = new DB(this);

        inputID = (EditText) findViewById(R.id.id);
        inputID.setOnClickListener(this);

        buttonQuery = (Button) findViewById(R.id.btnQuery);
        buttonQuery.setOnClickListener(this);
    }
}
