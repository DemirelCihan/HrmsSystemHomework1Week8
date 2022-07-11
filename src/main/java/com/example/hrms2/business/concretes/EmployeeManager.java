package com.example.hrms2.business.concretes;

import com.example.hrms2.business.abstracts.EmployeeService;
import com.example.hrms2.core.results.DataResult;
import com.example.hrms2.core.results.Result;
import com.example.hrms2.core.results.SuccessDataResult;
import com.example.hrms2.core.results.SuccessResult;
import com.example.hrms2.dataAccess.abstracts.EmployeeDao;
import com.example.hrms2.entities.concretes.Employee;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<List<Employee>>
                (this.employeeDao.findAll(),"Veriler listelendi!!");
    }

    @Override
    public DataResult<List<Employee>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.ASC,"employeeFirstName");/*employeeFirstName'i küçükten büyüğe doğru sıralamış
        olacaktır.*/
        return new SuccessDataResult<List<Employee>>
                (this.employeeDao.findAll(sort),"Sıralama işlemi başarılı!!");
    }

    @Override
    public Result add(Employee employee) {//siteme yeni bir ekleme işlemi yapmak için kuklanılacak.
        this.employeeDao.save(employee);//save() metodu ile sisteme ekleme işlemlerini hızlı bir şekilde yapmız oluruz
        return new SuccessResult("sisteme yeni bir eklem işlemi yapıldı.");
    }



    @Override
    public DataResult<Employee> getByEmployeeFirstName(String employeeFirstName) {
        return new SuccessDataResult<Employee>
                (this.employeeDao.getByEmployeeFirstName(employeeFirstName),"Veriler listelendi.");
    }
}
