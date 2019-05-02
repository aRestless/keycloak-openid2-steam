package arestless.keycloak.broker.provider;

import org.keycloak.Config;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class SteamIdentityProviderFactory implements SocialIdentityProviderFactory<SteamIdentityProvider> {

    @Override
    public String getName() {
        return "Steam OpenID2";
    }

    @Override
    public SteamIdentityProvider create(KeycloakSession keycloakSession, IdentityProviderModel identityProviderModel) {
        return new SteamIdentityProvider(keycloakSession, new SteamIdentityProviderConfig(identityProviderModel));
    }

    @Override
    public Map<String, String> parseConfig(KeycloakSession keycloakSession, InputStream inputStream) {
        return new HashMap<>();
    }

    @Override
    public SteamIdentityProvider create(KeycloakSession keycloakSession) {
        return null;
    }

    @Override
    public void init(Config.Scope scope) {
    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
    }

    @Override
    public void close() {
    }

    @Override
    public String getId() {
        return "steam";
    }
}
