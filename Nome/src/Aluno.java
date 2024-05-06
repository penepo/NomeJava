import java.util.Date;

public class Aluno {
	
	private int id;
	private String nome;
	private Date dataNascimento;
	public Aluno(int id, String nome, Date dataNascimento ) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		
	}
	
	public int getind() {return id;}
	
	public void setind(int id) {this.id = id;}
	
	public String getNome() {return nome;}
	
	public void setnome(String nome) {this.nome = nome;}
	
	public Date getDataNascimento() {return dataNascimento;}
	
	public void setDataNascimento(Date dataNascimento) {this.dataNascimento = dataNascimento;}
	
	
	
	
}
