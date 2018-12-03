package ch.team2.business;

public enum Relationship {
	EMPLOYEE("employee"),
	SUB_COMPANY("subCompany"),
	PARTNER("partner");

	private String pascalCase;

	Relationship(String pascalCase){
		this.pascalCase = pascalCase;
	}

	public String getPascalCase(){
		return this.pascalCase;
	}
}
