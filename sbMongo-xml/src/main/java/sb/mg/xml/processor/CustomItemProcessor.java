package sb.mg.xml.processor;

import org.springframework.batch.item.ItemProcessor;

import sb.mg.xml.model.Employee;

public class CustomItemProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee item) throws Exception {
		System.out.println(item);
		return item;
	}

}
