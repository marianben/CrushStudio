package crushstudio.crush_studio.service.impl;

import crushstudio.crush_studio.DTO.AdminDTO;
import crushstudio.crush_studio.config.mapper.Mapper;
import crushstudio.crush_studio.entity.Admin;
import crushstudio.crush_studio.repository.AdminRepository;
import crushstudio.crush_studio.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
    private final Mapper mapper;
    @Override
    public AdminDTO findByEmail(String email) {
        AdminDTO adminDTO = mapper.map(adminRepository.findByEmail(email),AdminDTO.class);
        return adminDTO;
    }

//    @Override
//    public AdminDTO createAdmin(AdminDTO adminDTO) {
//        if(adminDTO==null){
//            return null;
//        }else {
//            Admin admin = adminRepository.findByEmail(String email).get();
//            AdminDTO admin = mapper.map(admin, AdminDTO.class);
//            return adminDTO;
//        }
//    }
}
