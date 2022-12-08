/**
 * Created By Sunil Verma
 * Date: 08/12/22
 * Time: 1:33 PM
 * Project Name: practice
 */

package com.practice;

import com.practice.exception.CustomException;
import com.practice.service.MessageService;
import com.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @Autowired
    UserService userService;

    @Autowired
    MessageService messageService;

    @GetMapping("/user")
    public String saveUserMessage() throws CustomException {
         userService.add();
        return "SUCCESS";
    }


    @GetMapping("/message")
    public String saveMessage() throws CustomException {
        messageService.add();
        return "SUCCESS";
    }

}
