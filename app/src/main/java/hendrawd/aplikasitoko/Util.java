package hendrawd.aplikasitoko;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

/**
 * @author hendrawd on 12/2/17
 */

public class Util {

    /**
     * Memakai alamat untuk membuka google map
     * https://developers.google.com/maps/documentation/urls/android-intents
     *
     * @param context android context
     * @param address alamat
     */
    public static void showOnMap(Context context, String address) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?z=18&q=" + Uri.encode(address));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");

        // Cek apa aplikasi google maps terinstall di phone
        if (mapIntent.resolveActivity(context.getPackageManager()) != null) {
            // kalau terinstall, maka buka aplikasi google maps
            context.startActivity(mapIntent);
        } else {
            // kalau tidak terinstall, maka memunculkan toast dengan pesan "No application to open map"
            Toast.makeText(context.getApplicationContext(), "No application to open map", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Memakai nomor telepon untuk membuka aplikasi telepon default dari android
     *
     * @param context android context
     * @param phone   nomor telepon
     */
    public static void call(Context context, String phone) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        context.startActivity(intent);
    }
}
