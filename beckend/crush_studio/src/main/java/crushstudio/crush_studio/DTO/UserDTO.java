package crushstudio.crush_studio.DTO;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDTO {

    private Long id;
    @NotNull(message = "Field 'Name' can not be null")
    @Size(min=2, max=20, message = "Not valid length 'Name'")
    private String nickName;
    @NotNull(message = "Field 'Email' can not be null")
    @Size(min=5, max=100, message = "Not valid length 'email'")
    private String email;
    @NotNull
    @Size
    private String password;
    private String phoneNumber;
    private boolean  isDeleted;
}
