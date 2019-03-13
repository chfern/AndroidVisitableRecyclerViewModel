package com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewholders;

import android.support.annotation.NonNull;
import android.view.View;

import com.fernandochristyanto.recyclerviewtypevisitor.R;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels.ParentViewModel;

public class ParentViewHolder extends AbstractViewHolder<ParentViewModel> {
    public static final int LAYOUT = R.layout.list_item_parent;

    public ParentViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void bind(ParentViewModel viewModel) {

    }
}
