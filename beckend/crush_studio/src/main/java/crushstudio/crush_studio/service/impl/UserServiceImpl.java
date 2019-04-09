package crushstudio.crush_studio.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import crushstudio.crush_studio.DTO.UserDTO;
import crushstudio.crush_studio.config.mapper.Mapper;
import crushstudio.crush_studio.entity.User;
import crushstudio.crush_studio.repository.UserRepository;
import crushstudio.crush_studio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserRepository userRepository;
   @Autowired
   private Mapper mapper;


    @Override
    public void createUser(UserDTO userDTO) {
        if(userDTO.getPassword()!=null){
            User user = mapper.map(userDTO, User.class);
        }else{
            System.out.println("We not can create user");
        }

    }

    @Override
    public UserDTO getUserById(Long id) {
        boolean exists=userRepository.existsById(id);
        if(!exists){
            throw new EntityExistsException("Try again");
        }
        User user = userRepository.findById(id).get();
        UserDTO userDTO = mapper.map(user, UserDTO.class);
        return userDTO;
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<User> users = userRepository.findAll();
        List<UserDTO>userDTOS = mapper.mapAll(users,UserDTO.class);
        return userDTOS;
    }

    @Override
    public UserDTO findByNickName(String nickName) {
        UserDTO userDTO = mapper.map(userRepository.findByNickname(nickName),UserDTO.class);
        return userDTO;
    }

    @Override
    public UserDTO findByLocalDate(LocalDate localDate) {
        UserDTO userDTO = mapper.map(userRepository.findByLocalDate(localDate),UserDTO.class);
        return userDTO;
    }

//    @Override
//    public UserDTO updateUserById(Long id, UserDTO userToUpdate) {
//       boolean exist = userRepository.existsById(id);
//       if (!exist){
//           return null;
//        }
//        User userUpdate = mapper.map(userToUpdate, User.class);
//       userUpdate.isDeleted();
//       userRepository.save(userUpdate);
//        return userUpdate;
//    }
}
