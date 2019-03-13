package com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels;

import com.fernandochristyanto.recyclerviewtypevisitor.R;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.VisitableViewModel;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.types.TypeFactory;

public class StudentViewModel implements VisitableViewModel {
    public interface StudentViewModelListener{
        void onClick(StudentViewModel studentViewModel);
    }

    public StudentViewModel(String studentName, StudentViewModelListener listener) {
        this.studentName = studentName;
        this.listener = listener;
    }

    private String studentName;
    private StudentViewModelListener listener;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setListener(StudentViewModelListener listener){
        this.listener = listener;
    }

    public StudentViewModelListener getListener() {
        return listener;
    }

    @Override
    public int viewType(TypeFactory typeFactory) {
        return typeFactory.viewType(this);
    }
}
