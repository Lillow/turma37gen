package Collections;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String[] args) 
	{
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("João da Silva ", "JAVA", 6.8);
		Aluno b = new Aluno("Julia Brandão ", "LINUX ", 9.8);
		Aluno c = new Aluno("Aline de Lima", "SO ", 4.8);
		Aluno d = new Aluno("Carol Nascimento ", "INTERNET ", 8.8);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);

		System.out.println(conjunto);
		
	}

}
