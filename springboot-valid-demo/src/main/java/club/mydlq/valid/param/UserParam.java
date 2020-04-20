package club.mydlq.valid.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author DennyFly
 * @since 2020/3/25 18:13
 */
@Data
public class UserParam {

    @NotNull(message = "用户名不能为空")
    private String name;

    @NotNull(message = "用户年龄不能为空")
    private Integer age;

}
