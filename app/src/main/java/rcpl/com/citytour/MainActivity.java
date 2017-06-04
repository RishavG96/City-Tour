package rcpl.com.citytour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    TextView tv;
    RelativeLayout rl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);
        tv=(TextView)findViewById(R.id.textView2);
        rl=(RelativeLayout)findViewById(R.id.rl);
        String name[]={"Mumbai","Delhi","Bangalore","Kolkata","Jaipur","Agra","Chennai","Pune"," Hyderabad","Surat","Ahmedabad"};
        final String des[]=new String[11];
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,name);
        sp.setAdapter(adapter);
        des[0]="Must visit places:\n1.Gateway of India\n2.Elephanta Caves\n3.Haji Ali Dargah\n4.Marine Drive";
        des[1]="Must visit places:\n1.India Gate\n2.Lotus Temple\n3.Birla Mandir\n4.Red Fort\n5.Jama Masjit";
        des[2]="Must visit places:\n1.ISKON Temple\n2.Bull Temple\n3.Maruthi Temple\n4.Dodaganapathi Temple";
        des[3]="Must visit places:\n1.Victoria Memorial\n2.Dakhineswar Kali Temple\n3.Howrah Bridge\n4.St. John's Chruch";
        des[4]="Must visit places:\n1.Hawa Mehal\n2.Amber Fort\n3.Nahargarh Fort\n4.Jalgadh Fort\n5.Govind Devji Temple";
        des[5]="Must visit places:\n1.Taj Mahal\n2.Mehtab Bagh\n3.Sikandra Chini Ka Rouza\n4.Jama Masjid\n5.Rajeshwar temple";
        des[6]="Must visit places:\n1.St. George's Fort\n2.Marina Beach\n3.St Thomas Mount\n4.Anna Zoological Park\n5.Kapaleswar Temple";
        des[7]="Must visit places:\n1.Shaniwar Wada\n2.Vishrambaug Wada\n3.Aga Khan Palace\n4.Raja Dinkar Kelkar Meuseum";
        des[8]="Must visit places:\n1.Charminar\n2.Mecca Masjid\n3.Chowmahalla Palace\n4.Golconda Fort";
        des[9]="Must visit places:\n1.Ambika Niketan Temple\n2.Mughal Sarai\n3.Dutch Garden";
        des[10]="Must visit places:\n1.Gandhi Asharam\n2.Sidi Sayed mosque\n3.Bhadra Fort\n4.Akshardham Temple";
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    rl.setBackgroundResource(R.drawable.mumbai);
                    tv.setText(des[0]);
                }
                else if(position==1)
                {
                    rl.setBackgroundResource(R.drawable.delhi);
                    tv.setText(des[1]);
                }
                else if(position==2)
                {
                    rl.setBackgroundResource(R.drawable.bangalore);
                    tv.setText(des[2]);
                }
                else if(position==3)
                {
                    rl.setBackgroundResource(R.drawable.kolkata);
                    tv.setText(des[3]);
                }
                else if(position==4)
                {
                    rl.setBackgroundResource(R.drawable.jaipur);
                    tv.setText(des[4]);
                }
                else if(position==5)
                {
                    rl.setBackgroundResource(R.drawable.agra);
                    tv.setText(des[5]);
                }
                else if(position==6)
                {
                    rl.setBackgroundResource(R.drawable.chennai);
                    tv.setText(des[6]);
                }
                else if(position==7)
                {
                    rl.setBackgroundResource(R.drawable.pune);
                    tv.setText(des[7]);
                }
                else if (position==8)
                {
                    rl.setBackgroundResource(R.drawable.hyderabad);
                    tv.setText(des[8]);
                }
                else if(position==9)
                {
                    rl.setBackgroundResource(R.drawable.surat);
                    tv.setText(des[9]);
                }
                else if(position==10)
                {
                    rl.setBackgroundResource(R.drawable.ahmedabad);
                    tv.setText(des[10]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
