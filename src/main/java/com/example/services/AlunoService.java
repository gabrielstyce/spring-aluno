package com.example.services;

import com.example.entities.Aluno;

public interface AlunoService {

    Iterable<Aluno> listAllAlunos();

    Aluno getAlunoById(Integer id);

    Aluno saveAluno(Aluno aluno);

    void deleteAluno(Integer id);

}
