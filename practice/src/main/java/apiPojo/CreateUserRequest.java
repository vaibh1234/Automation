package apiPojo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonPropertyOrder({
        "name",
        "gender",
        "email",
        "status"
})

@Data
public class CreateUserRequest {
    private String name;
    private String gender;

    @Override
    public String toString() {
        return "CreateUserRequest{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    private String email;
    private String status;


}
