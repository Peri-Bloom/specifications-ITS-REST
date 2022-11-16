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

import org.openapitools.client.models.CodePhrase
import org.openapitools.client.models.Composition
import org.openapitools.client.models.ContentItem
import org.openapitools.client.models.DvCodedText
import org.openapitools.client.models.EhrStatus
import org.openapitools.client.models.EventContext
import org.openapitools.client.models.PartyProxy
import org.openapitools.client.models.Versionable

import com.squareup.moshi.Json

/**
 * A COMPOSITION resource
 *
 * @param type 
 */


interface Composition : Versionable {

    @Json(name = "language")
    val language: CodePhrase
    @Json(name = "territory")
    val territory: CodePhrase
    @Json(name = "category")
    val category: DvCodedText
    @Json(name = "context")
    val context: EventContext
    @Json(name = "composer")
    val composer: PartyProxy
    @Json(name = "content")
    val content: kotlin.collections.List<ContentItem>
    @Json(name = "_type")
    val type: kotlin.String?
}

