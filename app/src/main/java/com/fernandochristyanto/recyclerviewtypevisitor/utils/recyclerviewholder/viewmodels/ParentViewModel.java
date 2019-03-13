package com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels;

import com.fernandochristyanto.recyclerviewtypevisitor.R;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.VisitableViewModel;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.types.TypeFactory;

public class ParentViewModel implements VisitableViewModel {
    public interface ParentViewModelListener{
        void onClick(StudentViewModel studentViewModel);
    }

    public ParentViewModel(String parentName, ParentViewModelListener listener) {
        this.parentName = parentName;
        this.listener = listener;
    }

    private String parentName;
    private ParentViewModelListener listener;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setListener(ParentViewModelListener listener){
        this.listener = listener;
    }

    public ParentViewModelListener getListener() {
        return listener;
    }

    @Override
    public int viewType(TypeFactory typeFactory) {
        return typeFactory.viewType(this);
    }
}
