package member;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("member/")
@Controller
@RequiredArgsConstructor
public class MemberController {

    @RequestMapping("Reg/")
    public String memberReg() {

        System.out.printf("member Reg ");

        return "result";
    }


}
