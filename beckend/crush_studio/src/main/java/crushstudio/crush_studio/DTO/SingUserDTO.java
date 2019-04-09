package crushstudio.crush_studio.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SingUserDTO {
    @NotNull(message = "Field 'Email' can not be null")
    @Size(min=5, max=30, message = "Not valid length 'email'")
    private String email;
    @NotNull
    @Size
    private String password;
}
