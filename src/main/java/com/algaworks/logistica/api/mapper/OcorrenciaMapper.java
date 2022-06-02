package com.algaworks.logistica.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.algaworks.logistica.api.model.OcorrenciaModel;
import com.algaworks.logistica.domain.model.Ocorrencia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class OcorrenciaMapper {
	
	private ModelMapper modelMapper;
	
	public OcorrenciaModel toModel(Ocorrencia ocorrencia) {
		
		return modelMapper.map(ocorrencia, OcorrenciaModel.class);
	}
	
	public List<OcorrenciaModel> toCollectionModel(List<Ocorrencia> ocorrencias) {
		
		return ocorrencias.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
} 
