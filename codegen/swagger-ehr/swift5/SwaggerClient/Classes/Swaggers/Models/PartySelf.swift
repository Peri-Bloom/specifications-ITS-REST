//
// PartySelf.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PartySelf: Codable {

    public var type: String
    public var externalRef: PartyRef?

    public init(type: String, externalRef: PartyRef? = nil) {
        self.type = type
        self.externalRef = externalRef
    }

    public enum CodingKeys: String, CodingKey { 
        case type = "_type"
        case externalRef = "external_ref"
    }

}
