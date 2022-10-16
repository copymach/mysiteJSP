package member.entity;


import lombok.*;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@Builder // public 아닌 package-private생성자 -> 패키지 레벨로 동작
@RequiredArgsConstructor //의존성 생성자 주입
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 만들기
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mbno")
    private Long id;

    private String password;

    @Column(nullable = false, length = 30)
    private String name;

    private String gender;

    private String regdate; // 가입일

    /*
    @OneToMany(mappedBy = "member")
    @Column(nullable = true)
    private List<Board> boards = new ArrayList<>();
*/

} // public class Member
