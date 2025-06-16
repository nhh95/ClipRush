package ClipRush.cliprush.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class IndexController {

        // 루트(/) 경로 요청 시 index.html 반환
        @GetMapping({"/", "/index"})
        public String showIndexPage() {
            return "index"; // templates/index.html 을 의미
        }
    }


