/*
 * Copyright (c) 2022 vitasystems GmbH and Hannover Medical School.
 *
 * This file is part of project EHRbase
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ehrbase.webtester.service;

/**
 * @author Renaud Subiger
 * @since 1.0
 */
public class LoaderRequestDto {

    private int ehr = 100;

    private int healthcareFacilities = 5;

    public Integer getEhr() {
        return ehr;
    }

    public void setEhr(Integer ehr) {
        this.ehr = ehr;
    }

    public int getHealthcareFacilities() {
        return healthcareFacilities;
    }

    public void setHealthcareFacilities(int healthcareFacilities) {
        this.healthcareFacilities = healthcareFacilities;
    }
}
