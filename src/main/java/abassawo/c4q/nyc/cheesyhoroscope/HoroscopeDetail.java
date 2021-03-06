package abassawo.c4q.nyc.cheesyhoroscope;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class HoroscopeDetail extends ActionBarActivity {
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String zodiacSign =  getIntent().getStringExtra("zodiacSign");

        setContentView(R.layout.activity_horoscope_detail);


        title = (TextView) findViewById(R.id.signTitle);
        title.setText(zodiacSign);
        //final int zodiacSign =  getIntent().getIntExtra("Zodiac_Sign", zodiacSign);

        //TextView tv = (TextView) findViewById(R.id.zodiac_Detail);
//        if (zodiacSign.equals("Capricorn")){
//            tv.setText("Capricorn");
//        }


        //Log.d("test log", "sign = " + zodiacSign);

        //tv.setText(zodiacSign);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_horoscope_detail, menu);
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