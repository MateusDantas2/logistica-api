package com.algaworks.logistica.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.logistica.api.mapper.OcorrenciaMapper;
import com.algaworks.logistica.api.model.OcorrenciaModel;
import com.algaworks.logistica.api.model.input.OcorrenciaInput;
import com.algaworks.logistica.domain.model.Entrega;
import com.algaworks.logistica.domain.model.Ocorrencia;
import com.algaworks.logistica.domain.service.BuscaEntregaService;
import com.algaworks.logistica.domain.service.RegistroOcorrenciaService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas/{entregaId}/ocorrencias")
public class OcorrenciaController {
	
	private BuscaEntregaService buscaEntregaService;
	private RegistroOcorrenciaService registroOcorrenciaService;
	private OcorrenciaMapper ocorrenciaMapper;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public OcorrenciaModel registrar(@PathVariable Long entregaId,
			@Valid @RequestBody OcorrenciaInput ocorrenciaInput) {
		Ocorrencia ocorrenciaRegistrada = registroOcorrenciaService
				.registrar(entregaId, ocorrenciaInput.getDescricao());
		
		return ocorrenciaMapper.toModel(ocorrenciaRegistrada);
	}
	
	@GetMapping
	public List<OcorrenciaModel> listar(@PathVariable Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		return ocorrenciaMapper.toCollectionModel(entrega.getOcorrencias()); 
	}
}
