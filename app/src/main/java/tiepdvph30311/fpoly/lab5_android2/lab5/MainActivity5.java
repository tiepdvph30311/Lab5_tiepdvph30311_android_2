package tiepdvph30311.fpoly.lab5_android2.lab5;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import tiepdvph30311.fpoly.lab5_android2.R;


public class MainActivity5 extends AppCompatActivity {
    private BottomNavigationView bottom;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        bottom=findViewById(R.id.demo51bottom);
//        fragmentManager=getSupportFragmentManager();
//
//        fragmentManager.beginTransaction().replace()
        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.getItemId()==R.id.demo1){
                    Toast.makeText(MainActivity5.this, "chức năng 1", Toast.LENGTH_SHORT).show();
                    return true;
                }else  if(menuItem.getItemId()==R.id.demo2){
                    Toast.makeText(MainActivity5.this, "chức năng 2", Toast.LENGTH_SHORT).show();
                }else if(menuItem.getItemId()==R.id.demo3){
                    Toast.makeText(MainActivity5.this, "chức năng 3", Toast.LENGTH_SHORT).show();
                }
                    return false;
            }
        });
    }
}