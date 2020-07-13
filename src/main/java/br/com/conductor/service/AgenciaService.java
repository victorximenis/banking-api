package br.com.conductor.service;

import br.com.conductor.entity.Agencia;
import br.com.conductor.repository.AgenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgenciaService {

    private AgenciaRepository agenciaRepository;

    public AgenciaService(AgenciaRepository agenciaRepository) {
        this.agenciaRepository = agenciaRepository;
    }

    public void salvar(Agencia a) {
        this.agenciaRepository.save(a);
    }

    public Agencia buscarPorId(Long id) {
        Optional<Agencia> op = this.agenciaRepository.findById(id);
        if (op.isPresent()) {
            return op.get();
        } else {
            return null;
        }
    }

    public List<Agencia> buscarTodos() {
        return this.agenciaRepository.findAll();
    }

}
