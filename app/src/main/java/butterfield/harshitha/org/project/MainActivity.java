package butterfield.harshitha.org.project;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay1, rellay2;
    TextView appName;


    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
            appName.setVisibility(View.INVISIBLE);
        }
    };

    private Button btn_login;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

appName = (TextView) findViewById(R.id.appName);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);

        handler.postDelayed(runnable , 2000);


        btn_login = (Button) findViewById(R.id.btn_login);
btn_login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick( View v ) {
        Intent intent = new Intent(MainActivity.this,
                LandingPage.class);
        startActivity(intent);

    }
});
    }
}
