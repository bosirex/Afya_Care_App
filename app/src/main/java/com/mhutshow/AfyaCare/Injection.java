package com.mhutshow.AfyaCare;

import android.content.Context;

import androidx.annotation.NonNull;

import com.mhutshow.AfyaCare.data_source.MedicineRepository;
import com.mhutshow.AfyaCare.data_source.local.MedicinesLocalDataSource;

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
