package com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.types;

import android.view.View;

import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewholders.AbstractViewHolder;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels.ParentViewModel;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels.StudentViewModel;

public interface TypeFactory {
    int viewType(StudentViewModel viewModel);
    int viewType(ParentViewModel viewModel);

    public abstract AbstractViewHolder createViewHolder(View parent, int viewType);
}
