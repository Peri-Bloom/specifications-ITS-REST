//
// DataValue.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct DataValue: Codable {

    public var type: String?

    public init(type: String? = nil) {
        self.type = type
    }

    public enum CodingKeys: String, CodingKey { 
        case type = "_type"
    }

}
