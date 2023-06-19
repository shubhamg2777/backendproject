package com.jsp.springwebsecond.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springwebsecond.dto.LoginDto;
import com.jsp.springwebsecond.dto.RegisterDto;
import com.jsp.springwebsecond.entity.RegisterEntity;
import com.jsp.springwebsecond.repository.RegisterRepository;

import net.bytebuddy.asm.Advice.Return;

@Service
public class RegisterService {
	@Autowired
	private RegisterRepository registerRepository;

	@Autowired
	private ModelMapper mapper;

	public void processUserDetails(RegisterDto registerDto) {
		// map the two classes directly
		RegisterEntity entity = mapper.map(registerDto, RegisterEntity.class);
		registerRepository.save(entity);
	}

	public boolean processuserLogin(LoginDto logindto) {
		RegisterEntity entity = registerRepository.getLoginByEmail(logindto.getEmail());
		if (entity != null) {
			if (logindto.getPassword().equals(logindto.getPassword())
					&& logindto.getEmail().equalsIgnoreCase(logindto.getEmail())) {
				return true;
			}
			return false;
		}
		return false;
	}

	public List<RegisterEntity> getAllRegisterDetails() {
		return registerRepository.findAll();
	}

	public RegisterEntity findById(int id) {
		return registerRepository.getById(id);
	}
}
