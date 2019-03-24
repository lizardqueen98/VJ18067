package ba.unsa.etf.rma.vj_18067;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static ba.unsa.etf.rma.vj_18067.MainActivity.muzicari;

public class NewActivity extends AppCompatActivity {

    private TextView textView1, textView2, textView3, textView4, textView5, textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        /*Bundle bundle = getIntent().getExtras();
        if(bundle.getString("Muzicar")!=null){
            for(Muzicar m : muzicari){
                if(m.getIme().equals(bundle.getString("Muzicar"))){

                }
            }
        }*/
        //u android manifestu sam dodala mogucnost da se i ova aktivnost poziva odvojeno
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);

        /*
        Muzicar muzicar = muzicari.get(1);

        textView2.setText(muzicar.getIme());
        textView3.setText(muzicar.getPrezime());
        textView4.setText(muzicar.getBiografija());
        textView5.setText(muzicar.getZanr());
        textView6.setText(muzicar.getWebStranica());*/


    }
}
