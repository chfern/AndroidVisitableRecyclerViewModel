package com.fernandochristyanto.recyclerviewtypevisitor.activity;

import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.VisitableViewModel;

import java.util.List;

public class MainContract {
    interface View{
        void showStudentsAndParents(List<VisitableViewModel> viewModels);
        void showStudentToast();
        void showParentToast();
    }

    interface Presenter{
        void loadStudentsAndParents();
    }
}
