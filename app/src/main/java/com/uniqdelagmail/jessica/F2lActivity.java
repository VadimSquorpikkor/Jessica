package com.uniqdelagmail.jessica;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class F2lActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f2l);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_f2l, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // получим идентификатор выбранного пункта меню
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                //
                return true;
            case R.id.action_about:
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(F2lActivity.this);
                builder.setTitle(getString(R.string.about_title))
                        .setMessage(getString(R.string.about_msg))
                        //.setIcon(R.drawable.ic_android_cat)
                        .setCancelable(false)
                        .setNegativeButton("ОК",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onClickSwitchF2lActivity(View view) {

    }

    public void onClickSwitchOllActivity(View view) {
        Intent intent = new Intent(this, OllActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickSwitchPllActivity(View view) {
        Intent intent = new Intent(this, PllActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickSwitchOthActivity(View view) {
        Intent intent = new Intent(this, OthActivity.class);
        startActivity(intent);
        finish();
    }

}