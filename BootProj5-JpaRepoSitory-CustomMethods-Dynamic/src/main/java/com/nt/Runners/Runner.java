package com.nt.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.Result.ResultView2;
import com.nt.Result.ResultView3;
import com.nt.Service.ICoronaService;
@Component
public class Runner implements CommandLineRunner {
@Autowired
private ICoronaService service; 
	@Override
	public void run(String... args) throws Exception {
		try {
		//service.getdetailsByCountry("japan").forEach(info->System.out.println(info));
			service.SearchByCompanyOrderByPrice("japanese", ResultView2.class).forEach(view2 -> System.out.println(view2.getCompany()+"    "+view2.getCountry()+"   "+view2. getName()));
			System.out.println("==============================================================================");
			service.SearchByDoseOrderByPrice(3, ResultView3.class).forEach(view1 -> System.out.println(view1.getDose()+"    "+view1.getPrice()));
			System.out.println("===============================================================");
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
