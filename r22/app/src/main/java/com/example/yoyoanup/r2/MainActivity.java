package com.example.yoyoanup.r2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  /*  private static Button english, hindi,russian,submit,btn;
    private static TextView chooseText;
    private static Locale myLocale;

    //Shared Preferences Variables
    private static final String Locale_Preference = "Locale Preference";
    private static final String Locale_KeyValue = "Saved Locale";
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        language obj=new language();
        obj.initViews();
        obj.setListeners();
        obj.loadLocale();
    }

    //Initiate all views
/*    private void initViews() {
        sharedPreferences = getSharedPreferences(Locale_Preference, Activity.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        chooseText = (TextView) findViewById(R.id.choose_text);
        english = (Button) findViewById(R.id.english);
        hindi = (Button) findViewById(R.id.hindi);
        russian = (Button) findViewById(R.id.russian);
        btn=(Button)findViewById(R.id.submitt);
    }

    //Set Click Listener
    private void setListeners() {
        english.setOnClickListener(this);
        hindi.setOnClickListener(this);
        russian.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String lang = "en";//Default Language
        switch (view.getId()) {
            case R.id.english:
                lang = "en";
                Intent i=new Intent(this,sec.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);

                break;
            case R.id.hindi:
                lang = "hi";
                Intent i1=new Intent(this,sec.class);
                i1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i1);
                break;
            case R.id.russian:
                lang = "ru";
                Intent i2=new Intent(this,sec.class);
                i2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i2);
                break;
        }

        changeLocale(lang);//Change Locale on selection basis
    }


    //Change Locale
    public void changeLocale(String lang) {
        if (lang.equalsIgnoreCase(""))
            return;
        myLocale = new Locale(lang);//Set Selected Locale
        saveLocale(lang);//Save the selected locale
        Locale.setDefault(myLocale);//set new locale as default
        Configuration config = new Configuration();//get Configuration
        config.locale = myLocale;//set config locale as selected locale
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());//Update the config
        updateTexts();//Update texts according to locale
    }


    //Save locale method in preferences
    public void saveLocale(String lang) {
        editor.putString(Locale_KeyValue, lang);
        editor.commit();
    }


    //Get locale method in preferences
    public void loadLocale() {
        String language = sharedPreferences.getString(Locale_KeyValue, "");
        changeLocale(language);
    }

    //Update text methods
    private void updateTexts() {
        chooseText.setText(R.string.tap_text);
        english.setText(R.string.btn_en);
        hindi.setText(R.string.btn_hi);
        russian.setText(R.string.btn_ru);
        btn.setText(R.string.submit_btn);
    }

    public void go(View view) {
        Intent i=new Intent(this,sec.class);
        startActivity(i);
    }
   */
}
