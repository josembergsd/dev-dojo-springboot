package br.com.devdojo.springboot.error;

public class ErrorDetails {
	
	private String title;
	private int status;
	private String details;
	private long timestamp;
	private String developerMessage;
	
	public String getTitle() {
		return title;
	}
	public int getStatus() {
		return status;
	}
	public String getDetails() {
		return details;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public String getDeveloperMessage() {
		return developerMessage;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}
	
	public static final class Builder{
		private String title;
		private int status;
		private String details;
		private long timestamp;
		private String developerMessage;
		
		private Builder() {
		}
		
		public static Builder newBuilder() {
			return new Builder();
		}
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder status(int status) {
			this.status = status;
			return this;
		}
		
		public Builder details(String details) {
			this.details = details;
			return this;
		}
		
		public Builder timestamp(Long timestamp) {
			this.timestamp = timestamp;
			return this;
		}
		
		public Builder developerMessage(String developerMessage) {
			this.developerMessage = developerMessage;
			return this;
		}
		
		public ErrorDetails build() {
			ErrorDetails errorDetails = new ErrorDetails();
			errorDetails.setTitle(title);
			errorDetails.setStatus(status);
			errorDetails.setDetails(details);
			errorDetails.setTimestamp(timestamp);
			errorDetails.setDeveloperMessage(developerMessage);
			return errorDetails;
		}
	}
}
