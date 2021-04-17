package com.chdatabase.utils.errors_treatment;

public class ExceptionsGlobalDefaultMethods extends RuntimeException {

	private static final long serialVersionUID = -8851722393726380184L;
	
	public ExceptionsGlobalDefaultMethods(String message, String cause) {
		super(message, new Throwable(cause));
	}
	
	public void errorDescription() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("=> Exceção lançada no arquivo: " + this.getStackTrace()[0].getFileName() + ",");
		System.out.println("=> método: " + this.getStackTrace()[0].getMethodName() + ",");
		System.out.println("=> linha: " + this.getStackTrace()[0].getLineNumber());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
	}

}
