package com.soft1851.spring.checkout.entity;

import com.soft1851.spring.checkout.annotation.PhoneNumber;
import com.soft1851.spring.checkout.annotation.Region;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @author xunmi
 * @ClassName Person
 * @Description TODO
 * @Date 2020/4/30
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotNull(message = "Id 不能为空")
    private String id;

//    @Size(max = 30)
    @NotNull(message = "name 不能为空")
    private String name;

    @Min(18)
    private Integer age;

    @PhoneNumber
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @NotNull(message = "email 不能为空")
    @Email(message = "邮箱格式错误")
    private String email;

    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))", message = "sex 值不在可选范围")
    @NotNull(message = "sex 不能为空")
    private String sex;


    @Region
    private String region;
}
