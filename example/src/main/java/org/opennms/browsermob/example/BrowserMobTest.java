package org.opennms.browsermob.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;

public class BrowserMobTest {

    private static final Logger LOG = LoggerFactory.getLogger(BrowserMobTest.class);

    BrowserMobProxy proxy;

    public void init() {
        LOG.info("init");
        proxy = new BrowserMobProxyServer();
        proxy.start(0);
        int port = proxy.getPort();
        LOG.info("initialized on port: {}", port);
    }

    public void destroy() {
        LOG.info("destroy");
        if(proxy != null) {
            proxy.abort();
        }
    }
}
