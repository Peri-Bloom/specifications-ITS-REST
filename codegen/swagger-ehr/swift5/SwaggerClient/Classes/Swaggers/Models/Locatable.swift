//
// Locatable.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct Locatable: Codable {

    public var type: String?
    public var name: DvText
    public var archetypeNodeId: String
    public var uid: UidBasedId?
    public var links: [Link]?
    public var archetypeDetails: Archetyped?
    public var feederAudit: FeederAudit?

    public init(type: String? = nil, name: DvText, archetypeNodeId: String, uid: UidBasedId? = nil, links: [Link]? = nil, archetypeDetails: Archetyped? = nil, feederAudit: FeederAudit? = nil) {
        self.type = type
        self.name = name
        self.archetypeNodeId = archetypeNodeId
        self.uid = uid
        self.links = links
        self.archetypeDetails = archetypeDetails
        self.feederAudit = feederAudit
    }

    public enum CodingKeys: String, CodingKey { 
        case type = "_type"
        case name
        case archetypeNodeId = "archetype_node_id"
        case uid
        case links
        case archetypeDetails = "archetype_details"
        case feederAudit = "feeder_audit"
    }

}
