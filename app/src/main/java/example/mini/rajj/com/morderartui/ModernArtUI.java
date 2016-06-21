package example.mini.rajj.com.morderartui;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;


public class ModernArtUI extends ActionBarActivity {

    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i=0;
        final View view_one=findViewById(R.id.view_01);
        final View view_two=findViewById(R.id.view_02);
        final View view_three=findViewById(R.id.view_03);
        final View view_five=findViewById(R.id.view_05);

        view_one.setBackgroundColor(Color.rgb(102,102,255));
        view_two.setBackgroundColor(Color.rgb(255,153,204));
        view_three.setBackgroundColor(Color.rgb(155,0,0));
        view_five.setBackgroundColor(Color.rgb(0,0,204));
        seekBar=(SeekBar)findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int increment, boolean fromUser) {

                view_one.setBackgroundColor(Color.rgb(102+increment,102+increment,255));
                view_two.setBackgroundColor(Color.rgb(255,153+increment,204+increment));
                view_three.setBackgroundColor(Color.rgb(155-increment,0,0+increment));
                view_five.setBackgroundColor(Color.rgb(0+increment+100,0+increment,204));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
      //if you touch the seek bar what will happen??
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

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
            final AlertDialog.Builder builder = new AlertDialog.Builder(ModernArtUI.this);
            builder.setTitle("Inspired by the works of artists such as Piet Mondrian and Ben Nicolson.");
            builder.setMessage("Click below to learn more!");
            builder.setPositiveButton("Visit MOMA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Uri uri = Uri.parse("http://www.MoMA.org");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("Not Now", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            builder.create();
            builder.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
