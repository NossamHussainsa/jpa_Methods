package com.nt.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.CoronaVaccine;
import com.nt.Result.View;

public interface IcoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
	public<T extends View> List<T> findByCompanyOrderByName(String Company,Class<T>clazz);
	public<T extends View> List<T> findByDoseOrderByPrice(Integer Dose,Class<T>clazz);
}
