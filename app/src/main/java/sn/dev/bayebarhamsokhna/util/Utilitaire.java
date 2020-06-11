package sn.dev.bayebarhamsokhna.util;

import android.content.Context;
import android.widget.Toast;

public class Utilitaire {
    public static void showMessage(Context context, String message, int duration){
        Toast.makeText (context, message, duration).show ();
    }
}
