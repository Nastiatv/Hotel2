package com.runa.hotel.api.service;

import java.util.List;

import com.runa.hotel.api.dto.ServiceDto;
import com.runa.hotel.entities.Service;

public interface IServiceService {

	List<ServiceDto> getAllServices();

	Service addService(ServiceDto dto);

	Service getServiceById(Long id);

	void updateService(Long id, ServiceDto dto);

	void deleteServiceById(Long id);


}