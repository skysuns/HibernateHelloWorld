package org.sky.service;

import org.mis.bean.Studenttable;
import org.mis.bean.StudenttableId;
import org.mis.bean.StudenttableDAO;

public class MainService {
	
    public boolean valid(Integer id,String name)
    { 
    	StudenttableId studentId = new StudenttableId(1,"杜金财","man");    	
    	StudenttableDAO test = new StudenttableDAO();  
    	Studenttable Studenttable = test.findById(studentId);
    	StudenttableId studentValid = Studenttable.getId();
    	
        if(studentValid.getStudentName().equals(name))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String args[])
    {
    	MainService service=new MainService();
        boolean login=service.valid(1, "杜金财");
        System.out.println("验证结果"+login);
    }
    
}
