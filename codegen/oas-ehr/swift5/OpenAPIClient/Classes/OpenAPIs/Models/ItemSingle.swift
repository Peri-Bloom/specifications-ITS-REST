//
// ItemSingle.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct ItemSingle: Codable, JSONEncodable, Hashable {

    public var item: Element

    public init(item: Element) {
        self.item = item
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case item
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(item, forKey: .item)
    }
}

