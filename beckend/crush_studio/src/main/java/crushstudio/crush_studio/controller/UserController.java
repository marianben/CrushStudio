package crushstudio.crush_studio.controller;

import crushstudio.crush_studio.DTO.UserDTO;
import crushstudio.crush_studio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<?> createUser (@Valid@RequestBody UserDTO userDTO){
        userService.createUser(userDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<?> getUserById (@PathVariable Long id) {
        UserDTO userDTO = userService.getUserById(id);
        return new ResponseEntity(userDTO, HttpStatus.OK);
    }


}
