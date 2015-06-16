/*
 * Copyright 2012-2015 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.couchbase.config;

import org.springframework.beans.factory.xml.NamespaceHandler;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * {@link NamespaceHandler} for Couchbase configuration.
 * <p/>
 * This handler acts as a container for one or more bean parsers and registers them. During parsing, the elements
 * get analyzed and the appropriate registered parser is called.
 *
 * @author Michael Nitschinger
 */
public class CouchbaseNamespaceHandler extends NamespaceHandlerSupport {

	/**
	 * Register bean definition parsers in the namespace handler.
	 */
	public final void init() {
		//TODO repositories (CouchbaseRepositoryConfigurationExtension and RepositoryBeanDefinitionParser)
		//TODO bucket
		//TODO cluster
		registerBeanDefinitionParser("jmx", new CouchbaseJmxParser());
		registerBeanDefinitionParser("template", new CouchbaseTemplateParser());
		//TODO translation service
	}

}