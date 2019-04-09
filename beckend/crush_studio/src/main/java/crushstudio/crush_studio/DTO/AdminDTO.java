package crushstudio.crush_studio.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@AllArgsConstructor
public class AdminDTO {

    private String name;
    private Long id;
    private String email;
}
