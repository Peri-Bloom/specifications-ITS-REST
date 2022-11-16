//
// UidBasedId.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct UidBasedId: Codable {

    public var type: String?
    public var value: String

    public init(type: String? = nil, value: String) {
        self.type = type
        self.value = value
    }

    public enum CodingKeys: String, CodingKey { 
        case type = "_type"
        case value
    }

}
