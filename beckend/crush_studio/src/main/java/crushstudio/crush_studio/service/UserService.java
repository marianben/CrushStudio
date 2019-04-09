package crushstudio.crush_studio.service;

import crushstudio.crush_studio.DTO.UserDTO;

import java.time.LocalDate;
import java.util.List;

public interface UserService {

    void createUser (UserDTO userDTO);
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUser();
    UserDTO findByNickName (String nickName);
    UserDTO findByLocalDate (LocalDate localDate);
//    UserDTO updateUserById(Long id, UserDTO userToUpdate);
}
