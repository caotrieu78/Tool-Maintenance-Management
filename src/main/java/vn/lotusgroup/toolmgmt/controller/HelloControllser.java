package vn.lotusgroup.toolmgmt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllser {

    @GetMapping("/")
    public String getHelloWorld() {
        return "DEMO API PHẦN MỀM QUẢN LÝ BẢO TRÌ SỬA CHỮA, BẢO DƯỠNG VÀ QUẢN LÝ THIẾT BỊ/CÔNG CỤ DỤNG CỤ";
    }
}
