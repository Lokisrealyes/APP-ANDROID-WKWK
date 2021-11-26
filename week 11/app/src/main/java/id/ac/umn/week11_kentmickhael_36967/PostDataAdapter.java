package id.ac.umn.week11_kentmickhael_36967;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostDataAdapter extends RecyclerView.Adapter<PostDataAdapter.PostViewHolder> {

    private final List<PostModel> postData;
    private LayoutInflater inflater;

    public PostDataAdapter(Context context, List<PostModel> postData) {
        inflater = LayoutInflater.from(context);
        this.postData = postData;
    }

    @NonNull
    @Override
    public PostDataAdapter.PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.post_item, parent, false);
        return new PostViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull PostDataAdapter.PostViewHolder holder, int position) {
        PostModel current = postData.get(position);
        holder.tvTitle.setText(current.getTitle());
        holder.tvBody.setText(current.getBody());
    }

    @Override
    public int getItemCount() {
        return postData.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        public final TextView tvTitle, tvBody;
        final PostDataAdapter adapter;

        public PostViewHolder(@NonNull View itemView, PostDataAdapter adapter) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvBody = itemView.findViewById(R.id.tvBody);
            this.adapter = adapter;
        }

        public void onClick (View view){

        }
    }
}
