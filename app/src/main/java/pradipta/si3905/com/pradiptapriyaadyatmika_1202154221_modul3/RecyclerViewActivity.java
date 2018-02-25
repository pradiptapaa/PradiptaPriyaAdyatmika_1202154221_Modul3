package pradipta.si3905.com.pradiptapriyaadyatmika_1202154221_modul3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {

    private List<ModelData> modelData;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recyclerview_activity);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        modelData = new ArrayList<>();
        modelData.add(new ModelData("Aqua", "Salah satu air mineral", R.drawable.aqua));
        modelData.add(new ModelData("Amidis", "Salah satu air mineral", R.drawable.amidis));
        modelData.add(new ModelData("Ades", "Salah satu air mineral", R.drawable.ades));
        modelData.add(new ModelData("Cleo", "Salah satu air mineral", R.drawable.cleo));
        modelData.add(new ModelData("Club", "Salah satu air mineral", R.drawable.club));
        modelData.add(new ModelData("Equil", "Salah satu air mineral", R.drawable.equil));
        modelData.add(new ModelData("Evian", "Salah satu air mineral", R.drawable.evian));
        modelData.add(new ModelData("Leminerale", "Salah satu air mineral", R.drawable.leminerale));
        modelData.add(new ModelData("Nestle", "Salah satu air mineral", R.drawable.nestle));
        modelData.add(new ModelData("Pristine", "Salah satu air mineral", R.drawable.pristine));
        modelData.add(new ModelData("Vit", "Salah satu air mineral", R.drawable.vit));

    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(modelData);
        rv.setAdapter(adapter);
    }

}
