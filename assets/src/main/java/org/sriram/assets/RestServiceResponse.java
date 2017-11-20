package org.sriram.assets;

import javax.ws.rs.core.Response;

public class RestServiceResponse<T> {

	private String message;
	private T content;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}

	private RestServiceResponse(String message, T content) {
		this.message = message;
		this.content = content;
	}

	public static <T> Response create(Response.Status status, String message, Object content) {
		return Response.status(status).entity(new RestServiceResponse(message, content)).build();
	}

}
