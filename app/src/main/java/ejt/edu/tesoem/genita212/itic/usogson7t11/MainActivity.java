package ejt.edu.tesoem.genita212.itic.usogson7t11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre, txtedad, txtcorreo, txtcurp;
    TextView lbljson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre= findViewById(R.id.txtNombre);
        txtedad=findViewById(R.id.txtEdad);
        txtcorreo=findViewById(R.id.txtCorreo);
        txtcurp=findViewById(R.id.txtCurp);
        lbljson=findViewById(R.id.lblGson);
    }

    public void btncargamos (View v){
        Datos datosobj= new Datos(txtnombre.getText().toString(),Integer.parseInt(txtedad.getText().toString()),txtcorreo.getText().toString(),txtcurp.getText().toString());
        Gson gson= new Gson();
        String cJson=gson.toJson(datosobj);
        lbljson.setText(cJson);
        Datos datosobj1= gson.fromJson(cJson,Datos.class);
        Log.i("Informacion de Jsson-->","Nombre->"+datosobj1.getNombre()+", Edad->"+datosobj1.getEdad()+", Correo->"+datosobj1.getCorreo()+", CURP->"+datosobj1.getCURP());
    }
}
