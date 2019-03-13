package com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.VisitableViewModel;

import butterknife.ButterKnife;

public abstract class AbstractViewHolder<T extends VisitableViewModel> extends RecyclerView.ViewHolder {
    public AbstractViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public abstract void bind(T viewModel);
}
