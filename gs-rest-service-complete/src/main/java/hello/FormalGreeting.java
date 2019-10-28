package hello;

public class FormalGreeting extends Greeting {

	String institucion = "DEFAULT";

	public FormalGreeting(long id, String content) {
		super(id, content);
		// TODO Auto-generated constructor stub
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

}
