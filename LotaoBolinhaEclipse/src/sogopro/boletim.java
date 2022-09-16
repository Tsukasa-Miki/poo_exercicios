//Daniel 3-52

package sogopro;

public class boletim {

	public static void main(String[] args) {
		
		professor a2 = new professor();
		a2.nomeP = "Felix";
		
		
		
		aluno a1 = new aluno();
			a1.nome = "Daniel";
			a1.disciplina = "Etiqueta";
			a1.nota1 = 8f;
			a1.nota2 = 10f;
			a1.nota3 = 9f;
			a1.nota4 = 10f;
			a1.media = (a1.nota1 + a1.nota2 + a1.nota3 + a1.nota4)/4;
		
			System.out.println(a1.nome + " media na disciplina de "+a1.disciplina + " foi " + a1.media+ " do professor " +a2.nomeP );
	}
}
