package sb.csv.mg.processor;

import org.springframework.batch.item.ItemProcessor;

import sb.csv.mg.model.Employee;

public class CustomItemProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee item) throws Exception {
		
		return item;
	}

}
