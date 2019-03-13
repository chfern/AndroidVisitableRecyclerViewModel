package com.fernandochristyanto.recyclerviewtypevisitor.activity;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.VisitableViewModel;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.types.TypeFactory;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewholders.AbstractViewHolder;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<AbstractViewHolder> {
    List<VisitableViewModel> elements;
    TypeFactory typeFactory;

    public MainAdapter(List<VisitableViewModel> elements, TypeFactory typeFactory){
        this.elements = elements;
        this.typeFactory = typeFactory;
    }

    @NonNull
    @Override
    public AbstractViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(viewType, viewGroup, false);
        return typeFactory.createViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull AbstractViewHolder viewHolder, int i) {
        viewHolder.bind(elements.get(i));
    }

    @Override
    public int getItemCount() {
        return elements.size();
    }

    @Override
    public int getItemViewType(int position) {
        return elements.get(position).viewType(typeFactory);
    }
}
