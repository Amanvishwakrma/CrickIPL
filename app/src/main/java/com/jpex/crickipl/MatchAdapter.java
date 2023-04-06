package com.jpex.crickipl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {

    private Context context;
    private ArrayList<Match> list;

    public MatchAdapter(Context context, ArrayList<Match> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.match_item, parent,false);
        return new MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position) {

        holder.match_title.setText(list.get(position).getMatchtitle());
        holder.match_status.setText(list.get(position).getMatchstatus());
        holder.team1_name.setText(list.get(position).getTeam1());
        holder.team2_name.setText(list.get(position).getTeam2());
        holder.team1_score.setText(list.get(position).getTeam1score());
        holder.team2_score.setText(list.get(position).getTeam2score());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MatchViewHolder extends RecyclerView.ViewHolder {

        private ImageView team1_logo,team2_logo;
        private TextView match_title,team1_name,team1_score,team2_score,team2_name,match_status;

        public MatchViewHolder(@NonNull View itemView) {
            super(itemView);

            team1_logo = itemView.findViewById(R.id.team1_logo);
            team2_logo = itemView.findViewById(R.id.team2_logo);
            match_title = itemView.findViewById(R.id.match_title);
            match_status = itemView.findViewById(R.id.match_status);
            team1_name = itemView.findViewById(R.id.team1_name);
            team1_score = itemView.findViewById(R.id.team1_score);
            team2_name = itemView.findViewById(R.id.team2_name);
            team2_score = itemView.findViewById(R.id.team2_score);
        }
    }
}
