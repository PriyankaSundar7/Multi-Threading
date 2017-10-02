package source.kiddoolearn.priyanka.multithread;

import android.os.Handler;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView tv;
    Handler h= new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView);
        h.postDelayed(run,1000);}
        Runnable run= new Runnable() {
            @Override
            public void run() {
call();
            }
            public void call()
            {
                tv.setText(""+ (Integer.parseInt(tv.getText().toString())-1));
                if(Integer.parseInt(tv.getText().toString())==0) {
                    b1.setVisibility(View.VISIBLE);
                }
                else
                    h.postDelayed(run,1000);

            }
        };

    }
