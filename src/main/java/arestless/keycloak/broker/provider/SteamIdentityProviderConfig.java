package arestless.keycloak.broker.provider;

import org.keycloak.models.IdentityProviderModel;

public class SteamIdentityProviderConfig extends IdentityProviderModel {

    public SteamIdentityProviderConfig(IdentityProviderModel model) {
        super(model);
    }

    public String getSteamApiKey() {
        return getConfig().get("steamApiKey");
    }

    public void setSteamApiKey(String key) {
        getConfig().put("steamApiKey", key);
    }
}