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
import org.openapitools.client.models.HierObjectId
import org.openapitools.client.models.ObjectRef

import com.squareup.moshi.Json

/**
 * A CONTRIBUTION resource
 *
 * @param uid 
 * @param versions 
 * @param audit 
 */


data class Contribution (

    @Json(name = "uid")
    val uid: HierObjectId,

    @Json(name = "versions")
    val versions: kotlin.collections.List<ObjectRef>,

    @Json(name = "audit")
    val audit: AuditDetails

)

