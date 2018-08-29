package com.mypackage.repositories;

import com.mypackage.dbConnection.DbConnection;
import com.mypackage.models.Doctor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.util.Map;

@Repository
public class AppointmentRepository {

    public void confirmAppointment(Doctor doctor, String userName) {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();
        dbConnection.confirmAppointment(connection, doctor, userName);

    }

    public Map viewAppointments(String userName) {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();
        Map map = dbConnection.viewAppointments(connection, userName);
        return map;
    }

    public void deleteAppointment(Doctor doctor, String userName) {
        DbConnection dbConnection = new DbConnection();
        Connection connection = dbConnection.createConnection();
        Map map = dbConnection.viewAppointments(connection, userName);
        dbConnection.openAppointments(connection, map);
        dbConnection.deleteAppointment(connection, doctor, userName);
    }
}
