package sb.csv.mg.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import sb.csv.mg.model.Employee;

public class EmployeeMapper implements FieldSetMapper<Employee>{

	@Override
	public Employee mapFieldSet(FieldSet fieldSet) throws BindException {
		Employee e=new Employee();
		
		e.setEid(fieldSet.readInt(0));
		e.setEname(fieldSet.readString(1));
		e.setEsal(fieldSet.readDouble(2));
		return e;
	}

	
}
