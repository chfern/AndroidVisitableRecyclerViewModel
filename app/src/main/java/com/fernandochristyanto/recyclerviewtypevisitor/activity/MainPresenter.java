package com.fernandochristyanto.recyclerviewtypevisitor.activity;

import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.VisitableViewModel;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels.ParentViewModel;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels.StudentViewModel;

import java.util.Arrays;
import java.util.List;

public class MainPresenter implements MainContract.Presenter {
    MainContract.View view;

    public MainPresenter(MainContract.View view){
        this.view = view;
    }

    @Override
    public void loadStudentsAndParents() {
        /**
         * Load Students and Parents
         */

        ParentViewModel.ParentViewModelListener parentViewModelListener = new ParentViewModel.ParentViewModelListener() {
            @Override
            public void onClick(StudentViewModel studentViewModel) {
                view.showParentToast();
            }
        };

        StudentViewModel.StudentViewModelListener studentViewModelListener = new StudentViewModel.StudentViewModelListener() {
            @Override
            public void onClick(StudentViewModel studentViewModel) {
                view.showStudentToast();
            }
        };

        List<VisitableViewModel> elementList = Arrays.asList(
                new ParentViewModel("Parent 1", parentViewModelListener),
                new StudentViewModel("Student 1", studentViewModelListener)
        );

        view.showStudentsAndParents(elementList);
    }
}
