/**
 * Copyright 2020-present, Nike, Inc.
 * All rights reserved.
 * <p>
 * This source code is licensed under the Apache-2.0 license found in
 * the LICENSE file in the root directory of this source tree.
 */
package com.nike.pdm.localstack.core;

import com.avast.gradle.dockercompose.DockerComposePlugin;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for getting information on plugins that are required to be applied in order to use
 * the LocalStack Gradle plugin.
 */
public class RequiredPlugins {

    /**
     * Plugin id of the Avast Docker Compose plugin.
     */
    public static final String AVAST_DOCKER_COMPOSE_PLUGIN_ID = "com.avast.gradle.docker-compose";

    public static Map<String, Class<?>> PLUGIN_IDS = new HashMap<>();

    static {
        PLUGIN_IDS.put(AVAST_DOCKER_COMPOSE_PLUGIN_ID, DockerComposePlugin.class);
    }

    private RequiredPlugins() {
        // Noop
    }
}
