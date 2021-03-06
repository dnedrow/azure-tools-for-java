/*
 * Copyright (c) Microsoft Corporation
 *
 * All rights reserved.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.microsoft.azure.hdinsight.spark.run.configuration

import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.options.SettingsEditor
import com.microsoft.azure.hdinsight.spark.run.action.SparkApplicationType
import com.microsoft.azure.hdinsight.spark.ui.CosmosSparkConfigurable

open class CosmosSparkRunConfiguration (name: String,
                                        open val module: CosmosSparkConfigurationModule,
                                        factory: ConfigurationFactory)
    : LivySparkBatchJobRunConfiguration(module.model, factory, module, name) {
    override fun getSparkApplicationType(): SparkApplicationType {
        return SparkApplicationType.CosmosSpark
    }

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> {
        return LivySparkRunConfigurationSettingsEditor(CosmosSparkConfigurable(module.project))
    }

    override fun getSuggestedNamePrefix(): String = "[Spark on Cosmos]"
}