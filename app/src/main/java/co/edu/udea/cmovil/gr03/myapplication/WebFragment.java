package co.edu.udea.cmovil.gr03.myapplication;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class WebFragment extends Fragment {


    WebView mWebView;

    public WebFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View x = inflater.inflate(R.layout.fragment_web, container, false);
        mWebView = (WebView)x.findViewById(R.id.webView);

        String url = "http://www.nomadicmatt.com/travel-blogs/ten-historical-sites/";
        // probably a good idea to check it's not null, to avoid these situations:
        if(mWebView != null){
            mWebView.loadUrl(url);
            mWebView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }
            });
        }

        return x;

    }


}
