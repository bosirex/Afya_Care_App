package com.mhutshow.AfyaCare.medicine.addmedicine;

import com.mhutshow.AfyaCare.BasePresenter;
import com.mhutshow.AfyaCare.BaseView;
import com.mhutshow.AfyaCare.data_source.MedicineAlarm;
import com.mhutshow.AfyaCare.data_source.Pills;

import java.util.List;

public interface AddMedicineContract {

    interface View extends BaseView<Presenter> {

        void showEmptyMedicineError();

        void showMedicineList();

        boolean isActive();

    }

    interface  Presenter extends BasePresenter{


        void saveMedicine(MedicineAlarm alarm, Pills pills);


        boolean isDataMissing();

        boolean isMedicineExits(String pillName);

        long addPills(Pills pills);

        Pills getPillsByName(String pillName);

        List<MedicineAlarm> getMedicineByPillName(String pillName);

        List<Long> tempIds();

        void deleteMedicineAlarm(long alarmId);

    }
}
