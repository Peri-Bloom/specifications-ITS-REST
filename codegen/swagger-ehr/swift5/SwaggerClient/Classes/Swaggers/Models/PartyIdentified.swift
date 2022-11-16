//
// PartyIdentified.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PartyIdentified: Codable {

    public var type: String
    public var externalRef: PartyRef?
    public var name: String?
    public var identifiers: [DvIdentifier]?

    public init(type: String, externalRef: PartyRef? = nil, name: String? = nil, identifiers: [DvIdentifier]? = nil) {
        self.type = type
        self.externalRef = externalRef
        self.name = name
        self.identifiers = identifiers
    }

    public enum CodingKeys: String, CodingKey { 
        case type = "_type"
        case externalRef = "external_ref"
        case name
        case identifiers
    }

}
