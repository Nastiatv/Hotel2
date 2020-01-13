package com.runa.hotel.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.runa.hotel.api.dao.IServiceDao;
import com.runa.hotel.api.dto.ServiceDto;
import com.runa.hotel.api.service.IServiceService;

@Service
@Transactional
public class ServiceService implements IServiceService {

	@Autowired
	private IServiceDao serviceDao;
	
	@Override
	public List<ServiceDto> getAllServices() {
		return ServiceDto.convertList(serviceDao.getAll());
	}

	@Override
	public com.runa.hotel.entities.Service addService(ServiceDto dto) {
		com.runa.hotel.entities.Service service = new com.runa.hotel.entities.Service();
		service.setName(dto.getName());
		service.setDailyPrice(dto.getDailyPrice());
		service.setStatus(dto.getStatus());
		return serviceDao.create(service);
	}

	@Override
	public com.runa.hotel.entities.Service getServiceById(Long id) {
		return serviceDao.get(id);
	}

	@Override
	public void updateService(Long id, ServiceDto dto) {
		com.runa.hotel.entities.Service service = getServiceById(id);

		if (!StringUtils.isEmpty(dto.getStatus())) {
			service.setStatus(dto.getStatus());
		}
		if (service.getName() != null) {
			service.setName(dto.getName());
		}
		if (service.getDailyPrice() != null) {
			service.setDailyPrice(dto.getDailyPrice());
		}
		serviceDao.update(service);
	}
	
	@Override
	public void deleteServiceById(Long id) {
		serviceDao.delete(getServiceById(id));
	}

	}