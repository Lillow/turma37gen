package Collections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) 
	{
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		Aluno a = new Aluno("João da Silva ", "JAVA", 6.8);
		Aluno b = new Aluno("Julia Brandão ", "LINUX ", 9.8);
		Aluno c = new Aluno("Aline de Lima", "SO ", 4.8);
		Aluno d = new Aluno("Carol Nascimento ", "INTERNET ", 8.8);
		
		mapa.put("João da Silva ", a);
		mapa.put("Julia Brandão ", b);
		mapa.put("Aline de Lima",c);
		mapa.put("Carol Nascimento ",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Carol Nascimento "));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno x:alunos)
		{
			System.out.println(x);
		}
	}

}
