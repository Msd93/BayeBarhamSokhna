package sn.dev.bayebarhamsokhna.theme;

import androidx.appcompat.app.AppCompatActivity;
import sn.dev.bayebarhamsokhna.R;
import sn.dev.bayebarhamsokhna.pdf.PdfViewActivity;
import sn.dev.bayebarhamsokhna.util.Utilitaire;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Theme0Activity extends AppCompatActivity {

    private Button btnArabe, btnFrancais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_left);
        setContentView (R.layout.activity_theme0);

        // Button pour ouvrir les documents suivant le langage
        btnArabe = (Button)findViewById (R.id.btnarticle0Arabe);
        btnFrancais = (Button)findViewById (R.id.btnarticle0Francais);

        btnFrancais.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext (), PdfViewActivity.class);

                Bundle bundle = new Bundle ();
                bundle.putString ("theme", "theme0");
                bundle.putString ("article", "alhamdouilahi_f.pdf");
                bundle.putString ("langue", "fr");
                intent.putExtra ("bundle", bundle);

                startActivity (intent);
            }
        });
        btnArabe.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext (), PdfViewActivity.class);

                Bundle bundle = new Bundle ();
                bundle.putString ("theme", "theme0");
                bundle.putString ("article", "alhamdouilahi_a.pdf");
                bundle.putString ("langue", "ar");
                intent.putExtra ("bundle", bundle);

                startActivity (intent);
            }
        });
    }

    @Override
    public void finish() {
        super.finish ( );
        overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_left);
    }

}
