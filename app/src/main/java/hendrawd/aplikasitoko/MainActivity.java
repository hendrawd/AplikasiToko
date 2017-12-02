package hendrawd.aplikasitoko;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // cara pakai onClick programmatically dari java
        // TextView tvPhone = findViewById(R.id.tv_phone);
        // tvPhone.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //     public void onClick(View view) {
        //         Util.call(MainActivity.this, getString(R.string.shop_phone_number));
        //     }
        // });
    }

    public void showOnMap(View view) {
        Util.showOnMap(this, getString(R.string.shop_address));
    }


    public void callOwner(View view) {
        Util.call(MainActivity.this, getString(R.string.shop_phone_number));
    }
}
