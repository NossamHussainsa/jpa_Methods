package com.nt.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.Entity.CoronaVaccine;
import com.nt.Repo.IcoronaVaccineRepo;
import com.nt.Result.View;
@Service("CoronaService")
public class CoronaVaccineServiceImpl implements ICoronaService {
@Autowired
private  IcoronaVaccineRepo repo;

	@Override
	public <T extends View> List<T> SearchByCompanyOrderByPrice(String Company, Class<T> clazz) {
		
		return repo.findByCompanyOrderByName(Company, clazz);
	}
	@Override
	public <T extends View> List<T> SearchByDoseOrderByPrice(Integer Dose, Class<T> clazz) {
		return repo.findByDoseOrderByPrice(Dose, clazz);
	}

}
