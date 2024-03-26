package BST.BST_Spring.dto;

import BST.BST_Spring.entity.User;

@Data
@Builder
public class UserDto {

    private String loginId;
    private String nickname;
    private String nowPassword;
    private String newPassword;
    private String newPasswordCheck;

    public static UserDto of(User user) {
        return UserDto.builder()
                .loginId(user.getLoginId())
                .nickname(user.getNickname())
                .build();
    }
}