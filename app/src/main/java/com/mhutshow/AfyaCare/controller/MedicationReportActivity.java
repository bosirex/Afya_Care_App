package com.mhutshow.AfyaCare.controller;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

import com.mhutshow.AfyaCare.Injection;
import com.mhutshow.AfyaCare.R;
import com.mhutshow.AfyaCare.report.FilterType;
import com.mhutshow.AfyaCare.report.MonthlyReportActivity;
import com.mhutshow.AfyaCare.report.MonthlyReportFragment;
import com.mhutshow.AfyaCare.report.MonthlyReportPresenter;
import com.mhutshow.AfyaCare.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MedicationReportActivity extends AppCompatActivity {

    private static final String CURRENT_FILTERING_TYPE = "current_filtering_type";

    @BindView(R.id.toolbar1)
    Toolbar toolbar1;

    private MonthlyReportPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medication_report);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar1);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.ic_clear);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //Create Fragment
        MonthlyReportFragment monthlyReportFragment = (MonthlyReportFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame1);
        if (monthlyReportFragment == null) {
            monthlyReportFragment = MonthlyReportFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), monthlyReportFragment, R.id.contentFrame1);
        }

        //Create TaskPresenter
        presenter = new MonthlyReportPresenter(Injection.provideMedicineRepository(MedicationReportActivity.this), monthlyReportFragment);

        //Load previous saved Instance
        if (savedInstanceState != null) {
            FilterType taskFilterType = (FilterType) savedInstanceState.getSerializable(CURRENT_FILTERING_TYPE);
            presenter.setFiltering(taskFilterType);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(CURRENT_FILTERING_TYPE, presenter.getFilterType());
        super.onSaveInstanceState(outState);
    }
}