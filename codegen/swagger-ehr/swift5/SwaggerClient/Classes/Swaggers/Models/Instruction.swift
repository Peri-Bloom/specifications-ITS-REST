//
// Instruction.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct Instruction: Codable {

    public var narrative: DvText
    public var expiryTime: DvDateTime?
    public var wfDefinition: DvParsable?
    public var activities: [Activity]?

    public init(narrative: DvText, expiryTime: DvDateTime? = nil, wfDefinition: DvParsable? = nil, activities: [Activity]? = nil) {
        self.narrative = narrative
        self.expiryTime = expiryTime
        self.wfDefinition = wfDefinition
        self.activities = activities
    }

    public enum CodingKeys: String, CodingKey { 
        case narrative
        case expiryTime = "expiry_time"
        case wfDefinition = "wf_definition"
        case activities
    }

}
