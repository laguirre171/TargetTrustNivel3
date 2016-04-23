package br.com.tt.controlle;

import java.util.Date;

import br.com.tt.dao.AlunoDao;
import br.com.tt.model.Aluno;

public class Sistema {

	public static void main(String[] args) {
		AlunoDao alunoDao = new AlunoDao();
		Aluno aluno = getAluno("Pedro", "123", new Date());
		System.out.println("Criando aluno " + aluno.getNome());
		System.out.println("Iniciando salvar");
		alunoDao.salvar(getAluno("Maria", "1234", new Date()));
		alunoDao.salvar(getAluno("Rita", "1235", new Date()));
		System.out.println("Fim de salvar");
		System.out.println("Iniciando busca");
		Aluno buscar = alunoDao.buscar(1L);
		System.out.println("Aluno" + buscar.getNome()+ " retornou da base de dados");
		System.exit(0);
		
	}
	
	private static Aluno getAluno(String nome,String cpf, Date dataNasc ){
		Aluno aluno = new Aluno();
		aluno.setCpf(cpf);
		aluno.setNome(nome);
		aluno.setDataNasc(dataNasc);
		return aluno;		
	}

}
