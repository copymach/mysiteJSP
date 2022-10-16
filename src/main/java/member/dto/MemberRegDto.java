package member.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@Data
public class MemberRegDto {

    @NotEmpty(message = "id를 입력해주세요")
    private String id;

    @NotEmpty(message = "암호를 입력해주세요")
    private String password;

    @NotEmpty(message = "이름을 입력해 주세요")
    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = true, length = 5)
    private String gender; // M남자 F여자 N비공개

    private String regdate;

}
