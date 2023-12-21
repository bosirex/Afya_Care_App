package com.mhutshow.AfyaCare.model.fireStoreApi;

import com.mhutshow.AfyaCare.model.Doctor;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class DoctorHelper {
    static FirebaseFirestore db = FirebaseFirestore.getInstance();
    static CollectionReference DoctorRef = db.collection("Doctor");

    public static void addDoctor(String name, String address, String tel, String specialist){
        Doctor doctor = new Doctor(name, address,tel, FirebaseAuth.getInstance().getCurrentUser().getEmail(), specialist);

        DoctorRef.document(FirebaseAuth.getInstance().getCurrentUser().getEmail()).set(doctor);

    }
}
