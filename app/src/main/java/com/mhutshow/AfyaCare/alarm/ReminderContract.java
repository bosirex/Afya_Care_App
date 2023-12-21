package com.mhutshow.AfyaCare.alarm;

import com.mhutshow.AfyaCare.BasePresenter;
import com.mhutshow.AfyaCare.BaseView;
import com.mhutshow.AfyaCare.data_source.History;
import com.mhutshow.AfyaCare.data_source.MedicineAlarm;

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
