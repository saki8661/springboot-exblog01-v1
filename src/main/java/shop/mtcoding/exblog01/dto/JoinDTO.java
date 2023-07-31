package shop.mtcoding.exblog01.dto;

import lombok.Getter;
import lombok.Setter;

/*
 * 회원가입 API
 * 1. URL : http://localhost:8080/join
 * 2. mehode : POST
 * 3. 요청body : username=값(String)&password=값(String)&email=값(String)
 * 4. MIME타입 : x-www-form-urlencoded
 */

@Setter
@Getter
public class JoinDTO {
    private String username;
    private String password;
    private String email;
}
