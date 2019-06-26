package com.example.services;

import com.example.entities.Aluno;
import com.example.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Aluno service implement.
 */
@Service
public class AlunoServiceImpl implements AlunoService {

    private AlunoRepository alunoRepository;

    @Autowired
    public void setAlunoRepository(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Iterable<Aluno> listAllAlunos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno getAlunoById(Integer id) {
        return alunoRepository.findOne(id);
    }

    @Override
    public Aluno saveAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public void deleteAluno(Integer id) {
        alunoRepository.delete(id);
    }

}
