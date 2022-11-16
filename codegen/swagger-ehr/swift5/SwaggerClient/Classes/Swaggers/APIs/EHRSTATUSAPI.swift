//
// EHRSTATUSAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class EHRSTATUSAPI {
    /**
     Get EHR_STATUS at time

     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter versionAtTime: (query) A given time in the extended ISO 8601 format.  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func ehrStatusGetAtTime(ehrId: String, versionAtTime: String? = nil, completion: @escaping ((_ data: EhrStatus?,_ error: Error?) -> Void)) {
        ehrStatusGetAtTimeWithRequestBuilder(ehrId: ehrId, versionAtTime: versionAtTime).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get EHR_STATUS at time
     - GET /ehr/{ehr_id}/ehr_status

     - responseHeaders: [ETag(String), Location(String)]
     - responseHeaders: [ETag(String), Location(String)]
     - examples: [{contentType=application/json, example={
  "archetype_node_id" : "openEHR-EHR-EHR_STATUS.generic.v1",
  "name" : {
    "value" : "EHR status"
  },
  "uid" : {
    "_type" : "OBJECT_VERSION_ID",
    "value" : "8849182c-82ad-4088-a07f-48ead4180515::openEHRSys.example.com::1"
  },
  "subject" : {
    "_type" : "PARTY_SELF"
  },
  "is_queryable" : true,
  "is_modifiable" : true
}}]
     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter versionAtTime: (query) A given time in the extended ISO 8601 format.  (optional)

     - returns: RequestBuilder<EhrStatus> 
     */
    open class func ehrStatusGetAtTimeWithRequestBuilder(ehrId: String, versionAtTime: String? = nil) -> RequestBuilder<EhrStatus> {
        var path = "/ehr/{ehr_id}/ehr_status"
        let ehrIdPreEscape = "\(ehrId)"
        let ehrIdPostEscape = ehrIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{ehr_id}", with: ehrIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "version_at_time": versionAtTime
        ])


        let requestBuilder: RequestBuilder<EhrStatus>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get EHR_STATUS by version id

     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter versionUid: (path) VERSION identifier taken from VERSION.uid.value.  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func ehrStatusGetByVersionId(ehrId: String, versionUid: String, completion: @escaping ((_ data: EhrStatus?,_ error: Error?) -> Void)) {
        ehrStatusGetByVersionIdWithRequestBuilder(ehrId: ehrId, versionUid: versionUid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get EHR_STATUS by version id
     - GET /ehr/{ehr_id}/ehr_status/{version_uid}

     - responseHeaders: [ETag(String), Location(String)]
     - responseHeaders: [ETag(String), Location(String)]
     - examples: [{contentType=application/json, example={
  "archetype_node_id" : "openEHR-EHR-EHR_STATUS.generic.v1",
  "name" : {
    "value" : "EHR status"
  },
  "uid" : {
    "_type" : "OBJECT_VERSION_ID",
    "value" : "8849182c-82ad-4088-a07f-48ead4180515::openEHRSys.example.com::1"
  },
  "subject" : {
    "_type" : "PARTY_SELF"
  },
  "is_queryable" : true,
  "is_modifiable" : true
}}]
     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter versionUid: (path) VERSION identifier taken from VERSION.uid.value.  

     - returns: RequestBuilder<EhrStatus> 
     */
    open class func ehrStatusGetByVersionIdWithRequestBuilder(ehrId: String, versionUid: String) -> RequestBuilder<EhrStatus> {
        var path = "/ehr/{ehr_id}/ehr_status/{version_uid}"
        let ehrIdPreEscape = "\(ehrId)"
        let ehrIdPostEscape = ehrIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{ehr_id}", with: ehrIdPostEscape, options: .literal, range: nil)
        let versionUidPreEscape = "\(versionUid)"
        let versionUidPostEscape = versionUidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{version_uid}", with: versionUidPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<EhrStatus>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     * enum for parameter prefer
     */
    public enum Prefer_ehrStatusUpdate: String { 
        case representation = "return=representation"
        case minimal = "return=minimal"
    }

    /**
     Update EHR_STATUS

     - parameter body: (body) The new EHR_STATUS.
 
     - parameter ifMatch: (header) Header to make the request conditional.  Together with &#x60;ETag&#x60; request tag, it helps to prevent simultaneous updates of a resource from overwriting each other (\&quot;mid-air collisions\&quot;). The format is always an &#x60;version_uid&#x60; identifier enclosed by double quotes. The operation will be performed only if the existing latest &#x60;version_uid&#x60; of the resource (i.e. the &#x60;preceding_version_uid&#x60;) matches this header&#x27;s value.  
     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter prefer: (header) Request header to indicate the preference over response details. The response will contain the entire resource when the &#x60;Prefer&#x60; header has a value of &#x60;return&#x3D;representation&#x60;.  (optional, default to return=minimal)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func ehrStatusUpdate(body: EhrStatus, ifMatch: String, ehrId: String, prefer: Prefer_ehrStatusUpdate? = nil, completion: @escaping ((_ data: EhrStatus?,_ error: Error?) -> Void)) {
        ehrStatusUpdateWithRequestBuilder(body: body, ifMatch: ifMatch, ehrId: ehrId, prefer: prefer).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Update EHR_STATUS
     - PUT /ehr/{ehr_id}/ehr_status

     - responseHeaders: [ETag(String), Location(String)]
     - responseHeaders: [ETag(String), Location(String)]
     - examples: [{contentType=application/json, example={
  "archetype_node_id" : "openEHR-EHR-EHR_STATUS.generic.v1",
  "name" : {
    "value" : "EHR status"
  },
  "uid" : {
    "_type" : "OBJECT_VERSION_ID",
    "value" : "8849182c-82ad-4088-a07f-48ead4180515::openEHRSys.example.com::1"
  },
  "subject" : {
    "_type" : "PARTY_SELF"
  },
  "is_queryable" : true,
  "is_modifiable" : true
}}]
     - parameter body: (body) The new EHR_STATUS.
 
     - parameter ifMatch: (header) Header to make the request conditional.  Together with &#x60;ETag&#x60; request tag, it helps to prevent simultaneous updates of a resource from overwriting each other (\&quot;mid-air collisions\&quot;). The format is always an &#x60;version_uid&#x60; identifier enclosed by double quotes. The operation will be performed only if the existing latest &#x60;version_uid&#x60; of the resource (i.e. the &#x60;preceding_version_uid&#x60;) matches this header&#x27;s value.  
     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter prefer: (header) Request header to indicate the preference over response details. The response will contain the entire resource when the &#x60;Prefer&#x60; header has a value of &#x60;return&#x3D;representation&#x60;.  (optional, default to return=minimal)

     - returns: RequestBuilder<EhrStatus> 
     */
    open class func ehrStatusUpdateWithRequestBuilder(body: EhrStatus, ifMatch: String, ehrId: String, prefer: Prefer_ehrStatusUpdate? = nil) -> RequestBuilder<EhrStatus> {
        var path = "/ehr/{ehr_id}/ehr_status"
        let ehrIdPreEscape = "\(ehrId)"
        let ehrIdPostEscape = ehrIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{ehr_id}", with: ehrIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = JSONEncodingHelper.encodingParameters(forEncodableObject: body)
        let url = URLComponents(string: URLString)
        let nillableHeaders: [String: Any?] = [
                        "If-Match": ifMatch,
                        "Prefer": prefer?.rawValue
        ]
        let headerParameters = APIHelper.rejectNilHeaders(nillableHeaders)

        let requestBuilder: RequestBuilder<EhrStatus>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true, headers: headerParameters)
    }
    /**
     Get versioned EHR_STATUS

     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func versionedEhrStatusGet(ehrId: String, completion: @escaping ((_ data: VersionedEhrStatus?,_ error: Error?) -> Void)) {
        versionedEhrStatusGetWithRequestBuilder(ehrId: ehrId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get versioned EHR_STATUS
     - GET /ehr/{ehr_id}/versioned_ehr_status

     - examples: [{contentType=application/json, example={
  "uid" : {
    "value" : "6cb19121-4307-4648-9da0-d62e4d51f19b"
  },
  "owner_id" : {
    "id" : {
      "_type" : "HIER_OBJECT_ID",
      "value" : "7d44b88c-4199-4bad-97dc-d78268e01398"
    },
    "namespace" : "local",
    "type" : "EHR"
  },
  "time_created" : {
    "value" : "2015-01-20T19:30:22.765+01:00"
  }
}}]
     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  

     - returns: RequestBuilder<VersionedEhrStatus> 
     */
    open class func versionedEhrStatusGetWithRequestBuilder(ehrId: String) -> RequestBuilder<VersionedEhrStatus> {
        var path = "/ehr/{ehr_id}/versioned_ehr_status"
        let ehrIdPreEscape = "\(ehrId)"
        let ehrIdPostEscape = ehrIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{ehr_id}", with: ehrIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<VersionedEhrStatus>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get versioned EHR_STATUS revision history

     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func versionedEhrStatusRevisionHistory(ehrId: String, completion: @escaping ((_ data: RevisionHistory?,_ error: Error?) -> Void)) {
        versionedEhrStatusRevisionHistoryWithRequestBuilder(ehrId: ehrId).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get versioned EHR_STATUS revision history
     - GET /ehr/{ehr_id}/versioned_ehr_status/revision_history

     - examples: [{contentType=application/json, example={
  "items" : [ {
    "version_id" : {
      "value" : "8849182c-82ad-4088-a07f-48ead4180515::openEHRSys.example.com::1"
    },
    "audits" : [ {
      "system_id" : "d60e2348-b083-48ce-93b9-916cef1d3a5a",
      "time_committed" : {
        "value" : "2015-01-20T19:30:22.765+01:00"
      },
      "change_type" : {
        "value" : "creation",
        "defining_code" : {
          "terminology_id" : {
            "value" : "openehr"
          },
          "code_string" : "249"
        }
      },
      "description" : {
        "value" : "An optional description string"
      },
      "committer" : {
        "_type" : "PARTY_IDENTIFIED",
        "name" : "A user name"
      }
    } ]
  }, {
    "version_id" : {
      "value" : "8849182c-82ad-4088-a07f-48ead4180515::openEHRSys.example.com::1"
    },
    "audits" : [ {
      "system_id" : "d60e2348-b083-48ce-93b9-916cef1d3a5a",
      "time_committed" : {
        "value" : "2015-01-20T19:30:22.765+01:00"
      },
      "change_type" : {
        "value" : "creation",
        "defining_code" : {
          "terminology_id" : {
            "value" : "openehr"
          },
          "code_string" : "249"
        }
      },
      "description" : {
        "value" : "An optional description string"
      },
      "committer" : {
        "_type" : "PARTY_IDENTIFIED",
        "name" : "A user name"
      }
    } ]
  } ]
}}]
     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  

     - returns: RequestBuilder<RevisionHistory> 
     */
    open class func versionedEhrStatusRevisionHistoryWithRequestBuilder(ehrId: String) -> RequestBuilder<RevisionHistory> {
        var path = "/ehr/{ehr_id}/versioned_ehr_status/revision_history"
        let ehrIdPreEscape = "\(ehrId)"
        let ehrIdPostEscape = ehrIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{ehr_id}", with: ehrIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<RevisionHistory>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get versioned EHR_STATUS version at time

     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter versionAtTime: (query) A given time in the extended ISO 8601 format.  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func versionedEhrStatusVersionGetAtTime(ehrId: String, versionAtTime: String? = nil, completion: @escaping ((_ data: Version?,_ error: Error?) -> Void)) {
        versionedEhrStatusVersionGetAtTimeWithRequestBuilder(ehrId: ehrId, versionAtTime: versionAtTime).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get versioned EHR_STATUS version at time
     - GET /ehr/{ehr_id}/versioned_ehr_status/version

     - responseHeaders: [ETag(String), Location(String)]
     - responseHeaders: [ETag(String), Location(String)]
     - examples: [{contentType=application/json, example={
  "contribution" : {
    "id" : {
      "_type" : "OBJECT_VERSION_ID",
      "value" : "fb458d9c-1323-42bc-b7f8-787f3660a0b5::openEHRSys.example.com::1"
    },
    "namespace" : "local",
    "type" : "COMPOSITION"
  },
  "data" : "",
  "signature" : "signature",
  "_type" : "_type",
  "commit_audit" : {
    "system_id" : "9624982A-9F42-41A5-9318-AE13D5F5031F",
    "committer" : {
      "_type" : "PARTY_IDENTIFIED",
      "name" : "A user name"
    },
    "time_committed" : {
      "value" : "2017-08-15T10:37:15.422+02:00"
    },
    "change_type" : {
      "value" : "creation",
      "defining_code" : {
        "terminology_id" : {
          "value" : "openehr"
        },
        "code_string" : "249"
      }
    },
    "description" : {
      "value" : "Description text"
    }
  }
}}]
     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter versionAtTime: (query) A given time in the extended ISO 8601 format.  (optional)

     - returns: RequestBuilder<Version> 
     */
    open class func versionedEhrStatusVersionGetAtTimeWithRequestBuilder(ehrId: String, versionAtTime: String? = nil) -> RequestBuilder<Version> {
        var path = "/ehr/{ehr_id}/versioned_ehr_status/version"
        let ehrIdPreEscape = "\(ehrId)"
        let ehrIdPostEscape = ehrIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{ehr_id}", with: ehrIdPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "version_at_time": versionAtTime
        ])


        let requestBuilder: RequestBuilder<Version>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Get versioned EHR_STATUS version by id

     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter versionUid: (path) VERSION identifier taken from VERSION.uid.value.  
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func versionedEhrStatusVersionGetById(ehrId: String, versionUid: String, completion: @escaping ((_ data: Version?,_ error: Error?) -> Void)) {
        versionedEhrStatusVersionGetByIdWithRequestBuilder(ehrId: ehrId, versionUid: versionUid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Get versioned EHR_STATUS version by id
     - GET /ehr/{ehr_id}/versioned_ehr_status/version/{version_uid}

     - examples: [{contentType=application/json, example={
  "contribution" : {
    "id" : {
      "_type" : "OBJECT_VERSION_ID",
      "value" : "fb458d9c-1323-42bc-b7f8-787f3660a0b5::openEHRSys.example.com::1"
    },
    "namespace" : "local",
    "type" : "COMPOSITION"
  },
  "data" : "",
  "signature" : "signature",
  "_type" : "_type",
  "commit_audit" : {
    "system_id" : "9624982A-9F42-41A5-9318-AE13D5F5031F",
    "committer" : {
      "_type" : "PARTY_IDENTIFIED",
      "name" : "A user name"
    },
    "time_committed" : {
      "value" : "2017-08-15T10:37:15.422+02:00"
    },
    "change_type" : {
      "value" : "creation",
      "defining_code" : {
        "terminology_id" : {
          "value" : "openehr"
        },
        "code_string" : "249"
      }
    },
    "description" : {
      "value" : "Description text"
    }
  }
}}]
     - parameter ehrId: (path) EHR identifier taken from EHR.ehr_id.value.  
     - parameter versionUid: (path) VERSION identifier taken from VERSION.uid.value.  

     - returns: RequestBuilder<Version> 
     */
    open class func versionedEhrStatusVersionGetByIdWithRequestBuilder(ehrId: String, versionUid: String) -> RequestBuilder<Version> {
        var path = "/ehr/{ehr_id}/versioned_ehr_status/version/{version_uid}"
        let ehrIdPreEscape = "\(ehrId)"
        let ehrIdPostEscape = ehrIdPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{ehr_id}", with: ehrIdPostEscape, options: .literal, range: nil)
        let versionUidPreEscape = "\(versionUid)"
        let versionUidPostEscape = versionUidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{version_uid}", with: versionUidPostEscape, options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<Version>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}
