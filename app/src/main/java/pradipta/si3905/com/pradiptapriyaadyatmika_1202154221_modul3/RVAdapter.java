package pradipta.si3905.com.pradiptapriyaadyatmika_1202154221_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.Holder> {
Context context;
    public static class Holder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView name;
        TextView description;
        ImageView image;

        Holder(final View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            name = (TextView)itemView.findViewById(R.id.person_name);
            description = (TextView)itemView.findViewById(R.id.person_age);
            image = (ImageView)itemView.findViewById(R.id.person_photo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                //ketika cardview di klik
                public void onClick(View view) {
                    //bmembuat intent bernama move
                    Intent move = new Intent(itemView.getContext(), Detail.class);
                    //mengirimkan data data yang diambil ke detail air untuk di tampilkan
                    move.putExtra("nama", name.getText());
                    move.putExtra("detail", description.getText());
                    //mengeksekusi intent
                    itemView.getContext().startActivity(move);
                }
            });
        }
    }

    List<ModelData> modelData;

    RVAdapter(List<ModelData> modelData){
        this.modelData = modelData;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        Holder pvh = new Holder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(Holder holder, int i) {
        holder.name.setText(modelData.get(i).name);
        holder.description.setText(modelData.get(i).description);
        holder.image.setImageResource(modelData.get(i).image);
    }

    @Override
    public int getItemCount() {
        return modelData.size();
    }
}
