package com.reetika.mywork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

 public class details extends AppCompatActivity() {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @override fun onCreate(savedInstanceState: Bundle?) {
        protected.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details)

        radioGroup = findviewById(R.id.radioGroup);
        textView = findViewById(R.id.button_apply);

        Button buttonApply = findViewById (R.Id.button_apply);
        buttonApply.setOnclick(view v) {

        }
    });

    public void checkButton(vies v){
        int radioId = radioGroup.getcheckedRadiobuttonId();

        radioButton=findViewById(radioId);
        toast.makeText( context:this,"selected Radio Button: "+radioButton.getText(),Toast.LENGTH_SHORT.show())
    }
}