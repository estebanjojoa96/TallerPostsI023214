package com.example.jonmid.tareasasincronas.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.tareasasincronas.Models.Post;
import com.example.jonmid.tareasasincronas.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESTEBAN JOJOA on 28/04/2018.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>{

    List<Post> PostList = new ArrayList<>();
    Context context;

    public PostAdapter(List<Post> PostList, Context context) {
        this.PostList = PostList;
        this.context = context;
    }

    // ******************************************************************************

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Obtener la vista (item.xml)
        View item_post = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item_post);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Asignar los valores a la vista
        holder.textViewId.setText(PostList.get(position).getId());
        holder.textViewTitle.setText(PostList.get(position).getTitle());
        holder.textViewBody.setText(PostList.get(position).getBody());
    }

    @Override
    public int getItemCount() {

        return PostList.size();
    }

    // ******************************************************************************

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewId;
        TextView textViewTitle;
        TextView textViewBody;

        public ViewHolder(View item) {
            super(item);

            textViewId = (TextView) item.findViewById(R.id.textView_id);
            textViewTitle = (TextView) item.findViewById(R.id.textView_Title);
            textViewBody = (TextView) item.findViewById(R.id.textView_body);
        }
    }

}
