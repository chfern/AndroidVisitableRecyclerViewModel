package com.fernandochristyanto.recyclerviewtypevisitor.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.fernandochristyanto.recyclerviewtypevisitor.R;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.VisitableViewModel;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.types.RecyclerTypeFactory;
import com.fernandochristyanto.recyclerviewtypevisitor.utils.recyclerviewholder.types.TypeFactory;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    MainContract.Presenter presenter;
    MainAdapter adapter;
    TypeFactory typeFactory;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        typeFactory = new RecyclerTypeFactory();
        presenter = new MainPresenter(this);
        presenter.loadStudentsAndParents();
    }

    @Override
    public void showStudentsAndParents(List<VisitableViewModel> viewModels) {
        adapter = new MainAdapter(viewModels, typeFactory);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showStudentToast() {
        Toast.makeText(this, "Student", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showParentToast() {
        Toast.makeText(this, "Parent", Toast.LENGTH_SHORT).show();
    }
}
