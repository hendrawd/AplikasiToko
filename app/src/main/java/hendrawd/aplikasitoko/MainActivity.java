package hendrawd.aplikasitoko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showOnMap(View view) {
        Util.showOnMap(this, getString(R.string.shop_address));
    }


    public void callOwner(View view) {
        Util.call(this, getString(R.string.shop_phone_number));
    }
}
