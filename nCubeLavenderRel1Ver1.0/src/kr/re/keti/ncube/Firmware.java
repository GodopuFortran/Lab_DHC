/*
 * ------------------------------------------------------------------------
 * Copyright 2014 Korea Electronics Technology Institute
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ------------------------------------------------------------------------
 */

package kr.re.keti.ncube;

/**
 * Data class for oneM2M node/firmware resource.
 * @author NakMyoung Sung (nmsung@keti.re.kr)
 */
public class Firmware {

	public String resourceType = null;
	public String resourceID = null;
	public String resourceName = null;
	public String parentID = null;
	public String creationTime = null;
	public String lastModifiedTime = null;
	public String expirationTime = null;
	public String mgmtDefinition = null;
	public String labels = null;
	public String description = null;
	public String version = null;
	public String name = null;
	public String url = null;
	public String update = null;
	public String action = null;
	public String status = null;
	
	public String objectIDs = null;
	public String objectPaths = null;
	
	public String fileName = null;
}