package index;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {


    @RequestMapping("/")
    public String main() {

        System.out.println("Hello world");

//        log.info("메인페이지 진입");
        System.out.println("메인 페이지 진입");


        return "mysiteBuild.html";
    }

    @RequestMapping("/index")
    public String index() {

//        log.info("메인페이지 진입");
        System.out.println("메인 페이지 진입");


        return "WEB-INF/views/main/index.jsp";
    }



}
