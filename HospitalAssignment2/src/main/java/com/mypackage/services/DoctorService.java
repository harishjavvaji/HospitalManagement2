package com.mypackage.services;

import com.mypackage.models.Doctor;
import com.mypackage.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public void doctorService(Doctor doctor) {

        doctorRepository.getDoctorsList(doctor);




    }
}
