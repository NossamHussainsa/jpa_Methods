package com.nt.Service;

import java.util.List;

import com.nt.Entity.CoronaVaccine;
import com.nt.Result.View;

public interface ICoronaService {
	public<T extends View> List<T> SearchByCompanyOrderByPrice(String Company,Class<T>clazz);
	public<T extends View> List<T> SearchByDoseOrderByPrice(Integer Dose,Class<T>clazz);

}
