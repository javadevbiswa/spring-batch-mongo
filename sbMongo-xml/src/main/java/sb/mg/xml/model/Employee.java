package sb.mg.xml.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "employee_details")
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 486466238924305278L;

	private Integer eid;
	private String ename;
	private double esal;
	
	@XmlAttribute(name = "id")
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	
	@XmlElement(name = "ename")
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@XmlElement(name = "esal")
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	

}
