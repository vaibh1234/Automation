package apiPojo;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;


@JsonPropertyOrder({
        "id",
        "name",
        "email",
        "gender",
        "status"
})
@Data
public class GetUserResponse {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("status")
    private String status;


}
