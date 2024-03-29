package br.ifsc.edu.frutas;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import br.com.rbeninca.listafrutas.R;

public class ExibeFrutas extends AppCompatActivity {
    TextView textViewCodigo,textViewNome,textViewPreco;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_fruta);

        int id=getIntent().getExtras().getInt("id");

        textViewCodigo=findViewById(R.id.textViewCodigo);
        textViewNome=findViewById(R.id.textViewNome);
        textViewPreco=findViewById(R.id.textViewPreco);

        imageView=findViewById(R.id.imageView);

        FrutaController frutaController = new FrutaController();

        DecimalFormat decimalFormat =  new DecimalFormat("#,###.00");
        textViewCodigo.setText(Integer.toString(frutaController.FRUTAS[id].getCodigo()));
        textViewNome.setText(frutaController.FRUTAS[id].getNome());
        textViewPreco.setText(decimalFormat.format(frutaController.FRUTAS[id].getPreco()));
        imageView.setImageResource(frutaController.FRUTAS[id].getImagem());


    }
}
