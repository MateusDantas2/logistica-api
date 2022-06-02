package com.algaworks.logistica.domain.service;

import org.springframework.stereotype.Service;

import com.algaworks.logistica.domain.exception.EntityNotFoundException;
import com.algaworks.logistica.domain.model.Entrega;
import com.algaworks.logistica.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntityNotFoundException("Entrega não encontrada!"));
	}
}
