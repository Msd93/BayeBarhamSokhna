package sn.dev.bayebarhamsokhna.pdf;

import androidx.appcompat.app.AppCompatActivity;
import sn.dev.bayebarhamsokhna.R;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity extends AppCompatActivity {

    private String langue, theme, article;
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_left);
        setContentView (R.layout.activity_pdf_view);

        Bundle bundle = getIntent ().getBundleExtra ("bundle");
        theme = (String) bundle.get ("theme");
        article = (String) bundle.get ("article");
        langue = (String) bundle.get ("langue");
        pdfView = (PDFView)findViewById (R.id.pdfView);

        if(langue.equals ("fr")){
            pdfView.fromAsset(theme +"/"+ article).defaultPage(0).spacing(0).load();
            this.setTitle (article);
        }
        else if(langue.equals ("ar")){
            pdfView.fromAsset(theme +"/"+ article).defaultPage(0).spacing(0).load();
            this.setTitle (article);
        }
    }

    @Override
    public void finish() {
        super.finish ( );
        overridePendingTransition (R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
