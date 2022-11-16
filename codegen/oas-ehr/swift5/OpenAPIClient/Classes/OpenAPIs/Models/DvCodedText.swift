//
// DvCodedText.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct DvCodedText: Codable, JSONEncodable, Hashable {

    public var definingCode: CodePhrase

    public init(definingCode: CodePhrase) {
        self.definingCode = definingCode
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case definingCode = "defining_code"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(definingCode, forKey: .definingCode)
    }
}

