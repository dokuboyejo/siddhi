/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.siddhi.core.executor.condition.compare.lessthanequal;

import org.wso2.siddhi.core.executor.ExpressionExecutor;
import org.wso2.siddhi.core.executor.condition.compare.CompareConditionExpressionExecutor;

/**
 * Parent Executor class for Less Than or Equal condition. Data type specific sub classes will extend this.
 */
public abstract class LessThanEqualCompareConditionExpressionExecutor extends CompareConditionExpressionExecutor {

    public LessThanEqualCompareConditionExpressionExecutor(ExpressionExecutor leftExpressionExecutor,
                                                           ExpressionExecutor rightExpressionExecutor) {
        super(leftExpressionExecutor, rightExpressionExecutor);
    }
}
