/*
 * Copyright 1012-2013 the original author or authors.
 *
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
 */
package org.jmxtrans.embedded.config;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="mailto:cleclerc@xebia.fr">Cyrille Le Clerc</a>
 */
public class ConfigurationTemplatesTest {

    @Test
    public void loadAllTemplates() {
        List<String> configurationUrls = Arrays.asList(
                "classpath:org/jmxtrans/embedded/config/jmxtrans-internals.json",
                "classpath:org/jmxtrans/embedded/config/jvm-sun-hotspot.json",
                "classpath:org/jmxtrans/embedded/config/tomcat-6.json"
        );
        new ConfigurationParser().newEmbeddedJmxTrans(configurationUrls);
    }
}