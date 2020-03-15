package zcs.oauthserver.config;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import zcs.oauthserver.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义添加额外token信息
 */
public class CustomJwtAccessTokenConverter extends JwtAccessTokenConverter {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        DefaultOAuth2AccessToken defaultOAuth2AccessToken = new DefaultOAuth2AccessToken(accessToken);
        Map<String, Object> additionalInfo = new HashMap<>();
        User user = (User)authentication.getPrincipal();
        additionalInfo.put("USER",user);
        defaultOAuth2AccessToken.setAdditionalInformation(additionalInfo);
        return super.enhance(defaultOAuth2AccessToken,authentication);
    }
}
