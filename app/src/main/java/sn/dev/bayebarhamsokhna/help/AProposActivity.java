package sn.dev.bayebarhamsokhna.help;

import androidx.appcompat.app.AppCompatActivity;
import sn.dev.bayebarhamsokhna.R;

import android.os.Bundle;

public class AProposActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_left);
        setContentView (R.layout.activity_a_propos);
    }
    @Override
    public void finish() {
        super.finish ( );
        overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
