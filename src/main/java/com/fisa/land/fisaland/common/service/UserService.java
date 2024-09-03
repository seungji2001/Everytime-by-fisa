package com.fisa.land.fisaland.common.service;

import com.fisa.land.fisaland.common.dto.request.LoginDTO;
import com.fisa.land.fisaland.common.dto.request.UserDTO;
import com.fisa.land.fisaland.common.dto.response.JWTAuthResponse;
import com.fisa.land.fisaland.common.dto.response.UserResponseDTO;

public interface UserService {
	void register(UserDTO userDto);

	JWTAuthResponse login(LoginDTO loginDTO);

	Long findByEmail(String email);

	UserResponseDTO getUser(Long userId);

	UserResponseDTO updateUser(UserDTO user);

	void deleteUser(Long userId);

}
