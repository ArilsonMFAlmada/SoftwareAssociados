package br.com.zbs.sindicato.application.util;

public class Validation {
	
	public static void assertNotEmpty(Object obj) {
		if(obj instanceof String) {
			String s = (String) obj;
			if(StringUtils.isEmpty(s)){
				throw new ValidationException("O texto n�o pode ser nulo");
			}
		}
		
		if(obj == null) {
			throw new ValidationException("O Valor n�o pode ser nulo");
		}
	}

}
