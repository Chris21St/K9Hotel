package sv.edu.catolica.k_9hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class ActivityInstalaciones extends AppCompatActivity {
    ImageButton before, next;
    ImageSwitcher cambio;

    int index=0;
    int imagenes[]={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instalaciones);

        before=findViewById(R.id.before);
        next=findViewById(R.id.next);
        cambio=findViewById(R.id.imageswitcher);

        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                --index;
                if (index<0)
                {
                    index=imagenes.length-1;
                }
                cambio.setImageResource(imagenes[index]);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index++;
                if (index==imagenes.length)
                {
                    index=0;
                }
                cambio.setImageResource(imagenes[index]);
            }
        });
        cambio.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setMaxHeight(220);
                imageView.setMaxWidth(220);

                return imageView;
            }
        });
        cambio.setImageResource(imagenes[index]);
    }
}