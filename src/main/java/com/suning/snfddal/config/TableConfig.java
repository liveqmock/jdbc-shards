/*
 * Copyright 2015 suning.com Holding Ltd.
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
// Created on 2015年3月31日
// $Id$

package com.suning.snfddal.config;

import com.suning.snfddal.dispatch.rule.TableRouter;
import com.suning.snfddal.engine.Constants;
import com.suning.snfddal.util.StringUtils;

public class TableConfig {

    

    private SchemaConfig schemaConfig;
    private String name;
    private String originalCatalog;
    private String originalSchema;
    private String originalTable;
    private String metadataNode;
    private String[] broadcast;
    private int scanLevel = Constants.SCANLEVEL_ANYINDEX;
    private boolean validation;
    private TableRouter tableRouter;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public String getNameWithSchemaName() {
        StringBuilder fullName = new StringBuilder();
        if (!StringUtils.isNullOrEmpty(originalCatalog)) {
            fullName.append(originalCatalog).append(".");
        }
        if (!StringUtils.isNullOrEmpty(originalSchema)) {
            fullName.append(originalSchema).append(".");
        }
        fullName.append(name);
        return fullName.toString();
    
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the schemaConfig
     */
    public SchemaConfig getSchemaConfig() {
        return schemaConfig;
    }

    /**
     * @param schemaConfig the schemaConfig to set
     */
    public void setSchemaConfig(SchemaConfig schemaConfig) {
        this.schemaConfig = schemaConfig;
    }

    /**
     * @return the originalSchema
     */
    public String getOriginalSchema() {
        return originalSchema;
    }

    /**
     * @param originalSchema the originalSchema to set
     */
    public void setOriginalSchema(String originalSchema) {
        this.originalSchema = originalSchema;
    }

    public String getQualifiedTableName() {
        StringBuilder qualifiedName = new StringBuilder();
        if (!StringUtils.isNullOrEmpty(originalCatalog)) {
            qualifiedName.append(originalCatalog).append(".");
        }
        if (!StringUtils.isNullOrEmpty(originalSchema)) {
            qualifiedName.append(originalSchema).append(".");
        }
        qualifiedName.append(originalTable);
        return qualifiedName.toString();
    }
    
    /**
     * @return the metadataNode
     */
    public String getMetadataNode() {
        return metadataNode;
    }

    /**
     * @param metadataNode the metadataNode to set
     */
    public void setMetadataNode(String metadataNode) {
        this.metadataNode = metadataNode;
    }

    /**
     * @return the originalTable
     */
    public String getOriginalTable() {
        return originalTable;
    }

    /**
     * @param originalTable the originalTable to set
     */
    public void setOriginalTable(String originalTable) {
        this.originalTable = originalTable;
    }

    /**
     * @return the originalCatalog
     */
    public String getOriginalCatalog() {
        return originalCatalog;
    }

    /**
     * @param originalCatalog the originalCatalog to set
     */
    public void setOriginalCatalog(String originalCatalog) {
        this.originalCatalog = originalCatalog;
    }

    /**
     * @return the validation
     */
    public boolean isValidation() {
        return validation;
    }

    /**
     * @param validation the validation to set
     */
    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    /**
     * @return the broadcast
     */
    public String[] getBroadcast() {
        return broadcast;
    }

    /**
     * @param broadcast the broadcast to set
     */
    public void setBroadcast(String[] broadcast) {
        this.broadcast = broadcast;
    }
    /**
     * @return the scanLevel
     */
    public int getScanLevel() {
        return scanLevel;
    }

    /**
     * @param scanLevel the scanLevel to set
     */
    public void setScanLevel(int scanLevel) {
        this.scanLevel = scanLevel;
    }

    /**
     * @return the tableRouter
     */
    public TableRouter getTableRouter() {
        return tableRouter;
    }

    /**
     * @param tableRouter the tableRouter to set
     */
    public void setTableRouter(TableRouter tableRouter) {
        this.tableRouter = tableRouter;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode() */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((schemaConfig == null) ? 0 : schemaConfig.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TableConfig other = (TableConfig) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (schemaConfig == null) {
            if (other.schemaConfig != null)
                return false;
        } else if (!schemaConfig.equals(other.schemaConfig))
            return false;
        return true;
    }
    
    
    

}