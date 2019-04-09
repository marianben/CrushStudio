package crushstudio.crush_studio.DTO;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserAllDTO {

    private Long id;
    @NotNull(message = "Field 'Name' can not be null")
    @Size(min=2, max=20, message = "Not valid length 'Name'")
    private String nickName;

}
