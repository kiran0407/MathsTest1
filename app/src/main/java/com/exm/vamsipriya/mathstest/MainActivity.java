package com.exm.vamsipriya.mathstest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText id;
    Button start,highscore;
    String id1,usernam,usermail;
    private String[] levelNames = {"Easy", "Medium", "Hard"};
    private static final int ID_MULTI_CHOICE_DIALOG = R.id.start_btn;
    //private LovelySaveStateHandler saveStateHandler;
    final CharSequence[] items = {" Easy "," Medium "," Hard "," Very Hard "};
    int chosenLevel=2;
    String user,email,uid;
    TextView nam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        nam=(TextView)findViewById(R.id.textView2);
        nam.setText("Welcome");
        start=(Button)findViewById(R.id.start_btn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //id1=id.getText().toString();

                //startActivity(new Intent(MainActivity.this, StartGame.class));

                Intent intent = new Intent(MainActivity.this, StartGame.class);
                intent.putExtra("level", chosenLevel);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//
//
//                builder.setTitle("Choose a level")
//                        .setSingleChoiceItems(levelNames, 0, new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                dialog.dismiss();
//                                //start gameplay
//                                startPlay(which);
//                            }
//                        });
//                AlertDialog ad = builder.create();
//                ad.show();



            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
