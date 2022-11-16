//
// FeederAudit.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct FeederAudit: Codable, JSONEncodable, Hashable {

    public var originatingSystemItemIds: [DvIdentifier]?
    public var feederSystemItemIds: [DvIdentifier]?
    public var originalContent: DvEncapsulated?
    public var originatingSystemAudit: FeederAuditDetails
    public var feederSystemAudit: FeederAuditDetails?

    public init(originatingSystemItemIds: [DvIdentifier]? = nil, feederSystemItemIds: [DvIdentifier]? = nil, originalContent: DvEncapsulated? = nil, originatingSystemAudit: FeederAuditDetails, feederSystemAudit: FeederAuditDetails? = nil) {
        self.originatingSystemItemIds = originatingSystemItemIds
        self.feederSystemItemIds = feederSystemItemIds
        self.originalContent = originalContent
        self.originatingSystemAudit = originatingSystemAudit
        self.feederSystemAudit = feederSystemAudit
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case originatingSystemItemIds = "originating_system_item_ids"
        case feederSystemItemIds = "feeder_system_item_ids"
        case originalContent = "original_content"
        case originatingSystemAudit = "originating_system_audit"
        case feederSystemAudit = "feeder_system_audit"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(originatingSystemItemIds, forKey: .originatingSystemItemIds)
        try container.encodeIfPresent(feederSystemItemIds, forKey: .feederSystemItemIds)
        try container.encodeIfPresent(originalContent, forKey: .originalContent)
        try container.encode(originatingSystemAudit, forKey: .originatingSystemAudit)
        try container.encodeIfPresent(feederSystemAudit, forKey: .feederSystemAudit)
    }
}

