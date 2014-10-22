package org.test.windowclient;


import javax.enterprise.inject.Specializes;

import org.apache.deltaspike.jsf.api.config.JsfModuleConfig;
import org.apache.deltaspike.jsf.spi.scope.window.ClientWindowConfig;


@Specializes
public class DSJsfModuleConfig extends JsfModuleConfig {
	private static final long serialVersionUID = 6409395843331874486L;

	@Override
    public ClientWindowConfig.ClientWindowRenderMode getDefaultWindowMode() {
		return ClientWindowConfig.ClientWindowRenderMode.CLIENTWINDOW;
	}
}