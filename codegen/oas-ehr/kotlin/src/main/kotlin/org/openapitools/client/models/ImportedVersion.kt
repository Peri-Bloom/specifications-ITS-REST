/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.AuditDetails
import org.openapitools.client.models.ImportedVersion
import org.openapitools.client.models.ObjectRef
import org.openapitools.client.models.OriginalVersion
import org.openapitools.client.models.Version
import org.openapitools.client.models.Versionable

import com.squareup.moshi.Json

/**
 * 
 *
 * @param contribution 
 * @param commitAudit 
 * @param `data` 
 * @param type 
 * @param signature 
 */


interface ImportedVersion : Version {

    @Json(name = "item")
    val item: OriginalVersion
    @Json(name = "_type")
    val type: kotlin.String?
}

