//
// ImportedVersion.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ImportedVersion: Codable {

    public var type: String?
    public var contribution: ObjectRef
    public var signature: String?
    public var commitAudit: AuditDetails
    public var data: Versionable
    public var item: OriginalVersion

    public init(type: String? = nil, contribution: ObjectRef, signature: String? = nil, commitAudit: AuditDetails, data: Versionable, item: OriginalVersion) {
        self.type = type
        self.contribution = contribution
        self.signature = signature
        self.commitAudit = commitAudit
        self.data = data
        self.item = item
    }

    public enum CodingKeys: String, CodingKey { 
        case type = "_type"
        case contribution
        case signature
        case commitAudit = "commit_audit"
        case data
        case item
    }

}
