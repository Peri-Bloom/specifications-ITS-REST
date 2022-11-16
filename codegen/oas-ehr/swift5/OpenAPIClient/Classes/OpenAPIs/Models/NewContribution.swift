//
// NewContribution.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** A new (un-committed) CONTRIBUTION resource */
public struct NewContribution: Codable, JSONEncodable, Hashable {

    public var uid: HierObjectId?
    public var versions: [UpdateVersion]
    public var audit: UpdateAudit

    public init(uid: HierObjectId? = nil, versions: [UpdateVersion], audit: UpdateAudit) {
        self.uid = uid
        self.versions = versions
        self.audit = audit
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case uid
        case versions
        case audit
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(uid, forKey: .uid)
        try container.encode(versions, forKey: .versions)
        try container.encode(audit, forKey: .audit)
    }
}

