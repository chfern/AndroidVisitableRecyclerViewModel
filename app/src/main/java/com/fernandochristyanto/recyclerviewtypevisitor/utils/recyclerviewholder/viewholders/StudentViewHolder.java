package com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewholders;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.fernandochristyanto.recyclerviewtypevisitor.R;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.viewmodels.StudentViewModel;

import butterknife.BindView;

public class StudentViewHolder extends AbstractViewHolder<StudentViewModel> implements View.OnClickListener{
    public static final int LAYOUT = R.layout.list_item_student;


    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    @BindView(R.id.tvName)
    TextView tvName;

    StudentViewModel viewModel;

    @Override
    public void bind(final StudentViewModel viewModel) {
        this.viewModel = viewModel;
        tvName.setText(viewModel.getStudentName());
        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.getListener().onClick(viewModel);
            }
        });

    }

    @Override
    public void onClick(View v) {
        viewModel.getListener().onClick(viewModel);
    }
}
