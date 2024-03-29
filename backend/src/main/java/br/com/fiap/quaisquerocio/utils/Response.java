package br.com.fiap.quaisquerocio.utils;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

	private T data;
	private List<String> errors = new ArrayList<String>();
	
	public Response() {}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public List<String> getErrors() {
		return errors;
	}
	
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}
