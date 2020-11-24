package com.github.kklisura.cdt.services.types;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Chrome version model.
 *
 * @author Kenan Klisura
 */
public class ChromeVersion {
  @JsonProperty("Browser")
  private String browser;

  @JsonProperty("Protocol-Version")
  private String protocolVersion;

  @JsonProperty("User-Agent")
  private String userAgent;

  // TODO move to an android abstraction
  @JsonProperty("Android-Package")
  private String androidPackage;

  @JsonProperty("V8-Version")
  private String v8Version;

  @JsonProperty("WebKit-Version")
  private String webKitVersion;

  @JsonProperty("webSocketDebuggerUrl")
  private String webSocketDebuggerUrl;

  /**
   * Gets browser.
   *
   * @return the browser
   */
  public String getBrowser() {
    return browser;
  }

  /**
   * Gets protocol version.
   *
   * @return the protocol version
   */
  public String getProtocolVersion() {
    return protocolVersion;
  }

  /**
   * Gets user agent.
   *
   * @return the user agent
   */
  public String getUserAgent() {
    return userAgent;
  }

  /**
   * Gets package of connected Android WebView.
   *
   * @return package in a form "com.example.app"
   */
  public String getAndroidPackage() {
    return androidPackage;
  }

  /**
   * Gets v 8 version.
   *
   * @return the v 8 version
   */
  public String getV8Version() {
    return v8Version;
  }

  /**
   * Gets web kit version.
   *
   * @return the web kit version
   */
  public String getWebKitVersion() {
    return webKitVersion;
  }

  /**
   * Gets web socket debugger url.
   *
   * @return the web socket debugger url
   */
  public String getWebSocketDebuggerUrl() {
    // Convert a 'ws:///devtools/page/3' websocket URL to a ws://localhost/devtools/page/3 url.
    if (webSocketDebuggerUrl != null && webSocketDebuggerUrl.startsWith("ws:///")) {
      return "ws://localhost/" + webSocketDebuggerUrl.substring("ws:///".length());
    } else {
      return webSocketDebuggerUrl;
    }
  }
}
