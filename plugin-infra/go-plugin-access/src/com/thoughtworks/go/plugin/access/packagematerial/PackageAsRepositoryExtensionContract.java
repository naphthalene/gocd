/*************************GO-LICENSE-START*********************************
 * Copyright 2014 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.go.plugin.access.packagematerial;

import com.thoughtworks.go.plugin.api.material.packagerepository.PackageRevision;
import com.thoughtworks.go.plugin.api.material.packagerepository.RepositoryConfiguration;
import com.thoughtworks.go.plugin.api.response.Result;
import com.thoughtworks.go.plugin.api.response.validation.ValidationResult;

public interface PackageAsRepositoryExtensionContract {

    RepositoryConfiguration getRepositoryConfiguration(String pluginId);

    ValidationResult isRepositoryConfigurationValid(String pluginId, final RepositoryConfiguration repositoryConfiguration);

    Result checkConnectionToRepository(String pluginId, final RepositoryConfiguration repositoryConfiguration);

    com.thoughtworks.go.plugin.api.material.packagerepository.PackageConfiguration getPackageConfiguration(String pluginId);

    ValidationResult isPackageConfigurationValid(String pluginId, final com.thoughtworks.go.plugin.api.material.packagerepository.PackageConfiguration packageConfiguration, final RepositoryConfiguration repositoryConfiguration);

    Result checkConnectionToPackage(String pluginId, final com.thoughtworks.go.plugin.api.material.packagerepository.PackageConfiguration packageConfiguration, final RepositoryConfiguration repositoryConfiguration);

    PackageRevision getLatestRevision(String pluginId, final com.thoughtworks.go.plugin.api.material.packagerepository.PackageConfiguration packageConfiguration, final RepositoryConfiguration repositoryConfiguration);

    PackageRevision latestModificationSince(String pluginId, final com.thoughtworks.go.plugin.api.material.packagerepository.PackageConfiguration packageConfiguration, final RepositoryConfiguration repositoryConfiguration, final PackageRevision previouslyKnownRevision);
}
