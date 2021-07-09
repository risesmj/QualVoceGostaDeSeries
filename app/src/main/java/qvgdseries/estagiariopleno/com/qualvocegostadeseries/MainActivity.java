package qvgdseries.estagiariopleno.com.qualvocegostadeseries;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    //Componentes
    private SeekBar seekBarNota;
    private TextView textoNota;
    private ImageView imgResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recuperar as ID's
        seekBarNota = (SeekBar) findViewById(R.id.seekBarNotaId);
        textoNota = (TextView) findViewById(R.id.textoNotaId);
        imgResultado = (ImageView) findViewById(R.id.imgResultadoId);

        seekBarNota.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //Nota baixa: 0 a 3
                if (i>=0 && i<=3){
                    imgResultado.setImageResource(R.drawable.pouco);
                }
                //Nota média: 4 a 6
                if (i>=4 && i<=6){
                    imgResultado.setImageResource(R.drawable.medio);
                }
                //Nota alta: 7 a 9
                if (i>=7 && i<=9){
                    imgResultado.setImageResource(R.drawable.muito);
                }
                //Nota máxima: 10
                if (i==10){
                    imgResultado.setImageResource(R.drawable.susto);
                }
                textoNota.setText("NOTA: " + i + "/" + seekBarNota.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
