package by.tiranid.service;


import by.tiranid.model.WorkDaysEntity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;


public interface WorkDaysService {
	
    WorkDaysEntity addRecord(WorkDaysEntity record);
    void delete(Long id);
    WorkDaysEntity editRecord(WorkDaysEntity record);
    List<WorkDaysEntity> getAll();
	
	
	
    WorkDaysEntity getFirstById(Long id);
    WorkDaysEntity getFirstByWorkDate(Date workDate);
    WorkDaysEntity getFirstByIterations(Byte iterations);
    WorkDaysEntity getFirstByWorkTime(String workTime);



    List<WorkDaysEntity> getByWorkDate(Date workDate);
    List<WorkDaysEntity> getByIterations(Byte iterations);

	
    WorkDaysEntity getLast();
    WorkDaysEntity getFirst();
    

	// поиск по workDate в промежутке от до и просто от и просто до
	// + упорядочивание по iterations в обратном порядке
	
	
}