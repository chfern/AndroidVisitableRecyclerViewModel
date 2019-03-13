package com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.types;

import android.view.View;

import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewholders.AbstractViewHolder;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewholders.ParentViewHolder;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewholders.StudentViewHolder;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels.ParentViewModel;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels.StudentViewModel;

public class RecyclerTypeFactory implements TypeFactory {
    @Override
    public int viewType(StudentViewModel viewModel) {
        return StudentViewHolder.LAYOUT;
    }

    @Override
    public int viewType(ParentViewModel viewModel) {
        return ParentViewHolder.LAYOUT;
    }

    public AbstractViewHolder createViewHolder(View parent, int viewType){
        AbstractViewHolder viewHolder = null;
        switch(viewType){
            case StudentViewHolder.LAYOUT:
                viewHolder = new StudentViewHolder(parent);
                break;
            case ParentViewHolder.LAYOUT:
                viewHolder = new ParentViewHolder(parent);
                break;
        }

        return viewHolder;
    }
}
