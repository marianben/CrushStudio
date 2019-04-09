package crushstudio.crush_studio.service;

//import crushstudio.crush_studio.DTO.UserDTO;

import crushstudio.crush_studio.DTO.AdminDTO;
import crushstudio.crush_studio.DTO.UserDTO;

public interface AdminService {
//    AdminDTO createAdmin (AdminDTO adminDTO);
    AdminDTO findByEmail (String email);
}
