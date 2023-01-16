package com.rays.ios;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class StudentsextErnalizations implements Externalizable {
	private int id;
	private String name;
	private String subject;
	
	public StudentsextErnalizations() {

	}
	public StudentsextErnalizations(int id) {
		this.name=name;
	}
	public StudentsextErnalizations(int id,String name) {
		this.name=name;
		this.id=id;
	}
	public StudentsextErnalizations(int id,String name,String subject) {
		this.name=name;
		this.id=id;
		this.subject=subject;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		id = (int) in.readObject();
		name= (String)in.readObject();
		subject = (String) in.readObject();
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(id);
		out.writeObject(name);
		out.writeObject(subject);
		
	}
	
	
	}
