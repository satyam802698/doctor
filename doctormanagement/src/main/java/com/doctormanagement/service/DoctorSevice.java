package com.doctormanagement.service;

import com.doctormanagement.entities.Doctor;

public interface DoctorSevice {
	public int insertDoctor(Doctor doct);
	public  Doctor getDoctor(int id);
}
