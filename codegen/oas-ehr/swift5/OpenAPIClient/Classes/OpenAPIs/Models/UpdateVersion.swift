//
// UpdateVersion.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct UpdateVersion: Codable, JSONEncodable, Hashable {

    public var precedingVersionUid: ObjectVersionId?
    public var signature: String?
    public var lifecycleState: TerminologyCode
    public var attestations: [UpdateAttestation]?
    public var data: Versionable
    public var commitAudit: UpdateAudit

    public init(precedingVersionUid: ObjectVersionId? = nil, signature: String? = nil, lifecycleState: TerminologyCode, attestations: [UpdateAttestation]? = nil, data: Versionable, commitAudit: UpdateAudit) {
        self.precedingVersionUid = precedingVersionUid
        self.signature = signature
        self.lifecycleState = lifecycleState
        self.attestations = attestations
        self.data = data
        self.commitAudit = commitAudit
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case precedingVersionUid = "preceding_version_uid"
        case signature
        case lifecycleState = "lifecycle_state"
        case attestations
        case data
        case commitAudit = "commit_audit"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(precedingVersionUid, forKey: .precedingVersionUid)
        try container.encodeIfPresent(signature, forKey: .signature)
        try container.encode(lifecycleState, forKey: .lifecycleState)
        try container.encodeIfPresent(attestations, forKey: .attestations)
        try container.encode(data, forKey: .data)
        try container.encode(commitAudit, forKey: .commitAudit)
    }
}

