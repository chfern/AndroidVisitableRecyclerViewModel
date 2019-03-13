package com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder;

import android.support.annotation.LayoutRes;

import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.types.TypeFactory;

public interface VisitableViewModel {
    int viewType(TypeFactory typeFactory);
}
