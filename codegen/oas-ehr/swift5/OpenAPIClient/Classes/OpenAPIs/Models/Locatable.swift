//
// Locatable.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct Locatable: Codable, JSONEncodable, Hashable {

    public var name: DvText
    public var archetypeNodeId: String
    public var uid: UidBasedId?
    public var links: [Link]?
    public var archetypeDetails: Archetyped?
    public var feederAudit: FeederAudit?
    public var type: String?

    public init(name: DvText, archetypeNodeId: String, uid: UidBasedId? = nil, links: [Link]? = nil, archetypeDetails: Archetyped? = nil, feederAudit: FeederAudit? = nil, type: String? = nil) {
        self.name = name
        self.archetypeNodeId = archetypeNodeId
        self.uid = uid
        self.links = links
        self.archetypeDetails = archetypeDetails
        self.feederAudit = feederAudit
        self.type = type
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case name
        case archetypeNodeId = "archetype_node_id"
        case uid
        case links
        case archetypeDetails = "archetype_details"
        case feederAudit = "feeder_audit"
        case type = "_type"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(name, forKey: .name)
        try container.encode(archetypeNodeId, forKey: .archetypeNodeId)
        try container.encodeIfPresent(uid, forKey: .uid)
        try container.encodeIfPresent(links, forKey: .links)
        try container.encodeIfPresent(archetypeDetails, forKey: .archetypeDetails)
        try container.encodeIfPresent(feederAudit, forKey: .feederAudit)
        try container.encodeIfPresent(type, forKey: .type)
    }
}

