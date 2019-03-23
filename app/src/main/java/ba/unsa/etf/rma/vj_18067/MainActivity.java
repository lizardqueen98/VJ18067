package ba.unsa.etf.rma.vj_18067;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //private Button dugme;
    //private EditText tekst;
    private ListView lista;
    //private ArrayAdapter<String> adapter;
    private CustomAdapter customAdapter;
    public MainActivity mainActivity = null;
    public ArrayList<Muzicar> muzicari = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dugme = (Button)findViewById(R.id.button);
        tekst = (EditText)findViewById(R.id.editText);
        lista = (ListView)findViewById(R.id.listView);
        final ArrayList<String> unosi = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this,R.layout.element_liste,R.id.Itemname,unosi);
        //adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, unosi);
        lista.setAdapter(adapter);
        dugme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                unosi.add(0,tekst.getText().toString());
                adapter.notifyDataSetChanged();
                tekst.setText("");
            }
        });*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.izgled_list_view);

        mainActivity = this;

        /******** Take some data in Arraylist ( CustomListViewValuesArr ) ***********/
        setListData();

        Resources res =getResources();
        lista = ( ListView )findViewById( R.id.list );  // List defined in XML ( See Below )

        /**************** Create Custom Adapter *********/
        customAdapter = new CustomAdapter( mainActivity, muzicari,res );
        lista.setAdapter( customAdapter );
    }
    public void setListData()
    {

        muzicari.add(new Muzicar("Wolfgang", "Mozart", "Salzburg, 27. januara 1756. - Beč, 5. decembar 1791., austrijski skladatelj.", "klasika", "https://hr.wikipedia.org/wiki/Wolfgang_Amadeus_Mozart", "classical"));
        muzicari.add(new Muzicar("Jim", "Morrison", " Melbourne, Florida, 8. decembar 1943. - Pariz, 3. juli 1971., američki pjevač, legendarni vođa rok grupe \"The Doors\"", "rok and roll", "https://bs.wikipedia.org/wiki/Jim_Morrison", "rockkandroll"));
        muzicari.add(new Muzicar("Tim", "Bergling", "Stockholm, 8. septembra 1989. - Muscat, 20. april 2018., poznatiji pod umjetničkim imenom Avicii, bio je švedski DJ, glazbeni producent i mješač zvuka.", "techno", "https://hr.wikipedia.org/wiki/Avicii", "tehno"));
        muzicari.add(new Muzicar("Louis-Daniel", "Armstrong", "New Orleans, 4. august 1901 – New York, 6. juli 1971., bio je američki jazz muzičar.", "jazz", "https://bs.wikipedia.org/wiki/Louis_Armstrong", "dzez"));

    }

    public void onItemClick(int mPosition)
    {
        Muzicar tempValues = ( Muzicar ) muzicari.get(mPosition);


        // SHOW ALERT

        Toast.makeText(mainActivity, ""+tempValues.getIme() +" Image:"+tempValues.getSlikaZanra() +" Url:"+tempValues.getZanr(),
        Toast.LENGTH_LONG).show();
    }
}

