package kr.pe.chani.simplemsa.service1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class Service1Controller {
    /** 일반 사용자 API */
    @PostMapping(value = "/access-resource")
    public String services() {
        return "Resources";
    }

    /** 관리자 API */
    @PostMapping(value = "/admin/access-resource")
    public String adminServices() {
        return "Admin Resources";
    }
}
