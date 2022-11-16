//
// LocatableRef.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct LocatableRef: Codable, JSONEncodable, Hashable {

    public var namespace: String
    public var type: String
    public var id: UidBasedId
    public var path: String?

    public init(namespace: String, type: String, id: UidBasedId, path: String? = nil) {
        self.namespace = namespace
        self.type = type
        self.id = id
        self.path = path
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case namespace
        case type
        case id
        case path
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(namespace, forKey: .namespace)
        try container.encode(type, forKey: .type)
        try container.encode(id, forKey: .id)
        try container.encodeIfPresent(path, forKey: .path)
    }
}

