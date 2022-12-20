package com.malindu.checkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
    }

    int onequt=1;  /** item1 quantity**/
    int twoqut=1;  /** item2 quantity**/
    int threequt=1; /** item3 quantity**/
    int fourqut=1; /** item4 quantity**/
    int totalprice=0; /** all item total price**/

    public void camone_increase(View view){

        onequt+=1;
        TextView displayInteger =findViewById(R.id.quantityone);

        if (onequt<0){
            onequt=0;

            displayInteger.setText("" + onequt);}
        else {
            displayInteger.setText("" + onequt);
        }

        totalprice();



    }/** itemone increase **/

    public void camone_decrease(View view){

        onequt-=1;

        TextView displayInteger =findViewById(R.id.quantityone);

        if (onequt<0){
            onequt=0;

            displayInteger.setText("" + onequt);}
        else {
            displayInteger.setText("" + onequt);
        }
        totalprice();



    }/** itemone decrease **/

    public void camtwo_increase(View view){

        twoqut+=1;
        TextView displayInteger =findViewById(R.id.quantitytwo);

        if (twoqut<0){
            twoqut=0;

            displayInteger.setText("" + twoqut);}
        else {
            displayInteger.setText("" + twoqut);
        }
        totalprice();



    }/** itemtwo increase **/

    public void camtwo_decrease(View view){

        twoqut-=1;

        TextView displayInteger =findViewById(R.id.quantitytwo);

        if (twoqut<0){
            twoqut=0;

            displayInteger.setText("" + twoqut);}
        else {
            displayInteger.setText("" + twoqut);
        }
        totalprice();



    }/** itemtwo decrease **/

    public void laser_increase(View view){

        threequt+=1;
        TextView displayInteger =findViewById(R.id.quantitythree);

        if (threequt<0){
            threequt=0;

            displayInteger.setText("" + threequt);}
        else {
            displayInteger.setText("" + threequt);
        }
        totalprice();



    }/** itemthree increase **/

    public void laser_decrease(View view){

        threequt-=1;

        TextView displayInteger =findViewById(R.id.quantitythree);

        if (threequt<0){
            threequt=0;

            displayInteger.setText("" + threequt);}
        else {
            displayInteger.setText("" + threequt);
        }
        totalprice();



    }/** itemthree decrease **/

    public void security_increase(View view){

        fourqut+=1;
        TextView displayInteger =findViewById(R.id.quantityfour);

        if (fourqut<0){
            fourqut=0;

            displayInteger.setText("" + fourqut);}
        else {
            displayInteger.setText("" + fourqut);
        }

        totalprice();



    }/** itemfour increase **/

    public void security_decrease(View view){

        fourqut-=1;

        TextView displayInteger =findViewById(R.id.quantityfour);

        if (fourqut<0){
            fourqut=0;

            displayInteger.setText("" + fourqut);}
        else {
            displayInteger.setText("" + fourqut);
        }

        totalprice();



    }/** itemfour decrease **/


    public void totalprice(){

        totalprice=onequt*250+twoqut*350+threequt*450+fourqut*550;
        TextView displayInteger=findViewById(R.id.totalprice);

        displayInteger.setText("$" + totalprice);


    }/**total price**/

    public  void checkout(View view){


        Context context=getApplicationContext();
        CharSequence text="Checkout Successfully!";
        int duration= Toast.LENGTH_LONG;

        Toast toast= Toast.makeText(context,text,duration);
        toast.show();



    }








}