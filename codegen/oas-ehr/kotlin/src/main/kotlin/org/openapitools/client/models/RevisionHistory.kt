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

import org.openapitools.client.models.RevisionHistoryItem

import com.squareup.moshi.Json

/**
 * A REVISION_HISTORY resource
 *
 * @param items 
 */


data class RevisionHistory (

    @Json(name = "items")
    val items: kotlin.collections.List<RevisionHistoryItem>

)

