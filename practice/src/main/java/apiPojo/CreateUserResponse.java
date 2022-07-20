package apiPojo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonPropertyOrder({
        "id",
        "name",
        "email",
        "gender",
        "status"
})

@Data
public class CreateUserResponse {
    private Integer id;
    private String name;
    private String email;
    private String gender;
    private String status;
    private String xyz;


    @Override
    public String toString() {
        return "CreateUserResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
